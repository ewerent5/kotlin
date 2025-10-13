package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class du1 implements mo2<cu1> {
    private final wo2<iu1> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<qu1> f5519b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<ScheduledExecutorService> f5520c;

    public du1(wo2<iu1> wo2Var, wo2<qu1> wo2Var2, wo2<ScheduledExecutorService> wo2Var3) {
        this.a = wo2Var;
        this.f5519b = wo2Var2;
        this.f5520c = wo2Var3;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        go2 go2VarB = lo2.b(this.a);
        go2 go2VarB2 = lo2.b(this.f5519b);
        Object fu1Var = ((Boolean) c.c().b(w3.J5)).booleanValue() ? new fu1((cu1) go2VarB.zzb(), this.f5520c.zzb()) : (cu1) go2VarB2.zzb();
        ro2.b(fu1Var);
        return fu1Var;
    }
}