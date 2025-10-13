package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class vk0 extends ej2<vk0, uj0> implements mk2 {
    private static final vk0 zzg;
    private int zzb;
    private xm0 zze;
    private cs0 zzf;

    static {
        vk0 vk0Var = new vk0();
        zzg = vk0Var;
        ej2.A(vk0.class, vk0Var);
    }

    private vk0() {
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new vk0();
        }
        ti0 ti0Var = null;
        if (i3 == 4) {
            return new uj0(ti0Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzg;
    }
}