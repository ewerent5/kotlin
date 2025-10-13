package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class ws implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final ts f10031e;

    private ws(ts tsVar) {
        this.f10031e = tsVar;
    }

    static Runnable a(ts tsVar) {
        return new ws(tsVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10031e.i();
    }
}