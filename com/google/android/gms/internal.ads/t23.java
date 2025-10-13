package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class t23 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final ValueCallback<String> f9069e = new s23(this);

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ k23 f9070f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ WebView f9071g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f9072h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ v23 f9073i;

    t23(v23 v23Var, k23 k23Var, WebView webView, boolean z) {
        this.f9073i = v23Var;
        this.f9070f = k23Var;
        this.f9071g = webView;
        this.f9072h = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f9071g.getSettings().getJavaScriptEnabled()) {
            try {
                this.f9071g.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f9069e);
            } catch (Throwable unused) {
                ((s23) this.f9069e).onReceiveValue("");
            }
        }
    }
}