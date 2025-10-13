package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.s60;
import com.google.android.gms.internal.ads.y90;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ql1<R extends y90<AdT>, AdT extends s60> implements yr1<AdT> {
    private final mm1<R, mr1<AdT>> a;

    public ql1(mm1<R, mr1<AdT>> mm1Var) {
        this.a = mm1Var;
    }

    @Override // com.google.android.gms.internal.ads.yr1
    public final void a(mr1<AdT> mr1Var) {
        mr1Var.a = ((ml1) this.a).b().zzc();
    }

    @Override // com.google.android.gms.internal.ads.yr1
    public final g52<mr1<AdT>> b(zr1 zr1Var) {
        rl1 rl1Var = (rl1) zr1Var;
        return this.a.a(rl1Var.f8676b, rl1Var.a);
    }
}