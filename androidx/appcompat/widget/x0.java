package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.Toolbar;

/* compiled from: ToolbarWidgetWrapper.java */
/* loaded from: classes.dex */
public class x0 implements d0 {
    Toolbar a;

    /* renamed from: b, reason: collision with root package name */
    private int f615b;

    /* renamed from: c, reason: collision with root package name */
    private View f616c;

    /* renamed from: d, reason: collision with root package name */
    private View f617d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f618e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f619f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f620g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f621h;

    /* renamed from: i, reason: collision with root package name */
    CharSequence f622i;

    /* renamed from: j, reason: collision with root package name */
    private CharSequence f623j;

    /* renamed from: k, reason: collision with root package name */
    private CharSequence f624k;

    /* renamed from: l, reason: collision with root package name */
    Window.Callback f625l;

    /* renamed from: m, reason: collision with root package name */
    boolean f626m;
    private c n;
    private int o;
    private int p;
    private Drawable q;

    /* compiled from: ToolbarWidgetWrapper.java */
    class a implements View.OnClickListener {

        /* renamed from: e, reason: collision with root package name */
        final androidx.appcompat.view.menu.a f627e;

        a() {
            this.f627e = new androidx.appcompat.view.menu.a(x0.this.a.getContext(), 0, R.id.home, 0, 0, x0.this.f622i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            x0 x0Var = x0.this;
            Window.Callback callback = x0Var.f625l;
            if (callback == null || !x0Var.f626m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f627e);
        }
    }

    /* compiled from: ToolbarWidgetWrapper.java */
    class b extends c.h.l.z {
        private boolean a = false;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f629b;

        b(int i2) {
            this.f629b = i2;
        }

        @Override // c.h.l.z, c.h.l.y
        public void a(View view) {
            this.a = true;
        }

        @Override // c.h.l.y
        public void b(View view) {
            if (this.a) {
                return;
            }
            x0.this.a.setVisibility(this.f629b);
        }

        @Override // c.h.l.z, c.h.l.y
        public void c(View view) {
            x0.this.a.setVisibility(0);
        }
    }

    public x0(Toolbar toolbar, boolean z) {
        this(toolbar, z, c.a.h.a, c.a.e.n);
    }

    private void G(CharSequence charSequence) {
        this.f622i = charSequence;
        if ((this.f615b & 8) != 0) {
            this.a.setTitle(charSequence);
        }
    }

    private void H() {
        if ((this.f615b & 4) != 0) {
            if (TextUtils.isEmpty(this.f624k)) {
                this.a.setNavigationContentDescription(this.p);
            } else {
                this.a.setNavigationContentDescription(this.f624k);
            }
        }
    }

