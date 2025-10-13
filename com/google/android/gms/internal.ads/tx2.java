package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class tx2 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ zx2 f9293e;

    tx2(zx2 zx2Var) {
        this.f9293e = zx2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f9293e.J) {
            return;
        }
        this.f9293e.s.b(this.f9293e);
    }
}