package e.c.b.b.c.e;

import e.c.b.b.c.e.m1;
import e.c.b.b.c.e.o7;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
public final class e1 extends o7<e1, a> implements d9 {
    private static final e1 zzh;
    private static volatile j9<e1> zzi;
    private int zzc;
    private int zzd;
    private m1 zze;
    private m1 zzf;
    private boolean zzg;

    /* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends o7.b<e1, a> implements d9 {
        private a() {
            super(e1.zzh);
        }

        public final a q(int i2) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((e1) this.f14741f).y(i2);
            return this;
        }

        public final a r(m1.a aVar) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((e1) this.f14741f).C((m1) ((o7) aVar.zzy()));
            return this;
        }

        public final a s(m1 m1Var) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((e1) this.f14741f).H(m1Var);
            return this;
        }

        public final a t(boolean z) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((e1) this.f14741f).D(z);
            return this;
        }

        /* synthetic */ a(q1 q1Var) {
            this();
        }
    }

    static {
        e1 e1Var = new e1();
        zzh = e1Var;
        o7.r(e1.class, e1Var);
    }

    private e1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(m1 m1Var) {
        m1Var.getClass();
        this.zze = m1Var;
        this.zzc |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(boolean z) {
        this.zzc |= 8;
        this.zzg = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(m1 m1Var) {
        m1Var.getClass();
        this.zzf = m1Var;
        this.zzc |= 4;
    }

    public static a N() {
        return zzh.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(int i2) {
        this.zzc |= 1;
        this.zzd = i2;
    }

    public final boolean E() {
        return (this.zzc & 1) != 0;
    }

    public final int F() {
        return this.zzd;
    }

    public final m1 I() {
        m1 m1Var = this.zze;
        return m1Var == null ? m1.Y() : m1Var;
    }

    public final boolean J() {
        return (this.zzc & 4) != 0;
    }

    public final m1 K() {
        m1 m1Var = this.zzf;
        return m1Var == null ? m1.Y() : m1Var;
    }

    public final boolean L() {
        return (this.zzc & 8) != 0;
    }

    public final boolean M() {
        return this.zzg;
    }

    @Override // e.c.b.b.c.e.o7
    protected final Object o(int i2, Object obj, Object obj2) {
        q1 q1Var = null;
        switch (q1.a[i2 - 1]) {
            case 1:
                return new e1();
            case 2:
                return new a(q1Var);
            case 3:
                return o7.p(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                j9<e1> aVar = zzi;
                if (aVar == null) {
                    synchronized (e1.class) {
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