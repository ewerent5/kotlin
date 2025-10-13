package e.c.b.b.c.e;

import e.c.b.b.c.e.o7;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
public final class w1 extends o7<w1, a> implements d9 {
    private static final w1 zzf;
    private static volatile j9<w1> zzg;
    private int zzc;
    private String zzd = "";
    private x7<y1> zze = o7.x();

    /* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends o7.b<w1, a> implements d9 {
        private a() {
            super(w1.zzf);
        }

        /* synthetic */ a(z1 z1Var) {
            this();
        }
    }

    static {
        w1 w1Var = new w1();
        zzf = w1Var;
        o7.r(w1.class, w1Var);
    }

    private w1() {
    }

    @Override // e.c.b.b.c.e.o7
    protected final Object o(int i2, Object obj, Object obj2) {
        z1 z1Var = null;
        switch (z1.a[i2 - 1]) {
            case 1:
                return new w1();
            case 2:
                return new a(z1Var);
            case 3:
                return o7.p(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzc", "zzd", "zze", y1.class});
            case 4:
                return zzf;
            case 5:
                j9<w1> aVar = zzg;
                if (aVar == null) {
                    synchronized (w1.class) {
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