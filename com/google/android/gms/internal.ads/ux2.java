package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ux2 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ xx2 f9586e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ zx2 f9587f;

    ux2(zx2 zx2Var, xx2 xx2Var) {
        this.f9587f = zx2Var;
        this.f9586e = xx2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9586e.a();
        int size = this.f9587f.r.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((py2) this.f9587f.r.valueAt(i2)).g();
        }
    }
}