package okhttp3.internal;

import ch.qos.logback.core.joran.action.Action;
import i.y.d.l;
import javax.net.ssl.SSLSocket;
import okhttp3.Cache;
import okhttp3.ConnectionSpec;
import okhttp3.Cookie;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: internal.kt */
/* loaded from: classes3.dex */
public final class Internal {
    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String str) {
        l.d(builder, "builder");
        l.d(str, "line");
        return builder.addLenient$okhttp(str);
    }

    public static final void applyConnectionSpec(ConnectionSpec connectionSpec, SSLSocket sSLSocket, boolean z) throws CloneNotSupportedException {
        l.d(connectionSpec, "connectionSpec");
        l.d(sSLSocket, "sslSocket");
        connectionSpec.apply$okhttp(sSLSocket, z);
    }

    public static final Response cacheGet(Cache cache, Request request) {
        l.d(cache, "cache");
        l.d(request, "request");
        return cache.get$okhttp(request);
    }

    public static final String cookieToString(Cookie cookie, boolean z) {
        l.d(cookie, "cookie");
        return cookie.toString$okhttp(z);
    }

    public static final Cookie parseCookie(long j2, HttpUrl httpUrl, String str) {
        l.d(httpUrl, "url");
        l.d(str, "setCookie");
        return Cookie.Companion.parse$okhttp(j2, httpUrl, str);
    }

    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String str, String str2) {
        l.d(builder, "builder");
        l.d(str, Action.NAME_ATTRIBUTE);
        l.d(str2, "value");
        return builder.addLenient$okhttp(str, str2);
    }
}