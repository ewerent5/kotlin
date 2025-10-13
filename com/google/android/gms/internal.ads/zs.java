package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class zs implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ bt f10630e;

    zs(bt btVar) {
        this.f10630e = btVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10630e.k("surfaceDestroyed", new String[0]);
    }
}