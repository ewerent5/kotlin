package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.g;

/* compiled from: FragmentPagerAdapter.java */
/* loaded from: classes.dex */
public abstract class q extends androidx.viewpager.widget.a {

    /* renamed from: c, reason: collision with root package name */
    private final m f1071c;

    /* renamed from: d, reason: collision with root package name */
    private final int f1072d;

    /* renamed from: e, reason: collision with root package name */
    private u f1073e = null;

    /* renamed from: f, reason: collision with root package name */
    private Fragment f1074f = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1075g;

    public q(m mVar, int i2) {
        this.f1071c = mVar;
        this.f1072d = i2;
    }

    private static String s(int i2, long j2) {
        return "android:switcher:" + i2 + ":" + j2;
    }

    @Override // androidx.viewpager.widget.a
    public void a(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f1073e == null) {
            this.f1073e = this.f1071c.i();
        }
        this.f1073e.n(fragment);
        if (fragment.equals(this.f1074f)) {
            this.f1074f = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void b(ViewGroup viewGroup) {
        u uVar = this.f1073e;
        if (uVar != null) {
            if (!this.f1075g) {
                try {
                    this.f1075g = true;
                    uVar.m();
                } finally {
                    this.f1075g = false;
                }
            }
            this.f1073e = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public Object g(ViewGroup viewGroup, int i2) {
        if (this.f1073e == null) {
            this.f1073e = this.f1071c.i();
        }
        long jR = r(i2);
        Fragment fragmentX = this.f1071c.X(s(viewGroup.getId(), jR));
        if (fragmentX != null) {
            this.f1073e.i(fragmentX);
        } else {
            fragmentX = q(i2);
            this.f1073e.c(viewGroup.getId(), fragmentX, s(viewGroup.getId(), jR));
        }
        if (fragmentX != this.f1074f) {
            fragmentX.v2(false);
            if (this.f1072d == 1) {
                this.f1073e.u(fragmentX, g.c.STARTED);
            } else {
                fragmentX.B2(false);
            }
        }
        return fragmentX;
    }

    @Override // androidx.viewpager.widget.a
    public boolean h(View view, Object obj) {
        return ((Fragment) obj).Q0() == view;
    }

    @Override // androidx.viewpager.widget.a
    public void k(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.a
    public Parcelable l() {
        return null;
    }

    @Override // androidx.viewpager.widget.a
    public void m(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f1074f;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.v2(false);
                if (this.f1072d == 1) {
                    if (this.f1073e == null) {
                        this.f1073e = this.f1071c.i();
                    }
                    this.f1073e.u(this.f1074f, g.c.STARTED);
                } else {
                    this.f1074f.B2(false);
                }
            }
            fragment.v2(true);
            if (this.f1072d == 1) {
                if (this.f1073e == null) {
                    this.f1073e = this.f1071c.i();
                }
                this.f1073e.u(fragment, g.c.RESUMED);
            } else {
                fragment.B2(true);
            }
            this.f1074f = fragment;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void o(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    public abstract Fragment q(int i2);

    public long r(int i2) {
        return i2;
    }
}