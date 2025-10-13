package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import ch.qos.logback.core.CoreConstants;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zv1 {
    private static final zv1 a = new zv1();

    private zv1() {
    }

    public static zv1 a() {
        return a;
    }

    public final void b(WebView webView, JSONObject jSONObject) {
        g(webView, "init", jSONObject);
    }

    public final void c(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        g(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    public final void d(WebView webView) {
        g(webView, "finishSession", new Object[0]);
    }

    public final void e(WebView webView, String str) {
        g(webView, "setNativeViewHierarchy", str);
    }

    public final void f(WebView webView, float f2) {
        g(webView, "setDeviceVolume", Float.valueOf(f2));
    }

    final void g(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            String strConcat = str.length() != 0 ? "The WebView is null for ".concat(str) : new String("The WebView is null for ");
            if (!av1.a.booleanValue() || TextUtils.isEmpty(strConcat)) {
                return;
            }
            Log.i("OMIDLIB", strConcat);
            return;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        if (objArr.length > 0) {
            for (Object obj : objArr) {
                if (obj == null) {
                    sb.append("\"\"");
                } else if (obj instanceof String) {
                    String string = obj.toString();
                    if (string.startsWith("{")) {
                        sb.append(string);
                    } else {
                        sb.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                        sb.append(string);
                        sb.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                    }
                } else {
                    sb.append(obj);
                }
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
        }
        sb.append(")}");
        String string2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            webView.loadUrl(string2);
        } else {
            handler.post(new yv1(this, webView, string2));
        }
    }
}