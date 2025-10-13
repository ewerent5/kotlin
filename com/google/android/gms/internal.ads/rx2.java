package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class rx2 implements sy2 {

    /* renamed from: e, reason: collision with root package name */
    private final sy2[] f8791e;

    public rx2(sy2[] sy2VarArr) {
        this.f8791e = sy2VarArr;
    }

    @Override // com.google.android.gms.internal.ads.sy2
    public final boolean a(long j2) {
        boolean zA;
        boolean z = false;
        do {
            long jZza = zza();
            if (jZza == Long.MIN_VALUE) {
                break;
            }
            zA = false;
            for (sy2 sy2Var : this.f8791e) {
                if (sy2Var.zza() == jZza) {
                    zA |= sy2Var.a(j2);
                }
            }
            z |= zA;
        } while (zA);
        return true == z;
    }

    @Override // com.google.android.gms.internal.ads.sy2
    public final long zza() {
        long jMin = Long.MAX_VALUE;
        for (sy2 sy2Var : this.f8791e) {
            long jZza = sy2Var.zza();
            if (jZza != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZza);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }
}