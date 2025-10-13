package c.h.l;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import c.h.l.a;
import c.h.l.c0.c;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ViewCompat.java */
/* loaded from: classes.dex */
public class t {

    /* renamed from: b */
    private static Field f3155b;

    /* renamed from: c */
    private static boolean f3156c;

    /* renamed from: d */
    private static Field f3157d;

    /* renamed from: e */
    private static boolean f3158e;

    /* renamed from: f */
    private static WeakHashMap<View, String> f3159f;

    /* renamed from: h */
    private static Field f3161h;

    /* renamed from: j */
    private static ThreadLocal<Rect> f3163j;
    private static final AtomicInteger a = new AtomicInteger(1);

    /* renamed from: g */
    private static WeakHashMap<View, x> f3160g = null;

    /* renamed from: i */
    private static boolean f3162i = false;

    /* renamed from: k */
    private static final int[] f3164k = {c.h.b.f2970b, c.h.b.f2971c, c.h.b.n, c.h.b.y, c.h.b.B, c.h.b.C, c.h.b.D, c.h.b.E, c.h.b.F, c.h.b.G, c.h.b.f2972d, c.h.b.f2973e, c.h.b.f2974f, c.h.b.f2975g, c.h.b.f2976h, c.h.b.f2977i, c.h.b.f2978j, c.h.b.f2979k, c.h.b.f2980l, c.h.b.f2981m, c.h.b.o, c.h.b.p, c.h.b.q, c.h.b.r, c.h.b.s, c.h.b.t, c.h.b.u, c.h.b.v, c.h.b.w, c.h.b.x, c.h.b.z, c.h.b.A};

    /* renamed from: l */
    private static e f3165l = new e();

    /* compiled from: ViewCompat.java */
    class a implements View.OnApplyWindowInsetsListener {
        final /* synthetic */ p a;

        a(p pVar) {
            this.a = pVar;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            return this.a.a(view, b0.o(windowInsets)).n();
        }
    }

    /* compiled from: ViewCompat.java */
    class b extends f<Boolean> {
        b(int i2, Class cls, int i3) {
            super(i2, cls, i3);
        }

        @Override // c.h.l.t.f
        /* renamed from: i */
        public Boolean d(View view) {
            return Boolean.valueOf(view.isScreenReaderFocusable());
        }

        @Override // c.h.l.t.f
        /* renamed from: j */
        public void e(View view, Boolean bool) {
            view.setScreenReaderFocusable(bool.booleanValue());
        }

        @Override // c.h.l.t.f
        /* renamed from: k */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* compiled from: ViewCompat.java */
    class c extends f<CharSequence> {
        c(int i2, Class cls, int i3, int i4) {
            super(i2, cls, i3, i4);
        }

        @Override // c.h.l.t.f
        /* renamed from: i */
        public CharSequence d(View view) {
            return view.getAccessibilityPaneTitle();
        }

        @Override // c.h.l.t.f
        /* renamed from: j */
        public void e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        @Override // c.h.l.t.f
        /* renamed from: k */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* compiled from: ViewCompat.java */
    class d extends f<Boolean> {
        d(int i2, Class cls, int i3) {
            super(i2, cls, i3);
        }

        @Override // c.h.l.t.f
        /* renamed from: i */
        public Boolean d(View view) {
            return Boolean.valueOf(view.isAccessibilityHeading());
        }

        @Override // c.h.l.t.f
        /* renamed from: j */
        public void e(View view, Boolean bool) {
            view.setAccessibilityHeading(bool.booleanValue());
        }

        @Override // c.h.l.t.f
        /* renamed from: k */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* compiled from: ViewCompat.java */
    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: e */
        private WeakHashMap<View, Boolean> f3166e = new WeakHashMap<>();

        e() {
        }

        private void a(View view, boolean z) {
            boolean z2 = view.getVisibility() == 0;
            if (z != z2) {
                if (z2) {
                    t.U(view, 16);
                }
                this.f3166e.put(view, Boolean.valueOf(z2));
            }
        }

