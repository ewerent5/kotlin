package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class bp2 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Context f5164e;

    bp2(gp2 gp2Var, Context context) {
        this.f5164e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            gp2.y.zzl(this.f5164e);
        } catch (Exception e2) {
            gp2.A.d(2019, -1L, e2);
        }
    }
}