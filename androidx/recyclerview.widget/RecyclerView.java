package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.j;
import androidx.recyclerview.widget.r;
import androidx.recyclerview.widget.v;
import androidx.recyclerview.widget.w;
import c.h.l.c0.c;
import ch.qos.logback.classic.Level;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.ads.AdRequest;
import j$.util.Spliterator;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements c.h.l.j {

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f1515e = {R.attr.nestedScrollingEnabled};

    /* renamed from: f, reason: collision with root package name */
    static final boolean f1516f;

    /* renamed from: g, reason: collision with root package name */
    static final boolean f1517g;

    /* renamed from: h, reason: collision with root package name */
    static final boolean f1518h;

    /* renamed from: i, reason: collision with root package name */
    static final boolean f1519i;

    /* renamed from: j, reason: collision with root package name */
    private static final boolean f1520j;

    /* renamed from: k, reason: collision with root package name */
    private static final boolean f1521k;

    /* renamed from: l, reason: collision with root package name */
    private static final Class<?>[] f1522l;

    /* renamed from: m, reason: collision with root package name */
    static final Interpolator f1523m;
    w A;
    boolean A0;
    final ArrayList<n> B;
    androidx.recyclerview.widget.r B0;
    private final ArrayList<s> C;
    private j C0;
    private s D;
    private final int[] D0;
    boolean E;
    private c.h.l.k E0;
    boolean F;
    private final int[] F0;
    boolean G;
    private final int[] G0;
    boolean H;
    final int[] H0;
    private int I;
    final List<d0> I0;
    boolean J;
    private Runnable J0;
    boolean K;
    private final w.b K0;
    private boolean L;
    private int M;
    boolean N;
    private final AccessibilityManager O;
    private List<q> P;
    boolean Q;
    boolean R;
    private int S;
    private int T;
    private k U;
    private EdgeEffect V;
    private EdgeEffect W;
    private EdgeEffect a0;
    private EdgeEffect b0;
    l c0;
    private int d0;
    private int e0;
    private VelocityTracker f0;
    private int g0;
    private int h0;
    private int i0;
    private int j0;
    private int k0;
    private r l0;
    private final int m0;
    private final x n;
    private final int n0;
    final v o;
    private float o0;
    private y p;
    private float p0;
    androidx.recyclerview.widget.a q;
    private boolean q0;
    androidx.recyclerview.widget.f r;
    final c0 r0;
    final androidx.recyclerview.widget.w s;
    androidx.recyclerview.widget.j s0;
    boolean t;
    j.b t0;
    final Runnable u;
    final a0 u0;
    final Rect v;
    private t v0;
    private final Rect w;
    private List<t> w0;
    final RectF x;
    boolean x0;
    g y;
    boolean y0;
    o z;
    private l.b z0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.H || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.E) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.K) {
                recyclerView2.J = true;
            } else {
                recyclerView2.u();
            }
        }
    }

    public static class a0 {

        /* renamed from: b, reason: collision with root package name */
        private SparseArray<Object> f1525b;

        /* renamed from: m, reason: collision with root package name */
        int f1536m;
        long n;
        int o;
        int p;
        int q;
        int a = -1;

        /* renamed from: c, reason: collision with root package name */
        int f1526c = 0;

        /* renamed from: d, reason: collision with root package name */
        int f1527d = 0;

        /* renamed from: e, reason: collision with root package name */
        int f1528e = 1;

        /* renamed from: f, reason: collision with root package name */
        int f1529f = 0;

        /* renamed from: g, reason: collision with root package name */
        boolean f1530g = false;

        /* renamed from: h, reason: collision with root package name */
        boolean f1531h = false;

        /* renamed from: i, reason: collision with root package name */
        boolean f1532i = false;

        /* renamed from: j, reason: collision with root package name */
        boolean f1533j = false;

        /* renamed from: k, reason: collision with root package name */
        boolean f1534k = false;

        /* renamed from: l, reason: collision with root package name */
        boolean f1535l = false;

        void a(int i2) {
            if ((this.f1528e & i2) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i2) + " but it is " + Integer.toBinaryString(this.f1528e));
        }

        public int b() {
            return this.f1531h ? this.f1526c - this.f1527d : this.f1529f;
        }

        public int c() {
            return this.a;
        }

        public boolean d() {
            return this.a != -1;
        }

        public boolean e() {
            return this.f1531h;
        }

        void f(g gVar) {
            this.f1528e = 1;
            this.f1529f = gVar.e();
            this.f1531h = false;
            this.f1532i = false;
            this.f1533j = false;
        }

        public boolean g() {
            return this.f1535l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.a + ", mData=" + this.f1525b + ", mItemCount=" + this.f1529f + ", mIsMeasuring=" + this.f1533j + ", mPreviousLayoutItemCount=" + this.f1526c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f1527d + ", mStructureChanged=" + this.f1530g + ", mInPreLayout=" + this.f1531h + ", mRunSimpleAnimations=" + this.f1534k + ", mRunPredictiveAnimations=" + this.f1535l + CoreConstants.CURLY_RIGHT;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = RecyclerView.this.c0;
            if (lVar != null) {
                lVar.u();
            }
            RecyclerView.this.A0 = false;
        }
    }

    public static abstract class b0 {
    }

    static class c implements Interpolator {
        c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    class c0 implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        private int f1538e;

        /* renamed from: f, reason: collision with root package name */
        private int f1539f;

        /* renamed from: g, reason: collision with root package name */
        OverScroller f1540g;

        /* renamed from: h, reason: collision with root package name */
        Interpolator f1541h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f1542i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f1543j;

        c0() {
            Interpolator interpolator = RecyclerView.f1523m;
            this.f1541h = interpolator;
            this.f1542i = false;
            this.f1543j = false;
            this.f1540g = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i2, int i3, int i4, int i5) {
            int iRound;
            int iAbs = Math.abs(i2);
            int iAbs2 = Math.abs(i3);
            boolean z = iAbs > iAbs2;
            int iSqrt = (int) Math.sqrt((i4 * i4) + (i5 * i5));
            int iSqrt2 = (int) Math.sqrt((i2 * i2) + (i3 * i3));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i6 = width / 2;
            float f2 = width;
            float f3 = i6;
            float fB = f3 + (b(Math.min(1.0f, (iSqrt2 * 1.0f) / f2)) * f3);
            if (iSqrt > 0) {
                iRound = Math.round(Math.abs(fB / iSqrt) * 1000.0f) * 4;
            } else {
                if (!z) {
                    iAbs = iAbs2;
                }
                iRound = (int) (((iAbs / f2) + 1.0f) * 300.0f);
            }
            return Math.min(iRound, 2000);
        }

        private float b(float f2) {
            return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
        }

        private void d() {
            RecyclerView.this.removeCallbacks(this);
            c.h.l.t.c0(RecyclerView.this, this);
        }

        public void c(int i2, int i3) {
            RecyclerView.this.setScrollState(2);
            this.f1539f = 0;
            this.f1538e = 0;
            Interpolator interpolator = this.f1541h;
            Interpolator interpolator2 = RecyclerView.f1523m;
            if (interpolator != interpolator2) {
                this.f1541h = interpolator2;
                this.f1540g = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f1540g.fling(0, 0, i2, i3, Level.ALL_INT, Integer.MAX_VALUE, Level.ALL_INT, Integer.MAX_VALUE);
            e();
        }

        void e() {
            if (this.f1542i) {
                this.f1543j = true;
            } else {
                d();
            }
        }

        public void f(int i2, int i3, int i4, Interpolator interpolator) {
            if (i4 == Integer.MIN_VALUE) {
                i4 = a(i2, i3, 0, 0);
            }
            int i5 = i4;
            if (interpolator == null) {
                interpolator = RecyclerView.f1523m;
            }
            if (this.f1541h != interpolator) {
                this.f1541h = interpolator;
                this.f1540g = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f1539f = 0;
            this.f1538e = 0;
            RecyclerView.this.setScrollState(2);
            this.f1540g.startScroll(0, 0, i2, i3, i5);
            if (Build.VERSION.SDK_INT < 23) {
                this.f1540g.computeScrollOffset();
            }
            e();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i2;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.z == null) {
                stop();
                return;
            }
            this.f1543j = false;
            this.f1542i = true;
            recyclerView.u();
            OverScroller overScroller = this.f1540g;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.f1538e;
                int i5 = currY - this.f1539f;
                this.f1538e = currX;
                this.f1539f = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.H0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.F(i4, i5, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.H0;
                    i4 -= iArr2[0];
                    i5 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.t(i4, i5);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.y != null) {
                    int[] iArr3 = recyclerView3.H0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.h1(i4, i5, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.H0;
                    i3 = iArr4[0];
                    i2 = iArr4[1];
                    i4 -= i3;
                    i5 -= i2;
                    z zVar = recyclerView4.z.f1569k;
                    if (zVar != null && !zVar.g() && zVar.h()) {
                        int iB = RecyclerView.this.u0.b();
                        if (iB == 0) {
                            zVar.r();
                        } else if (zVar.f() >= iB) {
                            zVar.p(iB - 1);
                            zVar.j(i3, i2);
                        } else {
                            zVar.j(i3, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i3 = 0;
                }
                if (!RecyclerView.this.B.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.H0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.G(i3, i2, i4, i5, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.H0;
                int i6 = i4 - iArr6[0];
                int i7 = i5 - iArr6[1];
                if (i3 != 0 || i2 != 0) {
                    recyclerView6.I(i3, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i6 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i7 != 0));
                z zVar2 = RecyclerView.this.z.f1569k;
                if ((zVar2 != null && zVar2.g()) || !z) {
                    e();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.j jVar = recyclerView7.s0;
                    if (jVar != null) {
                        jVar.f(recyclerView7, i3, i2);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i8 = i6 < 0 ? -currVelocity : i6 > 0 ? currVelocity : 0;
                        if (i7 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i7 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.a(i8, currVelocity);
                    }
                    if (RecyclerView.f1519i) {
                        RecyclerView.this.t0.b();
                    }
                }
            }
            z zVar3 = RecyclerView.this.z.f1569k;
            if (zVar3 != null && zVar3.g()) {
                zVar3.j(0, 0);
            }
            this.f1542i = false;
            if (this.f1543j) {
                d();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.u1(1);
            }
        }

        public void stop() {
            RecyclerView.this.removeCallbacks(this);
            this.f1540g.abortAnimation();
        }
    }

    class d implements w.b {
        d() {
        }

        @Override // androidx.recyclerview.widget.w.b
        public void a(d0 d0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.z.u1(d0Var.f1546f, recyclerView.o);
        }

        @Override // androidx.recyclerview.widget.w.b
        public void b(d0 d0Var, l.c cVar, l.c cVar2) {
            RecyclerView.this.l(d0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.w.b
        public void c(d0 d0Var, l.c cVar, l.c cVar2) {
            RecyclerView.this.o.J(d0Var);
            RecyclerView.this.n(d0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.w.b
        public void d(d0 d0Var, l.c cVar, l.c cVar2) {
            d0Var.H(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.Q) {
                if (recyclerView.c0.b(d0Var, d0Var, cVar, cVar2)) {
                    RecyclerView.this.N0();
                }
            } else if (recyclerView.c0.d(d0Var, cVar, cVar2)) {
                RecyclerView.this.N0();
            }
        }
    }

    public static abstract class d0 {

        /* renamed from: e, reason: collision with root package name */
        private static final List<Object> f1545e = Collections.emptyList();

        /* renamed from: f, reason: collision with root package name */
        public final View f1546f;

        /* renamed from: g, reason: collision with root package name */
        WeakReference<RecyclerView> f1547g;
        int o;
        RecyclerView w;

        /* renamed from: h, reason: collision with root package name */
        int f1548h = -1;

        /* renamed from: i, reason: collision with root package name */
        int f1549i = -1;

        /* renamed from: j, reason: collision with root package name */
        long f1550j = -1;

        /* renamed from: k, reason: collision with root package name */
        int f1551k = -1;

        /* renamed from: l, reason: collision with root package name */
        int f1552l = -1;

        /* renamed from: m, reason: collision with root package name */
        d0 f1553m = null;
        d0 n = null;
        List<Object> p = null;
        List<Object> q = null;
        private int r = 0;
        v s = null;
        boolean t = false;
        private int u = 0;
        int v = -1;

        public d0(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f1546f = view;
        }

        private void h() {
            if (this.p == null) {
                ArrayList arrayList = new ArrayList();
                this.p = arrayList;
                this.q = Collections.unmodifiableList(arrayList);
            }
        }

        boolean A() {
            return (this.o & 2) != 0;
        }

        void B(int i2, boolean z) {
            if (this.f1549i == -1) {
                this.f1549i = this.f1548h;
            }
            if (this.f1552l == -1) {
                this.f1552l = this.f1548h;
            }
            if (z) {
                this.f1552l += i2;
            }
            this.f1548h += i2;
            if (this.f1546f.getLayoutParams() != null) {
                ((p) this.f1546f.getLayoutParams()).f1577g = true;
            }
        }

        void C(RecyclerView recyclerView) {
            int i2 = this.v;
            if (i2 != -1) {
                this.u = i2;
            } else {
                this.u = c.h.l.t.z(this.f1546f);
            }
            recyclerView.k1(this, 4);
        }

        void D(RecyclerView recyclerView) {
            recyclerView.k1(this, this.u);
            this.u = 0;
        }

        void E() {
            this.o = 0;
            this.f1548h = -1;
            this.f1549i = -1;
            this.f1550j = -1L;
            this.f1552l = -1;
            this.r = 0;
            this.f1553m = null;
            this.n = null;
            e();
            this.u = 0;
            this.v = -1;
            RecyclerView.r(this);
        }

        void F() {
            if (this.f1549i == -1) {
                this.f1549i = this.f1548h;
            }
        }

        void G(int i2, int i3) {
            this.o = (i2 & i3) | (this.o & (~i3));
        }

        public final void H(boolean z) {
            int i2 = this.r;
            int i3 = z ? i2 - 1 : i2 + 1;
            this.r = i3;
            if (i3 < 0) {
                this.r = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i3 == 1) {
                this.o |= 16;
            } else if (z && i3 == 0) {
                this.o &= -17;
            }
        }

        void I(v vVar, boolean z) {
            this.s = vVar;
            this.t = z;
        }

        boolean J() {
            return (this.o & 16) != 0;
        }

        boolean K() {
            return (this.o & 128) != 0;
        }

        void L() {
            this.s.J(this);
        }

        boolean M() {
            return (this.o & 32) != 0;
        }

        void b(Object obj) {
            if (obj == null) {
                c(Spliterator.IMMUTABLE);
            } else if ((1024 & this.o) == 0) {
                h();
                this.p.add(obj);
            }
        }

        void c(int i2) {
            this.o = i2 | this.o;
        }

        void d() {
            this.f1549i = -1;
            this.f1552l = -1;
        }

        void e() {
            List<Object> list = this.p;
            if (list != null) {
                list.clear();
            }
            this.o &= -1025;
        }

        void f() {
            this.o &= -33;
        }

        void g() {
            this.o &= -257;
        }

        boolean i() {
            return (this.o & 16) == 0 && c.h.l.t.N(this.f1546f);
        }

        void j(int i2, int i3, boolean z) {
            c(8);
            B(i3, z);
            this.f1548h = i2;
        }

        public final int k() {
            RecyclerView recyclerView = this.w;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.b0(this);
        }

        public final long l() {
            return this.f1550j;
        }

        public final int m() {
            return this.f1551k;
        }

        public final int n() {
            int i2 = this.f1552l;
            return i2 == -1 ? this.f1548h : i2;
        }

        public final int o() {
            return this.f1549i;
        }

        List<Object> p() {
            if ((this.o & Spliterator.IMMUTABLE) != 0) {
                return f1545e;
            }
            List<Object> list = this.p;
            return (list == null || list.size() == 0) ? f1545e : this.q;
        }

        boolean q(int i2) {
            return (i2 & this.o) != 0;
        }

        boolean r() {
            return (this.o & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 || u();
        }

        boolean s() {
            return (this.f1546f.getParent() == null || this.f1546f.getParent() == this.w) ? false : true;
        }

        boolean t() {
            return (this.o & 1) != 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f1548h + " id=" + this.f1550j + ", oldPos=" + this.f1549i + ", pLpos:" + this.f1552l);
            if (x()) {
                sb.append(" scrap ");
                sb.append(this.t ? "[changeScrap]" : "[attachedScrap]");
            }
            if (u()) {
                sb.append(" invalid");
            }
            if (!t()) {
                sb.append(" unbound");
            }
            if (A()) {
                sb.append(" update");
            }
            if (w()) {
                sb.append(" removed");
            }
            if (K()) {
                sb.append(" ignored");
            }
            if (y()) {
                sb.append(" tmpDetached");
            }
            if (!v()) {
                sb.append(" not recyclable(" + this.r + ")");
            }
            if (r()) {
                sb.append(" undefined adapter position");
            }
            if (this.f1546f.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        boolean u() {
            return (this.o & 4) != 0;
        }

        public final boolean v() {
            return (this.o & 16) == 0 && !c.h.l.t.N(this.f1546f);
        }

        boolean w() {
            return (this.o & 8) != 0;
        }

        boolean x() {
            return this.s != null;
        }

        boolean y() {
            return (this.o & 256) != 0;
        }

        boolean z() {
            return (this.o & 2) != 0;
        }
    }

    class e implements f.b {
        e() {
        }

        @Override // androidx.recyclerview.widget.f.b
        public View a(int i2) {
            return RecyclerView.this.getChildAt(i2);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void b(View view) {
            d0 d0VarG0 = RecyclerView.g0(view);
            if (d0VarG0 != null) {
                d0VarG0.C(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.f.b
        public int c() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.f.b
        public void d() {
            int iC = c();
            for (int i2 = 0; i2 < iC; i2++) {
                View viewA = a(i2);
                RecyclerView.this.z(viewA);
                viewA.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.f.b
        public int e(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.f.b
        public d0 f(View view) {
            return RecyclerView.g0(view);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void g(int i2) {
            d0 d0VarG0;
            View viewA = a(i2);
            if (viewA != null && (d0VarG0 = RecyclerView.g0(viewA)) != null) {
                if (d0VarG0.y() && !d0VarG0.K()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + d0VarG0 + RecyclerView.this.P());
                }
                d0VarG0.c(256);
            }
            RecyclerView.this.detachViewFromParent(i2);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void h(View view) {
            d0 d0VarG0 = RecyclerView.g0(view);
            if (d0VarG0 != null) {
                d0VarG0.D(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.f.b
        public void i(View view, int i2) {
            RecyclerView.this.addView(view, i2);
            RecyclerView.this.y(view);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void j(int i2) {
            View childAt = RecyclerView.this.getChildAt(i2);
            if (childAt != null) {
                RecyclerView.this.z(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i2);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void k(View view, int i2, ViewGroup.LayoutParams layoutParams) {
            d0 d0VarG0 = RecyclerView.g0(view);
            if (d0VarG0 != null) {
                if (!d0VarG0.y() && !d0VarG0.K()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + d0VarG0 + RecyclerView.this.P());
                }
                d0VarG0.g();
            }
            RecyclerView.this.attachViewToParent(view, i2, layoutParams);
        }
    }

    class f implements a.InterfaceC0023a {
        f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0023a
        public void a(int i2, int i3) {
            RecyclerView.this.D0(i2, i3);
            RecyclerView.this.x0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0023a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0023a
        public void c(int i2, int i3, Object obj) {
            RecyclerView.this.x1(i2, i3, obj);
            RecyclerView.this.y0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0023a
        public void d(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0023a
        public d0 e(int i2) {
            d0 d0VarZ = RecyclerView.this.Z(i2, true);
            if (d0VarZ == null || RecyclerView.this.r.n(d0VarZ.f1546f)) {
                return null;
            }
            return d0VarZ;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0023a
        public void f(int i2, int i3) {
            RecyclerView.this.E0(i2, i3, false);
            RecyclerView.this.x0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0023a
        public void g(int i2, int i3) {
            RecyclerView.this.C0(i2, i3);
            RecyclerView.this.x0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0023a
        public void h(int i2, int i3) {
            RecyclerView.this.E0(i2, i3, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.x0 = true;
            recyclerView.u0.f1527d += i3;
        }

        void i(a.b bVar) {
            int i2 = bVar.a;
            if (i2 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.z.Y0(recyclerView, bVar.f1640b, bVar.f1642d);
                return;
            }
            if (i2 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.z.b1(recyclerView2, bVar.f1640b, bVar.f1642d);
            } else if (i2 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.z.d1(recyclerView3, bVar.f1640b, bVar.f1642d, bVar.f1641c);
            } else {
                if (i2 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.z.a1(recyclerView4, bVar.f1640b, bVar.f1642d, 1);
            }
        }
    }

    public static abstract class g<VH extends d0> {
        private final h a = new h();

        /* renamed from: b, reason: collision with root package name */
        private boolean f1554b = false;

        public void A(i iVar) {
            this.a.unregisterObserver(iVar);
        }

        public final void c(VH vh, int i2) {
            vh.f1548h = i2;
            if (i()) {
                vh.f1550j = f(i2);
            }
            vh.G(1, 519);
            c.h.h.g.a("RV OnBindView");
            r(vh, i2, vh.p());
            vh.e();
            ViewGroup.LayoutParams layoutParams = vh.f1546f.getLayoutParams();
            if (layoutParams instanceof p) {
                ((p) layoutParams).f1577g = true;
            }
            c.h.h.g.b();
        }

        public final VH d(ViewGroup viewGroup, int i2) {
            try {
                c.h.h.g.a("RV CreateView");
                VH vh = (VH) s(viewGroup, i2);
                if (vh.f1546f.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                vh.f1551k = i2;
                return vh;
            } finally {
                c.h.h.g.b();
            }
        }

        public abstract int e();

        public long f(int i2) {
            return -1L;
        }

        public int g(int i2) {
            return 0;
        }

        public final boolean h() {
            return this.a.a();
        }

        public final boolean i() {
            return this.f1554b;
        }

        public final void j() {
            this.a.b();
        }

        public final void k(int i2, Object obj) {
            this.a.d(i2, 1, obj);
        }

        public final void l(int i2, int i3) {
            this.a.c(i2, i3);
        }

        public final void m(int i2, int i3, Object obj) {
            this.a.d(i2, i3, obj);
        }

        public final void n(int i2, int i3) {
            this.a.e(i2, i3);
        }

        public final void o(int i2, int i3) {
            this.a.f(i2, i3);
        }

        public void p(RecyclerView recyclerView) {
        }

        public abstract void q(VH vh, int i2);

        public void r(VH vh, int i2, List<Object> list) {
            q(vh, i2);
        }

        public abstract VH s(ViewGroup viewGroup, int i2);

        public void t(RecyclerView recyclerView) {
        }

        public boolean u(VH vh) {
            return false;
        }

        public void v(VH vh) {
        }

        public void w(VH vh) {
        }

        public void x(VH vh) {
        }

        public void y(i iVar) {
            this.a.registerObserver(iVar);
        }

        public void z(boolean z) {
            if (h()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.f1554b = z;
        }
    }

    static class h extends Observable<i> {
        h() {
        }

        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int i2, int i3) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).e(i2, i3, 1);
            }
        }

        public void d(int i2, int i3, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).c(i2, i3, obj);
            }
        }

        public void e(int i2, int i3) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).d(i2, i3);
            }
        }

        public void f(int i2, int i3) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).f(i2, i3);
            }
        }
    }

    public static abstract class i {
        public void a() {
        }

        public void b(int i2, int i3) {
        }

        public void c(int i2, int i3, Object obj) {
            b(i2, i3);
        }

        public void d(int i2, int i3) {
        }

        public void e(int i2, int i3, int i4) {
        }

        public void f(int i2, int i3) {
        }
    }

    public interface j {
        int a(int i2, int i3);
    }

    public static class k {
        protected EdgeEffect a(RecyclerView recyclerView, int i2) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class l {
        private b a = null;

        /* renamed from: b, reason: collision with root package name */
        private ArrayList<a> f1555b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        private long f1556c = 120;

        /* renamed from: d, reason: collision with root package name */
        private long f1557d = 120;

        /* renamed from: e, reason: collision with root package name */
        private long f1558e = 250;

        /* renamed from: f, reason: collision with root package name */
        private long f1559f = 250;

        public interface a {
            void a();
        }

        interface b {
            void a(d0 d0Var);
        }

        public static class c {
            public int a;

            /* renamed from: b, reason: collision with root package name */
            public int f1560b;

            /* renamed from: c, reason: collision with root package name */
            public int f1561c;

            /* renamed from: d, reason: collision with root package name */
            public int f1562d;

            public c a(d0 d0Var) {
                return b(d0Var, 0);
            }

            public c b(d0 d0Var, int i2) {
                View view = d0Var.f1546f;
                this.a = view.getLeft();
                this.f1560b = view.getTop();
                this.f1561c = view.getRight();
                this.f1562d = view.getBottom();
                return this;
            }
        }

        static int e(d0 d0Var) {
            int i2 = d0Var.o & 14;
            if (d0Var.u()) {
                return 4;
            }
            if ((i2 & 4) != 0) {
                return i2;
            }
            int iO = d0Var.o();
            int iK = d0Var.k();
            return (iO == -1 || iK == -1 || iO == iK) ? i2 : i2 | 2048;
        }

        public abstract boolean a(d0 d0Var, c cVar, c cVar2);

        public abstract boolean b(d0 d0Var, d0 d0Var2, c cVar, c cVar2);

        public abstract boolean c(d0 d0Var, c cVar, c cVar2);

        public abstract boolean d(d0 d0Var, c cVar, c cVar2);

        public abstract boolean f(d0 d0Var);

        public boolean g(d0 d0Var, List<Object> list) {
            return f(d0Var);
        }

        public final void h(d0 d0Var) {
            r(d0Var);
            b bVar = this.a;
            if (bVar != null) {
                bVar.a(d0Var);
            }
        }

        public final void i() {
            int size = this.f1555b.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f1555b.get(i2).a();
            }
            this.f1555b.clear();
        }

        public abstract void j(d0 d0Var);

        public abstract void k();

        public long l() {
            return this.f1556c;
        }

        public long m() {
            return this.f1559f;
        }

        public long n() {
            return this.f1558e;
        }

        public long o() {
            return this.f1557d;
        }

        public abstract boolean p();

        public c q() {
            return new c();
        }

        public void r(d0 d0Var) {
        }

        public c s(a0 a0Var, d0 d0Var) {
            return q().a(d0Var);
        }

        public c t(a0 a0Var, d0 d0Var, int i2, List<Object> list) {
            return q().a(d0Var);
        }

        public abstract void u();

        void v(b bVar) {
            this.a = bVar;
        }
    }

    private class m implements l.b {
        m() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l.b
        public void a(d0 d0Var) {
            d0Var.H(true);
            if (d0Var.f1553m != null && d0Var.n == null) {
                d0Var.f1553m = null;
            }
            d0Var.n = null;
            if (d0Var.J() || RecyclerView.this.W0(d0Var.f1546f) || !d0Var.y()) {
                return;
            }
            RecyclerView.this.removeDetachedView(d0Var.f1546f, false);
        }
    }

    public static abstract class n {
        @Deprecated
        public void d(Rect rect, int i2, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void e(Rect rect, View view, RecyclerView recyclerView, a0 a0Var) {
            d(rect, ((p) view.getLayoutParams()).a(), recyclerView);
        }

        @Deprecated
        public void f(Canvas canvas, RecyclerView recyclerView) {
        }

        public void g(Canvas canvas, RecyclerView recyclerView, a0 a0Var) {
            f(canvas, recyclerView);
        }

        @Deprecated
        public void h(Canvas canvas, RecyclerView recyclerView) {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, a0 a0Var) {
            h(canvas, recyclerView);
        }
    }

    public static abstract class o {

        /* renamed from: e, reason: collision with root package name */
        androidx.recyclerview.widget.f f1563e;

        /* renamed from: f, reason: collision with root package name */
        RecyclerView f1564f;

        /* renamed from: g, reason: collision with root package name */
        private final v.b f1565g;

        /* renamed from: h, reason: collision with root package name */
        private final v.b f1566h;

        /* renamed from: i, reason: collision with root package name */
        androidx.recyclerview.widget.v f1567i;

        /* renamed from: j, reason: collision with root package name */
        androidx.recyclerview.widget.v f1568j;

        /* renamed from: k, reason: collision with root package name */
        z f1569k;

        /* renamed from: l, reason: collision with root package name */
        boolean f1570l;

        /* renamed from: m, reason: collision with root package name */
        boolean f1571m;
        boolean n;
        private boolean o;
        private boolean p;
        int q;
        boolean r;
        private int s;
        private int t;
        private int u;
        private int v;

        class a implements v.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.v.b
            public View a(int i2) {
                return o.this.S(i2);
            }

            @Override // androidx.recyclerview.widget.v.b
            public int b(View view) {
                return o.this.a0(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.v.b
            public int c() {
                return o.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.v.b
            public int d() {
                return o.this.u0() - o.this.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.v.b
            public int e(View view) {
                return o.this.d0(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).rightMargin;
            }
        }

        class b implements v.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.v.b
            public View a(int i2) {
                return o.this.S(i2);
            }

            @Override // androidx.recyclerview.widget.v.b
            public int b(View view) {
                return o.this.e0(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.v.b
            public int c() {
                return o.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.v.b
            public int d() {
                return o.this.g0() - o.this.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.v.b
            public int e(View view) {
                return o.this.Y(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface c {
            void a(int i2, int i3);
        }

        public static class d {
            public int a;

            /* renamed from: b, reason: collision with root package name */
            public int f1572b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f1573c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f1574d;
        }

        public o() {
            a aVar = new a();
            this.f1565g = aVar;
            b bVar = new b();
            this.f1566h = bVar;
            this.f1567i = new androidx.recyclerview.widget.v(aVar);
            this.f1568j = new androidx.recyclerview.widget.v(bVar);
            this.f1570l = false;
            this.f1571m = false;
            this.n = false;
            this.o = true;
            this.p = true;
        }

        private static boolean D0(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (i4 > 0 && i2 != i4) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i2;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i2;
            }
            return true;
        }

        private void D1(v vVar, int i2, View view) {
            d0 d0VarG0 = RecyclerView.g0(view);
            if (d0VarG0.K()) {
                return;
            }
            if (d0VarG0.u() && !d0VarG0.w() && !this.f1564f.y.i()) {
                y1(i2);
                vVar.C(d0VarG0);
            } else {
                H(i2);
                vVar.D(view);
                this.f1564f.s.k(d0VarG0);
            }
        }

        private void I(int i2, View view) {
            this.f1563e.d(i2);
        }

        public static int U(int i2, int i3, int i4, int i5, boolean z) {
            int iMax = Math.max(0, i2 - i4);
            if (z) {
                if (i5 < 0) {
                    if (i5 != -1 || (i3 != Integer.MIN_VALUE && (i3 == 0 || i3 != 1073741824))) {
                        i3 = 0;
                        i5 = 0;
                    } else {
                        i5 = iMax;
                    }
                }
                i3 = 1073741824;
            } else {
                if (i5 < 0) {
                    if (i5 != -1) {
                        if (i5 == -2) {
                            i3 = (i3 == Integer.MIN_VALUE || i3 == 1073741824) ? Level.ALL_INT : 0;
                        }
                        i3 = 0;
                        i5 = 0;
                    }
                    i5 = iMax;
                }
                i3 = 1073741824;
            }
            return View.MeasureSpec.makeMeasureSpec(i5, i3);
        }

        private int[] V(View view, Rect rect) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int iU0 = u0() - getPaddingRight();
            int iG0 = g0() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i2 = left - paddingLeft;
            int iMin = Math.min(0, i2);
            int i3 = top - paddingTop;
            int iMin2 = Math.min(0, i3);
            int i4 = iWidth - iU0;
            int iMax = Math.max(0, i4);
            int iMax2 = Math.max(0, iHeight - iG0);
            if (j0() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i2, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i4);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i3, iMax2);
            }
            iArr[0] = iMax;
            iArr[1] = iMin2;
            return iArr;
        }

        public static d o0(Context context, AttributeSet attributeSet, int i2, int i3) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.q.c.f3293f, i2, i3);
            dVar.a = typedArrayObtainStyledAttributes.getInt(c.q.c.f3294g, 1);
            dVar.f1572b = typedArrayObtainStyledAttributes.getInt(c.q.c.q, 1);
            dVar.f1573c = typedArrayObtainStyledAttributes.getBoolean(c.q.c.p, false);
            dVar.f1574d = typedArrayObtainStyledAttributes.getBoolean(c.q.c.r, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        private void p(View view, int i2, boolean z) {
            d0 d0VarG0 = RecyclerView.g0(view);
            if (z || d0VarG0.w()) {
                this.f1564f.s.b(d0VarG0);
            } else {
                this.f1564f.s.p(d0VarG0);
            }
            p pVar = (p) view.getLayoutParams();
            if (d0VarG0.M() || d0VarG0.x()) {
                if (d0VarG0.x()) {
                    d0VarG0.L();
                } else {
                    d0VarG0.f();
                }
                this.f1563e.c(view, i2, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f1564f) {
                int iM = this.f1563e.m(view);
                if (i2 == -1) {
                    i2 = this.f1563e.g();
                }
                if (iM == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f1564f.indexOfChild(view) + this.f1564f.P());
                }
                if (iM != i2) {
                    this.f1564f.z.I0(iM, i2);
                }
            } else {
                this.f1563e.a(view, i2, false);
                pVar.f1577g = true;
                z zVar = this.f1569k;
                if (zVar != null && zVar.h()) {
                    this.f1569k.k(view);
                }
            }
            if (pVar.f1578h) {
                d0VarG0.f1546f.invalidate();
                pVar.f1578h = false;
            }
        }

        public static int x(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i3, i4) : size : Math.min(size, Math.max(i3, i4));
        }

        private boolean z0(RecyclerView recyclerView, int i2, int i3) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int iU0 = u0() - getPaddingRight();
            int iG0 = g0() - getPaddingBottom();
            Rect rect = this.f1564f.v;
            Z(focusedChild, rect);
            return rect.left - i2 < iU0 && rect.right - i2 > paddingLeft && rect.top - i3 < iG0 && rect.bottom - i3 > paddingTop;
        }

        public int A(a0 a0Var) {
            return 0;
        }

        public final boolean A0() {
            return this.p;
        }

        public boolean A1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] iArrV = V(view, rect);
            int i2 = iArrV[0];
            int i3 = iArrV[1];
            if ((z2 && !z0(recyclerView, i2, i3)) || (i2 == 0 && i3 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i2, i3);
            } else {
                recyclerView.m1(i2, i3);
            }
            return true;
        }

        public int B(a0 a0Var) {
            return 0;
        }

        public boolean B0(v vVar, a0 a0Var) {
            return false;
        }

        public void B1() {
            RecyclerView recyclerView = this.f1564f;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int C(a0 a0Var) {
            return 0;
        }

        public boolean C0() {
            return this.o;
        }

        public void C1() {
            this.f1570l = true;
        }

        public int D(a0 a0Var) {
            return 0;
        }

        public int E(a0 a0Var) {
            return 0;
        }

        public boolean E0() {
            z zVar = this.f1569k;
            return zVar != null && zVar.h();
        }

        public int E1(int i2, v vVar, a0 a0Var) {
            return 0;
        }

        public int F(a0 a0Var) {
            return 0;
        }

        public boolean F0(View view, boolean z, boolean z2) {
            boolean z3 = this.f1567i.b(view, 24579) && this.f1568j.b(view, 24579);
            return z ? z3 : !z3;
        }

        public void F1(int i2) {
        }

        public void G(v vVar) {
            for (int iT = T() - 1; iT >= 0; iT--) {
                D1(vVar, iT, S(iT));
            }
        }

        public void G0(View view, int i2, int i3, int i4, int i5) {
            p pVar = (p) view.getLayoutParams();
            Rect rect = pVar.f1576f;
            view.layout(i2 + rect.left + ((ViewGroup.MarginLayoutParams) pVar).leftMargin, i3 + rect.top + ((ViewGroup.MarginLayoutParams) pVar).topMargin, (i4 - rect.right) - ((ViewGroup.MarginLayoutParams) pVar).rightMargin, (i5 - rect.bottom) - ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
        }

        public int G1(int i2, v vVar, a0 a0Var) {
            return 0;
        }

        public void H(int i2) {
            I(i2, S(i2));
        }

        public void H0(View view, int i2, int i3) {
            p pVar = (p) view.getLayoutParams();
            Rect rectK0 = this.f1564f.k0(view);
            int i4 = i2 + rectK0.left + rectK0.right;
            int i5 = i3 + rectK0.top + rectK0.bottom;
            int iU = U(u0(), v0(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin + i4, ((ViewGroup.MarginLayoutParams) pVar).width, u());
            int iU2 = U(g0(), h0(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin + i5, ((ViewGroup.MarginLayoutParams) pVar).height, v());
            if (O1(view, iU, iU2, pVar)) {
                view.measure(iU, iU2);
            }
        }

        @Deprecated
        public void H1(boolean z) {
            this.n = z;
        }

        public void I0(int i2, int i3) {
            View viewS = S(i2);
            if (viewS != null) {
                H(i2);
                r(viewS, i3);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i2 + this.f1564f.toString());
            }
        }

        void I1(RecyclerView recyclerView) {
            J1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        void J(RecyclerView recyclerView) {
            this.f1571m = true;
            N0(recyclerView);
        }

        public void J0(int i2) {
            RecyclerView recyclerView = this.f1564f;
            if (recyclerView != null) {
                recyclerView.A0(i2);
            }
        }

        void J1(int i2, int i3) {
            this.u = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            this.s = mode;
            if (mode == 0 && !RecyclerView.f1517g) {
                this.u = 0;
            }
            this.v = View.MeasureSpec.getSize(i3);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.t = mode2;
            if (mode2 != 0 || RecyclerView.f1517g) {
                return;
            }
            this.v = 0;
        }

        void K(RecyclerView recyclerView, v vVar) {
            this.f1571m = false;
            P0(recyclerView, vVar);
        }

        public void K0(int i2) {
            RecyclerView recyclerView = this.f1564f;
            if (recyclerView != null) {
                recyclerView.B0(i2);
            }
        }

        public void K1(int i2, int i3) {
            this.f1564f.setMeasuredDimension(i2, i3);
        }

        public View L(View view) {
            View viewR;
            RecyclerView recyclerView = this.f1564f;
            if (recyclerView == null || (viewR = recyclerView.R(view)) == null || this.f1563e.n(viewR)) {
                return null;
            }
            return viewR;
        }

        public void L0(g gVar, g gVar2) {
        }

        public void L1(Rect rect, int i2, int i3) {
            K1(x(i2, rect.width() + getPaddingLeft() + getPaddingRight(), m0()), x(i3, rect.height() + getPaddingTop() + getPaddingBottom(), l0()));
        }

        public View M(int i2) {
            int iT = T();
            for (int i3 = 0; i3 < iT; i3++) {
                View viewS = S(i3);
                d0 d0VarG0 = RecyclerView.g0(viewS);
                if (d0VarG0 != null && d0VarG0.n() == i2 && !d0VarG0.K() && (this.f1564f.u0.e() || !d0VarG0.w())) {
                    return viewS;
                }
            }
            return null;
        }

        public boolean M0(RecyclerView recyclerView, ArrayList<View> arrayList, int i2, int i3) {
            return false;
        }

        void M1(int i2, int i3) {
            int iT = T();
            if (iT == 0) {
                this.f1564f.w(i2, i3);
                return;
            }
            int i4 = Level.ALL_INT;
            int i5 = Level.ALL_INT;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MAX_VALUE;
            for (int i8 = 0; i8 < iT; i8++) {
                View viewS = S(i8);
                Rect rect = this.f1564f.v;
                Z(viewS, rect);
                int i9 = rect.left;
                if (i9 < i6) {
                    i6 = i9;
                }
                int i10 = rect.right;
                if (i10 > i4) {
                    i4 = i10;
                }
                int i11 = rect.top;
                if (i11 < i7) {
                    i7 = i11;
                }
                int i12 = rect.bottom;
                if (i12 > i5) {
                    i5 = i12;
                }
            }
            this.f1564f.v.set(i6, i7, i4, i5);
            L1(this.f1564f.v, i2, i3);
        }

        public abstract p N();

        public void N0(RecyclerView recyclerView) {
        }

        void N1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f1564f = null;
                this.f1563e = null;
                this.u = 0;
                this.v = 0;
            } else {
                this.f1564f = recyclerView;
                this.f1563e = recyclerView.r;
                this.u = recyclerView.getWidth();
                this.v = recyclerView.getHeight();
            }
            this.s = 1073741824;
            this.t = 1073741824;
        }

        public p O(Context context, AttributeSet attributeSet) {
            return new p(context, attributeSet);
        }

        @Deprecated
        public void O0(RecyclerView recyclerView) {
        }

        boolean O1(View view, int i2, int i3, p pVar) {
            return (!view.isLayoutRequested() && this.o && D0(view.getWidth(), i2, ((ViewGroup.MarginLayoutParams) pVar).width) && D0(view.getHeight(), i3, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public p P(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof p ? new p((p) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new p((ViewGroup.MarginLayoutParams) layoutParams) : new p(layoutParams);
        }

        public void P0(RecyclerView recyclerView, v vVar) {
            O0(recyclerView);
        }

        boolean P1() {
            return false;
        }

        public int Q() {
            return -1;
        }

        public View Q0(View view, int i2, v vVar, a0 a0Var) {
            return null;
        }

        boolean Q1(View view, int i2, int i3, p pVar) {
            return (this.o && D0(view.getMeasuredWidth(), i2, ((ViewGroup.MarginLayoutParams) pVar).width) && D0(view.getMeasuredHeight(), i3, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public int R(View view) {
            return ((p) view.getLayoutParams()).f1576f.bottom;
        }

        public void R0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f1564f;
            S0(recyclerView.o, recyclerView.u0, accessibilityEvent);
        }

        public void R1(RecyclerView recyclerView, a0 a0Var, int i2) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public View S(int i2) {
            androidx.recyclerview.widget.f fVar = this.f1563e;
            if (fVar != null) {
                return fVar.f(i2);
            }
            return null;
        }

        public void S0(v vVar, a0 a0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f1564f;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.f1564f.canScrollVertically(-1) && !this.f1564f.canScrollHorizontally(-1) && !this.f1564f.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            g gVar = this.f1564f.y;
            if (gVar != null) {
                accessibilityEvent.setItemCount(gVar.e());
            }
        }

        public void S1(z zVar) {
            z zVar2 = this.f1569k;
            if (zVar2 != null && zVar != zVar2 && zVar2.h()) {
                this.f1569k.r();
            }
            this.f1569k = zVar;
            zVar.q(this.f1564f, this);
        }

        public int T() {
            androidx.recyclerview.widget.f fVar = this.f1563e;
            if (fVar != null) {
                return fVar.g();
            }
            return 0;
        }

        void T0(c.h.l.c0.c cVar) {
            RecyclerView recyclerView = this.f1564f;
            U0(recyclerView.o, recyclerView.u0, cVar);
        }

        void T1() {
            z zVar = this.f1569k;
            if (zVar != null) {
                zVar.r();
            }
        }

        public void U0(v vVar, a0 a0Var, c.h.l.c0.c cVar) {
            if (this.f1564f.canScrollVertically(-1) || this.f1564f.canScrollHorizontally(-1)) {
                cVar.a(8192);
                cVar.r0(true);
            }
            if (this.f1564f.canScrollVertically(1) || this.f1564f.canScrollHorizontally(1)) {
                cVar.a(Spliterator.CONCURRENT);
                cVar.r0(true);
            }
            cVar.a0(c.b.a(q0(vVar, a0Var), X(vVar, a0Var), B0(vVar, a0Var), r0(vVar, a0Var)));
        }

        public boolean U1() {
            return false;
        }

        void V0(View view, c.h.l.c0.c cVar) {
            d0 d0VarG0 = RecyclerView.g0(view);
            if (d0VarG0 == null || d0VarG0.w() || this.f1563e.n(d0VarG0.f1546f)) {
                return;
            }
            RecyclerView recyclerView = this.f1564f;
            W0(recyclerView.o, recyclerView.u0, view, cVar);
        }

        public boolean W() {
            RecyclerView recyclerView = this.f1564f;
            return recyclerView != null && recyclerView.t;
        }

        public void W0(v vVar, a0 a0Var, View view, c.h.l.c0.c cVar) {
            cVar.b0(c.C0058c.f(v() ? n0(view) : 0, 1, u() ? n0(view) : 0, 1, false, false));
        }

        public int X(v vVar, a0 a0Var) {
            RecyclerView recyclerView = this.f1564f;
            if (recyclerView == null || recyclerView.y == null || !u()) {
                return 1;
            }
            return this.f1564f.y.e();
        }

        public View X0(View view, int i2) {
            return null;
        }

        public int Y(View view) {
            return view.getBottom() + R(view);
        }

        public void Y0(RecyclerView recyclerView, int i2, int i3) {
        }

        public void Z(View view, Rect rect) {
            RecyclerView.h0(view, rect);
        }

        public void Z0(RecyclerView recyclerView) {
        }

        public int a0(View view) {
            return view.getLeft() - k0(view);
        }

        public void a1(RecyclerView recyclerView, int i2, int i3, int i4) {
        }

        public int b0(View view) {
            Rect rect = ((p) view.getLayoutParams()).f1576f;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void b1(RecyclerView recyclerView, int i2, int i3) {
        }

        public int c0(View view) {
            Rect rect = ((p) view.getLayoutParams()).f1576f;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void c1(RecyclerView recyclerView, int i2, int i3) {
        }

        public int d0(View view) {
            return view.getRight() + p0(view);
        }

        public void d1(RecyclerView recyclerView, int i2, int i3, Object obj) {
            c1(recyclerView, i2, i3);
        }

        public int e0(View view) {
            return view.getTop() - s0(view);
        }

        public void e1(v vVar, a0 a0Var) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public View f0() {
            View focusedChild;
            RecyclerView recyclerView = this.f1564f;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f1563e.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void f1(a0 a0Var) {
        }

        public int g0() {
            return this.v;
        }

        public void g1(v vVar, a0 a0Var, int i2, int i3) {
            this.f1564f.w(i2, i3);
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.f1564f;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.f1564f;
            if (recyclerView != null) {
                return c.h.l.t.F(recyclerView);
            }
            return 0;
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.f1564f;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.f1564f;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.f1564f;
            if (recyclerView != null) {
                return c.h.l.t.G(recyclerView);
            }
            return 0;
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.f1564f;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int h0() {
            return this.t;
        }

        @Deprecated
        public boolean h1(RecyclerView recyclerView, View view, View view2) {
            return E0() || recyclerView.v0();
        }

        public int i0() {
            RecyclerView recyclerView = this.f1564f;
            g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.e();
            }
            return 0;
        }

        public boolean i1(RecyclerView recyclerView, a0 a0Var, View view, View view2) {
            return h1(recyclerView, view, view2);
        }

        public int j0() {
            return c.h.l.t.B(this.f1564f);
        }

        public void j1(Parcelable parcelable) {
        }

        public int k0(View view) {
            return ((p) view.getLayoutParams()).f1576f.left;
        }

        public Parcelable k1() {
            return null;
        }

        public void l(View view) {
            m(view, -1);
        }

        public int l0() {
            return c.h.l.t.C(this.f1564f);
        }

        public void l1(int i2) {
        }

        public void m(View view, int i2) {
            p(view, i2, true);
        }

        public int m0() {
            return c.h.l.t.D(this.f1564f);
        }

        void m1(z zVar) {
            if (this.f1569k == zVar) {
                this.f1569k = null;
            }
        }

        public void n(View view) {
            o(view, -1);
        }

        public int n0(View view) {
            return ((p) view.getLayoutParams()).a();
        }

        boolean n1(int i2, Bundle bundle) {
            RecyclerView recyclerView = this.f1564f;
            return o1(recyclerView.o, recyclerView.u0, i2, bundle);
        }

        public void o(View view, int i2) {
            p(view, i2, false);
        }

        public boolean o1(v vVar, a0 a0Var, int i2, Bundle bundle) {
            int iG0;
            int iU0;
            int i3;
            int i4;
            RecyclerView recyclerView = this.f1564f;
            if (recyclerView == null) {
                return false;
            }
            if (i2 == 4096) {
                iG0 = recyclerView.canScrollVertically(1) ? (g0() - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.f1564f.canScrollHorizontally(1)) {
                    iU0 = (u0() - getPaddingLeft()) - getPaddingRight();
                    i3 = iG0;
                    i4 = iU0;
                }
                i3 = iG0;
                i4 = 0;
            } else if (i2 != 8192) {
                i4 = 0;
                i3 = 0;
            } else {
                iG0 = recyclerView.canScrollVertically(-1) ? -((g0() - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.f1564f.canScrollHorizontally(-1)) {
                    iU0 = -((u0() - getPaddingLeft()) - getPaddingRight());
                    i3 = iG0;
                    i4 = iU0;
                }
                i3 = iG0;
                i4 = 0;
            }
            if (i3 == 0 && i4 == 0) {
                return false;
            }
            this.f1564f.p1(i4, i3, null, Level.ALL_INT, true);
            return true;
        }

        public int p0(View view) {
            return ((p) view.getLayoutParams()).f1576f.right;
        }

        boolean p1(View view, int i2, Bundle bundle) {
            RecyclerView recyclerView = this.f1564f;
            return q1(recyclerView.o, recyclerView.u0, view, i2, bundle);
        }

        public void q(String str) {
            RecyclerView recyclerView = this.f1564f;
            if (recyclerView != null) {
                recyclerView.o(str);
            }
        }

        public int q0(v vVar, a0 a0Var) {
            RecyclerView recyclerView = this.f1564f;
            if (recyclerView == null || recyclerView.y == null || !v()) {
                return 1;
            }
            return this.f1564f.y.e();
        }

        public boolean q1(v vVar, a0 a0Var, View view, int i2, Bundle bundle) {
            return false;
        }

        public void r(View view, int i2) {
            s(view, i2, (p) view.getLayoutParams());
        }

        public int r0(v vVar, a0 a0Var) {
            return 0;
        }

        public void r1() {
            for (int iT = T() - 1; iT >= 0; iT--) {
                this.f1563e.q(iT);
            }
        }

        public void s(View view, int i2, p pVar) {
            d0 d0VarG0 = RecyclerView.g0(view);
            if (d0VarG0.w()) {
                this.f1564f.s.b(d0VarG0);
            } else {
                this.f1564f.s.p(d0VarG0);
            }
            this.f1563e.c(view, i2, pVar, d0VarG0.w());
        }

        public int s0(View view) {
            return ((p) view.getLayoutParams()).f1576f.top;
        }

        public void s1(v vVar) {
            for (int iT = T() - 1; iT >= 0; iT--) {
                if (!RecyclerView.g0(S(iT)).K()) {
                    v1(iT, vVar);
                }
            }
        }

        public void t(View view, Rect rect) {
            RecyclerView recyclerView = this.f1564f;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.k0(view));
            }
        }

        public void t0(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((p) view.getLayoutParams()).f1576f;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f1564f != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f1564f.x;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        void t1(v vVar) {
            int iJ = vVar.j();
            for (int i2 = iJ - 1; i2 >= 0; i2--) {
                View viewN = vVar.n(i2);
                d0 d0VarG0 = RecyclerView.g0(viewN);
                if (!d0VarG0.K()) {
                    d0VarG0.H(false);
                    if (d0VarG0.y()) {
                        this.f1564f.removeDetachedView(viewN, false);
                    }
                    l lVar = this.f1564f.c0;
                    if (lVar != null) {
                        lVar.j(d0VarG0);
                    }
                    d0VarG0.H(true);
                    vVar.y(viewN);
                }
            }
            vVar.e();
            if (iJ > 0) {
                this.f1564f.invalidate();
            }
        }

        public boolean u() {
            return false;
        }

        public int u0() {
            return this.u;
        }

        public void u1(View view, v vVar) {
            x1(view);
            vVar.B(view);
        }

        public boolean v() {
            return false;
        }

        public int v0() {
            return this.s;
        }

        public void v1(int i2, v vVar) {
            View viewS = S(i2);
            y1(i2);
            vVar.B(viewS);
        }

        public boolean w(p pVar) {
            return pVar != null;
        }

        boolean w0() {
            int iT = T();
            for (int i2 = 0; i2 < iT; i2++) {
                ViewGroup.LayoutParams layoutParams = S(i2).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean w1(Runnable runnable) {
            RecyclerView recyclerView = this.f1564f;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public boolean x0() {
            return this.f1571m;
        }

        public void x1(View view) {
            this.f1563e.p(view);
        }

        public void y(int i2, int i3, a0 a0Var, c cVar) {
        }

        public boolean y0() {
            return this.n;
        }

        public void y1(int i2) {
            if (S(i2) != null) {
                this.f1563e.q(i2);
            }
        }

        public void z(int i2, c cVar) {
        }

        public boolean z1(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return A1(recyclerView, view, rect, z, false);
        }
    }

    public interface q {
        void a(View view);

        void b(View view);
    }

    public static abstract class r {
        public abstract boolean a(int i2, int i3);
    }

    public interface s {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z);
    }

    public static abstract class t {
        public void a(RecyclerView recyclerView, int i2) {
        }

        public void b(RecyclerView recyclerView, int i2, int i3) {
        }
    }

    public static class u {
        SparseArray<a> a = new SparseArray<>();

        /* renamed from: b, reason: collision with root package name */
        private int f1579b = 0;

        static class a {
            final ArrayList<d0> a = new ArrayList<>();

            /* renamed from: b, reason: collision with root package name */
            int f1580b = 5;

            /* renamed from: c, reason: collision with root package name */
            long f1581c = 0;

            /* renamed from: d, reason: collision with root package name */
            long f1582d = 0;

            a() {
            }
        }

        private a g(int i2) {
            a aVar = this.a.get(i2);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.a.put(i2, aVar2);
            return aVar2;
        }

        void a() {
            this.f1579b++;
        }

        public void b() {
            for (int i2 = 0; i2 < this.a.size(); i2++) {
                this.a.valueAt(i2).a.clear();
            }
        }

        void c() {
            this.f1579b--;
        }

        void d(int i2, long j2) {
            a aVarG = g(i2);
            aVarG.f1582d = j(aVarG.f1582d, j2);
        }

        void e(int i2, long j2) {
            a aVarG = g(i2);
            aVarG.f1581c = j(aVarG.f1581c, j2);
        }

        public d0 f(int i2) {
            a aVar = this.a.get(i2);
            if (aVar == null || aVar.a.isEmpty()) {
                return null;
            }
            ArrayList<d0> arrayList = aVar.a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).s()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        void h(g gVar, g gVar2, boolean z) {
            if (gVar != null) {
                c();
            }
            if (!z && this.f1579b == 0) {
                b();
            }
            if (gVar2 != null) {
                a();
            }
        }

        public void i(d0 d0Var) {
            int iM = d0Var.m();
            ArrayList<d0> arrayList = g(iM).a;
            if (this.a.get(iM).f1580b <= arrayList.size()) {
                return;
            }
            d0Var.E();
            arrayList.add(d0Var);
        }

        long j(long j2, long j3) {
            return j2 == 0 ? j3 : ((j2 / 4) * 3) + (j3 / 4);
        }

        boolean k(int i2, long j2, long j3) {
            long j4 = g(i2).f1582d;
            return j4 == 0 || j2 + j4 < j3;
        }

        boolean l(int i2, long j2, long j3) {
            long j4 = g(i2).f1581c;
            return j4 == 0 || j2 + j4 < j3;
        }
    }

    public final class v {
        final ArrayList<d0> a;

        /* renamed from: b, reason: collision with root package name */
        ArrayList<d0> f1583b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList<d0> f1584c;

        /* renamed from: d, reason: collision with root package name */
        private final List<d0> f1585d;

        /* renamed from: e, reason: collision with root package name */
        private int f1586e;

        /* renamed from: f, reason: collision with root package name */
        int f1587f;

        /* renamed from: g, reason: collision with root package name */
        u f1588g;

        /* renamed from: h, reason: collision with root package name */
        private b0 f1589h;

        public v() {
            ArrayList<d0> arrayList = new ArrayList<>();
            this.a = arrayList;
            this.f1583b = null;
            this.f1584c = new ArrayList<>();
            this.f1585d = Collections.unmodifiableList(arrayList);
            this.f1586e = 2;
            this.f1587f = 2;
        }

        private boolean H(d0 d0Var, int i2, int i3, long j2) {
            d0Var.w = RecyclerView.this;
            int iM = d0Var.m();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j2 != Long.MAX_VALUE && !this.f1588g.k(iM, nanoTime, j2)) {
                return false;
            }
            RecyclerView.this.y.c(d0Var, i2);
            this.f1588g.d(d0Var.m(), RecyclerView.this.getNanoTime() - nanoTime);
            b(d0Var);
            if (!RecyclerView.this.u0.e()) {
                return true;
            }
            d0Var.f1552l = i3;
            return true;
        }

        private void b(d0 d0Var) {
            if (RecyclerView.this.u0()) {
                View view = d0Var.f1546f;
                if (c.h.l.t.z(view) == 0) {
                    c.h.l.t.u0(view, 1);
                }
                androidx.recyclerview.widget.r rVar = RecyclerView.this.B0;
                if (rVar == null) {
                    return;
                }
                c.h.l.a aVarN = rVar.n();
                if (aVarN instanceof r.a) {
                    ((r.a) aVarN).o(view);
                }
                c.h.l.t.k0(view, aVarN);
            }
        }

        private void q(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        private void r(d0 d0Var) {
            View view = d0Var.f1546f;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        void A(int i2) {
            a(this.f1584c.get(i2), true);
            this.f1584c.remove(i2);
        }

        public void B(View view) {
            d0 d0VarG0 = RecyclerView.g0(view);
            if (d0VarG0.y()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (d0VarG0.x()) {
                d0VarG0.L();
            } else if (d0VarG0.M()) {
                d0VarG0.f();
            }
            C(d0VarG0);
            if (RecyclerView.this.c0 == null || d0VarG0.v()) {
                return;
            }
            RecyclerView.this.c0.j(d0VarG0);
        }

        void C(d0 d0Var) {
            boolean z;
            boolean z2 = true;
            if (d0Var.x() || d0Var.f1546f.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(d0Var.x());
                sb.append(" isAttached:");
                sb.append(d0Var.f1546f.getParent() != null);
                sb.append(RecyclerView.this.P());
                throw new IllegalArgumentException(sb.toString());
            }
            if (d0Var.y()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + d0Var + RecyclerView.this.P());
            }
            if (d0Var.K()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.P());
            }
            boolean zI = d0Var.i();
            g gVar = RecyclerView.this.y;
            if ((gVar != null && zI && gVar.u(d0Var)) || d0Var.v()) {
                if (this.f1587f <= 0 || d0Var.q(526)) {
                    z = false;
                } else {
                    int size = this.f1584c.size();
                    if (size >= this.f1587f && size > 0) {
                        A(0);
                        size--;
                    }
                    if (RecyclerView.f1519i && size > 0 && !RecyclerView.this.t0.d(d0Var.f1548h)) {
                        int i2 = size - 1;
                        while (i2 >= 0) {
                            if (!RecyclerView.this.t0.d(this.f1584c.get(i2).f1548h)) {
                                break;
                            } else {
                                i2--;
                            }
                        }
                        size = i2 + 1;
                    }
                    this.f1584c.add(size, d0Var);
                    z = true;
                }
                if (z) {
                    z = z;
                    z2 = false;
                } else {
                    a(d0Var, true);
                    z = z;
                }
            } else {
                z2 = false;
            }
            RecyclerView.this.s.q(d0Var);
            if (z || z2 || !zI) {
                return;
            }
            d0Var.w = null;
        }

        void D(View view) {
            d0 d0VarG0 = RecyclerView.g0(view);
            if (!d0VarG0.q(12) && d0VarG0.z() && !RecyclerView.this.p(d0VarG0)) {
                if (this.f1583b == null) {
                    this.f1583b = new ArrayList<>();
                }
                d0VarG0.I(this, true);
                this.f1583b.add(d0VarG0);
                return;
            }
            if (!d0VarG0.u() || d0VarG0.w() || RecyclerView.this.y.i()) {
                d0VarG0.I(this, false);
                this.a.add(d0VarG0);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.P());
            }
        }

        void E(u uVar) {
            u uVar2 = this.f1588g;
            if (uVar2 != null) {
                uVar2.c();
            }
            this.f1588g = uVar;
            if (uVar == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.f1588g.a();
        }

        void F(b0 b0Var) {
        }

        public void G(int i2) {
            this.f1586e = i2;
            K();
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0134 A[PHI: r1 r4
  0x0134: PHI (r1v12 androidx.recyclerview.widget.RecyclerView$d0) = (r1v11 androidx.recyclerview.widget.RecyclerView$d0), (r1v30 androidx.recyclerview.widget.RecyclerView$d0) binds: [B:28:0x005d, B:50:0x00b5] A[DONT_GENERATE, DONT_INLINE]
  0x0134: PHI (r4v3 boolean) = (r4v2 boolean), (r4v7 boolean) binds: [B:28:0x005d, B:50:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0155  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0181  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x01b1  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x01bf  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x01db A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:99:0x01de  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        androidx.recyclerview.widget.RecyclerView.d0 I(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 538
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v.I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$d0");
        }

        void J(d0 d0Var) {
            if (d0Var.t) {
                this.f1583b.remove(d0Var);
            } else {
                this.a.remove(d0Var);
            }
            d0Var.s = null;
            d0Var.t = false;
            d0Var.f();
        }

        void K() {
            o oVar = RecyclerView.this.z;
            this.f1587f = this.f1586e + (oVar != null ? oVar.q : 0);
            for (int size = this.f1584c.size() - 1; size >= 0 && this.f1584c.size() > this.f1587f; size--) {
                A(size);
            }
        }

        boolean L(d0 d0Var) {
            if (d0Var.w()) {
                return RecyclerView.this.u0.e();
            }
            int i2 = d0Var.f1548h;
            if (i2 >= 0 && i2 < RecyclerView.this.y.e()) {
                if (RecyclerView.this.u0.e() || RecyclerView.this.y.g(d0Var.f1548h) == d0Var.m()) {
                    return !RecyclerView.this.y.i() || d0Var.l() == RecyclerView.this.y.f(d0Var.f1548h);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + d0Var + RecyclerView.this.P());
        }

        void M(int i2, int i3) {
            int i4;
            int i5 = i3 + i2;
            for (int size = this.f1584c.size() - 1; size >= 0; size--) {
                d0 d0Var = this.f1584c.get(size);
                if (d0Var != null && (i4 = d0Var.f1548h) >= i2 && i4 < i5) {
                    d0Var.c(2);
                    A(size);
                }
            }
        }

        void a(d0 d0Var, boolean z) {
            RecyclerView.r(d0Var);
            View view = d0Var.f1546f;
            androidx.recyclerview.widget.r rVar = RecyclerView.this.B0;
            if (rVar != null) {
                c.h.l.a aVarN = rVar.n();
                c.h.l.t.k0(view, aVarN instanceof r.a ? ((r.a) aVarN).n(view) : null);
            }
            if (z) {
                g(d0Var);
            }
            d0Var.w = null;
            i().i(d0Var);
        }

        public void c() {
            this.a.clear();
            z();
        }

        void d() {
            int size = this.f1584c.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f1584c.get(i2).d();
            }
            int size2 = this.a.size();
            for (int i3 = 0; i3 < size2; i3++) {
                this.a.get(i3).d();
            }
            ArrayList<d0> arrayList = this.f1583b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    this.f1583b.get(i4).d();
                }
            }
        }

        void e() {
            this.a.clear();
            ArrayList<d0> arrayList = this.f1583b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i2) {
            if (i2 >= 0 && i2 < RecyclerView.this.u0.b()) {
                return !RecyclerView.this.u0.e() ? i2 : RecyclerView.this.q.m(i2);
            }
            throw new IndexOutOfBoundsException("invalid position " + i2 + ". State item count is " + RecyclerView.this.u0.b() + RecyclerView.this.P());
        }

        void g(d0 d0Var) {
            w wVar = RecyclerView.this.A;
            if (wVar != null) {
                wVar.a(d0Var);
            }
            g gVar = RecyclerView.this.y;
            if (gVar != null) {
                gVar.x(d0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.u0 != null) {
                recyclerView.s.q(d0Var);
            }
        }

        d0 h(int i2) {
            int size;
            int iM;
            ArrayList<d0> arrayList = this.f1583b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i3 = 0; i3 < size; i3++) {
                    d0 d0Var = this.f1583b.get(i3);
                    if (!d0Var.M() && d0Var.n() == i2) {
                        d0Var.c(32);
                        return d0Var;
                    }
                }
                if (RecyclerView.this.y.i() && (iM = RecyclerView.this.q.m(i2)) > 0 && iM < RecyclerView.this.y.e()) {
                    long jF = RecyclerView.this.y.f(iM);
                    for (int i4 = 0; i4 < size; i4++) {
                        d0 d0Var2 = this.f1583b.get(i4);
                        if (!d0Var2.M() && d0Var2.l() == jF) {
                            d0Var2.c(32);
                            return d0Var2;
                        }
                    }
                }
            }
            return null;
        }

        u i() {
            if (this.f1588g == null) {
                this.f1588g = new u();
            }
            return this.f1588g;
        }

        int j() {
            return this.a.size();
        }

        public List<d0> k() {
            return this.f1585d;
        }

        d0 l(long j2, int i2, boolean z) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                d0 d0Var = this.a.get(size);
                if (d0Var.l() == j2 && !d0Var.M()) {
                    if (i2 == d0Var.m()) {
                        d0Var.c(32);
                        if (d0Var.w() && !RecyclerView.this.u0.e()) {
                            d0Var.G(2, 14);
                        }
                        return d0Var;
                    }
                    if (!z) {
                        this.a.remove(size);
                        RecyclerView.this.removeDetachedView(d0Var.f1546f, false);
                        y(d0Var.f1546f);
                    }
                }
            }
            int size2 = this.f1584c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                d0 d0Var2 = this.f1584c.get(size2);
                if (d0Var2.l() == j2 && !d0Var2.s()) {
                    if (i2 == d0Var2.m()) {
                        if (!z) {
                            this.f1584c.remove(size2);
                        }
                        return d0Var2;
                    }
                    if (!z) {
                        A(size2);
                        return null;
                    }
                }
            }
        }

        d0 m(int i2, boolean z) {
            View viewE;
            int size = this.a.size();
            for (int i3 = 0; i3 < size; i3++) {
                d0 d0Var = this.a.get(i3);
                if (!d0Var.M() && d0Var.n() == i2 && !d0Var.u() && (RecyclerView.this.u0.f1531h || !d0Var.w())) {
                    d0Var.c(32);
                    return d0Var;
                }
            }
            if (z || (viewE = RecyclerView.this.r.e(i2)) == null) {
                int size2 = this.f1584c.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    d0 d0Var2 = this.f1584c.get(i4);
                    if (!d0Var2.u() && d0Var2.n() == i2 && !d0Var2.s()) {
                        if (!z) {
                            this.f1584c.remove(i4);
                        }
                        return d0Var2;
                    }
                }
                return null;
            }
            d0 d0VarG0 = RecyclerView.g0(viewE);
            RecyclerView.this.r.s(viewE);
            int iM = RecyclerView.this.r.m(viewE);
            if (iM != -1) {
                RecyclerView.this.r.d(iM);
                D(viewE);
                d0VarG0.c(8224);
                return d0VarG0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + d0VarG0 + RecyclerView.this.P());
        }

        View n(int i2) {
            return this.a.get(i2).f1546f;
        }

        public View o(int i2) {
            return p(i2, false);
        }

        View p(int i2, boolean z) {
            return I(i2, z, Long.MAX_VALUE).f1546f;
        }

        void s() {
            int size = this.f1584c.size();
            for (int i2 = 0; i2 < size; i2++) {
                p pVar = (p) this.f1584c.get(i2).f1546f.getLayoutParams();
                if (pVar != null) {
                    pVar.f1577g = true;
                }
            }
        }

        void t() {
            int size = this.f1584c.size();
            for (int i2 = 0; i2 < size; i2++) {
                d0 d0Var = this.f1584c.get(i2);
                if (d0Var != null) {
                    d0Var.c(6);
                    d0Var.b(null);
                }
            }
            g gVar = RecyclerView.this.y;
            if (gVar == null || !gVar.i()) {
                z();
            }
        }

        void u(int i2, int i3) {
            int size = this.f1584c.size();
            for (int i4 = 0; i4 < size; i4++) {
                d0 d0Var = this.f1584c.get(i4);
                if (d0Var != null && d0Var.f1548h >= i2) {
                    d0Var.B(i3, true);
                }
            }
        }

        void v(int i2, int i3) {
            int i4;
            int i5;
            int i6;
            int i7;
            if (i2 < i3) {
                i4 = -1;
                i6 = i2;
                i5 = i3;
            } else {
                i4 = 1;
                i5 = i2;
                i6 = i3;
            }
            int size = this.f1584c.size();
            for (int i8 = 0; i8 < size; i8++) {
                d0 d0Var = this.f1584c.get(i8);
                if (d0Var != null && (i7 = d0Var.f1548h) >= i6 && i7 <= i5) {
                    if (i7 == i2) {
                        d0Var.B(i3 - i2, false);
                    } else {
                        d0Var.B(i4, false);
                    }
                }
            }
        }

        void w(int i2, int i3, boolean z) {
            int i4 = i2 + i3;
            for (int size = this.f1584c.size() - 1; size >= 0; size--) {
                d0 d0Var = this.f1584c.get(size);
                if (d0Var != null) {
                    int i5 = d0Var.f1548h;
                    if (i5 >= i4) {
                        d0Var.B(-i3, z);
                    } else if (i5 >= i2) {
                        d0Var.c(8);
                        A(size);
                    }
                }
            }
        }

        void x(g gVar, g gVar2, boolean z) {
            c();
            i().h(gVar, gVar2, z);
        }

        void y(View view) {
            d0 d0VarG0 = RecyclerView.g0(view);
            d0VarG0.s = null;
            d0VarG0.t = false;
            d0VarG0.f();
            C(d0VarG0);
        }

        void z() {
            for (int size = this.f1584c.size() - 1; size >= 0; size--) {
                A(size);
            }
            this.f1584c.clear();
            if (RecyclerView.f1519i) {
                RecyclerView.this.t0.b();
            }
        }
    }

    public interface w {
        void a(d0 d0Var);
    }

    private class x extends i {
        x() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void a() {
            RecyclerView.this.o(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.u0.f1530g = true;
            recyclerView.Q0(true);
            if (RecyclerView.this.q.p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void c(int i2, int i3, Object obj) {
            RecyclerView.this.o(null);
            if (RecyclerView.this.q.r(i2, i3, obj)) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void d(int i2, int i3) {
            RecyclerView.this.o(null);
            if (RecyclerView.this.q.s(i2, i3)) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void e(int i2, int i3, int i4) {
            RecyclerView.this.o(null);
            if (RecyclerView.this.q.t(i2, i3, i4)) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void f(int i2, int i3) {
            RecyclerView.this.o(null);
            if (RecyclerView.this.q.u(i2, i3)) {
                g();
            }
        }

        void g() {
            if (RecyclerView.f1518h) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.F && recyclerView.E) {
                    c.h.l.t.c0(recyclerView, recyclerView.u);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.N = true;
            recyclerView2.requestLayout();
        }
    }

    public static abstract class z {

        /* renamed from: b, reason: collision with root package name */
        private RecyclerView f1592b;

        /* renamed from: c, reason: collision with root package name */
        private o f1593c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f1594d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f1595e;

        /* renamed from: f, reason: collision with root package name */
        private View f1596f;

        /* renamed from: h, reason: collision with root package name */
        private boolean f1598h;
        private int a = -1;

        /* renamed from: g, reason: collision with root package name */
        private final a f1597g = new a(0, 0);

        public static class a {
            private int a;

            /* renamed from: b, reason: collision with root package name */
            private int f1599b;

            /* renamed from: c, reason: collision with root package name */
            private int f1600c;

            /* renamed from: d, reason: collision with root package name */
            private int f1601d;

            /* renamed from: e, reason: collision with root package name */
            private Interpolator f1602e;

            /* renamed from: f, reason: collision with root package name */
            private boolean f1603f;

            /* renamed from: g, reason: collision with root package name */
            private int f1604g;

            public a(int i2, int i3) {
                this(i2, i3, Level.ALL_INT, null);
            }

            private void e() {
                if (this.f1602e != null && this.f1600c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f1600c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            boolean a() {
                return this.f1601d >= 0;
            }

            public void b(int i2) {
                this.f1601d = i2;
            }

            void c(RecyclerView recyclerView) {
                int i2 = this.f1601d;
                if (i2 >= 0) {
                    this.f1601d = -1;
                    recyclerView.x0(i2);
                    this.f1603f = false;
                } else {
                    if (!this.f1603f) {
                        this.f1604g = 0;
                        return;
                    }
                    e();
                    recyclerView.r0.f(this.a, this.f1599b, this.f1600c, this.f1602e);
                    int i3 = this.f1604g + 1;
                    this.f1604g = i3;
                    if (i3 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f1603f = false;
                }
            }

            public void d(int i2, int i3, int i4, Interpolator interpolator) {
                this.a = i2;
                this.f1599b = i3;
                this.f1600c = i4;
                this.f1602e = interpolator;
                this.f1603f = true;
            }

            public a(int i2, int i3, int i4, Interpolator interpolator) {
                this.f1601d = -1;
                this.f1603f = false;
                this.f1604g = 0;
                this.a = i2;
                this.f1599b = i3;
                this.f1600c = i4;
                this.f1602e = interpolator;
            }
        }

        public interface b {
            PointF a(int i2);
        }

        public PointF a(int i2) {
            Object objE = e();
            if (objE instanceof b) {
                return ((b) objE).a(i2);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i2) {
            return this.f1592b.z.M(i2);
        }

        public int c() {
            return this.f1592b.z.T();
        }

        public int d(View view) {
            return this.f1592b.e0(view);
        }

        public o e() {
            return this.f1593c;
        }

        public int f() {
            return this.a;
        }

        public boolean g() {
            return this.f1594d;
        }

        public boolean h() {
            return this.f1595e;
        }

        protected void i(PointF pointF) {
            float f2 = pointF.x;
            float f3 = pointF.y;
            float fSqrt = (float) Math.sqrt((f2 * f2) + (f3 * f3));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        void j(int i2, int i3) {
            PointF pointFA;
            RecyclerView recyclerView = this.f1592b;
            if (this.a == -1 || recyclerView == null) {
                r();
            }
            if (this.f1594d && this.f1596f == null && this.f1593c != null && (pointFA = a(this.a)) != null) {
                float f2 = pointFA.x;
                if (f2 != 0.0f || pointFA.y != 0.0f) {
                    recyclerView.h1((int) Math.signum(f2), (int) Math.signum(pointFA.y), null);
                }
            }
            this.f1594d = false;
            View view = this.f1596f;
            if (view != null) {
                if (d(view) == this.a) {
                    o(this.f1596f, recyclerView.u0, this.f1597g);
                    this.f1597g.c(recyclerView);
                    r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f1596f = null;
                }
            }
            if (this.f1595e) {
                l(i2, i3, recyclerView.u0, this.f1597g);
                boolean zA = this.f1597g.a();
                this.f1597g.c(recyclerView);
                if (zA && this.f1595e) {
                    this.f1594d = true;
                    recyclerView.r0.e();
                }
            }
        }

        protected void k(View view) {
            if (d(view) == f()) {
                this.f1596f = view;
            }
        }

        protected abstract void l(int i2, int i3, a0 a0Var, a aVar);

        protected abstract void m();

        protected abstract void n();

        protected abstract void o(View view, a0 a0Var, a aVar);

        public void p(int i2) {
            this.a = i2;
        }

        void q(RecyclerView recyclerView, o oVar) {
            recyclerView.r0.stop();
            if (this.f1598h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f1592b = recyclerView;
            this.f1593c = oVar;
            int i2 = this.a;
            if (i2 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.u0.a = i2;
            this.f1595e = true;
            this.f1594d = true;
            this.f1596f = b(f());
            m();
            this.f1592b.r0.e();
            this.f1598h = true;
        }

        protected final void r() {
            if (this.f1595e) {
                this.f1595e = false;
                n();
                this.f1592b.u0.a = -1;
                this.f1596f = null;
                this.a = -1;
                this.f1594d = false;
                this.f1593c.m1(this);
                this.f1593c = null;
                this.f1592b = null;
            }
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        f1516f = i2 == 18 || i2 == 19 || i2 == 20;
        f1517g = i2 >= 23;
        f1518h = i2 >= 16;
        f1519i = i2 >= 21;
        f1520j = i2 <= 15;
        f1521k = i2 <= 15;
        Class<?> cls = Integer.TYPE;
        f1522l = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f1523m = new c();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.q.a.a);
    }

    private void A() {
        int i2 = this.M;
        this.M = 0;
        if (i2 == 0 || !u0()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        c.h.l.c0.b.b(accessibilityEventObtain, i2);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private void C() {
        this.u0.a(1);
        Q(this.u0);
        this.u0.f1533j = false;
        r1();
        this.s.f();
        H0();
        P0();
        e1();
        a0 a0Var = this.u0;
        a0Var.f1532i = a0Var.f1534k && this.y0;
        this.y0 = false;
        this.x0 = false;
        a0Var.f1531h = a0Var.f1535l;
        a0Var.f1529f = this.y.e();
        U(this.D0);
        if (this.u0.f1534k) {
            int iG = this.r.g();
            for (int i2 = 0; i2 < iG; i2++) {
                d0 d0VarG0 = g0(this.r.f(i2));
                if (!d0VarG0.K() && (!d0VarG0.u() || this.y.i())) {
                    this.s.e(d0VarG0, this.c0.t(this.u0, d0VarG0, l.e(d0VarG0), d0VarG0.p()));
                    if (this.u0.f1532i && d0VarG0.z() && !d0VarG0.w() && !d0VarG0.K() && !d0VarG0.u()) {
                        this.s.c(c0(d0VarG0), d0VarG0);
                    }
                }
            }
        }
        if (this.u0.f1535l) {
            f1();
            a0 a0Var2 = this.u0;
            boolean z2 = a0Var2.f1530g;
            a0Var2.f1530g = false;
            this.z.e1(this.o, a0Var2);
            this.u0.f1530g = z2;
            for (int i3 = 0; i3 < this.r.g(); i3++) {
                d0 d0VarG02 = g0(this.r.f(i3));
                if (!d0VarG02.K() && !this.s.i(d0VarG02)) {
                    int iE = l.e(d0VarG02);
                    boolean zQ = d0VarG02.q(8192);
                    if (!zQ) {
                        iE |= Spliterator.CONCURRENT;
                    }
                    l.c cVarT = this.c0.t(this.u0, d0VarG02, iE, d0VarG02.p());
                    if (zQ) {
                        S0(d0VarG02, cVarT);
                    } else {
                        this.s.a(d0VarG02, cVarT);
                    }
                }
            }
            s();
        } else {
            s();
        }
        I0();
        t1(false);
        this.u0.f1528e = 2;
    }

    private void D() {
        r1();
        H0();
        this.u0.a(6);
        this.q.j();
        this.u0.f1529f = this.y.e();
        a0 a0Var = this.u0;
        a0Var.f1527d = 0;
        a0Var.f1531h = false;
        this.z.e1(this.o, a0Var);
        a0 a0Var2 = this.u0;
        a0Var2.f1530g = false;
        this.p = null;
        a0Var2.f1534k = a0Var2.f1534k && this.c0 != null;
        a0Var2.f1528e = 4;
        I0();
        t1(false);
    }

    private void E() {
        this.u0.a(4);
        r1();
        H0();
        a0 a0Var = this.u0;
        a0Var.f1528e = 1;
        if (a0Var.f1534k) {
            for (int iG = this.r.g() - 1; iG >= 0; iG--) {
                d0 d0VarG0 = g0(this.r.f(iG));
                if (!d0VarG0.K()) {
                    long jC0 = c0(d0VarG0);
                    l.c cVarS = this.c0.s(this.u0, d0VarG0);
                    d0 d0VarG = this.s.g(jC0);
                    if (d0VarG == null || d0VarG.K()) {
                        this.s.d(d0VarG0, cVarS);
                    } else {
                        boolean zH = this.s.h(d0VarG);
                        boolean zH2 = this.s.h(d0VarG0);
                        if (zH && d0VarG == d0VarG0) {
                            this.s.d(d0VarG0, cVarS);
                        } else {
                            l.c cVarN = this.s.n(d0VarG);
                            this.s.d(d0VarG0, cVarS);
                            l.c cVarM = this.s.m(d0VarG0);
                            if (cVarN == null) {
                                l0(jC0, d0VarG0, d0VarG);
                            } else {
                                m(d0VarG, d0VarG0, cVarN, cVarM, zH, zH2);
                            }
                        }
                    }
                }
            }
            this.s.o(this.K0);
        }
        this.z.t1(this.o);
        a0 a0Var2 = this.u0;
        a0Var2.f1526c = a0Var2.f1529f;
        this.Q = false;
        this.R = false;
        a0Var2.f1534k = false;
        a0Var2.f1535l = false;
        this.z.f1570l = false;
        ArrayList<d0> arrayList = this.o.f1583b;
        if (arrayList != null) {
            arrayList.clear();
        }
        o oVar = this.z;
        if (oVar.r) {
            oVar.q = 0;
            oVar.r = false;
            this.o.K();
        }
        this.z.f1(this.u0);
        I0();
        t1(false);
        this.s.f();
        int[] iArr = this.D0;
        if (x(iArr[0], iArr[1])) {
            I(0, 0);
        }
        T0();
        c1();
    }

    private boolean K(MotionEvent motionEvent) {
        s sVar = this.D;
        if (sVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return T(motionEvent);
        }
        sVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.D = null;
        }
        return true;
    }

    private void K0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.e0) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.e0 = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.i0 = x2;
            this.g0 = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.j0 = y2;
            this.h0 = y2;
        }
    }

    private boolean O0() {
        return this.c0 != null && this.z.U1();
    }

    private void P0() {
        boolean z2;
        if (this.Q) {
            this.q.y();
            if (this.R) {
                this.z.Z0(this);
            }
        }
        if (O0()) {
            this.q.w();
        } else {
            this.q.j();
        }
        boolean z3 = false;
        boolean z4 = this.x0 || this.y0;
        this.u0.f1534k = this.H && this.c0 != null && ((z2 = this.Q) || z4 || this.z.f1570l) && (!z2 || this.y.i());
        a0 a0Var = this.u0;
        if (a0Var.f1534k && z4 && !this.Q && O0()) {
            z3 = true;
        }
        a0Var.f1535l = z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void R0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L21
            r6.M()
            android.widget.EdgeEffect r3 = r6.V
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
            androidx.core.widget.d.a(r3, r4, r9)
        L1f:
            r9 = 1
            goto L3c
        L21:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L3b
            r6.N()
            android.widget.EdgeEffect r3 = r6.a0
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.d.a(r3, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L56
            r6.O()
            android.widget.EdgeEffect r9 = r6.W
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.d.a(r9, r0, r7)
            goto L72
        L56:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L71
            r6.L()
            android.widget.EdgeEffect r9 = r6.b0
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.d.a(r9, r3, r0)
            goto L72
        L71:
            r1 = r9
        L72:
            if (r1 != 0) goto L7c
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L7c
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L7f
        L7c:
            c.h.l.t.b0(r6)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.R0(float, float, float, float):void");
    }

    private boolean T(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.C.size();
        for (int i2 = 0; i2 < size; i2++) {
            s sVar = this.C.get(i2);
            if (sVar.b(this, motionEvent) && action != 3) {
                this.D = sVar;
                return true;
            }
        }
        return false;
    }

    private void T0() {
        View viewFindViewById;
        if (!this.q0 || this.y == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!f1521k || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.r.n(focusedChild)) {
                    return;
                }
            } else if (this.r.g() == 0) {
                requestFocus();
                return;
            }
        }
        View viewW = null;
        d0 d0VarY = (this.u0.n == -1 || !this.y.i()) ? null : Y(this.u0.n);
        if (d0VarY != null && !this.r.n(d0VarY.f1546f) && d0VarY.f1546f.hasFocusable()) {
            viewW = d0VarY.f1546f;
        } else if (this.r.g() > 0) {
            viewW = W();
        }
        if (viewW != null) {
            int i2 = this.u0.o;
            if (i2 != -1 && (viewFindViewById = viewW.findViewById(i2)) != null && viewFindViewById.isFocusable()) {
                viewW = viewFindViewById;
            }
            viewW.requestFocus();
        }
    }

    private void U(int[] iArr) {
        int iG = this.r.g();
        if (iG == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Level.ALL_INT;
        for (int i4 = 0; i4 < iG; i4++) {
            d0 d0VarG0 = g0(this.r.f(i4));
            if (!d0VarG0.K()) {
                int iN = d0VarG0.n();
                if (iN < i2) {
                    i2 = iN;
                }
                if (iN > i3) {
                    i3 = iN;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    private void U0() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.V;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.V.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.W;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.W.isFinished();
        }
        EdgeEffect edgeEffect3 = this.a0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.a0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.b0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.b0.isFinished();
        }
        if (zIsFinished) {
            c.h.l.t.b0(this);
        }
    }

    static RecyclerView V(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView recyclerViewV = V(viewGroup.getChildAt(i2));
            if (recyclerViewV != null) {
                return recyclerViewV;
            }
        }
        return null;
    }

    private View W() {
        d0 d0VarX;
        a0 a0Var = this.u0;
        int i2 = a0Var.f1536m;
        if (i2 == -1) {
            i2 = 0;
        }
        int iB = a0Var.b();
        for (int i3 = i2; i3 < iB; i3++) {
            d0 d0VarX2 = X(i3);
            if (d0VarX2 == null) {
                break;
            }
            if (d0VarX2.f1546f.hasFocusable()) {
                return d0VarX2.f1546f;
            }
        }
        int iMin = Math.min(iB, i2);
        do {
            iMin--;
            if (iMin < 0 || (d0VarX = X(iMin)) == null) {
                return null;
            }
        } while (!d0VarX.f1546f.hasFocusable());
        return d0VarX.f1546f;
    }

    private void b1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.v.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p) {
            p pVar = (p) layoutParams;
            if (!pVar.f1577g) {
                Rect rect = pVar.f1576f;
                Rect rect2 = this.v;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.v);
            offsetRectIntoDescendantCoords(view, this.v);
        }
        this.z.A1(this, view, this.v, !this.H, view2 == null);
    }

    private void c1() {
        a0 a0Var = this.u0;
        a0Var.n = -1L;
        a0Var.f1536m = -1;
        a0Var.o = -1;
    }

    private void d1() {
        VelocityTracker velocityTracker = this.f0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        u1(0);
        U0();
    }

    private void e1() {
        View focusedChild = (this.q0 && hasFocus() && this.y != null) ? getFocusedChild() : null;
        d0 d0VarS = focusedChild != null ? S(focusedChild) : null;
        if (d0VarS == null) {
            c1();
            return;
        }
        this.u0.n = this.y.i() ? d0VarS.l() : -1L;
        this.u0.f1536m = this.Q ? -1 : d0VarS.w() ? d0VarS.f1549i : d0VarS.k();
        this.u0.o = i0(d0VarS.f1546f);
    }

    private void g(d0 d0Var) {
        View view = d0Var.f1546f;
        boolean z2 = view.getParent() == this;
        this.o.J(f0(view));
        if (d0Var.y()) {
            this.r.c(view, -1, view.getLayoutParams(), true);
        } else if (z2) {
            this.r.k(view);
        } else {
            this.r.b(view, true);
        }
    }

    static d0 g0(View view) {
        if (view == null) {
            return null;
        }
        return ((p) view.getLayoutParams()).f1575e;
    }

    private c.h.l.k getScrollingChildHelper() {
        if (this.E0 == null) {
            this.E0 = new c.h.l.k(this);
        }
        return this.E0;
    }

    static void h0(View view, Rect rect) {
        p pVar = (p) view.getLayoutParams();
        Rect rect2 = pVar.f1576f;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
    }

    private int i0(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private String j0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + CoreConstants.DOT + str;
    }

    private void j1(g gVar, boolean z2, boolean z3) {
        g gVar2 = this.y;
        if (gVar2 != null) {
            gVar2.A(this.n);
            this.y.t(this);
        }
        if (!z2 || z3) {
            V0();
        }
        this.q.y();
        g gVar3 = this.y;
        this.y = gVar;
        if (gVar != null) {
            gVar.y(this.n);
            gVar.p(this);
        }
        o oVar = this.z;
        if (oVar != null) {
            oVar.L0(gVar3, this.y);
        }
        this.o.x(gVar3, this.y, z2);
        this.u0.f1530g = true;
    }

    private void l0(long j2, d0 d0Var, d0 d0Var2) {
        int iG = this.r.g();
        for (int i2 = 0; i2 < iG; i2++) {
            d0 d0VarG0 = g0(this.r.f(i2));
            if (d0VarG0 != d0Var && c0(d0VarG0) == j2) {
                g gVar = this.y;
                if (gVar == null || !gVar.i()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + d0VarG0 + " \n View Holder 2:" + d0Var + P());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + d0VarG0 + " \n View Holder 2:" + d0Var + P());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + d0Var2 + " cannot be found but it is necessary for " + d0Var + P());
    }

    private void m(d0 d0Var, d0 d0Var2, l.c cVar, l.c cVar2, boolean z2, boolean z3) {
        d0Var.H(false);
        if (z2) {
            g(d0Var);
        }
        if (d0Var != d0Var2) {
            if (z3) {
                g(d0Var2);
            }
            d0Var.f1553m = d0Var2;
            g(d0Var);
            this.o.J(d0Var);
            d0Var2.H(false);
            d0Var2.n = d0Var;
        }
        if (this.c0.b(d0Var, d0Var2, cVar, cVar2)) {
            N0();
        }
    }

    private boolean n0() {
        int iG = this.r.g();
        for (int i2 = 0; i2 < iG; i2++) {
            d0 d0VarG0 = g0(this.r.f(i2));
            if (d0VarG0 != null && !d0VarG0.K() && d0VarG0.z()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void p0() {
        if (c.h.l.t.A(this) == 0) {
            c.h.l.t.v0(this, 8);
        }
    }

    private void q() {
        d1();
        setScrollState(0);
    }

    private void q0() {
        this.r = new androidx.recyclerview.widget.f(new e());
    }

    static void r(d0 d0Var) {
        WeakReference<RecyclerView> weakReference = d0Var.f1547g;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == d0Var.f1546f) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            d0Var.f1547g = null;
        }
    }

    private void v(Context context, String str, AttributeSet attributeSet, int i2, int i3) throws NoSuchMethodException, SecurityException {
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strJ0 = j0(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strJ0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(o.class);
                Object[] objArr = null;
                try {
                    constructor = clsAsSubclass.getConstructor(f1522l);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i2), Integer.valueOf(i3)};
                } catch (NoSuchMethodException e2) {
                    try {
                        constructor = clsAsSubclass.getConstructor(new Class[0]);
                    } catch (NoSuchMethodException e3) {
                        e3.initCause(e2);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strJ0, e3);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((o) constructor.newInstance(objArr));
            } catch (ClassCastException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strJ0, e4);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strJ0, e5);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strJ0, e6);
            } catch (InstantiationException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strJ0, e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strJ0, e8);
            }
        }
    }

    private boolean w0(View view, View view2, int i2) {
        int i3;
        if (view2 == null || view2 == this || R(view2) == null) {
            return false;
        }
        if (view == null || R(view) == null) {
            return true;
        }
        this.v.set(0, 0, view.getWidth(), view.getHeight());
        this.w.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.v);
        offsetDescendantRectToMyCoords(view2, this.w);
        char c2 = 65535;
        int i4 = this.z.j0() == 1 ? -1 : 1;
        Rect rect = this.v;
        int i5 = rect.left;
        Rect rect2 = this.w;
        int i6 = rect2.left;
        if ((i5 < i6 || rect.right <= i6) && rect.right < rect2.right) {
            i3 = 1;
        } else {
            int i7 = rect.right;
            int i8 = rect2.right;
            i3 = ((i7 > i8 || i5 >= i8) && i5 > i6) ? -1 : 0;
        }
        int i9 = rect.top;
        int i10 = rect2.top;
        if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
            c2 = 1;
        } else {
            int i11 = rect.bottom;
            int i12 = rect2.bottom;
            if ((i11 <= i12 && i9 < i12) || i9 <= i10) {
                c2 = 0;
            }
        }
        if (i2 == 1) {
            return c2 < 0 || (c2 == 0 && i3 * i4 <= 0);
        }
        if (i2 == 2) {
            return c2 > 0 || (c2 == 0 && i3 * i4 >= 0);
        }
        if (i2 == 17) {
            return i3 < 0;
        }
        if (i2 == 33) {
            return c2 < 0;
        }
        if (i2 == 66) {
            return i3 > 0;
        }
        if (i2 == 130) {
            return c2 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i2 + P());
    }

    private void w1() {
        this.r0.stop();
        o oVar = this.z;
        if (oVar != null) {
            oVar.T1();
        }
    }

    private boolean x(int i2, int i3) {
        U(this.D0);
        int[] iArr = this.D0;
        return (iArr[0] == i2 && iArr[1] == i3) ? false : true;
    }

    public void A0(int i2) {
        int iG = this.r.g();
        for (int i3 = 0; i3 < iG; i3++) {
            this.r.f(i3).offsetLeftAndRight(i2);
        }
    }

    void B() {
        if (this.y == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.z == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        a0 a0Var = this.u0;
        a0Var.f1533j = false;
        if (a0Var.f1528e == 1) {
            C();
            this.z.I1(this);
            D();
        } else if (!this.q.q() && this.z.u0() == getWidth() && this.z.g0() == getHeight()) {
            this.z.I1(this);
        } else {
            this.z.I1(this);
            D();
        }
        E();
    }

    public void B0(int i2) {
        int iG = this.r.g();
        for (int i3 = 0; i3 < iG; i3++) {
            this.r.f(i3).offsetTopAndBottom(i2);
        }
    }

    void C0(int i2, int i3) {
        int iJ = this.r.j();
        for (int i4 = 0; i4 < iJ; i4++) {
            d0 d0VarG0 = g0(this.r.i(i4));
            if (d0VarG0 != null && !d0VarG0.K() && d0VarG0.f1548h >= i2) {
                d0VarG0.B(i3, false);
                this.u0.f1530g = true;
            }
        }
        this.o.u(i2, i3);
        requestLayout();
    }

    void D0(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int iJ = this.r.j();
        if (i2 < i3) {
            i6 = -1;
            i5 = i2;
            i4 = i3;
        } else {
            i4 = i2;
            i5 = i3;
            i6 = 1;
        }
        for (int i8 = 0; i8 < iJ; i8++) {
            d0 d0VarG0 = g0(this.r.i(i8));
            if (d0VarG0 != null && (i7 = d0VarG0.f1548h) >= i5 && i7 <= i4) {
                if (i7 == i2) {
                    d0VarG0.B(i3 - i2, false);
                } else {
                    d0VarG0.B(i6, false);
                }
                this.u0.f1530g = true;
            }
        }
        this.o.v(i2, i3);
        requestLayout();
    }

    void E0(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int iJ = this.r.j();
        for (int i5 = 0; i5 < iJ; i5++) {
            d0 d0VarG0 = g0(this.r.i(i5));
            if (d0VarG0 != null && !d0VarG0.K()) {
                int i6 = d0VarG0.f1548h;
                if (i6 >= i4) {
                    d0VarG0.B(-i3, z2);
                    this.u0.f1530g = true;
                } else if (i6 >= i2) {
                    d0VarG0.j(i2 - 1, -i3, z2);
                    this.u0.f1530g = true;
                }
            }
        }
        this.o.w(i2, i3, z2);
        requestLayout();
    }

    public boolean F(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().d(i2, i3, iArr, iArr2, i4);
    }

    public void F0(View view) {
    }

    public final void G(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().e(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public void G0(View view) {
    }

    void H(int i2) {
        o oVar = this.z;
        if (oVar != null) {
            oVar.l1(i2);
        }
        L0(i2);
        t tVar = this.v0;
        if (tVar != null) {
            tVar.a(this, i2);
        }
        List<t> list = this.w0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.w0.get(size).a(this, i2);
            }
        }
    }

    void H0() {
        this.S++;
    }

    void I(int i2, int i3) {
        this.T++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        M0(i2, i3);
        t tVar = this.v0;
        if (tVar != null) {
            tVar.b(this, i2, i3);
        }
        List<t> list = this.w0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.w0.get(size).b(this, i2, i3);
            }
        }
        this.T--;
    }

    void I0() {
        J0(true);
    }

    void J() {
        int i2;
        for (int size = this.I0.size() - 1; size >= 0; size--) {
            d0 d0Var = this.I0.get(size);
            if (d0Var.f1546f.getParent() == this && !d0Var.K() && (i2 = d0Var.v) != -1) {
                c.h.l.t.u0(d0Var.f1546f, i2);
                d0Var.v = -1;
            }
        }
        this.I0.clear();
    }

    void J0(boolean z2) {
        int i2 = this.S - 1;
        this.S = i2;
        if (i2 < 1) {
            this.S = 0;
            if (z2) {
                A();
                J();
            }
        }
    }

    void L() {
        if (this.b0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.U.a(this, 3);
        this.b0 = edgeEffectA;
        if (this.t) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void L0(int i2) {
    }

    void M() {
        if (this.V != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.U.a(this, 0);
        this.V = edgeEffectA;
        if (this.t) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void M0(int i2, int i3) {
    }

    void N() {
        if (this.a0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.U.a(this, 2);
        this.a0 = edgeEffectA;
        if (this.t) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void N0() {
        if (this.A0 || !this.E) {
            return;
        }
        c.h.l.t.c0(this, this.J0);
        this.A0 = true;
    }

    void O() {
        if (this.W != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.U.a(this, 1);
        this.W = edgeEffectA;
        if (this.t) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    String P() {
        return " " + super.toString() + ", adapter:" + this.y + ", layout:" + this.z + ", context:" + getContext();
    }

    final void Q(a0 a0Var) {
        if (getScrollState() != 2) {
            a0Var.p = 0;
            a0Var.q = 0;
        } else {
            OverScroller overScroller = this.r0.f1540g;
            a0Var.p = overScroller.getFinalX() - overScroller.getCurrX();
            a0Var.q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    void Q0(boolean z2) {
        this.R = z2 | this.R;
        this.Q = true;
        z0();
    }

    public View R(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public d0 S(View view) {
        View viewR = R(view);
        if (viewR == null) {
            return null;
        }
        return f0(viewR);
    }

    void S0(d0 d0Var, l.c cVar) {
        d0Var.G(0, 8192);
        if (this.u0.f1532i && d0Var.z() && !d0Var.w() && !d0Var.K()) {
            this.s.c(c0(d0Var), d0Var);
        }
        this.s.e(d0Var, cVar);
    }

    void V0() {
        l lVar = this.c0;
        if (lVar != null) {
            lVar.k();
        }
        o oVar = this.z;
        if (oVar != null) {
            oVar.s1(this.o);
            this.z.t1(this.o);
        }
        this.o.c();
    }

    boolean W0(View view) {
        r1();
        boolean zR = this.r.r(view);
        if (zR) {
            d0 d0VarG0 = g0(view);
            this.o.J(d0VarG0);
            this.o.C(d0VarG0);
        }
        t1(!zR);
        return zR;
    }

    public d0 X(int i2) {
        d0 d0Var = null;
        if (this.Q) {
            return null;
        }
        int iJ = this.r.j();
        for (int i3 = 0; i3 < iJ; i3++) {
            d0 d0VarG0 = g0(this.r.i(i3));
            if (d0VarG0 != null && !d0VarG0.w() && b0(d0VarG0) == i2) {
                if (!this.r.n(d0VarG0.f1546f)) {
                    return d0VarG0;
                }
                d0Var = d0VarG0;
            }
        }
        return d0Var;
    }

    public void X0(n nVar) {
        o oVar = this.z;
        if (oVar != null) {
            oVar.q("Cannot remove item decoration during a scroll  or layout");
        }
        this.B.remove(nVar);
        if (this.B.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        y0();
        requestLayout();
    }

    public d0 Y(long j2) {
        g gVar = this.y;
        d0 d0Var = null;
        if (gVar != null && gVar.i()) {
            int iJ = this.r.j();
            for (int i2 = 0; i2 < iJ; i2++) {
                d0 d0VarG0 = g0(this.r.i(i2));
                if (d0VarG0 != null && !d0VarG0.w() && d0VarG0.l() == j2) {
                    if (!this.r.n(d0VarG0.f1546f)) {
                        return d0VarG0;
                    }
                    d0Var = d0VarG0;
                }
            }
        }
        return d0Var;
    }

    public void Y0(s sVar) {
        this.C.remove(sVar);
        if (this.D == sVar) {
            this.D = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.recyclerview.widget.RecyclerView.d0 Z(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.f r0 = r5.r
            int r0 = r0.j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.f r3 = r5.r
            android.view.View r3 = r3.i(r2)
            androidx.recyclerview.widget.RecyclerView$d0 r3 = g0(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.w()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.f1548h
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.n()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.f r1 = r5.r
            android.view.View r4 = r3.f1546f
            boolean r1 = r1.n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Z(int, boolean):androidx.recyclerview.widget.RecyclerView$d0");
    }

    public void Z0(t tVar) {
        List<t> list = this.w0;
        if (list != null) {
            list.remove(tVar);
        }
    }

    void a(int i2, int i3) {
        if (i2 < 0) {
            M();
            if (this.V.isFinished()) {
                this.V.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            N();
            if (this.a0.isFinished()) {
                this.a0.onAbsorb(i2);
            }
        }
        if (i3 < 0) {
            O();
            if (this.W.isFinished()) {
                this.W.onAbsorb(-i3);
            }
        } else if (i3 > 0) {
            L();
            if (this.b0.isFinished()) {
                this.b0.onAbsorb(i3);
            }
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        c.h.l.t.b0(this);
    }

    public boolean a0(int i2, int i3) {
        o oVar = this.z;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.K) {
            return false;
        }
        boolean zU = oVar.u();
        boolean zV = this.z.v();
        if (!zU || Math.abs(i2) < this.m0) {
            i2 = 0;
        }
        if (!zV || Math.abs(i3) < this.m0) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return false;
        }
        float f2 = i2;
        float f3 = i3;
        if (!dispatchNestedPreFling(f2, f3)) {
            boolean z2 = zU || zV;
            dispatchNestedFling(f2, f3, z2);
            r rVar = this.l0;
            if (rVar != null && rVar.a(i2, i3)) {
                return true;
            }
            if (z2) {
                int i4 = zU ? 1 : 0;
                if (zV) {
                    i4 |= 2;
                }
                s1(i4, 1);
                int i5 = this.n0;
                int iMax = Math.max(-i5, Math.min(i2, i5));
                int i6 = this.n0;
                this.r0.c(iMax, Math.max(-i6, Math.min(i3, i6)));
                return true;
            }
        }
        return false;
    }

    void a1() {
        d0 d0Var;
        int iG = this.r.g();
        for (int i2 = 0; i2 < iG; i2++) {
            View viewF = this.r.f(i2);
            d0 d0VarF0 = f0(viewF);
            if (d0VarF0 != null && (d0Var = d0VarF0.n) != null) {
                View view = d0Var.f1546f;
                int left = viewF.getLeft();
                int top = viewF.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        o oVar = this.z;
        if (oVar == null || !oVar.M0(this, arrayList, i2, i3)) {
            super.addFocusables(arrayList, i2, i3);
        }
    }

    int b0(d0 d0Var) {
        if (d0Var.q(524) || !d0Var.t()) {
            return -1;
        }
        return this.q.e(d0Var.f1548h);
    }

    long c0(d0 d0Var) {
        return this.y.i() ? d0Var.l() : d0Var.f1548h;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p) && this.z.w((p) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        o oVar = this.z;
        if (oVar != null && oVar.u()) {
            return this.z.A(this.u0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        o oVar = this.z;
        if (oVar != null && oVar.u()) {
            return this.z.B(this.u0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        o oVar = this.z;
        if (oVar != null && oVar.u()) {
            return this.z.C(this.u0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        o oVar = this.z;
        if (oVar != null && oVar.v()) {
            return this.z.D(this.u0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        o oVar = this.z;
        if (oVar != null && oVar.v()) {
            return this.z.E(this.u0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        o oVar = this.z;
        if (oVar != null && oVar.v()) {
            return this.z.F(this.u0);
        }
        return 0;
    }

    public int d0(View view) {
        d0 d0VarG0 = g0(view);
        if (d0VarG0 != null) {
            return d0VarG0.k();
        }
        return -1;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().f(i2, i3, i4, i5, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        int size = this.B.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.B.get(i2).i(canvas, this, this.u0);
        }
        EdgeEffect edgeEffect = this.V;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.t ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.V;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.W;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.t) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.W;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.a0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.t ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.a0;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.b0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.t) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.b0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(iSave4);
        }
        if ((z2 || this.c0 == null || this.B.size() <= 0 || !this.c0.p()) ? z2 : true) {
            c.h.l.t.b0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public int e0(View view) {
        d0 d0VarG0 = g0(view);
        if (d0VarG0 != null) {
            return d0VarG0.n();
        }
        return -1;
    }

    public d0 f0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return g0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    void f1() {
        int iJ = this.r.j();
        for (int i2 = 0; i2 < iJ; i2++) {
            d0 d0VarG0 = g0(this.r.i(i2));
            if (!d0VarG0.K()) {
                d0VarG0.F();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i2) {
        View viewQ0;
        boolean z2;
        View viewX0 = this.z.X0(view, i2);
        if (viewX0 != null) {
            return viewX0;
        }
        boolean z3 = (this.y == null || this.z == null || v0() || this.K) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z3 && (i2 == 2 || i2 == 1)) {
            if (this.z.v()) {
                int i3 = i2 == 2 ? 130 : 33;
                z2 = focusFinder.findNextFocus(this, view, i3) == null;
                if (f1520j) {
                    i2 = i3;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.z.u()) {
                int i4 = (this.z.j0() == 1) ^ (i2 == 2) ? 66 : 17;
                boolean z4 = focusFinder.findNextFocus(this, view, i4) == null;
                if (f1520j) {
                    i2 = i4;
                }
                z2 = z4;
            }
            if (z2) {
                u();
                if (R(view) == null) {
                    return null;
                }
                r1();
                this.z.Q0(view, i2, this.o, this.u0);
                t1(false);
            }
            viewQ0 = focusFinder.findNextFocus(this, view, i2);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i2);
            if (viewFindNextFocus == null && z3) {
                u();
                if (R(view) == null) {
                    return null;
                }
                r1();
                viewQ0 = this.z.Q0(view, i2, this.o, this.u0);
                t1(false);
            } else {
                viewQ0 = viewFindNextFocus;
            }
        }
        if (viewQ0 == null || viewQ0.hasFocusable()) {
            return w0(view, viewQ0, i2) ? viewQ0 : super.focusSearch(view, i2);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i2);
        }
        b1(viewQ0, null);
        return view;
    }

    boolean g1(int i2, int i3, MotionEvent motionEvent) {
        int i4;
        int i5;
        int i6;
        int i7;
        u();
        if (this.y != null) {
            int[] iArr = this.H0;
            iArr[0] = 0;
            iArr[1] = 0;
            h1(i2, i3, iArr);
            int[] iArr2 = this.H0;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i4 = i9;
            i5 = i8;
            i6 = i2 - i8;
            i7 = i3 - i9;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.B.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.H0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        G(i5, i4, i6, i7, this.F0, 0, iArr3);
        int[] iArr4 = this.H0;
        int i10 = i6 - iArr4[0];
        int i11 = i7 - iArr4[1];
        boolean z2 = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i12 = this.i0;
        int[] iArr5 = this.F0;
        this.i0 = i12 - iArr5[0];
        this.j0 -= iArr5[1];
        int[] iArr6 = this.G0;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !c.h.l.i.a(motionEvent, 8194)) {
                R0(motionEvent.getX(), i10, motionEvent.getY(), i11);
            }
            t(i2, i3);
        }
        if (i5 != 0 || i4 != 0) {
            I(i5, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z2 && i5 == 0 && i4 == 0) ? false : true;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.z;
        if (oVar != null) {
            return oVar.N();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o oVar = this.z;
        if (oVar != null) {
            return oVar.O(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public g getAdapter() {
        return this.y;
    }

    @Override // android.view.View
    public int getBaseline() {
        o oVar = this.z;
        return oVar != null ? oVar.Q() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i2, int i3) {
        j jVar = this.C0;
        return jVar == null ? super.getChildDrawingOrder(i2, i3) : jVar.a(i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.t;
    }

    public androidx.recyclerview.widget.r getCompatAccessibilityDelegate() {
        return this.B0;
    }

    public k getEdgeEffectFactory() {
        return this.U;
    }

    public l getItemAnimator() {
        return this.c0;
    }

    public int getItemDecorationCount() {
        return this.B.size();
    }

    public o getLayoutManager() {
        return this.z;
    }

    public int getMaxFlingVelocity() {
        return this.n0;
    }

    public int getMinFlingVelocity() {
        return this.m0;
    }

    long getNanoTime() {
        if (f1519i) {
            return System.nanoTime();
        }
        return 0L;
    }

    public r getOnFlingListener() {
        return this.l0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.q0;
    }

    public u getRecycledViewPool() {
        return this.o.i();
    }

    public int getScrollState() {
        return this.d0;
    }

    public void h(n nVar) {
        i(nVar, -1);
    }

    void h1(int i2, int i3, int[] iArr) {
        r1();
        H0();
        c.h.h.g.a("RV Scroll");
        Q(this.u0);
        int iE1 = i2 != 0 ? this.z.E1(i2, this.o, this.u0) : 0;
        int iG1 = i3 != 0 ? this.z.G1(i3, this.o, this.u0) : 0;
        c.h.h.g.b();
        a1();
        I0();
        t1(false);
        if (iArr != null) {
            iArr[0] = iE1;
            iArr[1] = iG1;
        }
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    public void i(n nVar, int i2) {
        o oVar = this.z;
        if (oVar != null) {
            oVar.q("Cannot add item decoration during a scroll  or layout");
        }
        if (this.B.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i2 < 0) {
            this.B.add(nVar);
        } else {
            this.B.add(i2, nVar);
        }
        y0();
        requestLayout();
    }

    public void i1(int i2) {
        if (this.K) {
            return;
        }
        v1();
        o oVar = this.z;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.F1(i2);
            awakenScrollBars();
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.E;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.K;
    }

    @Override // android.view.View, c.h.l.j
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(s sVar) {
        this.C.add(sVar);
    }

    public void k(t tVar) {
        if (this.w0 == null) {
            this.w0 = new ArrayList();
        }
        this.w0.add(tVar);
    }

    Rect k0(View view) {
        p pVar = (p) view.getLayoutParams();
        if (!pVar.f1577g) {
            return pVar.f1576f;
        }
        if (this.u0.e() && (pVar.b() || pVar.d())) {
            return pVar.f1576f;
        }
        Rect rect = pVar.f1576f;
        rect.set(0, 0, 0, 0);
        int size = this.B.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.v.set(0, 0, 0, 0);
            this.B.get(i2).e(this.v, view, this, this.u0);
            int i3 = rect.left;
            Rect rect2 = this.v;
            rect.left = i3 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.f1577g = false;
        return rect;
    }

    boolean k1(d0 d0Var, int i2) {
        if (!v0()) {
            c.h.l.t.u0(d0Var.f1546f, i2);
            return true;
        }
        d0Var.v = i2;
        this.I0.add(d0Var);
        return false;
    }

    void l(d0 d0Var, l.c cVar, l.c cVar2) {
        d0Var.H(false);
        if (this.c0.a(d0Var, cVar, cVar2)) {
            N0();
        }
    }

    boolean l1(AccessibilityEvent accessibilityEvent) {
        if (!v0()) {
            return false;
        }
        int iA = accessibilityEvent != null ? c.h.l.c0.b.a(accessibilityEvent) : 0;
        this.M |= iA != 0 ? iA : 0;
        return true;
    }

    public boolean m0() {
        return !this.H || this.Q || this.q.p();
    }

    public void m1(int i2, int i3) {
        n1(i2, i3, null);
    }

    void n(d0 d0Var, l.c cVar, l.c cVar2) {
        g(d0Var);
        d0Var.H(false);
        if (this.c0.c(d0Var, cVar, cVar2)) {
            N0();
        }
    }

    public void n1(int i2, int i3, Interpolator interpolator) {
        o1(i2, i3, interpolator, Level.ALL_INT);
    }

    void o(String str) {
        if (v0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + P());
        }
        if (this.T > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + P()));
        }
    }

    void o0() {
        this.q = new androidx.recyclerview.widget.a(new f());
    }

    public void o1(int i2, int i3, Interpolator interpolator, int i4) {
        p1(i2, i3, interpolator, i4, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S = 0;
        this.E = true;
        this.H = this.H && !isLayoutRequested();
        o oVar = this.z;
        if (oVar != null) {
            oVar.J(this);
        }
        this.A0 = false;
        if (f1519i) {
            ThreadLocal<androidx.recyclerview.widget.j> threadLocal = androidx.recyclerview.widget.j.f1738e;
            androidx.recyclerview.widget.j jVar = threadLocal.get();
            this.s0 = jVar;
            if (jVar == null) {
                this.s0 = new androidx.recyclerview.widget.j();
                Display displayV = c.h.l.t.v(this);
                float f2 = 60.0f;
                if (!isInEditMode() && displayV != null) {
                    float refreshRate = displayV.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f2 = refreshRate;
                    }
                }
                androidx.recyclerview.widget.j jVar2 = this.s0;
                jVar2.f1742i = (long) (1.0E9f / f2);
                threadLocal.set(jVar2);
            }
            this.s0.a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.j jVar;
        super.onDetachedFromWindow();
        l lVar = this.c0;
        if (lVar != null) {
            lVar.k();
        }
        v1();
        this.E = false;
        o oVar = this.z;
        if (oVar != null) {
            oVar.K(this, this.o);
        }
        this.I0.clear();
        removeCallbacks(this.J0);
        this.s.j();
        if (!f1519i || (jVar = this.s0) == null) {
            return;
        }
        jVar.j(this);
        this.s0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.B.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.B.get(i2).g(canvas, this, this.u0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.z
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.K
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3c
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.z
            boolean r0 = r0.v()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.z
            boolean r3 = r3.u()
            if (r3 == 0) goto L61
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L62
        L3c:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L60
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.z
            boolean r3 = r3.v()
            if (r3 == 0) goto L55
            float r0 = -r0
            goto L61
        L55:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.z
            boolean r3 = r3.u()
            if (r3 == 0) goto L60
            r3 = r0
            r0 = 0
            goto L62
        L60:
            r0 = 0
        L61:
            r3 = 0
        L62:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6a
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6a:
            float r2 = r5.o0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.p0
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.g1(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.K) {
            return false;
        }
        this.D = null;
        if (T(motionEvent)) {
            q();
            return true;
        }
        o oVar = this.z;
        if (oVar == null) {
            return false;
        }
        boolean zU = oVar.u();
        boolean zV = this.z.v();
        if (this.f0 == null) {
            this.f0 = VelocityTracker.obtain();
        }
        this.f0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.L) {
                this.L = false;
            }
            this.e0 = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.i0 = x2;
            this.g0 = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.j0 = y2;
            this.h0 = y2;
            if (this.d0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                u1(1);
            }
            int[] iArr = this.G0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i2 = zU;
            if (zV) {
                i2 = (zU ? 1 : 0) | 2;
            }
            s1(i2, 0);
        } else if (actionMasked == 1) {
            this.f0.clear();
            u1(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.e0);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.e0 + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.d0 != 1) {
                int i3 = x3 - this.g0;
                int i4 = y3 - this.h0;
                if (zU == 0 || Math.abs(i3) <= this.k0) {
                    z2 = false;
                } else {
                    this.i0 = x3;
                    z2 = true;
                }
                if (zV && Math.abs(i4) > this.k0) {
                    this.j0 = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            q();
        } else if (actionMasked == 5) {
            this.e0 = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.i0 = x4;
            this.g0 = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.j0 = y4;
            this.h0 = y4;
        } else if (actionMasked == 6) {
            K0(motionEvent);
        }
        return this.d0 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        c.h.h.g.a("RV OnLayout");
        B();
        c.h.h.g.b();
        this.H = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        o oVar = this.z;
        if (oVar == null) {
            w(i2, i3);
            return;
        }
        boolean z2 = false;
        if (oVar.y0()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.z.g1(this.o, this.u0, i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            if (z2 || this.y == null) {
                return;
            }
            if (this.u0.f1528e == 1) {
                C();
            }
            this.z.J1(i2, i3);
            this.u0.f1533j = true;
            D();
            this.z.M1(i2, i3);
            if (this.z.P1()) {
                this.z.J1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.u0.f1533j = true;
                D();
                this.z.M1(i2, i3);
                return;
            }
            return;
        }
        if (this.F) {
            this.z.g1(this.o, this.u0, i2, i3);
            return;
        }
        if (this.N) {
            r1();
            H0();
            P0();
            I0();
            a0 a0Var = this.u0;
            if (a0Var.f1535l) {
                a0Var.f1531h = true;
            } else {
                this.q.j();
                this.u0.f1531h = false;
            }
            this.N = false;
            t1(false);
        } else if (this.u0.f1535l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        g gVar = this.y;
        if (gVar != null) {
            this.u0.f1529f = gVar.e();
        } else {
            this.u0.f1529f = 0;
        }
        r1();
        this.z.g1(this.o, this.u0, i2, i3);
        t1(false);
        this.u0.f1531h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (v0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y yVar = (y) parcelable;
        this.p = yVar;
        super.onRestoreInstanceState(yVar.a());
        o oVar = this.z;
        if (oVar == null || (parcelable2 = this.p.f1591g) == null) {
            return;
        }
        oVar.j1(parcelable2);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        y yVar = new y(super.onSaveInstanceState());
        y yVar2 = this.p;
        if (yVar2 != null) {
            yVar.b(yVar2);
        } else {
            o oVar = this.z;
            if (oVar != null) {
                yVar.f1591g = oVar.k1();
            } else {
                yVar.f1591g = null;
            }
        }
        return yVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        s0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00df A[PHI: r0
  0x00df: PHI (r0v36 int) = (r0v26 int), (r0v40 int) binds: [B:41:0x00c8, B:45:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    boolean p(d0 d0Var) {
        l lVar = this.c0;
        return lVar == null || lVar.g(d0Var, d0Var.p());
    }

    void p1(int i2, int i3, Interpolator interpolator, int i4, boolean z2) {
        o oVar = this.z;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.K) {
            return;
        }
        if (!oVar.u()) {
            i2 = 0;
        }
        if (!this.z.v()) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        if (!(i4 == Integer.MIN_VALUE || i4 > 0)) {
            scrollBy(i2, i3);
            return;
        }
        if (z2) {
            int i5 = i2 != 0 ? 1 : 0;
            if (i3 != 0) {
                i5 |= 2;
            }
            s1(i5, 1);
        }
        this.r0.f(i2, i3, i4, interpolator);
    }

    public void q1(int i2) {
        if (this.K) {
            return;
        }
        o oVar = this.z;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.R1(this, this.u0, i2);
        }
    }

    void r0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.i(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(c.q.b.a), resources.getDimensionPixelSize(c.q.b.f3288c), resources.getDimensionPixelOffset(c.q.b.f3287b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + P());
        }
    }

    void r1() {
        int i2 = this.I + 1;
        this.I = i2;
        if (i2 != 1 || this.K) {
            return;
        }
        this.J = false;
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z2) {
        d0 d0VarG0 = g0(view);
        if (d0VarG0 != null) {
            if (d0VarG0.y()) {
                d0VarG0.g();
            } else if (!d0VarG0.K()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + d0VarG0 + P());
            }
        }
        view.clearAnimation();
        z(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.z.i1(this, this.u0, view, view2) && view2 != null) {
            b1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.z.z1(this, view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.C.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.C.get(i2).c(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.I != 0 || this.K) {
            this.J = true;
        } else {
            super.requestLayout();
        }
    }

    void s() {
        int iJ = this.r.j();
        for (int i2 = 0; i2 < iJ; i2++) {
            d0 d0VarG0 = g0(this.r.i(i2));
            if (!d0VarG0.K()) {
                d0VarG0.d();
            }
        }
        this.o.d();
    }

    void s0() {
        this.b0 = null;
        this.W = null;
        this.a0 = null;
        this.V = null;
    }

    public boolean s1(int i2, int i3) {
        return getScrollingChildHelper().p(i2, i3);
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        o oVar = this.z;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.K) {
            return;
        }
        boolean zU = oVar.u();
        boolean zV = this.z.v();
        if (zU || zV) {
            if (!zU) {
                i2 = 0;
            }
            if (!zV) {
                i3 = 0;
            }
            g1(i2, i3, null);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (l1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.r rVar) {
        this.B0 = rVar;
        c.h.l.t.k0(this, rVar);
    }

    public void setAdapter(g gVar) {
        setLayoutFrozen(false);
        j1(gVar, false, true);
        Q0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(j jVar) {
        if (jVar == this.C0) {
            return;
        }
        this.C0 = jVar;
        setChildrenDrawingOrderEnabled(jVar != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.t) {
            s0();
        }
        this.t = z2;
        super.setClipToPadding(z2);
        if (this.H) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(k kVar) {
        c.h.k.h.c(kVar);
        this.U = kVar;
        s0();
    }

    public void setHasFixedSize(boolean z2) {
        this.F = z2;
    }

    public void setItemAnimator(l lVar) {
        l lVar2 = this.c0;
        if (lVar2 != null) {
            lVar2.k();
            this.c0.v(null);
        }
        this.c0 = lVar;
        if (lVar != null) {
            lVar.v(this.z0);
        }
    }

    public void setItemViewCacheSize(int i2) {
        this.o.G(i2);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(o oVar) {
        if (oVar == this.z) {
            return;
        }
        v1();
        if (this.z != null) {
            l lVar = this.c0;
            if (lVar != null) {
                lVar.k();
            }
            this.z.s1(this.o);
            this.z.t1(this.o);
            this.o.c();
            if (this.E) {
                this.z.K(this, this.o);
            }
            this.z.N1(null);
            this.z = null;
        } else {
            this.o.c();
        }
        this.r.o();
        this.z = oVar;
        if (oVar != null) {
            if (oVar.f1564f != null) {
                throw new IllegalArgumentException("LayoutManager " + oVar + " is already attached to a RecyclerView:" + oVar.f1564f.P());
            }
            oVar.N1(this);
            if (this.E) {
                this.z.J(this);
            }
        }
        this.o.K();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        getScrollingChildHelper().m(z2);
    }

    public void setOnFlingListener(r rVar) {
        this.l0 = rVar;
    }

    @Deprecated
    public void setOnScrollListener(t tVar) {
        this.v0 = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.q0 = z2;
    }

    public void setRecycledViewPool(u uVar) {
        this.o.E(uVar);
    }

    public void setRecyclerListener(w wVar) {
        this.A = wVar;
    }

    void setScrollState(int i2) {
        if (i2 == this.d0) {
            return;
        }
        this.d0 = i2;
        if (i2 != 2) {
            w1();
        }
        H(i2);
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 == 1) {
                this.k0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
        }
        this.k0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(b0 b0Var) {
        this.o.F(b0Var);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().o(i2);
    }

    @Override // android.view.View, c.h.l.j
    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        if (z2 != this.K) {
            o("Do not suppressLayout in layout or scroll");
            if (z2) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.K = true;
                this.L = true;
                v1();
                return;
            }
            this.K = false;
            if (this.J && this.z != null && this.y != null) {
                requestLayout();
            }
            this.J = false;
        }
    }

    void t(int i2, int i3) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.V;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            zIsFinished = false;
        } else {
            this.V.onRelease();
            zIsFinished = this.V.isFinished();
        }
        EdgeEffect edgeEffect2 = this.a0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.a0.onRelease();
            zIsFinished |= this.a0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.W;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.W.onRelease();
            zIsFinished |= this.W.isFinished();
        }
        EdgeEffect edgeEffect4 = this.b0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.b0.onRelease();
            zIsFinished |= this.b0.isFinished();
        }
        if (zIsFinished) {
            c.h.l.t.b0(this);
        }
    }

    public void t0() {
        if (this.B.size() == 0) {
            return;
        }
        o oVar = this.z;
        if (oVar != null) {
            oVar.q("Cannot invalidate item decorations during a scroll or layout");
        }
        y0();
        requestLayout();
    }

    void t1(boolean z2) {
        if (this.I < 1) {
            this.I = 1;
        }
        if (!z2 && !this.K) {
            this.J = false;
        }
        if (this.I == 1) {
            if (z2 && this.J && !this.K && this.z != null && this.y != null) {
                B();
            }
            if (!this.K) {
                this.J = false;
            }
        }
        this.I--;
    }

    void u() {
        if (!this.H || this.Q) {
            c.h.h.g.a("RV FullInvalidate");
            B();
            c.h.h.g.b();
            return;
        }
        if (this.q.p()) {
            if (!this.q.o(4) || this.q.o(11)) {
                if (this.q.p()) {
                    c.h.h.g.a("RV FullInvalidate");
                    B();
                    c.h.h.g.b();
                    return;
                }
                return;
            }
            c.h.h.g.a("RV PartialInvalidate");
            r1();
            H0();
            this.q.w();
            if (!this.J) {
                if (n0()) {
                    B();
                } else {
                    this.q.i();
                }
            }
            t1(true);
            I0();
            c.h.h.g.b();
        }
    }

    boolean u0() {
        AccessibilityManager accessibilityManager = this.O;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public void u1(int i2) {
        getScrollingChildHelper().r(i2);
    }

    public boolean v0() {
        return this.S > 0;
    }

    public void v1() {
        setScrollState(0);
        w1();
    }

    void w(int i2, int i3) {
        setMeasuredDimension(o.x(i2, getPaddingLeft() + getPaddingRight(), c.h.l.t.D(this)), o.x(i3, getPaddingTop() + getPaddingBottom(), c.h.l.t.C(this)));
    }

    void x0(int i2) {
        if (this.z == null) {
            return;
        }
        setScrollState(2);
        this.z.F1(i2);
        awakenScrollBars();
    }

    void x1(int i2, int i3, Object obj) {
        int i4;
        int iJ = this.r.j();
        int i5 = i2 + i3;
        for (int i6 = 0; i6 < iJ; i6++) {
            View viewI = this.r.i(i6);
            d0 d0VarG0 = g0(viewI);
            if (d0VarG0 != null && !d0VarG0.K() && (i4 = d0VarG0.f1548h) >= i2 && i4 < i5) {
                d0VarG0.c(2);
                d0VarG0.b(obj);
                ((p) viewI.getLayoutParams()).f1577g = true;
            }
        }
        this.o.M(i2, i3);
    }

    void y(View view) {
        d0 d0VarG0 = g0(view);
        F0(view);
        g gVar = this.y;
        if (gVar != null && d0VarG0 != null) {
            gVar.v(d0VarG0);
        }
        List<q> list = this.P;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.P.get(size).b(view);
            }
        }
    }

    void y0() {
        int iJ = this.r.j();
        for (int i2 = 0; i2 < iJ; i2++) {
            ((p) this.r.i(i2).getLayoutParams()).f1577g = true;
        }
        this.o.s();
    }

    void z(View view) {
        d0 d0VarG0 = g0(view);
        G0(view);
        g gVar = this.y;
        if (gVar != null && d0VarG0 != null) {
            gVar.w(d0VarG0);
        }
        List<q> list = this.P;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.P.get(size).a(view);
            }
        }
    }

    void z0() {
        int iJ = this.r.j();
        for (int i2 = 0; i2 < iJ; i2++) {
            d0 d0VarG0 = g0(this.r.i(i2));
            if (d0VarG0 != null && !d0VarG0.K()) {
                d0VarG0.c(6);
            }
        }
        y0();
        this.o.t();
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) throws NoSuchMethodException, SecurityException {
        super(context, attributeSet, i2);
        this.n = new x();
        this.o = new v();
        this.s = new androidx.recyclerview.widget.w();
        this.u = new a();
        this.v = new Rect();
        this.w = new Rect();
        this.x = new RectF();
        this.B = new ArrayList<>();
        this.C = new ArrayList<>();
        this.I = 0;
        this.Q = false;
        this.R = false;
        this.S = 0;
        this.T = 0;
        this.U = new k();
        this.c0 = new androidx.recyclerview.widget.g();
        this.d0 = 0;
        this.e0 = -1;
        this.o0 = Float.MIN_VALUE;
        this.p0 = Float.MIN_VALUE;
        boolean z2 = true;
        this.q0 = true;
        this.r0 = new c0();
        this.t0 = f1519i ? new j.b() : null;
        this.u0 = new a0();
        this.x0 = false;
        this.y0 = false;
        this.z0 = new m();
        this.A0 = false;
        this.D0 = new int[2];
        this.F0 = new int[2];
        this.G0 = new int[2];
        this.H0 = new int[2];
        this.I0 = new ArrayList();
        this.J0 = new b();
        this.K0 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.k0 = viewConfiguration.getScaledTouchSlop();
        this.o0 = c.h.l.u.b(viewConfiguration, context);
        this.p0 = c.h.l.u.d(viewConfiguration, context);
        this.m0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.n0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.c0.v(this.z0);
        o0();
        q0();
        p0();
        if (c.h.l.t.z(this) == 0) {
            c.h.l.t.u0(this, 1);
        }
        this.O = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.r(this));
        int[] iArr = c.q.c.f3293f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
        }
        String string = typedArrayObtainStyledAttributes.getString(c.q.c.o);
        if (typedArrayObtainStyledAttributes.getInt(c.q.c.f3296i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.t = typedArrayObtainStyledAttributes.getBoolean(c.q.c.f3295h, true);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(c.q.c.f3297j, false);
        this.G = z3;
        if (z3) {
            r0((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(c.q.c.f3300m), typedArrayObtainStyledAttributes.getDrawable(c.q.c.n), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(c.q.c.f3298k), typedArrayObtainStyledAttributes.getDrawable(c.q.c.f3299l));
        }
        typedArrayObtainStyledAttributes.recycle();
        v(context, string, attributeSet, i2, 0);
        if (i3 >= 21) {
            int[] iArr2 = f1515e;
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
            if (i3 >= 29) {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i2, 0);
            }
            z2 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
            typedArrayObtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z2);
    }

    public static class p extends ViewGroup.MarginLayoutParams {

        /* renamed from: e, reason: collision with root package name */
        d0 f1575e;

        /* renamed from: f, reason: collision with root package name */
        final Rect f1576f;

        /* renamed from: g, reason: collision with root package name */
        boolean f1577g;

        /* renamed from: h, reason: collision with root package name */
        boolean f1578h;

        public p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1576f = new Rect();
            this.f1577g = true;
            this.f1578h = false;
        }

        public int a() {
            return this.f1575e.n();
        }

        public boolean b() {
            return this.f1575e.z();
        }

        public boolean c() {
            return this.f1575e.w();
        }

        public boolean d() {
            return this.f1575e.u();
        }

        public p(int i2, int i3) {
            super(i2, i3);
            this.f1576f = new Rect();
            this.f1577g = true;
            this.f1578h = false;
        }

        public p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1576f = new Rect();
            this.f1577g = true;
            this.f1578h = false;
        }

        public p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1576f = new Rect();
            this.f1577g = true;
            this.f1578h = false;
        }

        public p(p pVar) {
            super((ViewGroup.LayoutParams) pVar);
            this.f1576f = new Rect();
            this.f1577g = true;
            this.f1578h = false;
        }
    }

    public static class y extends c.j.a.a {
        public static final Parcelable.Creator<y> CREATOR = new a();

        /* renamed from: g, reason: collision with root package name */
        Parcelable f1591g;

        static class a implements Parcelable.ClassLoaderCreator<y> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public y createFromParcel(Parcel parcel) {
                return new y(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public y createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new y(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public y[] newArray(int i2) {
                return new y[i2];
            }
        }

        y(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1591g = parcel.readParcelable(classLoader == null ? o.class.getClassLoader() : classLoader);
        }

        void b(y yVar) {
            this.f1591g = yVar.f1591g;
        }

        @Override // c.j.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeParcelable(this.f1591g, 0);
        }

        y(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o oVar = this.z;
        if (oVar != null) {
            return oVar.P(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }
}