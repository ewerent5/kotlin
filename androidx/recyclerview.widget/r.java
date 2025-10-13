package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: RecyclerViewAccessibilityDelegate.java */
/* loaded from: classes.dex */
public class r extends c.h.l.a {

    /* renamed from: d, reason: collision with root package name */
    final RecyclerView f1770d;

    /* renamed from: e, reason: collision with root package name */
    private final a f1771e;

    /* compiled from: RecyclerViewAccessibilityDelegate.java */
    public static class a extends c.h.l.a {

        /* renamed from: d, reason: collision with root package name */
        final r f1772d;

        /* renamed from: e, reason: collision with root package name */
        private Map<View, c.h.l.a> f1773e = new WeakHashMap();

        public a(r rVar) {
            this.f1772d = rVar;
        }

        @Override // c.h.l.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            c.h.l.a aVar = this.f1773e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // c.h.l.a
        public c.h.l.c0.d b(View view) {
            c.h.l.a aVar = this.f1773e.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        @Override // c.h.l.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            c.h.l.a aVar = this.f1773e.get(view);
            if (aVar != null) {
                aVar.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // c.h.l.a
        public void g(View view, c.h.l.c0.c cVar) {
            if (this.f1772d.o() || this.f1772d.f1770d.getLayoutManager() == null) {
                super.g(view, cVar);
                return;
            }
            this.f1772d.f1770d.getLayoutManager().V0(view, cVar);
            c.h.l.a aVar = this.f1773e.get(view);
            if (aVar != null) {
                aVar.g(view, cVar);
            } else {
                super.g(view, cVar);
            }
        }

        @Override // c.h.l.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            c.h.l.a aVar = this.f1773e.get(view);
            if (aVar != null) {
                aVar.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // c.h.l.a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            c.h.l.a aVar = this.f1773e.get(viewGroup);
            return aVar != null ? aVar.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // c.h.l.a
        public boolean j(View view, int i2, Bundle bundle) {
            if (this.f1772d.o() || this.f1772d.f1770d.getLayoutManager() == null) {
                return super.j(view, i2, bundle);
            }
            c.h.l.a aVar = this.f1773e.get(view);
            if (aVar != null) {
                if (aVar.j(view, i2, bundle)) {
                    return true;
                }
            } else if (super.j(view, i2, bundle)) {
                return true;
            }
            return this.f1772d.f1770d.getLayoutManager().p1(view, i2, bundle);
        }

        @Override // c.h.l.a
        public void l(View view, int i2) {
            c.h.l.a aVar = this.f1773e.get(view);
            if (aVar != null) {
                aVar.l(view, i2);
            } else {
                super.l(view, i2);
            }
        }

        @Override // c.h.l.a
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            c.h.l.a aVar = this.f1773e.get(view);
            if (aVar != null) {
                aVar.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        c.h.l.a n(View view) {
            return this.f1773e.remove(view);
        }

        void o(View view) {
            c.h.l.a aVarL = c.h.l.t.l(view);
            if (aVarL == null || aVarL == this) {
                return;
            }
            this.f1773e.put(view, aVarL);
        }
    }

    public r(RecyclerView recyclerView) {
        this.f1770d = recyclerView;
        c.h.l.a aVarN = n();
        if (aVarN == null || !(aVarN instanceof a)) {
            this.f1771e = new a(this);
        } else {
            this.f1771e = (a) aVarN;
        }
    }

    @Override // c.h.l.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().R0(accessibilityEvent);
        }
    }

    @Override // c.h.l.a
    public void g(View view, c.h.l.c0.c cVar) {
        super.g(view, cVar);
        if (o() || this.f1770d.getLayoutManager() == null) {
            return;
        }
        this.f1770d.getLayoutManager().T0(cVar);
    }

    @Override // c.h.l.a
    public boolean j(View view, int i2, Bundle bundle) {
        if (super.j(view, i2, bundle)) {
            return true;
        }
        if (o() || this.f1770d.getLayoutManager() == null) {
            return false;
        }
        return this.f1770d.getLayoutManager().n1(i2, bundle);
    }

    public c.h.l.a n() {
        return this.f1771e;
    }

    boolean o() {
        return this.f1770d.m0();
    }
}