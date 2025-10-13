package e.c.b.b.c.e;

import e.c.b.b.c.e.o7;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
public final class y1 extends o7<y1, b> implements d9 {
    private static final y1 zzk;
    private static volatile j9<y1> zzl;
    private int zzc;
    private int zzd;
    private boolean zzf;
    private long zzg;
    private double zzh;
    private String zze = "";
    private x7<y1> zzi = o7.x();
    private String zzj = "";

    /* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public enum a implements u7 {
        UNKNOWN(0),
        STRING(1),
        NUMBER(2),
        BOOLEAN(3),
        STATEMENT(4);


        /* renamed from: j, reason: collision with root package name */
        private static final t7<a> f14939j = new b2();

        /* renamed from: l, reason: collision with root package name */
        private final int f14941l;

        a(int i2) {
            this.f14941l = i2;
        }

        public static a a(int i2) {
            if (i2 == 0) {
                return UNKNOWN;
            }
            if (i2 == 1) {
                return STRING;
            }
            if (i2 == 2) {
                return NUMBER;
            }
            if (i2 == 3) {
                return BOOLEAN;
            }
            if (i2 != 4) {
                return null;
            }
            return STATEMENT;
        }

        public static w7 b() {
            return a2.a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f14941l + " name=" + name() + '>';
        }

        @Override // e.c.b.b.c.e.u7
        public final int zza() {
            return this.f14941l;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class b extends o7.b<y1, b> implements d9 {
        private b() {
            super(y1.zzk);
        }

        /* synthetic */ b(z1 z1Var) {
            this();
        }
    }

    static {
        y1 y1Var = new y1();
        zzk = y1Var;
        o7.r(y1.class, y1Var);
    }

    private y1() {
    }

    @Override // e.c.b.b.c.e.o7
    protected final Object o(int i2, Object obj, Object obj2) {
        z1 z1Var = null;
        switch (z1.a[i2 - 1]) {
            case 1:
                return new y1();
            case 2:
                return new b(z1Var);
            case 3:
                return o7.p(zzk, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005က\u0004\u0006\u001b\u0007ဈ\u0005", new Object[]{"zzc", "zzd", a.b(), "zze", "zzf", "zzg", "zzh", "zzi", y1.class, "zzj"});
            case 4:
                return zzk;
            case 5:
                j9<y1> aVar = zzl;
                if (aVar == null) {
                    synchronized (y1.class) {
                        aVar = zzl;
                        if (aVar == null) {
                            aVar = new o7.a<>(zzk);
                            zzl = aVar;
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