package e.c.b.b.c.e;

import e.c.b.b.c.e.k1;
import e.c.b.b.c.e.o7;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
public final class j1 extends o7<j1, a> implements d9 {
    private static final j1 zzd;
    private static volatile j9<j1> zze;
    private x7<k1> zzc = o7.x();

    /* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends o7.b<j1, a> implements d9 {
        private a() {
            super(j1.zzd);
        }

        public final a q(k1.a aVar) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((j1) this.f14741f).B((k1) ((o7) aVar.zzy()));
            return this;
        }

        public final k1 r(int i2) {
            return ((j1) this.f14741f).y(0);
        }

        /* synthetic */ a(q1 q1Var) {
            this();
        }
    }

    static {
        j1 j1Var = new j1();
        zzd = j1Var;
        o7.r(j1.class, j1Var);
    }

    private j1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(k1 k1Var) {
        k1Var.getClass();
        x7<k1> x7Var = this.zzc;
        if (!x7Var.zza()) {
            this.zzc = o7.m(x7Var);
        }
        this.zzc.add(k1Var);
    }

    public static a C() {
        return zzd.t();
    }

    @Override // e.c.b.b.c.e.o7
    protected final Object o(int i2, Object obj, Object obj2) {
        q1 q1Var = null;
        switch (q1.a[i2 - 1]) {
            case 1:
                return new j1();
            case 2:
                return new a(q1Var);
            case 3:
                return o7.p(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", k1.class});
            case 4:
                return zzd;
            case 5:
                j9<j1> aVar = zze;
                if (aVar == null) {
                    synchronized (j1.class) {
                        aVar = zze;
                        if (aVar == null) {
                            aVar = new o7.a<>(zzd);
                            zze = aVar;
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

    public final k1 y(int i2) {
        return this.zzc.get(0);
    }

    public final List<k1> z() {
        return this.zzc;
    }
}