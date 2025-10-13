package c.s;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Transition.java */
/* loaded from: classes.dex */
public abstract class m implements Cloneable {

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f3393e = {2, 1, 3, 4};

    /* renamed from: f, reason: collision with root package name */
    private static final g f3394f = new a();

    /* renamed from: g, reason: collision with root package name */
    private static ThreadLocal<c.e.a<Animator, d>> f3395g = new ThreadLocal<>();
    private ArrayList<s> A;
    private ArrayList<s> B;
    p K;
    private e L;
    private c.e.a<String, String> M;

    /* renamed from: h, reason: collision with root package name */
    private String f3396h = getClass().getName();

    /* renamed from: i, reason: collision with root package name */
    private long f3397i = -1;

    /* renamed from: j, reason: collision with root package name */
    long f3398j = -1;

    /* renamed from: k, reason: collision with root package name */
    private TimeInterpolator f3399k = null;

    /* renamed from: l, reason: collision with root package name */
    ArrayList<Integer> f3400l = new ArrayList<>();

    /* renamed from: m, reason: collision with root package name */
    ArrayList<View> f3401m = new ArrayList<>();
    private ArrayList<String> n = null;
    private ArrayList<Class<?>> o = null;
    private ArrayList<Integer> p = null;
    private ArrayList<View> q = null;
    private ArrayList<Class<?>> r = null;
    private ArrayList<String> s = null;
    private ArrayList<Integer> t = null;
    private ArrayList<View> u = null;
    private ArrayList<Class<?>> v = null;
    private t w = new t();
    private t x = new t();
    q y = null;
    private int[] z = f3393e;
    private ViewGroup C = null;
    boolean D = false;
    ArrayList<Animator> E = new ArrayList<>();
    private int F = 0;
    private boolean G = false;
    private boolean H = false;
    private ArrayList<f> I = null;
    private ArrayList<Animator> J = new ArrayList<>();
    private g N = f3394f;

    /* compiled from: Transition.java */
    static class a extends g {
        a() {
        }

        @Override // c.s.g
        public Path a(float f2, float f3, float f4, float f5) {
            Path path = new Path();
            path.moveTo(f2, f3);
            path.lineTo(f4, f5);
            return path;
        }
    }

    /* compiled from: Transition.java */
    class b extends AnimatorListenerAdapter {
        final /* synthetic */ c.e.a a;

        b(c.e.a aVar) {
            this.a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.remove(animator);
            m.this.E.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            m.this.E.add(animator);
        }
    }

