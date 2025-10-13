package c.s;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TransitionManager.java */
/* loaded from: classes.dex */
public class o {
    private static m a = new b();

    /* renamed from: b, reason: collision with root package name */
    private static ThreadLocal<WeakReference<c.e.a<ViewGroup, ArrayList<m>>>> f3407b = new ThreadLocal<>();

    /* renamed from: c, reason: collision with root package name */
    static ArrayList<ViewGroup> f3408c = new ArrayList<>();

    /* compiled from: TransitionManager.java */
    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: e, reason: collision with root package name */
        m f3409e;

        /* renamed from: f, reason: collision with root package name */
        ViewGroup f3410f;

        /* compiled from: TransitionManager.java */
        /* renamed from: c.s.o$a$a, reason: collision with other inner class name */
        class C0074a extends n {
            final /* synthetic */ c.e.a a;

            C0074a(c.e.a aVar) {
                this.a = aVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // c.s.m.f
            public void c(m mVar) {
                ((ArrayList) this.a.get(a.this.f3410f)).remove(mVar);
                mVar.Q(this);
            }
        }

        a(m mVar, ViewGroup viewGroup) {
            this.f3409e = mVar;
            this.f3410f = viewGroup;
        }

        private void a() {
            this.f3410f.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f3410f.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!o.f3408c.remove(this.f3410f)) {
                return true;
            }
            c.e.a<ViewGroup, ArrayList<m>> aVarB = o.b();
            ArrayList<m> arrayList = aVarB.get(this.f3410f);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                aVarB.put(this.f3410f, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f3409e);
            this.f3409e.a(new C0074a(aVarB));
            this.f3409e.k(this.f3410f, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).S(this.f3410f);
                }
            }
            this.f3409e.P(this.f3410f);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            o.f3408c.remove(this.f3410f);
            ArrayList<m> arrayList = o.b().get(this.f3410f);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<m> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().S(this.f3410f);
                }
            }
            this.f3409e.l(true);
        }
    }

    public static void a(ViewGroup viewGroup, m mVar) {
        if (f3408c.contains(viewGroup) || !c.h.l.t.Q(viewGroup)) {
            return;
        }
        f3408c.add(viewGroup);
        if (mVar == null) {
            mVar = a;
        }
        m mVarClone = mVar.clone();
        d(viewGroup, mVarClone);
        l.c(viewGroup, null);
        c(viewGroup, mVarClone);
    }

    static c.e.a<ViewGroup, ArrayList<m>> b() {
        c.e.a<ViewGroup, ArrayList<m>> aVar;
        WeakReference<c.e.a<ViewGroup, ArrayList<m>>> weakReference = f3407b.get();
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            return aVar;
        }
        c.e.a<ViewGroup, ArrayList<m>> aVar2 = new c.e.a<>();
        f3407b.set(new WeakReference<>(aVar2));
        return aVar2;
    }

    private static void c(ViewGroup viewGroup, m mVar) {
        if (mVar == null || viewGroup == null) {
            return;
        }
        a aVar = new a(mVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void d(ViewGroup viewGroup, m mVar) {
        ArrayList<m> arrayList = b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<m> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().O(viewGroup);
            }
        }
        if (mVar != null) {
            mVar.k(viewGroup, true);
        }
        l lVarB = l.b(viewGroup);
        if (lVarB != null) {
            lVarB.a();
        }
    }
}