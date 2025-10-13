package e.c.b.b.c.e;

import e.c.b.b.c.e.o7;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
public final class t0 extends o7<t0, a> implements d9 {
    private static final t0 zzh;
    private static volatile j9<t0> zzi;
    private int zzc;
    private int zzd;
    private boolean zzf;
    private String zze = "";
    private x7<String> zzg = o7.x();

    /* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends o7.b<t0, a> implements d9 {
        private a() {
            super(t0.zzh);
        }

        /* synthetic */ a(u0 u0Var) {
            this();
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public enum b implements u7 {
        UNKNOWN_MATCH_TYPE(0),
        REGEXP(1),
        BEGINS_WITH(2),
        ENDS_WITH(3),
        PARTIAL(4),
        EXACT(5),
        IN_LIST(6);


        /* renamed from: l, reason: collision with root package name */
        private static final t7<b> f14849l = new x0();
        private final int n;

        b(int i2) {
            this.n = i2;
        }

        public static b a(int i2) {
            switch (i2) {
                case 0:
                    return UNKNOWN_MATCH_TYPE;
                case 1:
                    return REGEXP;
                case 2:
                    return BEGINS_WITH;
                case 3:
                    return ENDS_WITH;
                case 4:
                    return PARTIAL;
                case 5:
                    return EXACT;
                case 6:
                    return IN_LIST;
                default:
                    return null;
            }
        }

        public static w7 b() {
            return c1.a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.n + " name=" + name() + '>';
        }

        @Override // e.c.b.b.c.e.u7
        public final int zza() {
            return this.n;
        }
    }

    static {
        t0 t0Var = new t0();
        zzh = t0Var;
        o7.r(t0.class, t0Var);
    }

    private t0() {
    }

    public static t0 G() {
        return zzh;
    }

    public final boolean A() {
        return (this.zzc & 2) != 0;
    }

    public final String B() {
        return this.zze;
    }

    public final boolean C() {
        return (this.zzc & 4) != 0;
    }

    public final boolean D() {
        return this.zzf;
    }

    public final List<String> E() {
        return this.zzg;
    }

    public final int F() {
        return this.zzg.size();
    }

    @Override // e.c.b.b.c.e.o7
    protected final Object o(int i2, Object obj, Object obj2) {
        u0 u0Var = null;
        switch (u0.a[i2 - 1]) {
            case 1:
                return new t0();
            case 2:
                return new a(u0Var);
            case 3:
                return o7.p(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzc", "zzd", b.b(), "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                j9<t0> aVar = zzi;
                if (aVar == null) {
                    synchronized (t0.class) {
                        aVar = zzi;
                        if (aVar == null) {
                            aVar = new o7.a<>(zzh);
                            zzi = aVar;
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

    public final b z() {
        b bVarA = b.a(this.zzd);
        return bVarA == null ? b.UNKNOWN_MATCH_TYPE : bVarA;
    }
}