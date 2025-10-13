package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ly1 extends ej2<ly1, ky1> implements mk2 {
    private static final kj2<Integer, jy1> zzf = new gy1();
    private static final ly1 zzj;
    private int zzb;
    private jj2 zze = ej2.m();
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        ly1 ly1Var = new ly1();
        zzj = ly1Var;
        ej2.A(ly1.class, ly1Var);
    }

    private ly1() {
    }

    public static ky1 D() {
        return zzj.w();
    }

    static /* synthetic */ void F(ly1 ly1Var, jy1 jy1Var) {
        jy1Var.getClass();
        jj2 jj2Var = ly1Var.zze;
        if (!jj2Var.zza()) {
            ly1Var.zze = ej2.n(jj2Var);
        }
        ly1Var.zze.Z(jy1Var.zza());
    }

    static /* synthetic */ void G(ly1 ly1Var, String str) {
        str.getClass();
        ly1Var.zzb |= 1;
        ly1Var.zzg = str;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzj, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzb", "zze", jy1.b(), "zzg", "zzh", "zzi"});
        }
        if (i3 == 3) {
            return new ly1();
        }
        gy1 gy1Var = null;
        if (i3 == 4) {
            return new ky1(gy1Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzj;
    }
}