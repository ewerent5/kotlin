package e.c.b.b.c.e;

import e.c.b.b.c.e.o7;
import e.c.b.b.c.e.p0;
import e.c.b.b.c.e.s0;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
public final class o0 extends o7<o0, a> implements d9 {
    private static final o0 zzi;
    private static volatile j9<o0> zzj;
    private int zzc;
    private int zzd;
    private x7<s0> zze = o7.x();
    private x7<p0> zzf = o7.x();
    private boolean zzg;
    private boolean zzh;

    /* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends o7.b<o0, a> implements d9 {
        private a() {
            super(o0.zzi);
        }

        public final int q() {
            return ((o0) this.f14741f).H();
        }

        public final a r(int i2, p0.a aVar) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((o0) this.f14741f).z(i2, (p0) ((o7) aVar.zzy()));
            return this;
        }

        public final a s(int i2, s0.a aVar) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            ((o0) this.f14741f).A(i2, (s0) ((o7) aVar.zzy()));
            return this;
        }

        public final s0 t(int i2) {
            return ((o0) this.f14741f).y(i2);
        }

        public final int u() {
            return ((o0) this.f14741f).J();
        }

        public final p0 v(int i2) {
            return ((o0) this.f14741f).F(i2);
        }

        /* synthetic */ a(u0 u0Var) {
            this();
        }
    }

    static {
        o0 o0Var = new o0();
        zzi = o0Var;
        o7.r(o0.class, o0Var);
    }

    private o0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(int i2, s0 s0Var) {
        s0Var.getClass();
        x7<s0> x7Var = this.zze;
        if (!x7Var.zza()) {
            this.zze = o7.m(x7Var);
        }
        this.zze.set(i2, s0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(int i2, p0 p0Var) {
        p0Var.getClass();
        x7<p0> x7Var = this.zzf;
        if (!x7Var.zza()) {
            this.zzf = o7.m(x7Var);
        }
        this.zzf.set(i2, p0Var);
    }

    public final boolean D() {
        return (this.zzc & 1) != 0;
    }

    public final int E() {
        return this.zzd;
    }

    public final p0 F(int i2) {
        return this.zzf.get(i2);
    }

    public final List<s0> G() {
        return this.zze;
    }

    public final int H() {
        return this.zze.size();
    }

    public final List<p0> I() {
        return this.zzf;
    }

    public final int J() {
        return this.zzf.size();
    }

    @Override // e.c.b.b.c.e.o7
    protected final Object o(int i2, Object obj, Object obj2) {
        u0 u0Var = null;
        switch (u0.a[i2 - 1]) {
            case 1:
                return new o0();
            case 2:
                return new a(u0Var);
            case 3:
                return o7.p(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzc", "zzd", "zze", s0.class, "zzf", p0.class, "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                j9<o0> aVar = zzj;
                if (aVar == null) {
                    synchronized (o0.class) {
                        aVar = zzj;
                        if (aVar == null) {
                            aVar = new o7.a<>(zzi);
                            zzj = aVar;
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

    public final s0 y(int i2) {
        return this.zze.get(i2);
    }
}