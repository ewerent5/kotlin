package okhttp3;

import ch.qos.logback.core.CoreConstants;
import i.d0.p;
import i.s;
import i.t.g0;
import i.y.d.g;
import i.y.d.x;
import j$.util.Iterator;
import j$.util.function.Consumer;
import j.b0;
import j.d0;
import j.f;
import j.h;
import j.i;
import j.k;
import j.l;
import j.q;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import org.slf4j.Marker;

/* compiled from: Cache.kt */
/* loaded from: classes3.dex */
public final class Cache implements Closeable, Flushable {
    public static final Companion Companion = new Companion(null);
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;
    private final DiskLruCache cache;
    private int hitCount;
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    /* compiled from: Cache.kt */
    private static final class CacheResponseBody extends ResponseBody {
        private final h bodySource;
        private final String contentLength;
        private final String contentType;
        private final DiskLruCache.Snapshot snapshot;

        /* compiled from: Cache.kt */
        /* renamed from: okhttp3.Cache$CacheResponseBody$1 */
        public static final class AnonymousClass1 extends l {
            final /* synthetic */ d0 $source;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(d0 d0Var, d0 d0Var2) {
                super(d0Var2);
                d0Var = d0Var;
            }

            @Override // j.l, j.d0, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                CacheResponseBody.this.getSnapshot().close();
                super.close();
            }
        }

