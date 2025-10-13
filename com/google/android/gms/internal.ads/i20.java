package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class i20 implements jb0 {

    /* renamed from: e, reason: collision with root package name */
    private final hq1 f6458e;

    public i20(hq1 hq1Var) {
        this.f6458e = hq1Var;
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final void c(Context context) {
        try {
            this.f6458e.l();
        } catch (vp1 e2) {
            er.zzj("Cannot invoke onPause for the mediation adapter.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final void u(Context context) {
        try {
            this.f6458e.i();
        } catch (vp1 e2) {
            er.zzj("Cannot invoke onDestroy for the mediation adapter.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final void x(Context context) {
        try {
            this.f6458e.m();
            if (context != null) {
                this.f6458e.s(context);
            }
        } catch (vp1 e2) {
            er.zzj("Cannot invoke onResume for the mediation adapter.", e2);
        }
    }
}