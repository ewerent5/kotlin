package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.m;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: FragmentLifecycleCallbacksDispatcher.java */
/* loaded from: classes.dex */
class l {
    private final CopyOnWriteArrayList<a> a = new CopyOnWriteArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final m f1034b;

    /* compiled from: FragmentLifecycleCallbacksDispatcher.java */
    private static final class a {
        final m.f a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f1035b;
    }

    l(m mVar) {
        this.f1034b = mVar;
    }

    void a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragmentI0 = this.f1034b.i0();
        if (fragmentI0 != null) {
            fragmentI0.D0().h0().a(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1035b) {
                m.f fVar = next.a;
                throw null;
            }
        }
    }

    void b(Fragment fragment, Context context, boolean z) {
        Fragment fragmentI0 = this.f1034b.i0();
        if (fragmentI0 != null) {
            fragmentI0.D0().h0().b(fragment, context, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1035b) {
                m.f fVar = next.a;
                throw null;
            }
        }
    }

    void c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragmentI0 = this.f1034b.i0();
        if (fragmentI0 != null) {
            fragmentI0.D0().h0().c(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1035b) {
                m.f fVar = next.a;
                throw null;
            }
        }
    }

    void d(Fragment fragment, boolean z) {
        Fragment fragmentI0 = this.f1034b.i0();
        if (fragmentI0 != null) {
            fragmentI0.D0().h0().d(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1035b) {
                m.f fVar = next.a;
                throw null;
            }
        }
    }

    void e(Fragment fragment, boolean z) {
        Fragment fragmentI0 = this.f1034b.i0();
        if (fragmentI0 != null) {
            fragmentI0.D0().h0().e(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1035b) {
                m.f fVar = next.a;
                throw null;
            }
        }
    }

    void f(Fragment fragment, boolean z) {
        Fragment fragmentI0 = this.f1034b.i0();
        if (fragmentI0 != null) {
            fragmentI0.D0().h0().f(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1035b) {
                m.f fVar = next.a;
                throw null;
            }
        }
    }

    void g(Fragment fragment, Context context, boolean z) {
        Fragment fragmentI0 = this.f1034b.i0();
        if (fragmentI0 != null) {
            fragmentI0.D0().h0().g(fragment, context, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1035b) {
                m.f fVar = next.a;
                throw null;
            }
        }
    }

    void h(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragmentI0 = this.f1034b.i0();
        if (fragmentI0 != null) {
            fragmentI0.D0().h0().h(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1035b) {
                m.f fVar = next.a;
                throw null;
            }
        }
    }

    void i(Fragment fragment, boolean z) {
        Fragment fragmentI0 = this.f1034b.i0();
        if (fragmentI0 != null) {
            fragmentI0.D0().h0().i(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1035b) {
                m.f fVar = next.a;
                throw null;
            }
        }
    }

    void j(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragmentI0 = this.f1034b.i0();
        if (fragmentI0 != null) {
            fragmentI0.D0().h0().j(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1035b) {
                m.f fVar = next.a;
                throw null;
            }
        }
    }

    void k(Fragment fragment, boolean z) {
        Fragment fragmentI0 = this.f1034b.i0();
        if (fragmentI0 != null) {
            fragmentI0.D0().h0().k(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1035b) {
                m.f fVar = next.a;
                throw null;
            }
        }
    }

    void l(Fragment fragment, boolean z) {
        Fragment fragmentI0 = this.f1034b.i0();
        if (fragmentI0 != null) {
            fragmentI0.D0().h0().l(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1035b) {
                m.f fVar = next.a;
                throw null;
            }
        }
    }

    void m(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment fragmentI0 = this.f1034b.i0();
        if (fragmentI0 != null) {
            fragmentI0.D0().h0().m(fragment, view, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1035b) {
                m.f fVar = next.a;
                throw null;
            }
        }
    }

    void n(Fragment fragment, boolean z) {
        Fragment fragmentI0 = this.f1034b.i0();
        if (fragmentI0 != null) {
            fragmentI0.D0().h0().n(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1035b) {
                m.f fVar = next.a;
                throw null;
            }
        }
    }
}