package e.c.b.b.c.e;

import e.c.b.b.c.e.o7;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
public final class p0 extends o7<p0, a> implements d9 {
    private static final p0 zzl;
    private static volatile j9<p0> zzm;
    private int zzc;
    private int zzd;
    private String zze = "";
    private x7<q0> zzf = o7.x();
    private boolean zzg;
    private r0 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    /* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends o7.b<p0, a> implements d9 {
        private a() {
            super(p0.zzl);
        }

        public final a q(int i2, q0 q0Var) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((p0) this.f14741f).z(i2, q0Var);
            return this;
        }

        public final a r(String str) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((p0) this.f14741f).C(str);
            return this;
        }

        public final q0 s(int i2) {
            return ((p0) this.f14741f).y(i2);
        }

        public final String t() {
            return ((p0) this.f14741f).F();
        }

        public final int u() {
            return ((p0) this.f14741f).H();
        }

        /* synthetic */ a(u0 u0Var) {
            this();
        }
    }

    static {
        p0 p0Var = new p0();
        zzl = p0Var;
        o7.r(p0.class, p0Var);
    }

    private p0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    public static a O() {
        return zzl.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(int i2, q0 q0Var) {
        q0Var.getClass();
        x7<q0> x7Var = this.zzf;
        if (!x7Var.zza()) {
            this.zzf = o7.m(x7Var);
        }
        this.zzf.set(i2, q0Var);
    }

    public final boolean D() {
        return (this.zzc & 1) != 0;
    }

    public final int E() {
        return this.zzd;
    }

    public final String F() {
        return this.zze;
    }

    public final List<q0> G() {
        return this.zzf;
    }

    public final int H() {
        return this.zzf.size();
    }

    public final boolean I() {
        return (this.zzc & 8) != 0;
    }

    public final r0 J() {
        r0 r0Var = this.zzh;
        return r0Var == null ? r0.I() : r0Var;
    }

    public final boolean K() {
        return this.zzi;
    }

    public final boolean L() {
        return this.zzj;
    }

    public final boolean M() {
        return (this.zzc & 64) != 0;
    }

    public final boolean N() {
        return this.zzk;
    }

    @Override // e.c.b.b.c.e.o7
    protected final Object o(int i2, Object obj, Object obj2) {
        u0 u0Var = null;
        switch (u0.a[i2 - 1]) {
            case 1:
                return new p0();
            case 2:
                return new a(u0Var);
            case 3:
                return o7.p(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzc", "zzd", "zze", "zzf", q0.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzl;
            case 5:
                j9<p0> aVar = zzm;
                if (aVar == null) {
                    synchronized (p0.class) {
                        aVar = zzm;
                        if (aVar == null) {
                            aVar = new o7.a<>(zzl);
                            zzm = aVar;
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

    public final q0 y(int i2) {
        return this.zzf.get(i2);
    }
}