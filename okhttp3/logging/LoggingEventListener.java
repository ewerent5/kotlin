package okhttp3.logging;

import i.y.d.g;
import i.y.d.l;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;

/* compiled from: LoggingEventListener.kt */
/* loaded from: classes3.dex */
public final class LoggingEventListener extends EventListener {
    private final HttpLoggingInterceptor.Logger logger;
    private long startNs;

    /* compiled from: LoggingEventListener.kt */
    public static class Factory implements EventListener.Factory {
        private final HttpLoggingInterceptor.Logger logger;

        public Factory() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public Factory(HttpLoggingInterceptor.Logger logger) {
            l.d(logger, "logger");
            this.logger = logger;
        }

        @Override // okhttp3.EventListener.Factory
        public EventListener create(Call call) {
            l.d(call, "call");
            return new LoggingEventListener(this.logger, null);
        }

        public /* synthetic */ Factory(HttpLoggingInterceptor.Logger logger, int i2, g gVar) {
            this((i2 & 1) != 0 ? HttpLoggingInterceptor.Logger.DEFAULT : logger);
        }
    }

    public /* synthetic */ LoggingEventListener(HttpLoggingInterceptor.Logger logger, g gVar) {
        this(logger);
    }

    private final void logWithTime(String str) {
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.startNs);
        this.logger.log('[' + millis + " ms] " + str);
    }

    @Override // okhttp3.EventListener
    public void cacheConditionalHit(Call call, Response response) {
        l.d(call, "call");
        l.d(response, "cachedResponse");
        logWithTime("cacheConditionalHit: " + response);
    }

    @Override // okhttp3.EventListener
    public void cacheHit(Call call, Response response) {
        l.d(call, "call");
        l.d(response, "response");
        logWithTime("cacheHit: " + response);
    }

    @Override // okhttp3.EventListener
    public void cacheMiss(Call call) {
        l.d(call, "call");
        logWithTime("cacheMiss");
    }

    @Override // okhttp3.EventListener
    public void callEnd(Call call) {
        l.d(call, "call");
        logWithTime("callEnd");
    }

    @Override // okhttp3.EventListener
    public void callFailed(Call call, IOException iOException) {
        l.d(call, "call");
        l.d(iOException, "ioe");
        logWithTime("callFailed: " + iOException);
    }

    @Override // okhttp3.EventListener
    public void callStart(Call call) {
        l.d(call, "call");
        this.startNs = System.nanoTime();
        logWithTime("callStart: " + call.request());
    }

    @Override // okhttp3.EventListener
    public void canceled(Call call) {
        l.d(call, "call");
        logWithTime("canceled");
    }

    @Override // okhttp3.EventListener
    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        l.d(call, "call");
        l.d(inetSocketAddress, "inetSocketAddress");
        l.d(proxy, "proxy");
        logWithTime("connectEnd: " + protocol);
    }

    @Override // okhttp3.EventListener
    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        l.d(call, "call");
        l.d(inetSocketAddress, "inetSocketAddress");
        l.d(proxy, "proxy");
        l.d(iOException, "ioe");
        logWithTime("connectFailed: " + protocol + ' ' + iOException);
    }

    @Override // okhttp3.EventListener
    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        l.d(call, "call");
        l.d(inetSocketAddress, "inetSocketAddress");
        l.d(proxy, "proxy");
        logWithTime("connectStart: " + inetSocketAddress + ' ' + proxy);
    }

    @Override // okhttp3.EventListener
    public void connectionAcquired(Call call, Connection connection) {
        l.d(call, "call");
        l.d(connection, "connection");
        logWithTime("connectionAcquired: " + connection);
    }

    @Override // okhttp3.EventListener
    public void connectionReleased(Call call, Connection connection) {
        l.d(call, "call");
        l.d(connection, "connection");
        logWithTime("connectionReleased");
    }

    @Override // okhttp3.EventListener
    public void dnsEnd(Call call, String str, List<? extends InetAddress> list) {
        l.d(call, "call");
        l.d(str, "domainName");
        l.d(list, "inetAddressList");
        logWithTime("dnsEnd: " + list);
    }

    @Override // okhttp3.EventListener
    public void dnsStart(Call call, String str) {
        l.d(call, "call");
        l.d(str, "domainName");
        logWithTime("dnsStart: " + str);
    }

    @Override // okhttp3.EventListener
    public void proxySelectEnd(Call call, HttpUrl httpUrl, List<? extends Proxy> list) {
        l.d(call, "call");
        l.d(httpUrl, "url");
        l.d(list, "proxies");
        logWithTime("proxySelectEnd: " + list);
    }

    @Override // okhttp3.EventListener
    public void proxySelectStart(Call call, HttpUrl httpUrl) {
        l.d(call, "call");
        l.d(httpUrl, "url");
        logWithTime("proxySelectStart: " + httpUrl);
    }

    @Override // okhttp3.EventListener
    public void requestBodyEnd(Call call, long j2) {
        l.d(call, "call");
        logWithTime("requestBodyEnd: byteCount=" + j2);
    }

    @Override // okhttp3.EventListener
    public void requestBodyStart(Call call) {
        l.d(call, "call");
        logWithTime("requestBodyStart");
    }

    @Override // okhttp3.EventListener
    public void requestFailed(Call call, IOException iOException) {
        l.d(call, "call");
        l.d(iOException, "ioe");
        logWithTime("requestFailed: " + iOException);
    }

    @Override // okhttp3.EventListener
    public void requestHeadersEnd(Call call, Request request) {
        l.d(call, "call");
        l.d(request, "request");
        logWithTime("requestHeadersEnd");
    }

    @Override // okhttp3.EventListener
    public void requestHeadersStart(Call call) {
        l.d(call, "call");
        logWithTime("requestHeadersStart");
    }

    @Override // okhttp3.EventListener
    public void responseBodyEnd(Call call, long j2) {
        l.d(call, "call");
        logWithTime("responseBodyEnd: byteCount=" + j2);
    }

    @Override // okhttp3.EventListener
    public void responseBodyStart(Call call) {
        l.d(call, "call");
        logWithTime("responseBodyStart");
    }

    @Override // okhttp3.EventListener
    public void responseFailed(Call call, IOException iOException) {
        l.d(call, "call");
        l.d(iOException, "ioe");
        logWithTime("responseFailed: " + iOException);
    }

    @Override // okhttp3.EventListener
    public void responseHeadersEnd(Call call, Response response) {
        l.d(call, "call");
        l.d(response, "response");
        logWithTime("responseHeadersEnd: " + response);
    }

    @Override // okhttp3.EventListener
    public void responseHeadersStart(Call call) {
        l.d(call, "call");
        logWithTime("responseHeadersStart");
    }

    @Override // okhttp3.EventListener
    public void satisfactionFailure(Call call, Response response) {
        l.d(call, "call");
        l.d(response, "response");
        logWithTime("satisfactionFailure: " + response);
    }

    @Override // okhttp3.EventListener
    public void secureConnectEnd(Call call, Handshake handshake) {
        l.d(call, "call");
        logWithTime("secureConnectEnd: " + handshake);
    }

    @Override // okhttp3.EventListener
    public void secureConnectStart(Call call) {
        l.d(call, "call");
        logWithTime("secureConnectStart");
    }

    private LoggingEventListener(HttpLoggingInterceptor.Logger logger) {
        this.logger = logger;
    }
}