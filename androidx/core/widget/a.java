package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import c.h.l.t;

/* compiled from: AutoScrollHelper.java */
/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* renamed from: e, reason: collision with root package name */
    private static final int f940e = ViewConfiguration.getTapTimeout();

    /* renamed from: h, reason: collision with root package name */
    final View f943h;

    /* renamed from: i, reason: collision with root package name */
    private Runnable f944i;

    /* renamed from: l, reason: collision with root package name */
    private int f947l;

    /* renamed from: m, reason: collision with root package name */
    private int f948m;
    private boolean q;
    boolean r;
    boolean s;
    boolean t;
    private boolean u;
    private boolean v;

    /* renamed from: f, reason: collision with root package name */
    final C0012a f941f = new C0012a();

    /* renamed from: g, reason: collision with root package name */
    private final Interpolator f942g = new AccelerateInterpolator();

    /* renamed from: j, reason: collision with root package name */
    private float[] f945j = {0.0f, 0.0f};

    /* renamed from: k, reason: collision with root package name */
    private float[] f946k = {Float.MAX_VALUE, Float.MAX_VALUE};
    private float[] n = {0.0f, 0.0f};
    private float[] o = {0.0f, 0.0f};
    private float[] p = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* compiled from: AutoScrollHelper.java */
    /* renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    private static class C0012a {
        private int a;

        /* renamed from: b, reason: collision with root package name */
        private int f949b;

        /* renamed from: c, reason: collision with root package name */
        private float f950c;

        /* renamed from: d, reason: collision with root package name */
        private float f951d;

        /* renamed from: j, reason: collision with root package name */
        private float f957j;

        /* renamed from: k, reason: collision with root package name */
        private int f958k;

        /* renamed from: e, reason: collision with root package name */
        private long f952e = Long.MIN_VALUE;

        /* renamed from: i, reason: collision with root package name */
        private long f956i = -1;

        /* renamed from: f, reason: collision with root package name */
        private long f953f = 0;

        /* renamed from: g, reason: collision with root package name */
        private int f954g = 0;

        /* renamed from: h, reason: collision with root package name */
        private int f955h = 0;

        C0012a() {
        }

        private float e(long j2) {
            if (j2 < this.f952e) {
                return 0.0f;
            }
            long j3 = this.f956i;
            if (j3 < 0 || j2 < j3) {
                return a.f((j2 - r0) / this.a, 0.0f, 1.0f) * 0.5f;
            }
            float f2 = this.f957j;
            return (1.0f - f2) + (f2 * a.f((j2 - j3) / this.f958k, 0.0f, 1.0f));
        }

        private float g(float f2) {
            return ((-4.0f) * f2 * f2) + (f2 * 4.0f);
        }

        public void a() {
            if (this.f953f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j2 = jCurrentAnimationTimeMillis - this.f953f;
            this.f953f = jCurrentAnimationTimeMillis;
            float f2 = j2 * fG;
            this.f954g = (int) (this.f950c * f2);
            this.f955h = (int) (f2 * this.f951d);
        }

        public int b() {
            return this.f954g;
        }

        public int c() {
            return this.f955h;
        }

        public int d() {
            float f2 = this.f950c;
            return (int) (f2 / Math.abs(f2));
        }

        public int f() {
            float f2 = this.f951d;
            return (int) (f2 / Math.abs(f2));
        }

        public boolean h() {
            return this.f956i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f956i + ((long) this.f958k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f958k = a.g((int) (jCurrentAnimationTimeMillis - this.f952e), 0, this.f949b);
            this.f957j = e(jCurrentAnimationTimeMillis);
            this.f956i = jCurrentAnimationTimeMillis;
        }

        public void j(int i2) {
            this.f949b = i2;
        }

        public void k(int i2) {
            this.a = i2;
        }

        public void l(float f2, float f3) {
            this.f950c = f2;
            this.f951d = f3;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f952e = jCurrentAnimationTimeMillis;
            this.f956i = -1L;
            this.f953f = jCurrentAnimationTimeMillis;
            this.f957j = 0.5f;
            this.f954g = 0;
            this.f955h = 0;
        }
    }

    /* compiled from: AutoScrollHelper.java */
    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.t) {
                if (aVar.r) {
                    aVar.r = false;
                    aVar.f941f.m();
                }
                C0012a c0012a = a.this.f941f;
                if (c0012a.h() || !a.this.v()) {
                    a.this.t = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.s) {
                    aVar2.s = false;
                    aVar2.d();
                }
                c0012a.a();
                a.this.k(c0012a.b(), c0012a.c());
                t.c0(a.this.f943h, this);
            }
        }
    }

    public a(View view) {
        this.f943h = view;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = (int) ((1575.0f * f2) + 0.5f);
        p(f3, f3);
        float f4 = (int) ((f2 * 315.0f) + 0.5f);
        q(f4, f4);
        m(1);
        o(Float.MAX_VALUE, Float.MAX_VALUE);
        t(0.2f, 0.2f);
        u(1.0f, 1.0f);
        l(f940e);
        s(500);
        r(500);
    }

    private float e(int i2, float f2, float f3, float f4) {
        float fI = i(this.f945j[i2], f3, this.f946k[i2], f2);
        if (fI == 0.0f) {
            return 0.0f;
        }
        float f5 = this.n[i2];
        float f6 = this.o[i2];
        float f7 = this.p[i2];
        float f8 = f5 * f4;
        return fI > 0.0f ? f(fI * f8, f6, f7) : -f((-fI) * f8, f6, f7);
    }

    static float f(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    static int g(int i2, int i3, int i4) {
        return i2 > i4 ? i4 : i2 < i3 ? i3 : i2;
    }

    private float h(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.f947l;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                if (this.t && i2 == 1) {
                    return 1.0f;
                }
            }
        } else if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
        return 0.0f;
    }

    private float i(float f2, float f3, float f4, float f5) {
        float interpolation;
        float f6 = f(f2 * f3, 0.0f, f4);
        float fH = h(f3 - f5, f6) - h(f5, f6);
        if (fH < 0.0f) {
            interpolation = -this.f942g.getInterpolation(-fH);
        } else {
            if (fH <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f942g.getInterpolation(fH);
        }
        return f(interpolation, -1.0f, 1.0f);
    }

    private void j() {
        if (this.r) {
            this.t = false;
        } else {
            this.f941f.i();
        }
    }

    private void w() {
        int i2;
        if (this.f944i == null) {
            this.f944i = new b();
        }
        this.t = true;
        this.r = true;
        if (this.q || (i2 = this.f948m) <= 0) {
            this.f944i.run();
        } else {
            t.d0(this.f943h, this.f944i, i2);
        }
        this.q = true;
    }

    public abstract boolean b(int i2);

    public abstract boolean c(int i2);

    void d() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f943h.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public abstract void k(int i2, int i3);

    public a l(int i2) {
        this.f948m = i2;
        return this;
    }

    public a m(int i2) {
        this.f947l = i2;
        return this;
    }

    public a n(boolean z) {
        if (this.u && !z) {
            j();
        }
        this.u = z;
        return this;
    }

    public a o(float f2, float f3) {
        float[] fArr = this.f946k;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.u
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.j()
            goto L58
        L1a:
            r5.s = r2
            r5.q = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f943h
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.e(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f943h
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.e(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f941f
            r7.l(r0, r6)
            boolean r6 = r5.t
            if (r6 != 0) goto L58
            boolean r6 = r5.v()
            if (r6 == 0) goto L58
            r5.w()
        L58:
            boolean r6 = r5.v
            if (r6 == 0) goto L61
            boolean r6 = r5.t
            if (r6 == 0) goto L61
            r1 = 1
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f2, float f3) {
        float[] fArr = this.p;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    public a q(float f2, float f3) {
        float[] fArr = this.o;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    public a r(int i2) {
        this.f941f.j(i2);
        return this;
    }

    public a s(int i2) {
        this.f941f.k(i2);
        return this;
    }

    public a t(float f2, float f3) {
        float[] fArr = this.f945j;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    public a u(float f2, float f3) {
        float[] fArr = this.n;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    boolean v() {
        C0012a c0012a = this.f941f;
        int iF = c0012a.f();
        int iD = c0012a.d();
        return (iF != 0 && c(iF)) || (iD != 0 && b(iD));
    }
}