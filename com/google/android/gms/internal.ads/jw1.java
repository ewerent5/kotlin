package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class jw1 extends gw1 {

    /* renamed from: d, reason: collision with root package name */
    private WebView f6870d;

    /* renamed from: e, reason: collision with root package name */
    private Long f6871e = null;

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, nv1> f6872f;

    public jw1(Map<String, nv1> map, String str) {
        this.f6872f = map;
    }

    @Override // com.google.android.gms.internal.ads.gw1
    public final void a() {
        WebView webView = new WebView(xv1.a().b());
        this.f6870d = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        c(this.f6870d);
        WebView webView2 = this.f6870d;
        if (webView2 != null && !TextUtils.isEmpty(null)) {
            webView2.loadUrl("null".length() != 0 ? "javascript: ".concat("null") : new String("javascript: "));
        }
        Iterator<String> it = this.f6872f.keySet().iterator();
        if (it.hasNext()) {
            this.f6872f.get(it.next());
            throw null;
        }
        this.f6871e = Long.valueOf(System.nanoTime());
    }

    @Override // com.google.android.gms.internal.ads.gw1
    public final void b() {
        super.b();
        new Handler().postDelayed(new iw1(this), Math.max(4000 - (this.f6871e == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f6871e.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f6870d = null;
    }

    @Override // com.google.android.gms.internal.ads.gw1
    public final void h(hv1 hv1Var, fv1 fv1Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map<String, nv1> mapF = fv1Var.f();
        for (String str : mapF.keySet()) {
            kw1.c(jSONObject, str, mapF.get(str));
        }
        i(hv1Var, fv1Var, jSONObject);
    }
}