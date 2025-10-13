package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.p0;
import c.a.o.b;
import c.h.l.a0;
import c.h.l.t;
import c.h.l.x;
import c.h.l.y;
import c.h.l.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: WindowDecorActionBar.java */
/* loaded from: classes.dex */
public class m extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {
    private static final Interpolator a = new AccelerateInterpolator();

    /* renamed from: b, reason: collision with root package name */
    private static final Interpolator f147b = new DecelerateInterpolator();
    c.a.o.h A;
    private boolean B;
    boolean C;

    /* renamed from: c, reason: collision with root package name */
    Context f148c;

    /* renamed from: d, reason: collision with root package name */
    private Context f149d;

    /* renamed from: e, reason: collision with root package name */
    private Activity f150e;

    /* renamed from: f, reason: collision with root package name */
    ActionBarOverlayLayout f151f;

    /* renamed from: g, reason: collision with root package name */
    ActionBarContainer f152g;

    /* renamed from: h, reason: collision with root package name */
    d0 f153h;

    /* renamed from: i, reason: collision with root package name */
    ActionBarContextView f154i;

    /* renamed from: j, reason: collision with root package name */
    View f155j;

    /* renamed from: k, reason: collision with root package name */
    p0 f156k;
    private boolean n;
    d o;
    c.a.o.b p;
    b.a q;
    private boolean r;
    private boolean t;
    boolean w;
    boolean x;
    private boolean y;

    /* renamed from: l, reason: collision with root package name */
    private ArrayList<?> f157l = new ArrayList<>();

    /* renamed from: m, reason: collision with root package name */
    private int f158m = -1;
    private ArrayList<a.b> s = new ArrayList<>();
    private int u = 0;
    boolean v = true;
    private boolean z = true;
    final y D = new a();
    final y E = new b();
    final a0 F = new c();

    /* compiled from: WindowDecorActionBar.java */
    class a extends z {
        a() {
        }

