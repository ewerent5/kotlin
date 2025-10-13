package c.j.b;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import c.e.h;
import c.h.l.c0.d;
import c.h.l.c0.e;
import c.h.l.t;
import c.j.b.b;
import ch.qos.logback.classic.Level;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ExploreByTouchHelper.java */
/* loaded from: classes.dex */
public abstract class a extends c.h.l.a {

    /* renamed from: d, reason: collision with root package name */
    private static final Rect f3191d = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Level.ALL_INT, Level.ALL_INT);

    /* renamed from: e, reason: collision with root package name */
    private static final b.a<c.h.l.c0.c> f3192e = new C0062a();

    /* renamed from: f, reason: collision with root package name */
    private static final b.InterfaceC0063b<h<c.h.l.c0.c>, c.h.l.c0.c> f3193f = new b();

    /* renamed from: k, reason: collision with root package name */
    private final AccessibilityManager f3198k;

    /* renamed from: l, reason: collision with root package name */
    private final View f3199l;

    /* renamed from: m, reason: collision with root package name */
    private c f3200m;

    /* renamed from: g, reason: collision with root package name */
    private final Rect f3194g = new Rect();

    /* renamed from: h, reason: collision with root package name */
    private final Rect f3195h = new Rect();

    /* renamed from: i, reason: collision with root package name */
    private final Rect f3196i = new Rect();

    /* renamed from: j, reason: collision with root package name */
    private final int[] f3197j = new int[2];
    int n = Level.ALL_INT;
    int o = Level.ALL_INT;
    private int p = Level.ALL_INT;

    /* compiled from: ExploreByTouchHelper.java */
    /* renamed from: c.j.b.a$a, reason: collision with other inner class name */
    class C0062a implements b.a<c.h.l.c0.c> {
        C0062a() {
        }

        @Override // c.j.b.b.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(c.h.l.c0.c cVar, Rect rect) {
            cVar.l(rect);
        }
    }

    /* compiled from: ExploreByTouchHelper.java */
    class b implements b.InterfaceC0063b<h<c.h.l.c0.c>, c.h.l.c0.c> {
        b() {
        }

        @Override // c.j.b.b.InterfaceC0063b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public c.h.l.c0.c a(h<c.h.l.c0.c> hVar, int i2) {
            return hVar.o(i2);
        }

        @Override // c.j.b.b.InterfaceC0063b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int b(h<c.h.l.c0.c> hVar) {
            return hVar.n();
        }
    }

    /* compiled from: ExploreByTouchHelper.java */
    private class c extends d {
        c() {
        }

        @Override // c.h.l.c0.d
        public c.h.l.c0.c a(int i2) {
            return c.h.l.c0.c.N(a.this.H(i2));
        }

        @Override // c.h.l.c0.d
        public c.h.l.c0.c c(int i2) {
            int i3 = i2 == 2 ? a.this.n : a.this.o;
            if (i3 == Integer.MIN_VALUE) {
                return null;
            }
            return a(i3);
        }

        @Override // c.h.l.c0.d
        public boolean e(int i2, int i3, Bundle bundle) {
            return a.this.P(i2, i3, bundle);
        }
    }

    public a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f3199l = view;
        this.f3198k = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (t.z(view) == 0) {
            t.u0(view, 1);
        }
    }

    private static Rect D(View view, int i2, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i2 == 17) {
            rect.set(width, 0, width, height);
        } else if (i2 == 33) {
            rect.set(0, height, width, height);
        } else if (i2 == 66) {
            rect.set(-1, 0, -1, height);
        } else {
            if (i2 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    private boolean E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f3199l.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.f3199l.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private static int F(int i2) {
        if (i2 == 19) {
            return 33;
        }
        if (i2 != 21) {
            return i2 != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean G(int i2, Rect rect) {
        c.h.l.c0.c cVar;
        h<c.h.l.c0.c> hVarY = y();
        int i3 = this.o;
        int iJ = Level.ALL_INT;
        c.h.l.c0.c cVarF = i3 == Integer.MIN_VALUE ? null : hVarY.f(i3);
        if (i2 == 1 || i2 == 2) {
            cVar = (c.h.l.c0.c) c.j.b.b.d(hVarY, f3193f, f3192e, cVarF, i2, t.B(this.f3199l) == 1, false);
        } else {
            if (i2 != 17 && i2 != 33 && i2 != 66 && i2 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i4 = this.o;
            if (i4 != Integer.MIN_VALUE) {
                z(i4, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.f3199l, i2, rect2);
            }
            cVar = (c.h.l.c0.c) c.j.b.b.c(hVarY, f3193f, f3192e, cVarF, rect2, i2);
        }
        if (cVar != null) {
            iJ = hVarY.j(hVarY.i(cVar));
        }
        return T(iJ);
    }

    private boolean Q(int i2, int i3, Bundle bundle) {
        return i3 != 1 ? i3 != 2 ? i3 != 64 ? i3 != 128 ? J(i2, i3, bundle) : n(i2) : S(i2) : o(i2) : T(i2);
    }

    private boolean R(int i2, Bundle bundle) {
        return t.a0(this.f3199l, i2, bundle);
    }

    private boolean S(int i2) {
        int i3;
        if (!this.f3198k.isEnabled() || !this.f3198k.isTouchExplorationEnabled() || (i3 = this.n) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            n(i3);
        }
        this.n = i2;
        this.f3199l.invalidate();
        U(i2, 32768);
        return true;
    }

    private void V(int i2) {
        int i3 = this.p;
        if (i3 == i2) {
            return;
        }
        this.p = i2;
        U(i2, 128);
        U(i3, 256);
    }

    private boolean n(int i2) {
        if (this.n != i2) {
            return false;
        }
        this.n = Level.ALL_INT;
        this.f3199l.invalidate();
        U(i2, 65536);
        return true;
    }

    private boolean p() {
        int i2 = this.o;
        return i2 != Integer.MIN_VALUE && J(i2, 16, null);
    }

    private AccessibilityEvent q(int i2, int i3) {
        return i2 != -1 ? r(i2, i3) : s(i3);
    }

    private AccessibilityEvent r(int i2, int i3) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i3);
        c.h.l.c0.c cVarH = H(i2);
        accessibilityEventObtain.getText().add(cVarH.w());
        accessibilityEventObtain.setContentDescription(cVarH.r());
        accessibilityEventObtain.setScrollable(cVarH.I());
        accessibilityEventObtain.setPassword(cVarH.H());
        accessibilityEventObtain.setEnabled(cVarH.D());
        accessibilityEventObtain.setChecked(cVarH.B());
        L(i2, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(cVarH.o());
        e.c(accessibilityEventObtain, this.f3199l, i2);
        accessibilityEventObtain.setPackageName(this.f3199l.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    private AccessibilityEvent s(int i2) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        this.f3199l.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    private c.h.l.c0.c t(int i2) {
        c.h.l.c0.c cVarL = c.h.l.c0.c.L();
        cVarL.e0(true);
        cVarL.g0(true);
        cVarL.Y("android.view.View");
        Rect rect = f3191d;
        cVarL.U(rect);
        cVarL.V(rect);
        cVarL.n0(this.f3199l);
        N(i2, cVarL);
        if (cVarL.w() == null && cVarL.r() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        cVarL.l(this.f3195h);
        if (this.f3195h.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int iJ = cVarL.j();
        if ((iJ & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((iJ & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        cVarL.l0(this.f3199l.getContext().getPackageName());
        cVarL.t0(this.f3199l, i2);
        if (this.n == i2) {
            cVarL.S(true);
            cVarL.a(128);
        } else {
            cVarL.S(false);
            cVarL.a(64);
        }
        boolean z = this.o == i2;
        if (z) {
            cVarL.a(2);
        } else if (cVarL.E()) {
            cVarL.a(1);
        }
        cVarL.h0(z);
        this.f3199l.getLocationOnScreen(this.f3197j);
        cVarL.m(this.f3194g);
        if (this.f3194g.equals(rect)) {
            cVarL.l(this.f3194g);
            if (cVarL.f3129c != -1) {
                c.h.l.c0.c cVarL2 = c.h.l.c0.c.L();
                for (int i3 = cVarL.f3129c; i3 != -1; i3 = cVarL2.f3129c) {
                    cVarL2.o0(this.f3199l, -1);
                    cVarL2.U(f3191d);
                    N(i3, cVarL2);
                    cVarL2.l(this.f3195h);
                    Rect rect2 = this.f3194g;
                    Rect rect3 = this.f3195h;
                    rect2.offset(rect3.left, rect3.top);
                }
                cVarL2.P();
            }
            this.f3194g.offset(this.f3197j[0] - this.f3199l.getScrollX(), this.f3197j[1] - this.f3199l.getScrollY());
        }
        if (this.f3199l.getLocalVisibleRect(this.f3196i)) {
            this.f3196i.offset(this.f3197j[0] - this.f3199l.getScrollX(), this.f3197j[1] - this.f3199l.getScrollY());
            if (this.f3194g.intersect(this.f3196i)) {
                cVarL.V(this.f3194g);
                if (E(this.f3194g)) {
                    cVarL.w0(true);
                }
            }
        }
        return cVarL;
    }

    private c.h.l.c0.c u() {
        c.h.l.c0.c cVarM = c.h.l.c0.c.M(this.f3199l);
        t.Y(this.f3199l, cVarM);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (cVarM.n() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            cVarM.c(this.f3199l, ((Integer) arrayList.get(i2)).intValue());
        }
        return cVarM;
    }

    private h<c.h.l.c0.c> y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        h<c.h.l.c0.c> hVar = new h<>();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            hVar.k(arrayList.get(i2).intValue(), t(arrayList.get(i2).intValue()));
        }
        return hVar;
    }

    private void z(int i2, Rect rect) {
        H(i2).l(rect);
    }

    public final int A() {
        return this.o;
    }

    protected abstract int B(float f2, float f3);

    protected abstract void C(List<Integer> list);

    c.h.l.c0.c H(int i2) {
        return i2 == -1 ? u() : t(i2);
    }

    public final void I(boolean z, int i2, Rect rect) {
        int i3 = this.o;
        if (i3 != Integer.MIN_VALUE) {
            o(i3);
        }
        if (z) {
            G(i2, rect);
        }
    }

    protected abstract boolean J(int i2, int i3, Bundle bundle);

    protected void K(AccessibilityEvent accessibilityEvent) {
    }

    protected void L(int i2, AccessibilityEvent accessibilityEvent) {
    }

    protected void M(c.h.l.c0.c cVar) {
    }

    protected abstract void N(int i2, c.h.l.c0.c cVar);

    protected void O(int i2, boolean z) {
    }

    boolean P(int i2, int i3, Bundle bundle) {
        return i2 != -1 ? Q(i2, i3, bundle) : R(i3, bundle);
    }

    public final boolean T(int i2) {
        int i3;
        if ((!this.f3199l.isFocused() && !this.f3199l.requestFocus()) || (i3 = this.o) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            o(i3);
        }
        if (i2 == Integer.MIN_VALUE) {
            return false;
        }
        this.o = i2;
        O(i2, true);
        U(i2, 8);
        return true;
    }

    public final boolean U(int i2, int i3) {
        ViewParent parent;
        if (i2 == Integer.MIN_VALUE || !this.f3198k.isEnabled() || (parent = this.f3199l.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f3199l, q(i2, i3));
    }

    @Override // c.h.l.a
    public d b(View view) {
        if (this.f3200m == null) {
            this.f3200m = new c();
        }
        return this.f3200m;
    }

    @Override // c.h.l.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    @Override // c.h.l.a
    public void g(View view, c.h.l.c0.c cVar) {
        super.g(view, cVar);
        M(cVar);
    }

    public final boolean o(int i2) {
        if (this.o != i2) {
            return false;
        }
        this.o = Level.ALL_INT;
        O(i2, false);
        U(i2, 8);
        return true;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (!this.f3198k.isEnabled() || !this.f3198k.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iB = B(motionEvent.getX(), motionEvent.getY());
            V(iB);
            return iB != Integer.MIN_VALUE;
        }
        if (action != 10 || this.p == Integer.MIN_VALUE) {
            return false;
        }
        V(Level.ALL_INT);
        return true;
    }

    public final boolean w(KeyEvent keyEvent) {
        int i2 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 61) {
            if (keyEvent.hasNoModifiers()) {
                return G(2, null);
            }
            if (keyEvent.hasModifiers(1)) {
                return G(1, null);
            }
            return false;
        }
        if (keyCode != 66) {
            switch (keyCode) {
                case 19:
                case 20:
                case 21:
                case 22:
                    if (!keyEvent.hasNoModifiers()) {
                        return false;
                    }
                    int iF = F(keyCode);
                    int repeatCount = keyEvent.getRepeatCount() + 1;
                    boolean z = false;
                    while (i2 < repeatCount && G(iF, null)) {
                        i2++;
                        z = true;
                    }
                    return z;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        p();
        return true;
    }

    public final int x() {
        return this.n;
    }
}