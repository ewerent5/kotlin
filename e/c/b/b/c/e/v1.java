package e.c.b.b.c.e;

import e.c.b.b.c.e.o7;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
public final class v1 extends o7<v1, a> implements d9 {
    private static final v1 zzd;
    private static volatile j9<v1> zze;
    private x7<w1> zzc = o7.x();

    /* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends o7.b<v1, a> implements d9 {
        private a() {
            super(v1.zzd);
        }

        /* synthetic */ a(z1 z1Var) {
            this();
        }
    }

    static {
        v1 v1Var = new v1();
        zzd = v1Var;
        o7.r(v1.class, v1Var);
    }

    private v1() {
    }

    @Override // e.c.b.b.c.e.o7
    protected final Object o(int i2, Object obj, Object obj2) {
        z1 z1Var = null;
        switch (z1.a[i2 - 1]) {
            case 1:
                return new v1();
            case 2:
                return new a(z1Var);
            case 3:
                return o7.p(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", w1.class});
            case 4:
                return zzd;
            case 5:
                j9<v1> aVar = zze;
                if (aVar == null) {
                    synchronized (v1.class) {
                        aVar = zze;
                        if (aVar == null) {
                            aVar = new o7.a<>(zzd);
                            zze = aVar;
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