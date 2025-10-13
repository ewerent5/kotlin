package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class db1 implements lb1<li0> {
    final /* synthetic */ eb1 a;

    db1(eb1 eb1Var) {
        this.a = eb1Var;
    }

    @Override // com.google.android.gms.internal.ads.lb1
    public final void zza() {
        synchronized (this.a) {
            this.a.f5617k = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.lb1
    public final /* bridge */ /* synthetic */ void zzb(li0 li0Var) {
        li0 li0Var2 = li0Var;
        synchronized (this.a) {
            this.a.f5617k = li0Var2;
            this.a.f5617k.a();
        }
    }
}