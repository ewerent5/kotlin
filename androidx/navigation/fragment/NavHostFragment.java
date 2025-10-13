package androidx.navigation.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g;
import androidx.navigation.NavController;
import androidx.navigation.fragment.a;
import androidx.navigation.m;
import androidx.navigation.q;
import androidx.navigation.r;
import androidx.navigation.u;

/* loaded from: classes.dex */
public class NavHostFragment extends Fragment {
    private m b0;
    private Boolean c0 = null;
    private View d0;
    private int e0;
    private boolean f0;

    public static NavController J2(Fragment fragment) {
        for (Fragment fragmentC0 = fragment; fragmentC0 != null; fragmentC0 = fragmentC0.C0()) {
            if (fragmentC0 instanceof NavHostFragment) {
                return ((NavHostFragment) fragmentC0).L2();
            }
            Fragment fragmentJ0 = fragmentC0.D0().j0();
            if (fragmentJ0 instanceof NavHostFragment) {
                return ((NavHostFragment) fragmentJ0).L2();
            }
        }
        View viewQ0 = fragment.Q0();
        if (viewQ0 != null) {
            return q.b(viewQ0);
        }
        Dialog dialogM2 = fragment instanceof androidx.fragment.app.c ? ((androidx.fragment.app.c) fragment).M2() : null;
        if (dialogM2 != null && dialogM2.getWindow() != null) {
            return q.b(dialogM2.getWindow().getDecorView());
        }
        throw new IllegalStateException("Fragment " + fragment + " does not have a NavController set");
    }

    private int K2() {
        int iX0 = x0();
        return (iX0 == 0 || iX0 == -1) ? b.a : iX0;
    }

    @Override // androidx.fragment.app.Fragment
    public void E1(boolean z) {
        m mVar = this.b0;
        if (mVar != null) {
            mVar.b(z);
        } else {
            this.c0 = Boolean.valueOf(z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void H1(Bundle bundle) {
        super.H1(bundle);
        Bundle bundleU = this.b0.u();
        if (bundleU != null) {
            bundle.putBundle("android-support-nav:fragment:navControllerState", bundleU);
        }
        if (this.f0) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
        int i2 = this.e0;
        if (i2 != 0) {
            bundle.putInt("android-support-nav:fragment:graphId", i2);
        }
    }

    @Deprecated
    protected r<? extends a.C0017a> I2() {
        return new a(m2(), p0(), K2());
    }

    @Override // androidx.fragment.app.Fragment
    public void K1(View view, Bundle bundle) {
        super.K1(view, bundle);
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException("created host view " + view + " is not a ViewGroup");
        }
        q.e(view, this.b0);
        if (view.getParent() != null) {
            View view2 = (View) view.getParent();
            this.d0 = view2;
            if (view2.getId() == x0()) {
                q.e(this.d0, this.b0);
            }
        }
    }

    public final NavController L2() {
        m mVar = this.b0;
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalStateException("NavController is not available before onCreate()");
    }

    protected void M2(NavController navController) {
        navController.i().a(new DialogFragmentNavigator(m2(), p0()));
        navController.i().a(I2());
    }

    @Override // androidx.fragment.app.Fragment
    public void i1(Context context) {
        super.i1(context);
        if (this.f0) {
            D0().i().v(this).j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void j1(Fragment fragment) {
        super.j1(fragment);
        ((DialogFragmentNavigator) this.b0.i().d(DialogFragmentNavigator.class)).h(fragment);
    }

    @Override // androidx.fragment.app.Fragment
    public void l1(Bundle bundle) {
        Bundle bundle2;
        m mVar = new m(m2());
        this.b0 = mVar;
        mVar.z(this);
        this.b0.A(k2().k());
        m mVar2 = this.b0;
        Boolean bool = this.c0;
        mVar2.b(bool != null && bool.booleanValue());
        this.c0 = null;
        this.b0.B(D());
        M2(this.b0);
        if (bundle != null) {
            bundle2 = bundle.getBundle("android-support-nav:fragment:navControllerState");
            if (bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
                this.f0 = true;
                D0().i().v(this).j();
            }
            this.e0 = bundle.getInt("android-support-nav:fragment:graphId");
        } else {
            bundle2 = null;
        }
        if (bundle2 != null) {
            this.b0.t(bundle2);
        }
        int i2 = this.e0;
        if (i2 != 0) {
            this.b0.v(i2);
        } else {
            Bundle bundleO0 = o0();
            int i3 = bundleO0 != null ? bundleO0.getInt("android-support-nav:fragment:graphId") : 0;
            Bundle bundle3 = bundleO0 != null ? bundleO0.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
            if (i3 != 0) {
                this.b0.w(i3, bundle3);
            }
        }
        super.l1(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View p1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        g gVar = new g(layoutInflater.getContext());
        gVar.setId(K2());
        return gVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void s1() {
        super.s1();
        View view = this.d0;
        if (view != null && q.b(view) == this.b0) {
            q.e(this.d0, null);
        }
        this.d0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void x1(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.x1(context, attributeSet, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.p);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(u.q, 0);
        if (resourceId != 0) {
            this.e0 = resourceId;
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, c.r);
        if (typedArrayObtainStyledAttributes2.getBoolean(c.s, false)) {
            this.f0 = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }
}