        private void b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            for (Map.Entry<View, Boolean> entry : this.f3166e.entrySet()) {
                a(entry.getKey(), entry.getValue().booleanValue());
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: ViewCompat.java */
    static abstract class f<T> {
        private final int a;

        /* renamed from: b */
        private final Class<T> f3167b;

        /* renamed from: c */
        private final int f3168c;

        f(int i2, Class<T> cls, int i3) {
            this(i2, cls, 0, i3);
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= 19;
        }

        private boolean c() {
            return Build.VERSION.SDK_INT >= this.f3168c;
        }

        boolean a(Boolean bool, Boolean bool2) {
            return (bool == null ? false : bool.booleanValue()) == (bool2 == null ? false : bool2.booleanValue());
        }

        abstract T d(View view);

        abstract void e(View view, T t);

        T f(View view) {
            if (c()) {
                return d(view);
            }
            if (!b()) {
                return null;
            }
            T t = (T) view.getTag(this.a);
            if (this.f3167b.isInstance(t)) {
                return t;
            }
            return null;
        }

        void g(View view, T t) {
            if (c()) {
                e(view, t);
            } else if (b() && h(f(view), t)) {
                t.E(view);
                view.setTag(this.a, t);
                t.U(view, 0);
            }
        }

        abstract boolean h(T t, T t2);

        f(int i2, Class<T> cls, int i3, int i4) {
            this.a = i2;
            this.f3167b = cls;
            this.f3168c = i4;
        }
    }

    /* compiled from: ViewCompat.java */
    private static class g {
        static b0 a(View view, b0 b0Var, Rect rect) {
            WindowInsets windowInsetsN = b0Var.n();
            if (windowInsetsN != null) {
                return b0.o(view.computeSystemWindowInsets(windowInsetsN, rect));
            }
            rect.setEmpty();
            return b0Var;
        }
    }

    /* compiled from: ViewCompat.java */
    private static class h {
        public static WindowInsets a(View view) {
            return view.getRootWindowInsets();
        }
    }

    /* compiled from: ViewCompat.java */
    private static class i {
        static void a(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    /* compiled from: ViewCompat.java */
    public interface j {
        boolean a(View view, KeyEvent keyEvent);
    }

    /* compiled from: ViewCompat.java */
    static class k {
        private static final ArrayList<WeakReference<View>> a = new ArrayList<>();

        /* renamed from: b */
        private WeakHashMap<View, Boolean> f3169b = null;

        /* renamed from: c */
        private SparseArray<WeakReference<View>> f3170c = null;

        /* renamed from: d */
        private WeakReference<KeyEvent> f3171d = null;

        k() {
        }

        static k a(View view) {
            int i2 = c.h.b.N;
            k kVar = (k) view.getTag(i2);
            if (kVar != null) {
                return kVar;
            }
            k kVar2 = new k();
            view.setTag(i2, kVar2);
            return kVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f3169b;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewC = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewC != null) {
                            return viewC;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.f3170c == null) {
                this.f3170c = new SparseArray<>();
            }
            return this.f3170c;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(c.h.b.O);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((j) arrayList.get(size)).a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f3169b;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = a;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f3169b == null) {
                    this.f3169b = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = a;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f3169b.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f3169b.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View viewC = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewC != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(viewC));
                }
            }
            return viewC != null;
        }

        boolean f(KeyEvent keyEvent) {
            int iIndexOfKey;
            WeakReference<KeyEvent> weakReference = this.f3171d;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f3171d = new WeakReference<>(keyEvent);
            WeakReference<View> weakReferenceValueAt = null;
            SparseArray<WeakReference<View>> sparseArrayD = d();
            if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArrayD.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReferenceValueAt = sparseArrayD.valueAt(iIndexOfKey);
                sparseArrayD.removeAt(iIndexOfKey);
            }
            if (weakReferenceValueAt == null) {
                weakReferenceValueAt = sparseArrayD.get(keyEvent.getKeyCode());
            }
            if (weakReferenceValueAt == null) {
                return false;
            }
            View view = weakReferenceValueAt.get();
            if (view != null && t.P(view)) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    @SuppressLint({"InlinedApi"})
    public static int A(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    public static void A0(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f3159f == null) {
            f3159f = new WeakHashMap<>();
        }
        f3159f.put(view, str);
    }

    public static int B(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void B0(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof c.h.l.j) {
            ((c.h.l.j) view).stopNestedScroll();
        }
    }

    public static int C(View view) throws NoSuchFieldException {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f3158e) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f3157d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3158e = true;
        }
        Field field = f3157d;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    private static void C0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static int D(View view) throws NoSuchFieldException {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f3156c) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                f3155b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3156c = true;
        }
        Field field = f3155b;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    static c.h.l.a E(View view) {
        c.h.l.a aVarL = l(view);
        if (aVarL == null) {
            aVarL = new c.h.l.a();
        }
        k0(view, aVarL);
        return aVarL;
    }

    public static int F(View view) {
        return Build.VERSION.SDK_INT >= 17 ? view.getPaddingEnd() : view.getPaddingRight();
    }

    public static int G(View view) {
        return Build.VERSION.SDK_INT >= 17 ? view.getPaddingStart() : view.getPaddingLeft();
    }

    public static b0 H(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return b0.o(h.a(view));
        }
        return null;
    }

