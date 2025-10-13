package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ca1 implements lb1<r40> {
    final /* synthetic */ da1 a;

    ca1(da1 da1Var) {
        this.a = da1Var;
    }

    @Override // com.google.android.gms.internal.ads.lb1
    public final void zza() {
        synchronized (this.a) {
            this.a.f5458k = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.lb1
    public final /* bridge */ /* synthetic */ void zzb(r40 r40Var) {
        r40 r40Var2 = r40Var;
        synchronized (this.a) {
            if (this.a.f5458k != null) {
                this.a.f5458k.b();
            }
            this.a.f5458k = r40Var2;
            this.a.f5458k.a();
        }
    }
}