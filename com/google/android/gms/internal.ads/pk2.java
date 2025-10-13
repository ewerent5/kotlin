package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class pk2<T> implements dl2<T> {
    private final lk2 a;

    /* renamed from: b, reason: collision with root package name */
    private final rl2<?, ?> f8181b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f8182c;

    /* renamed from: d, reason: collision with root package name */
    private final ri2<?> f8183d;

    private pk2(rl2<?, ?> rl2Var, ri2<?> ri2Var, lk2 lk2Var) {
        this.f8181b = rl2Var;
        this.f8182c = ri2Var.a(lk2Var);
        this.f8183d = ri2Var;
        this.a = lk2Var;
    }

    static <T> pk2<T> a(rl2<?, ?> rl2Var, ri2<?> ri2Var, lk2 lk2Var) {
        return new pk2<>(rl2Var, ri2Var, lk2Var);
    }

    @Override // com.google.android.gms.internal.ads.dl2
    public final int b(T t) {
        int iHashCode = this.f8181b.j(t).hashCode();
        if (!this.f8182c) {
            return iHashCode;
        }
        this.f8183d.b(t);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.dl2
    public final int c(T t) {
        rl2<?, ?> rl2Var = this.f8181b;
        int iP = rl2Var.p(rl2Var.j(t));
        if (!this.f8182c) {
            return iP;
        }
        this.f8183d.b(t);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.dl2
    public final boolean e(T t, T t2) {
        if (!this.f8181b.j(t).equals(this.f8181b.j(t2))) {
            return false;
        }
        if (!this.f8182c) {
            return true;
        }
        this.f8183d.b(t);
        this.f8183d.b(t2);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.dl2
    public final void f(T t, wk2 wk2Var, qi2 qi2Var) {
        boolean zZzd;
        rl2<?, ?> rl2Var = this.f8181b;
        ri2<?> ri2Var = this.f8183d;
        Object objK = rl2Var.k(t);
        vi2<T> vi2VarC = ri2Var.c(t);
        while (wk2Var.zzb() != Integer.MAX_VALUE) {
            try {
                int iZzc = wk2Var.zzc();
                if (iZzc != 11) {
                    if ((iZzc & 7) == 2) {
                        Object objF = ri2Var.f(qi2Var, this.a, iZzc >>> 3);
                        if (objF != null) {
                            ri2Var.g(wk2Var, objF, qi2Var, vi2VarC);
                        } else {
                            zZzd = rl2Var.n(objK, wk2Var);
                        }
                    } else {
                        zZzd = wk2Var.zzd();
                    }
                    if (!zZzd) {
                        return;
                    }
                } else {
                    int iZzr = 0;
                    Object objF2 = null;
                    ci2 ci2VarZzq = null;
                    while (wk2Var.zzb() != Integer.MAX_VALUE) {
                        int iZzc2 = wk2Var.zzc();
                        if (iZzc2 == 16) {
                            iZzr = wk2Var.zzr();
                            objF2 = ri2Var.f(qi2Var, this.a, iZzr);
                        } else if (iZzc2 == 26) {
                            if (objF2 != null) {
                                ri2Var.g(wk2Var, objF2, qi2Var, vi2VarC);
                            } else {
                                ci2VarZzq = wk2Var.zzq();
                            }
                        } else if (!wk2Var.zzd()) {
                            break;
                        }
                    }
                    if (wk2Var.zzc() != 12) {
                        throw qj2.f();
                    }
                    if (ci2VarZzq != null) {
                        if (objF2 != null) {
                            ri2Var.h(ci2VarZzq, objF2, qi2Var, vi2VarC);
                        } else {
                            rl2Var.e(objK, iZzr, ci2VarZzq);
                        }
                    }
                }
            } finally {
                rl2Var.l(t, objK);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.dl2
    public final void g(T t, T t2) {
        fl2.f(this.f8181b, t, t2);
        if (this.f8182c) {
            fl2.e(this.f8183d, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.ads.dl2
    public final void h(T t, mi2 mi2Var) {
        this.f8183d.b(t);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.dl2
    public final boolean i(T t) {
        this.f8183d.b(t);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.dl2
    public final void j(T t) {
        this.f8181b.m(t);
        this.f8183d.d(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.dl2
    public final void k(T t, byte[] bArr, int i2, int i3, oh2 oh2Var) {
        ej2 ej2Var = (ej2) t;
        if (ej2Var.zzc == sl2.a()) {
            ej2Var.zzc = sl2.b();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.dl2
    public final T zza() {
        return (T) this.a.e().G0();
    }
}