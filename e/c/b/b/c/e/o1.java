package e.c.b.b.c.e;

import e.c.b.b.c.e.o7;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
public final class o1 extends o7<o1, a> implements d9 {
    private static final o1 zzj;
    private static volatile j9<o1> zzk;
    private int zzc;
    private long zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;

    /* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends o7.b<o1, a> implements d9 {
        private a() {
            super(o1.zzj);
        }

        public final a q() {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((o1) this.f14741f).X();
            return this;
        }

        public final a r(double d2) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((o1) this.f14741f).y(d2);
            return this;
        }

        public final a s(long j2) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((o1) this.f14741f).z(j2);
            return this;
        }

        public final a t(String str) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((o1) this.f14741f).E(str);
            return this;
        }

        public final a u() {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((o1) this.f14741f).Y();
            return this;
        }

        public final a v(long j2) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((o1) this.f14741f).H(j2);
            return this;
        }

        public final a w(String str) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((o1) this.f14741f).L(str);
            return this;
        }

        public final a x() {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((o1) this.f14741f).Z();
            return this;
        }

        /* synthetic */ a(q1 q1Var) {
            this();
        }
    }

    static {
        o1 o1Var = new o1();
        zzj = o1Var;
        o7.r(o1.class, o1Var);
    }

    private o1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(long j2) {
        this.zzc |= 8;
        this.zzg = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(String str) {
        str.getClass();
        this.zzc |= 4;
        this.zzf = str;
    }

    public static a V() {
        return zzj.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X() {
        this.zzc &= -5;
        this.zzf = zzj.zzf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y() {
        this.zzc &= -9;
        this.zzg = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z() {
        this.zzc &= -33;
        this.zzi = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(double d2) {
        this.zzc |= 32;
        this.zzi = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(long j2) {
        this.zzc |= 1;
        this.zzd = j2;
    }

    public final boolean F() {
        return (this.zzc & 1) != 0;
    }

    public final long G() {
        return this.zzd;
    }

    public final String M() {
        return this.zze;
    }

    public final boolean O() {
        return (this.zzc & 4) != 0;
    }

    public final String P() {
        return this.zzf;
    }

    public final boolean Q() {
        return (this.zzc & 8) != 0;
    }

    public final long S() {
        return this.zzg;
    }

    public final boolean T() {
        return (this.zzc & 32) != 0;
    }

    public final double U() {
        return this.zzi;
    }

    @Override // e.c.b.b.c.e.o7
    protected final Object o(int i2, Object obj, Object obj2) {
        q1 q1Var = null;
        switch (q1.a[i2 - 1]) {
            case 1:
                return new o1();
            case 2:
                return new a(q1Var);
            case 3:
                return o7.p(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                j9<o1> aVar = zzk;
                if (aVar == null) {
                    synchronized (o1.class) {
                        aVar = zzk;
                        if (aVar == null) {
                            aVar = new o7.a<>(zzj);
                            zzk = aVar;
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