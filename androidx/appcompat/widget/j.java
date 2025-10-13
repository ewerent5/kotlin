package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.m0;

/* compiled from: AppCompatDrawableManager.java */
/* loaded from: classes.dex */
public final class j {
    private static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    private static j f487b;

    /* renamed from: c, reason: collision with root package name */
    private m0 f488c;

    /* compiled from: AppCompatDrawableManager.java */
    class a implements m0.e {
        private final int[] a = {c.a.e.S, c.a.e.Q, c.a.e.a};

        /* renamed from: b, reason: collision with root package name */
        private final int[] f489b = {c.a.e.o, c.a.e.B, c.a.e.t, c.a.e.p, c.a.e.q, c.a.e.s, c.a.e.r};

        /* renamed from: c, reason: collision with root package name */
        private final int[] f490c = {c.a.e.P, c.a.e.R, c.a.e.f2480k, c.a.e.I, c.a.e.J, c.a.e.L, c.a.e.N, c.a.e.K, c.a.e.M, c.a.e.O};

        /* renamed from: d, reason: collision with root package name */
        private final int[] f491d = {c.a.e.w, c.a.e.f2478i, c.a.e.v};

        /* renamed from: e, reason: collision with root package name */
        private final int[] f492e = {c.a.e.H, c.a.e.T};

        /* renamed from: f, reason: collision with root package name */
        private final int[] f493f = {c.a.e.f2472c, c.a.e.f2476g, c.a.e.f2473d, c.a.e.f2477h};

        a() {
        }

