package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class ki0 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final ew f7001e;

    private ki0(ew ewVar) {
        this.f7001e = ewVar;
    }

    static Runnable a(ew ewVar) {
        return new ki0(ewVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7001e.destroy();
    }
}