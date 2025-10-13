package c.a.l.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import ch.qos.logback.core.net.SyslogConstants;

/* compiled from: DrawableContainer.java */
/* loaded from: classes.dex */
class b extends Drawable implements Drawable.Callback {

    /* renamed from: e, reason: collision with root package name */
    private c f2539e;

    /* renamed from: f, reason: collision with root package name */
    private Rect f2540f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f2541g;

    /* renamed from: h, reason: collision with root package name */
    private Drawable f2542h;

    /* renamed from: j, reason: collision with root package name */
    private boolean f2544j;

    /* renamed from: l, reason: collision with root package name */
    private boolean f2546l;

    /* renamed from: m, reason: collision with root package name */
    private Runnable f2547m;
    private long n;
    private long o;
    private C0043b p;

    /* renamed from: i, reason: collision with root package name */
    private int f2543i = 255;

    /* renamed from: k, reason: collision with root package name */
    private int f2545k = -1;

    /* compiled from: DrawableContainer.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* compiled from: DrawableContainer.java */
    /* renamed from: c.a.l.a.b$b, reason: collision with other inner class name */
    static class C0043b implements Drawable.Callback {

        /* renamed from: e, reason: collision with root package name */
        private Drawable.Callback f2549e;

        C0043b() {
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f2549e;
            this.f2549e = null;
            return callback;
        }

        public C0043b b(Drawable.Callback callback) {
            this.f2549e = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            Drawable.Callback callback = this.f2549e;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j2);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f2549e;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* compiled from: DrawableContainer.java */
    static abstract class c extends Drawable.ConstantState {
        int A;
        int B;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff.Mode G;
        boolean H;
        boolean I;
        final b a;

        /* renamed from: b, reason: collision with root package name */
        Resources f2550b;

        /* renamed from: c, reason: collision with root package name */
        int f2551c;

        /* renamed from: d, reason: collision with root package name */
        int f2552d;

        /* renamed from: e, reason: collision with root package name */
        int f2553e;

        /* renamed from: f, reason: collision with root package name */
        SparseArray<Drawable.ConstantState> f2554f;

        /* renamed from: g, reason: collision with root package name */
        Drawable[] f2555g;

        /* renamed from: h, reason: collision with root package name */
        int f2556h;

        /* renamed from: i, reason: collision with root package name */
        boolean f2557i;

        /* renamed from: j, reason: collision with root package name */
        boolean f2558j;

        /* renamed from: k, reason: collision with root package name */
        Rect f2559k;

        /* renamed from: l, reason: collision with root package name */
        boolean f2560l;

        /* renamed from: m, reason: collision with root package name */
        boolean f2561m;
        int n;
        int o;
        int p;
        int q;
        boolean r;
        int s;
        boolean t;
        boolean u;
        boolean v;
        boolean w;
        boolean x;
        boolean y;
        int z;

