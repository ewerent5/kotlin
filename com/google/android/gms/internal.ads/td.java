package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class td implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final ad f9114e;

    private td(ad adVar) {
        this.f9114e = adVar;
    }

    static Runnable a(ad adVar) {
        return new td(adVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9114e.zzi();
    }
}