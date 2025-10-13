package com.parizene.netmonitor.ui.map;

import android.content.Context;
import android.content.DialogInterface;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.b;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.ui.map.LocationViewBinder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class MapFragment extends com.parizene.netmonitor.ui.u0 implements o0, c0 {
    org.greenrobot.eventbus.c b0;
    t0 c0;
    u d0;
    com.parizene.netmonitor.db.celllog.b e0;
    com.parizene.netmonitor.k0.e f0;
    com.parizene.netmonitor.x g0;
    Handler h0;
    Handler i0;
    private k0 j0;
    private f0 k0;
    private View l0;
    private LocationViewBinder m0;

    @BindView
    ViewStub mBannerStub;

    @BindView
    TextView mCountView;

    @BindView
    FrameLayout mLocationInfoContainer;

    @BindView
    ViewGroup mMapContainer;

    @BindView
    View mMyLocationView;
    private LocationViewBinder.ViewHolder n0;
    private View o0;
    private Menu p0;
    private e0 q0;
    private a0 r0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void O2(View view) {
        this.j0.C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void Q2(View view) {
        this.j0.q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void S2(DialogInterface dialogInterface, int i2) {
        this.j0.r(i2);
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void U2(DialogInterface dialogInterface, int i2) {
        this.j0.y(i2);
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V2, reason: merged with bridge method [inline-methods] */
    public void M2() {
        this.j0.j(this.r0.L());
    }

    @Override // com.parizene.netmonitor.ui.map.o0
    public g0 A() {
        a0 a0Var = this.r0;
        if (a0Var == null) {
            return null;
        }
        return a0Var.A();
    }

    @Override // com.parizene.netmonitor.ui.map.o0
    public void B() {
        if (this.mLocationInfoContainer.getChildCount() > 0) {
            this.mLocationInfoContainer.removeView(this.l0);
        }
    }

    @Override // com.parizene.netmonitor.ui.u0, androidx.fragment.app.Fragment
    public void B1() {
        super.B1();
        this.q0.onPause();
    }

    @Override // com.parizene.netmonitor.ui.map.o0
    public void C(s sVar, s sVar2, long j2, g0 g0Var, int i2, boolean z) {
        a0 a0Var = this.r0;
        if (a0Var == null) {
            return;
        }
        a0Var.i(sVar, sVar2, j2, i2, z, this.k0, g0Var);
    }

    @Override // androidx.fragment.app.Fragment
    public void D1(Menu menu) {
        this.j0.z();
    }

    @Override // com.parizene.netmonitor.ui.u0, androidx.fragment.app.Fragment
    public void G1() {
        super.G1();
        this.q0.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void H1(Bundle bundle) {
        super.H1(bundle);
        this.j0.t(bundle);
        this.q0.r(bundle);
    }

    @Override // com.parizene.netmonitor.ui.u0, androidx.fragment.app.Fragment
    public void I1() {
        super.I1();
        this.q0.h();
    }

    @Override // com.parizene.netmonitor.ui.u0
    protected String I2() {
        return "MAP";
    }

    @Override // com.parizene.netmonitor.ui.u0, androidx.fragment.app.Fragment
    public void J1() {
        super.J1();
        this.q0.l();
    }

    @Override // com.parizene.netmonitor.ui.u0
    protected void J2() {
        super.J2();
        this.j0.a();
    }

    @Override // com.parizene.netmonitor.ui.map.o0
    public void K(m0 m0Var, Bundle bundle) {
        androidx.fragment.app.d dVarJ0 = j0();
        if (m0.GOOGLE_MAPS == m0Var) {
            this.q0 = new x(dVarJ0);
        } else {
            this.q0 = new s0(dVarJ0, this.h0);
        }
        this.q0.k(this.mMapContainer, new ViewGroup.LayoutParams(-1, -1));
        this.q0.z(bundle);
        this.q0.i(this);
    }

    @Override // com.parizene.netmonitor.ui.u0
    protected void K2() {
        super.K2();
        this.j0.b();
    }

    @Override // com.parizene.netmonitor.ui.map.o0
    public void M() {
        View view = this.o0;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // com.parizene.netmonitor.ui.map.o0
    public void N() {
        a0 a0Var = this.r0;
        if (a0Var != null) {
            a0Var.destroy();
            this.r0 = null;
        }
        this.q0.onDestroy();
        this.q0.j(this.mMapContainer);
        this.q0 = null;
    }

    @Override // com.parizene.netmonitor.ui.map.o0
    public b0 O(s sVar, g0 g0Var, int i2, boolean z) {
        if (this.r0 == null) {
            return null;
        }
        String strI = sVar.i(g0Var, i2, z);
        String strH = sVar.h();
        g0 g0VarF = sVar.f();
        this.k0.g(sVar.f13980b);
        return this.r0.h(strI, strH, g0VarF, this.k0.f(sVar.e(i2, z)), sVar.b());
    }

    @Override // com.parizene.netmonitor.ui.map.o0
    public void P(Location location) {
        if (this.l0 == null) {
            View viewInflate = y0().inflate(R.layout.layout_location, (ViewGroup) null);
            this.l0 = viewInflate;
            this.n0 = new LocationViewBinder.ViewHolder(viewInflate);
        }
        if (this.mLocationInfoContainer.getChildCount() == 0) {
            this.mLocationInfoContainer.addView(this.l0, new FrameLayout.LayoutParams(-1, -2));
        }
        this.m0.a(this.n0, location);
    }

    @Override // com.parizene.netmonitor.ui.map.o0
    public void S(m0 m0Var) {
        this.q0.onPause();
        this.q0.l();
        N();
        K(m0Var, null);
        this.q0.h();
        this.q0.onResume();
    }

    @Override // com.parizene.netmonitor.ui.map.o0
    public void T(Map<Long, s> map) {
        if (this.r0 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<s> it = map.values().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f13981c);
        }
        this.r0.g(arrayList);
    }

    @Override // com.parizene.netmonitor.ui.map.o0
    public void b(b0 b0Var) {
        a0 a0Var = this.r0;
        if (a0Var == null) {
            return;
        }
        a0Var.b(b0Var);
    }

    @Override // com.parizene.netmonitor.ui.map.o0
    public void c(g0 g0Var) {
        a0 a0Var = this.r0;
        if (a0Var == null) {
            return;
        }
        a0Var.c(g0Var);
    }

    @Override // com.parizene.netmonitor.ui.map.o0
    public void d0(int i2, boolean z) {
        this.mMyLocationView.setVisibility(0);
        this.mCountView.setVisibility(0);
        s(i2);
        y(z);
        this.j0.C();
        this.r0.f(new y() { // from class: com.parizene.netmonitor.ui.map.i
            @Override // com.parizene.netmonitor.ui.map.y
            public final void a() {
                this.a.M2();
            }
        });
    }

    @Override // com.parizene.netmonitor.ui.map.o0
    public void e(g0 g0Var) {
        a0 a0Var = this.r0;
        if (a0Var == null) {
            return;
        }
        a0Var.e(g0Var);
    }

    @Override // com.parizene.netmonitor.ui.map.o0
    public void e0(j0 j0Var) {
        this.p0.findItem(R.id.menu_autocenter).setChecked(j0Var.a);
        MenuItem menuItemFindItem = this.p0.findItem(R.id.menu_map_source);
        menuItemFindItem.setVisible(j0Var.f13947b);
        menuItemFindItem.setTitle(j0Var.f13948c);
        this.p0.findItem(R.id.menu_map_mode).setVisible(j0Var.f13949d);
    }

    @Override // com.parizene.netmonitor.ui.map.o0
    public void f() {
        this.q0.f();
    }

    @Override // com.parizene.netmonitor.ui.map.o0
    public void g() {
        this.q0.g();
    }

    @Override // androidx.fragment.app.Fragment
    public void i1(Context context) {
        f.b.f.a.b(this);
        super.i1(context);
        t2(true);
        this.j0 = new l0(this.b0, this.c0, this.d0, this.e0, this.f0, this.g0, this.h0, this.i0);
        this.k0 = new f0(j0());
    }

    @Override // com.parizene.netmonitor.ui.map.o0
    public void j(int i2) {
        b.a aVar = new b.a(j0());
        aVar.t(R.string.combine_by_sector);
        aVar.q(R.array.combine_by_sector_types, i2, new DialogInterface.OnClickListener() { // from class: com.parizene.netmonitor.ui.map.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                this.f13944e.S2(dialogInterface, i3);
            }
        });
        aVar.a().show();
    }

    @Override // com.parizene.netmonitor.ui.map.o0
    public void o(int i2) {
        this.mCountView.setText(String.valueOf(i2));
    }

    @Override // androidx.fragment.app.Fragment
    public void o1(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.map_menu, menu);
        this.p0 = menu;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.q0.onLowMemory();
    }

    @Override // com.parizene.netmonitor.ui.map.o0
    public void p(int i2) {
        b.a aVar = new b.a(j0());
        aVar.t(R.string.map_type);
        aVar.q(R.array.map_types, i2, new DialogInterface.OnClickListener() { // from class: com.parizene.netmonitor.ui.map.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                this.f13946e.U2(dialogInterface, i3);
            }
        });
        aVar.a().show();
    }

    @Override // androidx.fragment.app.Fragment
    public View p1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws NoSuchMethodException, SecurityException {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_map, viewGroup, false);
        ButterKnife.a(this, viewInflate);
        this.mMyLocationView.setOnClickListener(new View.OnClickListener() { // from class: com.parizene.netmonitor.ui.map.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13950e.O2(view);
            }
        });
        this.mMyLocationView.setVisibility(8);
        this.mCountView.setVisibility(8);
        this.m0 = new LocationViewBinder();
        this.j0.D(this, bundle);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void r1() {
        this.p0 = null;
    }

    @Override // com.parizene.netmonitor.ui.map.o0
    public void s(int i2) {
        a0 a0Var = this.r0;
        if (a0Var == null) {
            return;
        }
        a0Var.s(i2);
    }

    @Override // androidx.fragment.app.Fragment
    public void s1() {
        super.s1();
        this.j0.u();
    }

    @Override // com.parizene.netmonitor.ui.map.c0
    public void v(a0 a0Var) {
        this.r0 = a0Var;
        this.j0.k();
    }

    @Override // com.parizene.netmonitor.ui.map.o0
    public void w() {
        if (this.o0 != null) {
            return;
        }
        View viewInflate = this.mBannerStub.inflate();
        this.o0 = viewInflate;
        ((TextView) viewInflate.findViewById(R.id.text)).setText(Html.fromHtml(L0(R.string.map_banner_text)));
        this.o0.findViewById(R.id.close).setOnClickListener(new View.OnClickListener() { // from class: com.parizene.netmonitor.ui.map.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13942e.Q2(view);
            }
        });
    }

    @Override // com.parizene.netmonitor.ui.map.o0
    public void y(boolean z) {
        a0 a0Var = this.r0;
        if (a0Var == null) {
            return;
        }
        a0Var.y(z);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean z1(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.menu_autocenter /* 2131296608 */:
                this.j0.g();
                break;
            case R.id.menu_combine_by_sector /* 2131296609 */:
                this.j0.i();
                break;
            case R.id.menu_map_mode /* 2131296615 */:
                this.j0.x();
                break;
            case R.id.menu_map_source /* 2131296616 */:
                this.j0.n();
                break;
        }
        return true;
    }
}