    private void I() {
        if ((this.f615b & 4) == 0) {
            this.a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.a;
        Drawable drawable = this.f620g;
        if (drawable == null) {
            drawable = this.q;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void J() {
        Drawable drawable;
        int i2 = this.f615b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) == 0 || (drawable = this.f619f) == null) {
            drawable = this.f618e;
        }
        this.a.setLogo(drawable);
    }

    private int x() {
        if (this.a.getNavigationIcon() == null) {
            return 11;
        }
        this.q = this.a.getNavigationIcon();
        return 15;
    }

    public void A(Drawable drawable) {
        this.f619f = drawable;
        J();
    }

    public void B(int i2) {
        C(i2 == 0 ? null : getContext().getString(i2));
    }

    public void C(CharSequence charSequence) {
        this.f624k = charSequence;
        H();
    }

    public void D(Drawable drawable) {
        this.f620g = drawable;
        I();
    }

    public void E(CharSequence charSequence) {
        this.f623j = charSequence;
        if ((this.f615b & 8) != 0) {
            this.a.setSubtitle(charSequence);
        }
    }

    public void F(CharSequence charSequence) {
        this.f621h = true;
        G(charSequence);
    }

    @Override // androidx.appcompat.widget.d0
    public void a(Menu menu, m.a aVar) {
        if (this.n == null) {
            c cVar = new c(this.a.getContext());
            this.n = cVar;
            cVar.p(c.a.f.f2488g);
        }
        this.n.h(aVar);
        this.a.I((androidx.appcompat.view.menu.g) menu, this.n);
    }

    @Override // androidx.appcompat.widget.d0
    public boolean b() {
        return this.a.A();
    }

    @Override // androidx.appcompat.widget.d0
    public void c() {
        this.f626m = true;
    }

    @Override // androidx.appcompat.widget.d0
    public void collapseActionView() {
        this.a.e();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean d() {
        return this.a.d();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean e() {
        return this.a.z();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean f() {
        return this.a.w();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean g() {
        return this.a.O();
    }

    @Override // androidx.appcompat.widget.d0
    public Context getContext() {
        return this.a.getContext();
    }

    @Override // androidx.appcompat.widget.d0
    public CharSequence getTitle() {
        return this.a.getTitle();
    }

    @Override // androidx.appcompat.widget.d0
    public void h() {
        this.a.f();
    }

    @Override // androidx.appcompat.widget.d0
    public void i(p0 p0Var) {
        View view = this.f616c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.a;
            if (parent == toolbar) {
                toolbar.removeView(this.f616c);
            }
        }
        this.f616c = p0Var;
        if (p0Var == null || this.o != 2) {
            return;
        }
        this.a.addView(p0Var, 0);
        Toolbar.e eVar = (Toolbar.e) this.f616c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) eVar).width = -2;
        ((ViewGroup.MarginLayoutParams) eVar).height = -2;
        eVar.a = 8388691;
        p0Var.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.d0
    public boolean j() {
        return this.a.v();
    }

    @Override // androidx.appcompat.widget.d0
    public void k(int i2) {
        View view;
        int i3 = this.f615b ^ i2;
        this.f615b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    H();
                }
                I();
            }
            if ((i3 & 3) != 0) {
                J();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.a.setTitle(this.f622i);
                    this.a.setSubtitle(this.f623j);
                } else {
                    this.a.setTitle((CharSequence) null);
                    this.a.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) == 0 || (view = this.f617d) == null) {
                return;
            }
            if ((i2 & 16) != 0) {
                this.a.addView(view);
            } else {
                this.a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.d0
    public Menu l() {
        return this.a.getMenu();
    }

    @Override // androidx.appcompat.widget.d0
    public void m(int i2) {
        A(i2 != 0 ? c.a.k.a.a.d(getContext(), i2) : null);
    }

    @Override // androidx.appcompat.widget.d0
    public int n() {
        return this.o;
    }

    @Override // androidx.appcompat.widget.d0
    public c.h.l.x o(int i2, long j2) {
        return c.h.l.t.d(this.a).a(i2 == 0 ? 1.0f : 0.0f).d(j2).f(new b(i2));
    }

    @Override // androidx.appcompat.widget.d0
    public void p(m.a aVar, g.a aVar2) {
        this.a.J(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.d0
    public void q(int i2) {
        this.a.setVisibility(i2);
    }

    @Override // androidx.appcompat.widget.d0
    public ViewGroup r() {
        return this.a;
    }

    @Override // androidx.appcompat.widget.d0
    public void s(boolean z) {
    }

    @Override // androidx.appcompat.widget.d0
    public void setIcon(int i2) {
        setIcon(i2 != 0 ? c.a.k.a.a.d(getContext(), i2) : null);
    }

    @Override // androidx.appcompat.widget.d0
    public void setWindowCallback(Window.Callback callback) {
        this.f625l = callback;
    }

    @Override // androidx.appcompat.widget.d0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f621h) {
            return;
        }
        G(charSequence);
    }

    @Override // androidx.appcompat.widget.d0
    public int t() {
        return this.f615b;
    }

    @Override // androidx.appcompat.widget.d0
    public void u() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.d0
    public void v() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.d0
    public void w(boolean z) {
        this.a.setCollapsible(z);
    }

    public void y(View view) {
        View view2 = this.f617d;
        if (view2 != null && (this.f615b & 16) != 0) {
            this.a.removeView(view2);
        }
        this.f617d = view;
        if (view == null || (this.f615b & 16) == 0) {
            return;
        }
        this.a.addView(view);
    }

    public void z(int i2) {
        if (i2 == this.p) {
            return;
        }
        this.p = i2;
        if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
            B(this.p);
        }
    }

    public x0(Toolbar toolbar, boolean z, int i2, int i3) {
        Drawable drawable;
        this.o = 0;
        this.p = 0;
        this.a = toolbar;
        this.f622i = toolbar.getTitle();
        this.f623j = toolbar.getSubtitle();
        this.f621h = this.f622i != null;
        this.f620g = toolbar.getNavigationIcon();
        w0 w0VarV = w0.v(toolbar.getContext(), null, c.a.j.a, c.a.a.f2442c, 0);
        this.q = w0VarV.g(c.a.j.f2531l);
        if (z) {
            CharSequence charSequenceP = w0VarV.p(c.a.j.r);
            if (!TextUtils.isEmpty(charSequenceP)) {
                F(charSequenceP);
            }
            CharSequence charSequenceP2 = w0VarV.p(c.a.j.p);
            if (!TextUtils.isEmpty(charSequenceP2)) {
                E(charSequenceP2);
            }
            Drawable drawableG = w0VarV.g(c.a.j.n);
            if (drawableG != null) {
                A(drawableG);
            }
            Drawable drawableG2 = w0VarV.g(c.a.j.f2532m);
            if (drawableG2 != null) {
                setIcon(drawableG2);
            }
            if (this.f620g == null && (drawable = this.q) != null) {
                D(drawable);
            }
            k(w0VarV.k(c.a.j.f2527h, 0));
            int iN = w0VarV.n(c.a.j.f2526g, 0);
            if (iN != 0) {
                y(LayoutInflater.from(this.a.getContext()).inflate(iN, (ViewGroup) this.a, false));
                k(this.f615b | 16);
            }
            int iM = w0VarV.m(c.a.j.f2529j, 0);
            if (iM > 0) {
                ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = iM;
                this.a.setLayoutParams(layoutParams);
            }
            int iE = w0VarV.e(c.a.j.f2525f, -1);
            int iE2 = w0VarV.e(c.a.j.f2524e, -1);
            if (iE >= 0 || iE2 >= 0) {
                this.a.H(Math.max(iE, 0), Math.max(iE2, 0));
            }
            int iN2 = w0VarV.n(c.a.j.s, 0);
            if (iN2 != 0) {
                Toolbar toolbar2 = this.a;
                toolbar2.L(toolbar2.getContext(), iN2);
            }
            int iN3 = w0VarV.n(c.a.j.q, 0);
            if (iN3 != 0) {
                Toolbar toolbar3 = this.a;
                toolbar3.K(toolbar3.getContext(), iN3);
            }
            int iN4 = w0VarV.n(c.a.j.o, 0);
            if (iN4 != 0) {
                this.a.setPopupTheme(iN4);
            }
        } else {
            this.f615b = x();
        }
        w0VarV.w();
        z(i2);
        this.f624k = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener(new a());
    }

    @Override // androidx.appcompat.widget.d0
    public void setIcon(Drawable drawable) {
        this.f618e = drawable;
        J();
    }
}