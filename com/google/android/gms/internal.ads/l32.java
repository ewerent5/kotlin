package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class l32<V> implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final f32<V> f7179e;

    /* renamed from: f, reason: collision with root package name */
    final g52<? extends V> f7180f;

    l32(f32<V> f32Var, g52<? extends V> g52Var) {
        this.f7179e = f32Var;
        this.f7180f = g52Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((f32) this.f7179e).f5792i != this) {
            return;
        }
        if (f32.f5790g.e(this.f7179e, this, f32.g(this.f7180f))) {
            f32.A(this.f7179e);
        }
    }
}