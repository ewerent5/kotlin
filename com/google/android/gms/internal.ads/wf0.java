package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class wf0 implements mo2<sa0> {
    private final vf0 a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Set<nh0<ta0>>> f9956b;

    public wf0(vf0 vf0Var, wo2<Set<nh0<ta0>>> wo2Var) {
        this.a = vf0Var;
        this.f9956b = wo2Var;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        sa0 sa0VarO = this.a.o(((uo2) this.f9956b).zzb());
        ro2.b(sa0VarO);
        return sa0VarO;
    }
}