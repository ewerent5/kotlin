package e.c.b.b.c.e;

import e.c.b.b.c.e.o7;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
public final class i1 extends o7<i1, a> implements d9 {
    private static final i1 zzj;
    private static volatile j9<i1> zzk;
    private int zzc;
    private long zzf;
    private float zzg;
    private double zzh;
    private String zzd = "";
    private String zze = "";
    private x7<i1> zzi = o7.x();

    /* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends o7.b<i1, a> implements d9 {
        private a() {
            super(i1.zzj);
        }

        public final a A() {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((i1) this.f14741f).i0();
            return this;
        }

        public final a q() {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((i1) this.f14741f).e0();
            return this;
        }

        public final a r(double d2) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((i1) this.f14741f).y(d2);
            return this;
        }

        public final a s(long j2) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((i1) this.f14741f).z(j2);
            return this;
        }

        public final a t(a aVar) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((i1) this.f14741f).S((i1) ((o7) aVar.zzy()));
            return this;
        }

        public final a u(Iterable<? extends i1> iterable) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((i1) this.f14741f).G(iterable);
            return this;
        }

        public final a v(String str) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((i1) this.f14741f).H(str);
            return this;
        }

        public final a w() {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((i1) this.f14741f).f0();
            return this;
        }

        public final a x(String str) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((i1) this.f14741f).M(str);
            return this;
        }

        public final a y() {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((i1) this.f14741f).g0();
            return this;
        }

        public final int z() {
            return ((i1) this.f14741f).a0();
        }

        /* synthetic */ a(q1 q1Var) {
            this();
        }
    }

    static {
        i1 i1Var = new i1();
        zzj = i1Var;
        o7.r(i1.class, i1Var);
    }

    private i1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(Iterable<? extends i1> iterable) {
        h0();
        x5.h(iterable, this.zzi);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(i1 i1Var) {
        i1Var.getClass();
        h0();
        this.zzi.add(i1Var);
    }

    public static a c0() {
        return zzj.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e0() {
        this.zzc &= -3;
        this.zze = zzj.zze;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0() {
        this.zzc &= -5;
        this.zzf = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0() {
        this.zzc &= -17;
        this.zzh = 0.0d;
    }

    private final void h0() {
        x7<i1> x7Var = this.zzi;
        if (x7Var.zza()) {
            return;
        }
        this.zzi = o7.m(x7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0() {
        this.zzi = o7.x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(double d2) {
        this.zzc |= 16;
        this.zzh = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(long j2) {
        this.zzc |= 4;
        this.zzf = j2;
    }

    public final boolean I() {
        return (this.zzc & 1) != 0;
    }

    public final String J() {
        return this.zzd;
    }

    public final boolean O() {
        return (this.zzc & 2) != 0;
    }

    public final String P() {
        return this.zze;
    }

    public final boolean T() {
        return (this.zzc & 4) != 0;
    }

    public final long U() {
        return this.zzf;
    }

    public final boolean V() {
        return (this.zzc & 8) != 0;
    }

    public final float W() {
        return this.zzg;
    }

    public final boolean X() {
        return (this.zzc & 16) != 0;
    }

    public final double Y() {
        return this.zzh;
    }

    public final List<i1> Z() {
        return this.zzi;
    }

    public final int a0() {
        return this.zzi.size();
    }

    @Override // e.c.b.b.c.e.o7
    protected final Object o(int i2, Object obj, Object obj2) {
        q1 q1Var = null;
        switch (q1.a[i2 - 1]) {
            case 1:
                return new i1();
            case 2:
                return new a(q1Var);
            case 3:
                return o7.p(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", i1.class});
            case 4:
                return zzj;
            case 5:
                j9<i1> aVar = zzk;
                if (aVar == null) {
                    synchronized (i1.class) {
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