        public CacheResponseBody(DiskLruCache.Snapshot snapshot, String str, String str2) {
            i.y.d.l.d(snapshot, "snapshot");
            this.snapshot = snapshot;
            this.contentType = str;
            this.contentLength = str2;
            d0 source = snapshot.getSource(1);
            this.bodySource = q.d(new l(source) { // from class: okhttp3.Cache.CacheResponseBody.1
                final /* synthetic */ d0 $source;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(d0 source2, d0 source22) {
                    super(source22);
                    d0Var = source22;
                }

                @Override // j.l, j.d0, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    CacheResponseBody.this.getSnapshot().close();
                    super.close();
                }
            });
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            String str = this.contentLength;
            if (str != null) {
                return Util.toLongOrDefault(str, -1L);
            }
            return -1L;
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            String str = this.contentType;
            if (str != null) {
                return MediaType.Companion.parse(str);
            }
            return null;
        }

        public final DiskLruCache.Snapshot getSnapshot() {
            return this.snapshot;
        }

        @Override // okhttp3.ResponseBody
        public h source() {
            return this.bodySource;
        }
    }

    /* compiled from: Cache.kt */
    public static final class Companion {
        private Companion() {
        }

        private final Set<String> varyFields(Headers headers) {
            int size = headers.size();
            TreeSet treeSet = null;
            for (int i2 = 0; i2 < size; i2++) {
                if (p.o("Vary", headers.name(i2), true)) {
                    String strValue = headers.value(i2);
                    if (treeSet == null) {
                        treeSet = new TreeSet(p.p(x.a));
                    }
                    for (String str : i.d0.q.m0(strValue, new char[]{CoreConstants.COMMA_CHAR}, false, 0, 6, null)) {
                        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                        treeSet.add(i.d0.q.B0(str).toString());
                    }
                }
            }
            return treeSet != null ? treeSet : g0.b();
        }

        public final boolean hasVaryAll(Response response) {
            i.y.d.l.d(response, "$this$hasVaryAll");
            return varyFields(response.headers()).contains(Marker.ANY_MARKER);
        }

        public final String key(HttpUrl httpUrl) {
            i.y.d.l.d(httpUrl, "url");
            return i.f16464f.d(httpUrl.toString()).n().k();
        }

        public final int readInt$okhttp(h hVar) throws IOException {
            i.y.d.l.d(hVar, "source");
            try {
                long jP = hVar.P();
                String strU0 = hVar.u0();
                if (jP >= 0 && jP <= Integer.MAX_VALUE) {
                    if (!(strU0.length() > 0)) {
                        return (int) jP;
                    }
                }
                throw new IOException("expected an int but was \"" + jP + strU0 + CoreConstants.DOUBLE_QUOTE_CHAR);
            } catch (NumberFormatException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        public final Headers varyHeaders(Response response) {
            i.y.d.l.d(response, "$this$varyHeaders");
            Response responseNetworkResponse = response.networkResponse();
            i.y.d.l.b(responseNetworkResponse);
            return varyHeaders(responseNetworkResponse.request().headers(), response.headers());
        }

        public final boolean varyMatches(Response response, Headers headers, Request request) {
            i.y.d.l.d(response, "cachedResponse");
            i.y.d.l.d(headers, "cachedRequest");
            i.y.d.l.d(request, "newRequest");
            Set<String> setVaryFields = varyFields(response.headers());
            if ((setVaryFields instanceof Collection) && setVaryFields.isEmpty()) {
                return true;
            }
            for (String str : setVaryFields) {
                if (!i.y.d.l.a(headers.values(str), request.headers(str))) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private final Headers varyHeaders(Headers headers, Headers headers2) {
            Set<String> setVaryFields = varyFields(headers2);
            if (setVaryFields.isEmpty()) {
                return Util.EMPTY_HEADERS;
            }
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i2 = 0; i2 < size; i2++) {
                String strName = headers.name(i2);
                if (setVaryFields.contains(strName)) {
                    builder.add(strName, headers.value(i2));
                }
            }
            return builder.build();
        }
    }

    /* compiled from: Cache.kt */
    private final class RealCacheRequest implements CacheRequest {
        private final b0 body;
        private final b0 cacheOut;
        private boolean done;
        private final DiskLruCache.Editor editor;
        final /* synthetic */ Cache this$0;

        /* compiled from: Cache.kt */
        /* renamed from: okhttp3.Cache$RealCacheRequest$1 */
        public static final class AnonymousClass1 extends k {
            AnonymousClass1(b0 b0Var) {
                super(b0Var);
            }

            @Override // j.k, j.b0, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                synchronized (RealCacheRequest.this.this$0) {
                    if (RealCacheRequest.this.getDone()) {
                        return;
                    }
                    RealCacheRequest.this.setDone(true);
                    Cache cache = RealCacheRequest.this.this$0;
                    cache.setWriteSuccessCount$okhttp(cache.getWriteSuccessCount$okhttp() + 1);
                    super.close();
                    RealCacheRequest.this.editor.commit();
                }
            }
        }

        public RealCacheRequest(Cache cache, DiskLruCache.Editor editor) {
            i.y.d.l.d(editor, "editor");
            this.this$0 = cache;
            this.editor = editor;
            b0 b0VarNewSink = editor.newSink(1);
            this.cacheOut = b0VarNewSink;
            this.body = new k(b0VarNewSink) { // from class: okhttp3.Cache.RealCacheRequest.1
                AnonymousClass1(b0 b0VarNewSink2) {
                    super(b0VarNewSink2);
                }

                @Override // j.k, j.b0, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    synchronized (RealCacheRequest.this.this$0) {
                        if (RealCacheRequest.this.getDone()) {
                            return;
                        }
                        RealCacheRequest.this.setDone(true);
                        Cache cache2 = RealCacheRequest.this.this$0;
                        cache2.setWriteSuccessCount$okhttp(cache2.getWriteSuccessCount$okhttp() + 1);
                        super.close();
                        RealCacheRequest.this.editor.commit();
                    }
                }
            };
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public void abort() throws IOException {
            synchronized (this.this$0) {
                if (this.done) {
                    return;
                }
                this.done = true;
                Cache cache = this.this$0;
                cache.setWriteAbortCount$okhttp(cache.getWriteAbortCount$okhttp() + 1);
                Util.closeQuietly(this.cacheOut);
                try {
                    this.editor.abort();
                } catch (IOException unused) {
                }
            }
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public b0 body() {
            return this.body;
        }

        public final boolean getDone() {
            return this.done;
        }

        public final void setDone(boolean z) {
            this.done = z;
        }
    }

    /* compiled from: Cache.kt */
    /* renamed from: okhttp3.Cache$urls$1 */
    public static final class AnonymousClass1 implements Iterator<String>, j$.util.Iterator, j$.util.Iterator {
        private boolean canRemove;
        private final Iterator<DiskLruCache.Snapshot> delegate;
        private String nextUrl;

        AnonymousClass1() {
            this.delegate = Cache.this.getCache$okhttp().snapshots();
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            if (this.nextUrl != null) {
                return true;
            }
            this.canRemove = false;
            while (this.delegate.hasNext()) {
                try {
                    DiskLruCache.Snapshot next = this.delegate.next();
                    try {
                        continue;
                        this.nextUrl = q.d(next.getSource(0)).u0();
                        i.x.a.a(next, null);
                        return true;
                    } finally {
                        try {
                            continue;
                        } catch (Throwable th) {
                        }
                    }
                } catch (IOException unused) {
                }
            }
            return false;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            if (!this.canRemove) {
                throw new IllegalStateException("remove() before next()".toString());
            }
            this.delegate.remove();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.nextUrl;
            i.y.d.l.b(str);
            this.nextUrl = null;
            this.canRemove = true;
            return str;
        }
    }

    public Cache(File file, long j2, FileSystem fileSystem) {
        i.y.d.l.d(file, "directory");
        i.y.d.l.d(fileSystem, "fileSystem");
        this.cache = new DiskLruCache(fileSystem, file, VERSION, 2, j2, TaskRunner.INSTANCE);
    }

    private final void abortQuietly(DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.abort();
            } catch (IOException unused) {
            }
        }
    }

    public static final String key(HttpUrl httpUrl) {
        return Companion.key(httpUrl);
    }

    /* renamed from: -deprecated_directory */
    public final File m24deprecated_directory() {
        return this.cache.getDirectory();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.cache.close();
    }

    public final void delete() {
        this.cache.delete();
    }

    public final File directory() {
        return this.cache.getDirectory();
    }

    public final void evictAll() {
        this.cache.evictAll();
    }

    @Override // java.io.Flushable
    public void flush() {
        this.cache.flush();
    }

    public final Response get$okhttp(Request request) throws IOException {
        i.y.d.l.d(request, "request");
        try {
            DiskLruCache.Snapshot snapshot = this.cache.get(Companion.key(request.url()));
            if (snapshot != null) {
                try {
                    Entry entry = new Entry(snapshot.getSource(0));
                    Response response = entry.response(snapshot);
                    if (entry.matches(request, response)) {
                        return response;
                    }
                    ResponseBody responseBodyBody = response.body();
                    if (responseBodyBody != null) {
                        Util.closeQuietly(responseBodyBody);
                    }
                    return null;
                } catch (IOException unused) {
                    Util.closeQuietly(snapshot);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    public final DiskLruCache getCache$okhttp() {
        return this.cache;
    }

    public final int getWriteAbortCount$okhttp() {
        return this.writeAbortCount;
    }

    public final int getWriteSuccessCount$okhttp() {
        return this.writeSuccessCount;
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final void initialize() {
        this.cache.initialize();
    }

    public final boolean isClosed() {
        return this.cache.isClosed();
    }

    public final long maxSize() {
        return this.cache.getMaxSize();
    }

    public final synchronized int networkCount() {
        return this.networkCount;
    }

    public final CacheRequest put$okhttp(Response response) {
        DiskLruCache.Editor editorEdit$default;
        i.y.d.l.d(response, "response");
        String strMethod = response.request().method();
        if (HttpMethod.INSTANCE.invalidatesCache(response.request().method())) {
            try {
                remove$okhttp(response.request());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!i.y.d.l.a(strMethod, "GET")) {
            return null;
        }
        Companion companion = Companion;
        if (companion.hasVaryAll(response)) {
            return null;
        }
        Entry entry = new Entry(response);
        try {
            editorEdit$default = DiskLruCache.edit$default(this.cache, companion.key(response.request().url()), 0L, 2, null);
            if (editorEdit$default == null) {
                return null;
            }
            try {
                entry.writeTo(editorEdit$default);
                return new RealCacheRequest(this, editorEdit$default);
            } catch (IOException unused2) {
                abortQuietly(editorEdit$default);
                return null;
            }
        } catch (IOException unused3) {
            editorEdit$default = null;
        }
    }

    public final void remove$okhttp(Request request) {
        i.y.d.l.d(request, "request");
        this.cache.remove(Companion.key(request.url()));
    }

    public final synchronized int requestCount() {
        return this.requestCount;
    }

    public final void setWriteAbortCount$okhttp(int i2) {
        this.writeAbortCount = i2;
    }

    public final void setWriteSuccessCount$okhttp(int i2) {
        this.writeSuccessCount = i2;
    }

    public final long size() {
        return this.cache.size();
    }

    public final synchronized void trackConditionalCacheHit$okhttp() {
        this.hitCount++;
    }

    public final synchronized void trackResponse$okhttp(CacheStrategy cacheStrategy) {
        i.y.d.l.d(cacheStrategy, "cacheStrategy");
        this.requestCount++;
        if (cacheStrategy.getNetworkRequest() != null) {
            this.networkCount++;
        } else if (cacheStrategy.getCacheResponse() != null) {
            this.hitCount++;
        }
    }

    public final void update$okhttp(Response response, Response response2) {
        i.y.d.l.d(response, "cached");
        i.y.d.l.d(response2, "network");
        Entry entry = new Entry(response2);
        ResponseBody responseBodyBody = response.body();
        Objects.requireNonNull(responseBodyBody, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        DiskLruCache.Editor editorEdit = null;
        try {
            editorEdit = ((CacheResponseBody) responseBodyBody).getSnapshot().edit();
            if (editorEdit != null) {
                entry.writeTo(editorEdit);
                editorEdit.commit();
            }
        } catch (IOException unused) {
            abortQuietly(editorEdit);
        }
    }

    public final java.util.Iterator<String> urls() {
        return new AnonymousClass1();
    }

    public final synchronized int writeAbortCount() {
        return this.writeAbortCount;
    }

    public final synchronized int writeSuccessCount() {
        return this.writeSuccessCount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Cache(File file, long j2) {
        this(file, j2, FileSystem.SYSTEM);
        i.y.d.l.d(file, "directory");
    }

    /* compiled from: Cache.kt */
    private static final class Entry {
        public static final Companion Companion = new Companion(null);
        private static final String RECEIVED_MILLIS;
        private static final String SENT_MILLIS;
        private final int code;
        private final Handshake handshake;
        private final String message;
        private final Protocol protocol;
        private final long receivedResponseMillis;
        private final String requestMethod;
        private final Headers responseHeaders;
        private final long sentRequestMillis;
        private final String url;
        private final Headers varyHeaders;

        /* compiled from: Cache.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }
        }

        static {
            StringBuilder sb = new StringBuilder();
            Platform.Companion companion = Platform.Companion;
            sb.append(companion.get().getPrefix());
            sb.append("-Sent-Millis");
            SENT_MILLIS = sb.toString();
            RECEIVED_MILLIS = companion.get().getPrefix() + "-Received-Millis";
        }

        public Entry(d0 d0Var) {
            i.y.d.l.d(d0Var, "rawSource");
            try {
                h hVarD = q.d(d0Var);
                this.url = hVarD.u0();
                this.requestMethod = hVarD.u0();
                Headers.Builder builder = new Headers.Builder();
                int int$okhttp = Cache.Companion.readInt$okhttp(hVarD);
                for (int i2 = 0; i2 < int$okhttp; i2++) {
                    builder.addLenient$okhttp(hVarD.u0());
                }
                this.varyHeaders = builder.build();
                StatusLine statusLine = StatusLine.Companion.parse(hVarD.u0());
                this.protocol = statusLine.protocol;
                this.code = statusLine.code;
                this.message = statusLine.message;
                Headers.Builder builder2 = new Headers.Builder();
                int int$okhttp2 = Cache.Companion.readInt$okhttp(hVarD);
                for (int i3 = 0; i3 < int$okhttp2; i3++) {
                    builder2.addLenient$okhttp(hVarD.u0());
                }
                String str = SENT_MILLIS;
                String str2 = builder2.get(str);
                String str3 = RECEIVED_MILLIS;
                String str4 = builder2.get(str3);
                builder2.removeAll(str);
                builder2.removeAll(str3);
                this.sentRequestMillis = str2 != null ? Long.parseLong(str2) : 0L;
                this.receivedResponseMillis = str4 != null ? Long.parseLong(str4) : 0L;
                this.responseHeaders = builder2.build();
                if (isHttps()) {
                    String strU0 = hVarD.u0();
                    if (strU0.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strU0 + CoreConstants.DOUBLE_QUOTE_CHAR);
                    }
                    this.handshake = Handshake.Companion.get(!hVarD.H() ? TlsVersion.Companion.forJavaName(hVarD.u0()) : TlsVersion.SSL_3_0, CipherSuite.Companion.forJavaName(hVarD.u0()), readCertificateList(hVarD), readCertificateList(hVarD));
                } else {
                    this.handshake = null;
                }
            } finally {
                d0Var.close();
            }
        }

        private final boolean isHttps() {
            return p.B(this.url, "https://", false, 2, null);
        }

        private final List<Certificate> readCertificateList(h hVar) throws IOException, CertificateException {
            int int$okhttp = Cache.Companion.readInt$okhttp(hVar);
            if (int$okhttp == -1) {
                return i.t.l.f();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(int$okhttp);
                for (int i2 = 0; i2 < int$okhttp; i2++) {
                    String strU0 = hVar.u0();
                    f fVar = new f();
                    i iVarA = i.f16464f.a(strU0);
                    i.y.d.l.b(iVarA);
                    fVar.B0(iVarA);
                    arrayList.add(certificateFactory.generateCertificate(fVar.Q0()));
                }
                return arrayList;
            } catch (CertificateException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        private final void writeCertList(j.g gVar, List<? extends Certificate> list) throws IOException, CertificateEncodingException {
            try {
                gVar.M0(list.size()).I(10);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] encoded = list.get(i2).getEncoded();
                    i.a aVar = i.f16464f;
                    i.y.d.l.c(encoded, "bytes");
                    gVar.Y(i.a.f(aVar, encoded, 0, 0, 3, null).a()).I(10);
                }
            } catch (CertificateEncodingException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        public final boolean matches(Request request, Response response) {
            i.y.d.l.d(request, "request");
            i.y.d.l.d(response, "response");
            return i.y.d.l.a(this.url, request.url().toString()) && i.y.d.l.a(this.requestMethod, request.method()) && Cache.Companion.varyMatches(response, this.varyHeaders, request);
        }

        public final Response response(DiskLruCache.Snapshot snapshot) {
            i.y.d.l.d(snapshot, "snapshot");
            String str = this.responseHeaders.get("Content-Type");
            String str2 = this.responseHeaders.get("Content-Length");
            return new Response.Builder().request(new Request.Builder().url(this.url).method(this.requestMethod, null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(snapshot, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }

        public final void writeTo(DiskLruCache.Editor editor) {
            i.y.d.l.d(editor, "editor");
            j.g gVarC = q.c(editor.newSink(0));
            try {
                gVarC.Y(this.url).I(10);
                gVarC.Y(this.requestMethod).I(10);
                gVarC.M0(this.varyHeaders.size()).I(10);
                int size = this.varyHeaders.size();
                for (int i2 = 0; i2 < size; i2++) {
                    gVarC.Y(this.varyHeaders.name(i2)).Y(": ").Y(this.varyHeaders.value(i2)).I(10);
                }
                gVarC.Y(new StatusLine(this.protocol, this.code, this.message).toString()).I(10);
                gVarC.M0(this.responseHeaders.size() + 2).I(10);
                int size2 = this.responseHeaders.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    gVarC.Y(this.responseHeaders.name(i3)).Y(": ").Y(this.responseHeaders.value(i3)).I(10);
                }
                gVarC.Y(SENT_MILLIS).Y(": ").M0(this.sentRequestMillis).I(10);
                gVarC.Y(RECEIVED_MILLIS).Y(": ").M0(this.receivedResponseMillis).I(10);
                if (isHttps()) {
                    gVarC.I(10);
                    Handshake handshake = this.handshake;
                    i.y.d.l.b(handshake);
                    gVarC.Y(handshake.cipherSuite().javaName()).I(10);
                    writeCertList(gVarC, this.handshake.peerCertificates());
                    writeCertList(gVarC, this.handshake.localCertificates());
                    gVarC.Y(this.handshake.tlsVersion().javaName()).I(10);
                }
                s sVar = s.a;
                i.x.a.a(gVarC, null);
            } finally {
            }
        }

        public Entry(Response response) {
            i.y.d.l.d(response, "response");
            this.url = response.request().url().toString();
            this.varyHeaders = Cache.Companion.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }
    }
}