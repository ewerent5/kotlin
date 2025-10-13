package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class jp1 extends ej2<jp1, io1> implements mk2 {
    private static final jp1 zzh;
    private int zzb;
    private long zze;
    private String zzf = "";
    private ci2 zzg = ci2.f5319e;

    static {
        jp1 jp1Var = new jp1();
        zzh = jp1Var;
        ej2.A(jp1.class, jp1Var);
    }

    private jp1() {
    }

    public static jp1 F() {
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzh, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new jp1();
        }
        dt0 dt0Var = null;
        if (i3 == 4) {
            return new io1(dt0Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzh;
    }

    public final boolean D() {
        return (this.zzb & 1) != 0;
    }

    public final long E() {
        return this.zze;
    }
}