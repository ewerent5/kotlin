package okhttp3.internal.http1;

import ch.qos.logback.core.CoreConstants;
import i.d0.p;
import i.d0.q;
import i.y.d.l;
import j.b0;
import j.d0;
import j.e0;
import j.f;
import j.g;
import j.h;
import j.m;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;

/* compiled from: Http1ExchangeCodec.kt */
/* loaded from: classes3.dex */
public final class Http1ExchangeCodec implements ExchangeCodec {
    public static final Companion Companion = new Companion(null);
    private static final long NO_CHUNK_YET = -1;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    private final OkHttpClient client;
    private final RealConnection connection;
    private final HeadersReader headersReader;
    private final g sink;
    private final h source;
    private int state;
    private Headers trailers;

    /* compiled from: Http1ExchangeCodec.kt */
    private abstract class AbstractSource implements d0 {
        private boolean closed;
        private final m timeout;

        public AbstractSource() {
            this.timeout = new m(Http1ExchangeCodec.this.source.timeout());
        }

        @Override // j.d0, java.io.Closeable, java.lang.AutoCloseable
        public abstract /* synthetic */ void close();

        protected final boolean getClosed() {
            return this.closed;
        }

        protected final m getTimeout() {
            return this.timeout;
        }

        @Override // j.d0
        public long read(f fVar, long j2) throws IOException {
            l.d(fVar, "sink");
            try {
                return Http1ExchangeCodec.this.source.read(fVar, j2);
            } catch (IOException e2) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
                throw e2;
            }
        }

        public final void responseBodyComplete() {
            if (Http1ExchangeCodec.this.state == 6) {
                return;
            }
            if (Http1ExchangeCodec.this.state == 5) {
                Http1ExchangeCodec.this.detachTimeout(this.timeout);
                Http1ExchangeCodec.this.state = 6;
            } else {
                throw new IllegalStateException("state: " + Http1ExchangeCodec.this.state);
            }
        }

        protected final void setClosed(boolean z) {
            this.closed = z;
        }

