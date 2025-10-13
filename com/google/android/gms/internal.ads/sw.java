package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class sw implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final ew f9001e;

    private sw(ew ewVar) {
        this.f9001e = ewVar;
    }

    static Runnable a(ew ewVar) {
        return new sw(ewVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9001e.destroy();
    }
}