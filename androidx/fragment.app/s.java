package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.b0;
import androidx.lifecycle.g;

/* compiled from: FragmentStateManager.java */
/* loaded from: classes.dex */
class s {
    private final l a;

    /* renamed from: b */
    private final Fragment f1085b;

    /* renamed from: c */
    private int f1086c = -1;

    /* compiled from: FragmentStateManager.java */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[g.c.values().length];
            a = iArr;
            try {
                iArr[g.c.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[g.c.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[g.c.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    s(l lVar, Fragment fragment) {
        this.a = lVar;
        this.f1085b = fragment;
    }

    private Bundle n() {
        Bundle bundle = new Bundle();
        this.f1085b.g2(bundle);
        this.a.j(this.f1085b, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f1085b.L != null) {
            p();
        }
        if (this.f1085b.f975h != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f1085b.f975h);
        }
        if (!this.f1085b.N) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f1085b.N);
        }
        return bundle;
    }

    void a() {
        if (m.p0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f1085b);
        }
        Fragment fragment = this.f1085b;
        fragment.M1(fragment.f974g);
        l lVar = this.a;
        Fragment fragment2 = this.f1085b;
        lVar.a(fragment2, fragment2.f974g, false);
    }

    void b(j<?> jVar, m mVar, Fragment fragment) {
        Fragment fragment2 = this.f1085b;
        fragment2.x = jVar;
        fragment2.z = fragment;
        fragment2.w = mVar;
        this.a.g(fragment2, jVar.e(), false);
        this.f1085b.N1();
        Fragment fragment3 = this.f1085b;
        Fragment fragment4 = fragment3.z;
        if (fragment4 == null) {
            jVar.g(fragment3);
        } else {
            fragment4.j1(fragment3);
        }
        this.a.b(this.f1085b, jVar.e(), false);
    }

