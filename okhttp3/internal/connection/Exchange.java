package okhttp3.internal.connection;

import i.y.d.l;
import j.b0;
import j.d0;
import j.f;
import j.k;
import j.q;
import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.ws.RealWebSocket;

/* compiled from: Exchange.kt */
/* loaded from: classes3.dex */
public final class Exchange {
    private final RealCall call;
    private final ExchangeCodec codec;
    private final RealConnection connection;
    private final EventListener eventListener;
    private final ExchangeFinder finder;
    private boolean isDuplex;

    /* compiled from: Exchange.kt */
    private final class RequestBodySink extends k {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        final /* synthetic */ Exchange this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestBodySink(Exchange exchange, b0 b0Var, long j2) {
            super(b0Var);
            l.d(b0Var, "delegate");
            this.this$0 = exchange;
            this.contentLength = j2;
        }

        private final <E extends IOException> E complete(E e2) {
            if (this.completed) {
                return e2;
            }
            this.completed = true;
            return (E) this.this$0.bodyComplete(this.bytesReceived, false, true, e2);
        }

        @Override // j.k, j.b0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            long j2 = this.contentLength;
            if (j2 != -1 && this.bytesReceived != j2) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                complete(null);
            } catch (IOException e2) {
                throw complete(e2);
            }
        }

        @Override // j.k, j.b0, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e2) {
                throw complete(e2);
            }
        }

        @Override // j.k, j.b0
        public void write(f fVar, long j2) throws IOException {
            l.d(fVar, "source");
            if (!(!this.closed)) {
                throw new IllegalStateException("closed".toString());
            }
            long j3 = this.contentLength;
            if (j3 == -1 || this.bytesReceived + j2 <= j3) {
                try {
                    super.write(fVar, j2);
                    this.bytesReceived += j2;
                    return;
                } catch (IOException e2) {
                    throw complete(e2);
                }
            }
            throw new ProtocolException("expected " + this.contentLength + " bytes but received " + (this.bytesReceived + j2));
        }
    }

    /* compiled from: Exchange.kt */
    public final class ResponseBodySource extends j.l {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        private boolean invokeStartEvent;
        final /* synthetic */ Exchange this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseBodySource(Exchange exchange, d0 d0Var, long j2) {
            super(d0Var);
            l.d(d0Var, "delegate");
            this.this$0 = exchange;
            this.contentLength = j2;
            this.invokeStartEvent = true;
            if (j2 == 0) {
                complete(null);
            }
        }

        @Override // j.l, j.d0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            try {
                super.close();
                complete(null);
            } catch (IOException e2) {
                throw complete(e2);
            }
        }

        public final <E extends IOException> E complete(E e2) {
            if (this.completed) {
                return e2;
            }
            this.completed = true;
            if (e2 == null && this.invokeStartEvent) {
                this.invokeStartEvent = false;
                this.this$0.getEventListener$okhttp().responseBodyStart(this.this$0.getCall$okhttp());
            }
            return (E) this.this$0.bodyComplete(this.bytesReceived, true, false, e2);
        }

        @Override // j.l, j.d0
        public long read(f fVar, long j2) throws IOException {
            l.d(fVar, "sink");
            if (!(!this.closed)) {
                throw new IllegalStateException("closed".toString());
            }
            try {
                long j3 = delegate().read(fVar, j2);
                if (this.invokeStartEvent) {
                    this.invokeStartEvent = false;
                    this.this$0.getEventListener$okhttp().responseBodyStart(this.this$0.getCall$okhttp());
                }
                if (j3 == -1) {
                    complete(null);
                    return -1L;
                }
                long j4 = this.bytesReceived + j3;
                long j5 = this.contentLength;
                if (j5 != -1 && j4 > j5) {
                    throw new ProtocolException("expected " + this.contentLength + " bytes but received " + j4);
                }
                this.bytesReceived = j4;
                if (j4 == j5) {
                    complete(null);
                }
                return j3;
            } catch (IOException e2) {
                throw complete(e2);
            }
        }
    }

    public Exchange(RealCall realCall, EventListener eventListener, ExchangeFinder exchangeFinder, ExchangeCodec exchangeCodec) {
        l.d(realCall, "call");
        l.d(eventListener, "eventListener");
        l.d(exchangeFinder, "finder");
        l.d(exchangeCodec, "codec");
        this.call = realCall;
        this.eventListener = eventListener;
        this.finder = exchangeFinder;
        this.codec = exchangeCodec;
        this.connection = exchangeCodec.getConnection();
    }

    private final void trackFailure(IOException iOException) {
        this.finder.trackFailure(iOException);
        this.codec.getConnection().trackFailure$okhttp(this.call, iOException);
    }

    public final <E extends IOException> E bodyComplete(long j2, boolean z, boolean z2, E e2) {
        if (e2 != null) {
            trackFailure(e2);
        }
        if (z2) {
            if (e2 != null) {
                this.eventListener.requestFailed(this.call, e2);
            } else {
                this.eventListener.requestBodyEnd(this.call, j2);
            }
        }
        if (z) {
            if (e2 != null) {
                this.eventListener.responseFailed(this.call, e2);
            } else {
                this.eventListener.responseBodyEnd(this.call, j2);
            }
        }
        return (E) this.call.messageDone$okhttp(this, z2, z, e2);
    }

    public final void cancel() {
        this.codec.cancel();
    }

    public final b0 createRequestBody(Request request, boolean z) {
        l.d(request, "request");
        this.isDuplex = z;
        RequestBody requestBodyBody = request.body();
        l.b(requestBodyBody);
        long jContentLength = requestBodyBody.contentLength();
        this.eventListener.requestBodyStart(this.call);
        return new RequestBodySink(this, this.codec.createRequestBody(request, jContentLength), jContentLength);
    }

    public final void detachWithViolence() {
        this.codec.cancel();
        this.call.messageDone$okhttp(this, true, true, null);
    }

    public final void finishRequest() throws IOException {
        try {
            this.codec.finishRequest();
        } catch (IOException e2) {
            this.eventListener.requestFailed(this.call, e2);
            trackFailure(e2);
            throw e2;
        }
    }

    public final void flushRequest() throws IOException {
        try {
            this.codec.flushRequest();
        } catch (IOException e2) {
            this.eventListener.requestFailed(this.call, e2);
            trackFailure(e2);
            throw e2;
        }
    }

    public final RealCall getCall$okhttp() {
        return this.call;
    }

    public final RealConnection getConnection$okhttp() {
        return this.connection;
    }

    public final EventListener getEventListener$okhttp() {
        return this.eventListener;
    }

    public final ExchangeFinder getFinder$okhttp() {
        return this.finder;
    }

    public final boolean isCoalescedConnection$okhttp() {
        return !l.a(this.finder.getAddress$okhttp().url().host(), this.connection.route().address().url().host());
    }

    public final boolean isDuplex$okhttp() {
        return this.isDuplex;
    }

    public final RealWebSocket.Streams newWebSocketStreams() {
        this.call.timeoutEarlyExit();
        return this.codec.getConnection().newWebSocketStreams$okhttp(this);
    }

    public final void noNewExchangesOnConnection() {
        this.codec.getConnection().noNewExchanges$okhttp();
    }

    public final void noRequestBody() {
        this.call.messageDone$okhttp(this, true, false, null);
    }

    public final ResponseBody openResponseBody(Response response) throws IOException {
        l.d(response, "response");
        try {
            String strHeader$default = Response.header$default(response, "Content-Type", null, 2, null);
            long jReportedContentLength = this.codec.reportedContentLength(response);
            return new RealResponseBody(strHeader$default, jReportedContentLength, q.d(new ResponseBodySource(this, this.codec.openResponseBodySource(response), jReportedContentLength)));
        } catch (IOException e2) {
            this.eventListener.responseFailed(this.call, e2);
            trackFailure(e2);
            throw e2;
        }
    }

    public final Response.Builder readResponseHeaders(boolean z) throws IOException {
        try {
            Response.Builder responseHeaders = this.codec.readResponseHeaders(z);
            if (responseHeaders != null) {
                responseHeaders.initExchange$okhttp(this);
            }
            return responseHeaders;
        } catch (IOException e2) {
            this.eventListener.responseFailed(this.call, e2);
            trackFailure(e2);
            throw e2;
        }
    }

    public final void responseHeadersEnd(Response response) {
        l.d(response, "response");
        this.eventListener.responseHeadersEnd(this.call, response);
    }

    public final void responseHeadersStart() {
        this.eventListener.responseHeadersStart(this.call);
    }

    public final Headers trailers() {
        return this.codec.trailers();
    }

    public final void webSocketUpgradeFailed() {
        bodyComplete(-1L, true, true, null);
    }

    public final void writeRequestHeaders(Request request) throws IOException {
        l.d(request, "request");
        try {
            this.eventListener.requestHeadersStart(this.call);
            this.codec.writeRequestHeaders(request);
            this.eventListener.requestHeadersEnd(this.call, request);
        } catch (IOException e2) {
            this.eventListener.requestFailed(this.call, e2);
            trackFailure(e2);
            throw e2;
        }
    }
}