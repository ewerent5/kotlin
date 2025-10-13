package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.g;
import androidx.savedstate.SavedStateRegistry;
import ch.qos.logback.core.CoreConstants;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.k, b0, androidx.savedstate.b {

    /* renamed from: e, reason: collision with root package name */
    static final Object f972e = new Object();
    int A;
    int B;
    String C;
    boolean D;
    boolean E;
    boolean F;
    boolean G;
    boolean H;
    boolean I;
    private boolean J;
    ViewGroup K;
    View L;
    boolean M;
    boolean N;
    d O;
    Runnable P;
    boolean Q;
    boolean R;
    float S;
    LayoutInflater T;
    boolean U;
    g.c V;
    androidx.lifecycle.l W;
    y X;
    androidx.lifecycle.q<androidx.lifecycle.k> Y;
    androidx.savedstate.a Z;
    private int a0;

    /* renamed from: f, reason: collision with root package name */
    int f973f;

    /* renamed from: g, reason: collision with root package name */
    Bundle f974g;

    /* renamed from: h, reason: collision with root package name */
    SparseArray<Parcelable> f975h;

    /* renamed from: i, reason: collision with root package name */
    Boolean f976i;

    /* renamed from: j, reason: collision with root package name */
    String f977j;

    /* renamed from: k, reason: collision with root package name */
    Bundle f978k;

    /* renamed from: l, reason: collision with root package name */
    Fragment f979l;

    /* renamed from: m, reason: collision with root package name */
    String f980m;
    int n;
    private Boolean o;
    boolean p;
    boolean q;
    boolean r;
    boolean s;
    boolean t;
    boolean u;
    int v;
    m w;
    j<?> x;
    m y;
    Fragment z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.H2();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.f0();
        }
    }

    class c extends androidx.fragment.app.f {
        c() {
        }

        @Override // androidx.fragment.app.f
        public View b(int i2) {
            View view = Fragment.this.L;
            if (view != null) {
                return view.findViewById(i2);
            }
            throw new IllegalStateException("Fragment " + this + " does not have a view");
        }

        @Override // androidx.fragment.app.f
        public boolean c() {
            return Fragment.this.L != null;
        }
    }

    static class d {
        View a;

        /* renamed from: b, reason: collision with root package name */
        Animator f984b;

        /* renamed from: c, reason: collision with root package name */
        int f985c;

        /* renamed from: d, reason: collision with root package name */
        int f986d;

        /* renamed from: e, reason: collision with root package name */
        int f987e;

        /* renamed from: f, reason: collision with root package name */
        Object f988f = null;

        /* renamed from: g, reason: collision with root package name */
        Object f989g;

        /* renamed from: h, reason: collision with root package name */
        Object f990h;

        /* renamed from: i, reason: collision with root package name */
        Object f991i;

        /* renamed from: j, reason: collision with root package name */
        Object f992j;

        /* renamed from: k, reason: collision with root package name */
        Object f993k;

        /* renamed from: l, reason: collision with root package name */
        Boolean f994l;

        /* renamed from: m, reason: collision with root package name */
        Boolean f995m;
        androidx.core.app.n n;
        androidx.core.app.n o;
        boolean p;
        f q;
        boolean r;

        d() {
            Object obj = Fragment.f972e;
            this.f989g = obj;
            this.f990h = null;
            this.f991i = obj;
            this.f992j = null;
            this.f993k = obj;
        }
    }

    public static class e extends RuntimeException {
        public e(String str, Exception exc) {
            super(str, exc);
        }
    }

    interface f {
        void a();

        void b();
    }

    public Fragment() {
        this.f973f = -1;
        this.f977j = UUID.randomUUID().toString();
        this.f980m = null;
        this.o = null;
        this.y = new n();
        this.I = true;
        this.N = true;
        this.P = new a();
        this.V = g.c.RESUMED;
        this.Y = new androidx.lifecycle.q<>();
        S0();
    }

    private void S0() {
        this.W = new androidx.lifecycle.l(this);
        this.Z = androidx.savedstate.a.a(this);
        if (Build.VERSION.SDK_INT >= 19) {
            this.W.a(new androidx.lifecycle.i() { // from class: androidx.fragment.app.Fragment.2
                @Override // androidx.lifecycle.i
                public void c(androidx.lifecycle.k kVar, g.b bVar) {
                    View view;
                    if (bVar != g.b.ON_STOP || (view = Fragment.this.L) == null) {
                        return;
                    }
                    view.cancelPendingInputEvents();
                }
            });
        }
    }

    @Deprecated
    public static Fragment U0(Context context, String str, Bundle bundle) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Fragment fragmentNewInstance = i.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragmentNewInstance.getClass().getClassLoader());
                fragmentNewInstance.s2(bundle);
            }
            return fragmentNewInstance;
        } catch (IllegalAccessException e2) {
            throw new e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new e("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new e("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    private d h0() {
        if (this.O == null) {
            this.O = new d();
        }
        return this.O;
    }

    int A0() {
        d dVar = this.O;
        if (dVar == null) {
            return 0;
        }
        return dVar.f986d;
    }

    public void A1(Menu menu) {
    }

    public void A2(Fragment fragment, int i2) {
        m mVar = this.w;
        m mVar2 = fragment != null ? fragment.w : null;
        if (mVar != null && mVar2 != null && mVar != mVar2) {
            throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
        }
        for (Fragment fragmentO0 = fragment; fragmentO0 != null; fragmentO0 = fragmentO0.O0()) {
            if (fragmentO0 == this) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.f980m = null;
            this.f979l = null;
        } else if (this.w == null || fragment.w == null) {
            this.f980m = null;
            this.f979l = fragment;
        } else {
            this.f980m = fragment.f977j;
            this.f979l = null;
        }
        this.n = i2;
    }

    int B0() {
        d dVar = this.O;
        if (dVar == null) {
            return 0;
        }
        return dVar.f987e;
    }

    public void B1() {
        this.J = true;
    }

    @Deprecated
    public void B2(boolean z) {
        if (!this.N && z && this.f973f < 3 && this.w != null && V0() && this.U) {
            this.w.C0(this);
        }
        this.N = z;
        this.M = this.f973f < 3 && !z;
        if (this.f974g != null) {
            this.f976i = Boolean.valueOf(z);
        }
    }

    public final Fragment C0() {
        return this.z;
    }

    public void C1(boolean z) {
    }

    public boolean C2(String str) {
        j<?> jVar = this.x;
        if (jVar != null) {
            return jVar.n(str);
        }
        return false;
    }

    @Override // androidx.lifecycle.b0
    public a0 D() {
        m mVar = this.w;
        if (mVar != null) {
            return mVar.l0(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final m D0() {
        m mVar = this.w;
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public void D1(Menu menu) {
    }

    public void D2(@SuppressLint({"UnknownNullness"}) Intent intent) {
        E2(intent, null);
    }

    public Object E0() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f991i;
        return obj == f972e ? t0() : obj;
    }

    public void E1(boolean z) {
    }

    public void E2(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        j<?> jVar = this.x;
        if (jVar != null) {
            jVar.o(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final Resources F0() {
        return m2().getResources();
    }

    public void F1(int i2, String[] strArr, int[] iArr) {
    }

    public void F2(@SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        G2(intent, i2, null);
    }

    public final boolean G0() {
        return this.F;
    }

    public void G1() {
        this.J = true;
    }

    public void G2(@SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        j<?> jVar = this.x;
        if (jVar != null) {
            jVar.o(this, intent, i2, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public Object H0() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f989g;
        return obj == f972e ? r0() : obj;
    }

    public void H1(Bundle bundle) {
    }

    public void H2() {
        m mVar = this.w;
        if (mVar == null || mVar.p == null) {
            h0().p = false;
        } else if (Looper.myLooper() != this.w.p.f().getLooper()) {
            this.w.p.f().postAtFrontOfQueue(new b());
        } else {
            f0();
        }
    }

    @Override // androidx.savedstate.b
    public final SavedStateRegistry I() {
        return this.Z.b();
    }

    public Object I0() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        return dVar.f992j;
    }

    public void I1() {
        this.J = true;
    }

    public Object J0() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f993k;
        return obj == f972e ? I0() : obj;
    }

    public void J1() {
        this.J = true;
    }

    int K0() {
        d dVar = this.O;
        if (dVar == null) {
            return 0;
        }
        return dVar.f985c;
    }

    public void K1(View view, Bundle bundle) {
    }

    public final String L0(int i2) {
        return F0().getString(i2);
    }

    public void L1(Bundle bundle) {
        this.J = true;
    }

    public final String M0(int i2, Object... objArr) {
        return F0().getString(i2, objArr);
    }

    void M1(Bundle bundle) {
        this.y.B0();
        this.f973f = 2;
        this.J = false;
        f1(bundle);
        if (this.J) {
            this.y.r();
            return;
        }
        throw new z("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public final String N0() {
        return this.C;
    }

    void N1() {
        this.y.g(this.x, new c(), this);
        this.f973f = 0;
        this.J = false;
        i1(this.x.e());
        if (this.J) {
            return;
        }
        throw new z("Fragment " + this + " did not call through to super.onAttach()");
    }

    public final Fragment O0() {
        String str;
        Fragment fragment = this.f979l;
        if (fragment != null) {
            return fragment;
        }
        m mVar = this.w;
        if (mVar == null || (str = this.f980m) == null) {
            return null;
        }
        return mVar.V(str);
    }

    void O1(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.y.s(configuration);
    }

    public final CharSequence P0(int i2) {
        return F0().getText(i2);
    }

    boolean P1(MenuItem menuItem) {
        if (this.D) {
            return false;
        }
        return k1(menuItem) || this.y.t(menuItem);
    }

    public View Q0() {
        return this.L;
    }

    void Q1(Bundle bundle) {
        this.y.B0();
        this.f973f = 1;
        this.J = false;
        this.Z.c(bundle);
        l1(bundle);
        this.U = true;
        if (this.J) {
            this.W.h(g.b.ON_CREATE);
            return;
        }
        throw new z("Fragment " + this + " did not call through to super.onCreate()");
    }

    public androidx.lifecycle.k R0() {
        y yVar = this.X;
        if (yVar != null) {
            return yVar;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    boolean R1(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.D) {
            return false;
        }
        if (this.H && this.I) {
            z = true;
            o1(menu, menuInflater);
        }
        return z | this.y.v(menu, menuInflater);
    }

    void S1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.y.B0();
        this.u = true;
        this.X = new y();
        View viewP1 = p1(layoutInflater, viewGroup, bundle);
        this.L = viewP1;
        if (viewP1 != null) {
            this.X.b();
            this.Y.l(this.X);
        } else {
            if (this.X.c()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.X = null;
        }
    }

    void T0() {
        S0();
        this.f977j = UUID.randomUUID().toString();
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = false;
        this.v = 0;
        this.w = null;
        this.y = new n();
        this.x = null;
        this.A = 0;
        this.B = 0;
        this.C = null;
        this.D = false;
        this.E = false;
    }

    void T1() {
        this.y.w();
        this.W.h(g.b.ON_DESTROY);
        this.f973f = 0;
        this.J = false;
        this.U = false;
        q1();
        if (this.J) {
            return;
        }
        throw new z("Fragment " + this + " did not call through to super.onDestroy()");
    }

    void U1() {
        this.y.x();
        if (this.L != null) {
            this.X.a(g.b.ON_DESTROY);
        }
        this.f973f = 1;
        this.J = false;
        s1();
        if (this.J) {
            c.o.a.a.b(this).c();
            this.u = false;
        } else {
            throw new z("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    public final boolean V0() {
        return this.x != null && this.p;
    }

    void V1() {
        this.f973f = -1;
        this.J = false;
        t1();
        this.T = null;
        if (this.J) {
            if (this.y.o0()) {
                return;
            }
            this.y.w();
            this.y = new n();
            return;
        }
        throw new z("Fragment " + this + " did not call through to super.onDetach()");
    }

    public final boolean W0() {
        return this.D;
    }

    LayoutInflater W1(Bundle bundle) {
        LayoutInflater layoutInflaterU1 = u1(bundle);
        this.T = layoutInflaterU1;
        return layoutInflaterU1;
    }

    boolean X0() {
        d dVar = this.O;
        if (dVar == null) {
            return false;
        }
        return dVar.r;
    }

    void X1() {
        onLowMemory();
        this.y.y();
    }

    final boolean Y0() {
        return this.v > 0;
    }

    void Y1(boolean z) {
        y1(z);
        this.y.z(z);
    }

    boolean Z0() {
        d dVar = this.O;
        if (dVar == null) {
            return false;
        }
        return dVar.p;
    }

    boolean Z1(MenuItem menuItem) {
        if (this.D) {
            return false;
        }
        return (this.H && this.I && z1(menuItem)) || this.y.A(menuItem);
    }

    public final boolean a1() {
        return this.q;
    }

    void a2(Menu menu) {
        if (this.D) {
            return;
        }
        if (this.H && this.I) {
            A1(menu);
        }
        this.y.B(menu);
    }

    final boolean b1() {
        Fragment fragmentC0 = C0();
        return fragmentC0 != null && (fragmentC0.a1() || fragmentC0.b1());
    }

    void b2() {
        this.y.D();
        if (this.L != null) {
            this.X.a(g.b.ON_PAUSE);
        }
        this.W.h(g.b.ON_PAUSE);
        this.f973f = 3;
        this.J = false;
        B1();
        if (this.J) {
            return;
        }
        throw new z("Fragment " + this + " did not call through to super.onPause()");
    }

    public final boolean c1() {
        m mVar = this.w;
        if (mVar == null) {
            return false;
        }
        return mVar.t0();
    }

    void c2(boolean z) {
        C1(z);
        this.y.E(z);
    }

    public final boolean d1() {
        View view;
        return (!V0() || W0() || (view = this.L) == null || view.getWindowToken() == null || this.L.getVisibility() != 0) ? false : true;
    }

    boolean d2(Menu menu) {
        boolean z = false;
        if (this.D) {
            return false;
        }
        if (this.H && this.I) {
            z = true;
            D1(menu);
        }
        return z | this.y.F(menu);
    }

    void e1() {
        this.y.B0();
    }

    void e2() {
        boolean zR0 = this.w.r0(this);
        Boolean bool = this.o;
        if (bool == null || bool.booleanValue() != zR0) {
            this.o = Boolean.valueOf(zR0);
            E1(zR0);
            this.y.G();
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    void f0() {
        d dVar = this.O;
        f fVar = null;
        if (dVar != null) {
            dVar.p = false;
            f fVar2 = dVar.q;
            dVar.q = null;
            fVar = fVar2;
        }
        if (fVar != null) {
            fVar.b();
        }
    }

    public void f1(Bundle bundle) {
        this.J = true;
    }

    void f2() {
        this.y.B0();
        this.y.Q(true);
        this.f973f = 4;
        this.J = false;
        G1();
        if (!this.J) {
            throw new z("Fragment " + this + " did not call through to super.onResume()");
        }
        androidx.lifecycle.l lVar = this.W;
        g.b bVar = g.b.ON_RESUME;
        lVar.h(bVar);
        if (this.L != null) {
            this.X.a(bVar);
        }
        this.y.H();
    }

    public void g0(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.A));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.B));
        printWriter.print(" mTag=");
        printWriter.println(this.C);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f973f);
        printWriter.print(" mWho=");
        printWriter.print(this.f977j);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.v);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.p);
        printWriter.print(" mRemoving=");
        printWriter.print(this.q);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.r);
        printWriter.print(" mInLayout=");
        printWriter.println(this.s);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.D);
        printWriter.print(" mDetached=");
        printWriter.print(this.E);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.I);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.H);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.F);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.N);
        if (this.w != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.w);
        }
        if (this.x != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.x);
        }
        if (this.z != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.z);
        }
        if (this.f978k != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f978k);
        }
        if (this.f974g != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f974g);
        }
        if (this.f975h != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f975h);
        }
        Fragment fragmentO0 = O0();
        if (fragmentO0 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(fragmentO0);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.n);
        }
        if (A0() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(A0());
        }
        if (this.K != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.K);
        }
        if (this.L != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.L);
        }
        if (m0() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(m0());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(K0());
        }
        if (q0() != null) {
            c.o.a.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.y + ":");
        this.y.M(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public void g1(int i2, int i3, Intent intent) {
    }

    void g2(Bundle bundle) {
        H1(bundle);
        this.Z.d(bundle);
        Parcelable parcelableQ0 = this.y.Q0();
        if (parcelableQ0 != null) {
            bundle.putParcelable("android:support:fragments", parcelableQ0);
        }
    }

    @Deprecated
    public void h1(Activity activity) {
        this.J = true;
    }

    void h2() {
        this.y.B0();
        this.y.Q(true);
        this.f973f = 3;
        this.J = false;
        I1();
        if (!this.J) {
            throw new z("Fragment " + this + " did not call through to super.onStart()");
        }
        androidx.lifecycle.l lVar = this.W;
        g.b bVar = g.b.ON_START;
        lVar.h(bVar);
        if (this.L != null) {
            this.X.a(bVar);
        }
        this.y.I();
    }

    public final int hashCode() {
        return super.hashCode();
    }

    @Override // androidx.lifecycle.k
    public androidx.lifecycle.g i() {
        return this.W;
    }

    Fragment i0(String str) {
        return str.equals(this.f977j) ? this : this.y.Y(str);
    }

    public void i1(Context context) {
        this.J = true;
        j<?> jVar = this.x;
        Activity activityD = jVar == null ? null : jVar.d();
        if (activityD != null) {
            this.J = false;
            h1(activityD);
        }
    }

    void i2() {
        this.y.K();
        if (this.L != null) {
            this.X.a(g.b.ON_STOP);
        }
        this.W.h(g.b.ON_STOP);
        this.f973f = 2;
        this.J = false;
        J1();
        if (this.J) {
            return;
        }
        throw new z("Fragment " + this + " did not call through to super.onStop()");
    }

    public final androidx.fragment.app.d j0() {
        j<?> jVar = this.x;
        if (jVar == null) {
            return null;
        }
        return (androidx.fragment.app.d) jVar.d();
    }

    public void j1(Fragment fragment) {
    }

    public final void j2(String[] strArr, int i2) {
        j<?> jVar = this.x;
        if (jVar != null) {
            jVar.l(this, strArr, i2);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public boolean k0() {
        Boolean bool;
        d dVar = this.O;
        if (dVar == null || (bool = dVar.f995m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean k1(MenuItem menuItem) {
        return false;
    }

    public final androidx.fragment.app.d k2() {
        androidx.fragment.app.d dVarJ0 = j0();
        if (dVarJ0 != null) {
            return dVarJ0;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public boolean l0() {
        Boolean bool;
        d dVar = this.O;
        if (dVar == null || (bool = dVar.f994l) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void l1(Bundle bundle) {
        this.J = true;
        o2(bundle);
        if (this.y.s0(1)) {
            return;
        }
        this.y.u();
    }

    public final Bundle l2() {
        Bundle bundleO0 = o0();
        if (bundleO0 != null) {
            return bundleO0;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    View m0() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        return dVar.a;
    }

    public Animation m1(int i2, boolean z, int i3) {
        return null;
    }

    public final Context m2() {
        Context contextQ0 = q0();
        if (contextQ0 != null) {
            return contextQ0;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    Animator n0() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        return dVar.f984b;
    }

    public Animator n1(int i2, boolean z, int i3) {
        return null;
    }

    public final View n2() {
        View viewQ0 = Q0();
        if (viewQ0 != null) {
            return viewQ0;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final Bundle o0() {
        return this.f978k;
    }

    public void o1(Menu menu, MenuInflater menuInflater) {
    }

    void o2(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.y.O0(parcelable);
        this.y.u();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.J = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        k2().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.J = true;
    }

    public final m p0() {
        if (this.x != null) {
            return this.y;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public View p1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = this.a0;
        if (i2 != 0) {
            return layoutInflater.inflate(i2, viewGroup, false);
        }
        return null;
    }

    final void p2(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f975h;
        if (sparseArray != null) {
            this.L.restoreHierarchyState(sparseArray);
            this.f975h = null;
        }
        this.J = false;
        L1(bundle);
        if (this.J) {
            if (this.L != null) {
                this.X.a(g.b.ON_CREATE);
            }
        } else {
            throw new z("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public Context q0() {
        j<?> jVar = this.x;
        if (jVar == null) {
            return null;
        }
        return jVar.e();
    }

    public void q1() {
        this.J = true;
    }

    void q2(View view) {
        h0().a = view;
    }

    public Object r0() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        return dVar.f988f;
    }

    public void r1() {
    }

    void r2(Animator animator) {
        h0().f984b = animator;
    }

    androidx.core.app.n s0() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        return dVar.n;
    }

    public void s1() {
        this.J = true;
    }

    public void s2(Bundle bundle) {
        if (this.w != null && c1()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f978k = bundle;
    }

    public Object t0() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        return dVar.f990h;
    }

    public void t1() {
        this.J = true;
    }

    public void t2(boolean z) {
        if (this.H != z) {
            this.H = z;
            if (!V0() || W0()) {
                return;
            }
            this.x.p();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f977j);
        sb.append(")");
        if (this.A != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.A));
        }
        if (this.C != null) {
            sb.append(" ");
            sb.append(this.C);
        }
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }

    androidx.core.app.n u0() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        return dVar.o;
    }

    public LayoutInflater u1(Bundle bundle) {
        return z0(bundle);
    }

    void u2(boolean z) {
        h0().r = z;
    }

    @Deprecated
    public final m v0() {
        return this.w;
    }

    public void v1(boolean z) {
    }

    public void v2(boolean z) {
        if (this.I != z) {
            this.I = z;
            if (this.H && V0() && !W0()) {
                this.x.p();
            }
        }
    }

    public final Object w0() {
        j<?> jVar = this.x;
        if (jVar == null) {
            return null;
        }
        return jVar.h();
    }

    @Deprecated
    public void w1(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.J = true;
    }

    void w2(int i2) {
        if (this.O == null && i2 == 0) {
            return;
        }
        h0().f986d = i2;
    }

    public final int x0() {
        return this.A;
    }

    public void x1(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.J = true;
        j<?> jVar = this.x;
        Activity activityD = jVar == null ? null : jVar.d();
        if (activityD != null) {
            this.J = false;
            w1(activityD, attributeSet, bundle);
        }
    }

    void x2(int i2) {
        if (this.O == null && i2 == 0) {
            return;
        }
        h0();
        this.O.f987e = i2;
    }

    public final LayoutInflater y0() {
        LayoutInflater layoutInflater = this.T;
        return layoutInflater == null ? W1(null) : layoutInflater;
    }

    public void y1(boolean z) {
    }

    void y2(f fVar) {
        h0();
        d dVar = this.O;
        f fVar2 = dVar.q;
        if (fVar == fVar2) {
            return;
        }
        if (fVar != null && fVar2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (dVar.p) {
            dVar.q = fVar;
        }
        if (fVar != null) {
            fVar.a();
        }
    }

    @Deprecated
    public LayoutInflater z0(Bundle bundle) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        j<?> jVar = this.x;
        if (jVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterJ = jVar.j();
        c.h.l.f.b(layoutInflaterJ, this.y.g0());
        return layoutInflaterJ;
    }

    public boolean z1(MenuItem menuItem) {
        return false;
    }

    void z2(int i2) {
        h0().f985c = i2;
    }

    public Fragment(int i2) {
        this();
        this.a0 = i2;
    }
}