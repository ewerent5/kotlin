package e.c.b.b.c.e;

import e.c.b.b.c.e.o7;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
public final class z0 extends o7<z0, a> implements d9 {
    private static final z0 zzh;
    private static volatile j9<z0> zzi;
    private int zzc;
    private String zzd = "";
    private boolean zze;
    private boolean zzf;
    private int zzg;

    /* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends o7.b<z0, a> implements d9 {
        private a() {
            super(z0.zzh);
        }

        public final a q(String str) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((z0) this.f14741f).A(str);
            return this;
        }

        public final String r() {
            return ((z0) this.f14741f).y();
        }

        public final boolean s() {
            return ((z0) this.f14741f).B();
        }

        public final boolean t() {
            return ((z0) this.f14741f).C();
        }

        public final boolean u() {
            return ((z0) this.f14741f).D();
        }

        public final int v() {
            return ((z0) this.f14741f).E();
        }

        /* synthetic */ a(d1 d1Var) {
            this();
        }
    }

    static {
        z0 z0Var = new z0();
        zzh = z0Var;
        o7.r(z0.class, z0Var);
    }

    private z0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }

    public final boolean B() {
        return this.zze;
    }

    public final boolean C() {
        return this.zzf;
    }

    public final boolean D() {
        return (this.zzc & 8) != 0;
    }

    public final int E() {
        return this.zzg;
    }

    @Override // e.c.b.b.c.e.o7
    protected final Object o(int i2, Object obj, Object obj2) {
        d1 d1Var = null;
        switch (d1.a[i2 - 1]) {
            case 1:
                return new z0();
            case 2:
                return new a(d1Var);
            case 3:
                return o7.p(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                j9<z0> aVar = zzi;
                if (aVar == null) {
                    synchronized (z0.class) {
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

    public final String y() {
        return this.zzd;
    }
}