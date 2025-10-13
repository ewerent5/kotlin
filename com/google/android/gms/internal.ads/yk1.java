package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class yk1 implements lb1<k40> {
    final /* synthetic */ zk1 a;

    yk1(zk1 zk1Var) {
        this.a = zk1Var;
    }

    @Override // com.google.android.gms.internal.ads.lb1
    public final void zza() {
        synchronized (this.a) {
            this.a.f10619m = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.lb1
    public final /* bridge */ /* synthetic */ void zzb(k40 k40Var) {
        k40 k40Var2 = k40Var;
        synchronized (this.a) {
            k40 k40Var3 = this.a.f10619m;
            if (k40Var3 != null) {
                k40Var3.b();
            }
            zk1 zk1Var = this.a;
            zk1Var.f10619m = k40Var2;
            k40Var2.g(zk1Var);
            rk1 rk1Var = this.a.f10616j;
            zk1 zk1Var2 = this.a;
            rk1Var.i(new l40(k40Var2, zk1Var2, zk1Var2.f10616j));
            k40Var2.a();
        }
    }
}