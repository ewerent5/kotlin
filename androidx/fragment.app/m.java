package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Configuration;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.v;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.g;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FragmentManager.java */
/* loaded from: classes.dex */
public abstract class m {
    private static boolean a = false;
    private ArrayList<androidx.fragment.app.a> A;
    private ArrayList<Boolean> B;
    private ArrayList<Fragment> C;
    private ArrayList<j> D;
    private p E;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1037c;

    /* renamed from: e, reason: collision with root package name */
    ArrayList<androidx.fragment.app.a> f1039e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<Fragment> f1040f;

    /* renamed from: h, reason: collision with root package name */
    private OnBackPressedDispatcher f1042h;

    /* renamed from: k, reason: collision with root package name */
    private ArrayList<g> f1045k;
    androidx.fragment.app.j<?> p;
    androidx.fragment.app.f q;
    private Fragment r;
    Fragment s;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<h> f1036b = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private final t f1038d = new t();

    /* renamed from: g, reason: collision with root package name */
    private final k f1041g = new k(this);

    /* renamed from: i, reason: collision with root package name */
    private final androidx.activity.b f1043i = new a(false);

    /* renamed from: j, reason: collision with root package name */
    private final AtomicInteger f1044j = new AtomicInteger();

    /* renamed from: l, reason: collision with root package name */
    private ConcurrentHashMap<Fragment, HashSet<c.h.h.a>> f1046l = new ConcurrentHashMap<>();

    /* renamed from: m, reason: collision with root package name */
    private final v.g f1047m = new b();
    private final l n = new l(this);
    int o = -1;
    private androidx.fragment.app.i t = null;
    private androidx.fragment.app.i u = new c();
    private Runnable F = new d();

    /* compiled from: FragmentManager.java */
    class a extends androidx.activity.b {
        a(boolean z) {
            super(z);
        }

        @Override // androidx.activity.b
        public void b() {
            m.this.m0();
        }
    }

    /* compiled from: FragmentManager.java */
    class b implements v.g {
        b() {
        }

        @Override // androidx.fragment.app.v.g
        public void a(Fragment fragment, c.h.h.a aVar) {
            if (aVar.b()) {
                return;
            }
            m.this.J0(fragment, aVar);
        }

        @Override // androidx.fragment.app.v.g
        public void b(Fragment fragment, c.h.h.a aVar) {
            m.this.c(fragment, aVar);
        }
    }

    /* compiled from: FragmentManager.java */
    class c extends androidx.fragment.app.i {
        c() {
        }

        @Override // androidx.fragment.app.i
        public Fragment a(ClassLoader classLoader, String str) {
            androidx.fragment.app.j<?> jVar = m.this.p;
            return jVar.a(jVar.e(), str, null);
        }
    }

