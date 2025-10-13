package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class w32 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ y12 f9877e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ x32 f9878f;

    w32(x32 x32Var, y12 y12Var) {
        this.f9878f = x32Var;
        this.f9877e = y12Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x32.K(this.f9878f, this.f9877e);
    }
}