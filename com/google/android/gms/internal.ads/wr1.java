package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class wr1 implements u42<mr1> {
    final /* synthetic */ as1 a;

    wr1(as1 as1Var) {
        this.a = as1Var;
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final void zza(Throwable th) {
        synchronized (this.a) {
            this.a.f4989c.m(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final /* bridge */ /* synthetic */ void zzb(mr1 mr1Var) {
        mr1 mr1Var2 = mr1Var;
        synchronized (this.a) {
            this.a.f4992f.a(mr1Var2);
            if (this.a.f4995i != 2) {
                this.a.f4991e.c(this.a.f4988b.zzb(), mr1Var2);
            }
            if (this.a.f4995i == 1) {
                as1 as1Var = this.a;
                as1Var.l(as1Var.f4988b);
            }
            as1.k(this.a, 1);
            this.a.f4989c.l(mr1Var2);
        }
    }
}