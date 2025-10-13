package e.c.b.b.c.e;

import e.c.b.b.c.e.o7;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
public final class r0 extends o7<r0, b> implements d9 {
    private static final r0 zzi;
    private static volatile j9<r0> zzj;
    private int zzc;
    private int zzd;
    private boolean zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    /* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public enum a implements u7 {
        UNKNOWN_COMPARISON_TYPE(0),
        LESS_THAN(1),
        GREATER_THAN(2),
        EQUAL(3),
        BETWEEN(4);


        /* renamed from: j, reason: collision with root package name */
        private static final t7<a> f14808j = new w0();

        /* renamed from: l, reason: collision with root package name */
        private final int f14810l;

        a(int i2) {
            this.f14810l = i2;
        }

        public static a a(int i2) {
            if (i2 == 0) {
                return UNKNOWN_COMPARISON_TYPE;
            }
            if (i2 == 1) {
                return LESS_THAN;
            }
            if (i2 == 2) {
                return GREATER_THAN;
            }
            if (i2 == 3) {
                return EQUAL;
            }
            if (i2 != 4) {
                return null;
            }
            return BETWEEN;
        }

        public static w7 b() {
            return v0.a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f14810l + " name=" + name() + '>';
        }

        @Override // e.c.b.b.c.e.u7
        public final int zza() {
            return this.f14810l;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class b extends o7.b<r0, b> implements d9 {
        private b() {
            super(r0.zzi);
        }

        /* synthetic */ b(u0 u0Var) {
            this();
        }
    }

    static {
        r0 r0Var = new r0();
        zzi = r0Var;
        o7.r(r0.class, r0Var);
    }

    private r0() {
    }

    public static r0 I() {
        return zzi;
    }

    public final boolean A() {
        return (this.zzc & 2) != 0;
    }

    public final boolean B() {
        return this.zze;
    }

    public final boolean C() {
        return (this.zzc & 4) != 0;
    }

    public final String D() {
        return this.zzf;
    }

    public final boolean E() {
        return (this.zzc & 8) != 0;
    }

    public final String F() {
        return this.zzg;
    }

    public final boolean G() {
        return (this.zzc & 16) != 0;
    }

    public final String H() {
        return this.zzh;
    }

    @Override // e.c.b.b.c.e.o7
    protected final Object o(int i2, Object obj, Object obj2) {
        u0 u0Var = null;
        switch (u0.a[i2 - 1]) {
            case 1:
                return new r0();
            case 2:
                return new b(u0Var);
            case 3:
                return o7.p(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzc", "zzd", a.b(), "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                j9<r0> aVar = zzj;
                if (aVar == null) {
                    synchronized (r0.class) {
                        aVar = zzj;
                        if (aVar == null) {
                            aVar = new o7.a<>(zzi);
                            zzj = aVar;
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

    public final boolean y() {
        return (this.zzc & 1) != 0;
    }

    public final a z() {
        a aVarA = a.a(this.zzd);
        return aVarA == null ? a.UNKNOWN_COMPARISON_TYPE : aVarA;
    }
}