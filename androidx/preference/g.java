package androidx.preference;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.preference.DialogPreference;
import androidx.preference.j;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PreferenceFragmentCompat.java */
/* loaded from: classes.dex */
public abstract class g extends Fragment implements j.c, j.a, j.b, DialogPreference.a {
    private j c0;
    RecyclerView d0;
    private boolean e0;
    private boolean f0;
    private Runnable h0;
    private final c b0 = new c();
    private int g0 = q.f1470c;
    private Handler i0 = new a();
    private final Runnable j0 = new b();

    /* compiled from: PreferenceFragmentCompat.java */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            g.this.I2();
        }
    }

    /* compiled from: PreferenceFragmentCompat.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = g.this.d0;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    /* compiled from: PreferenceFragmentCompat.java */
    private class c extends RecyclerView.n {
        private Drawable a;

        /* renamed from: b */
        private int f1414b;

        /* renamed from: c */
        private boolean f1415c = true;

        c() {
        }

        private boolean m(View view, RecyclerView recyclerView) {
            RecyclerView.d0 d0VarF0 = recyclerView.f0(view);
            boolean z = false;
            if (!((d0VarF0 instanceof l) && ((l) d0VarF0).P())) {
                return false;
            }
            boolean z2 = this.f1415c;
            int iIndexOfChild = recyclerView.indexOfChild(view);
            if (iIndexOfChild >= recyclerView.getChildCount() - 1) {
                return z2;
            }
            RecyclerView.d0 d0VarF02 = recyclerView.f0(recyclerView.getChildAt(iIndexOfChild + 1));
            if ((d0VarF02 instanceof l) && ((l) d0VarF02).O()) {
                z = true;
            }
            return z;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            if (m(view, recyclerView)) {
                rect.bottom = this.f1414b;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            if (this.a == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (m(childAt, recyclerView)) {
                    int y = ((int) childAt.getY()) + childAt.getHeight();
                    this.a.setBounds(0, y, width, this.f1414b + y);
                    this.a.draw(canvas);
                }
            }
        }

        public void j(boolean z) {
            this.f1415c = z;
        }

        public void k(Drawable drawable) {
            if (drawable != null) {
                this.f1414b = drawable.getIntrinsicHeight();
            } else {
                this.f1414b = 0;
            }
            this.a = drawable;
            g.this.d0.t0();
        }

        public void l(int i2) {
            this.f1414b = i2;
            g.this.d0.t0();
        }
    }

    /* compiled from: PreferenceFragmentCompat.java */
    public interface d {
        boolean a(g gVar, Preference preference);
    }

    /* compiled from: PreferenceFragmentCompat.java */
    public interface e {
        boolean a(g gVar, Preference preference);
    }

    /* compiled from: PreferenceFragmentCompat.java */
    public interface f {
        boolean a(g gVar, PreferenceScreen preferenceScreen);
    }

    private void S2() {
        if (this.i0.hasMessages(1)) {
            return;
        }
        this.i0.obtainMessage(1).sendToTarget();
    }

    private void T2() {
        if (this.c0 == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
    }

    private void Y2() {
        K2().setAdapter(null);
        PreferenceScreen preferenceScreenL2 = L2();
        if (preferenceScreenL2 != null) {
            preferenceScreenL2.U();
        }
        R2();
    }

    @Override // androidx.fragment.app.Fragment
    public void H1(Bundle bundle) {
        super.H1(bundle);
        PreferenceScreen preferenceScreenL2 = L2();
        if (preferenceScreenL2 != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreenL2.m0(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        super.I1();
        this.c0.o(this);
        this.c0.m(this);
    }

    void I2() {
        PreferenceScreen preferenceScreenL2 = L2();
        if (preferenceScreenL2 != null) {
            K2().setAdapter(N2(preferenceScreenL2));
            preferenceScreenL2.O();
        }
        M2();
    }

    @Override // androidx.fragment.app.Fragment
    public void J1() {
        super.J1();
        this.c0.o(null);
        this.c0.m(null);
    }

    public Fragment J2() {
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void K1(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreenL2;
        super.K1(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreenL2 = L2()) != null) {
            preferenceScreenL2.l0(bundle2);
        }
        if (this.e0) {
            I2();
            Runnable runnable = this.h0;
            if (runnable != null) {
                runnable.run();
                this.h0 = null;
            }
        }
        this.f0 = true;
    }

    public final RecyclerView K2() {
        return this.d0;
    }

    public PreferenceScreen L2() {
        return this.c0.i();
    }

    protected void M2() {
    }

    protected RecyclerView.g N2(PreferenceScreen preferenceScreen) {
        return new h(preferenceScreen);
    }

    public RecyclerView.o O2() {
        return new LinearLayoutManager(q0());
    }

    public abstract void P2(Bundle bundle, String str);

    @Override // androidx.preference.j.a
    public void Q(Preference preference) {
        androidx.fragment.app.c cVarB3;
        boolean zA = J2() instanceof d ? ((d) J2()).a(this, preference) : false;
        if (!zA && (j0() instanceof d)) {
            zA = ((d) j0()).a(this, preference);
        }
        if (!zA && D0().X("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (preference instanceof EditTextPreference) {
                cVarB3 = androidx.preference.a.b3(preference.q());
            } else if (preference instanceof ListPreference) {
                cVarB3 = androidx.preference.c.b3(preference.q());
            } else {
                if (!(preference instanceof MultiSelectListPreference)) {
                    throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                }
                cVarB3 = androidx.preference.d.b3(preference.q());
            }
            cVarB3.A2(this, 0);
            cVarB3.S2(D0(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    public RecyclerView Q2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        if (q0().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(p.f1464b)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(q.f1471d, viewGroup, false);
        recyclerView2.setLayoutManager(O2());
        recyclerView2.setAccessibilityDelegateCompat(new k(recyclerView2));
        return recyclerView2;
    }

    protected void R2() {
    }

    public void U2(Drawable drawable) {
        this.b0.k(drawable);
    }

    @Override // androidx.preference.j.b
    public void V(PreferenceScreen preferenceScreen) {
        if ((J2() instanceof f ? ((f) J2()).a(this, preferenceScreen) : false) || !(j0() instanceof f)) {
            return;
        }
        ((f) j0()).a(this, preferenceScreen);
    }

    public void V2(int i2) {
        this.b0.l(i2);
    }

    public void W2(PreferenceScreen preferenceScreen) {
        if (!this.c0.p(preferenceScreen) || preferenceScreen == null) {
            return;
        }
        R2();
        this.e0 = true;
        if (this.f0) {
            S2();
        }
    }

    @Override // androidx.preference.j.c
    public boolean X(Preference preference) {
        if (preference.n() == null) {
            return false;
        }
        boolean zA = J2() instanceof e ? ((e) J2()).a(this, preference) : false;
        if (!zA && (j0() instanceof e)) {
            zA = ((e) j0()).a(this, preference);
        }
        if (zA) {
            return true;
        }
        Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
        androidx.fragment.app.m mVarY = k2().y();
        Bundle bundleL = preference.l();
        Fragment fragmentA = mVarY.e0().a(k2().getClassLoader(), preference.n());
        fragmentA.s2(bundleL);
        fragmentA.A2(this, 0);
        mVarY.i().r(((View) Q0().getParent()).getId(), fragmentA).h(null).j();
        return true;
    }

    public void X2(int i2, String str) {
        T2();
        PreferenceScreen preferenceScreenK = this.c0.k(q0(), i2, null);
        Object obj = preferenceScreenK;
        if (str != null) {
            Object objG0 = preferenceScreenK.G0(str);
            boolean z = objG0 instanceof PreferenceScreen;
            obj = objG0;
            if (!z) {
                throw new IllegalArgumentException("Preference object with key " + str + " is not a PreferenceScreen");
            }
        }
        W2((PreferenceScreen) obj);
    }

    @Override // androidx.fragment.app.Fragment
    public void l1(Bundle bundle) {
        super.l1(bundle);
        TypedValue typedValue = new TypedValue();
        j0().getTheme().resolveAttribute(m.f1460j, typedValue, true);
        int i2 = typedValue.resourceId;
        if (i2 == 0) {
            i2 = s.a;
        }
        j0().getTheme().applyStyle(i2, false);
        j jVar = new j(q0());
        this.c0 = jVar;
        jVar.n(this);
        P2(bundle, o0() != null ? o0().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // androidx.fragment.app.Fragment
    public View p1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray typedArrayObtainStyledAttributes = q0().obtainStyledAttributes(null, t.e1, m.f1457g, 0);
        this.g0 = typedArrayObtainStyledAttributes.getResourceId(t.f1, this.g0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(t.g1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(t.h1, -1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(t.i1, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(q0());
        View viewInflate = layoutInflaterCloneInContext.inflate(this.g0, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        RecyclerView recyclerViewQ2 = Q2(layoutInflaterCloneInContext, viewGroup2, bundle);
        if (recyclerViewQ2 == null) {
            throw new RuntimeException("Could not create RecyclerView");
        }
        this.d0 = recyclerViewQ2;
        recyclerViewQ2.h(this.b0);
        U2(drawable);
        if (dimensionPixelSize != -1) {
            V2(dimensionPixelSize);
        }
        this.b0.j(z);
        if (this.d0.getParent() == null) {
            viewGroup2.addView(this.d0);
        }
        this.i0.post(this.j0);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void s1() {
        this.i0.removeCallbacks(this.j0);
        this.i0.removeMessages(1);
        if (this.e0) {
            Y2();
        }
        this.d0 = null;
        super.s1();
    }

    @Override // androidx.preference.DialogPreference.a
    public <T extends Preference> T t(CharSequence charSequence) {
        j jVar = this.c0;
        if (jVar == null) {
            return null;
        }
        return (T) jVar.a(charSequence);
    }
}