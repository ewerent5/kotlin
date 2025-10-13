package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class v32 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ g52 f9636e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f9637f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ x32 f9638g;

    v32(x32 x32Var, g52 g52Var, int i2) {
        this.f9638g = x32Var;
        this.f9636e = g52Var;
        this.f9637f = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f9636e.isCancelled()) {
                x32.T(this.f9638g, null);
                this.f9638g.cancel(false);
            } else {
                this.f9638g.O(this.f9637f, this.f9636e);
            }
        } finally {
            x32.K(this.f9638g, null);
        }
    }
}