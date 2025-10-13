package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: LifecycleRegistry.java */
/* loaded from: classes.dex */
public class l extends g {

    /* renamed from: b, reason: collision with root package name */
    private c.b.a.b.a<j, a> f1212b;

    /* renamed from: c, reason: collision with root package name */
    private g.c f1213c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakReference<k> f1214d;

    /* renamed from: e, reason: collision with root package name */
    private int f1215e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1216f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1217g;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList<g.c> f1218h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f1219i;

    /* compiled from: LifecycleRegistry.java */
    static class a {
        g.c a;

        /* renamed from: b, reason: collision with root package name */
        i f1220b;

        a(j jVar, g.c cVar) {
            this.f1220b = o.f(jVar);
            this.a = cVar;
        }

        void a(k kVar, g.b bVar) {
            g.c cVarB = bVar.b();
            this.a = l.k(this.a, cVarB);
            this.f1220b.c(kVar, bVar);
            this.a = cVarB;
        }
    }

    public l(k kVar) {
        this(kVar, true);
    }

    private void d(k kVar) {
        Iterator<Map.Entry<j, a>> itDescendingIterator = this.f1212b.descendingIterator();
        while (itDescendingIterator.hasNext() && !this.f1217g) {
            Map.Entry<j, a> next = itDescendingIterator.next();
            a value = next.getValue();
            while (value.a.compareTo(this.f1213c) > 0 && !this.f1217g && this.f1212b.contains(next.getKey())) {
                g.b bVarA = g.b.a(value.a);
                if (bVarA == null) {
                    throw new IllegalStateException("no event down from " + value.a);
                }
                n(bVarA.b());
                value.a(kVar, bVarA);
                m();
            }
        }
    }

    private g.c e(j jVar) {
        Map.Entry<j, a> entryM = this.f1212b.m(jVar);
        g.c cVar = null;
        g.c cVar2 = entryM != null ? entryM.getValue().a : null;
        if (!this.f1218h.isEmpty()) {
            cVar = this.f1218h.get(r0.size() - 1);
        }
        return k(k(this.f1213c, cVar2), cVar);
    }

    @SuppressLint({"RestrictedApi"})
    private void f(String str) {
        if (!this.f1219i || c.b.a.a.a.f().c()) {
            return;
        }
        throw new IllegalStateException("Method " + str + " must be called on the main thread");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void g(k kVar) {
        c.b.a.b.b<j, a>.d dVarE = this.f1212b.e();
        while (dVarE.hasNext() && !this.f1217g) {
            Map.Entry next = dVarE.next();
            a aVar = (a) next.getValue();
            while (aVar.a.compareTo(this.f1213c) < 0 && !this.f1217g && this.f1212b.contains(next.getKey())) {
                n(aVar.a);
                g.b bVarC = g.b.c(aVar.a);
                if (bVarC == null) {
                    throw new IllegalStateException("no event up from " + aVar.a);
                }
                aVar.a(kVar, bVarC);
                m();
            }
        }
    }

    private boolean i() {
        if (this.f1212b.size() == 0) {
            return true;
        }
        g.c cVar = this.f1212b.a().getValue().a;
        g.c cVar2 = this.f1212b.f().getValue().a;
        return cVar == cVar2 && this.f1213c == cVar2;
    }

    static g.c k(g.c cVar, g.c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    private void l(g.c cVar) {
        if (this.f1213c == cVar) {
            return;
        }
        this.f1213c = cVar;
        if (this.f1216f || this.f1215e != 0) {
            this.f1217g = true;
            return;
        }
        this.f1216f = true;
        p();
        this.f1216f = false;
    }

    private void m() {
        this.f1218h.remove(r0.size() - 1);
    }

    private void n(g.c cVar) {
        this.f1218h.add(cVar);
    }

    private void p() {
        k kVar = this.f1214d.get();
        if (kVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (!i()) {
            this.f1217g = false;
            if (this.f1213c.compareTo(this.f1212b.a().getValue().a) < 0) {
                d(kVar);
            }
            Map.Entry<j, a> entryF = this.f1212b.f();
            if (!this.f1217g && entryF != null && this.f1213c.compareTo(entryF.getValue().a) > 0) {
                g(kVar);
            }
        }
        this.f1217g = false;
    }

    @Override // androidx.lifecycle.g
    public void a(j jVar) {
        k kVar;
        f("addObserver");
        g.c cVar = this.f1213c;
        g.c cVar2 = g.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = g.c.INITIALIZED;
        }
        a aVar = new a(jVar, cVar2);
        if (this.f1212b.k(jVar, aVar) == null && (kVar = this.f1214d.get()) != null) {
            boolean z = this.f1215e != 0 || this.f1216f;
            g.c cVarE = e(jVar);
            this.f1215e++;
            while (aVar.a.compareTo(cVarE) < 0 && this.f1212b.contains(jVar)) {
                n(aVar.a);
                g.b bVarC = g.b.c(aVar.a);
                if (bVarC == null) {
                    throw new IllegalStateException("no event up from " + aVar.a);
                }
                aVar.a(kVar, bVarC);
                m();
                cVarE = e(jVar);
            }
            if (!z) {
                p();
            }
            this.f1215e--;
        }
    }

    @Override // androidx.lifecycle.g
    public g.c b() {
        return this.f1213c;
    }

    @Override // androidx.lifecycle.g
    public void c(j jVar) {
        f("removeObserver");
        this.f1212b.l(jVar);
    }

    public void h(g.b bVar) {
        f("handleLifecycleEvent");
        l(bVar.b());
    }

    @Deprecated
    public void j(g.c cVar) {
        f("markState");
        o(cVar);
    }

    public void o(g.c cVar) {
        f("setCurrentState");
        l(cVar);
    }

    private l(k kVar, boolean z) {
        this.f1212b = new c.b.a.b.a<>();
        this.f1215e = 0;
        this.f1216f = false;
        this.f1217g = false;
        this.f1218h = new ArrayList<>();
        this.f1214d = new WeakReference<>(kVar);
        this.f1213c = g.c.INITIALIZED;
        this.f1219i = z;
    }
}