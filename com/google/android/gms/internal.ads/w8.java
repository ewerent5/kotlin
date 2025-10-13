package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class w8 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AdManagerAdView f9918e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ w f9919f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ x8 f9920g;

    w8(x8 x8Var, AdManagerAdView adManagerAdView, w wVar) {
        this.f9920g = x8Var;
        this.f9918e = adManagerAdView;
        this.f9919f = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f9918e.zza(this.f9919f)) {
            this.f9920g.f10137e.onAdManagerAdViewLoaded(this.f9918e);
        } else {
            er.zzi("Could not bind.");
        }
    }
}