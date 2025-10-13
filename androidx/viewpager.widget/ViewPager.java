package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import c.h.l.b0;
import c.h.l.p;
import c.h.l.t;
import j$.util.Comparator;
import j$.util.Spliterator;
import j$.util.function.Function;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {

    /* renamed from: e, reason: collision with root package name */
    static final int[] f2054e = {R.attr.layout_gravity};

    /* renamed from: f, reason: collision with root package name */
    private static final Comparator<f> f2055f = new a();

    /* renamed from: g, reason: collision with root package name */
    private static final Interpolator f2056g = new b();

    /* renamed from: h, reason: collision with root package name */
    private static final n f2057h = new n();
    private int A;
    private int B;
    private boolean C;
    private boolean D;
    private boolean E;
    private int F;
    private boolean G;
    private boolean H;
    private int I;
    private int J;
    private int K;
    private float L;
    private float M;
    private float N;
    private float O;
    private int P;
    private VelocityTracker Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private boolean V;
    private EdgeEffect W;
    private EdgeEffect a0;
    private boolean b0;
    private boolean c0;
    private boolean d0;
    private int e0;
    private List<j> f0;
    private j g0;
    private j h0;

    /* renamed from: i, reason: collision with root package name */
    private int f2058i;
    private List<i> i0;

    /* renamed from: j, reason: collision with root package name */
    private final ArrayList<f> f2059j;
    private k j0;

    /* renamed from: k, reason: collision with root package name */
    private final f f2060k;
    private int k0;

    /* renamed from: l, reason: collision with root package name */
    private final Rect f2061l;
    private int l0;

    /* renamed from: m, reason: collision with root package name */
    androidx.viewpager.widget.a f2062m;
    private ArrayList<View> m0;
    int n;
    private final Runnable n0;
    private int o;
    private int o0;
    private Parcelable p;
    private ClassLoader q;
    private Scroller r;
    private boolean s;
    private l t;
    private int u;
    private Drawable v;
    private int w;
    private int x;
    private float y;
    private float z;

    static class a implements Comparator<f>, j$.util.Comparator {
        a() {
        }

        @Override // java.util.Comparator, j$.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return fVar.f2065b - fVar2.f2065b;
        }

        @Override // java.util.Comparator, j$.util.Comparator
        public /* synthetic */ Comparator reversed() {
            return Collections.reverseOrder(this);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ Comparator thenComparing(Function function) {
            return Comparator.CC.$default$thenComparing(this, function);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
            return Comparator.CC.$default$thenComparing(this, function, comparator);
        }

        @Override // java.util.Comparator, j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
            return Comparator.CC.$default$thenComparing(this, comparator);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
            return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
            return Comparator.CC.$default$thenComparingInt(this, toIntFunction);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
            return Comparator.CC.$default$thenComparingLong(this, toLongFunction);
        }
    }

    static class b implements Interpolator {
        b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() throws Resources.NotFoundException {
            ViewPager.this.setScrollState(0);
            ViewPager.this.E();
        }
    }

    class d implements p {
        private final Rect a = new Rect();

        d() {
        }

        @Override // c.h.l.p
        public b0 a(View view, b0 b0Var) {
            b0 b0VarX = t.X(view, b0Var);
            if (b0VarX.l()) {
                return b0VarX;
            }
            Rect rect = this.a;
            rect.left = b0VarX.f();
            rect.top = b0VarX.h();
            rect.right = b0VarX.g();
            rect.bottom = b0VarX.e();
            int childCount = ViewPager.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                b0 b0VarH = t.h(ViewPager.this.getChildAt(i2), b0VarX);
                rect.left = Math.min(b0VarH.f(), rect.left);
                rect.top = Math.min(b0VarH.h(), rect.top);
                rect.right = Math.min(b0VarH.g(), rect.right);
                rect.bottom = Math.min(b0VarH.e(), rect.bottom);
            }
            return b0VarX.m(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    static class f {
        Object a;

        /* renamed from: b, reason: collision with root package name */
        int f2065b;

        /* renamed from: c, reason: collision with root package name */
        boolean f2066c;

        /* renamed from: d, reason: collision with root package name */
        float f2067d;

        /* renamed from: e, reason: collision with root package name */
        float f2068e;

        f() {
        }
    }

    class h extends c.h.l.a {
        h() {
        }

        private boolean n() {
            androidx.viewpager.widget.a aVar = ViewPager.this.f2062m;
            return aVar != null && aVar.c() > 1;
        }

        @Override // c.h.l.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            androidx.viewpager.widget.a aVar;
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(n());
            if (accessibilityEvent.getEventType() != 4096 || (aVar = ViewPager.this.f2062m) == null) {
                return;
            }
            accessibilityEvent.setItemCount(aVar.c());
            accessibilityEvent.setFromIndex(ViewPager.this.n);
            accessibilityEvent.setToIndex(ViewPager.this.n);
        }

        @Override // c.h.l.a
        public void g(View view, c.h.l.c0.c cVar) {
            super.g(view, cVar);
            cVar.Y(ViewPager.class.getName());
            cVar.r0(n());
            if (ViewPager.this.canScrollHorizontally(1)) {
                cVar.a(Spliterator.CONCURRENT);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                cVar.a(8192);
            }
        }

        @Override // c.h.l.a
        public boolean j(View view, int i2, Bundle bundle) {
            if (super.j(view, i2, bundle)) {
                return true;
            }
            if (i2 == 4096) {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.n + 1);
                return true;
            }
            if (i2 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                return false;
            }
            ViewPager viewPager2 = ViewPager.this;
            viewPager2.setCurrentItem(viewPager2.n - 1);
            return true;
        }
    }

    public interface i {
        void a(ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2);
    }

    public interface j {
        void a(int i2, float f2, int i3);

        void b(int i2);

        void c(int i2);
    }

    public interface k {
        void a(View view, float f2);
    }

    private class l extends DataSetObserver {
        l() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() throws Resources.NotFoundException {
            ViewPager.this.h();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() throws Resources.NotFoundException {
            ViewPager.this.h();
        }
    }

    public static class m extends c.j.a.a {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* renamed from: g, reason: collision with root package name */
        int f2075g;

        /* renamed from: h, reason: collision with root package name */
        Parcelable f2076h;

        /* renamed from: i, reason: collision with root package name */
        ClassLoader f2077i;

        static class a implements Parcelable.ClassLoaderCreator<m> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public m createFromParcel(Parcel parcel) {
                return new m(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public m createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new m(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public m[] newArray(int i2) {
                return new m[i2];
            }
        }

        public m(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f2075g + "}";
        }

        @Override // c.j.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f2075g);
            parcel.writeParcelable(this.f2076h, i2);
        }

        m(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? m.class.getClassLoader() : classLoader;
            this.f2075g = parcel.readInt();
            this.f2076h = parcel.readParcelable(classLoader);
            this.f2077i = classLoader;
        }
    }

    static class n implements java.util.Comparator<View>, j$.util.Comparator {
        n() {
        }

        @Override // java.util.Comparator, j$.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z = gVar.a;
            return z != gVar2.a ? z ? 1 : -1 : gVar.f2072e - gVar2.f2072e;
        }

        @Override // java.util.Comparator, j$.util.Comparator
        public /* synthetic */ java.util.Comparator reversed() {
            return Collections.reverseOrder(this);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparing(Function function) {
            return Comparator.CC.$default$thenComparing(this, function);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
            return Comparator.CC.$default$thenComparing(this, function, comparator);
        }

        @Override // java.util.Comparator, j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
            return Comparator.CC.$default$thenComparing(this, comparator);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
            return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
            return Comparator.CC.$default$thenComparingInt(this, toIntFunction);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
            return Comparator.CC.$default$thenComparingLong(this, toLongFunction);
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2059j = new ArrayList<>();
        this.f2060k = new f();
        this.f2061l = new Rect();
        this.o = -1;
        this.p = null;
        this.q = null;
        this.y = -3.4028235E38f;
        this.z = Float.MAX_VALUE;
        this.F = 1;
        this.P = -1;
        this.b0 = true;
        this.c0 = false;
        this.n0 = new c();
        this.o0 = 0;
        v();
    }

    private boolean C(int i2) {
        if (this.f2059j.size() == 0) {
            if (this.b0) {
                return false;
            }
            this.d0 = false;
            y(0, 0.0f, 0);
            if (this.d0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f fVarT = t();
        int clientWidth = getClientWidth();
        int i3 = this.u;
        int i4 = clientWidth + i3;
        float f2 = clientWidth;
        int i5 = fVarT.f2065b;
        float f3 = ((i2 / f2) - fVarT.f2068e) / (fVarT.f2067d + (i3 / f2));
        this.d0 = false;
        y(i5, f3, (int) (i4 * f3));
        if (this.d0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean D(float f2) {
        boolean z;
        boolean z2;
        float f3 = this.L - f2;
        this.L = f2;
        float scrollX = getScrollX() + f3;
        float clientWidth = getClientWidth();
        float f4 = this.y * clientWidth;
        float f5 = this.z * clientWidth;
        boolean z3 = false;
        f fVar = this.f2059j.get(0);
        ArrayList<f> arrayList = this.f2059j;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f2065b != 0) {
            f4 = fVar.f2068e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (fVar2.f2065b != this.f2062m.c() - 1) {
            f5 = fVar2.f2068e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f4) {
            if (z) {
                this.W.onPull(Math.abs(f4 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        } else if (scrollX > f5) {
            if (z2) {
                this.a0.onPull(Math.abs(scrollX - f5) / clientWidth);
                z3 = true;
            }
            scrollX = f5;
        }
        int i2 = (int) scrollX;
        this.L += scrollX - i2;
        scrollTo(i2, getScrollY());
        C(i2);
        return z3;
    }

    private void G(int i2, int i3, int i4, int i5) {
        if (i3 > 0 && !this.f2059j.isEmpty()) {
            if (!this.r.isFinished()) {
                this.r.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i3 - getPaddingLeft()) - getPaddingRight()) + i5)) * (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)), getScrollY());
                return;
            }
        }
        f fVarU = u(this.n);
        int iMin = (int) ((fVarU != null ? Math.min(fVarU.f2068e, this.z) : 0.0f) * ((i2 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            g(false);
            scrollTo(iMin, getScrollY());
        }
    }

    private void H() {
        int i2 = 0;
        while (i2 < getChildCount()) {
            if (!((g) getChildAt(i2).getLayoutParams()).a) {
                removeViewAt(i2);
                i2--;
            }
            i2++;
        }
    }

    private void K(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean L() {
        this.P = -1;
        o();
        this.W.onRelease();
        this.a0.onRelease();
        return this.W.isFinished() || this.a0.isFinished();
    }

    private void M(int i2, boolean z, int i3, boolean z2) throws Resources.NotFoundException {
        f fVarU = u(i2);
        int clientWidth = fVarU != null ? (int) (getClientWidth() * Math.max(this.y, Math.min(fVarU.f2068e, this.z))) : 0;
        if (z) {
            Q(clientWidth, 0, i3);
            if (z2) {
                k(i2);
                return;
            }
            return;
        }
        if (z2) {
            k(i2);
        }
        g(false);
        scrollTo(clientWidth, 0);
        C(clientWidth);
    }

    private void R() {
        if (this.l0 != 0) {
            ArrayList<View> arrayList = this.m0;
            if (arrayList == null) {
                this.m0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.m0.add(getChildAt(i2));
            }
            Collections.sort(this.m0, f2057h);
        }
    }

    private void e(f fVar, int i2, f fVar2) {
        int i3;
        int i4;
        f fVar3;
        f fVar4;
        int iC = this.f2062m.c();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? this.u / clientWidth : 0.0f;
        if (fVar2 != null) {
            int i5 = fVar2.f2065b;
            int i6 = fVar.f2065b;
            if (i5 < i6) {
                float f3 = fVar2.f2068e + fVar2.f2067d + f2;
                int i7 = i5 + 1;
                int i8 = 0;
                while (i7 <= fVar.f2065b && i8 < this.f2059j.size()) {
                    f fVar5 = this.f2059j.get(i8);
                    while (true) {
                        fVar4 = fVar5;
                        if (i7 <= fVar4.f2065b || i8 >= this.f2059j.size() - 1) {
                            break;
                        }
                        i8++;
                        fVar5 = this.f2059j.get(i8);
                    }
                    while (i7 < fVar4.f2065b) {
                        f3 += this.f2062m.f(i7) + f2;
                        i7++;
                    }
                    fVar4.f2068e = f3;
                    f3 += fVar4.f2067d + f2;
                    i7++;
                }
            } else if (i5 > i6) {
                int size = this.f2059j.size() - 1;
                float f4 = fVar2.f2068e;
                while (true) {
                    i5--;
                    if (i5 < fVar.f2065b || size < 0) {
                        break;
                    }
                    f fVar6 = this.f2059j.get(size);
                    while (true) {
                        fVar3 = fVar6;
                        if (i5 >= fVar3.f2065b || size <= 0) {
                            break;
                        }
                        size--;
                        fVar6 = this.f2059j.get(size);
                    }
                    while (i5 > fVar3.f2065b) {
                        f4 -= this.f2062m.f(i5) + f2;
                        i5--;
                    }
                    f4 -= fVar3.f2067d + f2;
                    fVar3.f2068e = f4;
                }
            }
        }
        int size2 = this.f2059j.size();
        float f5 = fVar.f2068e;
        int i9 = fVar.f2065b;
        int i10 = i9 - 1;
        this.y = i9 == 0 ? f5 : -3.4028235E38f;
        int i11 = iC - 1;
        this.z = i9 == i11 ? (fVar.f2067d + f5) - 1.0f : Float.MAX_VALUE;
        int i12 = i2 - 1;
        while (i12 >= 0) {
            f fVar7 = this.f2059j.get(i12);
            while (true) {
                i4 = fVar7.f2065b;
                if (i10 <= i4) {
                    break;
                }
                f5 -= this.f2062m.f(i10) + f2;
                i10--;
            }
            f5 -= fVar7.f2067d + f2;
            fVar7.f2068e = f5;
            if (i4 == 0) {
                this.y = f5;
            }
            i12--;
            i10--;
        }
        float f6 = fVar.f2068e + fVar.f2067d + f2;
        int i13 = fVar.f2065b + 1;
        int i14 = i2 + 1;
        while (i14 < size2) {
            f fVar8 = this.f2059j.get(i14);
            while (true) {
                i3 = fVar8.f2065b;
                if (i13 >= i3) {
                    break;
                }
                f6 += this.f2062m.f(i13) + f2;
                i13++;
            }
            if (i3 == i11) {
                this.z = (fVar8.f2067d + f6) - 1.0f;
            }
            fVar8.f2068e = f6;
            f6 += fVar8.f2067d + f2;
            i14++;
            i13++;
        }
        this.c0 = false;
    }

    private void g(boolean z) {
        boolean z2 = this.o0 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.r.isFinished()) {
                this.r.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.r.getCurrX();
                int currY = this.r.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        C(currX);
                    }
                }
            }
        }
        this.E = false;
        for (int i2 = 0; i2 < this.f2059j.size(); i2++) {
            f fVar = this.f2059j.get(i2);
            if (fVar.f2066c) {
                fVar.f2066c = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                t.c0(this, this.n0);
            } else {
                this.n0.run();
            }
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private int i(int i2, float f2, int i3, int i4) {
        if (Math.abs(i4) <= this.T || Math.abs(i3) <= this.R) {
            i2 += (int) (f2 + (i2 >= this.n ? 0.4f : 0.6f));
        } else if (i3 <= 0) {
            i2++;
        }
        if (this.f2059j.size() <= 0) {
            return i2;
        }
        return Math.max(this.f2059j.get(0).f2065b, Math.min(i2, this.f2059j.get(r4.size() - 1).f2065b));
    }

    private void j(int i2, float f2, int i3) {
        j jVar = this.g0;
        if (jVar != null) {
            jVar.a(i2, f2, i3);
        }
        List<j> list = this.f0;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                j jVar2 = this.f0.get(i4);
                if (jVar2 != null) {
                    jVar2.a(i2, f2, i3);
                }
            }
        }
        j jVar3 = this.h0;
        if (jVar3 != null) {
            jVar3.a(i2, f2, i3);
        }
    }

    private void k(int i2) {
        j jVar = this.g0;
        if (jVar != null) {
            jVar.c(i2);
        }
        List<j> list = this.f0;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                j jVar2 = this.f0.get(i3);
                if (jVar2 != null) {
                    jVar2.c(i2);
                }
            }
        }
        j jVar3 = this.h0;
        if (jVar3 != null) {
            jVar3.c(i2);
        }
    }

    private void l(int i2) {
        j jVar = this.g0;
        if (jVar != null) {
            jVar.b(i2);
        }
        List<j> list = this.f0;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                j jVar2 = this.f0.get(i3);
                if (jVar2 != null) {
                    jVar2.b(i2);
                }
            }
        }
        j jVar3 = this.h0;
        if (jVar3 != null) {
            jVar3.b(i2);
        }
    }

    private void n(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).setLayerType(z ? this.k0 : 0, null);
        }
    }

    private void o() {
        this.G = false;
        this.H = false;
        VelocityTracker velocityTracker = this.Q;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.Q = null;
        }
    }

    private Rect q(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.D != z) {
            this.D = z;
        }
    }

    private f t() {
        int i2;
        int clientWidth = getClientWidth();
        float f2 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f3 = clientWidth > 0 ? this.u / clientWidth : 0.0f;
        f fVar = null;
        float f4 = 0.0f;
        int i3 = -1;
        int i4 = 0;
        boolean z = true;
        while (i4 < this.f2059j.size()) {
            f fVar2 = this.f2059j.get(i4);
            if (!z && fVar2.f2065b != (i2 = i3 + 1)) {
                fVar2 = this.f2060k;
                fVar2.f2068e = f2 + f4 + f3;
                fVar2.f2065b = i2;
                fVar2.f2067d = this.f2062m.f(i2);
                i4--;
            }
            f2 = fVar2.f2068e;
            float f5 = fVar2.f2067d + f2 + f3;
            if (!z && scrollX < f2) {
                return fVar;
            }
            if (scrollX < f5 || i4 == this.f2059j.size() - 1) {
                return fVar2;
            }
            i3 = fVar2.f2065b;
            f4 = fVar2.f2067d;
            i4++;
            fVar = fVar2;
            z = false;
        }
        return fVar;
    }

    private static boolean w(View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    private boolean x(float f2, float f3) {
        return (f2 < ((float) this.J) && f3 > 0.0f) || (f2 > ((float) (getWidth() - this.J)) && f3 < 0.0f);
    }

    private void z(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.P) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.L = motionEvent.getX(i2);
            this.P = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.Q;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    boolean A() throws Resources.NotFoundException {
        int i2 = this.n;
        if (i2 <= 0) {
            return false;
        }
        N(i2 - 1, true);
        return true;
    }

    boolean B() throws Resources.NotFoundException {
        androidx.viewpager.widget.a aVar = this.f2062m;
        if (aVar == null || this.n >= aVar.c() - 1) {
            return false;
        }
        N(this.n + 1, true);
        return true;
    }

    void E() throws Resources.NotFoundException {
        F(this.n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f7 A[PHI: r7 r10 r15
  0x00f7: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v9 int) binds: [B:62:0x00ec, B:59:0x00d6, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
  0x00f7: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:62:0x00ec, B:59:0x00d6, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
  0x00f7: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:62:0x00ec, B:59:0x00d6, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void F(int r18) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.F(int):void");
    }

    public void I(i iVar) {
        List<i> list = this.i0;
        if (list != null) {
            list.remove(iVar);
        }
    }

    public void J(j jVar) {
        List<j> list = this.f0;
        if (list != null) {
            list.remove(jVar);
        }
    }

    public void N(int i2, boolean z) throws Resources.NotFoundException {
        this.E = false;
        O(i2, z, false);
    }

    void O(int i2, boolean z, boolean z2) throws Resources.NotFoundException {
        P(i2, z, z2, 0);
    }

    void P(int i2, boolean z, boolean z2, int i3) throws Resources.NotFoundException {
        androidx.viewpager.widget.a aVar = this.f2062m;
        if (aVar == null || aVar.c() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.n == i2 && this.f2059j.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= this.f2062m.c()) {
            i2 = this.f2062m.c() - 1;
        }
        int i4 = this.F;
        int i5 = this.n;
        if (i2 > i5 + i4 || i2 < i5 - i4) {
            for (int i6 = 0; i6 < this.f2059j.size(); i6++) {
                this.f2059j.get(i6).f2066c = true;
            }
        }
        boolean z3 = this.n != i2;
        if (!this.b0) {
            F(i2);
            M(i2, z, i3, z3);
        } else {
            this.n = i2;
            if (z3) {
                k(i2);
            }
            requestLayout();
        }
    }

    void Q(int i2, int i3, int i4) throws Resources.NotFoundException {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.r;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.s ? this.r.getCurrX() : this.r.getStartX();
            this.r.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i5 = scrollX;
        int scrollY = getScrollY();
        int i6 = i2 - i5;
        int i7 = i3 - scrollY;
        if (i6 == 0 && i7 == 0) {
            g(false);
            E();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i8 = clientWidth / 2;
        float f2 = clientWidth;
        float f3 = i8;
        float fM = f3 + (m(Math.min(1.0f, (Math.abs(i6) * 1.0f) / f2)) * f3);
        int iAbs = Math.abs(i4);
        int iMin = Math.min(iAbs > 0 ? Math.round(Math.abs(fM / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i6) / ((f2 * this.f2062m.f(this.n)) + this.u)) + 1.0f) * 100.0f), 600);
        this.s = false;
        this.r.startScroll(i5, scrollY, i6, i7, iMin);
        t.b0(this);
    }

    f a(int i2, int i3) {
        f fVar = new f();
        fVar.f2065b = i2;
        fVar.a = this.f2062m.g(this, i2);
        fVar.f2067d = this.f2062m.f(i2);
        if (i3 < 0 || i3 >= this.f2059j.size()) {
            this.f2059j.add(fVar);
        } else {
            this.f2059j.add(i3, fVar);
        }
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        f fVarS;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (fVarS = s(childAt)) != null && fVarS.f2065b == this.n) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i3 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        f fVarS;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (fVarS = s(childAt)) != null && fVarS.f2065b == this.n) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean zW = gVar.a | w(view);
        gVar.a = zW;
        if (!this.C) {
            super.addView(view, i2, layoutParams);
        } else {
            if (zW) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            gVar.f2071d = true;
            addViewInLayout(view, i2, layoutParams);
        }
    }

    public void b(i iVar) {
        if (this.i0 == null) {
            this.i0 = new ArrayList();
        }
        this.i0.add(iVar);
    }

    public void c(j jVar) {
        if (this.f0 == null) {
            this.f0 = new ArrayList();
        }
        this.f0.add(jVar);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        if (this.f2062m == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i2 < 0 ? scrollX > ((int) (((float) clientWidth) * this.y)) : i2 > 0 && scrollX < ((int) (((float) clientWidth) * this.z));
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.s = true;
        if (this.r.isFinished() || !this.r.computeScrollOffset()) {
            g(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.r.getCurrX();
        int currY = this.r.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!C(currX)) {
                this.r.abortAnimation();
                scrollTo(0, currY);
            }
        }
        t.b0(this);
    }

    public boolean d(int i2) throws Resources.NotFoundException {
        boolean z;
        boolean zRequestFocus;
        View viewFindFocus = findFocus();
        boolean zA = false;
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    z = false;
                    break;
                }
                if (parent == this) {
                    z = true;
                    break;
                }
                parent = parent.getParent();
            }
            if (!z) {
                StringBuilder sb = new StringBuilder();
                sb.append(viewFindFocus.getClass().getSimpleName());
                for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb.append(" => ");
                    sb.append(parent2.getClass().getSimpleName());
                }
                Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                viewFindFocus = null;
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i2);
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            if (i2 == 17) {
                zRequestFocus = (viewFindFocus == null || q(this.f2061l, viewFindNextFocus).left < q(this.f2061l, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : A();
            } else if (i2 == 66) {
                zRequestFocus = (viewFindFocus == null || q(this.f2061l, viewFindNextFocus).left > q(this.f2061l, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : B();
            }
            zA = zRequestFocus;
        } else if (i2 == 17 || i2 == 1) {
            zA = A();
        } else if (i2 == 66 || i2 == 2) {
            zA = B();
        }
        if (zA) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i2));
        }
        return zA;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || p(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f fVarS;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (fVarS = s(childAt)) != null && fVarS.f2065b == this.n && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        androidx.viewpager.widget.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f2062m) != null && aVar.c() > 1)) {
            if (!this.W.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.y * width);
                this.W.setSize(height, width);
                zDraw = false | this.W.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.a0.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.z + 1.0f)) * width2);
                this.a0.setSize(height2, width2);
                zDraw |= this.a0.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.W.finish();
            this.a0.finish();
        }
        if (zDraw) {
            t.b0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.v;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    protected boolean f(View view, boolean z, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && f(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i2);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public androidx.viewpager.widget.a getAdapter() {
        return this.f2062m;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i2, int i3) {
        if (this.l0 == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((g) this.m0.get(i3).getLayoutParams()).f2073f;
    }

    public int getCurrentItem() {
        return this.n;
    }

    public int getOffscreenPageLimit() {
        return this.F;
    }

    public int getPageMargin() {
        return this.u;
    }

    void h() throws Resources.NotFoundException {
        int iC = this.f2062m.c();
        this.f2058i = iC;
        boolean z = this.f2059j.size() < (this.F * 2) + 1 && this.f2059j.size() < iC;
        int iMax = this.n;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.f2059j.size()) {
            f fVar = this.f2059j.get(i2);
            int iD = this.f2062m.d(fVar.a);
            if (iD != -1) {
                if (iD == -2) {
                    this.f2059j.remove(i2);
                    i2--;
                    if (!z2) {
                        this.f2062m.o(this);
                        z2 = true;
                    }
                    this.f2062m.a(this, fVar.f2065b, fVar.a);
                    int i3 = this.n;
                    if (i3 == fVar.f2065b) {
                        iMax = Math.max(0, Math.min(i3, iC - 1));
                    }
                } else {
                    int i4 = fVar.f2065b;
                    if (i4 != iD) {
                        if (i4 == this.n) {
                            iMax = iD;
                        }
                        fVar.f2065b = iD;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.f2062m.b(this);
        }
        Collections.sort(this.f2059j, f2055f);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                g gVar = (g) getChildAt(i5).getLayoutParams();
                if (!gVar.a) {
                    gVar.f2070c = 0.0f;
                }
            }
            O(iMax, false, true);
            requestLayout();
        }
    }

    float m(float f2) {
        return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.n0);
        Scroller scroller = this.r;
        if (scroller != null && !scroller.isFinished()) {
            this.r.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i2;
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.u <= 0 || this.v == null || this.f2059j.size() <= 0 || this.f2062m == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f4 = this.u / width;
        int i3 = 0;
        f fVar = this.f2059j.get(0);
        float f5 = fVar.f2068e;
        int size = this.f2059j.size();
        int i4 = fVar.f2065b;
        int i5 = this.f2059j.get(size - 1).f2065b;
        while (i4 < i5) {
            while (true) {
                i2 = fVar.f2065b;
                if (i4 <= i2 || i3 >= size) {
                    break;
                }
                i3++;
                fVar = this.f2059j.get(i3);
            }
            if (i4 == i2) {
                float f6 = fVar.f2068e;
                float f7 = fVar.f2067d;
                f2 = (f6 + f7) * width;
                f5 = f6 + f7 + f4;
            } else {
                float f8 = this.f2062m.f(i4);
                f2 = (f5 + f8) * width;
                f5 += f8 + f4;
            }
            if (this.u + f2 > scrollX) {
                f3 = f4;
                this.v.setBounds(Math.round(f2), this.w, Math.round(this.u + f2), this.x);
                this.v.draw(canvas);
            } else {
                f3 = f4;
            }
            if (f2 > scrollX + r2) {
                return;
            }
            i4++;
            f4 = f3;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            L();
            return false;
        }
        if (action != 0) {
            if (this.G) {
                return true;
            }
            if (this.H) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.N = x;
            this.L = x;
            float y = motionEvent.getY();
            this.O = y;
            this.M = y;
            this.P = motionEvent.getPointerId(0);
            this.H = false;
            this.s = true;
            this.r.computeScrollOffset();
            if (this.o0 != 2 || Math.abs(this.r.getFinalX() - this.r.getCurrX()) <= this.U) {
                g(false);
                this.G = false;
            } else {
                this.r.abortAnimation();
                this.E = false;
                E();
                this.G = true;
                K(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.P;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f2 = x2 - this.L;
                float fAbs = Math.abs(f2);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.O);
                if (f2 != 0.0f && !x(this.L, f2) && f(this, false, (int) f2, (int) x2, (int) y2)) {
                    this.L = x2;
                    this.M = y2;
                    this.H = true;
                    return false;
                }
                int i3 = this.K;
                if (fAbs > i3 && fAbs * 0.5f > fAbs2) {
                    this.G = true;
                    K(true);
                    setScrollState(1);
                    float f3 = this.N;
                    float f4 = this.K;
                    this.L = f2 > 0.0f ? f3 + f4 : f3 - f4;
                    this.M = y2;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i3) {
                    this.H = true;
                }
                if (this.G && D(x2)) {
                    t.b0(this);
                }
            }
        } else if (action == 6) {
            z(motionEvent);
        }
        if (this.Q == null) {
            this.Q = VelocityTracker.obtain();
        }
        this.Q.addMovement(motionEvent);
        return this.G;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r14, int r15) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        f fVarS;
        int childCount = getChildCount();
        int i5 = -1;
        if ((i2 & 2) != 0) {
            i5 = childCount;
            i3 = 0;
            i4 = 1;
        } else {
            i3 = childCount - 1;
            i4 = -1;
        }
        while (i3 != i5) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (fVarS = s(childAt)) != null && fVarS.f2065b == this.n && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m mVar = (m) parcelable;
        super.onRestoreInstanceState(mVar.a());
        androidx.viewpager.widget.a aVar = this.f2062m;
        if (aVar != null) {
            aVar.k(mVar.f2076h, mVar.f2077i);
            O(mVar.f2075g, false, true);
        } else {
            this.o = mVar.f2075g;
            this.p = mVar.f2076h;
            this.q = mVar.f2077i;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        m mVar = new m(super.onSaveInstanceState());
        mVar.f2075g = this.n;
        androidx.viewpager.widget.a aVar = this.f2062m;
        if (aVar != null) {
            mVar.f2076h = aVar.l();
        }
        return mVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.u;
            G(i2, i4, i6, i6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                return keyEvent.hasModifiers(2) ? A() : d(17);
            }
            if (keyCode == 22) {
                return keyEvent.hasModifiers(2) ? B() : d(66);
            }
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return d(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return d(1);
                }
            }
        }
        return false;
    }

    f r(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return s(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.C) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    f s(View view) {
        for (int i2 = 0; i2 < this.f2059j.size(); i2++) {
            f fVar = this.f2059j.get(i2);
            if (this.f2062m.h(view, fVar.a)) {
                return fVar;
            }
        }
        return null;
    }

    public void setAdapter(androidx.viewpager.widget.a aVar) {
        androidx.viewpager.widget.a aVar2 = this.f2062m;
        if (aVar2 != null) {
            aVar2.n(null);
            this.f2062m.o(this);
            for (int i2 = 0; i2 < this.f2059j.size(); i2++) {
                f fVar = this.f2059j.get(i2);
                this.f2062m.a(this, fVar.f2065b, fVar.a);
            }
            this.f2062m.b(this);
            this.f2059j.clear();
            H();
            this.n = 0;
            scrollTo(0, 0);
        }
        androidx.viewpager.widget.a aVar3 = this.f2062m;
        this.f2062m = aVar;
        this.f2058i = 0;
        if (aVar != null) {
            if (this.t == null) {
                this.t = new l();
            }
            this.f2062m.n(this.t);
            this.E = false;
            boolean z = this.b0;
            this.b0 = true;
            this.f2058i = this.f2062m.c();
            if (this.o >= 0) {
                this.f2062m.k(this.p, this.q);
                O(this.o, false, true);
                this.o = -1;
                this.p = null;
                this.q = null;
            } else if (z) {
                requestLayout();
            } else {
                E();
            }
        }
        List<i> list = this.i0;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.i0.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.i0.get(i3).a(this, aVar3, aVar);
        }
    }

    public void setCurrentItem(int i2) {
        this.E = false;
        O(i2, !this.b0, false);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i2 + " too small; defaulting to 1");
            i2 = 1;
        }
        if (i2 != this.F) {
            this.F = i2;
            E();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.g0 = jVar;
    }

    public void setPageMargin(int i2) {
        int i3 = this.u;
        this.u = i2;
        int width = getWidth();
        G(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.v = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    void setScrollState(int i2) {
        if (this.o0 == i2) {
            return;
        }
        this.o0 = i2;
        if (this.j0 != null) {
            n(i2 != 0);
        }
        l(i2);
    }

    f u(int i2) {
        for (int i3 = 0; i3 < this.f2059j.size(); i3++) {
            f fVar = this.f2059j.get(i3);
            if (fVar.f2065b == i2) {
                return fVar;
            }
        }
        return null;
    }

    void v() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.r = new Scroller(context, f2056g);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.K = viewConfiguration.getScaledPagingTouchSlop();
        this.R = (int) (400.0f * f2);
        this.S = viewConfiguration.getScaledMaximumFlingVelocity();
        this.W = new EdgeEffect(context);
        this.a0 = new EdgeEffect(context);
        this.T = (int) (25.0f * f2);
        this.U = (int) (2.0f * f2);
        this.I = (int) (f2 * 16.0f);
        t.k0(this, new h());
        if (t.z(this) == 0) {
            t.u0(this, 1);
        }
        t.w0(this, new d());
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.v;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void y(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.e0
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r9 = (androidx.viewpager.widget.ViewPager.g) r9
            boolean r10 = r9.a
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.f2069b
            r9 = r9 & 7
            if (r9 == r2) goto L4d
            r10 = 3
            if (r9 == r10) goto L47
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5c
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L59
        L47:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L59:
            r11 = r9
            r9 = r3
            r3 = r11
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            r12.j(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$k r13 = r12.j0
            if (r13 == 0) goto L9f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7a:
            if (r1 >= r14) goto L9f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r0 = (androidx.viewpager.widget.ViewPager.g) r0
            boolean r0 = r0.a
            if (r0 == 0) goto L8b
            goto L9c
        L8b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$k r3 = r12.j0
            r3.a(r15, r0)
        L9c:
            int r1 = r1 + 1
            goto L7a
        L9f:
            r12.d0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.y(int, float, int):void");
    }

    public static class g extends ViewGroup.LayoutParams {
        public boolean a;

        /* renamed from: b, reason: collision with root package name */
        public int f2069b;

        /* renamed from: c, reason: collision with root package name */
        float f2070c;

        /* renamed from: d, reason: collision with root package name */
        boolean f2071d;

        /* renamed from: e, reason: collision with root package name */
        int f2072e;

        /* renamed from: f, reason: collision with root package name */
        int f2073f;

        public g() {
            super(-1, -1);
            this.f2070c = 0.0f;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2070c = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f2054e);
            this.f2069b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(androidx.core.content.a.e(getContext(), i2));
    }
}