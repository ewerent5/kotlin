package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class at implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f4996e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ bt f4997f;

    at(bt btVar, boolean z) {
        this.f4997f = btVar;
        this.f4996e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4997f.k("windowVisibilityChanged", "isVisible", String.valueOf(this.f4996e));
    }
}