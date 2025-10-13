package e.c.b.b.c.e;

import e.c.b.b.c.e.o7;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
public final class b1 extends o7<b1, a> implements d9 {
    private static final b1 zzf;
    private static volatile j9<b1> zzg;
    private int zzc;
    private String zzd = "";
    private String zze = "";

    /* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends o7.b<b1, a> implements d9 {
        private a() {
            super(b1.zzf);
        }

        /* synthetic */ a(d1 d1Var) {
            this();
        }
    }

    static {
        b1 b1Var = new b1();
        zzf = b1Var;
        o7.r(b1.class, b1Var);
    }

    private b1() {
    }

    @Override // e.c.b.b.c.e.o7
    protected final Object o(int i2, Object obj, Object obj2) {
        d1 d1Var = null;
        switch (d1.a[i2 - 1]) {
            case 1:
                return new b1();
            case 2:
                return new a(d1Var);
            case 3:
                return o7.p(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                j9<b1> aVar = zzg;
                if (aVar == null) {
                    synchronized (b1.class) {
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

    public final String y() {
        return this.zzd;
    }

    public final String z() {
        return this.zze;
    }
}