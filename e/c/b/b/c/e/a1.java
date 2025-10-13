package e.c.b.b.c.e;

import e.c.b.b.c.e.o7;
import e.c.b.b.c.e.z0;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
public final class a1 extends o7<a1, a> implements d9 {
    private static final a1 zzm;
    private static volatile j9<a1> zzn;
    private int zzc;
    private long zzd;
    private int zzf;
    private boolean zzk;
    private String zze = "";
    private x7<b1> zzg = o7.x();
    private x7<z0> zzh = o7.x();
    private x7<o0> zzi = o7.x();
    private String zzj = "";
    private x7<x1> zzl = o7.x();

    /* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends o7.b<a1, a> implements d9 {
        private a() {
            super(a1.zzm);
        }

        public final int q() {
            return ((a1) this.f14741f).H();
        }

        public final z0 r(int i2) {
            return ((a1) this.f14741f).y(i2);
        }

        public final a s(int i2, z0.a aVar) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((a1) this.f14741f).z(i2, (z0) ((o7) aVar.zzy()));
            return this;
        }

        public final List<o0> t() {
            return Collections.unmodifiableList(((a1) this.f14741f).I());
        }

        public final a u() {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((a1) this.f14741f).N();
            return this;
        }

        /* synthetic */ a(d1 d1Var) {
            this();
        }
    }

    static {
        a1 a1Var = new a1();
        zzm = a1Var;
        o7.r(a1.class, a1Var);
    }

    private a1() {
    }

    public static a K() {
        return zzm.t();
    }

    public static a1 L() {
        return zzm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N() {
        this.zzi = o7.x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(int i2, z0 z0Var) {
        z0Var.getClass();
        x7<z0> x7Var = this.zzh;
        if (!x7Var.zza()) {
            this.zzh = o7.m(x7Var);
        }
        this.zzh.set(i2, z0Var);
    }

    public final boolean C() {
        return (this.zzc & 1) != 0;
    }

    public final long D() {
        return this.zzd;
    }

    public final boolean E() {
        return (this.zzc & 2) != 0;
    }

    public final String F() {
        return this.zze;
    }

    public final List<b1> G() {
        return this.zzg;
    }

    public final int H() {
        return this.zzh.size();
    }

    public final List<o0> I() {
        return this.zzi;
    }

    public final boolean J() {
        return this.zzk;
    }

    @Override // e.c.b.b.c.e.o7
    protected final Object o(int i2, Object obj, Object obj2) {
        d1 d1Var = null;
        switch (d1.a[i2 - 1]) {
            case 1:
                return new a1();
            case 2:
                return new a(d1Var);
            case 3:
                return o7.p(zzm, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0004\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", b1.class, "zzh", z0.class, "zzi", o0.class, "zzj", "zzk", "zzl", x1.class});
            case 4:
                return zzm;
            case 5:
                j9<a1> aVar = zzn;
                if (aVar == null) {
                    synchronized (a1.class) {
                        aVar = zzn;
                        if (aVar == null) {
                            aVar = new o7.a<>(zzm);
                            zzn = aVar;
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

    public final z0 y(int i2) {
        return this.zzh.get(i2);
    }
}