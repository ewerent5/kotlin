package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@Deprecated
/* loaded from: classes.dex */
public final class zd2 extends ej2<zd2, yd2> implements mk2 {
    private static final zd2 zzi;
    private int zzf;
    private boolean zzg;
    private String zzb = "";
    private String zze = "";
    private String zzh = "";

    static {
        zd2 zd2Var = new zd2();
        zzi = zd2Var;
        ej2.A(zd2.class, zd2Var);
    }

    private zd2() {
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzi, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new zd2();
        }
        xd2 xd2Var = null;
        if (i3 == 4) {
            return new yd2(xd2Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzi;
    }

    public final String D() {
        return this.zzb;
    }

    public final String E() {
        return this.zze;
    }

    public final int F() {
        return this.zzf;
    }

    public final boolean G() {
        return this.zzg;
    }

    public final String H() {
        return this.zzh;
    }
}