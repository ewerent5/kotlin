package c.s;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import c.h.h.a;
import c.s.m;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FragmentTransitionSupport.java */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public class e extends androidx.fragment.app.x {

    /* compiled from: FragmentTransitionSupport.java */
    class a extends m.e {
        final /* synthetic */ Rect a;

        a(Rect rect) {
            this.a = rect;
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    class b implements m.f {
        final /* synthetic */ View a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f3353b;

        b(View view, ArrayList arrayList) {
            this.a = view;
            this.f3353b = arrayList;
        }

        @Override // c.s.m.f
        public void a(m mVar) {
            mVar.Q(this);
            mVar.a(this);
        }

        @Override // c.s.m.f
        public void b(m mVar) {
        }

        @Override // c.s.m.f
        public void c(m mVar) {
            mVar.Q(this);
            this.a.setVisibility(8);
            int size = this.f3353b.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((View) this.f3353b.get(i2)).setVisibility(0);
            }
        }

        @Override // c.s.m.f
        public void d(m mVar) {
        }

        @Override // c.s.m.f
        public void e(m mVar) {
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    class c extends n {
        final /* synthetic */ Object a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f3355b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f3356c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f3357d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f3358e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f3359f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.a = obj;
            this.f3355b = arrayList;
            this.f3356c = obj2;
            this.f3357d = arrayList2;
            this.f3358e = obj3;
            this.f3359f = arrayList3;
        }

        @Override // c.s.n, c.s.m.f
        public void a(m mVar) {
            Object obj = this.a;
            if (obj != null) {
                e.this.q(obj, this.f3355b, null);
            }
            Object obj2 = this.f3356c;
            if (obj2 != null) {
                e.this.q(obj2, this.f3357d, null);
            }
            Object obj3 = this.f3358e;
            if (obj3 != null) {
                e.this.q(obj3, this.f3359f, null);
            }
        }

        @Override // c.s.m.f
        public void c(m mVar) {
            mVar.Q(this);
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    class d implements a.InterfaceC0050a {
        final /* synthetic */ m a;

        d(m mVar) {
            this.a = mVar;
        }

        @Override // c.h.h.a.InterfaceC0050a
        public void a() {
            this.a.cancel();
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* renamed from: c.s.e$e, reason: collision with other inner class name */
    class C0073e implements m.f {
        final /* synthetic */ Runnable a;

        C0073e(Runnable runnable) {
            this.a = runnable;
        }

        @Override // c.s.m.f
        public void a(m mVar) {
        }

        @Override // c.s.m.f
        public void b(m mVar) {
        }

        @Override // c.s.m.f
        public void c(m mVar) {
            this.a.run();
        }

        @Override // c.s.m.f
        public void d(m mVar) {
        }

        @Override // c.s.m.f
        public void e(m mVar) {
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    class f extends m.e {
        final /* synthetic */ Rect a;

        f(Rect rect) {
            this.a = rect;
        }
    }

    private static boolean C(m mVar) {
        return (androidx.fragment.app.x.l(mVar.z()) && androidx.fragment.app.x.l(mVar.A()) && androidx.fragment.app.x.l(mVar.B())) ? false : true;
    }

    @Override // androidx.fragment.app.x
    public void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        q qVar = (q) obj;
        if (qVar != null) {
            qVar.C().clear();
            qVar.C().addAll(arrayList2);
            q(qVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.x
    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        q qVar = new q();
        qVar.g0((m) obj);
        return qVar;
    }

    @Override // androidx.fragment.app.x
    public void a(Object obj, View view) {
        if (obj != null) {
            ((m) obj).b(view);
        }
    }

    @Override // androidx.fragment.app.x
    public void b(Object obj, ArrayList<View> arrayList) {
        m mVar = (m) obj;
        if (mVar == null) {
            return;
        }
        int i2 = 0;
        if (mVar instanceof q) {
            q qVar = (q) mVar;
            int iJ0 = qVar.j0();
            while (i2 < iJ0) {
                b(qVar.i0(i2), arrayList);
                i2++;
            }
            return;
        }
        if (C(mVar) || !androidx.fragment.app.x.l(mVar.C())) {
            return;
        }
        int size = arrayList.size();
        while (i2 < size) {
            mVar.b(arrayList.get(i2));
            i2++;
        }
    }

    @Override // androidx.fragment.app.x
    public void c(ViewGroup viewGroup, Object obj) {
        o.a(viewGroup, (m) obj);
    }

    @Override // androidx.fragment.app.x
    public boolean e(Object obj) {
        return obj instanceof m;
    }

    @Override // androidx.fragment.app.x
    public Object g(Object obj) {
        if (obj != null) {
            return ((m) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.x
    public Object m(Object obj, Object obj2, Object obj3) {
        m mVarO0 = (m) obj;
        m mVar = (m) obj2;
        m mVar2 = (m) obj3;
        if (mVarO0 != null && mVar != null) {
            mVarO0 = new q().g0(mVarO0).g0(mVar).o0(1);
        } else if (mVarO0 == null) {
            mVarO0 = mVar != null ? mVar : null;
        }
        if (mVar2 == null) {
            return mVarO0;
        }
        q qVar = new q();
        if (mVarO0 != null) {
            qVar.g0(mVarO0);
        }
        qVar.g0(mVar2);
        return qVar;
    }

    @Override // androidx.fragment.app.x
    public Object n(Object obj, Object obj2, Object obj3) {
        q qVar = new q();
        if (obj != null) {
            qVar.g0((m) obj);
        }
        if (obj2 != null) {
            qVar.g0((m) obj2);
        }
        if (obj3 != null) {
            qVar.g0((m) obj3);
        }
        return qVar;
    }

    @Override // androidx.fragment.app.x
    public void p(Object obj, View view) {
        if (obj != null) {
            ((m) obj).R(view);
        }
    }

    @Override // androidx.fragment.app.x
    public void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        m mVar = (m) obj;
        int i2 = 0;
        if (mVar instanceof q) {
            q qVar = (q) mVar;
            int iJ0 = qVar.j0();
            while (i2 < iJ0) {
                q(qVar.i0(i2), arrayList, arrayList2);
                i2++;
            }
            return;
        }
        if (C(mVar)) {
            return;
        }
        List<View> listC = mVar.C();
        if (listC.size() == arrayList.size() && listC.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i2 < size) {
                mVar.b(arrayList2.get(i2));
                i2++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                mVar.R(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.x
    public void r(Object obj, View view, ArrayList<View> arrayList) {
        ((m) obj).a(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.x
    public void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((m) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.x
    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((m) obj).W(new f(rect));
        }
    }

    @Override // androidx.fragment.app.x
    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((m) obj).W(new a(rect));
        }
    }

    @Override // androidx.fragment.app.x
    public void w(Fragment fragment, Object obj, c.h.h.a aVar, Runnable runnable) {
        m mVar = (m) obj;
        aVar.c(new d(mVar));
        mVar.a(new C0073e(runnable));
    }

    @Override // androidx.fragment.app.x
    public void z(Object obj, View view, ArrayList<View> arrayList) {
        q qVar = (q) obj;
        List<View> listC = qVar.C();
        listC.clear();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.fragment.app.x.d(listC, arrayList.get(i2));
        }
        listC.add(view);
        arrayList.add(view);
        b(qVar, arrayList);
    }
}