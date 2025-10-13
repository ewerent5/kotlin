package c.j.b;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import c.h.l.t;
import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;

/* compiled from: ViewDragHelper.java */
/* loaded from: classes.dex */
public class c {
    private static final Interpolator a = new a();

    /* renamed from: b, reason: collision with root package name */
    private int f3206b;

    /* renamed from: c, reason: collision with root package name */
    private int f3207c;

    /* renamed from: e, reason: collision with root package name */
    private float[] f3209e;

    /* renamed from: f, reason: collision with root package name */
    private float[] f3210f;

    /* renamed from: g, reason: collision with root package name */
    private float[] f3211g;

    /* renamed from: h, reason: collision with root package name */
    private float[] f3212h;

    /* renamed from: i, reason: collision with root package name */
    private int[] f3213i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f3214j;

    /* renamed from: k, reason: collision with root package name */
    private int[] f3215k;

    /* renamed from: l, reason: collision with root package name */
    private int f3216l;

    /* renamed from: m, reason: collision with root package name */
    private VelocityTracker f3217m;
    private float n;
    private float o;
    private int p;
    private final int q;
    private int r;
    private OverScroller s;
    private final AbstractC0064c t;
    private View u;
    private boolean v;
    private final ViewGroup w;

    /* renamed from: d, reason: collision with root package name */
    private int f3208d = -1;
    private final Runnable x = new b();

