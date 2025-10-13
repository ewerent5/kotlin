package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.l0;
import c.h.l.t;

/* compiled from: StandardMenuPopup.java */
/* loaded from: classes.dex */
final class q extends k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, m, View.OnKeyListener {

    /* renamed from: f, reason: collision with root package name */
    private static final int f290f = c.a.g.f2506m;

    /* renamed from: g, reason: collision with root package name */
    private final Context f291g;

    /* renamed from: h, reason: collision with root package name */
    private final g f292h;

    /* renamed from: i, reason: collision with root package name */
    private final f f293i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f294j;

    /* renamed from: k, reason: collision with root package name */
    private final int f295k;

    /* renamed from: l, reason: collision with root package name */
    private final int f296l;

    /* renamed from: m, reason: collision with root package name */
    private final int f297m;
    final l0 n;
    private PopupWindow.OnDismissListener q;
    private View r;
    View s;
    private m.a t;
    ViewTreeObserver u;
    private boolean v;
    private boolean w;
    private int x;
    private boolean z;
    final ViewTreeObserver.OnGlobalLayoutListener o = new a();
    private final View.OnAttachStateChangeListener p = new b();
    private int y = 0;

    /* compiled from: StandardMenuPopup.java */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!q.this.a() || q.this.n.B()) {
                return;
            }
            View view = q.this.s;
            if (view == null || !view.isShown()) {
                q.this.dismiss();
            } else {
                q.this.n.b();
            }
        }
    }

    /* compiled from: StandardMenuPopup.java */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = q.this.u;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    q.this.u = view.getViewTreeObserver();
                }
                q qVar = q.this;
                qVar.u.removeGlobalOnLayoutListener(qVar.o);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public q(Context context, g gVar, View view, int i2, int i3, boolean z) {
        this.f291g = context;
        this.f292h = gVar;
        this.f294j = z;
        this.f293i = new f(gVar, LayoutInflater.from(context), z, f290f);
        this.f296l = i2;
        this.f297m = i3;
        Resources resources = context.getResources();
        this.f295k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(c.a.d.f2462d));
        this.r = view;
        this.n = new l0(context, null, i2, i3);
        gVar.c(this, context);
    }

    private boolean z() {
        View view;
        if (a()) {
            return true;
        }
        if (this.v || (view = this.r) == null) {
            return false;
        }
        this.s = view;
        this.n.K(this);
        this.n.L(this);
        this.n.J(true);
        View view2 = this.s;
        boolean z = this.u == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.u = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.o);
        }
        view2.addOnAttachStateChangeListener(this.p);
        this.n.D(view2);
        this.n.G(this.y);
        if (!this.w) {
            this.x = k.o(this.f293i, null, this.f291g, this.f295k);
            this.w = true;
        }
        this.n.F(this.x);
        this.n.I(2);
        this.n.H(n());
        this.n.b();
        ListView listViewJ = this.n.j();
        listViewJ.setOnKeyListener(this);
        if (this.z && this.f292h.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f291g).inflate(c.a.g.f2505l, (ViewGroup) listViewJ, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f292h.x());
            }
            frameLayout.setEnabled(false);
            listViewJ.addHeaderView(frameLayout, null, false);
        }
        this.n.p(this.f293i);
        this.n.b();
        return true;
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean a() {
        return !this.v && this.n.a();
    }

    @Override // androidx.appcompat.view.menu.p
    public void b() {
        if (!z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void c(g gVar, boolean z) {
        if (gVar != this.f292h) {
            return;
        }
        dismiss();
        m.a aVar = this.t;
        if (aVar != null) {
            aVar.c(gVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void d(boolean z) {
        this.w = false;
        f fVar = this.f293i;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        if (a()) {
            this.n.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(m.a aVar) {
        this.t = aVar;
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView j() {
        return this.n.j();
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean k(r rVar) {
        if (rVar.hasVisibleItems()) {
            l lVar = new l(this.f291g, rVar, this.s, this.f294j, this.f296l, this.f297m);
            lVar.j(this.t);
            lVar.g(k.x(rVar));
            lVar.i(this.q);
            this.q = null;
            this.f292h.e(false);
            int iD = this.n.d();
            int iO = this.n.o();
            if ((Gravity.getAbsoluteGravity(this.y, t.B(this.r)) & 7) == 5) {
                iD += this.r.getWidth();
            }
            if (lVar.n(iD, iO)) {
                m.a aVar = this.t;
                if (aVar == null) {
                    return true;
                }
                aVar.d(rVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.k
    public void l(g gVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.v = true;
        this.f292h.close();
        ViewTreeObserver viewTreeObserver = this.u;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.u = this.s.getViewTreeObserver();
            }
            this.u.removeGlobalOnLayoutListener(this.o);
            this.u = null;
        }
        this.s.removeOnAttachStateChangeListener(this.p);
        PopupWindow.OnDismissListener onDismissListener = this.q;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.k
    public void p(View view) {
        this.r = view;
    }

    @Override // androidx.appcompat.view.menu.k
    public void r(boolean z) {
        this.f293i.d(z);
    }

    @Override // androidx.appcompat.view.menu.k
    public void s(int i2) {
        this.y = i2;
    }

    @Override // androidx.appcompat.view.menu.k
    public void t(int i2) {
        this.n.f(i2);
    }

    @Override // androidx.appcompat.view.menu.k
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.q = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public void v(boolean z) {
        this.z = z;
    }

    @Override // androidx.appcompat.view.menu.k
    public void w(int i2) {
        this.n.l(i2);
    }
}