        @Override // c.h.l.y
        public void b(View view) {
            View view2;
            m mVar = m.this;
            if (mVar.v && (view2 = mVar.f155j) != null) {
                view2.setTranslationY(0.0f);
                m.this.f152g.setTranslationY(0.0f);
            }
            m.this.f152g.setVisibility(8);
            m.this.f152g.setTransitioning(false);
            m mVar2 = m.this;
            mVar2.A = null;
            mVar2.x();
            ActionBarOverlayLayout actionBarOverlayLayout = m.this.f151f;
            if (actionBarOverlayLayout != null) {
                t.h0(actionBarOverlayLayout);
            }
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    class b extends z {
        b() {
        }

        @Override // c.h.l.y
        public void b(View view) {
            m mVar = m.this;
            mVar.A = null;
            mVar.f152g.requestLayout();
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    class c implements a0 {
        c() {
        }

        @Override // c.h.l.a0
        public void a(View view) {
            ((View) m.this.f152g.getParent()).invalidate();
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    public class d extends c.a.o.b implements g.a {

        /* renamed from: g, reason: collision with root package name */
        private final Context f159g;

        /* renamed from: h, reason: collision with root package name */
        private final androidx.appcompat.view.menu.g f160h;

        /* renamed from: i, reason: collision with root package name */
        private b.a f161i;

        /* renamed from: j, reason: collision with root package name */
        private WeakReference<View> f162j;

        public d(Context context, b.a aVar) {
            this.f159g = context;
            this.f161i = aVar;
            androidx.appcompat.view.menu.g gVarS = new androidx.appcompat.view.menu.g(context).S(1);
            this.f160h = gVarS;
            gVarS.R(this);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            b.a aVar = this.f161i;
            if (aVar != null) {
                return aVar.d(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
            if (this.f161i == null) {
                return;
            }
            k();
            m.this.f154i.l();
        }

        @Override // c.a.o.b
        public void c() {
            m mVar = m.this;
            if (mVar.o != this) {
                return;
            }
            if (m.w(mVar.w, mVar.x, false)) {
                this.f161i.a(this);
            } else {
                m mVar2 = m.this;
                mVar2.p = this;
                mVar2.q = this.f161i;
            }
            this.f161i = null;
            m.this.v(false);
            m.this.f154i.g();
            m.this.f153h.r().sendAccessibilityEvent(32);
            m mVar3 = m.this;
            mVar3.f151f.setHideOnContentScrollEnabled(mVar3.C);
            m.this.o = null;
        }

        @Override // c.a.o.b
        public View d() {
            WeakReference<View> weakReference = this.f162j;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // c.a.o.b
        public Menu e() {
            return this.f160h;
        }

        @Override // c.a.o.b
        public MenuInflater f() {
            return new c.a.o.g(this.f159g);
        }

        @Override // c.a.o.b
        public CharSequence g() {
            return m.this.f154i.getSubtitle();
        }

        @Override // c.a.o.b
        public CharSequence i() {
            return m.this.f154i.getTitle();
        }

        @Override // c.a.o.b
        public void k() {
            if (m.this.o != this) {
                return;
            }
            this.f160h.d0();
            try {
                this.f161i.c(this, this.f160h);
            } finally {
                this.f160h.c0();
            }
        }

        @Override // c.a.o.b
        public boolean l() {
            return m.this.f154i.j();
        }

        @Override // c.a.o.b
        public void m(View view) {
            m.this.f154i.setCustomView(view);
            this.f162j = new WeakReference<>(view);
        }

        @Override // c.a.o.b
        public void n(int i2) {
            o(m.this.f148c.getResources().getString(i2));
        }

        @Override // c.a.o.b
        public void o(CharSequence charSequence) {
            m.this.f154i.setSubtitle(charSequence);
        }

        @Override // c.a.o.b
        public void q(int i2) {
            r(m.this.f148c.getResources().getString(i2));
        }

        @Override // c.a.o.b
        public void r(CharSequence charSequence) {
            m.this.f154i.setTitle(charSequence);
        }

        @Override // c.a.o.b
        public void s(boolean z) {
            super.s(z);
            m.this.f154i.setTitleOptional(z);
        }

        public boolean t() {
            this.f160h.d0();
            try {
                return this.f161i.b(this, this.f160h);
            } finally {
                this.f160h.c0();
            }
        }
    }

    public m(Activity activity, boolean z) {
        this.f150e = activity;
        View decorView = activity.getWindow().getDecorView();
        D(decorView);
        if (z) {
            return;
        }
        this.f155j = decorView.findViewById(R.id.content);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private d0 A(View view) {
        if (view instanceof d0) {
            return (d0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    private void C() {
        if (this.y) {
            this.y = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f151f;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            M(false);
        }
    }

    private void D(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(c.a.f.p);
        this.f151f = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f153h = A(view.findViewById(c.a.f.a));
        this.f154i = (ActionBarContextView) view.findViewById(c.a.f.f2487f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(c.a.f.f2484c);
        this.f152g = actionBarContainer;
        d0 d0Var = this.f153h;
        if (d0Var == null || this.f154i == null || actionBarContainer == null) {
            throw new IllegalStateException(m.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f148c = d0Var.getContext();
        boolean z = (this.f153h.t() & 4) != 0;
        if (z) {
            this.n = true;
        }
        c.a.o.a aVarB = c.a.o.a.b(this.f148c);
        J(aVarB.a() || z);
        H(aVarB.g());
        TypedArray typedArrayObtainStyledAttributes = this.f148c.obtainStyledAttributes(null, c.a.j.a, c.a.a.f2442c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(c.a.j.f2530k, false)) {
            I(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(c.a.j.f2528i, 0);
        if (dimensionPixelSize != 0) {
            G(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void H(boolean z) {
        this.t = z;
        if (z) {
            this.f152g.setTabContainer(null);
            this.f153h.i(this.f156k);
        } else {
            this.f153h.i(null);
            this.f152g.setTabContainer(this.f156k);
        }
        boolean z2 = B() == 2;
        p0 p0Var = this.f156k;
        if (p0Var != null) {
            if (z2) {
                p0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f151f;
                if (actionBarOverlayLayout != null) {
                    t.h0(actionBarOverlayLayout);
                }
            } else {
                p0Var.setVisibility(8);
            }
        }
        this.f153h.w(!this.t && z2);
        this.f151f.setHasNonEmbeddedTabs(!this.t && z2);
    }

    private boolean K() {
        return t.Q(this.f152g);
    }

    private void L() {
        if (this.y) {
            return;
        }
        this.y = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f151f;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        M(false);
    }

    private void M(boolean z) {
        if (w(this.w, this.x, this.y)) {
            if (this.z) {
                return;
            }
            this.z = true;
            z(z);
            return;
        }
        if (this.z) {
            this.z = false;
            y(z);
        }
    }

    static boolean w(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    public int B() {
        return this.f153h.n();
    }

    public void E(boolean z) {
        F(z ? 4 : 0, 4);
    }

    public void F(int i2, int i3) {
        int iT = this.f153h.t();
        if ((i3 & 4) != 0) {
            this.n = true;
        }
        this.f153h.k((i2 & i3) | ((~i3) & iT));
    }

    public void G(float f2) {
        t.r0(this.f152g, f2);
    }

    public void I(boolean z) {
        if (z && !this.f151f.w()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.C = z;
        this.f151f.setHideOnContentScrollEnabled(z);
    }

    public void J(boolean z) {
        this.f153h.s(z);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.x) {
            this.x = false;
            M(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z) {
        this.v = z;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.x) {
            return;
        }
        this.x = true;
        M(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        c.a.o.h hVar = this.A;
        if (hVar != null) {
            hVar.a();
            this.A = null;
        }
    }

    @Override // androidx.appcompat.app.a
    public boolean g() {
        d0 d0Var = this.f153h;
        if (d0Var == null || !d0Var.j()) {
            return false;
        }
        this.f153h.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void h(boolean z) {
        if (z == this.r) {
            return;
        }
        this.r = z;
        int size = this.s.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.s.get(i2).a(z);
        }
    }

    @Override // androidx.appcompat.app.a
    public int i() {
        return this.f153h.t();
    }

    @Override // androidx.appcompat.app.a
    public Context j() {
        if (this.f149d == null) {
            TypedValue typedValue = new TypedValue();
            this.f148c.getTheme().resolveAttribute(c.a.a.f2446g, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.f149d = new ContextThemeWrapper(this.f148c, i2);
            } else {
                this.f149d = this.f148c;
            }
        }
        return this.f149d;
    }

    @Override // androidx.appcompat.app.a
    public void l(Configuration configuration) {
        H(c.a.o.a.b(this.f148c).g());
    }

    @Override // androidx.appcompat.app.a
    public boolean n(int i2, KeyEvent keyEvent) {
        Menu menuE;
        d dVar = this.o;
        if (dVar == null || (menuE = dVar.e()) == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(i2, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i2) {
        this.u = i2;
    }

    @Override // androidx.appcompat.app.a
    public void q(boolean z) {
        if (this.n) {
            return;
        }
        E(z);
    }

    @Override // androidx.appcompat.app.a
    public void r(boolean z) {
        F(z ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.a
    public void s(boolean z) {
        c.a.o.h hVar;
        this.B = z;
        if (z || (hVar = this.A) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.a
    public void t(CharSequence charSequence) {
        this.f153h.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public c.a.o.b u(b.a aVar) {
        d dVar = this.o;
        if (dVar != null) {
            dVar.c();
        }
        this.f151f.setHideOnContentScrollEnabled(false);
        this.f154i.k();
        d dVar2 = new d(this.f154i.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.o = dVar2;
        dVar2.k();
        this.f154i.h(dVar2);
        v(true);
        this.f154i.sendAccessibilityEvent(32);
        return dVar2;
    }

    public void v(boolean z) {
        x xVarO;
        x xVarF;
        if (z) {
            L();
        } else {
            C();
        }
        if (!K()) {
            if (z) {
                this.f153h.q(4);
                this.f154i.setVisibility(0);
                return;
            } else {
                this.f153h.q(0);
                this.f154i.setVisibility(8);
                return;
            }
        }
        if (z) {
            xVarF = this.f153h.o(4, 100L);
            xVarO = this.f154i.f(0, 200L);
        } else {
            xVarO = this.f153h.o(0, 200L);
            xVarF = this.f154i.f(8, 100L);
        }
        c.a.o.h hVar = new c.a.o.h();
        hVar.d(xVarF, xVarO);
        hVar.h();
    }

    void x() {
        b.a aVar = this.q;
        if (aVar != null) {
            aVar.a(this.p);
            this.p = null;
            this.q = null;
        }
    }

    public void y(boolean z) {
        View view;
        c.a.o.h hVar = this.A;
        if (hVar != null) {
            hVar.a();
        }
        if (this.u != 0 || (!this.B && !z)) {
            this.D.b(null);
            return;
        }
        this.f152g.setAlpha(1.0f);
        this.f152g.setTransitioning(true);
        c.a.o.h hVar2 = new c.a.o.h();
        float f2 = -this.f152g.getHeight();
        if (z) {
            this.f152g.getLocationInWindow(new int[]{0, 0});
            f2 -= r5[1];
        }
        x xVarK = t.d(this.f152g).k(f2);
        xVarK.i(this.F);
        hVar2.c(xVarK);
        if (this.v && (view = this.f155j) != null) {
            hVar2.c(t.d(view).k(f2));
        }
        hVar2.f(a);
        hVar2.e(250L);
        hVar2.g(this.D);
        this.A = hVar2;
        hVar2.h();
    }

    public void z(boolean z) {
        View view;
        View view2;
        c.a.o.h hVar = this.A;
        if (hVar != null) {
            hVar.a();
        }
        this.f152g.setVisibility(0);
        if (this.u == 0 && (this.B || z)) {
            this.f152g.setTranslationY(0.0f);
            float f2 = -this.f152g.getHeight();
            if (z) {
                this.f152g.getLocationInWindow(new int[]{0, 0});
                f2 -= r5[1];
            }
            this.f152g.setTranslationY(f2);
            c.a.o.h hVar2 = new c.a.o.h();
            x xVarK = t.d(this.f152g).k(0.0f);
            xVarK.i(this.F);
            hVar2.c(xVarK);
            if (this.v && (view2 = this.f155j) != null) {
                view2.setTranslationY(f2);
                hVar2.c(t.d(this.f155j).k(0.0f));
            }
            hVar2.f(f147b);
            hVar2.e(250L);
            hVar2.g(this.E);
            this.A = hVar2;
            hVar2.h();
        } else {
            this.f152g.setAlpha(1.0f);
            this.f152g.setTranslationY(0.0f);
            if (this.v && (view = this.f155j) != null) {
                view.setTranslationY(0.0f);
            }
            this.E.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f151f;
        if (actionBarOverlayLayout != null) {
            t.h0(actionBarOverlayLayout);
        }
    }

    public m(Dialog dialog) {
        D(dialog.getWindow().getDecorView());
    }
}