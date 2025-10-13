package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FastScroller.java */
/* loaded from: classes.dex */
class i extends RecyclerView.n implements RecyclerView.s {
    private static final int[] a = {R.attr.state_pressed};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f1724b = new int[0];
    final ValueAnimator B;
    int C;
    private final Runnable D;
    private final RecyclerView.t E;

    /* renamed from: c, reason: collision with root package name */
    private final int f1725c;

    /* renamed from: d, reason: collision with root package name */
    private final int f1726d;

    /* renamed from: e, reason: collision with root package name */
    final StateListDrawable f1727e;

    /* renamed from: f, reason: collision with root package name */
    final Drawable f1728f;

    /* renamed from: g, reason: collision with root package name */
    private final int f1729g;

    /* renamed from: h, reason: collision with root package name */
    private final int f1730h;

    /* renamed from: i, reason: collision with root package name */
    private final StateListDrawable f1731i;

    /* renamed from: j, reason: collision with root package name */
    private final Drawable f1732j;

    /* renamed from: k, reason: collision with root package name */
    private final int f1733k;

    /* renamed from: l, reason: collision with root package name */
    private final int f1734l;

    /* renamed from: m, reason: collision with root package name */
    int f1735m;
    int n;
    float o;
    int p;
    int q;
    float r;
    private RecyclerView u;
    private int s = 0;
    private int t = 0;
    private boolean v = false;
    private boolean w = false;
    private int x = 0;
    private int y = 0;
    private final int[] z = new int[2];
    private final int[] A = new int[2];

