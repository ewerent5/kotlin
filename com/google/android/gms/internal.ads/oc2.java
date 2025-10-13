package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class oc2 extends ej2<oc2, nc2> implements mk2 {
    private static final oc2 zzg;
    private yc2 zzb;
    private ic2 zze;
    private int zzf;

    static {
        oc2 oc2Var = new oc2();
        zzg = oc2Var;
        ej2.A(oc2.class, oc2Var);
    }

    private oc2() {
    }

    public static oc2 G() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new oc2();
        }
        mc2 mc2Var = null;
        if (i3 == 4) {
            return new nc2(mc2Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzg;
    }

    public final yc2 D() {
        yc2 yc2Var = this.zzb;
        return yc2Var == null ? yc2.G() : yc2Var;
    }

    public final ic2 E() {
        ic2 ic2Var = this.zze;
        return ic2Var == null ? ic2.E() : ic2Var;
    }

    public final fc2 F() {
        fc2 fc2VarA = fc2.a(this.zzf);
        return fc2VarA == null ? fc2.UNRECOGNIZED : fc2VarA;
    }
}