        @Override // j.d0
        public e0 timeout() {
            return this.timeout;
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    private final class ChunkedSink implements b0 {
        private boolean closed;
        private final m timeout;

        public ChunkedSink() {
            this.timeout = new m(Http1ExchangeCodec.this.sink.timeout());
        }

        @Override // j.b0, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1ExchangeCodec.this.sink.Y("0\r\n\r\n");
            Http1ExchangeCodec.this.detachTimeout(this.timeout);
            Http1ExchangeCodec.this.state = 3;
        }

        @Override // j.b0, java.io.Flushable
        public synchronized void flush() {
            if (this.closed) {
                return;
            }
            Http1ExchangeCodec.this.sink.flush();
        }

        @Override // j.b0
        public e0 timeout() {
            return this.timeout;
        }

        @Override // j.b0
        public void write(f fVar, long j2) {
            l.d(fVar, "source");
            if (!(!this.closed)) {
                throw new IllegalStateException("closed".toString());
            }
            if (j2 == 0) {
                return;
            }
            Http1ExchangeCodec.this.sink.n0(j2);
            Http1ExchangeCodec.this.sink.Y("\r\n");
            Http1ExchangeCodec.this.sink.write(fVar, j2);
            Http1ExchangeCodec.this.sink.Y("\r\n");
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    private final class ChunkedSource extends AbstractSource {
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        final /* synthetic */ Http1ExchangeCodec this$0;
        private final HttpUrl url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            super();
            l.d(httpUrl, "url");
            this.this$0 = http1ExchangeCodec;
            this.url = httpUrl;
            this.bytesRemainingInChunk = Http1ExchangeCodec.NO_CHUNK_YET;
            this.hasMoreChunks = true;
        }

        private final void readChunkSize() throws ProtocolException {
            if (this.bytesRemainingInChunk != Http1ExchangeCodec.NO_CHUNK_YET) {
                this.this$0.source.u0();
            }
            try {
                this.bytesRemainingInChunk = this.this$0.source.P0();
                String strU0 = this.this$0.source.u0();
                if (strU0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                String string = q.B0(strU0).toString();
                if (this.bytesRemainingInChunk >= 0) {
                    if (!(string.length() > 0) || p.B(string, ";", false, 2, null)) {
                        if (this.bytesRemainingInChunk == 0) {
                            this.hasMoreChunks = false;
                            Http1ExchangeCodec http1ExchangeCodec = this.this$0;
                            http1ExchangeCodec.trailers = http1ExchangeCodec.headersReader.readHeaders();
                            OkHttpClient okHttpClient = this.this$0.client;
                            l.b(okHttpClient);
                            CookieJar cookieJar = okHttpClient.cookieJar();
                            HttpUrl httpUrl = this.url;
                            Headers headers = this.this$0.trailers;
                            l.b(headers);
                            HttpHeaders.receiveHeaders(cookieJar, httpUrl, headers);
                            responseBodyComplete();
                            return;
                        }
                        return;
                    }
                }
                throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + string + CoreConstants.DOUBLE_QUOTE_CHAR);
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, j.d0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.this$0.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, j.d0
        public long read(f fVar, long j2) throws IOException {
            l.d(fVar, "sink");
            if (!(j2 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
            }
            if (!(true ^ getClosed())) {
                throw new IllegalStateException("closed".toString());
            }
            if (!this.hasMoreChunks) {
                return Http1ExchangeCodec.NO_CHUNK_YET;
            }
            long j3 = this.bytesRemainingInChunk;
            if (j3 == 0 || j3 == Http1ExchangeCodec.NO_CHUNK_YET) {
                readChunkSize();
                if (!this.hasMoreChunks) {
                    return Http1ExchangeCodec.NO_CHUNK_YET;
                }
            }
            long j4 = super.read(fVar, Math.min(j2, this.bytesRemainingInChunk));
            if (j4 != Http1ExchangeCodec.NO_CHUNK_YET) {
                this.bytesRemainingInChunk -= j4;
                return j4;
            }
            this.this$0.getConnection().noNewExchanges$okhttp();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            responseBodyComplete();
            throw protocolException;
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i.y.d.g gVar) {
            this();
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    private final class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;

        public FixedLengthSource(long j2) {
            super();
            this.bytesRemaining = j2;
            if (j2 == 0) {
                responseBodyComplete();
            }
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, j.d0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, j.d0
        public long read(f fVar, long j2) throws IOException {
            l.d(fVar, "sink");
            if (!(j2 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
            }
            if (!(true ^ getClosed())) {
                throw new IllegalStateException("closed".toString());
            }
            long j3 = this.bytesRemaining;
            if (j3 == 0) {
                return Http1ExchangeCodec.NO_CHUNK_YET;
            }
            long j4 = super.read(fVar, Math.min(j3, j2));
            if (j4 == Http1ExchangeCodec.NO_CHUNK_YET) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                responseBodyComplete();
                throw protocolException;
            }
            long j5 = this.bytesRemaining - j4;
            this.bytesRemaining = j5;
            if (j5 == 0) {
                responseBodyComplete();
            }
            return j4;
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    private final class KnownLengthSink implements b0 {
        private boolean closed;
        private final m timeout;

        public KnownLengthSink() {
            this.timeout = new m(Http1ExchangeCodec.this.sink.timeout());
        }

        @Override // j.b0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1ExchangeCodec.this.detachTimeout(this.timeout);
            Http1ExchangeCodec.this.state = 3;
        }

        @Override // j.b0, java.io.Flushable
        public void flush() {
            if (this.closed) {
                return;
            }
            Http1ExchangeCodec.this.sink.flush();
        }

        @Override // j.b0
        public e0 timeout() {
            return this.timeout;
        }

        @Override // j.b0
        public void write(f fVar, long j2) {
            l.d(fVar, "source");
            if (!(!this.closed)) {
                throw new IllegalStateException("closed".toString());
            }
            Util.checkOffsetAndCount(fVar.y0(), 0L, j2);
            Http1ExchangeCodec.this.sink.write(fVar, j2);
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    private final class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;

        public UnknownLengthSource() {
            super();
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, j.d0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (!this.inputExhausted) {
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, j.d0
        public long read(f fVar, long j2) throws IOException {
            l.d(fVar, "sink");
            if (!(j2 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
            }
            if (!(!getClosed())) {
                throw new IllegalStateException("closed".toString());
            }
            if (this.inputExhausted) {
                return Http1ExchangeCodec.NO_CHUNK_YET;
            }
            long j3 = super.read(fVar, j2);
            if (j3 != Http1ExchangeCodec.NO_CHUNK_YET) {
                return j3;
            }
            this.inputExhausted = true;
            responseBodyComplete();
            return Http1ExchangeCodec.NO_CHUNK_YET;
        }
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, h hVar, g gVar) {
        l.d(realConnection, "connection");
        l.d(hVar, "source");
        l.d(gVar, "sink");
        this.client = okHttpClient;
        this.connection = realConnection;
        this.source = hVar;
        this.sink = gVar;
        this.headersReader = new HeadersReader(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void detachTimeout(m mVar) {
        e0 e0VarA = mVar.a();
        mVar.b(e0.NONE);
        e0VarA.clearDeadline();
        e0VarA.clearTimeout();
    }

    private final boolean isChunked(Response response) {
        return p.o("chunked", Response.header$default(response, "Transfer-Encoding", null, 2, null), true);
    }

    private final b0 newChunkedSink() {
        if (this.state == 1) {
            this.state = 2;
            return new ChunkedSink();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final d0 newChunkedSource(HttpUrl httpUrl) {
        if (this.state == 4) {
            this.state = 5;
            return new ChunkedSource(this, httpUrl);
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final d0 newFixedLengthSource(long j2) {
        if (this.state == 4) {
            this.state = 5;
            return new FixedLengthSource(j2);
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final b0 newKnownLengthSink() {
        if (this.state == 1) {
            this.state = 2;
            return new KnownLengthSink();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final d0 newUnknownLengthSource() {
        if (this.state == 4) {
            this.state = 5;
            getConnection().noNewExchanges$okhttp();
            return new UnknownLengthSource();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        getConnection().cancel();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public b0 createRequestBody(Request request, long j2) throws ProtocolException {
        l.d(request, "request");
        if (request.body() != null && request.body().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (isChunked(request)) {
            return newChunkedSink();
        }
        if (j2 != NO_CHUNK_YET) {
            return newKnownLengthSink();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public RealConnection getConnection() {
        return this.connection;
    }

    public final boolean isClosed() {
        return this.state == 6;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public d0 openResponseBodySource(Response response) {
        l.d(response, "response");
        if (!HttpHeaders.promisesBody(response)) {
            return newFixedLengthSource(0L);
        }
        if (isChunked(response)) {
            return newChunkedSource(response.request().url());
        }
        long jHeadersContentLength = Util.headersContentLength(response);
        return jHeadersContentLength != NO_CHUNK_YET ? newFixedLengthSource(jHeadersContentLength) : newUnknownLengthSource();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Response.Builder readResponseHeaders(boolean z) {
        int i2 = this.state;
        boolean z2 = true;
        if (i2 != 1 && i2 != 3) {
            z2 = false;
        }
        if (!z2) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        try {
            StatusLine statusLine = StatusLine.Companion.parse(this.headersReader.readLine());
            Response.Builder builderHeaders = new Response.Builder().protocol(statusLine.protocol).code(statusLine.code).message(statusLine.message).headers(this.headersReader.readHeaders());
            if (z && statusLine.code == 100) {
                return null;
            }
            if (statusLine.code == 100) {
                this.state = 3;
                return builderHeaders;
            }
            this.state = 4;
            return builderHeaders;
        } catch (EOFException e2) {
            throw new IOException("unexpected end of stream on " + getConnection().route().address().url().redact(), e2);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(Response response) {
        l.d(response, "response");
        if (HttpHeaders.promisesBody(response)) {
            return isChunked(response) ? NO_CHUNK_YET : Util.headersContentLength(response);
        }
        return 0L;
    }

    public final void skipConnectBody(Response response) {
        l.d(response, "response");
        long jHeadersContentLength = Util.headersContentLength(response);
        if (jHeadersContentLength == NO_CHUNK_YET) {
            return;
        }
        d0 d0VarNewFixedLengthSource = newFixedLengthSource(jHeadersContentLength);
        Util.skipAll(d0VarNewFixedLengthSource, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        d0VarNewFixedLengthSource.close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Headers trailers() {
        if (!(this.state == 6)) {
            throw new IllegalStateException("too early; can't read the trailers yet".toString());
        }
        Headers headers = this.trailers;
        return headers != null ? headers : Util.EMPTY_HEADERS;
    }

    public final void writeRequest(Headers headers, String str) {
        l.d(headers, "headers");
        l.d(str, "requestLine");
        if (!(this.state == 0)) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        this.sink.Y(str).Y("\r\n");
        int size = headers.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.sink.Y(headers.name(i2)).Y(": ").Y(headers.value(i2)).Y("\r\n");
        }
        this.sink.Y("\r\n");
        this.state = 1;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(Request request) {
        l.d(request, "request");
        RequestLine requestLine = RequestLine.INSTANCE;
        Proxy.Type type = getConnection().route().proxy().type();
        l.c(type, "connection.route().proxy.type()");
        writeRequest(request.headers(), requestLine.get(request, type));
    }

    private final boolean isChunked(Request request) {
        return p.o("chunked", request.header("Transfer-Encoding"), true);
    }
}