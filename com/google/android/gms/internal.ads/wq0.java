package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class wq0 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final ew f10016e;

    private wq0(ew ewVar) {
        this.f10016e = ewVar;
    }

    static Runnable a(ew ewVar) {
        return new wq0(ewVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10016e.destroy();
    }
}