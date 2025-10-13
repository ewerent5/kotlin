package e.c.b.b.c.e;

import e.c.b.b.c.e.o7;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
public final class x1 extends o7<x1, a> implements d9 {
    private static final x1 zzf;
    private static volatile j9<x1> zzg;
    private int zzc;
    private x7<y1> zzd = o7.x();
    private v1 zze;

    /* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends o7.b<x1, a> implements d9 {
        private a() {
            super(x1.zzf);
        }

        /* synthetic */ a(z1 z1Var) {
            this();
        }
    }

    static {
        x1 x1Var = new x1();
        zzf = x1Var;
        o7.r(x1.class, x1Var);
    }

    private x1() {
    }

    @Override // e.c.b.b.c.e.o7
    protected final Object o(int i2, Object obj, Object obj2) {
        z1 z1Var = null;
        switch (z1.a[i2 - 1]) {
            case 1:
                return new x1();
            case 2:
                return new a(z1Var);
            case 3:
                return o7.p(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", y1.class, "zze"});
            case 4:
                return zzf;
            case 5:
                j9<x1> aVar = zzg;
                if (aVar == null) {
                    synchronized (x1.class) {
                        aVar = zzg;
                        if (aVar == null) {
                            aVar = new o7.a<>(zzf);
                            zzg = aVar;
                        }
                    }
                }
                return aVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}