package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class je2 extends ej2<je2, ge2> implements mk2 {
    private static final je2 zzf;
    private int zzb;
    private nj2<ie2> zze = ej2.p();

    static {
        je2 je2Var = new je2();
        zzf = je2Var;
        ej2.A(je2.class, je2Var);
    }

    private je2() {
    }

    public static ge2 D() {
        return zzf.w();
    }

    static /* synthetic */ void G(je2 je2Var, ie2 ie2Var) {
        ie2Var.getClass();
        nj2<ie2> nj2Var = je2Var.zze;
        if (!nj2Var.zza()) {
            je2Var.zze = ej2.q(nj2Var);
        }
        je2Var.zze.add(ie2Var);
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzb", "zze", ie2.class});
        }
        if (i3 == 3) {
            return new je2();
        }
        fe2 fe2Var = null;
        if (i3 == 4) {
            return new ge2(fe2Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzf;
    }
}