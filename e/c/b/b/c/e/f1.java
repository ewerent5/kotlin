package e.c.b.b.c.e;

import e.c.b.b.c.e.o7;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
public final class f1 extends o7<f1, a> implements d9 {
    private static final f1 zzf;
    private static volatile j9<f1> zzg;
    private int zzc;
    private int zzd;
    private long zze;

    /* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends o7.b<f1, a> implements d9 {
        private a() {
            super(f1.zzf);
        }

        public final a q(int i2) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((f1) this.f14741f).y(i2);
            return this;
        }

        public final a r(long j2) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((f1) this.f14741f).z(j2);
            return this;
        }

        /* synthetic */ a(q1 q1Var) {
            this();
        }
    }

    static {
        f1 f1Var = new f1();
        zzf = f1Var;
        o7.r(f1.class, f1Var);
    }

    private f1() {
    }

    public static a G() {
        return zzf.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(int i2) {
        this.zzc |= 1;
        this.zzd = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(long j2) {
        this.zzc |= 2;
        this.zze = j2;
    }

    public final boolean C() {
        return (this.zzc & 1) != 0;
    }

    public final int D() {
        return this.zzd;
    }

    public final boolean E() {
        return (this.zzc & 2) != 0;
    }

    public final long F() {
        return this.zze;
    }

    @Override // e.c.b.b.c.e.o7
    protected final Object o(int i2, Object obj, Object obj2) {
        q1 q1Var = null;
        switch (q1.a[i2 - 1]) {
            case 1:
                return new f1();
            case 2:
                return new a(q1Var);
            case 3:
                return o7.p(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                j9<f1> aVar = zzg;
                if (aVar == null) {
                    synchronized (f1.class) {
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
}