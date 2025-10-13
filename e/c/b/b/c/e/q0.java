package e.c.b.b.c.e;

import e.c.b.b.c.e.o7;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
public final class q0 extends o7<q0, a> implements d9 {
    private static final q0 zzh;
    private static volatile j9<q0> zzi;
    private int zzc;
    private t0 zzd;
    private r0 zze;
    private boolean zzf;
    private String zzg = "";

    /* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends o7.b<q0, a> implements d9 {
        private a() {
            super(q0.zzh);
        }

        public final a q(String str) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((q0) this.f14741f).z(str);
            return this;
        }

        /* synthetic */ a(u0 u0Var) {
            this();
        }
    }

    static {
        q0 q0Var = new q0();
        zzh = q0Var;
        o7.r(q0.class, q0Var);
    }

    private q0() {
    }

    public static q0 I() {
        return zzh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(String str) {
        str.getClass();
        this.zzc |= 8;
        this.zzg = str;
    }

    public final boolean A() {
        return (this.zzc & 1) != 0;
    }

    public final t0 B() {
        t0 t0Var = this.zzd;
        return t0Var == null ? t0.G() : t0Var;
    }

    public final boolean C() {
        return (this.zzc & 2) != 0;
    }

    public final r0 D() {
        r0 r0Var = this.zze;
        return r0Var == null ? r0.I() : r0Var;
    }

    public final boolean E() {
        return (this.zzc & 4) != 0;
    }

    public final boolean F() {
        return this.zzf;
    }

    public final boolean G() {
        return (this.zzc & 8) != 0;
    }

    public final String H() {
        return this.zzg;
    }

    @Override // e.c.b.b.c.e.o7
    protected final Object o(int i2, Object obj, Object obj2) {
        u0 u0Var = null;
        switch (u0.a[i2 - 1]) {
            case 1:
                return new q0();
            case 2:
                return new a(u0Var);
            case 3:
                return o7.p(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                j9<q0> aVar = zzi;
                if (aVar == null) {
                    synchronized (q0.class) {
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
}