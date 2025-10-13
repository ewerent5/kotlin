package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class xk2 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ yl2 f10187e;

    xk2(yl2 yl2Var) {
        this.f10187e = yl2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        if (this.f10187e.f10452e != null) {
            return;
        }
        synchronized (yl2.a) {
            if (this.f10187e.f10452e == null) {
                boolean z = false;
                try {
                    zBooleanValue = w3.y1.e().booleanValue();
                } catch (IllegalStateException unused) {
                    zBooleanValue = false;
                }
                if (zBooleanValue) {
                    try {
                        yl2.f10449b = new vz1(this.f10187e.f10451d.f6158b, "ADSHIELD", null);
                        z = zBooleanValue;
                    } catch (Throwable unused2) {
                    }
                } else {
                    z = zBooleanValue;
                }
                this.f10187e.f10452e = Boolean.valueOf(z);
                yl2.a.open();
            }
        }
    }
}