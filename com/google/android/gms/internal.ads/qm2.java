package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class qm2 extends ej2<qm2, pm2> implements mk2 {
    private static final qm2 zzf;
    private int zzb;
    private String zze = "";

    static {
        qm2 qm2Var = new qm2();
        zzf = qm2Var;
        ej2.A(qm2.class, qm2Var);
    }

    private qm2() {
    }

    public static pm2 D() {
        return zzf.w();
    }

    static /* synthetic */ void F(qm2 qm2Var, String str) {
        qm2Var.zzb |= 1;
        qm2Var.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzf, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzb", "zze"});
        }
        if (i3 == 3) {
            return new qm2();
        }
        km2 km2Var = null;
        if (i3 == 4) {
            return new pm2(km2Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzf;
    }
}