package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class cs0 extends ej2<cs0, br0> implements mk2 {
    private static final cs0 zzk;
    private int zzb;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        cs0 cs0Var = new cs0();
        zzk = cs0Var;
        ej2.A(cs0.class, cs0Var);
    }

    private cs0() {
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i3 == 3) {
            return new cs0();
        }
        ti0 ti0Var = null;
        if (i3 == 4) {
            return new br0(ti0Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzk;
    }
}