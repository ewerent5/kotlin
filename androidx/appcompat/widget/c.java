package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionMenuView;
import c.h.l.b;
import java.util.ArrayList;

/* compiled from: ActionMenuPresenter.java */
/* loaded from: classes.dex */
class c extends androidx.appcompat.view.menu.b implements b.a {
    private int A;
    private final SparseBooleanArray B;
    e C;
    a D;
    RunnableC0004c E;
    private b F;
    final f G;
    int H;
    d o;
    private Drawable p;
    private boolean q;
    private boolean r;
    private boolean s;
    private int t;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    /* compiled from: ActionMenuPresenter.java */
    private class a extends androidx.appcompat.view.menu.l {
        public a(Context context, androidx.appcompat.view.menu.r rVar, View view) {
            super(context, rVar, view, false, c.a.a.f2451l);
            if (!((androidx.appcompat.view.menu.i) rVar.getItem()).l()) {
                View view2 = c.this.o;
                f(view2 == null ? (View) ((androidx.appcompat.view.menu.b) c.this).f201m : view2);
            }
            j(c.this.G);
        }

        @Override // androidx.appcompat.view.menu.l
        protected void e() {
            c cVar = c.this;
            cVar.D = null;
            cVar.H = 0;
            super.e();
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public androidx.appcompat.view.menu.p a() {
            a aVar = c.this.D;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    /* renamed from: androidx.appcompat.widget.c$c, reason: collision with other inner class name */
    private class RunnableC0004c implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        private e f427e;

        public RunnableC0004c(e eVar) {
            this.f427e = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.b) c.this).f195g != null) {
                ((androidx.appcompat.view.menu.b) c.this).f195g.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.b) c.this).f201m;
            if (view != null && view.getWindowToken() != null && this.f427e.m()) {
                c.this.C = this.f427e;
            }
            c.this.E = null;
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    private class d extends o implements ActionMenuView.a {

        /* compiled from: ActionMenuPresenter.java */
        class a extends h0 {
            final /* synthetic */ c n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, c cVar) {
                super(view);
                this.n = cVar;
            }

            @Override // androidx.appcompat.widget.h0
            public androidx.appcompat.view.menu.p c() {
                e eVar = c.this.C;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // androidx.appcompat.widget.h0
            public boolean d() {
                c.this.K();
                return true;
            }

            @Override // androidx.appcompat.widget.h0
            public boolean e() {
                c cVar = c.this;
                if (cVar.E != null) {
                    return false;
                }
                cVar.B();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, c.a.a.f2450k);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            y0.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean c() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.K();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i2, int i3, int i4, int i5) {
            boolean frame = super.setFrame(i2, i3, i4, i5);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.l(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    private class e extends androidx.appcompat.view.menu.l {
        public e(Context context, androidx.appcompat.view.menu.g gVar, View view, boolean z) {
            super(context, gVar, view, z, c.a.a.f2451l);
            h(8388613);
            j(c.this.G);
        }

        @Override // androidx.appcompat.view.menu.l
        protected void e() {
            if (((androidx.appcompat.view.menu.b) c.this).f195g != null) {
                ((androidx.appcompat.view.menu.b) c.this).f195g.close();
            }
            c.this.C = null;
            super.e();
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    private class f implements m.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void c(androidx.appcompat.view.menu.g gVar, boolean z) {
            if (gVar instanceof androidx.appcompat.view.menu.r) {
                gVar.D().e(false);
            }
            m.a aVarM = c.this.m();
            if (aVarM != null) {
                aVarM.c(gVar, z);
            }
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean d(androidx.appcompat.view.menu.g gVar) {
            if (gVar == ((androidx.appcompat.view.menu.b) c.this).f195g) {
                return false;
            }
            c.this.H = ((androidx.appcompat.view.menu.r) gVar).getItem().getItemId();
            m.a aVarM = c.this.m();
            if (aVarM != null) {
                return aVarM.d(gVar);
            }
            return false;
        }
    }

    public c(Context context) {
        super(context, c.a.g.f2496c, c.a.g.f2495b);
        this.B = new SparseBooleanArray();
        this.G = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f201m;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof n.a) && ((n.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable A() {
        d dVar = this.o;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.q) {
            return this.p;
        }
        return null;
    }

    public boolean B() {
        Object obj;
        RunnableC0004c runnableC0004c = this.E;
        if (runnableC0004c != null && (obj = this.f201m) != null) {
            ((View) obj).removeCallbacks(runnableC0004c);
            this.E = null;
            return true;
        }
        e eVar = this.C;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean C() {
        a aVar = this.D;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean D() {
        return this.E != null || E();
    }

    public boolean E() {
        e eVar = this.C;
        return eVar != null && eVar.d();
    }

    public void F(Configuration configuration) {
        if (!this.w) {
            this.v = c.a.o.a.b(this.f194f).d();
        }
        androidx.appcompat.view.menu.g gVar = this.f195g;
        if (gVar != null) {
            gVar.K(true);
        }
    }

    public void G(boolean z) {
        this.z = z;
    }

    public void H(ActionMenuView actionMenuView) {
        this.f201m = actionMenuView;
        actionMenuView.b(this.f195g);
    }

    public void I(Drawable drawable) {
        d dVar = this.o;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.q = true;
            this.p = drawable;
        }
    }

    public void J(boolean z) {
        this.r = z;
        this.s = true;
    }

    public boolean K() {
        androidx.appcompat.view.menu.g gVar;
        if (!this.r || E() || (gVar = this.f195g) == null || this.f201m == null || this.E != null || gVar.z().isEmpty()) {
            return false;
        }
        RunnableC0004c runnableC0004c = new RunnableC0004c(new e(this.f194f, this.f195g, this.o, true));
        this.E = runnableC0004c;
        ((View) this.f201m).post(runnableC0004c);
        return true;
    }

    @Override // androidx.appcompat.view.menu.b
    public void b(androidx.appcompat.view.menu.i iVar, n.a aVar) {
        aVar.e(iVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f201m);
        if (this.F == null) {
            this.F = new b();
        }
        actionMenuItemView.setPopupCallback(this.F);
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void c(androidx.appcompat.view.menu.g gVar, boolean z) {
        y();
        super.c(gVar, z);
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void d(boolean z) {
        super.d(z);
        ((View) this.f201m).requestLayout();
        androidx.appcompat.view.menu.g gVar = this.f195g;
        boolean z2 = false;
        if (gVar != null) {
            ArrayList<androidx.appcompat.view.menu.i> arrayListS = gVar.s();
            int size = arrayListS.size();
            for (int i2 = 0; i2 < size; i2++) {
                c.h.l.b bVarB = arrayListS.get(i2).b();
                if (bVarB != null) {
                    bVarB.i(this);
                }
            }
        }
        androidx.appcompat.view.menu.g gVar2 = this.f195g;
        ArrayList<androidx.appcompat.view.menu.i> arrayListZ = gVar2 != null ? gVar2.z() : null;
        if (this.r && arrayListZ != null) {
            int size2 = arrayListZ.size();
            if (size2 == 1) {
                z2 = !arrayListZ.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.o == null) {
                this.o = new d(this.f193e);
            }
            ViewGroup viewGroup = (ViewGroup) this.o.getParent();
            if (viewGroup != this.f201m) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.o);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f201m;
                actionMenuView.addView(this.o, actionMenuView.F());
            }
        } else {
            d dVar = this.o;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.f201m;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.o);
                }
            }
        }
        ((ActionMenuView) this.f201m).setOverflowReserved(this.r);
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean e() {
        ArrayList<androidx.appcompat.view.menu.i> arrayListE;
        int size;
        int i2;
        int iL;
        int i3;
        c cVar = this;
        androidx.appcompat.view.menu.g gVar = cVar.f195g;
        View view = null;
        int i4 = 0;
        if (gVar != null) {
            arrayListE = gVar.E();
            size = arrayListE.size();
        } else {
            arrayListE = null;
            size = 0;
        }
        int i5 = cVar.v;
        int i6 = cVar.u;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f201m;
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            androidx.appcompat.view.menu.i iVar = arrayListE.get(i9);
            if (iVar.o()) {
                i7++;
            } else if (iVar.n()) {
                i8++;
            } else {
                z = true;
            }
            if (cVar.z && iVar.isActionViewExpanded()) {
                i5 = 0;
            }
        }
        if (cVar.r && (z || i8 + i7 > i5)) {
            i5--;
        }
        int i10 = i5 - i7;
        SparseBooleanArray sparseBooleanArray = cVar.B;
        sparseBooleanArray.clear();
        if (cVar.x) {
            int i11 = cVar.A;
            iL = i6 / i11;
            i2 = i11 + ((i6 % i11) / iL);
        } else {
            i2 = 0;
            iL = 0;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            androidx.appcompat.view.menu.i iVar2 = arrayListE.get(i12);
            if (iVar2.o()) {
                View viewN = cVar.n(iVar2, view, viewGroup);
                if (cVar.x) {
                    iL -= ActionMenuView.L(viewN, i2, iL, iMakeMeasureSpec, i4);
                } else {
                    viewN.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewN.getMeasuredWidth();
                i6 -= measuredWidth;
                if (i13 == 0) {
                    i13 = measuredWidth;
                }
                int groupId = iVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                iVar2.u(true);
                i3 = size;
            } else if (iVar2.n()) {
                int groupId2 = iVar2.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId2);
                boolean z3 = (i10 > 0 || z2) && i6 > 0 && (!cVar.x || iL > 0);
                boolean z4 = z3;
                i3 = size;
                if (z3) {
                    View viewN2 = cVar.n(iVar2, null, viewGroup);
                    if (cVar.x) {
                        int iL2 = ActionMenuView.L(viewN2, i2, iL, iMakeMeasureSpec, 0);
                        iL -= iL2;
                        if (iL2 == 0) {
                            z4 = false;
                        }
                    } else {
                        viewN2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z5 = z4;
                    int measuredWidth2 = viewN2.getMeasuredWidth();
                    i6 -= measuredWidth2;
                    if (i13 == 0) {
                        i13 = measuredWidth2;
                    }
                    z3 = z5 & (!cVar.x ? i6 + i13 <= 0 : i6 < 0);
                }
                if (z3 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i14 = 0; i14 < i12; i14++) {
                        androidx.appcompat.view.menu.i iVar3 = arrayListE.get(i14);
                        if (iVar3.getGroupId() == groupId2) {
                            if (iVar3.l()) {
                                i10++;
                            }
                            iVar3.u(false);
                        }
                    }
                }
                if (z3) {
                    i10--;
                }
                iVar2.u(z3);
            } else {
                i3 = size;
                iVar2.u(false);
                i12++;
                view = null;
                cVar = this;
                size = i3;
                i4 = 0;
            }
            i12++;
            view = null;
            cVar = this;
            size = i3;
            i4 = 0;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void i(Context context, androidx.appcompat.view.menu.g gVar) {
        super.i(context, gVar);
        Resources resources = context.getResources();
        c.a.o.a aVarB = c.a.o.a.b(context);
        if (!this.s) {
            this.r = aVarB.h();
        }
        if (!this.y) {
            this.t = aVarB.c();
        }
        if (!this.w) {
            this.v = aVarB.d();
        }
        int measuredWidth = this.t;
        if (this.r) {
            if (this.o == null) {
                d dVar = new d(this.f193e);
                this.o = dVar;
                if (this.q) {
                    dVar.setImageDrawable(this.p);
                    this.p = null;
                    this.q = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.o.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.o.getMeasuredWidth();
        } else {
            this.o = null;
        }
        this.u = measuredWidth;
        this.A = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public boolean k(androidx.appcompat.view.menu.r rVar) {
        boolean z = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.r rVar2 = rVar;
        while (rVar2.e0() != this.f195g) {
            rVar2 = (androidx.appcompat.view.menu.r) rVar2.e0();
        }
        View viewZ = z(rVar2.getItem());
        if (viewZ == null) {
            return false;
        }
        this.H = rVar.getItem().getItemId();
        int size = rVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            MenuItem item = rVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i2++;
        }
        a aVar = new a(this.f194f, rVar, viewZ);
        this.D = aVar;
        aVar.g(z);
        this.D.k();
        super.k(rVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean l(ViewGroup viewGroup, int i2) {
        if (viewGroup.getChildAt(i2) == this.o) {
            return false;
        }
        return super.l(viewGroup, i2);
    }

    @Override // androidx.appcompat.view.menu.b
    public View n(androidx.appcompat.view.menu.i iVar, View view, ViewGroup viewGroup) {
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.j()) {
            actionView = super.n(iVar, view, viewGroup);
        }
        actionView.setVisibility(iVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.b
    public androidx.appcompat.view.menu.n o(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.n nVar = this.f201m;
        androidx.appcompat.view.menu.n nVarO = super.o(viewGroup);
        if (nVar != nVarO) {
            ((ActionMenuView) nVarO).setPresenter(this);
        }
        return nVarO;
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean q(int i2, androidx.appcompat.view.menu.i iVar) {
        return iVar.l();
    }

    public boolean y() {
        return B() | C();
    }
}