        c(c cVar, b bVar, Resources resources) {
            this.f2551c = SyslogConstants.LOG_LOCAL4;
            this.f2557i = false;
            this.f2560l = false;
            this.x = true;
            this.A = 0;
            this.B = 0;
            this.a = bVar;
            this.f2550b = resources != null ? resources : cVar != null ? cVar.f2550b : null;
            int iF = b.f(resources, cVar != null ? cVar.f2551c : 0);
            this.f2551c = iF;
            if (cVar == null) {
                this.f2555g = new Drawable[10];
                this.f2556h = 0;
                return;
            }
            this.f2552d = cVar.f2552d;
            this.f2553e = cVar.f2553e;
            this.v = true;
            this.w = true;
            this.f2557i = cVar.f2557i;
            this.f2560l = cVar.f2560l;
            this.x = cVar.x;
            this.y = cVar.y;
            this.z = cVar.z;
            this.A = cVar.A;
            this.B = cVar.B;
            this.C = cVar.C;
            this.D = cVar.D;
            this.E = cVar.E;
            this.F = cVar.F;
            this.G = cVar.G;
            this.H = cVar.H;
            this.I = cVar.I;
            if (cVar.f2551c == iF) {
                if (cVar.f2558j) {
                    this.f2559k = new Rect(cVar.f2559k);
                    this.f2558j = true;
                }
                if (cVar.f2561m) {
                    this.n = cVar.n;
                    this.o = cVar.o;
                    this.p = cVar.p;
                    this.q = cVar.q;
                    this.f2561m = true;
                }
            }
            if (cVar.r) {
                this.s = cVar.s;
                this.r = true;
            }
            if (cVar.t) {
                this.u = cVar.u;
                this.t = true;
            }
            Drawable[] drawableArr = cVar.f2555g;
            this.f2555g = new Drawable[drawableArr.length];
            this.f2556h = cVar.f2556h;
            SparseArray<Drawable.ConstantState> sparseArray = cVar.f2554f;
            if (sparseArray != null) {
                this.f2554f = sparseArray.clone();
            } else {
                this.f2554f = new SparseArray<>(this.f2556h);
            }
            int i2 = this.f2556h;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3] != null) {
                    Drawable.ConstantState constantState = drawableArr[i3].getConstantState();
                    if (constantState != null) {
                        this.f2554f.put(i3, constantState);
                    } else {
                        this.f2555g[i3] = drawableArr[i3];
                    }
                }
            }
        }

        private void e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f2554f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.f2555g[this.f2554f.keyAt(i2)] = s(this.f2554f.valueAt(i2).newDrawable(this.f2550b));
                }
                this.f2554f = null;
            }
        }

        private Drawable s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.z);
            }
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setCallback(this.a);
            return drawableMutate;
        }

        public final int a(Drawable drawable) {
            int i2 = this.f2556h;
            if (i2 >= this.f2555g.length) {
                o(i2, i2 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.a);
            this.f2555g[i2] = drawable;
            this.f2556h++;
            this.f2553e = drawable.getChangingConfigurations() | this.f2553e;
            p();
            this.f2559k = null;
            this.f2558j = false;
            this.f2561m = false;
            this.v = false;
            return i2;
        }

        final void b(Resources.Theme theme) {
            if (theme != null) {
                e();
                int i2 = this.f2556h;
                Drawable[] drawableArr = this.f2555g;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3] != null && drawableArr[i3].canApplyTheme()) {
                        drawableArr[i3].applyTheme(theme);
                        this.f2553e |= drawableArr[i3].getChangingConfigurations();
                    }
                }
                y(theme.getResources());
            }
        }

        public synchronized boolean c() {
            if (this.v) {
                return this.w;
            }
            e();
            this.v = true;
            int i2 = this.f2556h;
            Drawable[] drawableArr = this.f2555g;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getConstantState() == null) {
                    this.w = false;
                    return false;
                }
            }
            this.w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i2 = this.f2556h;
            Drawable[] drawableArr = this.f2555g;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f2554f.get(i3);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        protected void d() {
            this.f2561m = true;
            e();
            int i2 = this.f2556h;
            Drawable[] drawableArr = this.f2555g;
            this.o = -1;
            this.n = -1;
            this.q = 0;
            this.p = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.n) {
                    this.n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.o) {
                    this.o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.p) {
                    this.p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.q) {
                    this.q = minimumHeight;
                }
            }
        }

        final int f() {
            return this.f2555g.length;
        }

        public final Drawable g(int i2) {
            int iIndexOfKey;
            Drawable drawable = this.f2555g[i2];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f2554f;
            if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i2)) < 0) {
                return null;
            }
            Drawable drawableS = s(this.f2554f.valueAt(iIndexOfKey).newDrawable(this.f2550b));
            this.f2555g[i2] = drawableS;
            this.f2554f.removeAt(iIndexOfKey);
            if (this.f2554f.size() == 0) {
                this.f2554f = null;
            }
            return drawableS;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f2552d | this.f2553e;
        }

        public final int h() {
            return this.f2556h;
        }

        public final int i() {
            if (!this.f2561m) {
                d();
            }
            return this.o;
        }

        public final int j() {
            if (!this.f2561m) {
                d();
            }
            return this.q;
        }

        public final int k() {
            if (!this.f2561m) {
                d();
            }
            return this.p;
        }

        public final Rect l() {
            Rect rect = null;
            if (this.f2557i) {
                return null;
            }
            Rect rect2 = this.f2559k;
            if (rect2 != null || this.f2558j) {
                return rect2;
            }
            e();
            Rect rect3 = new Rect();
            int i2 = this.f2556h;
            Drawable[] drawableArr = this.f2555g;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i4 = rect3.left;
                    if (i4 > rect.left) {
                        rect.left = i4;
                    }
                    int i5 = rect3.top;
                    if (i5 > rect.top) {
                        rect.top = i5;
                    }
                    int i6 = rect3.right;
                    if (i6 > rect.right) {
                        rect.right = i6;
                    }
                    int i7 = rect3.bottom;
                    if (i7 > rect.bottom) {
                        rect.bottom = i7;
                    }
                }
            }
            this.f2558j = true;
            this.f2559k = rect;
            return rect;
        }

        public final int m() {
            if (!this.f2561m) {
                d();
            }
            return this.n;
        }

        public final int n() {
            if (this.r) {
                return this.s;
            }
            e();
            int i2 = this.f2556h;
            Drawable[] drawableArr = this.f2555g;
            int opacity = i2 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i3 = 1; i3 < i2; i3++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i3].getOpacity());
            }
            this.s = opacity;
            this.r = true;
            return opacity;
        }

        public void o(int i2, int i3) {
            Drawable[] drawableArr = new Drawable[i3];
            System.arraycopy(this.f2555g, 0, drawableArr, 0, i2);
            this.f2555g = drawableArr;
        }

        void p() {
            this.r = false;
            this.t = false;
        }

        public final boolean q() {
            return this.f2560l;
        }

        abstract void r();

        public final void t(boolean z) {
            this.f2560l = z;
        }

        public final void u(int i2) {
            this.A = i2;
        }

        public final void v(int i2) {
            this.B = i2;
        }

        final boolean w(int i2, int i3) {
            int i4 = this.f2556h;
            Drawable[] drawableArr = this.f2555g;
            boolean z = false;
            for (int i5 = 0; i5 < i4; i5++) {
                if (drawableArr[i5] != null) {
                    boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i5].setLayoutDirection(i2) : false;
                    if (i5 == i3) {
                        z = layoutDirection;
                    }
                }
            }
            this.z = i2;
            return z;
        }

        public final void x(boolean z) {
            this.f2557i = z;
        }

        final void y(Resources resources) {
            if (resources != null) {
                this.f2550b = resources;
                int iF = b.f(resources, this.f2551c);
                int i2 = this.f2551c;
                this.f2551c = iF;
                if (i2 != iF) {
                    this.f2561m = false;
                    this.f2558j = false;
                }
            }
        }
    }

    b() {
    }

    private void d(Drawable drawable) {
        if (this.p == null) {
            this.p = new C0043b();
        }
        drawable.setCallback(this.p.b(drawable.getCallback()));
        try {
            if (this.f2539e.A <= 0 && this.f2544j) {
                drawable.setAlpha(this.f2543i);
            }
            c cVar = this.f2539e;
            if (cVar.E) {
                drawable.setColorFilter(cVar.D);
            } else {
                if (cVar.H) {
                    androidx.core.graphics.drawable.a.o(drawable, cVar.F);
                }
                c cVar2 = this.f2539e;
                if (cVar2.I) {
                    androidx.core.graphics.drawable.a.p(drawable, cVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f2539e.x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (i2 >= 19) {
                drawable.setAutoMirrored(this.f2539e.C);
            }
            Rect rect = this.f2540f;
            if (i2 >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.p.a());
        }
    }

    private boolean e() {
        return isAutoMirrored() && androidx.core.graphics.drawable.a.f(this) == 1;
    }

    static int f(Resources resources, int i2) {
        if (resources != null) {
            i2 = resources.getDisplayMetrics().densityDpi;
        }
        return i2 == 0 ? SyslogConstants.LOG_LOCAL4 : i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f2544j = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f2541g
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L38
            long r9 = r13.n
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L3a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f2543i
            r3.setAlpha(r9)
            r13.n = r7
            goto L3a
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            c.a.l.a.b$c r9 = r13.f2539e
            int r9 = r9.A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f2543i
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L3b
        L38:
            r13.n = r7
        L3a:
            r3 = 0
        L3b:
            android.graphics.drawable.Drawable r9 = r13.f2542h
            if (r9 == 0) goto L65
            long r10 = r13.o
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L67
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L52
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f2542h = r0
            r13.o = r7
            goto L67
        L52:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            c.a.l.a.b$c r4 = r13.f2539e
            int r4 = r4.B
            int r3 = r3 / r4
            int r4 = r13.f2543i
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L68
        L65:
            r13.o = r7
        L67:
            r0 = r3
        L68:
            if (r14 == 0) goto L74
            if (r0 == 0) goto L74
            java.lang.Runnable r14 = r13.f2547m
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.l.a.b.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f2539e.b(theme);
    }

    c b() {
        throw null;
    }

    int c() {
        return this.f2545k;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f2539e.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f2541g;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f2542h;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f2545k
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            c.a.l.a.b$c r0 = r9.f2539e
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f2542h
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f2541g
            if (r0 == 0) goto L29
            r9.f2542h = r0
            c.a.l.a.b$c r0 = r9.f2539e
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.o = r0
            goto L35
        L29:
            r9.f2542h = r4
            r9.o = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f2541g
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            c.a.l.a.b$c r0 = r9.f2539e
            int r1 = r0.f2556h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.g(r10)
            r9.f2541g = r0
            r9.f2545k = r10
            if (r0 == 0) goto L5a
            c.a.l.a.b$c r10 = r9.f2539e
            int r10 = r10.A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.n = r2
        L51:
            r9.d(r0)
            goto L5a
        L55:
            r9.f2541g = r4
            r10 = -1
            r9.f2545k = r10
        L5a:
            long r0 = r9.n
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.o
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L79
        L67:
            java.lang.Runnable r0 = r9.f2547m
            if (r0 != 0) goto L73
            c.a.l.a.b$a r0 = new c.a.l.a.b$a
            r0.<init>()
            r9.f2547m = r0
            goto L76
        L73:
            r9.unscheduleSelf(r0)
        L76:
            r9.a(r10)
        L79:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.l.a.b.g(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f2543i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f2539e.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f2539e.c()) {
            return null;
        }
        this.f2539e.f2552d = getChangingConfigurations();
        return this.f2539e;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f2541g;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f2540f;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f2539e.q()) {
            return this.f2539e.i();
        }
        Drawable drawable = this.f2541g;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f2539e.q()) {
            return this.f2539e.m();
        }
        Drawable drawable = this.f2541g;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f2539e.q()) {
            return this.f2539e.j();
        }
        Drawable drawable = this.f2541g;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f2539e.q()) {
            return this.f2539e.k();
        }
        Drawable drawable = this.f2541g;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f2541g;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f2539e.n();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f2541g;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect rectL = this.f2539e.l();
        if (rectL != null) {
            rect.set(rectL);
            padding = (rectL.right | ((rectL.left | rectL.top) | rectL.bottom)) != 0;
        } else {
            Drawable drawable = this.f2541g;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (e()) {
            int i2 = rect.left;
            rect.left = rect.right;
            rect.right = i2;
        }
        return padding;
    }

    void h(c cVar) {
        this.f2539e = cVar;
        int i2 = this.f2545k;
        if (i2 >= 0) {
            Drawable drawableG = cVar.g(i2);
            this.f2541g = drawableG;
            if (drawableG != null) {
                d(drawableG);
            }
        }
        this.f2542h = null;
    }

    final void i(Resources resources) {
        this.f2539e.y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        c cVar = this.f2539e;
        if (cVar != null) {
            cVar.p();
        }
        if (drawable != this.f2541g || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f2539e.C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f2542h;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f2542h = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f2541g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f2544j) {
                this.f2541g.setAlpha(this.f2543i);
            }
        }
        if (this.o != 0) {
            this.o = 0L;
            z = true;
        }
        if (this.n != 0) {
            this.n = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f2546l && super.mutate() == this) {
            c cVarB = b();
            cVarB.r();
            h(cVarB);
            this.f2546l = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2542h;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f2541g;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i2) {
        return this.f2539e.w(i2, c());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i2) {
        Drawable drawable = this.f2542h;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        Drawable drawable2 = this.f2541g;
        if (drawable2 != null) {
            return drawable2.setLevel(i2);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f2542h;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f2541g;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        if (drawable != this.f2541g || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        if (this.f2544j && this.f2543i == i2) {
            return;
        }
        this.f2544j = true;
        this.f2543i = i2;
        Drawable drawable = this.f2541g;
        if (drawable != null) {
            if (this.n == 0) {
                drawable.setAlpha(i2);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        c cVar = this.f2539e;
        if (cVar.C != z) {
            cVar.C = z;
            Drawable drawable = this.f2541g;
            if (drawable != null) {
                androidx.core.graphics.drawable.a.j(drawable, z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f2539e;
        cVar.E = true;
        if (cVar.D != colorFilter) {
            cVar.D = colorFilter;
            Drawable drawable = this.f2541g;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        c cVar = this.f2539e;
        if (cVar.x != z) {
            cVar.x = z;
            Drawable drawable = this.f2541g;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f2, float f3) {
        Drawable drawable = this.f2541g;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, f2, f3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Rect rect = this.f2540f;
        if (rect == null) {
            this.f2540f = new Rect(i2, i3, i4, i5);
        } else {
            rect.set(i2, i3, i4, i5);
        }
        Drawable drawable = this.f2541g;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.l(drawable, i2, i3, i4, i5);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        c cVar = this.f2539e;
        cVar.H = true;
        if (cVar.F != colorStateList) {
            cVar.F = colorStateList;
            androidx.core.graphics.drawable.a.o(this.f2541g, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f2539e;
        cVar.I = true;
        if (cVar.G != mode) {
            cVar.G = mode;
            androidx.core.graphics.drawable.a.p(this.f2541g, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f2542h;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f2541g;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f2541g || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}