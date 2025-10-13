package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class i41 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final ew f6477e;

    private i41(ew ewVar) {
        this.f6477e = ewVar;
    }

    static Runnable a(ew ewVar) {
        return new i41(ewVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6477e.k0();
    }
}