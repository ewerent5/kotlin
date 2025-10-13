package e.c.b.b.c.e;

import e.c.b.b.c.e.i1;
import e.c.b.b.c.e.o7;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
public final class g1 extends o7<g1, a> implements d9 {
    private static final g1 zzi;
    private static volatile j9<g1> zzj;
    private int zzc;
    private x7<i1> zzd = o7.x();
    private String zze = "";
    private long zzf;
    private long zzg;
    private int zzh;

    /* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends o7.b<g1, a> implements d9 {
        private a() {
            super(g1.zzi);
        }

        public final a A(int i2) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((g1) this.f14741f).N(i2);
            return this;
        }

        public final a B(long j2) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((g1) this.f14741f).O(j2);
            return this;
        }

        public final a C() {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((g1) this.f14741f).c0();
            return this;
        }

        public final String D() {
            return ((g1) this.f14741f).Q();
        }

        public final boolean E() {
            return ((g1) this.f14741f).S();
        }

        public final long F() {
            return ((g1) this.f14741f).T();
        }

        public final long G() {
            return ((g1) this.f14741f).V();
        }

        public final a q(int i2, i1.a aVar) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((g1) this.f14741f).A(i2, (i1) ((o7) aVar.zzy()));
            return this;
        }

        public final a r(int i2, i1 i1Var) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((g1) this.f14741f).A(i2, i1Var);
            return this;
        }

        public final a s(long j2) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((g1) this.f14741f).B(j2);
            return this;
        }

        public final a t(i1.a aVar) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((g1) this.f14741f).J((i1) ((o7) aVar.zzy()));
            return this;
        }

        public final a u(i1 i1Var) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((g1) this.f14741f).J(i1Var);
            return this;
        }

        public final a v(Iterable<? extends i1> iterable) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((g1) this.f14741f).K(iterable);
            return this;
        }

        public final a w(String str) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((g1) this.f14741f).L(str);
            return this;
        }

        public final i1 x(int i2) {
            return ((g1) this.f14741f).y(i2);
        }

        public final List<i1> y() {
            return Collections.unmodifiableList(((g1) this.f14741f).z());
        }

        public final int z() {
            return ((g1) this.f14741f).M();
        }

        /* synthetic */ a(q1 q1Var) {
            this();
        }
    }

    static {
        g1 g1Var = new g1();
        zzi = g1Var;
        o7.r(g1.class, g1Var);
    }

    private g1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(int i2, i1 i1Var) {
        i1Var.getClass();
        a0();
        this.zzd.set(i2, i1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(long j2) {
        this.zzc |= 2;
        this.zzf = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(i1 i1Var) {
        i1Var.getClass();
        a0();
        this.zzd.add(i1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(Iterable<? extends i1> iterable) {
        a0();
        x5.h(iterable, this.zzd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zze = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(int i2) {
        a0();
        this.zzd.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(long j2) {
        this.zzc |= 4;
        this.zzg = j2;
    }

    public static a Y() {
        return zzi.t();
    }

    private final void a0() {
        x7<i1> x7Var = this.zzd;
        if (x7Var.zza()) {
            return;
        }
        this.zzd = o7.m(x7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0() {
        this.zzd = o7.x();
    }

    public final int M() {
        return this.zzd.size();
    }

    public final String Q() {
        return this.zze;
    }

    public final boolean S() {
        return (this.zzc & 2) != 0;
    }

    public final long T() {
        return this.zzf;
    }

    public final boolean U() {
        return (this.zzc & 4) != 0;
    }

    public final long V() {
        return this.zzg;
    }

    public final boolean W() {
        return (this.zzc & 8) != 0;
    }

    public final int X() {
        return this.zzh;
    }

    @Override // e.c.b.b.c.e.o7
    protected final Object o(int i2, Object obj, Object obj2) {
        q1 q1Var = null;
        switch (q1.a[i2 - 1]) {
            case 1:
                return new g1();
            case 2:
                return new a(q1Var);
            case 3:
                return o7.p(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzc", "zzd", i1.class, "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                j9<g1> aVar = zzj;
                if (aVar == null) {
                    synchronized (g1.class) {
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

    public final i1 y(int i2) {
        return this.zzd.get(i2);
    }

    public final List<i1> z() {
        return this.zzd;
    }
}