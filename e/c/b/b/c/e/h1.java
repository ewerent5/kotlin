package e.c.b.b.c.e;

import e.c.b.b.c.e.o7;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
public final class h1 extends o7<h1, a> implements d9 {
    private static final h1 zzf;
    private static volatile j9<h1> zzg;
    private int zzc;
    private String zzd = "";
    private long zze;

    /* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends o7.b<h1, a> implements d9 {
        private a() {
            super(h1.zzf);
        }

        public final a q(long j2) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((h1) this.f14741f).z(j2);
            return this;
        }

        public final a r(String str) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((h1) this.f14741f).C(str);
            return this;
        }

        /* synthetic */ a(q1 q1Var) {
            this();
        }
    }

    static {
        h1 h1Var = new h1();
        zzf = h1Var;
        o7.r(h1.class, h1Var);
    }

    private h1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }

    public static a y() {
        return zzf.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(long j2) {
        this.zzc |= 2;
        this.zze = j2;
    }

    @Override // e.c.b.b.c.e.o7
    protected final Object o(int i2, Object obj, Object obj2) {
        q1 q1Var = null;
        switch (q1.a[i2 - 1]) {
            case 1:
                return new h1();
            case 2:
                return new a(q1Var);
            case 3:
                return o7.p(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                j9<h1> aVar = zzg;
                if (aVar == null) {
                    synchronized (h1.class) {
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