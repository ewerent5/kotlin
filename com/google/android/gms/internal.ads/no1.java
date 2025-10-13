package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class no1 implements lb1<xq0> {
    final /* synthetic */ oo1 a;

    no1(oo1 oo1Var) {
        this.a = oo1Var;
    }

    @Override // com.google.android.gms.internal.ads.lb1
    public final void zza() {
        synchronized (this.a) {
            this.a.f7983j = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.lb1
    public final /* bridge */ /* synthetic */ void zzb(xq0 xq0Var) {
        xq0 xq0Var2 = xq0Var;
        synchronized (this.a) {
            this.a.f7983j = xq0Var2;
            this.a.f7983j.a();
        }
    }
}