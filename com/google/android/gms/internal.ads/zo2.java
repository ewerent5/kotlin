package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class zo2 implements Runnable {
    zo2() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            gp2.y.d();
            gp2.y.e();
        } catch (Exception e2) {
            gp2.A.d(2001, -1L, e2);
        }
    }
}