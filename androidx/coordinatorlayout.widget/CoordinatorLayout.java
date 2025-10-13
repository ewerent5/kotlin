package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import c.h.l.b0;
import c.h.l.l;
import c.h.l.m;
import c.h.l.o;
import c.h.l.p;
import c.h.l.t;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import j$.util.Comparator;
import j$.util.function.Function;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements l, m {

    /* renamed from: e, reason: collision with root package name */
    static final String f786e;

    /* renamed from: f, reason: collision with root package name */
    static final Class<?>[] f787f;

    /* renamed from: g, reason: collision with root package name */
    static final ThreadLocal<Map<String, Constructor<c>>> f788g;

    /* renamed from: h, reason: collision with root package name */
    static final Comparator<View> f789h;

    /* renamed from: i, reason: collision with root package name */
    private static final c.h.k.e<Rect> f790i;
    ViewGroup.OnHierarchyChangeListener A;
    private p B;
    private final o C;

    /* renamed from: j, reason: collision with root package name */
    private final List<View> f791j;

    /* renamed from: k, reason: collision with root package name */
    private final androidx.coordinatorlayout.widget.a<View> f792k;

    /* renamed from: l, reason: collision with root package name */
    private final List<View> f793l;

    /* renamed from: m, reason: collision with root package name */
    private final List<View> f794m;
    private Paint n;
    private final int[] o;
    private final int[] p;
    private boolean q;
    private boolean r;
    private int[] s;
    private View t;
    private View u;
    private g v;
    private boolean w;
    private b0 x;
    private boolean y;
    private Drawable z;

    class a implements p {
        a() {
        }

        @Override // c.h.l.p
        public b0 a(View view, b0 b0Var) {
            return CoordinatorLayout.this.W(b0Var);
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2, int i3) {
            if (i3 == 0) {
                return z(coordinatorLayout, v, view, view2, i2);
            }
            return false;
        }

        @Deprecated
        public void B(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void C(CoordinatorLayout coordinatorLayout, V v, View view, int i2) {
            if (i2 == 0) {
                B(coordinatorLayout, v, view);
            }
        }

        public boolean D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v) {
            return d(coordinatorLayout, v) > 0.0f;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        public int c(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        public float d(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public b0 f(CoordinatorLayout coordinatorLayout, V v, b0 b0Var) {
            return b0Var;
        }

        public void g(f fVar) {
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void j() {
        }

        public boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, V v, int i2) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4, int i5) {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, V v, View view, float f2, float f3, boolean z) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, V v, View view, float f2, float f3) {
            return false;
        }

        @Deprecated
        public void p(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int[] iArr) {
        }

        public void q(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int[] iArr, int i4) {
            if (i4 == 0) {
                p(coordinatorLayout, v, view, i2, i3, iArr);
            }
        }

        @Deprecated
        public void r(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5) {
        }

        @Deprecated
        public void s(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5, int i6) {
            if (i6 == 0) {
                r(coordinatorLayout, v, view, i2, i3, i4, i5);
            }
        }

        public void t(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
            iArr[0] = iArr[0] + i4;
            iArr[1] = iArr[1] + i5;
            s(coordinatorLayout, v, view, i2, i3, i4, i5, i6);
        }

        @Deprecated
        public void u(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2) {
        }

        public void v(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2, int i3) {
            if (i3 == 0) {
                u(coordinatorLayout, v, view, view2, i2);
            }
        }

        public boolean w(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public void x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public Parcelable y(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean z(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface d {
        Class<? extends c> value();
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.A;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.H(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.A;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.H(0);
            return true;
        }
    }

    static class i implements Comparator<View>, j$.util.Comparator {
        i() {
        }

        @Override // java.util.Comparator, j$.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fK = t.K(view);
            float fK2 = t.K(view2);
            if (fK > fK2) {
                return -1;
            }
            return fK < fK2 ? 1 : 0;
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

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f786e = r0 != null ? r0.getName() : null;
        if (Build.VERSION.SDK_INT >= 21) {
            f789h = new i();
        } else {
            f789h = null;
        }
        f787f = new Class[]{Context.class, AttributeSet.class};
        f788g = new ThreadLocal<>();
        f790i = new c.h.k.g(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.g.a.a);
    }

    private boolean A(View view) {
        return this.f792k.j(view);
    }

    private void C(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        Rect rectA = a();
        rectA.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.x != null && t.y(this) && !t.y(view)) {
            rectA.left += this.x.f();
            rectA.top += this.x.h();
            rectA.right -= this.x.g();
            rectA.bottom -= this.x.e();
        }
        Rect rectA2 = a();
        c.h.l.d.a(S(fVar.f797c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectA, rectA2, i2);
        view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        O(rectA);
        O(rectA2);
    }

    private void D(View view, View view2, int i2) {
        Rect rectA = a();
        Rect rectA2 = a();
        try {
            t(view2, rectA);
            u(view, i2, rectA, rectA2);
            view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        } finally {
            O(rectA);
            O(rectA2);
        }
    }

    private void E(View view, int i2, int i3) {
        f fVar = (f) view.getLayoutParams();
        int iB = c.h.l.d.b(T(fVar.f797c), i3);
        int i4 = iB & 7;
        int i5 = iB & SyslogConstants.LOG_ALERT;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i3 == 1) {
            i2 = width - i2;
        }
        int iW = w(i2) - measuredWidth;
        int i6 = 0;
        if (i4 == 1) {
            iW += measuredWidth / 2;
        } else if (i4 == 5) {
            iW += measuredWidth;
        }
        if (i5 == 16) {
            i6 = 0 + (measuredHeight / 2);
        } else if (i5 == 80) {
            i6 = measuredHeight + 0;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(iW, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i6, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    private void F(View view, Rect rect, int i2) {
        boolean z;
        boolean z2;
        int width;
        int i3;
        int i4;
        int i5;
        int height;
        int i6;
        int i7;
        int i8;
        if (t.Q(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c cVarF = fVar.f();
            Rect rectA = a();
            Rect rectA2 = a();
            rectA2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (cVarF == null || !cVarF.b(this, view, rectA)) {
                rectA.set(rectA2);
            } else if (!rectA2.contains(rectA)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectA.toShortString() + " | Bounds:" + rectA2.toShortString());
            }
            O(rectA2);
            if (rectA.isEmpty()) {
                O(rectA);
                return;
            }
            int iB = c.h.l.d.b(fVar.f802h, i2);
            boolean z3 = true;
            if ((iB & 48) != 48 || (i7 = (rectA.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f804j) >= (i8 = rect.top)) {
                z = false;
            } else {
                V(view, i8 - i7);
                z = true;
            }
            if ((iB & 80) == 80 && (height = ((getHeight() - rectA.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f804j) < (i6 = rect.bottom)) {
                V(view, height - i6);
                z = true;
            }
            if (!z) {
                V(view, 0);
            }
            if ((iB & 3) != 3 || (i4 = (rectA.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f803i) >= (i5 = rect.left)) {
                z2 = false;
            } else {
                U(view, i5 - i4);
                z2 = true;
            }
            if ((iB & 5) != 5 || (width = ((getWidth() - rectA.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f803i) >= (i3 = rect.right)) {
                z3 = z2;
            } else {
                U(view, width - i3);
            }
            if (!z3) {
                U(view, 0);
            }
            O(rectA);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static c K(Context context, AttributeSet attributeSet, String str) throws NoSuchMethodException, SecurityException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f786e;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + CoreConstants.DOT + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<c>>> threadLocal = f788g;
            Map<String, Constructor<c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f787f);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e2) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e2);
        }
    }

    private boolean L(MotionEvent motionEvent, int i2) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f793l;
        z(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zK = false;
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = list.get(i3);
            f fVar = (f) view.getLayoutParams();
            c cVarF = fVar.f();
            if (!(zK || z) || actionMasked == 0) {
                if (!zK && cVarF != null) {
                    if (i2 == 0) {
                        zK = cVarF.k(this, view, motionEvent);
                    } else if (i2 == 1) {
                        zK = cVarF.D(this, view, motionEvent);
                    }
                    if (zK) {
                        this.t = view;
                    }
                }
                boolean zC = fVar.c();
                boolean zI = fVar.i(this, view);
                z = zI && !zC;
                if (zI && !z) {
                    break;
                }
            } else if (cVarF != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    cVarF.k(this, view, motionEventObtain);
                } else if (i2 == 1) {
                    cVarF.D(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zK;
    }

    private void M() {
        this.f791j.clear();
        this.f792k.c();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            f fVarY = y(childAt);
            fVarY.d(this, childAt);
            this.f792k.b(childAt);
            for (int i3 = 0; i3 < childCount; i3++) {
                if (i3 != i2) {
                    View childAt2 = getChildAt(i3);
                    if (fVarY.b(this, childAt, childAt2)) {
                        if (!this.f792k.d(childAt2)) {
                            this.f792k.b(childAt2);
                        }
                        this.f792k.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f791j.addAll(this.f792k.i());
        Collections.reverse(this.f791j);
    }

    private static void O(Rect rect) {
        rect.setEmpty();
        f790i.a(rect);
    }

    private void Q(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            c cVarF = ((f) childAt.getLayoutParams()).f();
            if (cVarF != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    cVarF.k(this, childAt, motionEventObtain);
                } else {
                    cVarF.D(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((f) getChildAt(i3).getLayoutParams()).m();
        }
        this.t = null;
        this.q = false;
    }

    private static int R(int i2) {
        if (i2 == 0) {
            return 17;
        }
        return i2;
    }

    private static int S(int i2) {
        if ((i2 & 7) == 0) {
            i2 |= 8388611;
        }
        return (i2 & SyslogConstants.LOG_ALERT) == 0 ? i2 | 48 : i2;
    }

    private static int T(int i2) {
        if (i2 == 0) {
            return 8388661;
        }
        return i2;
    }

    private void U(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        int i3 = fVar.f803i;
        if (i3 != i2) {
            t.V(view, i2 - i3);
            fVar.f803i = i2;
        }
    }

    private void V(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        int i3 = fVar.f804j;
        if (i3 != i2) {
            t.W(view, i2 - i3);
            fVar.f804j = i2;
        }
    }

    private void X() {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (!t.y(this)) {
            t.w0(this, null);
            return;
        }
        if (this.B == null) {
            this.B = new a();
        }
        t.w0(this, this.B);
        setSystemUiVisibility(1280);
    }

    private static Rect a() {
        Rect rectB = f790i.b();
        return rectB == null ? new Rect() : rectB;
    }

    private static int c(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    private void d(f fVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(iMax, iMax2, i2 + iMax, i3 + iMax2);
    }

    private b0 e(b0 b0Var) {
        c cVarF;
        if (b0Var.l()) {
            return b0Var;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (t.y(childAt) && (cVarF = ((f) childAt.getLayoutParams()).f()) != null) {
                b0Var = cVarF.f(this, childAt, b0Var);
                if (b0Var.l()) {
                    break;
                }
            }
        }
        return b0Var;
    }

    private void v(View view, int i2, Rect rect, Rect rect2, f fVar, int i3, int i4) {
        int iB = c.h.l.d.b(R(fVar.f797c), i2);
        int iB2 = c.h.l.d.b(S(fVar.f798d), i2);
        int i5 = iB & 7;
        int i6 = iB & SyslogConstants.LOG_ALERT;
        int i7 = iB2 & 7;
        int i8 = iB2 & SyslogConstants.LOG_ALERT;
        int iWidth = i7 != 1 ? i7 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i8 != 16 ? i8 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i5 == 1) {
            iWidth -= i3 / 2;
        } else if (i5 != 5) {
            iWidth -= i3;
        }
        if (i6 == 16) {
            iHeight -= i4 / 2;
        } else if (i6 != 80) {
            iHeight -= i4;
        }
        rect2.set(iWidth, iHeight, i3 + iWidth, i4 + iHeight);
    }

    private int w(int i2) {
        int[] iArr = this.s;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        }
        if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i2 + " out of range for " + this);
        return 0;
    }

    private void z(List<View> list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        java.util.Comparator<View> comparator = f789h;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    public boolean B(View view, int i2, int i3) {
        Rect rectA = a();
        t(view, rectA);
        try {
            return rectA.contains(i2, i3);
        } finally {
            O(rectA);
        }
    }

    void G(View view, int i2) {
        c cVarF;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f805k != null) {
            Rect rectA = a();
            Rect rectA2 = a();
            Rect rectA3 = a();
            t(fVar.f805k, rectA);
            q(view, false, rectA2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            v(view, i2, rectA, rectA3, fVar, measuredWidth, measuredHeight);
            boolean z = (rectA3.left == rectA2.left && rectA3.top == rectA2.top) ? false : true;
            d(fVar, rectA3, measuredWidth, measuredHeight);
            int i3 = rectA3.left - rectA2.left;
            int i4 = rectA3.top - rectA2.top;
            if (i3 != 0) {
                t.V(view, i3);
            }
            if (i4 != 0) {
                t.W(view, i4);
            }
            if (z && (cVarF = fVar.f()) != null) {
                cVarF.h(this, view, fVar.f805k);
            }
            O(rectA);
            O(rectA2);
            O(rectA3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void H(int r18) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.H(int):void");
    }

    public void I(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        if (fVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = fVar.f805k;
        if (view2 != null) {
            D(view, view2, i2);
            return;
        }
        int i3 = fVar.f799e;
        if (i3 >= 0) {
            E(view, i3, i2);
        } else {
            C(view, i2);
        }
    }

    public void J(View view, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    void N(View view, Rect rect) {
        ((f) view.getLayoutParams()).q(rect);
    }

    void P() {
        if (this.r && this.v != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.v);
        }
        this.w = false;
    }

    final b0 W(b0 b0Var) {
        if (c.h.k.c.a(this.x, b0Var)) {
            return b0Var;
        }
        this.x = b0Var;
        boolean z = b0Var != null && b0Var.h() > 0;
        this.y = z;
        setWillNotDraw(!z && getBackground() == null);
        b0 b0VarE = e(b0Var);
        requestLayout();
        return b0VarE;
    }

    void b() {
        if (this.r) {
            if (this.v == null) {
                this.v = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.v);
        }
        this.w = true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j2) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.a;
        if (cVar != null) {
            float fD = cVar.d(this, view);
            if (fD > 0.0f) {
                if (this.n == null) {
                    this.n = new Paint();
                }
                this.n.setColor(fVar.a.c(this, view));
                this.n.setAlpha(c(Math.round(fD * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.n);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.z;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = false | drawable.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    public void f(View view) {
        List listG = this.f792k.g(view);
        if (listG == null || listG.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < listG.size(); i2++) {
            View view2 = (View) listG.get(i2);
            c cVarF = ((f) view2.getLayoutParams()).f();
            if (cVarF != null) {
                cVarF.h(this, view2, view);
            }
        }
    }

    void g() {
        int childCount = getChildCount();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            if (A(getChildAt(i2))) {
                z = true;
                break;
            }
            i2++;
        }
        if (z != this.w) {
            if (z) {
                b();
            } else {
                P();
            }
        }
    }

    final List<View> getDependencySortedChildren() {
        M();
        return Collections.unmodifiableList(this.f791j);
    }

    public final b0 getLastWindowInsets() {
        return this.x;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.C.a();
    }

    public Drawable getStatusBarBackground() {
        return this.z;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    @Override // c.h.l.m
    public void j(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        c cVarF;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i6) && (cVarF = fVar.f()) != null) {
                    int[] iArr2 = this.o;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarF.t(this, childAt, view, i2, i3, i4, i5, i6, iArr2);
                    int[] iArr3 = this.o;
                    iMax = i4 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    iMax2 = i5 > 0 ? Math.max(iMax2, this.o[1]) : Math.min(iMax2, this.o[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            H(1);
        }
    }

    @Override // c.h.l.l
    public void k(View view, int i2, int i3, int i4, int i5, int i6) {
        j(view, i2, i3, i4, i5, 0, this.p);
    }

    @Override // c.h.l.l
    public boolean l(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVarF = fVar.f();
                if (cVarF != null) {
                    boolean zA = cVarF.A(this, childAt, view, view2, i2, i3);
                    z |= zA;
                    fVar.r(i3, zA);
                } else {
                    fVar.r(i3, false);
                }
            }
        }
        return z;
    }

    @Override // c.h.l.l
    public void m(View view, View view2, int i2, int i3) {
        c cVarF;
        this.C.c(view, view2, i2, i3);
        this.u = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i3) && (cVarF = fVar.f()) != null) {
                cVarF.v(this, childAt, view, view2, i2, i3);
            }
        }
    }

    @Override // c.h.l.l
    public void n(View view, int i2) {
        this.C.d(view, i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i2)) {
                c cVarF = fVar.f();
                if (cVarF != null) {
                    cVarF.C(this, childAt, view, i2);
                }
                fVar.l(i2);
                fVar.k();
            }
        }
        this.u = null;
    }

    @Override // c.h.l.l
    public void o(View view, int i2, int i3, int[] iArr, int i4) {
        c cVarF;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i4) && (cVarF = fVar.f()) != null) {
                    int[] iArr2 = this.o;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarF.q(this, childAt, view, i2, i3, iArr2, i4);
                    int[] iArr3 = this.o;
                    iMax = i2 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.o;
                    iMax2 = i3 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            H(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Q(false);
        if (this.w) {
            if (this.v == null) {
                this.v = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.v);
        }
        if (this.x == null && t.y(this)) {
            t.h0(this);
        }
        this.r = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Q(false);
        if (this.w && this.v != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.v);
        }
        View view = this.u;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.r = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.y || this.z == null) {
            return;
        }
        b0 b0Var = this.x;
        int iH = b0Var != null ? b0Var.h() : 0;
        if (iH > 0) {
            this.z.setBounds(0, 0, getWidth(), iH);
            this.z.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            Q(true);
        }
        boolean zL = L(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            Q(true);
        }
        return zL;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        c cVarF;
        int iB = t.B(this);
        int size = this.f791j.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = this.f791j.get(i6);
            if (view.getVisibility() != 8 && ((cVarF = ((f) view.getLayoutParams()).f()) == null || !cVarF.l(this, view, iB))) {
                I(view, iB);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, c.h.l.n
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        c cVarF;
        int childCount = getChildCount();
        boolean zN = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (cVarF = fVar.f()) != null) {
                    zN |= cVarF.n(this, childAt, view, f2, f3, z);
                }
            }
        }
        if (zN) {
            H(1);
        }
        return zN;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, c.h.l.n
    public boolean onNestedPreFling(View view, float f2, float f3) {
        c cVarF;
        int childCount = getChildCount();
        boolean zO = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (cVarF = fVar.f()) != null) {
                    zO |= cVarF.o(this, childAt, view, f2, f3);
                }
            }
        }
        return zO;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, c.h.l.n
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        o(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, c.h.l.n
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        k(view, i2, i3, i4, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, c.h.l.n
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        m(view, view2, i2, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        SparseArray<Parcelable> sparseArray = hVar.f809g;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c cVarF = y(childAt).f();
            if (id != -1 && cVarF != null && (parcelable2 = sparseArray.get(id)) != null) {
                cVarF.x(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableY;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c cVarF = ((f) childAt.getLayoutParams()).f();
            if (id != -1 && cVarF != null && (parcelableY = cVarF.y(this, childAt)) != null) {
                sparseArray.append(id, parcelableY);
            }
        }
        hVar.f809g = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, c.h.l.n
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return l(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, c.h.l.n
    public void onStopNestedScroll(View view) {
        n(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[PHI: r3
  0x002b: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:9:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.t
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.L(r1, r4)
            if (r3 == 0) goto L2b
            goto L16
        L15:
            r3 = 0
        L16:
            android.view.View r6 = r0.t
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f()
            if (r6 == 0) goto L2b
            android.view.View r7 = r0.t
            boolean r6 = r6.D(r0, r7, r1)
            goto L2c
        L2b:
            r6 = 0
        L2c:
            android.view.View r7 = r0.t
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L57
        L54:
            r0.Q(r5)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    void q(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            t(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List<View> r(View view) {
        List<View> listH = this.f792k.h(view);
        this.f794m.clear();
        if (listH != null) {
            this.f794m.addAll(listH);
        }
        return this.f794m;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        c cVarF = ((f) view.getLayoutParams()).f();
        if (cVarF == null || !cVarF.w(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.q) {
            return;
        }
        Q(false);
        this.q = true;
    }

    public List<View> s(View view) {
        List listG = this.f792k.g(view);
        this.f794m.clear();
        if (listG != null) {
            this.f794m.addAll(listG);
        }
        return this.f794m;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        X();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.A = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Drawable drawable2 = this.z;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.z = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.z.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.m(this.z, t.B(this));
                this.z.setVisible(getVisibility() == 0, false);
                this.z.setCallback(this);
            }
            t.b0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        setStatusBarBackground(i2 != 0 ? androidx.core.content.a.e(getContext(), i2) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.z;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.z.setVisible(z, false);
    }

    void t(View view, Rect rect) {
        androidx.coordinatorlayout.widget.b.a(this, view, rect);
    }

    void u(View view, int i2, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        v(view, i2, rect, rect2, fVar, measuredWidth, measuredHeight);
        d(fVar, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.z;
    }

    void x(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    f y(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f796b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.o(behavior);
                fVar.f796b = true;
            } else {
                d dVar = null;
                for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    dVar = (d) superclass.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.o(dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e2) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e2);
                    }
                }
                fVar.f796b = true;
            }
        }
        return fVar;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f791j = new ArrayList();
        this.f792k = new androidx.coordinatorlayout.widget.a<>();
        this.f793l = new ArrayList();
        this.f794m = new ArrayList();
        this.o = new int[2];
        this.p = new int[2];
        this.C = new o(this);
        TypedArray typedArrayObtainStyledAttributes = i2 == 0 ? context.obtainStyledAttributes(attributeSet, c.g.c.f2958b, 0, c.g.b.a) : context.obtainStyledAttributes(attributeSet, c.g.c.f2958b, i2, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            if (i2 == 0) {
                saveAttributeDataForStyleable(context, c.g.c.f2958b, attributeSet, typedArrayObtainStyledAttributes, 0, c.g.b.a);
            } else {
                saveAttributeDataForStyleable(context, c.g.c.f2958b, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
            }
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(c.g.c.f2959c, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.s = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = this.s.length;
            for (int i3 = 0; i3 < length; i3++) {
                this.s[i3] = (int) (r12[i3] * f2);
            }
        }
        this.z = typedArrayObtainStyledAttributes.getDrawable(c.g.c.f2960d);
        typedArrayObtainStyledAttributes.recycle();
        X();
        super.setOnHierarchyChangeListener(new e());
        if (t.z(this) == 0) {
            t.u0(this, 1);
        }
    }

    protected static class h extends c.j.a.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: g, reason: collision with root package name */
        SparseArray<Parcelable> f809g;

        static class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i2) {
                return new h[i2];
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i2 = parcel.readInt();
            int[] iArr = new int[i2];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f809g = new SparseArray<>(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                this.f809g.append(iArr[i3], parcelableArray[i3]);
            }
        }

        @Override // c.j.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            SparseArray<Parcelable> sparseArray = this.f809g;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i3 = 0; i3 < size; i3++) {
                iArr[i3] = this.f809g.keyAt(i3);
                parcelableArr[i3] = this.f809g.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i2);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {
        c a;

        /* renamed from: b, reason: collision with root package name */
        boolean f796b;

        /* renamed from: c, reason: collision with root package name */
        public int f797c;

        /* renamed from: d, reason: collision with root package name */
        public int f798d;

        /* renamed from: e, reason: collision with root package name */
        public int f799e;

        /* renamed from: f, reason: collision with root package name */
        int f800f;

        /* renamed from: g, reason: collision with root package name */
        public int f801g;

        /* renamed from: h, reason: collision with root package name */
        public int f802h;

        /* renamed from: i, reason: collision with root package name */
        int f803i;

        /* renamed from: j, reason: collision with root package name */
        int f804j;

        /* renamed from: k, reason: collision with root package name */
        View f805k;

        /* renamed from: l, reason: collision with root package name */
        View f806l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f807m;
        private boolean n;
        private boolean o;
        private boolean p;
        final Rect q;
        Object r;

        public f(int i2, int i3) {
            super(i2, i3);
            this.f796b = false;
            this.f797c = 0;
            this.f798d = 0;
            this.f799e = -1;
            this.f800f = -1;
            this.f801g = 0;
            this.f802h = 0;
            this.q = new Rect();
        }

        private void n(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f800f);
            this.f805k = viewFindViewById;
            if (viewFindViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f806l = null;
                    this.f805k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f800f) + " to anchor view " + view);
            }
            if (viewFindViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f806l = null;
                this.f805k = null;
                return;
            }
            for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.f806l = null;
                    this.f805k = null;
                    return;
                }
                if (parent instanceof View) {
                    viewFindViewById = parent;
                }
            }
            this.f806l = viewFindViewById;
        }

        private boolean s(View view, int i2) {
            int iB = c.h.l.d.b(((f) view.getLayoutParams()).f801g, i2);
            return iB != 0 && (c.h.l.d.b(this.f802h, i2) & iB) == iB;
        }

        private boolean t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f805k.getId() != this.f800f) {
                return false;
            }
            View view2 = this.f805k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f806l = null;
                    this.f805k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f806l = view2;
            return true;
        }

        boolean a() {
            return this.f805k == null && this.f800f != -1;
        }

        boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            c cVar;
            return view2 == this.f806l || s(view2, t.B(coordinatorLayout)) || ((cVar = this.a) != null && cVar.e(coordinatorLayout, view, view2));
        }

        boolean c() {
            if (this.a == null) {
                this.f807m = false;
            }
            return this.f807m;
        }

        View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f800f == -1) {
                this.f806l = null;
                this.f805k = null;
                return null;
            }
            if (this.f805k == null || !t(view, coordinatorLayout)) {
                n(view, coordinatorLayout);
            }
            return this.f805k;
        }

        public int e() {
            return this.f800f;
        }

        public c f() {
            return this.a;
        }

        boolean g() {
            return this.p;
        }

        Rect h() {
            return this.q;
        }

        boolean i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.f807m;
            if (z) {
                return true;
            }
            c cVar = this.a;
            boolean zA = (cVar != null ? cVar.a(coordinatorLayout, view) : false) | z;
            this.f807m = zA;
            return zA;
        }

        boolean j(int i2) {
            if (i2 == 0) {
                return this.n;
            }
            if (i2 != 1) {
                return false;
            }
            return this.o;
        }

        void k() {
            this.p = false;
        }

        void l(int i2) {
            r(i2, false);
        }

        void m() {
            this.f807m = false;
        }

        public void o(c cVar) {
            c cVar2 = this.a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.j();
                }
                this.a = cVar;
                this.r = null;
                this.f796b = true;
                if (cVar != null) {
                    cVar.g(this);
                }
            }
        }

        void p(boolean z) {
            this.p = z;
        }

        void q(Rect rect) {
            this.q.set(rect);
        }

        void r(int i2, boolean z) {
            if (i2 == 0) {
                this.n = z;
            } else {
                if (i2 != 1) {
                    return;
                }
                this.o = z;
            }
        }

        f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f796b = false;
            this.f797c = 0;
            this.f798d = 0;
            this.f799e = -1;
            this.f800f = -1;
            this.f801g = 0;
            this.f802h = 0;
            this.q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.g.c.f2961e);
            this.f797c = typedArrayObtainStyledAttributes.getInteger(c.g.c.f2962f, 0);
            this.f800f = typedArrayObtainStyledAttributes.getResourceId(c.g.c.f2963g, -1);
            this.f798d = typedArrayObtainStyledAttributes.getInteger(c.g.c.f2964h, 0);
            this.f799e = typedArrayObtainStyledAttributes.getInteger(c.g.c.f2968l, -1);
            this.f801g = typedArrayObtainStyledAttributes.getInt(c.g.c.f2967k, 0);
            this.f802h = typedArrayObtainStyledAttributes.getInt(c.g.c.f2966j, 0);
            int i2 = c.g.c.f2965i;
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i2);
            this.f796b = zHasValue;
            if (zHasValue) {
                this.a = CoordinatorLayout.K(context, attributeSet, typedArrayObtainStyledAttributes.getString(i2));
            }
            typedArrayObtainStyledAttributes.recycle();
            c cVar = this.a;
            if (cVar != null) {
                cVar.g(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f796b = false;
            this.f797c = 0;
            this.f798d = 0;
            this.f799e = -1;
            this.f800f = -1;
            this.f801g = 0;
            this.f802h = 0;
            this.q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f796b = false;
            this.f797c = 0;
            this.f798d = 0;
            this.f799e = -1;
            this.f800f = -1;
            this.f801g = 0;
            this.f802h = 0;
            this.q = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f796b = false;
            this.f797c = 0;
            this.f798d = 0;
            this.f799e = -1;
            this.f800f = -1;
            this.f801g = 0;
            this.f802h = 0;
            this.q = new Rect();
        }
    }
}