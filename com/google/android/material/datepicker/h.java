package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes.dex */
public final class h<S> extends p<S> {
    static final Object c0 = "MONTHS_VIEW_GROUP_TAG";
    static final Object d0 = "NAVIGATION_PREV_TAG";
    static final Object e0 = "NAVIGATION_NEXT_TAG";
    static final Object f0 = "SELECTOR_TOGGLE_TAG";
    private int g0;
    private com.google.android.material.datepicker.d<S> h0;
    private com.google.android.material.datepicker.a i0;
    private com.google.android.material.datepicker.l j0;
    private k k0;
    private com.google.android.material.datepicker.c l0;
    private RecyclerView m0;
    private RecyclerView n0;
    private View o0;
    private View p0;

    /* compiled from: MaterialCalendar.java */
    class a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f11576e;

        a(int i2) {
            this.f11576e = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.n0.q1(this.f11576e);
        }
    }

    /* compiled from: MaterialCalendar.java */
    class b extends c.h.l.a {
        b() {
        }

        @Override // c.h.l.a
        public void g(View view, c.h.l.c0.c cVar) {
            super.g(view, cVar);
            cVar.a0(null);
        }
    }

    /* compiled from: MaterialCalendar.java */
    class c extends q {
        final /* synthetic */ int M;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, int i2, boolean z, int i3) {
            super(context, i2, z);
            this.M = i3;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void V1(RecyclerView.a0 a0Var, int[] iArr) {
            if (this.M == 0) {
                iArr[0] = h.this.n0.getWidth();
                iArr[1] = h.this.n0.getWidth();
            } else {
                iArr[0] = h.this.n0.getHeight();
                iArr[1] = h.this.n0.getHeight();
            }
        }
    }

    /* compiled from: MaterialCalendar.java */
    class d implements l {
        d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.datepicker.h.l
        public void a(long j2) {
            if (h.this.i0.i().t(j2)) {
                h.this.h0.G(j2);
                Iterator<o<S>> it = h.this.b0.iterator();
                while (it.hasNext()) {
                    it.next().a(h.this.h0.y());
                }
                h.this.n0.getAdapter().j();
                if (h.this.m0 != null) {
                    h.this.m0.getAdapter().j();
                }
            }
        }
    }

    /* compiled from: MaterialCalendar.java */
    class e extends RecyclerView.n {
        private final Calendar a = s.k();

        /* renamed from: b, reason: collision with root package name */
        private final Calendar f11579b = s.k();

        e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            if ((recyclerView.getAdapter() instanceof t) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                t tVar = (t) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (c.h.k.d<Long, Long> dVar : h.this.h0.f()) {
                    Long l2 = dVar.a;
                    if (l2 != null && dVar.f3105b != null) {
                        this.a.setTimeInMillis(l2.longValue());
                        this.f11579b.setTimeInMillis(dVar.f3105b.longValue());
                        int iD = tVar.D(this.a.get(1));
                        int iD2 = tVar.D(this.f11579b.get(1));
                        View viewM = gridLayoutManager.M(iD);
                        View viewM2 = gridLayoutManager.M(iD2);
                        int iG3 = iD / gridLayoutManager.g3();
                        int iG32 = iD2 / gridLayoutManager.g3();
                        int i2 = iG3;
                        while (i2 <= iG32) {
                            if (gridLayoutManager.M(gridLayoutManager.g3() * i2) != null) {
                                canvas.drawRect(i2 == iG3 ? viewM.getLeft() + (viewM.getWidth() / 2) : 0, r9.getTop() + h.this.l0.f11566d.c(), i2 == iG32 ? viewM2.getLeft() + (viewM2.getWidth() / 2) : recyclerView.getWidth(), r9.getBottom() - h.this.l0.f11566d.b(), h.this.l0.f11570h);
                            }
                            i2++;
                        }
                    }
                }
            }
        }
    }

    /* compiled from: MaterialCalendar.java */
    class f extends c.h.l.a {
        f() {
        }

        @Override // c.h.l.a
        public void g(View view, c.h.l.c0.c cVar) {
            super.g(view, cVar);
            cVar.j0(h.this.p0.getVisibility() == 0 ? h.this.L0(e.c.b.c.j.s) : h.this.L0(e.c.b.c.j.q));
        }
    }

    /* compiled from: MaterialCalendar.java */
    class g extends RecyclerView.t {
        final /* synthetic */ n a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MaterialButton f11582b;

        g(n nVar, MaterialButton materialButton) {
            this.a = nVar;
            this.f11582b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i2) {
            if (i2 == 0) {
                CharSequence text = this.f11582b.getText();
                if (Build.VERSION.SDK_INT >= 16) {
                    recyclerView.announceForAccessibility(text);
                } else {
                    recyclerView.sendAccessibilityEvent(2048);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int i2, int i3) {
            int iI2 = i2 < 0 ? h.this.Y2().i2() : h.this.Y2().l2();
            h.this.j0 = this.a.C(iI2);
            this.f11582b.setText(this.a.D(iI2));
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.h$h, reason: collision with other inner class name */
    class ViewOnClickListenerC0119h implements View.OnClickListener {
        ViewOnClickListenerC0119h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h.this.d3();
        }
    }

    /* compiled from: MaterialCalendar.java */
    class i implements View.OnClickListener {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ n f11585e;

        i(n nVar) {
            this.f11585e = nVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iI2 = h.this.Y2().i2() + 1;
            if (iI2 < h.this.n0.getAdapter().e()) {
                h.this.b3(this.f11585e.C(iI2));
            }
        }
    }

    /* compiled from: MaterialCalendar.java */
    class j implements View.OnClickListener {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ n f11587e;

        j(n nVar) {
            this.f11587e = nVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iL2 = h.this.Y2().l2() - 1;
            if (iL2 >= 0) {
                h.this.b3(this.f11587e.C(iL2));
            }
        }
    }

    /* compiled from: MaterialCalendar.java */
    enum k {
        DAY,
        YEAR
    }

    /* compiled from: MaterialCalendar.java */
    interface l {
        void a(long j2);
    }

    private void R2(View view, n nVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(e.c.b.c.f.p);
        materialButton.setTag(f0);
        c.h.l.t.k0(materialButton, new f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(e.c.b.c.f.r);
        materialButton2.setTag(d0);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(e.c.b.c.f.q);
        materialButton3.setTag(e0);
        this.o0 = view.findViewById(e.c.b.c.f.z);
        this.p0 = view.findViewById(e.c.b.c.f.u);
        c3(k.DAY);
        materialButton.setText(this.j0.v(view.getContext()));
        this.n0.k(new g(nVar, materialButton));
        materialButton.setOnClickListener(new ViewOnClickListenerC0119h());
        materialButton3.setOnClickListener(new i(nVar));
        materialButton2.setOnClickListener(new j(nVar));
    }

    private RecyclerView.n S2() {
        return new e();
    }

    static int X2(Context context) {
        return context.getResources().getDimensionPixelSize(e.c.b.c.d.F);
    }

    public static <T> h<T> Z2(com.google.android.material.datepicker.d<T> dVar, int i2, com.google.android.material.datepicker.a aVar) {
        h<T> hVar = new h<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.s());
        hVar.s2(bundle);
        return hVar;
    }

    private void a3(int i2) {
        this.n0.post(new a(i2));
    }

    @Override // androidx.fragment.app.Fragment
    public void H1(Bundle bundle) {
        super.H1(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.g0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.h0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.i0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.j0);
    }

    @Override // com.google.android.material.datepicker.p
    public boolean I2(o<S> oVar) {
        return super.I2(oVar);
    }

    com.google.android.material.datepicker.a T2() {
        return this.i0;
    }

    com.google.android.material.datepicker.c U2() {
        return this.l0;
    }

    com.google.android.material.datepicker.l V2() {
        return this.j0;
    }

    public com.google.android.material.datepicker.d<S> W2() {
        return this.h0;
    }

    LinearLayoutManager Y2() {
        return (LinearLayoutManager) this.n0.getLayoutManager();
    }

    void b3(com.google.android.material.datepicker.l lVar) {
        n nVar = (n) this.n0.getAdapter();
        int iE = nVar.E(lVar);
        int iE2 = iE - nVar.E(this.j0);
        boolean z = Math.abs(iE2) > 3;
        boolean z2 = iE2 > 0;
        this.j0 = lVar;
        if (z && z2) {
            this.n0.i1(iE - 3);
            a3(iE);
        } else if (!z) {
            a3(iE);
        } else {
            this.n0.i1(iE + 3);
            a3(iE);
        }
    }

    void c3(k kVar) {
        this.k0 = kVar;
        if (kVar == k.YEAR) {
            this.m0.getLayoutManager().F1(((t) this.m0.getAdapter()).D(this.j0.f11597g));
            this.o0.setVisibility(0);
            this.p0.setVisibility(8);
        } else if (kVar == k.DAY) {
            this.o0.setVisibility(8);
            this.p0.setVisibility(0);
            b3(this.j0);
        }
    }

    void d3() {
        k kVar = this.k0;
        k kVar2 = k.YEAR;
        if (kVar == kVar2) {
            c3(k.DAY);
        } else if (kVar == k.DAY) {
            c3(kVar2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void l1(Bundle bundle) {
        super.l1(bundle);
        if (bundle == null) {
            bundle = o0();
        }
        this.g0 = bundle.getInt("THEME_RES_ID_KEY");
        this.h0 = (com.google.android.material.datepicker.d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.i0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.j0 = (com.google.android.material.datepicker.l) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View p1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        int i2;
        int i3;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(q0(), this.g0);
        this.l0 = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        com.google.android.material.datepicker.l lVarV = this.i0.v();
        if (com.google.android.material.datepicker.i.i3(contextThemeWrapper)) {
            i2 = e.c.b.c.h.r;
            i3 = 1;
        } else {
            i2 = e.c.b.c.h.p;
            i3 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i2, viewGroup, false);
        GridView gridView = (GridView) viewInflate.findViewById(e.c.b.c.f.v);
        c.h.l.t.k0(gridView, new b());
        gridView.setAdapter((ListAdapter) new com.google.android.material.datepicker.g());
        gridView.setNumColumns(lVarV.f11598h);
        gridView.setEnabled(false);
        this.n0 = (RecyclerView) viewInflate.findViewById(e.c.b.c.f.y);
        this.n0.setLayoutManager(new c(q0(), i3, false, i3));
        this.n0.setTag(c0);
        n nVar = new n(contextThemeWrapper, this.h0, this.i0, new d());
        this.n0.setAdapter(nVar);
        int integer = contextThemeWrapper.getResources().getInteger(e.c.b.c.g.f15215b);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(e.c.b.c.f.z);
        this.m0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.m0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.m0.setAdapter(new t(this));
            this.m0.h(S2());
        }
        if (viewInflate.findViewById(e.c.b.c.f.p) != null) {
            R2(viewInflate, nVar);
        }
        if (!com.google.android.material.datepicker.i.i3(contextThemeWrapper)) {
            new androidx.recyclerview.widget.q().b(this.n0);
        }
        this.n0.i1(nVar.E(this.j0));
        return viewInflate;
    }
}