package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class i31 implements rj {
    private final rj a;

    /* renamed from: b, reason: collision with root package name */
    private final rj f6470b;

    public i31(rj rjVar, rj rjVar2) {
        this.a = rjVar;
        this.f6470b = rjVar2;
    }

    private final rj a() {
        return ((Boolean) c.c().b(w3.p3)).booleanValue() ? this.a : this.f6470b;
    }

    @Override // com.google.android.gms.internal.ads.rj
    public final void H(e.c.b.b.b.b bVar) {
        a().H(bVar);
    }

    @Override // com.google.android.gms.internal.ads.rj
    public final e.c.b.b.b.b I(String str, WebView webView, String str2, String str3, String str4, String str5, tj tjVar, sj sjVar, String str6) {
        return a().I(str, webView, "", "javascript", str4, str5, tjVar, sjVar, str6);
    }

    @Override // com.google.android.gms.internal.ads.rj
    public final e.c.b.b.b.b J(String str, WebView webView, String str2, String str3, String str4) {
        return a().J(str, webView, "", "javascript", str4);
    }

    @Override // com.google.android.gms.internal.ads.rj
    public final e.c.b.b.b.b K(String str, WebView webView, String str2, String str3, String str4, String str5) {
        return a().K(str, webView, "", "javascript", str4, str5);
    }

    @Override // com.google.android.gms.internal.ads.rj
    public final e.c.b.b.b.b L(String str, WebView webView, String str2, String str3, String str4, tj tjVar, sj sjVar, String str5) {
        return a().L(str, webView, "", "javascript", str4, tjVar, sjVar, str5);
    }

    @Override // com.google.android.gms.internal.ads.rj
    public final void M(e.c.b.b.b.b bVar, View view) {
        a().M(bVar, view);
    }

    @Override // com.google.android.gms.internal.ads.rj
    public final void N(e.c.b.b.b.b bVar, View view) {
        a().N(bVar, view);
    }

    @Override // com.google.android.gms.internal.ads.rj
    public final void m(e.c.b.b.b.b bVar) {
        a().m(bVar);
    }

    @Override // com.google.android.gms.internal.ads.rj
    public final String n(Context context) {
        return a().n(context);
    }

    @Override // com.google.android.gms.internal.ads.rj
    public final boolean zza(Context context) {
        return a().zza(context);
    }
}