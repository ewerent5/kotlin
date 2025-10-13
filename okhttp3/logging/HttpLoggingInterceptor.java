package okhttp3.logging;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import i.d0.p;
import i.t.g0;
import i.t.q;
import i.x.a;
import i.y.d.g;
import i.y.d.l;
import i.y.d.x;
import j.f;
import j.h;
import j.n;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.platform.Platform;

/* compiled from: HttpLoggingInterceptor.kt */
/* loaded from: classes3.dex */
public final class HttpLoggingInterceptor implements Interceptor {
    private volatile Set<String> headersToRedact;
    private volatile Level level;
    private final Logger logger;

    /* compiled from: HttpLoggingInterceptor.kt */
    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    /* compiled from: HttpLoggingInterceptor.kt */
    public interface Logger {
        public static final Companion Companion = new Companion(null);
        public static final Logger DEFAULT = new Companion.DefaultLogger();

        /* compiled from: HttpLoggingInterceptor.kt */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = null;

            /* compiled from: HttpLoggingInterceptor.kt */
            private static final class DefaultLogger implements Logger {
                @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
                public void log(String str) {
                    l.d(str, "message");
                    Platform.log$default(Platform.Companion.get(), str, 0, null, 6, null);
                }
            }

            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }
        }

        void log(String str);
    }

    public HttpLoggingInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public HttpLoggingInterceptor(Logger logger) {
        l.d(logger, "logger");
        this.logger = logger;
        this.headersToRedact = g0.b();
        this.level = Level.NONE;
    }

    private final boolean bodyHasUnknownEncoding(Headers headers) {
        String str = headers.get("Content-Encoding");
        return (str == null || p.o(str, "identity", true) || p.o(str, "gzip", true)) ? false : true;
    }

    private final void logHeader(Headers headers, int i2) {
        String strValue = this.headersToRedact.contains(headers.name(i2)) ? "██" : headers.value(i2);
        this.logger.log(headers.name(i2) + ": " + strValue);
    }

    /* renamed from: -deprecated_level, reason: not valid java name */
    public final Level m147deprecated_level() {
        return this.level;
    }

    public final Level getLevel() {
        return this.level;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws Exception {
        String str;
        String string;
        Charset charset;
        Charset charset2;
        l.d(chain, "chain");
        Level level = this.level;
        Request request = chain.request();
        if (level == Level.NONE) {
            return chain.proceed(request);
        }
        boolean z = level == Level.BODY;
        boolean z2 = z || level == Level.HEADERS;
        RequestBody requestBodyBody = request.body();
        Connection connection = chain.connection();
        StringBuilder sb = new StringBuilder();
        sb.append("--> ");
        sb.append(request.method());
        sb.append(' ');
        sb.append(request.url());
        sb.append(connection != null ? " " + connection.protocol() : "");
        String string2 = sb.toString();
        if (!z2 && requestBodyBody != null) {
            string2 = string2 + " (" + requestBodyBody.contentLength() + "-byte body)";
        }
        this.logger.log(string2);
        if (z2) {
            Headers headers = request.headers();
            if (requestBodyBody != null) {
                MediaType mediaTypeContentType = requestBodyBody.contentType();
                if (mediaTypeContentType != null && headers.get("Content-Type") == null) {
                    this.logger.log("Content-Type: " + mediaTypeContentType);
                }
                if (requestBodyBody.contentLength() != -1 && headers.get("Content-Length") == null) {
                    this.logger.log("Content-Length: " + requestBodyBody.contentLength());
                }
            }
            int size = headers.size();
            for (int i2 = 0; i2 < size; i2++) {
                logHeader(headers, i2);
            }
            if (!z || requestBodyBody == null) {
                this.logger.log("--> END " + request.method());
            } else if (bodyHasUnknownEncoding(request.headers())) {
                this.logger.log("--> END " + request.method() + " (encoded body omitted)");
            } else if (requestBodyBody.isDuplex()) {
                this.logger.log("--> END " + request.method() + " (duplex request body omitted)");
            } else if (requestBodyBody.isOneShot()) {
                this.logger.log("--> END " + request.method() + " (one-shot body omitted)");
            } else {
                f fVar = new f();
                requestBodyBody.writeTo(fVar);
                MediaType mediaTypeContentType2 = requestBodyBody.contentType();
                if (mediaTypeContentType2 == null || (charset2 = mediaTypeContentType2.charset(StandardCharsets.UTF_8)) == null) {
                    charset2 = StandardCharsets.UTF_8;
                    l.c(charset2, "UTF_8");
                }
                this.logger.log("");
                if (Utf8Kt.isProbablyUtf8(fVar)) {
                    this.logger.log(fVar.f0(charset2));
                    this.logger.log("--> END " + request.method() + " (" + requestBodyBody.contentLength() + "-byte body)");
                } else {
                    this.logger.log("--> END " + request.method() + " (binary " + requestBodyBody.contentLength() + "-byte body omitted)");
                }
            }
        }
        long jNanoTime = System.nanoTime();
        try {
            Response responseProceed = chain.proceed(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            ResponseBody responseBodyBody = responseProceed.body();
            l.b(responseBodyBody);
            long jContentLength = responseBodyBody.contentLength();
            String str2 = jContentLength != -1 ? jContentLength + "-byte" : "unknown-length";
            Logger logger = this.logger;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("<-- ");
            sb2.append(responseProceed.code());
            if (responseProceed.message().length() == 0) {
                str = "-byte body omitted)";
                string = "";
            } else {
                String strMessage = responseProceed.message();
                StringBuilder sb3 = new StringBuilder();
                str = "-byte body omitted)";
                sb3.append(String.valueOf(' '));
                sb3.append(strMessage);
                string = sb3.toString();
            }
            sb2.append(string);
            sb2.append(' ');
            sb2.append(responseProceed.request().url());
            sb2.append(" (");
            sb2.append(millis);
            sb2.append("ms");
            sb2.append(z2 ? "" : ", " + str2 + " body");
            sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            logger.log(sb2.toString());
            if (z2) {
                Headers headers2 = responseProceed.headers();
                int size2 = headers2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    logHeader(headers2, i3);
                }
                if (!z || !HttpHeaders.promisesBody(responseProceed)) {
                    this.logger.log("<-- END HTTP");
                } else if (bodyHasUnknownEncoding(responseProceed.headers())) {
                    this.logger.log("<-- END HTTP (encoded body omitted)");
                } else {
                    h hVarSource = responseBodyBody.source();
                    hVarSource.p0(Long.MAX_VALUE);
                    f fVarE = hVarSource.e();
                    Long l2 = null;
                    if (p.o("gzip", headers2.get("Content-Encoding"), true)) {
                        Long lValueOf = Long.valueOf(fVarE.y0());
                        n nVar = new n(fVarE.clone());
                        try {
                            fVarE = new f();
                            fVarE.m0(nVar);
                            a.a(nVar, null);
                            l2 = lValueOf;
                        } finally {
                        }
                    }
                    MediaType mediaTypeContentType3 = responseBodyBody.contentType();
                    if (mediaTypeContentType3 == null || (charset = mediaTypeContentType3.charset(StandardCharsets.UTF_8)) == null) {
                        charset = StandardCharsets.UTF_8;
                        l.c(charset, "UTF_8");
                    }
                    if (!Utf8Kt.isProbablyUtf8(fVarE)) {
                        this.logger.log("");
                        this.logger.log("<-- END HTTP (binary " + fVarE.y0() + str);
                        return responseProceed;
                    }
                    if (jContentLength != 0) {
                        this.logger.log("");
                        this.logger.log(fVarE.clone().f0(charset));
                    }
                    if (l2 != null) {
                        this.logger.log("<-- END HTTP (" + fVarE.y0() + "-byte, " + l2 + "-gzipped-byte body)");
                    } else {
                        this.logger.log("<-- END HTTP (" + fVarE.y0() + "-byte body)");
                    }
                }
            }
            return responseProceed;
        } catch (Exception e2) {
            this.logger.log("<-- HTTP FAILED: " + e2);
            throw e2;
        }
    }

    public final void level(Level level) {
        l.d(level, "<set-?>");
        this.level = level;
    }

    public final void redactHeader(String str) {
        l.d(str, Action.NAME_ATTRIBUTE);
        TreeSet treeSet = new TreeSet(p.p(x.a));
        q.q(treeSet, this.headersToRedact);
        treeSet.add(str);
        this.headersToRedact = treeSet;
    }

    public final HttpLoggingInterceptor setLevel(Level level) {
        l.d(level, "level");
        this.level = level;
        return this;
    }

    public /* synthetic */ HttpLoggingInterceptor(Logger logger, int i2, g gVar) {
        this((i2 & 1) != 0 ? Logger.DEFAULT : logger);
    }
}