    /* compiled from: FragmentManager.java */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m.this.Q(true);
        }
    }

    /* compiled from: FragmentManager.java */
    class e extends AnimatorListenerAdapter {
        final /* synthetic */ ViewGroup a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f1051b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f1052c;

        e(ViewGroup viewGroup, View view, Fragment fragment) {
            this.a = viewGroup;
            this.f1051b = view;
            this.f1052c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.endViewTransition(this.f1051b);
            animator.removeListener(this);
            Fragment fragment = this.f1052c;
            View view = fragment.L;
            if (view == null || !fragment.D) {
                return;
            }
            view.setVisibility(8);
        }
    }

    /* compiled from: FragmentManager.java */
    public static abstract class f {
    }

    /* compiled from: FragmentManager.java */
    public interface g {
        void a();
    }

    /* compiled from: FragmentManager.java */
    interface h {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* compiled from: FragmentManager.java */
    private class i implements h {
        final String a;

        /* renamed from: b, reason: collision with root package name */
        final int f1054b;

        /* renamed from: c, reason: collision with root package name */
        final int f1055c;

        i(String str, int i2, int i3) {
            this.a = str;
            this.f1054b = i2;
            this.f1055c = i3;
        }

        @Override // androidx.fragment.app.m.h
        public boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = m.this.s;
            if (fragment == null || this.f1054b >= 0 || this.a != null || !fragment.p0().F0()) {
                return m.this.H0(arrayList, arrayList2, this.a, this.f1054b, this.f1055c);
            }
            return false;
        }
    }

    /* compiled from: FragmentManager.java */
    static class j implements Fragment.f {
        final boolean a;

        /* renamed from: b, reason: collision with root package name */
        final androidx.fragment.app.a f1057b;

        /* renamed from: c, reason: collision with root package name */
        private int f1058c;

        j(androidx.fragment.app.a aVar, boolean z) {
            this.a = z;
            this.f1057b = aVar;
        }

        @Override // androidx.fragment.app.Fragment.f
        public void a() {
            this.f1058c++;
        }

        @Override // androidx.fragment.app.Fragment.f
        public void b() {
            int i2 = this.f1058c - 1;
            this.f1058c = i2;
            if (i2 != 0) {
                return;
            }
            this.f1057b.t.R0();
        }

        void c() {
            androidx.fragment.app.a aVar = this.f1057b;
            aVar.t.n(aVar, this.a, false, false);
        }

        void d() {
            boolean z = this.f1058c > 0;
            for (Fragment fragment : this.f1057b.t.f0()) {
                fragment.y2(null);
                if (z && fragment.Z0()) {
                    fragment.H2();
                }
            }
            androidx.fragment.app.a aVar = this.f1057b;
            aVar.t.n(aVar, this.a, !z, true);
        }

        public boolean e() {
            return this.f1058c == 0;
        }
    }

    private void C(Fragment fragment) {
        if (fragment == null || !fragment.equals(V(fragment.f977j))) {
            return;
        }
        fragment.e2();
    }

    private boolean G0(String str, int i2, int i3) {
        Q(false);
        P(true);
        Fragment fragment = this.s;
        if (fragment != null && i2 < 0 && str == null && fragment.p0().F0()) {
            return true;
        }
        boolean zH0 = H0(this.A, this.B, str, i2, i3);
        if (zH0) {
            this.f1037c = true;
            try {
                L0(this.A, this.B);
            } finally {
                m();
            }
        }
        Y0();
        L();
        this.f1038d.b();
        return zH0;
    }

    private int I0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, c.e.b<Fragment> bVar) {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            androidx.fragment.app.a aVar = arrayList.get(i5);
            boolean zBooleanValue = arrayList2.get(i5).booleanValue();
            if (aVar.I() && !aVar.G(arrayList, i5 + 1, i3)) {
                if (this.D == null) {
                    this.D = new ArrayList<>();
                }
                j jVar = new j(aVar, zBooleanValue);
                this.D.add(jVar);
                aVar.K(jVar);
                if (zBooleanValue) {
                    aVar.B();
                } else {
                    aVar.C(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, aVar);
                }
                a(bVar);
            }
        }
        return i4;
    }

    private void J(int i2) {
        try {
            this.f1037c = true;
            this.f1038d.d(i2);
            y0(i2, false);
            this.f1037c = false;
            Q(true);
        } catch (Throwable th) {
            this.f1037c = false;
            throw th;
        }
    }

    private void L() {
        if (this.z) {
            this.z = false;
            X0();
        }
    }

    private void L0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        U(arrayList, arrayList2);
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!arrayList.get(i2).r) {
                if (i3 != i2) {
                    T(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).r) {
                        i3++;
                    }
                }
                T(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            T(arrayList, arrayList2, i3, size);
        }
    }

    private void N() {
        if (this.f1046l.isEmpty()) {
            return;
        }
        for (Fragment fragment : this.f1046l.keySet()) {
            j(fragment);
            A0(fragment, fragment.K0());
        }
    }

    private void N0() {
        if (this.f1045k != null) {
            for (int i2 = 0; i2 < this.f1045k.size(); i2++) {
                this.f1045k.get(i2).a();
            }
        }
    }

    private void P(boolean z) {
        if (this.f1037c) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.p == null) {
            if (!this.y) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.p.f().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            l();
        }
        if (this.A == null) {
            this.A = new ArrayList<>();
            this.B = new ArrayList<>();
        }
        this.f1037c = true;
        try {
            U(null, null);
        } finally {
            this.f1037c = false;
        }
    }

    static int P0(int i2) {
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 != 4099) {
            return i2 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    private static void S(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            androidx.fragment.app.a aVar = arrayList.get(i2);
            if (arrayList2.get(i2).booleanValue()) {
                aVar.x(-1);
                aVar.C(i2 == i3 + (-1));
            } else {
                aVar.x(1);
                aVar.B();
            }
            i2++;
        }
    }

    private void T(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        int i4;
        int i5 = i2;
        boolean z = arrayList.get(i5).r;
        ArrayList<Fragment> arrayList3 = this.C;
        if (arrayList3 == null) {
            this.C = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.C.addAll(this.f1038d.m());
        Fragment fragmentJ0 = j0();
        boolean z2 = false;
        for (int i6 = i5; i6 < i3; i6++) {
            androidx.fragment.app.a aVar = arrayList.get(i6);
            fragmentJ0 = !arrayList2.get(i6).booleanValue() ? aVar.D(this.C, fragmentJ0) : aVar.L(this.C, fragmentJ0);
            z2 = z2 || aVar.f1095i;
        }
        this.C.clear();
        if (!z) {
            v.B(this, arrayList, arrayList2, i2, i3, false, this.f1047m);
        }
        S(arrayList, arrayList2, i2, i3);
        if (z) {
            c.e.b<Fragment> bVar = new c.e.b<>();
            a(bVar);
            int iI0 = I0(arrayList, arrayList2, i2, i3, bVar);
            w0(bVar);
            i4 = iI0;
        } else {
            i4 = i3;
        }
        if (i4 != i5 && z) {
            v.B(this, arrayList, arrayList2, i2, i4, true, this.f1047m);
            y0(this.o, true);
        }
        while (i5 < i3) {
            androidx.fragment.app.a aVar2 = arrayList.get(i5);
            if (arrayList2.get(i5).booleanValue() && aVar2.v >= 0) {
                aVar2.v = -1;
            }
            aVar2.J();
            i5++;
        }
        if (z2) {
            N0();
        }
    }

    private void U(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        int iIndexOf;
        int iIndexOf2;
        ArrayList<j> arrayList3 = this.D;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            j jVar = this.D.get(i2);
            if (arrayList != null && !jVar.a && (iIndexOf2 = arrayList.indexOf(jVar.f1057b)) != -1 && arrayList2 != null && arrayList2.get(iIndexOf2).booleanValue()) {
                this.D.remove(i2);
                i2--;
                size--;
                jVar.c();
            } else if (jVar.e() || (arrayList != null && jVar.f1057b.G(arrayList, 0, arrayList.size()))) {
                this.D.remove(i2);
                i2--;
                size--;
                if (arrayList == null || jVar.a || (iIndexOf = arrayList.indexOf(jVar.f1057b)) == -1 || arrayList2 == null || !arrayList2.get(iIndexOf).booleanValue()) {
                    jVar.d();
                } else {
                    jVar.c();
                }
            }
            i2++;
        }
    }

    private void V0(Fragment fragment) {
        ViewGroup viewGroupD0 = d0(fragment);
        if (viewGroupD0 != null) {
            int i2 = c.l.b.f3252b;
            if (viewGroupD0.getTag(i2) == null) {
                viewGroupD0.setTag(i2, fragment);
            }
            ((Fragment) viewGroupD0.getTag(i2)).w2(fragment.A0());
        }
    }

    private void X0() {
        for (Fragment fragment : this.f1038d.k()) {
            if (fragment != null) {
                C0(fragment);
            }
        }
    }

    private void Y0() {
        synchronized (this.f1036b) {
            if (this.f1036b.isEmpty()) {
                this.f1043i.f(b0() > 0 && r0(this.r));
            } else {
                this.f1043i.f(true);
            }
        }
    }

    private void Z() {
        if (this.D != null) {
            while (!this.D.isEmpty()) {
                this.D.remove(0).d();
            }
        }
    }

    private void a(c.e.b<Fragment> bVar) {
        int i2 = this.o;
        if (i2 < 1) {
            return;
        }
        int iMin = Math.min(i2, 3);
        for (Fragment fragment : this.f1038d.m()) {
            if (fragment.f973f < iMin) {
                A0(fragment, iMin);
                if (fragment.L != null && !fragment.D && fragment.Q) {
                    bVar.add(fragment);
                }
            }
        }
    }

    private boolean a0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f1036b) {
            if (this.f1036b.isEmpty()) {
                return false;
            }
            int size = this.f1036b.size();
            boolean zA = false;
            for (int i2 = 0; i2 < size; i2++) {
                zA |= this.f1036b.get(i2).a(arrayList, arrayList2);
            }
            this.f1036b.clear();
            this.p.f().removeCallbacks(this.F);
            return zA;
        }
    }

    private p c0(Fragment fragment) {
        return this.E.i(fragment);
    }

    private ViewGroup d0(Fragment fragment) {
        if (fragment.B > 0 && this.q.c()) {
            View viewB = this.q.b(fragment.B);
            if (viewB instanceof ViewGroup) {
                return (ViewGroup) viewB;
            }
        }
        return null;
    }

    private void j(Fragment fragment) {
        HashSet hashSet = (HashSet) this.f1046l.get(fragment);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((c.h.h.a) it.next()).a();
            }
            hashSet.clear();
            p(fragment);
            this.f1046l.remove(fragment);
        }
    }

    static Fragment k0(View view) {
        Object tag = view.getTag(c.l.b.a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    private void l() {
        if (t0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void m() {
        this.f1037c = false;
        this.B.clear();
        this.A.clear();
    }

    private void o(Fragment fragment) {
        Animator animator;
        if (fragment.L != null) {
            e.d dVarB = androidx.fragment.app.e.b(this.p.e(), this.q, fragment, !fragment.D);
            if (dVarB == null || (animator = dVarB.f1019b) == null) {
                if (dVarB != null) {
                    fragment.L.startAnimation(dVarB.a);
                    dVarB.a.start();
                }
                fragment.L.setVisibility((!fragment.D || fragment.X0()) ? 0 : 8);
                if (fragment.X0()) {
                    fragment.u2(false);
                }
            } else {
                animator.setTarget(fragment.L);
                if (!fragment.D) {
                    fragment.L.setVisibility(0);
                } else if (fragment.X0()) {
                    fragment.u2(false);
                } else {
                    ViewGroup viewGroup = fragment.K;
                    View view = fragment.L;
                    viewGroup.startViewTransition(view);
                    dVarB.f1019b.addListener(new e(viewGroup, view, fragment));
                }
                dVarB.f1019b.start();
            }
        }
        if (fragment.p && q0(fragment)) {
            this.v = true;
        }
        fragment.R = false;
        fragment.v1(fragment.D);
    }

    private void p(Fragment fragment) {
        fragment.U1();
        this.n.n(fragment, false);
        fragment.K = null;
        fragment.L = null;
        fragment.X = null;
        fragment.Y.l(null);
        fragment.s = false;
    }

    static boolean p0(int i2) {
        return a || Log.isLoggable("FragmentManager", i2);
    }

    private boolean q0(Fragment fragment) {
        return (fragment.H && fragment.I) || fragment.y.k();
    }

    private void v0(s sVar) {
        Fragment fragmentI = sVar.i();
        if (this.f1038d.c(fragmentI.f977j)) {
            if (p0(2)) {
                Log.v("FragmentManager", "Removed fragment from active set " + fragmentI);
            }
            this.f1038d.o(sVar);
            M0(fragmentI);
        }
    }

    private void w0(c.e.b<Fragment> bVar) {
        int size = bVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragmentM = bVar.m(i2);
            if (!fragmentM.p) {
                View viewN2 = fragmentM.n2();
                fragmentM.S = viewN2.getAlpha();
                viewN2.setAlpha(0.0f);
            }
        }
    }

    boolean A(MenuItem menuItem) {
        if (this.o < 1) {
            return false;
        }
        for (Fragment fragment : this.f1038d.m()) {
            if (fragment != null && fragment.Z1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void A0(androidx.fragment.app.Fragment r13, int r14) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.m.A0(androidx.fragment.app.Fragment, int):void");
    }

    void B(Menu menu) {
        if (this.o < 1) {
            return;
        }
        for (Fragment fragment : this.f1038d.m()) {
            if (fragment != null) {
                fragment.a2(menu);
            }
        }
    }

    void B0() {
        if (this.p == null) {
            return;
        }
        this.w = false;
        this.x = false;
        for (Fragment fragment : this.f1038d.m()) {
            if (fragment != null) {
                fragment.e1();
            }
        }
    }

    void C0(Fragment fragment) {
        if (fragment.M) {
            if (this.f1037c) {
                this.z = true;
            } else {
                fragment.M = false;
                A0(fragment, this.o);
            }
        }
    }

    void D() {
        J(3);
    }

    public void D0(int i2, int i3) {
        if (i2 >= 0) {
            O(new i(null, i2, i3), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    void E(boolean z) {
        for (Fragment fragment : this.f1038d.m()) {
            if (fragment != null) {
                fragment.c2(z);
            }
        }
    }

    public void E0(String str, int i2) {
        O(new i(str, -1, i2), false);
    }

    boolean F(Menu menu) {
        boolean z = false;
        if (this.o < 1) {
            return false;
        }
        for (Fragment fragment : this.f1038d.m()) {
            if (fragment != null && fragment.d2(menu)) {
                z = true;
            }
        }
        return z;
    }

    public boolean F0() {
        return G0(null, -1, 0);
    }

    void G() {
        Y0();
        C(this.s);
    }

    void H() {
        this.w = false;
        this.x = false;
        J(4);
    }

    boolean H0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int i4;
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f1039e;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f1039e.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i2 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    androidx.fragment.app.a aVar = this.f1039e.get(size2);
                    if ((str != null && str.equals(aVar.E())) || (i2 >= 0 && i2 == aVar.v)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        androidx.fragment.app.a aVar2 = this.f1039e.get(size2);
                        if (str == null || !str.equals(aVar2.E())) {
                            if (i2 < 0 || i2 != aVar2.v) {
                                break;
                            }
                        }
                    }
                }
                i4 = size2;
            } else {
                i4 = -1;
            }
            if (i4 == this.f1039e.size() - 1) {
                return false;
            }
            for (int size3 = this.f1039e.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.f1039e.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    void I() {
        this.w = false;
        this.x = false;
        J(3);
    }

    void J0(Fragment fragment, c.h.h.a aVar) {
        HashSet hashSet = (HashSet) this.f1046l.get(fragment);
        if (hashSet != null && hashSet.remove(aVar) && hashSet.isEmpty()) {
            this.f1046l.remove(fragment);
            if (fragment.f973f < 3) {
                p(fragment);
                A0(fragment, fragment.K0());
            }
        }
    }

    void K() {
        this.x = true;
        J(2);
    }

    void K0(Fragment fragment) {
        if (p0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.v);
        }
        boolean z = !fragment.Y0();
        if (!fragment.E || z) {
            this.f1038d.p(fragment);
            if (q0(fragment)) {
                this.v = true;
            }
            fragment.q = true;
            V0(fragment);
        }
    }

    public void M(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f1038d.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f1040f;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                Fragment fragment = this.f1040f.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.f1039e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                androidx.fragment.app.a aVar = this.f1039e.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.z(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f1044j.get());
        synchronized (this.f1036b) {
            int size3 = this.f1036b.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size3; i4++) {
                    h hVar = this.f1036b.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(hVar);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.p);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.q);
        if (this.r != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.r);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.o);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.w);
        printWriter.print(" mStopped=");
        printWriter.print(this.x);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.y);
        if (this.v) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.v);
        }
    }

    void M0(Fragment fragment) {
        if (t0()) {
            if (p0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.E.n(fragment) && p0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    void O(h hVar, boolean z) {
        if (!z) {
            if (this.p == null) {
                if (!this.y) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            l();
        }
        synchronized (this.f1036b) {
            if (this.p == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f1036b.add(hVar);
                R0();
            }
        }
    }

    void O0(Parcelable parcelable) {
        s sVar;
        if (parcelable == null) {
            return;
        }
        o oVar = (o) parcelable;
        if (oVar.f1059e == null) {
            return;
        }
        this.f1038d.q();
        Iterator<r> it = oVar.f1059e.iterator();
        while (it.hasNext()) {
            r next = it.next();
            if (next != null) {
                Fragment fragmentH = this.E.h(next.f1077f);
                if (fragmentH != null) {
                    if (p0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragmentH);
                    }
                    sVar = new s(this.n, fragmentH, next);
                } else {
                    sVar = new s(this.n, this.p.e().getClassLoader(), e0(), next);
                }
                Fragment fragmentI = sVar.i();
                fragmentI.w = this;
                if (p0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragmentI.f977j + "): " + fragmentI);
                }
                sVar.k(this.p.e().getClassLoader());
                this.f1038d.n(sVar);
                sVar.q(this.o);
            }
        }
        for (Fragment fragment : this.E.k()) {
            if (!this.f1038d.c(fragment.f977j)) {
                if (p0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + oVar.f1059e);
                }
                A0(fragment, 1);
                fragment.q = true;
                A0(fragment, -1);
            }
        }
        this.f1038d.r(oVar.f1060f);
        if (oVar.f1061g != null) {
            this.f1039e = new ArrayList<>(oVar.f1061g.length);
            int i2 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = oVar.f1061g;
                if (i2 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.a aVarA = bVarArr[i2].a(this);
                if (p0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + aVarA.v + "): " + aVarA);
                    PrintWriter printWriter = new PrintWriter(new c.h.k.b("FragmentManager"));
                    aVarA.A("  ", printWriter, false);
                    printWriter.close();
                }
                this.f1039e.add(aVarA);
                i2++;
            }
        } else {
            this.f1039e = null;
        }
        this.f1044j.set(oVar.f1062h);
        String str = oVar.f1063i;
        if (str != null) {
            Fragment fragmentV = V(str);
            this.s = fragmentV;
            C(fragmentV);
        }
    }

    boolean Q(boolean z) {
        P(z);
        boolean z2 = false;
        while (a0(this.A, this.B)) {
            this.f1037c = true;
            try {
                L0(this.A, this.B);
                m();
                z2 = true;
            } catch (Throwable th) {
                m();
                throw th;
            }
        }
        Y0();
        L();
        this.f1038d.b();
        return z2;
    }

    Parcelable Q0() {
        int size;
        Z();
        N();
        Q(true);
        this.w = true;
        ArrayList<r> arrayListS = this.f1038d.s();
        androidx.fragment.app.b[] bVarArr = null;
        if (arrayListS.isEmpty()) {
            if (p0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> arrayListT = this.f1038d.t();
        ArrayList<androidx.fragment.app.a> arrayList = this.f1039e;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            bVarArr = new androidx.fragment.app.b[size];
            for (int i2 = 0; i2 < size; i2++) {
                bVarArr[i2] = new androidx.fragment.app.b(this.f1039e.get(i2));
                if (p0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.f1039e.get(i2));
                }
            }
        }
        o oVar = new o();
        oVar.f1059e = arrayListS;
        oVar.f1060f = arrayListT;
        oVar.f1061g = bVarArr;
        oVar.f1062h = this.f1044j.get();
        Fragment fragment = this.s;
        if (fragment != null) {
            oVar.f1063i = fragment.f977j;
        }
        return oVar;
    }

    void R(h hVar, boolean z) {
        if (z && (this.p == null || this.y)) {
            return;
        }
        P(z);
        if (hVar.a(this.A, this.B)) {
            this.f1037c = true;
            try {
                L0(this.A, this.B);
            } finally {
                m();
            }
        }
        Y0();
        L();
        this.f1038d.b();
    }

    void R0() {
        synchronized (this.f1036b) {
            ArrayList<j> arrayList = this.D;
            boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
            boolean z2 = this.f1036b.size() == 1;
            if (z || z2) {
                this.p.f().removeCallbacks(this.F);
                this.p.f().post(this.F);
                Y0();
            }
        }
    }

    void S0(Fragment fragment, boolean z) {
        ViewGroup viewGroupD0 = d0(fragment);
        if (viewGroupD0 == null || !(viewGroupD0 instanceof androidx.fragment.app.g)) {
            return;
        }
        ((androidx.fragment.app.g) viewGroupD0).setDrawDisappearingViewsLast(!z);
    }

    void T0(Fragment fragment, g.c cVar) {
        if (fragment.equals(V(fragment.f977j)) && (fragment.x == null || fragment.w == this)) {
            fragment.V = cVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    void U0(Fragment fragment) {
        if (fragment == null || (fragment.equals(V(fragment.f977j)) && (fragment.x == null || fragment.w == this))) {
            Fragment fragment2 = this.s;
            this.s = fragment;
            C(fragment2);
            C(this.s);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    Fragment V(String str) {
        return this.f1038d.f(str);
    }

    public Fragment W(int i2) {
        return this.f1038d.g(i2);
    }

    void W0(Fragment fragment) {
        if (p0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.D) {
            fragment.D = false;
            fragment.R = !fragment.R;
        }
    }

    public Fragment X(String str) {
        return this.f1038d.h(str);
    }

    Fragment Y(String str) {
        return this.f1038d.i(str);
    }

    void b(androidx.fragment.app.a aVar) {
        if (this.f1039e == null) {
            this.f1039e = new ArrayList<>();
        }
        this.f1039e.add(aVar);
    }

    public int b0() {
        ArrayList<androidx.fragment.app.a> arrayList = this.f1039e;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    void c(Fragment fragment, c.h.h.a aVar) {
        if (this.f1046l.get(fragment) == null) {
            this.f1046l.put(fragment, new HashSet());
        }
        ((HashSet) this.f1046l.get(fragment)).add(aVar);
    }

    void d(Fragment fragment) {
        if (p0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        u0(fragment);
        if (fragment.E) {
            return;
        }
        this.f1038d.a(fragment);
        fragment.q = false;
        if (fragment.L == null) {
            fragment.R = false;
        }
        if (q0(fragment)) {
            this.v = true;
        }
    }

    void e(Fragment fragment) {
        if (t0()) {
            if (p0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.E.f(fragment) && p0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    public androidx.fragment.app.i e0() {
        androidx.fragment.app.i iVar = this.t;
        if (iVar != null) {
            return iVar;
        }
        Fragment fragment = this.r;
        return fragment != null ? fragment.w.e0() : this.u;
    }

    int f() {
        return this.f1044j.getAndIncrement();
    }

    public List<Fragment> f0() {
        return this.f1038d.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    void g(androidx.fragment.app.j<?> jVar, androidx.fragment.app.f fVar, Fragment fragment) {
        if (this.p != null) {
            throw new IllegalStateException("Already attached");
        }
        this.p = jVar;
        this.q = fVar;
        this.r = fragment;
        if (fragment != null) {
            Y0();
        }
        if (jVar instanceof androidx.activity.c) {
            androidx.activity.c cVar = (androidx.activity.c) jVar;
            OnBackPressedDispatcher onBackPressedDispatcherK = cVar.k();
            this.f1042h = onBackPressedDispatcherK;
            androidx.lifecycle.k kVar = cVar;
            if (fragment != null) {
                kVar = fragment;
            }
            onBackPressedDispatcherK.a(kVar, this.f1043i);
        }
        if (fragment != null) {
            this.E = fragment.w.c0(fragment);
        } else if (jVar instanceof b0) {
            this.E = p.j(((b0) jVar).D());
        } else {
            this.E = new p(false);
        }
    }

    LayoutInflater.Factory2 g0() {
        return this.f1041g;
    }

    void h(Fragment fragment) {
        if (p0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.E) {
            fragment.E = false;
            if (fragment.p) {
                return;
            }
            this.f1038d.a(fragment);
            if (p0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (q0(fragment)) {
                this.v = true;
            }
        }
    }

    l h0() {
        return this.n;
    }

    public u i() {
        return new androidx.fragment.app.a(this);
    }

    Fragment i0() {
        return this.r;
    }

    public Fragment j0() {
        return this.s;
    }

    boolean k() {
        boolean zQ0 = false;
        for (Fragment fragment : this.f1038d.k()) {
            if (fragment != null) {
                zQ0 = q0(fragment);
            }
            if (zQ0) {
                return true;
            }
        }
        return false;
    }

    a0 l0(Fragment fragment) {
        return this.E.l(fragment);
    }

    void m0() {
        Q(true);
        if (this.f1043i.c()) {
            F0();
        } else {
            this.f1042h.c();
        }
    }

    void n(androidx.fragment.app.a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.C(z3);
        } else {
            aVar.B();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            v.B(this, arrayList, arrayList2, 0, 1, true, this.f1047m);
        }
        if (z3) {
            y0(this.o, true);
        }
        for (Fragment fragment : this.f1038d.k()) {
            if (fragment != null && fragment.L != null && fragment.Q && aVar.F(fragment.B)) {
                float f2 = fragment.S;
                if (f2 > 0.0f) {
                    fragment.L.setAlpha(f2);
                }
                if (z3) {
                    fragment.S = 0.0f;
                } else {
                    fragment.S = -1.0f;
                    fragment.Q = false;
                }
            }
        }
    }

    void n0(Fragment fragment) {
        if (p0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.D) {
            return;
        }
        fragment.D = true;
        fragment.R = true ^ fragment.R;
        V0(fragment);
    }

    public boolean o0() {
        return this.y;
    }

    void q(Fragment fragment) {
        if (p0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.E) {
            return;
        }
        fragment.E = true;
        if (fragment.p) {
            if (p0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f1038d.p(fragment);
            if (q0(fragment)) {
                this.v = true;
            }
            V0(fragment);
        }
    }

    void r() {
        this.w = false;
        this.x = false;
        J(2);
    }

    boolean r0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        m mVar = fragment.w;
        return fragment.equals(mVar.j0()) && r0(mVar.r);
    }

    void s(Configuration configuration) {
        for (Fragment fragment : this.f1038d.m()) {
            if (fragment != null) {
                fragment.O1(configuration);
            }
        }
    }

    boolean s0(int i2) {
        return this.o >= i2;
    }

    boolean t(MenuItem menuItem) {
        if (this.o < 1) {
            return false;
        }
        for (Fragment fragment : this.f1038d.m()) {
            if (fragment != null && fragment.P1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean t0() {
        return this.w || this.x;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.r;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.r)));
            sb.append("}");
        } else {
            androidx.fragment.app.j<?> jVar = this.p;
            if (jVar != null) {
                sb.append(jVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.p)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    void u() {
        this.w = false;
        this.x = false;
        J(1);
    }

    void u0(Fragment fragment) {
        if (this.f1038d.c(fragment.f977j)) {
            return;
        }
        s sVar = new s(this.n, fragment);
        sVar.k(this.p.e().getClassLoader());
        this.f1038d.n(sVar);
        if (fragment.G) {
            if (fragment.F) {
                e(fragment);
            } else {
                M0(fragment);
            }
            fragment.G = false;
        }
        sVar.q(this.o);
        if (p0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    boolean v(Menu menu, MenuInflater menuInflater) {
        if (this.o < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.f1038d.m()) {
            if (fragment != null && fragment.R1(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f1040f != null) {
            for (int i2 = 0; i2 < this.f1040f.size(); i2++) {
                Fragment fragment2 = this.f1040f.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.r1();
                }
            }
        }
        this.f1040f = arrayList;
        return z;
    }

    void w() {
        this.y = true;
        Q(true);
        N();
        J(-1);
        this.p = null;
        this.q = null;
        this.r = null;
        if (this.f1042h != null) {
            this.f1043i.d();
            this.f1042h = null;
        }
    }

    void x() {
        J(1);
    }

    void x0(Fragment fragment) {
        if (!this.f1038d.c(fragment.f977j)) {
            if (p0(3)) {
                Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.o + "since it is not added to " + this);
                return;
            }
            return;
        }
        z0(fragment);
        if (fragment.L != null) {
            Fragment fragmentJ = this.f1038d.j(fragment);
            if (fragmentJ != null) {
                View view = fragmentJ.L;
                ViewGroup viewGroup = fragment.K;
                int iIndexOfChild = viewGroup.indexOfChild(view);
                int iIndexOfChild2 = viewGroup.indexOfChild(fragment.L);
                if (iIndexOfChild2 < iIndexOfChild) {
                    viewGroup.removeViewAt(iIndexOfChild2);
                    viewGroup.addView(fragment.L, iIndexOfChild);
                }
            }
            if (fragment.Q && fragment.K != null) {
                float f2 = fragment.S;
                if (f2 > 0.0f) {
                    fragment.L.setAlpha(f2);
                }
                fragment.S = 0.0f;
                fragment.Q = false;
                e.d dVarB = androidx.fragment.app.e.b(this.p.e(), this.q, fragment, true);
                if (dVarB != null) {
                    Animation animation = dVarB.a;
                    if (animation != null) {
                        fragment.L.startAnimation(animation);
                    } else {
                        dVarB.f1019b.setTarget(fragment.L);
                        dVarB.f1019b.start();
                    }
                }
            }
        }
        if (fragment.R) {
            o(fragment);
        }
    }

    void y() {
        for (Fragment fragment : this.f1038d.m()) {
            if (fragment != null) {
                fragment.X1();
            }
        }
    }

    void y0(int i2, boolean z) {
        androidx.fragment.app.j<?> jVar;
        if (this.p == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i2 != this.o) {
            this.o = i2;
            Iterator<Fragment> it = this.f1038d.m().iterator();
            while (it.hasNext()) {
                x0(it.next());
            }
            for (Fragment fragment : this.f1038d.k()) {
                if (fragment != null && !fragment.Q) {
                    x0(fragment);
                }
            }
            X0();
            if (this.v && (jVar = this.p) != null && this.o == 4) {
                jVar.p();
                this.v = false;
            }
        }
    }

    void z(boolean z) {
        for (Fragment fragment : this.f1038d.m()) {
            if (fragment != null) {
                fragment.Y1(z);
            }
        }
    }

    void z0(Fragment fragment) {
        A0(fragment, this.o);
    }
}