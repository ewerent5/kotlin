package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class qd2 extends ej2<qd2, nd2> implements mk2 {
    private static final qd2 zzg;
    private String zzb = "";
    private ci2 zze = ci2.f5319e;
    private int zzf;

    static {
        qd2 qd2Var = new qd2();
        zzg = qd2Var;
        ej2.A(qd2.class, qd2Var);
    }

    private qd2() {
    }

    public static nd2 G() {
        return zzg.w();
    }

    public static qd2 H() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new qd2();
        }
        md2 md2Var = null;
        if (i3 == 4) {
            return new nd2(md2Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzg;
    }

    public final String D() {
        return this.zzb;
    }

    public final ci2 E() {
        return this.zze;
    }

    public final pd2 F() {
        pd2 pd2VarA = pd2.a(this.zzf);
        return pd2VarA == null ? pd2.UNRECOGNIZED : pd2VarA;
    }
}