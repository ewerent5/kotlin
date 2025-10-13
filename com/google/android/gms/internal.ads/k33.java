package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class k33 extends s33 {

    /* renamed from: e, reason: collision with root package name */
    private final AppOpenAd.AppOpenAdLoadCallback f6947e;

    /* renamed from: f, reason: collision with root package name */
    private final String f6948f;

    public k33(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String str) {
        this.f6947e = appOpenAdLoadCallback;
        this.f6948f = str;
    }

    @Override // com.google.android.gms.internal.ads.t33
    public final void c0(q33 q33Var) {
        if (this.f6947e != null) {
            this.f6947e.onAdLoaded(new l33(q33Var, this.f6948f));
        }
    }

    @Override // com.google.android.gms.internal.ads.t33
    public final void g(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.t33
    public final void x(g93 g93Var) {
        if (this.f6947e != null) {
            this.f6947e.onAdFailedToLoad(g93Var.I());
        }
    }
}