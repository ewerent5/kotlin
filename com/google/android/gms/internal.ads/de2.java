package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class de2 extends ej2<de2, ce2> implements mk2 {
    private static final de2 zzh;
    private qd2 zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        de2 de2Var = new de2();
        zzh = de2Var;
        ej2.A(de2.class, de2Var);
    }

    private de2() {
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzh, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new de2();
        }
        ae2 ae2Var = null;
        if (i3 == 4) {
            return new ce2(ae2Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzh;
    }

    public final boolean D() {
        return this.zzb != null;
    }

    public final qd2 E() {
        qd2 qd2Var = this.zzb;
        return qd2Var == null ? qd2.H() : qd2Var;
    }

    public final td2 F() {
        td2 td2VarA = td2.a(this.zze);
        return td2VarA == null ? td2.UNRECOGNIZED : td2VarA;
    }

    public final int G() {
        return this.zzf;
    }

    public final ye2 H() {
        ye2 ye2VarA = ye2.a(this.zzg);
        return ye2VarA == null ? ye2.UNRECOGNIZED : ye2VarA;
    }
}