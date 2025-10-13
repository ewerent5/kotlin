package e.c.b.b.c.e;

import e.c.b.b.c.e.o7;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
public final class n1 extends o7<n1, a> implements d9 {
    private static final n1 zzf;
    private static volatile j9<n1> zzg;
    private int zzc;
    private int zzd;
    private y7 zze = o7.w();

    /* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends o7.b<n1, a> implements d9 {
        private a() {
            super(n1.zzf);
        }

        public final a q(int i2) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((n1) this.f14741f).E(i2);
            return this;
        }

        public final a r(Iterable<? extends Long> iterable) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((n1) this.f14741f).B(iterable);
            return this;
        }

        /* synthetic */ a(q1 q1Var) {
            this();
        }
    }

    static {
        n1 n1Var = new n1();
        zzf = n1Var;
        o7.r(n1.class, n1Var);
    }

    private n1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(Iterable<? extends Long> iterable) {
        y7 y7Var = this.zze;
        if (!y7Var.zza()) {
            this.zze = o7.n(y7Var);
        }
        x5.h(iterable, this.zze);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(int i2) {
        this.zzc |= 1;
        this.zzd = i2;
    }

    public static a H() {
        return zzf.t();
    }

    public final boolean C() {
        return (this.zzc & 1) != 0;
    }

    public final int D() {
        return this.zzd;
    }

    public final List<Long> F() {
        return this.zze;
    }

    public final int G() {
        return this.zze.size();
    }

    @Override // e.c.b.b.c.e.o7
    protected final Object o(int i2, Object obj, Object obj2) {
        q1 q1Var = null;
        switch (q1.a[i2 - 1]) {
            case 1:
                return new n1();
            case 2:
                return new a(q1Var);
            case 3:
                return o7.p(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                j9<n1> aVar = zzg;
                if (aVar == null) {
                    synchronized (n1.class) {
                        aVar = zzg;
                        if (aVar == null) {
                            aVar = new o7.a<>(zzf);
                            zzg = aVar;
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

    public final long y(int i2) {
        return this.zze.zzb(i2);
    }
}