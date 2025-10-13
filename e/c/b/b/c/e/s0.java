package e.c.b.b.c.e;

import e.c.b.b.c.e.o7;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
public final class s0 extends o7<s0, a> implements d9 {
    private static final s0 zzj;
    private static volatile j9<s0> zzk;
    private int zzc;
    private int zzd;
    private String zze = "";
    private q0 zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    /* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends o7.b<s0, a> implements d9 {
        private a() {
            super(s0.zzj);
        }

        public final a q(String str) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((s0) this.f14741f).z(str);
            return this;
        }

        /* synthetic */ a(u0 u0Var) {
            this();
        }
    }

    static {
        s0 s0Var = new s0();
        zzj = s0Var;
        o7.r(s0.class, s0Var);
    }

    private s0() {
    }

    public static a I() {
        return zzj.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    public final boolean A() {
        return (this.zzc & 1) != 0;
    }

    public final int B() {
        return this.zzd;
    }

    public final String C() {
        return this.zze;
    }

    public final q0 D() {
        q0 q0Var = this.zzf;
        return q0Var == null ? q0.I() : q0Var;
    }

    public final boolean E() {
        return this.zzg;
    }

    public final boolean F() {
        return this.zzh;
    }

    public final boolean G() {
        return (this.zzc & 32) != 0;
    }

    public final boolean H() {
        return this.zzi;
    }

    @Override // e.c.b.b.c.e.o7
    protected final Object o(int i2, Object obj, Object obj2) {
        u0 u0Var = null;
        switch (u0.a[i2 - 1]) {
            case 1:
                return new s0();
            case 2:
                return new a(u0Var);
            case 3:
                return o7.p(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                j9<s0> aVar = zzk;
                if (aVar == null) {
                    synchronized (s0.class) {
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