    int c() {
        int iMin = this.f1086c;
        Fragment fragment = this.f1085b;
        if (fragment.r) {
            iMin = fragment.s ? Math.max(iMin, 1) : iMin < 2 ? Math.min(iMin, fragment.f973f) : Math.min(iMin, 1);
        }
        if (!this.f1085b.p) {
            iMin = Math.min(iMin, 1);
        }
        Fragment fragment2 = this.f1085b;
        if (fragment2.q) {
            iMin = fragment2.Y0() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        Fragment fragment3 = this.f1085b;
        if (fragment3.M && fragment3.f973f < 3) {
            iMin = Math.min(iMin, 2);
        }
        int i2 = a.a[this.f1085b.V.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? Math.min(iMin, -1) : Math.min(iMin, 1) : Math.min(iMin, 3) : iMin;
    }

    void d() {
        if (m.p0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f1085b);
        }
        Fragment fragment = this.f1085b;
        if (fragment.U) {
            fragment.o2(fragment.f974g);
            this.f1085b.f973f = 1;
            return;
        }
        this.a.h(fragment, fragment.f974g, false);
        Fragment fragment2 = this.f1085b;
        fragment2.Q1(fragment2.f974g);
        l lVar = this.a;
        Fragment fragment3 = this.f1085b;
        lVar.c(fragment3, fragment3.f974g, false);
    }

    void e(f fVar) {
        String resourceName;
        if (this.f1085b.r) {
            return;
        }
        if (m.p0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f1085b);
        }
        ViewGroup viewGroup = null;
        Fragment fragment = this.f1085b;
        ViewGroup viewGroup2 = fragment.K;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i2 = fragment.B;
            if (i2 != 0) {
                if (i2 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f1085b + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fVar.b(i2);
                if (viewGroup == null) {
                    Fragment fragment2 = this.f1085b;
                    if (!fragment2.t) {
                        try {
                            resourceName = fragment2.F0().getResourceName(this.f1085b.B);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f1085b.B) + " (" + resourceName + ") for fragment " + this.f1085b);
                    }
                }
            }
        }
        Fragment fragment3 = this.f1085b;
        fragment3.K = viewGroup;
        fragment3.S1(fragment3.W1(fragment3.f974g), viewGroup, this.f1085b.f974g);
        View view = this.f1085b.L;
        if (view != null) {
            boolean z = false;
            view.setSaveFromParentEnabled(false);
            Fragment fragment4 = this.f1085b;
            fragment4.L.setTag(c.l.b.a, fragment4);
            if (viewGroup != null) {
                viewGroup.addView(this.f1085b.L);
            }
            Fragment fragment5 = this.f1085b;
            if (fragment5.D) {
                fragment5.L.setVisibility(8);
            }
            c.h.l.t.h0(this.f1085b.L);
            Fragment fragment6 = this.f1085b;
            fragment6.K1(fragment6.L, fragment6.f974g);
            l lVar = this.a;
            Fragment fragment7 = this.f1085b;
            lVar.m(fragment7, fragment7.L, fragment7.f974g, false);
            Fragment fragment8 = this.f1085b;
            if (fragment8.L.getVisibility() == 0 && this.f1085b.K != null) {
                z = true;
            }
            fragment8.Q = z;
        }
    }

    void f(j<?> jVar, p pVar) {
        if (m.p0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f1085b);
        }
        Fragment fragment = this.f1085b;
        boolean zIsChangingConfigurations = true;
        boolean z = fragment.q && !fragment.Y0();
        if (!(z || pVar.o(this.f1085b))) {
            this.f1085b.f973f = 0;
            return;
        }
        if (jVar instanceof b0) {
            zIsChangingConfigurations = pVar.m();
        } else if (jVar.e() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) jVar.e()).isChangingConfigurations();
        }
        if (z || zIsChangingConfigurations) {
            pVar.g(this.f1085b);
        }
        this.f1085b.T1();
        this.a.d(this.f1085b, false);
    }

    void g(p pVar) {
        if (m.p0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f1085b);
        }
        this.f1085b.V1();
        boolean z = false;
        this.a.e(this.f1085b, false);
        Fragment fragment = this.f1085b;
        fragment.f973f = -1;
        fragment.x = null;
        fragment.z = null;
        fragment.w = null;
        if (fragment.q && !fragment.Y0()) {
            z = true;
        }
        if (z || pVar.o(this.f1085b)) {
            if (m.p0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f1085b);
            }
            this.f1085b.T0();
        }
    }

    void h() {
        Fragment fragment = this.f1085b;
        if (fragment.r && fragment.s && !fragment.u) {
            if (m.p0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f1085b);
            }
            Fragment fragment2 = this.f1085b;
            fragment2.S1(fragment2.W1(fragment2.f974g), null, this.f1085b.f974g);
            View view = this.f1085b.L;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f1085b;
                fragment3.L.setTag(c.l.b.a, fragment3);
                Fragment fragment4 = this.f1085b;
                if (fragment4.D) {
                    fragment4.L.setVisibility(8);
                }
                Fragment fragment5 = this.f1085b;
                fragment5.K1(fragment5.L, fragment5.f974g);
                l lVar = this.a;
                Fragment fragment6 = this.f1085b;
                lVar.m(fragment6, fragment6.L, fragment6.f974g, false);
            }
        }
    }

    Fragment i() {
        return this.f1085b;
    }

    void j() {
        if (m.p0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f1085b);
        }
        this.f1085b.b2();
        this.a.f(this.f1085b, false);
    }

    void k(ClassLoader classLoader) {
        Bundle bundle = this.f1085b.f974g;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f1085b;
        fragment.f975h = fragment.f974g.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f1085b;
        fragment2.f980m = fragment2.f974g.getString("android:target_state");
        Fragment fragment3 = this.f1085b;
        if (fragment3.f980m != null) {
            fragment3.n = fragment3.f974g.getInt("android:target_req_state", 0);
        }
        Fragment fragment4 = this.f1085b;
        Boolean bool = fragment4.f976i;
        if (bool != null) {
            fragment4.N = bool.booleanValue();
            this.f1085b.f976i = null;
        } else {
            fragment4.N = fragment4.f974g.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment5 = this.f1085b;
        if (fragment5.N) {
            return;
        }
        fragment5.M = true;
    }

    void l() {
        if (m.p0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this.f1085b);
        }
        Fragment fragment = this.f1085b;
        if (fragment.L != null) {
            fragment.p2(fragment.f974g);
        }
        this.f1085b.f974g = null;
    }

    void m() {
        if (m.p0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f1085b);
        }
        this.f1085b.f2();
        this.a.i(this.f1085b, false);
        Fragment fragment = this.f1085b;
        fragment.f974g = null;
        fragment.f975h = null;
    }

    r o() {
        r rVar = new r(this.f1085b);
        Fragment fragment = this.f1085b;
        if (fragment.f973f <= -1 || rVar.q != null) {
            rVar.q = fragment.f974g;
        } else {
            Bundle bundleN = n();
            rVar.q = bundleN;
            if (this.f1085b.f980m != null) {
                if (bundleN == null) {
                    rVar.q = new Bundle();
                }
                rVar.q.putString("android:target_state", this.f1085b.f980m);
                int i2 = this.f1085b.n;
                if (i2 != 0) {
                    rVar.q.putInt("android:target_req_state", i2);
                }
            }
        }
        return rVar;
    }

    void p() {
        if (this.f1085b.L == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f1085b.L.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f1085b.f975h = sparseArray;
        }
    }

    void q(int i2) {
        this.f1086c = i2;
    }

    void r() {
        if (m.p0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f1085b);
        }
        this.f1085b.h2();
        this.a.k(this.f1085b, false);
    }

    void s() {
        if (m.p0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f1085b);
        }
        this.f1085b.i2();
        this.a.l(this.f1085b, false);
    }

    s(l lVar, ClassLoader classLoader, i iVar, r rVar) {
        this.a = lVar;
        Fragment fragmentA = iVar.a(classLoader, rVar.f1076e);
        this.f1085b = fragmentA;
        Bundle bundle = rVar.n;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        fragmentA.s2(rVar.n);
        fragmentA.f977j = rVar.f1077f;
        fragmentA.r = rVar.f1078g;
        fragmentA.t = true;
        fragmentA.A = rVar.f1079h;
        fragmentA.B = rVar.f1080i;
        fragmentA.C = rVar.f1081j;
        fragmentA.F = rVar.f1082k;
        fragmentA.q = rVar.f1083l;
        fragmentA.E = rVar.f1084m;
        fragmentA.D = rVar.o;
        fragmentA.V = g.c.values()[rVar.p];
        Bundle bundle2 = rVar.q;
        if (bundle2 != null) {
            fragmentA.f974g = bundle2;
        } else {
            fragmentA.f974g = new Bundle();
        }
        if (m.p0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragmentA);
        }
    }

    s(l lVar, Fragment fragment, r rVar) {
        this.a = lVar;
        this.f1085b = fragment;
        fragment.f975h = null;
        fragment.v = 0;
        fragment.s = false;
        fragment.p = false;
        Fragment fragment2 = fragment.f979l;
        fragment.f980m = fragment2 != null ? fragment2.f977j : null;
        fragment.f979l = null;
        Bundle bundle = rVar.q;
        if (bundle != null) {
            fragment.f974g = bundle;
        } else {
            fragment.f974g = new Bundle();
        }
    }
}