        private boolean f(int[] iArr, int i2) {
            for (int i3 : iArr) {
                if (i3 == i2) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i2) {
            int iC = r0.c(context, c.a.a.v);
            return new ColorStateList(new int[][]{r0.f563b, r0.f566e, r0.f564c, r0.f570i}, new int[]{r0.b(context, c.a.a.t), c.h.d.a.b(iC, i2), c.h.d.a.b(iC, i2), i2});
        }

        private ColorStateList i(Context context) {
            return h(context, r0.c(context, c.a.a.s));
        }

        private ColorStateList j(Context context) {
            return h(context, r0.c(context, c.a.a.t));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i2 = c.a.a.x;
            ColorStateList colorStateListE = r0.e(context, i2);
            if (colorStateListE == null || !colorStateListE.isStateful()) {
                iArr[0] = r0.f563b;
                iArr2[0] = r0.b(context, i2);
                iArr[1] = r0.f567f;
                iArr2[1] = r0.c(context, c.a.a.u);
                iArr[2] = r0.f570i;
                iArr2[2] = r0.c(context, i2);
            } else {
                iArr[0] = r0.f563b;
                iArr2[0] = colorStateListE.getColorForState(iArr[0], 0);
                iArr[1] = r0.f567f;
                iArr2[1] = r0.c(context, c.a.a.u);
                iArr[2] = r0.f570i;
                iArr2[2] = colorStateListE.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private void l(Drawable drawable, int i2, PorterDuff.Mode mode) {
            if (e0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = j.a;
            }
            drawable.setColorFilter(j.e(i2, mode));
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0061 A[RETURN] */
        @Override // androidx.appcompat.widget.m0.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.j.a()
                int[] r1 = r6.a
                boolean r1 = r6.f(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L17
                int r2 = c.a.a.w
            L14:
                r8 = -1
            L15:
                r1 = 1
                goto L44
            L17:
                int[] r1 = r6.f490c
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L22
                int r2 = c.a.a.u
                goto L14
            L22:
                int[] r1 = r6.f491d
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L2d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L14
            L2d:
                int r1 = c.a.e.u
                if (r8 != r1) goto L3c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L15
            L3c:
                int r1 = c.a.e.f2481l
                if (r8 != r1) goto L41
                goto L14
            L41:
                r8 = -1
                r1 = 0
                r2 = 0
            L44:
                if (r1 == 0) goto L61
                boolean r1 = androidx.appcompat.widget.e0.a(r9)
                if (r1 == 0) goto L50
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L50:
                int r7 = androidx.appcompat.widget.r0.c(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.j.e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L60
                r9.setAlpha(r8)
            L60:
                return r5
            L61:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j.a.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.m0.e
        public PorterDuff.Mode b(int i2) {
            if (i2 == c.a.e.F) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.m0.e
        public Drawable c(m0 m0Var, Context context, int i2) {
            if (i2 == c.a.e.f2479j) {
                return new LayerDrawable(new Drawable[]{m0Var.j(context, c.a.e.f2478i), m0Var.j(context, c.a.e.f2480k)});
            }
            return null;
        }

        @Override // androidx.appcompat.widget.m0.e
        public ColorStateList d(Context context, int i2) {
            if (i2 == c.a.e.f2482m) {
                return c.a.k.a.a.c(context, c.a.c.f2456e);
            }
            if (i2 == c.a.e.G) {
                return c.a.k.a.a.c(context, c.a.c.f2459h);
            }
            if (i2 == c.a.e.F) {
                return k(context);
            }
            if (i2 == c.a.e.f2475f) {
                return j(context);
            }
            if (i2 == c.a.e.f2471b) {
                return g(context);
            }
            if (i2 == c.a.e.f2474e) {
                return i(context);
            }
            if (i2 == c.a.e.D || i2 == c.a.e.E) {
                return c.a.k.a.a.c(context, c.a.c.f2458g);
            }
            if (f(this.f489b, i2)) {
                return r0.e(context, c.a.a.w);
            }
            if (f(this.f492e, i2)) {
                return c.a.k.a.a.c(context, c.a.c.f2455d);
            }
            if (f(this.f493f, i2)) {
                return c.a.k.a.a.c(context, c.a.c.f2454c);
            }
            if (i2 == c.a.e.A) {
                return c.a.k.a.a.c(context, c.a.c.f2457f);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.m0.e
        public boolean e(Context context, int i2, Drawable drawable) {
            if (i2 == c.a.e.C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int i3 = c.a.a.w;
                l(drawableFindDrawableByLayerId, r0.c(context, i3), j.a);
                l(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), r0.c(context, i3), j.a);
                l(layerDrawable.findDrawableByLayerId(R.id.progress), r0.c(context, c.a.a.u), j.a);
                return true;
            }
            if (i2 != c.a.e.y && i2 != c.a.e.x && i2 != c.a.e.z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            l(layerDrawable2.findDrawableByLayerId(R.id.background), r0.b(context, c.a.a.w), j.a);
            Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
            int i4 = c.a.a.u;
            l(drawableFindDrawableByLayerId2, r0.c(context, i4), j.a);
            l(layerDrawable2.findDrawableByLayerId(R.id.progress), r0.c(context, i4), j.a);
            return true;
        }
    }

    public static synchronized j b() {
        if (f487b == null) {
            h();
        }
        return f487b;
    }

    public static synchronized PorterDuffColorFilter e(int i2, PorterDuff.Mode mode) {
        return m0.l(i2, mode);
    }

    public static synchronized void h() {
        if (f487b == null) {
            j jVar = new j();
            f487b = jVar;
            jVar.f488c = m0.h();
            f487b.f488c.u(new a());
        }
    }

    static void i(Drawable drawable, u0 u0Var, int[] iArr) {
        m0.w(drawable, u0Var, iArr);
    }

    public synchronized Drawable c(Context context, int i2) {
        return this.f488c.j(context, i2);
    }

    synchronized Drawable d(Context context, int i2, boolean z) {
        return this.f488c.k(context, i2, z);
    }

    synchronized ColorStateList f(Context context, int i2) {
        return this.f488c.m(context, i2);
    }

    public synchronized void g(Context context) {
        this.f488c.s(context);
    }
}