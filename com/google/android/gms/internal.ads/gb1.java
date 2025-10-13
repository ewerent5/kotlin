package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class gb1 implements lb1<s60> {
    final /* synthetic */ hb1 a;

    gb1(hb1 hb1Var) {
        this.a = hb1Var;
    }

    @Override // com.google.android.gms.internal.ads.lb1
    public final void zza() {
        synchronized (this.a) {
        }
    }

    @Override // com.google.android.gms.internal.ads.lb1
    public final /* bridge */ /* synthetic */ void zzb(s60 s60Var) {
        synchronized (this.a) {
            this.a.f6320c = s60Var.d();
            s60Var.a();
        }
    }
}