    /* compiled from: ViewDragHelper.java */
    class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    /* compiled from: ViewDragHelper.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.E(0);
        }
    }

    /* compiled from: ViewDragHelper.java */
    /* renamed from: c.j.b.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0064c {
        public abstract int a(View view, int i2, int i3);

        public abstract int b(View view, int i2, int i3);

        public int c(int i2) {
            return i2;
        }

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public void f(int i2, int i3) {
        }

        public boolean g(int i2) {
            return false;
        }

        public void h(int i2, int i3) {
        }

        public void i(View view, int i2) {
        }

        public abstract void j(int i2);

        public abstract void k(View view, int i2, int i3, int i4, int i5);

        public abstract void l(View view, float f2, float f3);

        public abstract boolean m(View view, int i2);
    }

    private c(Context context, ViewGroup viewGroup, AbstractC0064c abstractC0064c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0064c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.w = viewGroup;
        this.t = abstractC0064c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i2 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.q = i2;
        this.p = i2;
        this.f3207c = viewConfiguration.getScaledTouchSlop();
        this.n = viewConfiguration.getScaledMaximumFlingVelocity();
        this.o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.s = new OverScroller(context, a);
    }

    private void A() {
        this.f3217m.computeCurrentVelocity(CoreConstants.MILLIS_IN_ONE_SECOND, this.n);
        n(e(this.f3217m.getXVelocity(this.f3208d), this.o, this.n), e(this.f3217m.getYVelocity(this.f3208d), this.o, this.n));
    }

    private void B(float f2, float f3, int i2) {
        int i3 = c(f2, f3, i2, 1) ? 1 : 0;
        if (c(f3, f2, i2, 4)) {
            i3 |= 4;
        }
        if (c(f2, f3, i2, 2)) {
            i3 |= 2;
        }
        if (c(f3, f2, i2, 8)) {
            i3 |= 8;
        }
        if (i3 != 0) {
            int[] iArr = this.f3214j;
            iArr[i2] = iArr[i2] | i3;
            this.t.f(i3, i2);
        }
    }

    private void C(float f2, float f3, int i2) {
        q(i2);
        float[] fArr = this.f3209e;
        this.f3211g[i2] = f2;
        fArr[i2] = f2;
        float[] fArr2 = this.f3210f;
        this.f3212h[i2] = f3;
        fArr2[i2] = f3;
        this.f3213i[i2] = t((int) f2, (int) f3);
        this.f3216l |= 1 << i2;
    }

    private void D(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (x(pointerId)) {
                float x = motionEvent.getX(i2);
                float y = motionEvent.getY(i2);
                this.f3211g[pointerId] = x;
                this.f3212h[pointerId] = y;
            }
        }
    }

    private boolean c(float f2, float f3, int i2, int i3) {
        float fAbs = Math.abs(f2);
        float fAbs2 = Math.abs(f3);
        if ((this.f3213i[i2] & i3) != i3 || (this.r & i3) == 0 || (this.f3215k[i2] & i3) == i3 || (this.f3214j[i2] & i3) == i3) {
            return false;
        }
        int i4 = this.f3207c;
        if (fAbs <= i4 && fAbs2 <= i4) {
            return false;
        }
        if (fAbs >= fAbs2 * 0.5f || !this.t.g(i3)) {
            return (this.f3214j[i2] & i3) == 0 && fAbs > ((float) this.f3207c);
        }
        int[] iArr = this.f3215k;
        iArr[i2] = iArr[i2] | i3;
        return false;
    }

    private boolean d(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        boolean z = this.t.d(view) > 0;
        boolean z2 = this.t.e(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f2) > ((float) this.f3207c) : z2 && Math.abs(f3) > ((float) this.f3207c);
        }
        float f4 = (f2 * f2) + (f3 * f3);
        int i2 = this.f3207c;
        return f4 > ((float) (i2 * i2));
    }

    private float e(float f2, float f3, float f4) {
        float fAbs = Math.abs(f2);
        if (fAbs < f3) {
            return 0.0f;
        }
        return fAbs > f4 ? f2 > 0.0f ? f4 : -f4 : f2;
    }

    private int f(int i2, int i3, int i4) {
        int iAbs = Math.abs(i2);
        if (iAbs < i3) {
            return 0;
        }
        return iAbs > i4 ? i2 > 0 ? i4 : -i4 : i2;
    }

    private void g() {
        float[] fArr = this.f3209e;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f3210f, 0.0f);
        Arrays.fill(this.f3211g, 0.0f);
        Arrays.fill(this.f3212h, 0.0f);
        Arrays.fill(this.f3213i, 0);
        Arrays.fill(this.f3214j, 0);
        Arrays.fill(this.f3215k, 0);
        this.f3216l = 0;
    }

    private void h(int i2) {
        if (this.f3209e == null || !w(i2)) {
            return;
        }
        this.f3209e[i2] = 0.0f;
        this.f3210f[i2] = 0.0f;
        this.f3211g[i2] = 0.0f;
        this.f3212h[i2] = 0.0f;
        this.f3213i[i2] = 0;
        this.f3214j[i2] = 0;
        this.f3215k[i2] = 0;
        this.f3216l = (~(1 << i2)) & this.f3216l;
    }

    private int i(int i2, int i3, int i4) {
        if (i2 == 0) {
            return 0;
        }
        int width = this.w.getWidth();
        float f2 = width / 2;
        float fO = f2 + (o(Math.min(1.0f, Math.abs(i2) / width)) * f2);
        int iAbs = Math.abs(i3);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fO / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i2) / i4) + 1.0f) * 256.0f), 600);
    }

    private int j(View view, int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        float f4;
        float f5;
        int iF = f(i4, (int) this.o, (int) this.n);
        int iF2 = f(i5, (int) this.o, (int) this.n);
        int iAbs = Math.abs(i2);
        int iAbs2 = Math.abs(i3);
        int iAbs3 = Math.abs(iF);
        int iAbs4 = Math.abs(iF2);
        int i6 = iAbs3 + iAbs4;
        int i7 = iAbs + iAbs2;
        if (iF != 0) {
            f2 = iAbs3;
            f3 = i6;
        } else {
            f2 = iAbs;
            f3 = i7;
        }
        float f6 = f2 / f3;
        if (iF2 != 0) {
            f4 = iAbs4;
            f5 = i6;
        } else {
            f4 = iAbs2;
            f5 = i7;
        }
        return (int) ((i(i2, iF, this.t.d(view)) * f6) + (i(i3, iF2, this.t.e(view)) * (f4 / f5)));
    }

    public static c l(ViewGroup viewGroup, float f2, AbstractC0064c abstractC0064c) {
        c cVarM = m(viewGroup, abstractC0064c);
        cVarM.f3207c = (int) (cVarM.f3207c * (1.0f / f2));
        return cVarM;
    }

    public static c m(ViewGroup viewGroup, AbstractC0064c abstractC0064c) {
        return new c(viewGroup.getContext(), viewGroup, abstractC0064c);
    }

    private void n(float f2, float f3) {
        this.v = true;
        this.t.l(this.u, f2, f3);
        this.v = false;
        if (this.f3206b == 1) {
            E(0);
        }
    }

    private float o(float f2) {
        return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    private void p(int i2, int i3, int i4, int i5) {
        int left = this.u.getLeft();
        int top = this.u.getTop();
        if (i4 != 0) {
            i2 = this.t.a(this.u, i2, i4);
            t.V(this.u, i2 - left);
        }
        int i6 = i2;
        if (i5 != 0) {
            i3 = this.t.b(this.u, i3, i5);
            t.W(this.u, i3 - top);
        }
        int i7 = i3;
        if (i4 == 0 && i5 == 0) {
            return;
        }
        this.t.k(this.u, i6, i7, i6 - left, i7 - top);
    }

    private void q(int i2) {
        float[] fArr = this.f3209e;
        if (fArr == null || fArr.length <= i2) {
            int i3 = i2 + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f3210f;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f3211g;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f3212h;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f3213i;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f3214j;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f3215k;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f3209e = fArr2;
            this.f3210f = fArr3;
            this.f3211g = fArr4;
            this.f3212h = fArr5;
            this.f3213i = iArr;
            this.f3214j = iArr2;
            this.f3215k = iArr3;
        }
    }

    private boolean s(int i2, int i3, int i4, int i5) {
        int left = this.u.getLeft();
        int top = this.u.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        if (i6 == 0 && i7 == 0) {
            this.s.abortAnimation();
            E(0);
            return false;
        }
        this.s.startScroll(left, top, i6, i7, j(this.u, i6, i7, i4, i5));
        E(2);
        return true;
    }

    private int t(int i2, int i3) {
        int i4 = i2 < this.w.getLeft() + this.p ? 1 : 0;
        if (i3 < this.w.getTop() + this.p) {
            i4 |= 4;
        }
        if (i2 > this.w.getRight() - this.p) {
            i4 |= 2;
        }
        return i3 > this.w.getBottom() - this.p ? i4 | 8 : i4;
    }

    private boolean x(int i2) {
        if (w(i2)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    void E(int i2) {
        this.w.removeCallbacks(this.x);
        if (this.f3206b != i2) {
            this.f3206b = i2;
            this.t.j(i2);
            if (this.f3206b == 0) {
                this.u = null;
            }
        }
    }

    public boolean F(int i2, int i3) {
        if (this.v) {
            return s(i2, i3, (int) this.f3217m.getXVelocity(this.f3208d), (int) this.f3217m.getYVelocity(this.f3208d));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean G(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.j.b.c.G(android.view.MotionEvent):boolean");
    }

    public boolean H(View view, int i2, int i3) {
        this.u = view;
        this.f3208d = -1;
        boolean zS = s(i2, i3, 0, 0);
        if (!zS && this.f3206b == 0 && this.u != null) {
            this.u = null;
        }
        return zS;
    }

    boolean I(View view, int i2) {
        if (view == this.u && this.f3208d == i2) {
            return true;
        }
        if (view == null || !this.t.m(view, i2)) {
            return false;
        }
        this.f3208d = i2;
        b(view, i2);
        return true;
    }

    public void a() {
        this.f3208d = -1;
        g();
        VelocityTracker velocityTracker = this.f3217m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3217m = null;
        }
    }

    public void b(View view, int i2) {
        if (view.getParent() == this.w) {
            this.u = view;
            this.f3208d = i2;
            this.t.i(view, i2);
            E(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.w + ")");
    }

    public boolean k(boolean z) {
        if (this.f3206b == 2) {
            boolean zComputeScrollOffset = this.s.computeScrollOffset();
            int currX = this.s.getCurrX();
            int currY = this.s.getCurrY();
            int left = currX - this.u.getLeft();
            int top = currY - this.u.getTop();
            if (left != 0) {
                t.V(this.u, left);
            }
            if (top != 0) {
                t.W(this.u, top);
            }
            if (left != 0 || top != 0) {
                this.t.k(this.u, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.s.getFinalX() && currY == this.s.getFinalY()) {
                this.s.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z) {
                    this.w.post(this.x);
                } else {
                    E(0);
                }
            }
        }
        return this.f3206b == 2;
    }

    public View r(int i2, int i3) {
        for (int childCount = this.w.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.w.getChildAt(this.t.c(childCount));
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public int u() {
        return this.f3207c;
    }

    public boolean v(int i2, int i3) {
        return y(this.u, i2, i3);
    }

    public boolean w(int i2) {
        return ((1 << i2) & this.f3216l) != 0;
    }

    public boolean y(View view, int i2, int i3) {
        return view != null && i2 >= view.getLeft() && i2 < view.getRight() && i3 >= view.getTop() && i3 < view.getBottom();
    }

    public void z(MotionEvent motionEvent) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f3217m == null) {
            this.f3217m = VelocityTracker.obtain();
        }
        this.f3217m.addMovement(motionEvent);
        int i3 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewR = r((int) x, (int) y);
            C(x, y, pointerId);
            I(viewR, pointerId);
            int i4 = this.f3213i[pointerId];
            int i5 = this.r;
            if ((i4 & i5) != 0) {
                this.t.h(i4 & i5, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f3206b == 1) {
                A();
            }
            a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f3206b == 1) {
                if (x(this.f3208d)) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f3208d);
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f3211g;
                    int i6 = this.f3208d;
                    int i7 = (int) (x2 - fArr[i6]);
                    int i8 = (int) (y2 - this.f3212h[i6]);
                    p(this.u.getLeft() + i7, this.u.getTop() + i8, i7, i8);
                    D(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i3 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i3);
                if (x(pointerId2)) {
                    float x3 = motionEvent.getX(i3);
                    float y3 = motionEvent.getY(i3);
                    float f2 = x3 - this.f3209e[pointerId2];
                    float f3 = y3 - this.f3210f[pointerId2];
                    B(f2, f3, pointerId2);
                    if (this.f3206b != 1) {
                        View viewR2 = r((int) x3, (int) y3);
                        if (d(viewR2, f2, f3) && I(viewR2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i3++;
            }
            D(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f3206b == 1) {
                n(0.0f, 0.0f);
            }
            a();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x4 = motionEvent.getX(actionIndex);
            float y4 = motionEvent.getY(actionIndex);
            C(x4, y4, pointerId3);
            if (this.f3206b != 0) {
                if (v((int) x4, (int) y4)) {
                    I(this.u, pointerId3);
                    return;
                }
                return;
            } else {
                I(r((int) x4, (int) y4), pointerId3);
                int i9 = this.f3213i[pointerId3];
                int i10 = this.r;
                if ((i9 & i10) != 0) {
                    this.t.h(i9 & i10, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f3206b == 1 && pointerId4 == this.f3208d) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i3 >= pointerCount2) {
                    i2 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i3);
                if (pointerId5 != this.f3208d) {
                    View viewR3 = r((int) motionEvent.getX(i3), (int) motionEvent.getY(i3));
                    View view = this.u;
                    if (viewR3 == view && I(view, pointerId5)) {
                        i2 = this.f3208d;
                        break;
                    }
                }
                i3++;
            }
            if (i2 == -1) {
                A();
            }
        }
        h(pointerId4);
    }
}