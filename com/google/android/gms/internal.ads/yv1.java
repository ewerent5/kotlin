package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class yv1 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ WebView f10494e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f10495f;

    yv1(zv1 zv1Var, WebView webView, String str) {
        this.f10494e = webView;
        this.f10495f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10494e.loadUrl(this.f10495f);
    }
}