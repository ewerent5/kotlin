package androidx.appcompat.widget;

import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* compiled from: TooltipCompatHandler.java */
/* loaded from: classes.dex */
class z0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: e, reason: collision with root package name */
    private static z0 f650e;

    /* renamed from: f, reason: collision with root package name */
    private static z0 f651f;

    /* renamed from: g, reason: collision with root package name */
    private final View f652g;

    /* renamed from: h, reason: collision with root package name */
    private final CharSequence f653h;

    /* renamed from: i, reason: collision with root package name */
    private final int f654i;

    /* renamed from: j, reason: collision with root package name */
    private final Runnable f655j = new a();

    /* renamed from: k, reason: collision with root package name */
    private final Runnable f656k = new b();

    /* renamed from: l, reason: collision with root package name */
    private int f657l;

    /* renamed from: m, reason: collision with root package name */
    private int f658m;
    private a1 n;
    private boolean o;

    /* compiled from: TooltipCompatHandler.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() throws Resources.NotFoundException {
            z0.this.g(false);
        }
    }

    /* compiled from: TooltipCompatHandler.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z0.this.c();
        }
    }

    private z0(View view, CharSequence charSequence) {
        this.f652g = view;
        this.f653h = charSequence;
        this.f654i = c.h.l.u.c(ViewConfiguration.get(view.getContext()));
        b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void a() {
        this.f652g.removeCallbacks(this.f655j);
    }

    private void b() {
        this.f657l = Integer.MAX_VALUE;
        this.f658m = Integer.MAX_VALUE;
    }

    private void d() {
        this.f652g.postDelayed(this.f655j, ViewConfiguration.getLongPressTimeout());
    }

    private static void e(z0 z0Var) {
        z0 z0Var2 = f650e;
        if (z0Var2 != null) {
            z0Var2.a();
        }
        f650e = z0Var;
        if (z0Var != null) {
            z0Var.d();
        }
    }

    public static void f(View view, CharSequence charSequence) {
        z0 z0Var = f650e;
        if (z0Var != null && z0Var.f652g == view) {
            e(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new z0(view, charSequence);
            return;
        }
        z0 z0Var2 = f651f;
        if (z0Var2 != null && z0Var2.f652g == view) {
            z0Var2.c();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean h(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f657l) <= this.f654i && Math.abs(y - this.f658m) <= this.f654i) {
            return false;
        }
        this.f657l = x;
        this.f658m = y;
        return true;
    }

    void c() {
        if (f651f == this) {
            f651f = null;
            a1 a1Var = this.n;
            if (a1Var != null) {
                a1Var.c();
                this.n = null;
                b();
                this.f652g.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f650e == this) {
            e(null);
        }
        this.f652g.removeCallbacks(this.f656k);
    }

    void g(boolean z) throws Resources.NotFoundException {
        long j2;
        int longPressTimeout;
        long j3;
        if (c.h.l.t.P(this.f652g)) {
            e(null);
            z0 z0Var = f651f;
            if (z0Var != null) {
                z0Var.c();
            }
            f651f = this;
            this.o = z;
            a1 a1Var = new a1(this.f652g.getContext());
            this.n = a1Var;
            a1Var.e(this.f652g, this.f657l, this.f658m, this.o, this.f653h);
            this.f652g.addOnAttachStateChangeListener(this);
            if (this.o) {
                j3 = 2500;
            } else {
                if ((c.h.l.t.J(this.f652g) & 1) == 1) {
                    j2 = 3000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                } else {
                    j2 = 15000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                }
                j3 = j2 - longPressTimeout;
            }
            this.f652g.removeCallbacks(this.f656k);
            this.f652g.postDelayed(this.f656k, j3);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.n != null && this.o) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f652g.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                b();
                c();
            }
        } else if (this.f652g.isEnabled() && this.n == null && h(motionEvent)) {
            e(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) throws Resources.NotFoundException {
        this.f657l = view.getWidth() / 2;
        this.f658m = view.getHeight() / 2;
        g(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        c();
    }
}