    /* compiled from: FastScroller.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.q(500);
        }
    }

    /* compiled from: FastScroller.java */
    class b extends RecyclerView.t {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int i2, int i3) {
            i.this.B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* compiled from: FastScroller.java */
    private class c extends AnimatorListenerAdapter {
        private boolean a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                this.a = false;
                return;
            }
            if (((Float) i.this.B.getAnimatedValue()).floatValue() == 0.0f) {
                i iVar = i.this;
                iVar.C = 0;
                iVar.y(0);
            } else {
                i iVar2 = i.this;
                iVar2.C = 2;
                iVar2.v();
            }
        }
    }

    /* compiled from: FastScroller.java */
    private class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            i.this.f1727e.setAlpha(iFloatValue);
            i.this.f1728f.setAlpha(iFloatValue);
            i.this.v();
        }
    }

    i(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B = valueAnimatorOfFloat;
        this.C = 0;
        this.D = new a();
        this.E = new b();
        this.f1727e = stateListDrawable;
        this.f1728f = drawable;
        this.f1731i = stateListDrawable2;
        this.f1732j = drawable2;
        this.f1729g = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f1730h = Math.max(i2, drawable.getIntrinsicWidth());
        this.f1733k = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.f1734l = Math.max(i2, drawable2.getIntrinsicWidth());
        this.f1725c = i3;
        this.f1726d = i4;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new d());
        j(recyclerView);
    }

    private void C(float f2) {
        int[] iArrP = p();
        float fMax = Math.max(iArrP[0], Math.min(iArrP[1], f2));
        if (Math.abs(this.n - fMax) < 2.0f) {
            return;
        }
        int iX = x(this.o, fMax, iArrP, this.u.computeVerticalScrollRange(), this.u.computeVerticalScrollOffset(), this.t);
        if (iX != 0) {
            this.u.scrollBy(0, iX);
        }
        this.o = fMax;
    }

    private void k() {
        this.u.removeCallbacks(this.D);
    }

    private void l() {
        this.u.X0(this);
        this.u.Y0(this);
        this.u.Z0(this.E);
        k();
    }

    private void m(Canvas canvas) {
        int i2 = this.t;
        int i3 = this.f1733k;
        int i4 = this.q;
        int i5 = this.p;
        this.f1731i.setBounds(0, 0, i5, i3);
        this.f1732j.setBounds(0, 0, this.s, this.f1734l);
        canvas.translate(0.0f, i2 - i3);
        this.f1732j.draw(canvas);
        canvas.translate(i4 - (i5 / 2), 0.0f);
        this.f1731i.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    private void n(Canvas canvas) {
        int i2 = this.s;
        int i3 = this.f1729g;
        int i4 = i2 - i3;
        int i5 = this.n;
        int i6 = this.f1735m;
        int i7 = i5 - (i6 / 2);
        this.f1727e.setBounds(0, 0, i3, i6);
        this.f1728f.setBounds(0, 0, this.f1730h, this.t);
        if (!s()) {
            canvas.translate(i4, 0.0f);
            this.f1728f.draw(canvas);
            canvas.translate(0.0f, i7);
            this.f1727e.draw(canvas);
            canvas.translate(-i4, -i7);
            return;
        }
        this.f1728f.draw(canvas);
        canvas.translate(this.f1729g, i7);
        canvas.scale(-1.0f, 1.0f);
        this.f1727e.draw(canvas);
        canvas.scale(1.0f, 1.0f);
        canvas.translate(-this.f1729g, -i7);
    }

    private int[] o() {
        int[] iArr = this.A;
        int i2 = this.f1726d;
        iArr[0] = i2;
        iArr[1] = this.s - i2;
        return iArr;
    }

    private int[] p() {
        int[] iArr = this.z;
        int i2 = this.f1726d;
        iArr[0] = i2;
        iArr[1] = this.t - i2;
        return iArr;
    }

    private void r(float f2) {
        int[] iArrO = o();
        float fMax = Math.max(iArrO[0], Math.min(iArrO[1], f2));
        if (Math.abs(this.q - fMax) < 2.0f) {
            return;
        }
        int iX = x(this.r, fMax, iArrO, this.u.computeHorizontalScrollRange(), this.u.computeHorizontalScrollOffset(), this.s);
        if (iX != 0) {
            this.u.scrollBy(iX, 0);
        }
        this.r = fMax;
    }

    private boolean s() {
        return c.h.l.t.B(this.u) == 1;
    }

    private void w(int i2) {
        k();
        this.u.postDelayed(this.D, i2);
    }

    private int x(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 == 0) {
            return 0;
        }
        int i6 = i2 - i4;
        int i7 = (int) (((f3 - f2) / i5) * i6);
        int i8 = i3 + i7;
        if (i8 >= i6 || i8 < 0) {
            return 0;
        }
        return i7;
    }

    private void z() {
        this.u.h(this);
        this.u.j(this);
        this.u.k(this.E);
    }

    public void A() {
        int i2 = this.C;
        if (i2 != 0) {
            if (i2 != 3) {
                return;
            } else {
                this.B.cancel();
            }
        }
        this.C = 1;
        ValueAnimator valueAnimator = this.B;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.B.setDuration(500L);
        this.B.setStartDelay(0L);
        this.B.start();
    }

    void B(int i2, int i3) {
        int iComputeVerticalScrollRange = this.u.computeVerticalScrollRange();
        int i4 = this.t;
        this.v = iComputeVerticalScrollRange - i4 > 0 && i4 >= this.f1725c;
        int iComputeHorizontalScrollRange = this.u.computeHorizontalScrollRange();
        int i5 = this.s;
        boolean z = iComputeHorizontalScrollRange - i5 > 0 && i5 >= this.f1725c;
        this.w = z;
        boolean z2 = this.v;
        if (!z2 && !z) {
            if (this.x != 0) {
                y(0);
                return;
            }
            return;
        }
        if (z2) {
            float f2 = i4;
            this.n = (int) ((f2 * (i3 + (f2 / 2.0f))) / iComputeVerticalScrollRange);
            this.f1735m = Math.min(i4, (i4 * i4) / iComputeVerticalScrollRange);
        }
        if (this.w) {
            float f3 = i5;
            this.q = (int) ((f3 * (i2 + (f3 / 2.0f))) / iComputeHorizontalScrollRange);
            this.p = Math.min(i5, (i5 * i5) / iComputeHorizontalScrollRange);
        }
        int i6 = this.x;
        if (i6 == 0 || i6 == 1) {
            y(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.x == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zU = u(motionEvent.getX(), motionEvent.getY());
            boolean zT = t(motionEvent.getX(), motionEvent.getY());
            if (zU || zT) {
                if (zT) {
                    this.y = 1;
                    this.r = (int) motionEvent.getX();
                } else if (zU) {
                    this.y = 2;
                    this.o = (int) motionEvent.getY();
                }
                y(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.x == 2) {
            this.o = 0.0f;
            this.r = 0.0f;
            y(1);
            this.y = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.x == 2) {
            A();
            if (this.y == 1) {
                r(motionEvent.getX());
            }
            if (this.y == 2) {
                C(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i2 = this.x;
        if (i2 == 1) {
            boolean zU = u(motionEvent.getX(), motionEvent.getY());
            boolean zT = t(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!zU && !zT) {
                return false;
            }
            if (zT) {
                this.y = 1;
                this.r = (int) motionEvent.getX();
            } else if (zU) {
                this.y = 2;
                this.o = (int) motionEvent.getY();
            }
            y(2);
        } else if (i2 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void c(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (this.s != this.u.getWidth() || this.t != this.u.getHeight()) {
            this.s = this.u.getWidth();
            this.t = this.u.getHeight();
            y(0);
        } else if (this.C != 0) {
            if (this.v) {
                n(canvas);
            }
            if (this.w) {
                m(canvas);
            }
        }
    }

    public void j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.u;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            l();
        }
        this.u = recyclerView;
        if (recyclerView != null) {
            z();
        }
    }

    void q(int i2) {
        int i3 = this.C;
        if (i3 == 1) {
            this.B.cancel();
        } else if (i3 != 2) {
            return;
        }
        this.C = 3;
        ValueAnimator valueAnimator = this.B;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.B.setDuration(i2);
        this.B.start();
    }

    boolean t(float f2, float f3) {
        if (f3 >= this.t - this.f1733k) {
            int i2 = this.q;
            int i3 = this.p;
            if (f2 >= i2 - (i3 / 2) && f2 <= i2 + (i3 / 2)) {
                return true;
            }
        }
        return false;
    }

    boolean u(float f2, float f3) {
        if (!s() ? f2 >= this.s - this.f1729g : f2 <= this.f1729g / 2) {
            int i2 = this.n;
            int i3 = this.f1735m;
            if (f3 >= i2 - (i3 / 2) && f3 <= i2 + (i3 / 2)) {
                return true;
            }
        }
        return false;
    }

    void v() {
        this.u.invalidate();
    }

    void y(int i2) {
        if (i2 == 2 && this.x != 2) {
            this.f1727e.setState(a);
            k();
        }
        if (i2 == 0) {
            v();
        } else {
            A();
        }
        if (this.x == 2 && i2 != 2) {
            this.f1727e.setState(f1724b);
            w(1200);
        } else if (i2 == 1) {
            w(1500);
        }
        this.x = i2;
    }
}