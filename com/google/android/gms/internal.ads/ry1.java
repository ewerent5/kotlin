package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ry1 extends ej2<ry1, ny1> implements mk2 {
    private static final ry1 zzi;
    private int zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private ly1 zzh;

    static {
        ry1 ry1Var = new ry1();
        zzi = ry1Var;
        ej2.A(ry1.class, ry1Var);
    }

    private ry1() {
    }

    public static ny1 D() {
        return zzi.w();
    }

    static /* synthetic */ void F(ry1 ry1Var, qy1 qy1Var) {
        ry1Var.zze = qy1Var.zza();
        ry1Var.zzb |= 1;
    }

    static /* synthetic */ void G(ry1 ry1Var, String str) {
        str.getClass();
        ry1Var.zzb |= 2;
        ry1Var.zzf = str;
    }

    static /* synthetic */ void H(ry1 ry1Var, ly1 ly1Var) {
        ly1Var.getClass();
        ry1Var.zzh = ly1Var;
        ry1Var.zzb |= 8;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzb", "zze", qy1.b(), "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new ry1();
        }
        my1 my1Var = null;
        if (i3 == 4) {
            return new ny1(my1Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzi;
    }
}