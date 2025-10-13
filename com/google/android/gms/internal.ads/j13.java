package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class j13 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ xs2 f6658e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ p13 f6659f;

    j13(p13 p13Var, xs2 xs2Var) {
        this.f6659f = p13Var;
        this.f6658e = xs2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6659f.f8063b.d(this.f6658e);
    }
}