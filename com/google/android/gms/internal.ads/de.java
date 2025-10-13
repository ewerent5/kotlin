package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class de implements Runnable {

    /* renamed from: e */
    private final ee f5467e;

    /* renamed from: f */
    private final ad f5468f;

    de(ee eeVar, ad adVar) {
        this.f5467e = eeVar;
        this.f5468f = adVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ad adVar = this.f5468f;
        adVar.A("/result", aa.p);
        adVar.zzi();
    }
}