    /* compiled from: Transition.java */
    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m.this.p();
            animator.removeListener(this);
        }
    }

    /* compiled from: Transition.java */
    private static class d {
        View a;

        /* renamed from: b, reason: collision with root package name */
        String f3403b;

        /* renamed from: c, reason: collision with root package name */
        s f3404c;

        /* renamed from: d, reason: collision with root package name */
        m0 f3405d;

        /* renamed from: e, reason: collision with root package name */
        m f3406e;

        d(View view, String str, m mVar, m0 m0Var, s sVar) {
            this.a = view;
            this.f3403b = str;
            this.f3404c = sVar;
            this.f3405d = m0Var;
            this.f3406e = mVar;
        }
    }

    /* compiled from: Transition.java */
    public static abstract class e {
    }

    /* compiled from: Transition.java */
    public interface f {
        void a(m mVar);

        void b(m mVar);

        void c(m mVar);

        void d(m mVar);

        void e(m mVar);
    }

    private static boolean H(s sVar, s sVar2, String str) {
        Object obj = sVar.a.get(str);
        Object obj2 = sVar2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    private void I(c.e.a<View, s> aVar, c.e.a<View, s> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            View viewValueAt = sparseArray.valueAt(i2);
            if (viewValueAt != null && G(viewValueAt) && (view = sparseArray2.get(sparseArray.keyAt(i2))) != null && G(view)) {
                s sVar = aVar.get(viewValueAt);
                s sVar2 = aVar2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.A.add(sVar);
                    this.B.add(sVar2);
                    aVar.remove(viewValueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void J(c.e.a<View, s> aVar, c.e.a<View, s> aVar2) {
        s sVarRemove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View viewI = aVar.i(size);
            if (viewI != null && G(viewI) && (sVarRemove = aVar2.remove(viewI)) != null && G(sVarRemove.f3415b)) {
                this.A.add(aVar.k(size));
                this.B.add(sVarRemove);
            }
        }
    }

    private void L(c.e.a<View, s> aVar, c.e.a<View, s> aVar2, c.e.d<View> dVar, c.e.d<View> dVar2) {
        View viewF;
        int iM = dVar.m();
        for (int i2 = 0; i2 < iM; i2++) {
            View viewN = dVar.n(i2);
            if (viewN != null && G(viewN) && (viewF = dVar2.f(dVar.i(i2))) != null && G(viewF)) {
                s sVar = aVar.get(viewN);
                s sVar2 = aVar2.get(viewF);
                if (sVar != null && sVar2 != null) {
                    this.A.add(sVar);
                    this.B.add(sVar2);
                    aVar.remove(viewN);
                    aVar2.remove(viewF);
                }
            }
        }
    }

    private void M(c.e.a<View, s> aVar, c.e.a<View, s> aVar2, c.e.a<String, View> aVar3, c.e.a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i2 = 0; i2 < size; i2++) {
            View viewM = aVar3.m(i2);
            if (viewM != null && G(viewM) && (view = aVar4.get(aVar3.i(i2))) != null && G(view)) {
                s sVar = aVar.get(viewM);
                s sVar2 = aVar2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.A.add(sVar);
                    this.B.add(sVar2);
                    aVar.remove(viewM);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void N(t tVar, t tVar2) {
        c.e.a<View, s> aVar = new c.e.a<>(tVar.a);
        c.e.a<View, s> aVar2 = new c.e.a<>(tVar2.a);
        int i2 = 0;
        while (true) {
            int[] iArr = this.z;
            if (i2 >= iArr.length) {
                d(aVar, aVar2);
                return;
            }
            int i3 = iArr[i2];
            if (i3 == 1) {
                J(aVar, aVar2);
            } else if (i3 == 2) {
                M(aVar, aVar2, tVar.f3419d, tVar2.f3419d);
            } else if (i3 == 3) {
                I(aVar, aVar2, tVar.f3417b, tVar2.f3417b);
            } else if (i3 == 4) {
                L(aVar, aVar2, tVar.f3418c, tVar2.f3418c);
            }
            i2++;
        }
    }

    private void T(Animator animator, c.e.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            f(animator);
        }
    }

    private void d(c.e.a<View, s> aVar, c.e.a<View, s> aVar2) {
        for (int i2 = 0; i2 < aVar.size(); i2++) {
            s sVarM = aVar.m(i2);
            if (G(sVarM.f3415b)) {
                this.A.add(sVarM);
                this.B.add(null);
            }
        }
        for (int i3 = 0; i3 < aVar2.size(); i3++) {
            s sVarM2 = aVar2.m(i3);
            if (G(sVarM2.f3415b)) {
                this.B.add(sVarM2);
                this.A.add(null);
            }
        }
    }

    private static void e(t tVar, View view, s sVar) {
        tVar.a.put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            if (tVar.f3417b.indexOfKey(id) >= 0) {
                tVar.f3417b.put(id, null);
            } else {
                tVar.f3417b.put(id, view);
            }
        }
        String strI = c.h.l.t.I(view);
        if (strI != null) {
            if (tVar.f3419d.containsKey(strI)) {
                tVar.f3419d.put(strI, null);
            } else {
                tVar.f3419d.put(strI, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f3418c.h(itemIdAtPosition) < 0) {
                    c.h.l.t.t0(view, true);
                    tVar.f3418c.j(itemIdAtPosition, view);
                    return;
                }
                View viewF = tVar.f3418c.f(itemIdAtPosition);
                if (viewF != null) {
                    c.h.l.t.t0(viewF, false);
                    tVar.f3418c.j(itemIdAtPosition, null);
                }
            }
        }
    }

    private void h(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.p;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList2 = this.q;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.r;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (this.r.get(i2).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    s sVar = new s(view);
                    if (z) {
                        j(sVar);
                    } else {
                        g(sVar);
                    }
                    sVar.f3416c.add(this);
                    i(sVar);
                    if (z) {
                        e(this.w, view, sVar);
                    } else {
                        e(this.x, view, sVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.t;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList<View> arrayList5 = this.u;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.v;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i3 = 0; i3 < size2; i3++) {
                                    if (this.v.get(i3).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                                h(viewGroup.getChildAt(i4), z);
                            }
                        }
                    }
                }
            }
        }
    }

    private static c.e.a<Animator, d> x() {
        c.e.a<Animator, d> aVar = f3395g.get();
        if (aVar != null) {
            return aVar;
        }
        c.e.a<Animator, d> aVar2 = new c.e.a<>();
        f3395g.set(aVar2);
        return aVar2;
    }

    public List<String> A() {
        return this.n;
    }

    public List<Class<?>> B() {
        return this.o;
    }

    public List<View> C() {
        return this.f3401m;
    }

    public String[] D() {
        return null;
    }

    public s E(View view, boolean z) {
        q qVar = this.y;
        if (qVar != null) {
            return qVar.E(view, z);
        }
        return (z ? this.w : this.x).a.get(view);
    }

    public boolean F(s sVar, s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] strArrD = D();
        if (strArrD == null) {
            Iterator<String> it = sVar.a.keySet().iterator();
            while (it.hasNext()) {
                if (H(sVar, sVar2, it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrD) {
            if (!H(sVar, sVar2, str)) {
            }
        }
        return false;
        return true;
    }

    boolean G(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.p;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.q;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.r;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.r.get(i2).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.s != null && c.h.l.t.I(view) != null && this.s.contains(c.h.l.t.I(view))) {
            return false;
        }
        if ((this.f3400l.size() == 0 && this.f3401m.size() == 0 && (((arrayList = this.o) == null || arrayList.isEmpty()) && ((arrayList2 = this.n) == null || arrayList2.isEmpty()))) || this.f3400l.contains(Integer.valueOf(id)) || this.f3401m.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.n;
        if (arrayList6 != null && arrayList6.contains(c.h.l.t.I(view))) {
            return true;
        }
        if (this.o != null) {
            for (int i3 = 0; i3 < this.o.size(); i3++) {
                if (this.o.get(i3).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void O(View view) {
        if (this.H) {
            return;
        }
        c.e.a<Animator, d> aVarX = x();
        int size = aVarX.size();
        m0 m0VarD = c0.d(view);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            d dVarM = aVarX.m(i2);
            if (dVarM.a != null && m0VarD.equals(dVarM.f3405d)) {
                c.s.a.b(aVarX.i(i2));
            }
        }
        ArrayList<f> arrayList = this.I;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.I.clone();
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((f) arrayList2.get(i3)).b(this);
            }
        }
        this.G = true;
    }

    void P(ViewGroup viewGroup) {
        d dVar;
        this.A = new ArrayList<>();
        this.B = new ArrayList<>();
        N(this.w, this.x);
        c.e.a<Animator, d> aVarX = x();
        int size = aVarX.size();
        m0 m0VarD = c0.d(viewGroup);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator animatorI = aVarX.i(i2);
            if (animatorI != null && (dVar = aVarX.get(animatorI)) != null && dVar.a != null && m0VarD.equals(dVar.f3405d)) {
                s sVar = dVar.f3404c;
                View view = dVar.a;
                s sVarE = E(view, true);
                s sVarT = t(view, true);
                if (sVarE == null && sVarT == null) {
                    sVarT = this.x.a.get(view);
                }
                if (!(sVarE == null && sVarT == null) && dVar.f3406e.F(sVar, sVarT)) {
                    if (animatorI.isRunning() || animatorI.isStarted()) {
                        animatorI.cancel();
                    } else {
                        aVarX.remove(animatorI);
                    }
                }
            }
        }
        o(viewGroup, this.w, this.x, this.A, this.B);
        U();
    }

    public m Q(f fVar) {
        ArrayList<f> arrayList = this.I;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.I.size() == 0) {
            this.I = null;
        }
        return this;
    }

    public m R(View view) {
        this.f3401m.remove(view);
        return this;
    }

    public void S(View view) {
        if (this.G) {
            if (!this.H) {
                c.e.a<Animator, d> aVarX = x();
                int size = aVarX.size();
                m0 m0VarD = c0.d(view);
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    d dVarM = aVarX.m(i2);
                    if (dVarM.a != null && m0VarD.equals(dVarM.f3405d)) {
                        c.s.a.c(aVarX.i(i2));
                    }
                }
                ArrayList<f> arrayList = this.I;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.I.clone();
                    int size2 = arrayList2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((f) arrayList2.get(i3)).e(this);
                    }
                }
            }
            this.G = false;
        }
    }

    protected void U() {
        c0();
        c.e.a<Animator, d> aVarX = x();
        Iterator<Animator> it = this.J.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (aVarX.containsKey(next)) {
                c0();
                T(next, aVarX);
            }
        }
        this.J.clear();
        p();
    }

    public m V(long j2) {
        this.f3398j = j2;
        return this;
    }

    public void W(e eVar) {
        this.L = eVar;
    }

    public m X(TimeInterpolator timeInterpolator) {
        this.f3399k = timeInterpolator;
        return this;
    }

    public void Y(g gVar) {
        if (gVar == null) {
            this.N = f3394f;
        } else {
            this.N = gVar;
        }
    }

    public void Z(p pVar) {
    }

    public m a(f fVar) {
        if (this.I == null) {
            this.I = new ArrayList<>();
        }
        this.I.add(fVar);
        return this;
    }

    public m a0(long j2) {
        this.f3397i = j2;
        return this;
    }

    public m b(View view) {
        this.f3401m.add(view);
        return this;
    }

    protected void c0() {
        if (this.F == 0) {
            ArrayList<f> arrayList = this.I;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.I.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((f) arrayList2.get(i2)).a(this);
                }
            }
            this.H = false;
        }
        this.F++;
    }

    protected void cancel() {
        for (int size = this.E.size() - 1; size >= 0; size--) {
            this.E.get(size).cancel();
        }
        ArrayList<f> arrayList = this.I;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.I.clone();
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((f) arrayList2.get(i2)).d(this);
        }
    }

    String d0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f3398j != -1) {
            str2 = str2 + "dur(" + this.f3398j + ") ";
        }
        if (this.f3397i != -1) {
            str2 = str2 + "dly(" + this.f3397i + ") ";
        }
        if (this.f3399k != null) {
            str2 = str2 + "interp(" + this.f3399k + ") ";
        }
        if (this.f3400l.size() <= 0 && this.f3401m.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f3400l.size() > 0) {
            for (int i2 = 0; i2 < this.f3400l.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f3400l.get(i2);
            }
        }
        if (this.f3401m.size() > 0) {
            for (int i3 = 0; i3 < this.f3401m.size(); i3++) {
                if (i3 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f3401m.get(i3);
            }
        }
        return str3 + ")";
    }

    protected void f(Animator animator) {
        if (animator == null) {
            p();
            return;
        }
        if (q() >= 0) {
            animator.setDuration(q());
        }
        if (y() >= 0) {
            animator.setStartDelay(y() + animator.getStartDelay());
        }
        if (s() != null) {
            animator.setInterpolator(s());
        }
        animator.addListener(new c());
        animator.start();
    }

    public abstract void g(s sVar);

    void i(s sVar) {
        if (this.K != null && !sVar.a.isEmpty()) {
            throw null;
        }
    }

    public abstract void j(s sVar);

    void k(ViewGroup viewGroup, boolean z) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        c.e.a<String, String> aVar;
        l(z);
        if ((this.f3400l.size() > 0 || this.f3401m.size() > 0) && (((arrayList = this.n) == null || arrayList.isEmpty()) && ((arrayList2 = this.o) == null || arrayList2.isEmpty()))) {
            for (int i2 = 0; i2 < this.f3400l.size(); i2++) {
                View viewFindViewById = viewGroup.findViewById(this.f3400l.get(i2).intValue());
                if (viewFindViewById != null) {
                    s sVar = new s(viewFindViewById);
                    if (z) {
                        j(sVar);
                    } else {
                        g(sVar);
                    }
                    sVar.f3416c.add(this);
                    i(sVar);
                    if (z) {
                        e(this.w, viewFindViewById, sVar);
                    } else {
                        e(this.x, viewFindViewById, sVar);
                    }
                }
            }
            for (int i3 = 0; i3 < this.f3401m.size(); i3++) {
                View view = this.f3401m.get(i3);
                s sVar2 = new s(view);
                if (z) {
                    j(sVar2);
                } else {
                    g(sVar2);
                }
                sVar2.f3416c.add(this);
                i(sVar2);
                if (z) {
                    e(this.w, view, sVar2);
                } else {
                    e(this.x, view, sVar2);
                }
            }
        } else {
            h(viewGroup, z);
        }
        if (z || (aVar = this.M) == null) {
            return;
        }
        int size = aVar.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            arrayList3.add(this.w.f3419d.remove(this.M.i(i4)));
        }
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = (View) arrayList3.get(i5);
            if (view2 != null) {
                this.w.f3419d.put(this.M.m(i5), view2);
            }
        }
    }

    void l(boolean z) {
        if (z) {
            this.w.a.clear();
            this.w.f3417b.clear();
            this.w.f3418c.b();
        } else {
            this.x.a.clear();
            this.x.f3417b.clear();
            this.x.f3418c.b();
        }
    }

    @Override // 
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public m clone() {
        try {
            m mVar = (m) super.clone();
            mVar.J = new ArrayList<>();
            mVar.w = new t();
            mVar.x = new t();
            mVar.A = null;
            mVar.B = null;
            return mVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator n(ViewGroup viewGroup, s sVar, s sVar2) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void o(android.view.ViewGroup r20, c.s.t r21, c.s.t r22, java.util.ArrayList<c.s.s> r23, java.util.ArrayList<c.s.s> r24) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.s.m.o(android.view.ViewGroup, c.s.t, c.s.t, java.util.ArrayList, java.util.ArrayList):void");
    }

    protected void p() {
        int i2 = this.F - 1;
        this.F = i2;
        if (i2 == 0) {
            ArrayList<f> arrayList = this.I;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.I.clone();
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((f) arrayList2.get(i3)).c(this);
                }
            }
            for (int i4 = 0; i4 < this.w.f3418c.m(); i4++) {
                View viewN = this.w.f3418c.n(i4);
                if (viewN != null) {
                    c.h.l.t.t0(viewN, false);
                }
            }
            for (int i5 = 0; i5 < this.x.f3418c.m(); i5++) {
                View viewN2 = this.x.f3418c.n(i5);
                if (viewN2 != null) {
                    c.h.l.t.t0(viewN2, false);
                }
            }
            this.H = true;
        }
    }

    public long q() {
        return this.f3398j;
    }

    public e r() {
        return this.L;
    }

    public TimeInterpolator s() {
        return this.f3399k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002e, code lost:
    
        if (r3 < 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0030, code lost:
    
        if (r8 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
    
        r7 = r6.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
    
        r7 = r6.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
    
        return r7.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    c.s.s t(android.view.View r7, boolean r8) {
        /*
            r6 = this;
            c.s.q r0 = r6.y
            if (r0 == 0) goto L9
            c.s.s r7 = r0.t(r7, r8)
            return r7
        L9:
            if (r8 == 0) goto Le
            java.util.ArrayList<c.s.s> r0 = r6.A
            goto L10
        Le:
            java.util.ArrayList<c.s.s> r0 = r6.B
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = -1
            r4 = 0
        L1a:
            if (r4 >= r2) goto L2e
            java.lang.Object r5 = r0.get(r4)
            c.s.s r5 = (c.s.s) r5
            if (r5 != 0) goto L25
            return r1
        L25:
            android.view.View r5 = r5.f3415b
            if (r5 != r7) goto L2b
            r3 = r4
            goto L2e
        L2b:
            int r4 = r4 + 1
            goto L1a
        L2e:
            if (r3 < 0) goto L3e
            if (r8 == 0) goto L35
            java.util.ArrayList<c.s.s> r7 = r6.B
            goto L37
        L35:
            java.util.ArrayList<c.s.s> r7 = r6.A
        L37:
            java.lang.Object r7 = r7.get(r3)
            r1 = r7
            c.s.s r1 = (c.s.s) r1
        L3e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.s.m.t(android.view.View, boolean):c.s.s");
    }

    public String toString() {
        return d0("");
    }

    public String u() {
        return this.f3396h;
    }

    public g v() {
        return this.N;
    }

    public p w() {
        return this.K;
    }

    public long y() {
        return this.f3397i;
    }

    public List<Integer> z() {
        return this.f3400l;
    }
}