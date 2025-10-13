package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ys implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ bt f10469e;

    ys(bt btVar) {
        this.f10469e = btVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10469e.k("surfaceCreated", new String[0]);
    }
}