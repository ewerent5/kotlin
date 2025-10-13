package com.parizene.netmonitor.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import ch.qos.logback.core.CoreConstants;
import com.androidplot.BuildConfig;
import com.google.android.material.tabs.TabLayout;
import com.parizene.netmonitor.App;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.k0.d;
import com.parizene.netmonitor.ui.e1;
import java.util.Objects;

/* compiled from: HomeFragment.kt */
/* loaded from: classes3.dex */
public final class HomeFragment extends Fragment implements f.b.e {
    public f.b.c<Object> b0;
    public com.parizene.netmonitor.x c0;
    public com.parizene.netmonitor.k0.e d0;
    public org.greenrobot.eventbus.c e0;
    public com.parizene.netmonitor.s0.c.c f0;
    public SharedPreferences g0;
    public Handler h0;
    public f.a<com.parizene.netmonitor.m0.x> i0;
    public f.a<com.parizene.netmonitor.q> j0;
    public f.a<l0> k0;
    private a l0;
    private ViewPager m0;
    private y0 n0;
    private TabLayout o0;
    private Toolbar p0;
    private k0 q0;
    private MenuItem r0;
    private Intent s0;
    private final SharedPreferences.OnSharedPreferenceChangeListener t0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.parizene.netmonitor.ui.e
        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            HomeFragment.W2(this.f13829e, sharedPreferences, str);
        }
    };
    private final Runnable u0 = new Runnable() { // from class: com.parizene.netmonitor.ui.d
        @Override // java.lang.Runnable
        public final void run() {
            HomeFragment.X2(this.f13827e);
        }
    };
    private final i.y.c.l<String, i.s> v0 = new c();

    /* compiled from: HomeFragment.kt */
    public interface a {
        void c();

        void s(boolean z);
    }

    /* compiled from: HomeFragment.kt */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[x0.valuesCustom().length];
            iArr[x0.CELL.ordinal()] = 1;
            iArr[x0.LOG.ordinal()] = 2;
            iArr[x0.MAP.ordinal()] = 3;
            iArr[x0.WIFI.ordinal()] = 4;
            a = iArr;
        }
    }

    /* compiled from: HomeFragment.kt */
    static final class c extends i.y.d.m implements i.y.c.l<String, i.s> {
        c() {
            super(1);
        }

        public final void a(String str) {
            i.y.d.l.d(str, "url");
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            HomeFragment.this.D2(intent);
        }

        @Override // i.y.c.l
        public /* bridge */ /* synthetic */ i.s invoke(String str) {
            a(str);
            return i.s.a;
        }
    }

    private final int N2(int i2) {
        int i3 = b.a[x0.valuesCustom()[i2].ordinal()];
        if (i3 == 1) {
            return R.drawable.ic_tab_cell;
        }
        if (i3 == 2) {
            return R.drawable.ic_tab_log;
        }
        if (i3 == 3) {
            return R.drawable.ic_tab_map;
        }
        if (i3 == 4) {
            return R.drawable.ic_tab_wifi;
        }
        throw new i.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W2(HomeFragment homeFragment, SharedPreferences sharedPreferences, String str) {
        i.y.d.l.d(homeFragment, "this$0");
        com.parizene.netmonitor.t0.b bVar = com.parizene.netmonitor.t0.f.f13719d;
        if (i.y.d.l.a(str, bVar.c())) {
            Boolean boolG = bVar.g();
            y0 y0Var = homeFragment.n0;
            if (y0Var == null) {
                i.y.d.l.m("adapter");
                throw null;
            }
            i.y.d.l.c(boolG, "scanWifi");
            y0Var.t(boolG.booleanValue());
            y0 y0Var2 = homeFragment.n0;
            if (y0Var2 == null) {
                i.y.d.l.m("adapter");
                throw null;
            }
            y0Var2.i();
            TabLayout tabLayout = homeFragment.o0;
            if (tabLayout == null) {
                i.y.d.l.m("tabLayout");
                throw null;
            }
            ViewPager viewPager = homeFragment.m0;
            if (viewPager == null) {
                i.y.d.l.m("viewPager");
                throw null;
            }
            tabLayout.setupWithViewPager(viewPager);
            homeFragment.Y2(boolG.booleanValue() ? x0.WIFI.ordinal() : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X2(HomeFragment homeFragment) {
        i.y.d.l.d(homeFragment, "this$0");
        k0 k0Var = homeFragment.q0;
        if (k0Var != null) {
            k0Var.c(homeFragment.I2().get().b(), homeFragment.v0);
        } else {
            i.y.d.l.m("adViewHelper");
            throw null;
        }
    }

    private final void Y2(int i2) {
        TabLayout tabLayout = this.o0;
        if (tabLayout == null) {
            i.y.d.l.m("tabLayout");
            throw null;
        }
        int tabCount = tabLayout.getTabCount();
        if (tabCount <= 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            TabLayout tabLayout2 = this.o0;
            if (tabLayout2 == null) {
                i.y.d.l.m("tabLayout");
                throw null;
            }
            TabLayout.Tab tabW = tabLayout2.w(i3);
            if (tabW != null) {
                tabW.setIcon(N2(i3));
                if (i3 == i2) {
                    tabW.select();
                }
            }
            if (i4 >= tabCount) {
                return;
            } else {
                i3 = i4;
            }
        }
    }

    private final void Z2() {
        new b.a(m2()).h(R.string.dialog_fieldtest).o(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.parizene.netmonitor.ui.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                HomeFragment.a3(this.f13831e, dialogInterface, i2);
            }
        }).a().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a3(HomeFragment homeFragment, DialogInterface dialogInterface, int i2) {
        i.y.d.l.d(homeFragment, "this$0");
        homeFragment.D2(homeFragment.M2().get().b());
    }

    private final void c3() {
        MenuItem menuItem = this.r0;
        if (menuItem == null) {
            return;
        }
        menuItem.setVisible(Q2().r());
    }

    @Override // androidx.fragment.app.Fragment
    public void D1(Menu menu) {
        MenuItem menuItemFindItem;
        i.y.d.l.d(menu, "menu");
        MenuItem menuItemFindItem2 = menu.findItem(R.id.menu_keep_screen_on);
        if (menuItemFindItem2 != null) {
            Boolean boolG = com.parizene.netmonitor.t0.f.J.g();
            i.y.d.l.c(boolG, "KEEP_SCREEN_ON.value()");
            menuItemFindItem2.setChecked(boolG.booleanValue());
        }
        MenuItem menuItemFindItem3 = menu.findItem(R.id.menu_phone_info);
        if (menuItemFindItem3 != null) {
            menuItemFindItem3.setVisible(this.s0 != null);
        }
        MenuItem menuItemFindItem4 = menu.findItem(R.id.menu_fieldtest);
        if (menuItemFindItem4 != null) {
            menuItemFindItem4.setVisible(M2().get().b() != null);
        }
        if (i.y.d.l.a(BuildConfig.BUILD_TYPE, BuildConfig.BUILD_TYPE) || (menuItemFindItem = menu.findItem(R.id.menu_test)) == null) {
            return;
        }
        menuItemFindItem.setVisible(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void F1(int i2, String[] strArr, int[] iArr) {
        i.y.d.l.d(strArr, "permissions");
        i.y.d.l.d(iArr, "grantResults");
        super.F1(i2, strArr, iArr);
        v0.a(this, i2, iArr);
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        super.I1();
        k0 k0Var = this.q0;
        if (k0Var != null) {
            k0Var.i();
        } else {
            i.y.d.l.m("adViewHelper");
            throw null;
        }
    }

    public final f.a<l0> I2() {
        f.a<l0> aVar = this.k0;
        if (aVar != null) {
            return aVar;
        }
        i.y.d.l.m("adsConfigHolder");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void J1() {
        super.J1();
        k0 k0Var = this.q0;
        if (k0Var != null) {
            k0Var.h();
        } else {
            i.y.d.l.m("adViewHelper");
            throw null;
        }
    }

    public final com.parizene.netmonitor.k0.e J2() {
        com.parizene.netmonitor.k0.e eVar = this.d0;
        if (eVar != null) {
            return eVar;
        }
        i.y.d.l.m("analyticsTracker");
        throw null;
    }

    public final f.b.c<Object> K2() {
        f.b.c<Object> cVar = this.b0;
        if (cVar != null) {
            return cVar;
        }
        i.y.d.l.m("androidInjector");
        throw null;
    }

    public final org.greenrobot.eventbus.c L2() {
        org.greenrobot.eventbus.c cVar = this.e0;
        if (cVar != null) {
            return cVar;
        }
        i.y.d.l.m("eventBus");
        throw null;
    }

    public final f.a<com.parizene.netmonitor.q> M2() {
        f.a<com.parizene.netmonitor.q> aVar = this.j0;
        if (aVar != null) {
            return aVar;
        }
        i.y.d.l.m("fieldTest");
        throw null;
    }

    public final com.parizene.netmonitor.x O2() {
        com.parizene.netmonitor.x xVar = this.c0;
        if (xVar != null) {
            return xVar;
        }
        i.y.d.l.m("netmonitorManager");
        throw null;
    }

    public final SharedPreferences P2() {
        SharedPreferences sharedPreferences = this.g0;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        i.y.d.l.m("preferences");
        throw null;
    }

    public final com.parizene.netmonitor.s0.c.c Q2() {
        com.parizene.netmonitor.s0.c.c cVar = this.f0;
        if (cVar != null) {
            return cVar;
        }
        i.y.d.l.m("premiumHelper");
        throw null;
    }

    public final f.a<com.parizene.netmonitor.m0.x> R2() {
        f.a<com.parizene.netmonitor.m0.x> aVar = this.i0;
        if (aVar != null) {
            return aVar;
        }
        i.y.d.l.m("testAll");
        throw null;
    }

    public final Handler S2() {
        Handler handler = this.h0;
        if (handler != null) {
            return handler;
        }
        i.y.d.l.m("uiHandler");
        throw null;
    }

    public final void b3() throws IllegalAccessException, SecurityException, IllegalArgumentException {
        R2().get().l(m2());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void i1(Context context) {
        i.y.d.l.d(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        f.b.f.a.b(this);
        super.i1(context);
        if (context instanceof a) {
            this.l0 = (a) context;
            return;
        }
        throw new ClassCastException(context + " should implement HomeFragment.Callback");
    }

    @Override // f.b.e
    public f.b.b<Object> l() {
        return K2();
    }

    @Override // androidx.fragment.app.Fragment
    public void l1(Bundle bundle) {
        super.l1(bundle);
        t2(true);
        e1.a aVar = e1.a;
        Context contextM2 = m2();
        i.y.d.l.c(contextM2, "requireContext()");
        this.s0 = aVar.c(contextM2);
        O2().p();
    }

    @Override // androidx.fragment.app.Fragment
    public void o1(Menu menu, MenuInflater menuInflater) {
        i.y.d.l.d(menu, "menu");
        i.y.d.l.d(menuInflater, "inflater");
        menuInflater.inflate(R.menu.home_menu, menu);
        this.r0 = menu.findItem(R.id.menu_premium);
        c3();
    }

    @org.greenrobot.eventbus.m(sticky = true)
    public final void on(com.parizene.netmonitor.s0.c.b bVar) {
        c3();
        S2().removeCallbacks(this.u0);
        if (com.parizene.netmonitor.s0.c.a.UNKNOWN == Q2().t()) {
            S2().postDelayed(this.u0, 1000L);
            return;
        }
        if (!Q2().x()) {
            S2().post(this.u0);
            return;
        }
        k0 k0Var = this.q0;
        if (k0Var != null) {
            k0Var.d();
        } else {
            i.y.d.l.m("adViewHelper");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View p1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i.y.d.l.d(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_home, viewGroup, false);
        androidx.fragment.app.m mVarP0 = p0();
        i.y.d.l.c(mVarP0, "childFragmentManager");
        y0 y0Var = new y0(mVarP0);
        this.n0 = y0Var;
        if (y0Var == null) {
            i.y.d.l.m("adapter");
            throw null;
        }
        Boolean boolG = com.parizene.netmonitor.t0.f.f13719d.g();
        i.y.d.l.c(boolG, "SCAN_WIFI.value()");
        y0Var.t(boolG.booleanValue());
        View viewFindViewById = viewInflate.findViewById(R.id.viewPager);
        i.y.d.l.c(viewFindViewById, "view.findViewById(R.id.viewPager)");
        ViewPager viewPager = (ViewPager) viewFindViewById;
        this.m0 = viewPager;
        if (viewPager == null) {
            i.y.d.l.m("viewPager");
            throw null;
        }
        y0 y0Var2 = this.n0;
        if (y0Var2 == null) {
            i.y.d.l.m("adapter");
            throw null;
        }
        viewPager.setAdapter(y0Var2);
        ViewPager viewPager2 = this.m0;
        if (viewPager2 == null) {
            i.y.d.l.m("viewPager");
            throw null;
        }
        viewPager2.setOffscreenPageLimit(4);
        View viewFindViewById2 = viewInflate.findViewById(R.id.tabLayout);
        i.y.d.l.c(viewFindViewById2, "view.findViewById(R.id.tabLayout)");
        TabLayout tabLayout = (TabLayout) viewFindViewById2;
        this.o0 = tabLayout;
        if (tabLayout == null) {
            i.y.d.l.m("tabLayout");
            throw null;
        }
        ViewPager viewPager3 = this.m0;
        if (viewPager3 == null) {
            i.y.d.l.m("viewPager");
            throw null;
        }
        tabLayout.setupWithViewPager(viewPager3);
        Y2(0);
        Boolean boolG2 = com.parizene.netmonitor.t0.f.J.g();
        a aVar = this.l0;
        if (aVar == null) {
            i.y.d.l.m("callback");
            throw null;
        }
        i.y.d.l.c(boolG2, "keepScreenOn");
        aVar.s(boolG2.booleanValue());
        View viewFindViewById3 = viewInflate.findViewById(R.id.toolbar);
        i.y.d.l.c(viewFindViewById3, "view.findViewById(R.id.toolbar)");
        Toolbar toolbar = (Toolbar) viewFindViewById3;
        this.p0 = toolbar;
        if (toolbar == null) {
            i.y.d.l.m("toolbar");
            throw null;
        }
        c.h.l.t.r0(toolbar, TypedValue.applyDimension(1, 8.0f, F0().getDisplayMetrics()));
        androidx.appcompat.app.c cVar = (androidx.appcompat.app.c) k2();
        Toolbar toolbar2 = this.p0;
        if (toolbar2 == null) {
            i.y.d.l.m("toolbar");
            throw null;
        }
        cVar.R(toolbar2);
        androidx.appcompat.app.a aVarK = cVar.K();
        if (aVarK != null) {
            aVarK.r(false);
        }
        this.q0 = new k0(m2(), k2().getWindowManager(), y0(), (FrameLayout) viewInflate.findViewById(R.id.bannerViewContainer), J2());
        P2().registerOnSharedPreferenceChangeListener(this.t0);
        L2().r(this);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void s1() {
        super.s1();
        P2().unregisterOnSharedPreferenceChangeListener(this.t0);
        L2().t(this);
        S2().removeCallbacks(this.u0);
        k0 k0Var = this.q0;
        if (k0Var != null) {
            k0Var.d();
        } else {
            i.y.d.l.m("adViewHelper");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public boolean z1(MenuItem menuItem) {
        i.y.d.l.d(menuItem, "item");
        switch (menuItem.getItemId()) {
            case R.id.menu_exit /* 2131296610 */:
                k2().finish();
                Context applicationContext = m2().getApplicationContext();
                Objects.requireNonNull(applicationContext, "null cannot be cast to non-null type com.parizene.netmonitor.App");
                ((App) applicationContext).a();
                return true;
            case R.id.menu_fieldtest /* 2131296611 */:
                J2().a(d.b.f13204c);
                Z2();
                return true;
            case R.id.menu_keep_screen_on /* 2131296612 */:
                com.parizene.netmonitor.t0.b bVar = com.parizene.netmonitor.t0.f.J;
                boolean z = !bVar.g().booleanValue();
                bVar.f(Boolean.valueOf(z));
                J2().a(d.b.b(z));
                a aVar = this.l0;
                if (aVar != null) {
                    aVar.s(z);
                    return true;
                }
                i.y.d.l.m("callback");
                throw null;
            case R.id.menu_manage_db /* 2131296614 */:
                D2(new Intent(m2(), (Class<?>) ManageDatabaseFragmentActivity.class));
                return true;
            case R.id.menu_phone_info /* 2131296618 */:
                J2().a(d.b.f13203b);
                D2(this.s0);
                return true;
            case R.id.menu_premium /* 2131296619 */:
                J2().a(d.b.a);
                a aVar2 = this.l0;
                if (aVar2 != null) {
                    aVar2.c();
                    return false;
                }
                i.y.d.l.m("callback");
                throw null;
            case R.id.menu_settings /* 2131296621 */:
                D2(new Intent(m2(), (Class<?>) SettingsFragmentActivity.class));
                return true;
            case R.id.menu_test /* 2131296626 */:
                v0.b(this);
                return true;
            default:
                return false;
        }
    }
}