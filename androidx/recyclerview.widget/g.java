package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public class g extends t {

    /* renamed from: h, reason: collision with root package name */
    private static TimeInterpolator f1671h;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList<RecyclerView.d0> f1672i = new ArrayList<>();

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<RecyclerView.d0> f1673j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    private ArrayList<j> f1674k = new ArrayList<>();

    /* renamed from: l, reason: collision with root package name */
    private ArrayList<i> f1675l = new ArrayList<>();

    /* renamed from: m, reason: collision with root package name */
    ArrayList<ArrayList<RecyclerView.d0>> f1676m = new ArrayList<>();
    ArrayList<ArrayList<j>> n = new ArrayList<>();
    ArrayList<ArrayList<i>> o = new ArrayList<>();
    ArrayList<RecyclerView.d0> p = new ArrayList<>();
    ArrayList<RecyclerView.d0> q = new ArrayList<>();
    ArrayList<RecyclerView.d0> r = new ArrayList<>();
    ArrayList<RecyclerView.d0> s = new ArrayList<>();

    /* compiled from: DefaultItemAnimator.java */
    class a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f1677e;

        a(ArrayList arrayList) {
            this.f1677e = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f1677e.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                g.this.S(jVar.a, jVar.f1705b, jVar.f1706c, jVar.f1707d, jVar.f1708e);
            }
            this.f1677e.clear();
            g.this.n.remove(this.f1677e);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    class b implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f1679e;

        b(ArrayList arrayList) {
            this.f1679e = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f1679e.iterator();
            while (it.hasNext()) {
                g.this.R((i) it.next());
            }
            this.f1679e.clear();
            g.this.o.remove(this.f1679e);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    class c implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f1681e;

        c(ArrayList arrayList) {
            this.f1681e = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f1681e.iterator();
            while (it.hasNext()) {
                g.this.Q((RecyclerView.d0) it.next());
            }
            this.f1681e.clear();
            g.this.f1676m.remove(this.f1681e);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    class d extends AnimatorListenerAdapter {
        final /* synthetic */ RecyclerView.d0 a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f1683b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f1684c;

        d(RecyclerView.d0 d0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.a = d0Var;
            this.f1683b = viewPropertyAnimator;
            this.f1684c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1683b.setListener(null);
            this.f1684c.setAlpha(1.0f);
            g.this.G(this.a);
            g.this.r.remove(this.a);
            g.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.H(this.a);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    class e extends AnimatorListenerAdapter {
        final /* synthetic */ RecyclerView.d0 a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f1686b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f1687c;

        e(RecyclerView.d0 d0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.a = d0Var;
            this.f1686b = view;
            this.f1687c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1686b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1687c.setListener(null);
            g.this.A(this.a);
            g.this.p.remove(this.a);
            g.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.B(this.a);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    class f extends AnimatorListenerAdapter {
        final /* synthetic */ RecyclerView.d0 a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1689b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f1690c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f1691d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f1692e;

        f(RecyclerView.d0 d0Var, int i2, View view, int i3, ViewPropertyAnimator viewPropertyAnimator) {
            this.a = d0Var;
            this.f1689b = i2;
            this.f1690c = view;
            this.f1691d = i3;
            this.f1692e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f1689b != 0) {
                this.f1690c.setTranslationX(0.0f);
            }
            if (this.f1691d != 0) {
                this.f1690c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1692e.setListener(null);
            g.this.E(this.a);
            g.this.q.remove(this.a);
            g.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.F(this.a);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* renamed from: androidx.recyclerview.widget.g$g, reason: collision with other inner class name */
    class C0025g extends AnimatorListenerAdapter {
        final /* synthetic */ i a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f1694b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f1695c;

        C0025g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.a = iVar;
            this.f1694b = viewPropertyAnimator;
            this.f1695c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1694b.setListener(null);
            this.f1695c.setAlpha(1.0f);
            this.f1695c.setTranslationX(0.0f);
            this.f1695c.setTranslationY(0.0f);
            g.this.C(this.a.a, true);
            g.this.s.remove(this.a.a);
            g.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.D(this.a.a, true);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    class h extends AnimatorListenerAdapter {
        final /* synthetic */ i a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f1697b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f1698c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.a = iVar;
            this.f1697b = viewPropertyAnimator;
            this.f1698c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1697b.setListener(null);
            this.f1698c.setAlpha(1.0f);
            this.f1698c.setTranslationX(0.0f);
            this.f1698c.setTranslationY(0.0f);
            g.this.C(this.a.f1700b, false);
            g.this.s.remove(this.a.f1700b);
            g.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.D(this.a.f1700b, false);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    private static class j {
        public RecyclerView.d0 a;

        /* renamed from: b, reason: collision with root package name */
        public int f1705b;

        /* renamed from: c, reason: collision with root package name */
        public int f1706c;

        /* renamed from: d, reason: collision with root package name */
        public int f1707d;

        /* renamed from: e, reason: collision with root package name */
        public int f1708e;

        j(RecyclerView.d0 d0Var, int i2, int i3, int i4, int i5) {
            this.a = d0Var;
            this.f1705b = i2;
            this.f1706c = i3;
            this.f1707d = i4;
            this.f1708e = i5;
        }
    }

    private void T(RecyclerView.d0 d0Var) {
        View view = d0Var.f1546f;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.r.add(d0Var);
        viewPropertyAnimatorAnimate.setDuration(o()).alpha(0.0f).setListener(new d(d0Var, viewPropertyAnimatorAnimate, view)).start();
    }

    private void W(List<i> list, RecyclerView.d0 d0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (Y(iVar, d0Var) && iVar.a == null && iVar.f1700b == null) {
                list.remove(iVar);
            }
        }
    }

    private void X(i iVar) {
        RecyclerView.d0 d0Var = iVar.a;
        if (d0Var != null) {
            Y(iVar, d0Var);
        }
        RecyclerView.d0 d0Var2 = iVar.f1700b;
        if (d0Var2 != null) {
            Y(iVar, d0Var2);
        }
    }

    private boolean Y(i iVar, RecyclerView.d0 d0Var) {
        boolean z = false;
        if (iVar.f1700b == d0Var) {
            iVar.f1700b = null;
        } else {
            if (iVar.a != d0Var) {
                return false;
            }
            iVar.a = null;
            z = true;
        }
        d0Var.f1546f.setAlpha(1.0f);
        d0Var.f1546f.setTranslationX(0.0f);
        d0Var.f1546f.setTranslationY(0.0f);
        C(d0Var, z);
        return true;
    }

    private void Z(RecyclerView.d0 d0Var) {
        if (f1671h == null) {
            f1671h = new ValueAnimator().getInterpolator();
        }
        d0Var.f1546f.animate().setInterpolator(f1671h);
        j(d0Var);
    }

    void Q(RecyclerView.d0 d0Var) {
        View view = d0Var.f1546f;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.p.add(d0Var);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(l()).setListener(new e(d0Var, view, viewPropertyAnimatorAnimate)).start();
    }

    void R(i iVar) {
        RecyclerView.d0 d0Var = iVar.a;
        View view = d0Var == null ? null : d0Var.f1546f;
        RecyclerView.d0 d0Var2 = iVar.f1700b;
        View view2 = d0Var2 != null ? d0Var2.f1546f : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.s.add(iVar.a);
            duration.translationX(iVar.f1703e - iVar.f1701c);
            duration.translationY(iVar.f1704f - iVar.f1702d);
            duration.alpha(0.0f).setListener(new C0025g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.s.add(iVar.f1700b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    void S(RecyclerView.d0 d0Var, int i2, int i3, int i4, int i5) {
        View view = d0Var.f1546f;
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        if (i6 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i7 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.q.add(d0Var);
        viewPropertyAnimatorAnimate.setDuration(n()).setListener(new f(d0Var, i6, view, i7, viewPropertyAnimatorAnimate)).start();
    }

    void U(List<RecyclerView.d0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f1546f.animate().cancel();
        }
    }

    void V() {
        if (p()) {
            return;
        }
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean g(RecyclerView.d0 d0Var, List<Object> list) {
        return !list.isEmpty() || super.g(d0Var, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void j(RecyclerView.d0 d0Var) {
        View view = d0Var.f1546f;
        view.animate().cancel();
        int size = this.f1674k.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f1674k.get(size).a == d0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                E(d0Var);
                this.f1674k.remove(size);
            }
        }
        W(this.f1675l, d0Var);
        if (this.f1672i.remove(d0Var)) {
            view.setAlpha(1.0f);
            G(d0Var);
        }
        if (this.f1673j.remove(d0Var)) {
            view.setAlpha(1.0f);
            A(d0Var);
        }
        for (int size2 = this.o.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.o.get(size2);
            W(arrayList, d0Var);
            if (arrayList.isEmpty()) {
                this.o.remove(size2);
            }
        }
        for (int size3 = this.n.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.n.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).a == d0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    E(d0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.n.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f1676m.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.d0> arrayList3 = this.f1676m.get(size5);
            if (arrayList3.remove(d0Var)) {
                view.setAlpha(1.0f);
                A(d0Var);
                if (arrayList3.isEmpty()) {
                    this.f1676m.remove(size5);
                }
            }
        }
        this.r.remove(d0Var);
        this.p.remove(d0Var);
        this.s.remove(d0Var);
        this.q.remove(d0Var);
        V();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void k() {
        int size = this.f1674k.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.f1674k.get(size);
            View view = jVar.a.f1546f;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(jVar.a);
            this.f1674k.remove(size);
        }
        for (int size2 = this.f1672i.size() - 1; size2 >= 0; size2--) {
            G(this.f1672i.get(size2));
            this.f1672i.remove(size2);
        }
        int size3 = this.f1673j.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.d0 d0Var = this.f1673j.get(size3);
            d0Var.f1546f.setAlpha(1.0f);
            A(d0Var);
            this.f1673j.remove(size3);
        }
        for (int size4 = this.f1675l.size() - 1; size4 >= 0; size4--) {
            X(this.f1675l.get(size4));
        }
        this.f1675l.clear();
        if (p()) {
            for (int size5 = this.n.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.n.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.a.f1546f;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    E(jVar2.a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.n.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f1676m.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.d0> arrayList2 = this.f1676m.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.d0 d0Var2 = arrayList2.get(size8);
                    d0Var2.f1546f.setAlpha(1.0f);
                    A(d0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f1676m.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.o.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.o.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    X(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.o.remove(arrayList3);
                    }
                }
            }
            U(this.r);
            U(this.q);
            U(this.p);
            U(this.s);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean p() {
        return (this.f1673j.isEmpty() && this.f1675l.isEmpty() && this.f1674k.isEmpty() && this.f1672i.isEmpty() && this.q.isEmpty() && this.r.isEmpty() && this.p.isEmpty() && this.s.isEmpty() && this.n.isEmpty() && this.f1676m.isEmpty() && this.o.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void u() {
        boolean z = !this.f1672i.isEmpty();
        boolean z2 = !this.f1674k.isEmpty();
        boolean z3 = !this.f1675l.isEmpty();
        boolean z4 = !this.f1673j.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.d0> it = this.f1672i.iterator();
            while (it.hasNext()) {
                T(it.next());
            }
            this.f1672i.clear();
            if (z2) {
                ArrayList<j> arrayList = new ArrayList<>();
                arrayList.addAll(this.f1674k);
                this.n.add(arrayList);
                this.f1674k.clear();
                a aVar = new a(arrayList);
                if (z) {
                    c.h.l.t.d0(arrayList.get(0).a.f1546f, aVar, o());
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList<i> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f1675l);
                this.o.add(arrayList2);
                this.f1675l.clear();
                b bVar = new b(arrayList2);
                if (z) {
                    c.h.l.t.d0(arrayList2.get(0).a.f1546f, bVar, o());
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList<RecyclerView.d0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f1673j);
                this.f1676m.add(arrayList3);
                this.f1673j.clear();
                c cVar = new c(arrayList3);
                if (z || z2 || z3) {
                    c.h.l.t.d0(arrayList3.get(0).f1546f, cVar, (z ? o() : 0L) + Math.max(z2 ? n() : 0L, z3 ? m() : 0L));
                } else {
                    cVar.run();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.t
    public boolean w(RecyclerView.d0 d0Var) {
        Z(d0Var);
        d0Var.f1546f.setAlpha(0.0f);
        this.f1673j.add(d0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.t
    public boolean x(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i2, int i3, int i4, int i5) {
        if (d0Var == d0Var2) {
            return y(d0Var, i2, i3, i4, i5);
        }
        float translationX = d0Var.f1546f.getTranslationX();
        float translationY = d0Var.f1546f.getTranslationY();
        float alpha = d0Var.f1546f.getAlpha();
        Z(d0Var);
        int i6 = (int) ((i4 - i2) - translationX);
        int i7 = (int) ((i5 - i3) - translationY);
        d0Var.f1546f.setTranslationX(translationX);
        d0Var.f1546f.setTranslationY(translationY);
        d0Var.f1546f.setAlpha(alpha);
        if (d0Var2 != null) {
            Z(d0Var2);
            d0Var2.f1546f.setTranslationX(-i6);
            d0Var2.f1546f.setTranslationY(-i7);
            d0Var2.f1546f.setAlpha(0.0f);
        }
        this.f1675l.add(new i(d0Var, d0Var2, i2, i3, i4, i5));
        return true;
    }

    @Override // androidx.recyclerview.widget.t
    public boolean y(RecyclerView.d0 d0Var, int i2, int i3, int i4, int i5) {
        View view = d0Var.f1546f;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) d0Var.f1546f.getTranslationY());
        Z(d0Var);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            E(d0Var);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i7 != 0) {
            view.setTranslationY(-i7);
        }
        this.f1674k.add(new j(d0Var, translationX, translationY, i4, i5));
        return true;
    }

    @Override // androidx.recyclerview.widget.t
    public boolean z(RecyclerView.d0 d0Var) {
        Z(d0Var);
        this.f1672i.add(d0Var);
        return true;
    }

    /* compiled from: DefaultItemAnimator.java */
    private static class i {
        public RecyclerView.d0 a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.d0 f1700b;

        /* renamed from: c, reason: collision with root package name */
        public int f1701c;

        /* renamed from: d, reason: collision with root package name */
        public int f1702d;

        /* renamed from: e, reason: collision with root package name */
        public int f1703e;

        /* renamed from: f, reason: collision with root package name */
        public int f1704f;

        private i(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
            this.a = d0Var;
            this.f1700b = d0Var2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.a + ", newHolder=" + this.f1700b + ", fromX=" + this.f1701c + ", fromY=" + this.f1702d + ", toX=" + this.f1703e + ", toY=" + this.f1704f + CoreConstants.CURLY_RIGHT;
        }

        i(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i2, int i3, int i4, int i5) {
            this(d0Var, d0Var2);
            this.f1701c = i2;
            this.f1702d = i3;
            this.f1703e = i4;
            this.f1704f = i5;
        }
    }
}