package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class hr0 implements mo2<g53> {
    private final wo2<qp1> a;

    public hr0(wo2<qp1> wo2Var) {
        this.a = wo2Var;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        g53 g53Var = ((ga0) this.a).a().o.a == 3 ? g53.REWARDED_INTERSTITIAL : g53.REWARD_BASED_VIDEO_AD;
        ro2.b(g53Var);
        return g53Var;
    }
}