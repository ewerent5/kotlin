package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ie2 extends ej2<ie2, he2> implements mk2 {
    private static final ie2 zzh;
    private String zzb = "";
    private int zze;
    private int zzf;
    private int zzg;

    static {
        ie2 ie2Var = new ie2();
        zzh = ie2Var;
        ej2.A(ie2.class, ie2Var);
    }

    private ie2() {
    }

    public static he2 D() {
        return zzh.w();
    }

    static /* synthetic */ void F(ie2 ie2Var, String str) {
        str.getClass();
        ie2Var.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzh, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new ie2();
        }
        fe2 fe2Var = null;
        if (i3 == 4) {
            return new he2(fe2Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzh;
    }
}