package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.h.l.c0.c;
import c.h.l.c0.f;
import c.h.l.t;
import c.j.b.c;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {
    c.j.b.c a;

    /* renamed from: b, reason: collision with root package name */
    c f11438b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f11439c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f11441e;

    /* renamed from: d, reason: collision with root package name */
    private float f11440d = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    int f11442f = 2;

    /* renamed from: g, reason: collision with root package name */
    float f11443g = 0.5f;

    /* renamed from: h, reason: collision with root package name */
    float f11444h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    float f11445i = 0.5f;

    /* renamed from: j, reason: collision with root package name */
    private final c.AbstractC0064c f11446j = new a();

    class a extends c.AbstractC0064c {
        private int a;

        /* renamed from: b, reason: collision with root package name */
        private int f11447b = -1;

        a() {
        }

        private boolean n(View view, float f2) {
            if (f2 == 0.0f) {
                return Math.abs(view.getLeft() - this.a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f11443g);
            }
            boolean z = t.B(view) == 1;
            int i2 = SwipeDismissBehavior.this.f11442f;
            if (i2 == 2) {
                return true;
            }
            if (i2 == 0) {
                if (z) {
                    if (f2 >= 0.0f) {
                        return false;
                    }
                } else if (f2 <= 0.0f) {
                    return false;
                }
                return true;
            }
            if (i2 != 1) {
                return false;
            }
            if (z) {
                if (f2 <= 0.0f) {
                    return false;
                }
            } else if (f2 >= 0.0f) {
                return false;
            }
            return true;
        }

        @Override // c.j.b.c.AbstractC0064c
        public int a(View view, int i2, int i3) {
            int width;
            int width2;
            int width3;
            boolean z = t.B(view) == 1;
            int i4 = SwipeDismissBehavior.this.f11442f;
            if (i4 == 0) {
                if (z) {
                    width = this.a - view.getWidth();
                    width2 = this.a;
                } else {
                    width = this.a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i4 != 1) {
                width = this.a - view.getWidth();
                width2 = view.getWidth() + this.a;
            } else if (z) {
                width = this.a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.a - view.getWidth();
                width2 = this.a;
            }
            return SwipeDismissBehavior.G(width, i2, width2);
        }

        @Override // c.j.b.c.AbstractC0064c
        public int b(View view, int i2, int i3) {
            return view.getTop();
        }

        @Override // c.j.b.c.AbstractC0064c
        public int d(View view) {
            return view.getWidth();
        }

        @Override // c.j.b.c.AbstractC0064c
        public void i(View view, int i2) {
            this.f11447b = i2;
            this.a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // c.j.b.c.AbstractC0064c
        public void j(int i2) {
            c cVar = SwipeDismissBehavior.this.f11438b;
            if (cVar != null) {
                cVar.b(i2);
            }
        }

        @Override // c.j.b.c.AbstractC0064c
        public void k(View view, int i2, int i3, int i4, int i5) {
            float width = this.a + (view.getWidth() * SwipeDismissBehavior.this.f11444h);
            float width2 = this.a + (view.getWidth() * SwipeDismissBehavior.this.f11445i);
            float f2 = i2;
            if (f2 <= width) {
                view.setAlpha(1.0f);
            } else if (f2 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.F(0.0f, 1.0f - SwipeDismissBehavior.I(width, width2, f2), 1.0f));
            }
        }

        @Override // c.j.b.c.AbstractC0064c
        public void l(View view, float f2, float f3) {
            int i2;
            boolean z;
            c cVar;
            this.f11447b = -1;
            int width = view.getWidth();
            if (n(view, f2)) {
                int left = view.getLeft();
                int i3 = this.a;
                i2 = left < i3 ? i3 - width : i3 + width;
                z = true;
            } else {
                i2 = this.a;
                z = false;
            }
            if (SwipeDismissBehavior.this.a.F(i2, view.getTop())) {
                t.c0(view, new d(view, z));
            } else {
                if (!z || (cVar = SwipeDismissBehavior.this.f11438b) == null) {
                    return;
                }
                cVar.a(view);
            }
        }

        @Override // c.j.b.c.AbstractC0064c
        public boolean m(View view, int i2) {
            int i3 = this.f11447b;
            return (i3 == -1 || i3 == i2) && SwipeDismissBehavior.this.E(view);
        }
    }

    class b implements f {
        b() {
        }

        @Override // c.h.l.c0.f
        public boolean a(View view, f.a aVar) {
            boolean z = false;
            if (!SwipeDismissBehavior.this.E(view)) {
                return false;
            }
            boolean z2 = t.B(view) == 1;
            int i2 = SwipeDismissBehavior.this.f11442f;
            if ((i2 == 0 && z2) || (i2 == 1 && !z2)) {
                z = true;
            }
            int width = view.getWidth();
            if (z) {
                width = -width;
            }
            t.V(view, width);
            view.setAlpha(0.0f);
            c cVar = SwipeDismissBehavior.this.f11438b;
            if (cVar != null) {
                cVar.a(view);
            }
            return true;
        }
    }

    public interface c {
        void a(View view);

        void b(int i2);
    }

    private class d implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        private final View f11449e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f11450f;

        d(View view, boolean z) {
            this.f11449e = view;
            this.f11450f = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            c.j.b.c cVar2 = SwipeDismissBehavior.this.a;
            if (cVar2 != null && cVar2.k(true)) {
                t.c0(this.f11449e, this);
            } else {
                if (!this.f11450f || (cVar = SwipeDismissBehavior.this.f11438b) == null) {
                    return;
                }
                cVar.a(this.f11449e);
            }
        }
    }

    static float F(float f2, float f3, float f4) {
        return Math.min(Math.max(f2, f3), f4);
    }

    static int G(int i2, int i3, int i4) {
        return Math.min(Math.max(i2, i3), i4);
    }

    private void H(ViewGroup viewGroup) {
        if (this.a == null) {
            this.a = this.f11441e ? c.j.b.c.l(viewGroup, this.f11440d, this.f11446j) : c.j.b.c.m(viewGroup, this.f11446j);
        }
    }

    static float I(float f2, float f3, float f4) {
        return (f4 - f2) / (f3 - f2);
    }

    private void N(View view) {
        t.e0(view, 1048576);
        if (E(view)) {
            t.g0(view, c.a.u, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        c.j.b.c cVar = this.a;
        if (cVar == null) {
            return false;
        }
        cVar.z(motionEvent);
        return true;
    }

    public boolean E(View view) {
        return true;
    }

    public void J(float f2) {
        this.f11445i = F(0.0f, f2, 1.0f);
    }

    public void K(c cVar) {
        this.f11438b = cVar;
    }

    public void L(float f2) {
        this.f11444h = F(0.0f, f2, 1.0f);
    }

    public void M(int i2) {
        this.f11442f = i2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean zB = this.f11439c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zB = coordinatorLayout.B(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f11439c = zB;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f11439c = false;
        }
        if (!zB) {
            return false;
        }
        H(coordinatorLayout);
        return this.a.G(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i2) {
        boolean zL = super.l(coordinatorLayout, v, i2);
        if (t.z(v) == 0) {
            t.u0(v, 1);
            N(v);
        }
        return zL;
    }
}