package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class so1 implements lb1<xq0> {
    final /* synthetic */ uo1 a;

    so1(uo1 uo1Var) {
        this.a = uo1Var;
    }

    @Override // com.google.android.gms.internal.ads.lb1
    public final void zza() {
        synchronized (this.a) {
            this.a.f9523h = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.lb1
    public final /* bridge */ /* synthetic */ void zzb(xq0 xq0Var) {
        xq0 xq0Var2 = xq0Var;
        synchronized (this.a) {
            this.a.f9523h = xq0Var2;
            this.a.f9523h.a();
        }
    }
}