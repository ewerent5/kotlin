package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ee implements as<ad> {
    final /* synthetic */ fe a;

    ee(fe feVar) {
        this.a = feVar;
    }

    @Override // com.google.android.gms.internal.ads.as
    public final /* bridge */ /* synthetic */ void zza(ad adVar) {
        final ad adVar2 = adVar;
        qr.f8450e.execute(new Runnable(this, adVar2) { // from class: com.google.android.gms.internal.ads.de

            /* renamed from: e, reason: collision with root package name */
            private final ee f5467e;

            /* renamed from: f, reason: collision with root package name */
            private final ad f5468f;

            {
                this.f5467e = this;
                this.f5468f = adVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ad adVar3 = this.f5468f;
                adVar3.A("/result", aa.p);
                adVar3.zzi();
            }
        });
    }
}