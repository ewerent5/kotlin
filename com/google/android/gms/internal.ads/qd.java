package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class qd implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final ad f8359e;

    private qd(ad adVar) {
        this.f8359e = adVar;
    }

    static Runnable a(ad adVar) {
        return new qd(adVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8359e.zzi();
    }
}