package e.c.b.b.c.e;

import e.c.b.b.c.e.h1;
import e.c.b.b.c.e.o7;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
public final class l1 extends o7<l1, a> implements d9 {
    private static final l1 zzf;
    private static volatile j9<l1> zzg;
    private int zzc;
    private int zzd = 1;
    private x7<h1> zze = o7.x();

    /* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends o7.b<l1, a> implements d9 {
        private a() {
            super(l1.zzf);
        }

        public final a q(h1.a aVar) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((l1) this.f14741f).z((h1) ((o7) aVar.zzy()));
            return this;
        }

        /* synthetic */ a(q1 q1Var) {
            this();
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public enum b implements u7 {
        RADS(1),
        PROVISIONING(2);


        /* renamed from: g, reason: collision with root package name */
        private static final t7<b> f14686g = new t1();

        /* renamed from: i, reason: collision with root package name */
        private final int f14688i;

        b(int i2) {
            this.f14688i = i2;
        }

        public static b a(int i2) {
            if (i2 == 1) {
                return RADS;
            }
            if (i2 != 2) {
                return null;
            }
            return PROVISIONING;
        }

        public static w7 b() {
            return u1.a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f14688i + " name=" + name() + '>';
        }

        @Override // e.c.b.b.c.e.u7
        public final int zza() {
            return this.f14688i;
        }
    }

    static {
        l1 l1Var = new l1();
        zzf = l1Var;
        o7.r(l1.class, l1Var);
    }

    private l1() {
    }

    public static a y() {
        return zzf.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(h1 h1Var) {
        h1Var.getClass();
        x7<h1> x7Var = this.zze;
        if (!x7Var.zza()) {
            this.zze = o7.m(x7Var);
        }
        this.zze.add(h1Var);
    }

    @Override // e.c.b.b.c.e.o7
    protected final Object o(int i2, Object obj, Object obj2) {
        q1 q1Var = null;
        switch (q1.a[i2 - 1]) {
            case 1:
                return new l1();
            case 2:
                return new a(q1Var);
            case 3:
                return o7.p(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zzc", "zzd", b.b(), "zze", h1.class});
            case 4:
                return zzf;
            case 5:
                j9<l1> aVar = zzg;
                if (aVar == null) {
                    synchronized (l1.class) {
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