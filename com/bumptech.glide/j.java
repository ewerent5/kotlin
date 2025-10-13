package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: RequestBuilder.java */
/* loaded from: classes.dex */
public class j<TranscodeType> extends com.bumptech.glide.r.a<j<TranscodeType>> implements Cloneable {
    protected static final com.bumptech.glide.r.f E = new com.bumptech.glide.r.f().f(com.bumptech.glide.load.n.j.f3777c).S(g.LOW).Z(true);
    private final Context F;
    private final k G;
    private final Class<TranscodeType> H;
    private final b I;
    private final d J;
    private l<?, ? super TranscodeType> K;
    private Object L;
    private List<com.bumptech.glide.r.e<TranscodeType>> M;
    private j<TranscodeType> N;
    private j<TranscodeType> O;
    private Float P;
    private boolean Q = true;
    private boolean R;
    private boolean S;

    /* compiled from: RequestBuilder.java */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* renamed from: b */
        static final /* synthetic */ int[] f3563b;

        static {
            int[] iArr = new int[g.values().length];
            f3563b = iArr;
            try {
                iArr[g.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3563b[g.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3563b[g.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3563b[g.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    @SuppressLint({"CheckResult"})
    protected j(b bVar, k kVar, Class<TranscodeType> cls, Context context) {
        this.I = bVar;
        this.G = kVar;
        this.H = cls;
        this.F = context;
        this.K = kVar.q(cls);
        this.J = bVar.i();
        n0(kVar.o());
        a(kVar.p());
    }

    private com.bumptech.glide.r.c i0(com.bumptech.glide.r.j.h<TranscodeType> hVar, com.bumptech.glide.r.e<TranscodeType> eVar, com.bumptech.glide.r.a<?> aVar, Executor executor) {
        return j0(new Object(), hVar, eVar, null, this.K, aVar.s(), aVar.p(), aVar.o(), aVar, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private com.bumptech.glide.r.c j0(Object obj, com.bumptech.glide.r.j.h<TranscodeType> hVar, com.bumptech.glide.r.e<TranscodeType> eVar, com.bumptech.glide.r.d dVar, l<?, ? super TranscodeType> lVar, g gVar, int i2, int i3, com.bumptech.glide.r.a<?> aVar, Executor executor) {
        com.bumptech.glide.r.d dVar2;
        com.bumptech.glide.r.d bVar;
        if (this.O != null) {
            bVar = new com.bumptech.glide.r.b(obj, dVar);
            dVar2 = bVar;
        } else {
            dVar2 = null;
            bVar = dVar;
        }
        com.bumptech.glide.r.c cVarK0 = k0(obj, hVar, eVar, bVar, lVar, gVar, i2, i3, aVar, executor);
        if (dVar2 == null) {
            return cVarK0;
        }
        int iP = this.O.p();
        int iO = this.O.o();
        if (com.bumptech.glide.t.k.s(i2, i3) && !this.O.J()) {
            iP = aVar.p();
            iO = aVar.o();
        }
        j<TranscodeType> jVar = this.O;
        com.bumptech.glide.r.b bVar2 = dVar2;
        bVar2.q(cVarK0, jVar.j0(obj, hVar, eVar, bVar2, jVar.K, jVar.s(), iP, iO, this.O, executor));
        return bVar2;
    }

    private com.bumptech.glide.r.c k0(Object obj, com.bumptech.glide.r.j.h<TranscodeType> hVar, com.bumptech.glide.r.e<TranscodeType> eVar, com.bumptech.glide.r.d dVar, l<?, ? super TranscodeType> lVar, g gVar, int i2, int i3, com.bumptech.glide.r.a<?> aVar, Executor executor) {
        j<TranscodeType> jVar = this.N;
        if (jVar == null) {
            if (this.P == null) {
                return w0(obj, hVar, eVar, aVar, dVar, lVar, gVar, i2, i3, executor);
            }
            com.bumptech.glide.r.i iVar = new com.bumptech.glide.r.i(obj, dVar);
            iVar.p(w0(obj, hVar, eVar, aVar, iVar, lVar, gVar, i2, i3, executor), w0(obj, hVar, eVar, aVar.d().Y(this.P.floatValue()), iVar, lVar, m0(gVar), i2, i3, executor));
            return iVar;
        }
        if (this.S) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        l<?, ? super TranscodeType> lVar2 = jVar.Q ? lVar : jVar.K;
        g gVarS = jVar.C() ? this.N.s() : m0(gVar);
        int iP = this.N.p();
        int iO = this.N.o();
        if (com.bumptech.glide.t.k.s(i2, i3) && !this.N.J()) {
            iP = aVar.p();
            iO = aVar.o();
        }
        com.bumptech.glide.r.i iVar2 = new com.bumptech.glide.r.i(obj, dVar);
        com.bumptech.glide.r.c cVarW0 = w0(obj, hVar, eVar, aVar, iVar2, lVar, gVar, i2, i3, executor);
        this.S = true;
        j<TranscodeType> jVar2 = this.N;
        com.bumptech.glide.r.c cVarJ0 = jVar2.j0(obj, hVar, eVar, iVar2, lVar2, gVarS, iP, iO, jVar2, executor);
        this.S = false;
        iVar2.p(cVarW0, cVarJ0);
        return iVar2;
    }

    private g m0(g gVar) {
        int i2 = a.f3563b[gVar.ordinal()];
        if (i2 == 1) {
            return g.NORMAL;
        }
        if (i2 == 2) {
            return g.HIGH;
        }
        if (i2 == 3 || i2 == 4) {
            return g.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + s());
    }

    @SuppressLint({"CheckResult"})
    private void n0(List<com.bumptech.glide.r.e<Object>> list) {
        Iterator<com.bumptech.glide.r.e<Object>> it = list.iterator();
        while (it.hasNext()) {
            g0((com.bumptech.glide.r.e) it.next());
        }
    }

    private <Y extends com.bumptech.glide.r.j.h<TranscodeType>> Y p0(Y y, com.bumptech.glide.r.e<TranscodeType> eVar, com.bumptech.glide.r.a<?> aVar, Executor executor) {
        com.bumptech.glide.t.j.d(y);
        if (!this.R) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        com.bumptech.glide.r.c cVarI0 = i0(y, eVar, aVar, executor);
        com.bumptech.glide.r.c cVarF = y.f();
        if (cVarI0.d(cVarF) && !s0(aVar, cVarF)) {
            if (!((com.bumptech.glide.r.c) com.bumptech.glide.t.j.d(cVarF)).isRunning()) {
                cVarF.i();
            }
            return y;
        }
        this.G.n(y);
        y.c(cVarI0);
        this.G.x(y, cVarI0);
        return y;
    }

    private boolean s0(com.bumptech.glide.r.a<?> aVar, com.bumptech.glide.r.c cVar) {
        return !aVar.B() && cVar.k();
    }

    private j<TranscodeType> v0(Object obj) {
        if (A()) {
            return clone().v0(obj);
        }
        this.L = obj;
        this.R = true;
        return V();
    }

    private com.bumptech.glide.r.c w0(Object obj, com.bumptech.glide.r.j.h<TranscodeType> hVar, com.bumptech.glide.r.e<TranscodeType> eVar, com.bumptech.glide.r.a<?> aVar, com.bumptech.glide.r.d dVar, l<?, ? super TranscodeType> lVar, g gVar, int i2, int i3, Executor executor) {
        Context context = this.F;
        d dVar2 = this.J;
        return com.bumptech.glide.r.h.y(context, dVar2, obj, this.L, this.H, aVar, i2, i3, gVar, hVar, eVar, this.M, dVar, dVar2.f(), lVar.b(), executor);
    }

    public j<TranscodeType> g0(com.bumptech.glide.r.e<TranscodeType> eVar) {
        if (A()) {
            return clone().g0(eVar);
        }
        if (eVar != null) {
            if (this.M == null) {
                this.M = new ArrayList();
            }
            this.M.add(eVar);
        }
        return V();
    }

    @Override // com.bumptech.glide.r.a
    /* renamed from: h0 */
    public j<TranscodeType> a(com.bumptech.glide.r.a<?> aVar) {
        com.bumptech.glide.t.j.d(aVar);
        return (j) super.a(aVar);
    }

    @Override // com.bumptech.glide.r.a
    /* renamed from: l0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public j<TranscodeType> d() {
        j<TranscodeType> jVar = (j) super.d();
        jVar.K = jVar.K.clone();
        if (jVar.M != null) {
            jVar.M = new ArrayList(jVar.M);
        }
        j<TranscodeType> jVar2 = jVar.N;
        if (jVar2 != null) {
            jVar.N = jVar2.clone();
        }
        j<TranscodeType> jVar3 = jVar.O;
        if (jVar3 != null) {
            jVar.O = jVar3.clone();
        }
        return jVar;
    }

    public <Y extends com.bumptech.glide.r.j.h<TranscodeType>> Y o0(Y y) {
        return (Y) q0(y, null, com.bumptech.glide.t.e.b());
    }

    <Y extends com.bumptech.glide.r.j.h<TranscodeType>> Y q0(Y y, com.bumptech.glide.r.e<TranscodeType> eVar, Executor executor) {
        return (Y) p0(y, eVar, this, executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bumptech.glide.r.j.i<android.widget.ImageView, TranscodeType> r0(android.widget.ImageView r4) {
        /*
            r3 = this;
            com.bumptech.glide.t.k.a()
            com.bumptech.glide.t.j.d(r4)
            boolean r0 = r3.I()
            if (r0 != 0) goto L4c
            boolean r0 = r3.G()
            if (r0 == 0) goto L4c
            android.widget.ImageView$ScaleType r0 = r4.getScaleType()
            if (r0 == 0) goto L4c
            int[] r0 = com.bumptech.glide.j.a.a
            android.widget.ImageView$ScaleType r1 = r4.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L43;
                case 2: goto L3a;
                case 3: goto L31;
                case 4: goto L31;
                case 5: goto L31;
                case 6: goto L28;
                default: goto L27;
            }
        L27:
            goto L4c
        L28:
            com.bumptech.glide.r.a r0 = r3.d()
            com.bumptech.glide.r.a r0 = r0.N()
            goto L4d
        L31:
            com.bumptech.glide.r.a r0 = r3.d()
            com.bumptech.glide.r.a r0 = r0.O()
            goto L4d
        L3a:
            com.bumptech.glide.r.a r0 = r3.d()
            com.bumptech.glide.r.a r0 = r0.N()
            goto L4d
        L43:
            com.bumptech.glide.r.a r0 = r3.d()
            com.bumptech.glide.r.a r0 = r0.M()
            goto L4d
        L4c:
            r0 = r3
        L4d:
            com.bumptech.glide.d r1 = r3.J
            java.lang.Class<TranscodeType> r2 = r3.H
            com.bumptech.glide.r.j.i r4 = r1.a(r4, r2)
            r1 = 0
            java.util.concurrent.Executor r2 = com.bumptech.glide.t.e.b()
            com.bumptech.glide.r.j.h r4 = r3.p0(r4, r1, r0, r2)
            com.bumptech.glide.r.j.i r4 = (com.bumptech.glide.r.j.i) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.j.r0(android.widget.ImageView):com.bumptech.glide.r.j.i");
    }

    public j<TranscodeType> t0(Object obj) {
        return v0(obj);
    }

    public j<TranscodeType> u0(String str) {
        return v0(str);
    }
}