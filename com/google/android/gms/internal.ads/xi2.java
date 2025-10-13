package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class xi2 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ wj2 f10172e;

    xi2(wj2 wj2Var) {
        this.f10172e = wj2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f10172e.p) {
            if (this.f10172e.q) {
                return;
            }
            this.f10172e.q = true;
            try {
                wj2.j(this.f10172e);
            } catch (Exception e2) {
                this.f10172e.f9982k.d(2023, -1L, e2);
            }
            synchronized (this.f10172e.p) {
                this.f10172e.q = false;
            }
        }
    }
}