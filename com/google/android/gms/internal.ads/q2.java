package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class q2 extends n0 {

    /* renamed from: e, reason: collision with root package name */
    private ec f8313e;

    @Override // com.google.android.gms.internal.ads.o0
    public final void D0(ec ecVar) {
        this.f8313e = ecVar;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final void F1(x2 x2Var) {
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final void J(String str) {
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final void L2(tf tfVar) {
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final void P(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final void U0(e.c.b.b.b.b bVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final void V0(float f2) {
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final void Z0(String str, e.c.b.b.b.b bVar) {
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final void k4(a1 a1Var) {
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final void u(String str) {
    }

    final /* synthetic */ void zzb() {
        ec ecVar = this.f8313e;
        if (ecVar != null) {
            try {
                ecVar.t3(Collections.emptyList());
            } catch (RemoteException e2) {
                er.zzj("Could not notify onComplete event.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final void zze() {
        er.zzf("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        xq.a.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.p2

            /* renamed from: e, reason: collision with root package name */
            private final q2 f8064e;

            {
                this.f8064e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f8064e.zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final float zzk() {
        return 1.0f;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final boolean zzl() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final String zzm() {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final List<xb> zzq() {
        return Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final void zzs() {
    }
}