package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class qn2 extends ej2<qn2, pn2> implements mk2 {
    private static final qn2 zzh;
    private int zzb;
    private String zze = "";
    private long zzf;
    private boolean zzg;

    static {
        qn2 qn2Var = new qn2();
        zzh = qn2Var;
        ej2.A(qn2.class, qn2Var);
    }

    private qn2() {
    }

    public static pn2 D() {
        return zzh.w();
    }

    static /* synthetic */ void F(qn2 qn2Var, String str) {
        qn2Var.zzb |= 1;
        qn2Var.zze = str;
    }

    static /* synthetic */ void G(qn2 qn2Var, long j2) {
        qn2Var.zzb |= 2;
        qn2Var.zzf = j2;
    }

    static /* synthetic */ void H(qn2 qn2Var, boolean z) {
        qn2Var.zzb |= 4;
        qn2Var.zzg = z;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new qn2();
        }
        km2 km2Var = null;
        if (i3 == 4) {
            return new pn2(km2Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzh;
    }
}