package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class ch1 implements Runnable {

    /* renamed from: e */
    private final ah1 f5317e;

    /* renamed from: f */
    private final long f5318f;

    ch1(ah1 ah1Var, long j2) {
        this.f5317e = ah1Var;
        this.f5318f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ah1 ah1Var = this.f5317e;
        long j2 = this.f5318f;
        String canonicalName = ah1Var.getClass().getCanonicalName();
        long jC = zzs.zzj().c();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 40);
        sb.append("Signal runtime : ");
        sb.append(canonicalName);
        sb.append(" = ");
        sb.append(jC - j2);
        zze.zza(sb.toString());
    }
}