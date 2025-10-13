package e.c.b.b.c.e;

import e.c.b.b.c.e.o7;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
public final class m1 extends o7<m1, a> implements d9 {
    private static final m1 zzg;
    private static volatile j9<m1> zzh;
    private y7 zzc = o7.w();
    private y7 zzd = o7.w();
    private x7<f1> zze = o7.x();
    private x7<n1> zzf = o7.x();

    /* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends o7.b<m1, a> implements d9 {
        private a() {
            super(m1.zzg);
        }

        public final a q() {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((m1) this.f14741f).a0();
            return this;
        }

        public final a r(int i2) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((m1) this.f14741f).O(i2);
            return this;
        }

        public final a s(Iterable<? extends Long> iterable) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((m1) this.f14741f).D(iterable);
            return this;
        }

        public final a t() {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((m1) this.f14741f).c0();
            return this;
        }

        public final a u(int i2) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((m1) this.f14741f).T(i2);
            return this;
        }

        public final a v(Iterable<? extends Long> iterable) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((m1) this.f14741f).J(iterable);
            return this;
        }

        public final a w(Iterable<? extends f1> iterable) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((m1) this.f14741f).M(iterable);
            return this;
        }

        public final a x(Iterable<? extends n1> iterable) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((m1) this.f14741f).Q(iterable);
            return this;
        }

        /* synthetic */ a(q1 q1Var) {
            this();
        }
    }

    static {
        m1 m1Var = new m1();
        zzg = m1Var;
        o7.r(m1.class, m1Var);
    }

    private m1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(Iterable<? extends Long> iterable) {
        y7 y7Var = this.zzc;
        if (!y7Var.zza()) {
            this.zzc = o7.n(y7Var);
        }
        x5.h(iterable, this.zzc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(Iterable<? extends Long> iterable) {
        y7 y7Var = this.zzd;
        if (!y7Var.zza()) {
            this.zzd = o7.n(y7Var);
        }
        x5.h(iterable, this.zzd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(Iterable<? extends f1> iterable) {
        d0();
        x5.h(iterable, this.zze);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(int i2) {
        d0();
        this.zze.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(Iterable<? extends n1> iterable) {
        e0();
        x5.h(iterable, this.zzf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(int i2) {
        e0();
        this.zzf.remove(i2);
    }

    public static a X() {
        return zzg.t();
    }

    public static m1 Y() {
        return zzg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0() {
        this.zzc = o7.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0() {
        this.zzd = o7.w();
    }

    private final void d0() {
        x7<f1> x7Var = this.zze;
        if (x7Var.zza()) {
            return;
        }
        this.zze = o7.m(x7Var);
    }

    private final void e0() {
        x7<n1> x7Var = this.zzf;
        if (x7Var.zza()) {
            return;
        }
        this.zzf = o7.m(x7Var);
    }

    public final int E() {
        return this.zzc.size();
    }

    public final n1 F(int i2) {
        return this.zzf.get(i2);
    }

    public final List<Long> K() {
        return this.zzd;
    }

    public final int N() {
        return this.zzd.size();
    }

    public final List<f1> S() {
        return this.zze;
    }

    public final int U() {
        return this.zze.size();
    }

    public final List<n1> V() {
        return this.zzf;
    }

    public final int W() {
        return this.zzf.size();
    }

    @Override // e.c.b.b.c.e.o7
    protected final Object o(int i2, Object obj, Object obj2) {
        q1 q1Var = null;
        switch (q1.a[i2 - 1]) {
            case 1:
                return new m1();
            case 2:
                return new a(q1Var);
            case 3:
                return o7.p(zzg, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzc", "zzd", "zze", f1.class, "zzf", n1.class});
            case 4:
                return zzg;
            case 5:
                j9<m1> aVar = zzh;
                if (aVar == null) {
                    synchronized (m1.class) {
                        aVar = zzh;
                        if (aVar == null) {
                            aVar = new o7.a<>(zzg);
                            zzh = aVar;
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

    public final f1 y(int i2) {
        return this.zze.get(i2);
    }

    public final List<Long> z() {
        return this.zzc;
    }
}