    public static String I(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f3159f;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    public static int J(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    public static float K(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    public static boolean L(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    public static boolean M(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    public static boolean N(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    public static boolean O(View view) {
        Boolean boolF = a().f(view);
        if (boolF == null) {
            return false;
        }
        return boolF.booleanValue();
    }

    public static boolean P(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isAttachedToWindow() : view.getWindowToken() != null;
    }

    public static boolean Q(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isLaidOut() : view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean R(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof c.h.l.j) {
            return ((c.h.l.j) view).isNestedScrollingEnabled();
        }
        return false;
    }

    public static boolean S(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    public static boolean T(View view) {
        Boolean boolF = j0().f(view);
        if (boolF == null) {
            return false;
        }
        return boolF.booleanValue();
    }

    static void U(View view, int i2) {
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            boolean z = p(view) != null;
            if (o(view) != 0 || (z && view.getVisibility() == 0)) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i2);
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
                }
            }
        }
    }

    public static void V(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            view.offsetLeftAndRight(i2);
            return;
        }
        if (i3 < 21) {
            e(view, i2);
            return;
        }
        Rect rectX = x();
        boolean z = false;
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectX.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !rectX.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        e(view, i2);
        if (z && rectX.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectX);
        }
    }

    public static void W(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            view.offsetTopAndBottom(i2);
            return;
        }
        if (i3 < 21) {
            f(view, i2);
            return;
        }
        Rect rectX = x();
        boolean z = false;
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectX.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !rectX.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        f(view, i2);
        if (z && rectX.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectX);
        }
    }

    public static b0 X(View view, b0 b0Var) {
        WindowInsets windowInsetsN;
        if (Build.VERSION.SDK_INT >= 21 && (windowInsetsN = b0Var.n()) != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsN);
            if (!windowInsetsOnApplyWindowInsets.equals(windowInsetsN)) {
                return b0.o(windowInsetsOnApplyWindowInsets);
            }
        }
        return b0Var;
    }

    public static void Y(View view, c.h.l.c0.c cVar) {
        view.onInitializeAccessibilityNodeInfo(cVar.x0());
    }

    private static f<CharSequence> Z() {
        return new c(c.h.b.K, CharSequence.class, 8, 28);
    }

    private static f<Boolean> a() {
        return new d(c.h.b.J, Boolean.class, 28);
    }

    public static boolean a0(View view, int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(i2, bundle);
        }
        return false;
    }

    public static int b(View view, CharSequence charSequence, c.h.l.c0.f fVar) {
        int iR = r(view);
        if (iR != -1) {
            c(view, new c.a(iR, charSequence, fVar));
        }
        return iR;
    }

    public static void b0(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    private static void c(View view, c.a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            E(view);
            f0(aVar.b(), view);
            q(view).add(aVar);
            U(view, 0);
        }
    }

    public static void c0(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    public static x d(View view) {
        if (f3160g == null) {
            f3160g = new WeakHashMap<>();
        }
        x xVar = f3160g.get(view);
        if (xVar != null) {
            return xVar;
        }
        x xVar2 = new x(view);
        f3160g.put(view, xVar2);
        return xVar2;
    }

    public static void d0(View view, Runnable runnable, long j2) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j2);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j2);
        }
    }

    private static void e(View view, int i2) {
        view.offsetLeftAndRight(i2);
        if (view.getVisibility() == 0) {
            C0(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                C0((View) parent);
            }
        }
    }

    public static void e0(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            f0(i2, view);
            U(view, 0);
        }
    }

    private static void f(View view, int i2) {
        view.offsetTopAndBottom(i2);
        if (view.getVisibility() == 0) {
            C0(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                C0((View) parent);
            }
        }
    }

    private static void f0(int i2, View view) {
        List<c.a> listQ = q(view);
        for (int i3 = 0; i3 < listQ.size(); i3++) {
            if (listQ.get(i3).b() == i2) {
                listQ.remove(i3);
                return;
            }
        }
    }

    public static b0 g(View view, b0 b0Var, Rect rect) {
        return Build.VERSION.SDK_INT >= 21 ? g.a(view, b0Var, rect) : b0Var;
    }

    public static void g0(View view, c.a aVar, CharSequence charSequence, c.h.l.c0.f fVar) {
        if (fVar == null && charSequence == null) {
            e0(view, aVar.b());
        } else {
            c(view, aVar.a(charSequence, fVar));
        }
    }

    public static b0 h(View view, b0 b0Var) {
        WindowInsets windowInsetsN;
        return (Build.VERSION.SDK_INT < 21 || (windowInsetsN = b0Var.n()) == null || view.dispatchApplyWindowInsets(windowInsetsN).equals(windowInsetsN)) ? b0Var : b0.o(windowInsetsN);
    }

    public static void h0(View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 20) {
            view.requestApplyInsets();
        } else if (i2 >= 16) {
            view.requestFitSystemWindows();
        }
    }

    static boolean i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return k.a(view).b(view, keyEvent);
    }

    public static void i0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            i.a(view, context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    static boolean j(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return k.a(view).f(keyEvent);
    }

    private static f<Boolean> j0() {
        return new b(c.h.b.L, Boolean.class, 28);
    }

    public static int k() {
        AtomicInteger atomicInteger;
        int i2;
        int i3;
        if (Build.VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        do {
            atomicInteger = a;
            i2 = atomicInteger.get();
            i3 = i2 + 1;
            if (i3 > 16777215) {
                i3 = 1;
            }
        } while (!atomicInteger.compareAndSet(i2, i3));
        return i2;
    }

    public static void k0(View view, c.h.l.a aVar) {
        if (aVar == null && (m(view) instanceof a.C0056a)) {
            aVar = new c.h.l.a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.d());
    }

    public static c.h.l.a l(View view) {
        View.AccessibilityDelegate accessibilityDelegateM = m(view);
        if (accessibilityDelegateM == null) {
            return null;
        }
        return accessibilityDelegateM instanceof a.C0056a ? ((a.C0056a) accessibilityDelegateM).a : new c.h.l.a(accessibilityDelegateM);
    }

    public static void l0(View view, boolean z) {
        a().g(view, Boolean.valueOf(z));
    }

    private static View.AccessibilityDelegate m(View view) {
        return Build.VERSION.SDK_INT >= 29 ? view.getAccessibilityDelegate() : n(view);
    }

    public static void m0(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i2);
        }
    }

    private static View.AccessibilityDelegate n(View view) {
        if (f3162i) {
            return null;
        }
        if (f3161h == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f3161h = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f3162i = true;
                return null;
            }
        }
        try {
            Object obj = f3161h.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f3162i = true;
            return null;
        }
    }

    public static void n0(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    public static int o(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void o0(View view, ColorStateList colorStateList) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 21) {
            if (view instanceof s) {
                ((s) view).setSupportBackgroundTintList(colorStateList);
                return;
            }
            return;
        }
        view.setBackgroundTintList(colorStateList);
        if (i2 == 21) {
            Drawable background = view.getBackground();
            boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    public static CharSequence p(View view) {
        return Z().f(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void p0(View view, PorterDuff.Mode mode) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 21) {
            if (view instanceof s) {
                ((s) view).setSupportBackgroundTintMode(mode);
                return;
            }
            return;
        }
        view.setBackgroundTintMode(mode);
        if (i2 == 21) {
            Drawable background = view.getBackground();
            boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    private static List<c.a> q(View view) {
        int i2 = c.h.b.H;
        ArrayList arrayList = (ArrayList) view.getTag(i2);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i2, arrayList2);
        return arrayList2;
    }

    public static void q0(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    private static int r(View view) {
        List<c.a> listQ = q(view);
        int i2 = 0;
        int i3 = -1;
        while (true) {
            int[] iArr = f3164k;
            if (i2 >= iArr.length || i3 != -1) {
                break;
            }
            int i4 = iArr[i2];
            boolean z = true;
            for (int i5 = 0; i5 < listQ.size(); i5++) {
                z &= listQ.get(i5).b() != i4;
            }
            if (z) {
                i3 = i4;
            }
            i2++;
        }
        return i3;
    }

    public static void r0(View view, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ColorStateList s(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof s) {
            return ((s) view).getSupportBackgroundTintList();
        }
        return null;
    }

    @Deprecated
    public static void s0(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static PorterDuff.Mode t(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof s) {
            return ((s) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    public static void t0(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    public static Rect u(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    public static void u0(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 19) {
            view.setImportantForAccessibility(i2);
        } else if (i3 >= 16) {
            if (i2 == 4) {
                i2 = 2;
            }
            view.setImportantForAccessibility(i2);
        }
    }

    public static Display v(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (P(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    public static void v0(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i2);
        }
    }

    public static float w(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    public static void w0(View view, p pVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            if (pVar == null) {
                view.setOnApplyWindowInsetsListener(null);
            } else {
                view.setOnApplyWindowInsetsListener(new a(pVar));
            }
        }
    }

    private static Rect x() {
        if (f3163j == null) {
            f3163j = new ThreadLocal<>();
        }
        Rect rect = f3163j.get();
        if (rect == null) {
            rect = new Rect();
            f3163j.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static void x0(View view, int i2, int i3, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i2, i3, i4, i5);
        } else {
            view.setPadding(i2, i3, i4, i5);
        }
    }

    public static boolean y(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    public static void y0(View view, r rVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (rVar != null ? rVar.a() : null));
        }
    }

    public static int z(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    public static void z0(View view, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i2, i3);
        }
    }
}