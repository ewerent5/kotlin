package com.google.android.material.bottomsheet;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.h.l.b0;
import c.h.l.c0.c;
import c.h.l.c0.f;
import c.h.l.t;
import c.j.b.c;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.internal.k;
import e.c.b.c.j;
import e.c.b.c.k;
import e.c.b.c.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    private static final int a = k.f15244f;
    int A;
    c.j.b.c B;
    private boolean C;
    private int D;
    private boolean E;
    private int F;
    int G;
    int H;
    WeakReference<V> I;
    WeakReference<View> J;
    private final ArrayList<f> K;
    private VelocityTracker L;
    int M;
    private int N;
    boolean O;
    private Map<View, Integer> P;
    private int Q;
    private final c.AbstractC0064c R;

    /* renamed from: b */
    private int f11472b;

    /* renamed from: c */
    private boolean f11473c;

    /* renamed from: d */
    private boolean f11474d;

    /* renamed from: e */
    private float f11475e;

    /* renamed from: f */
    private int f11476f;

    /* renamed from: g */
    private boolean f11477g;

    /* renamed from: h */
    private int f11478h;

    /* renamed from: i */
    private int f11479i;

    /* renamed from: j */
    private boolean f11480j;

    /* renamed from: k */
    private e.c.b.c.c0.g f11481k;

    /* renamed from: l */
    private int f11482l;

    /* renamed from: m */
    private boolean f11483m;
    private e.c.b.c.c0.k n;
    private boolean o;
    private BottomSheetBehavior<V>.h p;
    private ValueAnimator q;
    int r;
    int s;
    int t;
    float u;
    int v;
    float w;
    boolean x;
    private boolean y;
    private boolean z;

    class a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ View f11484e;

        /* renamed from: f */
        final /* synthetic */ int f11485f;

        a(View view, int i2) {
            this.f11484e = view;
            this.f11485f = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.o0(this.f11484e, this.f11485f);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f11481k != null) {
                BottomSheetBehavior.this.f11481k.Y(fFloatValue);
            }
        }
    }

    class c implements k.c {
        c() {
        }

        @Override // com.google.android.material.internal.k.c
        public b0 a(View view, b0 b0Var, k.d dVar) {
            BottomSheetBehavior.this.f11482l = b0Var.d().f2997e;
            BottomSheetBehavior.this.v0(false);
            return b0Var;
        }
    }

    class d extends c.AbstractC0064c {
        d() {
        }

        private boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.H + bottomSheetBehavior.V()) / 2;
        }

        @Override // c.j.b.c.AbstractC0064c
        public int a(View view, int i2, int i3) {
            return view.getLeft();
        }

        @Override // c.j.b.c.AbstractC0064c
        public int b(View view, int i2, int i3) {
            int iV = BottomSheetBehavior.this.V();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return c.h.f.a.b(i2, iV, bottomSheetBehavior.x ? bottomSheetBehavior.H : bottomSheetBehavior.v);
        }

        @Override // c.j.b.c.AbstractC0064c
        public int e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.x ? bottomSheetBehavior.H : bottomSheetBehavior.v;
        }

        @Override // c.j.b.c.AbstractC0064c
        public void j(int i2) {
            if (i2 == 1 && BottomSheetBehavior.this.z) {
                BottomSheetBehavior.this.m0(1);
            }
        }

        @Override // c.j.b.c.AbstractC0064c
        public void k(View view, int i2, int i3, int i4, int i5) {
            BottomSheetBehavior.this.T(i3);
        }

        @Override // c.j.b.c.AbstractC0064c
        public void l(View view, float f2, float f3) {
            int i2;
            int i3 = 4;
            if (f3 < 0.0f) {
                if (BottomSheetBehavior.this.f11473c) {
                    i2 = BottomSheetBehavior.this.s;
                } else {
                    int top = view.getTop();
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    int i4 = bottomSheetBehavior.t;
                    if (top > i4) {
                        i2 = i4;
                        i3 = 6;
                    } else {
                        i2 = bottomSheetBehavior.r;
                    }
                }
                i3 = 3;
            } else {
                BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                if (bottomSheetBehavior2.x && bottomSheetBehavior2.q0(view, f3)) {
                    if ((Math.abs(f2) >= Math.abs(f3) || f3 <= 500.0f) && !n(view)) {
                        if (BottomSheetBehavior.this.f11473c) {
                            i2 = BottomSheetBehavior.this.s;
                        } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.r) < Math.abs(view.getTop() - BottomSheetBehavior.this.t)) {
                            i2 = BottomSheetBehavior.this.r;
                        } else {
                            i2 = BottomSheetBehavior.this.t;
                            i3 = 6;
                        }
                        i3 = 3;
                    } else {
                        i2 = BottomSheetBehavior.this.H;
                        i3 = 5;
                    }
                } else if (f3 == 0.0f || Math.abs(f2) > Math.abs(f3)) {
                    int top2 = view.getTop();
                    if (!BottomSheetBehavior.this.f11473c) {
                        BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                        int i5 = bottomSheetBehavior3.t;
                        if (top2 < i5) {
                            if (top2 < Math.abs(top2 - bottomSheetBehavior3.v)) {
                                i2 = BottomSheetBehavior.this.r;
                                i3 = 3;
                            } else {
                                i2 = BottomSheetBehavior.this.t;
                            }
                        } else if (Math.abs(top2 - i5) < Math.abs(top2 - BottomSheetBehavior.this.v)) {
                            i2 = BottomSheetBehavior.this.t;
                        } else {
                            i2 = BottomSheetBehavior.this.v;
                        }
                        i3 = 6;
                    } else if (Math.abs(top2 - BottomSheetBehavior.this.s) < Math.abs(top2 - BottomSheetBehavior.this.v)) {
                        i2 = BottomSheetBehavior.this.s;
                        i3 = 3;
                    } else {
                        i2 = BottomSheetBehavior.this.v;
                    }
                } else if (BottomSheetBehavior.this.f11473c) {
                    i2 = BottomSheetBehavior.this.v;
                } else {
                    int top3 = view.getTop();
                    if (Math.abs(top3 - BottomSheetBehavior.this.t) < Math.abs(top3 - BottomSheetBehavior.this.v)) {
                        i2 = BottomSheetBehavior.this.t;
                        i3 = 6;
                    } else {
                        i2 = BottomSheetBehavior.this.v;
                    }
                }
            }
            BottomSheetBehavior.this.r0(view, i3, i2, true);
        }

        @Override // c.j.b.c.AbstractC0064c
        public boolean m(View view, int i2) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i3 = bottomSheetBehavior.A;
            if (i3 == 1 || bottomSheetBehavior.O) {
                return false;
            }
            if (i3 == 3 && bottomSheetBehavior.M == i2) {
                WeakReference<View> weakReference = bottomSheetBehavior.J;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.I;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    class e implements c.h.l.c0.f {
        final /* synthetic */ int a;

        e(int i2) {
            this.a = i2;
        }

        @Override // c.h.l.c0.f
        public boolean a(View view, f.a aVar) {
            BottomSheetBehavior.this.l0(this.a);
            return true;
        }
    }

    public static abstract class f {
        public abstract void a(View view, float f2);

        public abstract void b(View view, int i2);
    }

    private class h implements Runnable {

        /* renamed from: e */
        private final View f11493e;

        /* renamed from: f */
        private boolean f11494f;

        /* renamed from: g */
        int f11495g;

        h(View view, int i2) {
            this.f11493e = view;
            this.f11495g = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.j.b.c cVar = BottomSheetBehavior.this.B;
            if (cVar == null || !cVar.k(true)) {
                BottomSheetBehavior.this.m0(this.f11495g);
            } else {
                t.c0(this.f11493e, this);
            }
            this.f11494f = false;
        }
    }

    public BottomSheetBehavior() {
        this.f11472b = 0;
        this.f11473c = true;
        this.f11474d = false;
        this.p = null;
        this.u = 0.5f;
        this.w = -1.0f;
        this.z = true;
        this.A = 4;
        this.K = new ArrayList<>();
        this.Q = -1;
        this.R = new d();
    }

    private int L(V v, int i2, int i3) {
        return t.b(v, v.getResources().getString(i2), P(i3));
    }

    private void M() {
        int iO = O();
        if (this.f11473c) {
            this.v = Math.max(this.H - iO, this.s);
        } else {
            this.v = this.H - iO;
        }
    }

    private void N() {
        this.t = (int) (this.H * (1.0f - this.u));
    }

    private int O() {
        int i2;
        return this.f11477g ? Math.min(Math.max(this.f11478h, this.H - ((this.G * 9) / 16)), this.F) : (this.f11483m || (i2 = this.f11482l) <= 0) ? this.f11476f : Math.max(this.f11476f, i2 + this.f11479i);
    }

    private c.h.l.c0.f P(int i2) {
        return new e(i2);
    }

    private void Q(Context context, AttributeSet attributeSet, boolean z) {
        R(context, attributeSet, z, null);
    }

    private void R(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.f11480j) {
            this.n = e.c.b.c.c0.k.e(context, attributeSet, e.c.b.c.b.f15072c, a).m();
            e.c.b.c.c0.g gVar = new e.c.b.c.c0.g(this.n);
            this.f11481k = gVar;
            gVar.M(context);
            if (z && colorStateList != null) {
                this.f11481k.X(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
            this.f11481k.setTint(typedValue.data);
        }
    }

    private void S() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.q = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.q.addUpdateListener(new b());
    }

    private float W() {
        VelocityTracker velocityTracker = this.L;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(CoreConstants.MILLIS_IN_ONE_SECOND, this.f11475e);
        return this.L.getYVelocity(this.M);
    }

    private void Y(V v, c.a aVar, int i2) {
        t.g0(v, aVar, null, P(i2));
    }

    private void Z() {
        this.M = -1;
        VelocityTracker velocityTracker = this.L;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.L = null;
        }
    }

    private void a0(g gVar) {
        int i2 = this.f11472b;
        if (i2 == 0) {
            return;
        }
        if (i2 == -1 || (i2 & 1) == 1) {
            this.f11476f = gVar.f11489h;
        }
        if (i2 == -1 || (i2 & 2) == 2) {
            this.f11473c = gVar.f11490i;
        }
        if (i2 == -1 || (i2 & 4) == 4) {
            this.x = gVar.f11491j;
        }
        if (i2 == -1 || (i2 & 8) == 8) {
            this.y = gVar.f11492k;
        }
    }

    private void n0(View view) {
        if (Build.VERSION.SDK_INT < 29 || X() || this.f11477g) {
            return;
        }
        com.google.android.material.internal.k.a(view, new c());
    }

    private void p0(int i2) {
        V v = this.I.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && t.P(v)) {
            v.post(new a(v, i2));
        } else {
            o0(v, i2);
        }
    }

    private void s0() {
        V v;
        WeakReference<V> weakReference = this.I;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        t.e0(v, 524288);
        t.e0(v, 262144);
        t.e0(v, 1048576);
        int i2 = this.Q;
        if (i2 != -1) {
            t.e0(v, i2);
        }
        if (this.A != 6) {
            this.Q = L(v, j.a, 6);
        }
        if (this.x && this.A != 5) {
            Y(v, c.a.u, 5);
        }
        int i3 = this.A;
        if (i3 == 3) {
            Y(v, c.a.t, this.f11473c ? 4 : 6);
            return;
        }
        if (i3 == 4) {
            Y(v, c.a.s, this.f11473c ? 3 : 6);
        } else {
            if (i3 != 6) {
                return;
            }
            Y(v, c.a.t, 4);
            Y(v, c.a.s, 3);
        }
    }

    private void t0(int i2) {
        ValueAnimator valueAnimator;
        if (i2 == 2) {
            return;
        }
        boolean z = i2 == 3;
        if (this.o != z) {
            this.o = z;
            if (this.f11481k == null || (valueAnimator = this.q) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.q.reverse();
                return;
            }
            float f2 = z ? 0.0f : 1.0f;
            this.q.setFloatValues(1.0f - f2, f2);
            this.q.start();
        }
    }

    private void u0(boolean z) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.I;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                if (this.P != null) {
                    return;
                } else {
                    this.P = new HashMap(childCount);
                }
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if (childAt != this.I.get()) {
                    if (z) {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.P.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        if (this.f11474d) {
                            t.u0(childAt, 4);
                        }
                    } else if (this.f11474d && (map = this.P) != null && map.containsKey(childAt)) {
                        t.u0(childAt, this.P.get(childAt).intValue());
                    }
                }
            }
            if (!z) {
                this.P = null;
            } else if (this.f11474d) {
                this.I.get().sendAccessibilityEvent(8);
            }
        }
    }

    public void v0(boolean z) {
        V v;
        if (this.I != null) {
            M();
            if (this.A != 4 || (v = this.I.get()) == null) {
                return;
            }
            if (z) {
                p0(this.A);
            } else {
                v.requestLayout();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2, int i3) {
        this.D = 0;
        this.E = false;
        return (i2 & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void C(CoordinatorLayout coordinatorLayout, V v, View view, int i2) {
        int i3;
        int i4 = 3;
        if (v.getTop() == V()) {
            m0(3);
            return;
        }
        WeakReference<View> weakReference = this.J;
        if (weakReference != null && view == weakReference.get() && this.E) {
            if (this.D > 0) {
                if (this.f11473c) {
                    i3 = this.s;
                } else {
                    int top = v.getTop();
                    int i5 = this.t;
                    if (top > i5) {
                        i3 = i5;
                        i4 = 6;
                    } else {
                        i3 = this.r;
                    }
                }
            } else if (this.x && q0(v, W())) {
                i3 = this.H;
                i4 = 5;
            } else if (this.D == 0) {
                int top2 = v.getTop();
                if (!this.f11473c) {
                    int i6 = this.t;
                    if (top2 < i6) {
                        if (top2 < Math.abs(top2 - this.v)) {
                            i3 = this.r;
                        } else {
                            i3 = this.t;
                        }
                    } else if (Math.abs(top2 - i6) < Math.abs(top2 - this.v)) {
                        i3 = this.t;
                    } else {
                        i3 = this.v;
                        i4 = 4;
                    }
                    i4 = 6;
                } else if (Math.abs(top2 - this.s) < Math.abs(top2 - this.v)) {
                    i3 = this.s;
                } else {
                    i3 = this.v;
                    i4 = 4;
                }
            } else {
                if (this.f11473c) {
                    i3 = this.v;
                } else {
                    int top3 = v.getTop();
                    if (Math.abs(top3 - this.t) < Math.abs(top3 - this.v)) {
                        i3 = this.t;
                        i4 = 6;
                    } else {
                        i3 = this.v;
                    }
                }
                i4 = 4;
            }
            r0(v, i4, i3, false);
            this.E = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.A == 1 && actionMasked == 0) {
            return true;
        }
        c.j.b.c cVar = this.B;
        if (cVar != null) {
            cVar.z(motionEvent);
        }
        if (actionMasked == 0) {
            Z();
        }
        if (this.L == null) {
            this.L = VelocityTracker.obtain();
        }
        this.L.addMovement(motionEvent);
        if (this.B != null && actionMasked == 2 && !this.C && Math.abs(this.N - motionEvent.getY()) > this.B.u()) {
            this.B.b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.C;
    }

    void T(int i2) {
        float f2;
        float fV;
        V v = this.I.get();
        if (v == null || this.K.isEmpty()) {
            return;
        }
        int i3 = this.v;
        if (i2 > i3 || i3 == V()) {
            int i4 = this.v;
            f2 = i4 - i2;
            fV = this.H - i4;
        } else {
            int i5 = this.v;
            f2 = i5 - i2;
            fV = i5 - V();
        }
        float f3 = f2 / fV;
        for (int i6 = 0; i6 < this.K.size(); i6++) {
            this.K.get(i6).a(v, f3);
        }
    }

    View U(View view) {
        if (t.R(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View viewU = U(viewGroup.getChildAt(i2));
            if (viewU != null) {
                return viewU;
            }
        }
        return null;
    }

    public int V() {
        return this.f11473c ? this.s : this.r;
    }

    public boolean X() {
        return this.f11483m;
    }

    public void b0(boolean z) {
        this.z = z;
    }

    public void c0(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.r = i2;
    }

    public void d0(boolean z) {
        if (this.f11473c == z) {
            return;
        }
        this.f11473c = z;
        if (this.I != null) {
            M();
        }
        m0((this.f11473c && this.A == 6) ? 3 : this.A);
        s0();
    }

    public void e0(boolean z) {
        this.f11483m = z;
    }

    public void f0(float f2) {
        if (f2 <= 0.0f || f2 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.u = f2;
        if (this.I != null) {
            N();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.I = null;
        this.B = null;
    }

    public void g0(boolean z) {
        if (this.x != z) {
            this.x = z;
            if (!z && this.A == 5) {
                l0(4);
            }
            s0();
        }
    }

    public void h0(int i2) {
        i0(i2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i0(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto Lc
            boolean r4 = r3.f11477g
            if (r4 != 0) goto L15
            r3.f11477g = r0
            goto L1f
        Lc:
            boolean r2 = r3.f11477g
            if (r2 != 0) goto L17
            int r2 = r3.f11476f
            if (r2 == r4) goto L15
            goto L17
        L15:
            r0 = 0
            goto L1f
        L17:
            r3.f11477g = r1
            int r4 = java.lang.Math.max(r1, r4)
            r3.f11476f = r4
        L1f:
            if (r0 == 0) goto L24
            r3.v0(r5)
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.i0(int, boolean):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void j() {
        super.j();
        this.I = null;
        this.B = null;
    }

    public void j0(int i2) {
        this.f11472b = i2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        c.j.b.c cVar;
        if (!v.isShown() || !this.z) {
            this.C = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            Z();
        }
        if (this.L == null) {
            this.L = VelocityTracker.obtain();
        }
        this.L.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.N = (int) motionEvent.getY();
            if (this.A != 2) {
                WeakReference<View> weakReference = this.J;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.B(view, x, this.N)) {
                    this.M = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.O = true;
                }
            }
            this.C = this.M == -1 && !coordinatorLayout.B(v, x, this.N);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.O = false;
            this.M = -1;
            if (this.C) {
                this.C = false;
                return false;
            }
        }
        if (!this.C && (cVar = this.B) != null && cVar.G(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.J;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.C || this.A == 1 || coordinatorLayout.B(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.B == null || Math.abs(((float) this.N) - motionEvent.getY()) <= ((float) this.B.u())) ? false : true;
    }

    public void k0(boolean z) {
        this.y = z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i2) {
        e.c.b.c.c0.g gVar;
        if (t.y(coordinatorLayout) && !t.y(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.I == null) {
            this.f11478h = coordinatorLayout.getResources().getDimensionPixelSize(e.c.b.c.d.f15184b);
            n0(v);
            this.I = new WeakReference<>(v);
            if (this.f11480j && (gVar = this.f11481k) != null) {
                t.n0(v, gVar);
            }
            e.c.b.c.c0.g gVar2 = this.f11481k;
            if (gVar2 != null) {
                float fW = this.w;
                if (fW == -1.0f) {
                    fW = t.w(v);
                }
                gVar2.W(fW);
                boolean z = this.A == 3;
                this.o = z;
                this.f11481k.Y(z ? 0.0f : 1.0f);
            }
            s0();
            if (t.z(v) == 0) {
                t.u0(v, 1);
            }
        }
        if (this.B == null) {
            this.B = c.j.b.c.m(coordinatorLayout, this.R);
        }
        int top = v.getTop();
        coordinatorLayout.I(v, i2);
        this.G = coordinatorLayout.getWidth();
        this.H = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.F = height;
        this.s = Math.max(0, this.H - height);
        N();
        M();
        int i3 = this.A;
        if (i3 == 3) {
            t.W(v, V());
        } else if (i3 == 6) {
            t.W(v, this.t);
        } else if (this.x && i3 == 5) {
            t.W(v, this.H);
        } else if (i3 == 4) {
            t.W(v, this.v);
        } else if (i3 == 1 || i3 == 2) {
            t.W(v, top - v.getTop());
        }
        this.J = new WeakReference<>(U(v));
        return true;
    }

    public void l0(int i2) {
        if (i2 == this.A) {
            return;
        }
        if (this.I != null) {
            p0(i2);
            return;
        }
        if (i2 == 4 || i2 == 3 || i2 == 6 || (this.x && i2 == 5)) {
            this.A = i2;
        }
    }

    void m0(int i2) {
        V v;
        if (this.A == i2) {
            return;
        }
        this.A = i2;
        WeakReference<V> weakReference = this.I;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i2 == 3) {
            u0(true);
        } else if (i2 == 6 || i2 == 5 || i2 == 4) {
            u0(false);
        }
        t0(i2);
        for (int i3 = 0; i3 < this.K.size(); i3++) {
            this.K.get(i3).b(v, i2);
        }
        s0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, V v, View view, float f2, float f3) {
        WeakReference<View> weakReference = this.J;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        return this.A != 3 || super.o(coordinatorLayout, v, view, f2, f3);
    }

    void o0(View view, int i2) {
        int iV;
        int i3;
        if (i2 == 4) {
            iV = this.v;
        } else if (i2 == 6) {
            int i4 = this.t;
            if (!this.f11473c || i4 > (i3 = this.s)) {
                iV = i4;
            } else {
                iV = i3;
                i2 = 3;
            }
        } else if (i2 == 3) {
            iV = V();
        } else {
            if (!this.x || i2 != 5) {
                throw new IllegalArgumentException("Illegal state argument: " + i2);
            }
            iV = this.H;
        }
        r0(view, i2, iV, false);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void q(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.J;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i5 = top - i3;
        if (i3 > 0) {
            if (i5 < V()) {
                iArr[1] = top - V();
                t.W(v, -iArr[1]);
                m0(3);
            } else {
                if (!this.z) {
                    return;
                }
                iArr[1] = i3;
                t.W(v, -i3);
                m0(1);
            }
        } else if (i3 < 0 && !view.canScrollVertically(-1)) {
            int i6 = this.v;
            if (i5 > i6 && !this.x) {
                iArr[1] = top - i6;
                t.W(v, -iArr[1]);
                m0(4);
            } else {
                if (!this.z) {
                    return;
                }
                iArr[1] = i3;
                t.W(v, -i3);
                m0(1);
            }
        }
        T(v.getTop());
        this.D = i3;
        this.E = true;
    }

    boolean q0(View view, float f2) {
        if (this.y) {
            return true;
        }
        if (view.getTop() < this.v) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f2 * 0.1f)) - ((float) this.v)) / ((float) O()) > 0.5f;
    }

    void r0(View view, int i2, int i3, boolean z) {
        c.j.b.c cVar = this.B;
        if (!(cVar != null && (!z ? !cVar.H(view, view.getLeft(), i3) : !cVar.F(view.getLeft(), i3)))) {
            m0(i2);
            return;
        }
        m0(2);
        t0(i2);
        if (this.p == null) {
            this.p = new h(view, i2);
        }
        if (((h) this.p).f11494f) {
            this.p.f11495g = i2;
            return;
        }
        BottomSheetBehavior<V>.h hVar = this.p;
        hVar.f11495g = i2;
        t.c0(view, hVar);
        ((h) this.p).f11494f = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        g gVar = (g) parcelable;
        super.x(coordinatorLayout, v, gVar.a());
        a0(gVar);
        int i2 = gVar.f11488g;
        if (i2 == 1 || i2 == 2) {
            this.A = 4;
        } else {
            this.A = i2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable y(CoordinatorLayout coordinatorLayout, V v) {
        return new g(super.y(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    protected static class g extends c.j.a.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: g */
        final int f11488g;

        /* renamed from: h */
        int f11489h;

        /* renamed from: i */
        boolean f11490i;

        /* renamed from: j */
        boolean f11491j;

        /* renamed from: k */
        boolean f11492k;

        static class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public g[] newArray(int i2) {
                return new g[i2];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f11488g = parcel.readInt();
            this.f11489h = parcel.readInt();
            this.f11490i = parcel.readInt() == 1;
            this.f11491j = parcel.readInt() == 1;
            this.f11492k = parcel.readInt() == 1;
        }

        @Override // c.j.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f11488g);
            parcel.writeInt(this.f11489h);
            parcel.writeInt(this.f11490i ? 1 : 0);
            parcel.writeInt(this.f11491j ? 1 : 0);
            parcel.writeInt(this.f11492k ? 1 : 0);
        }

        public g(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f11488g = bottomSheetBehavior.A;
            this.f11489h = ((BottomSheetBehavior) bottomSheetBehavior).f11476f;
            this.f11490i = ((BottomSheetBehavior) bottomSheetBehavior).f11473c;
            this.f11491j = bottomSheetBehavior.x;
            this.f11492k = ((BottomSheetBehavior) bottomSheetBehavior).y;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i2;
        super(context, attributeSet);
        this.f11472b = 0;
        this.f11473c = true;
        this.f11474d = false;
        this.p = null;
        this.u = 0.5f;
        this.w = -1.0f;
        this.z = true;
        this.A = 4;
        this.K = new ArrayList<>();
        this.Q = -1;
        this.R = new d();
        this.f11479i = context.getResources().getDimensionPixelSize(e.c.b.c.d.R);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.F);
        this.f11480j = typedArrayObtainStyledAttributes.hasValue(l.R);
        int i3 = l.H;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i3);
        if (zHasValue) {
            R(context, attributeSet, zHasValue, e.c.b.c.z.c.a(context, typedArrayObtainStyledAttributes, i3));
        } else {
            Q(context, attributeSet, zHasValue);
        }
        S();
        if (Build.VERSION.SDK_INT >= 21) {
            this.w = typedArrayObtainStyledAttributes.getDimension(l.G, -1.0f);
        }
        int i4 = l.N;
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(i4);
        if (typedValuePeekValue != null && (i2 = typedValuePeekValue.data) == -1) {
            h0(i2);
        } else {
            h0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i4, -1));
        }
        g0(typedArrayObtainStyledAttributes.getBoolean(l.M, false));
        e0(typedArrayObtainStyledAttributes.getBoolean(l.Q, false));
        d0(typedArrayObtainStyledAttributes.getBoolean(l.K, true));
        k0(typedArrayObtainStyledAttributes.getBoolean(l.P, false));
        b0(typedArrayObtainStyledAttributes.getBoolean(l.I, true));
        j0(typedArrayObtainStyledAttributes.getInt(l.O, 0));
        f0(typedArrayObtainStyledAttributes.getFloat(l.L, 0.5f));
        int i5 = l.J;
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(i5);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            c0(typedValuePeekValue2.data);
        } else {
            c0(typedArrayObtainStyledAttributes.getDimensionPixelOffset(i5, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f11475e = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}