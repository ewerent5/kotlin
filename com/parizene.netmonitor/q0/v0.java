package com.parizene.netmonitor.q0;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.Application;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.PowerManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.parizene.netmonitor.App;
import com.parizene.netmonitor.C0233r;
import com.parizene.netmonitor.NetmonitorService;
import com.parizene.netmonitor.db.AppDatabase;
import com.parizene.netmonitor.db.celllog.ExportCellService;
import com.parizene.netmonitor.db.celllog.ImportCellService;
import com.parizene.netmonitor.q0.a;
import com.parizene.netmonitor.q0.a1;
import com.parizene.netmonitor.q0.b;
import com.parizene.netmonitor.q0.b1;
import com.parizene.netmonitor.q0.c;
import com.parizene.netmonitor.q0.c1;
import com.parizene.netmonitor.q0.d1;
import com.parizene.netmonitor.q0.e1;
import com.parizene.netmonitor.q0.f1;
import com.parizene.netmonitor.q0.g1;
import com.parizene.netmonitor.q0.h1;
import com.parizene.netmonitor.q0.i1;
import com.parizene.netmonitor.q0.s;
import com.parizene.netmonitor.q0.w0;
import com.parizene.netmonitor.q0.x0;
import com.parizene.netmonitor.q0.y0;
import com.parizene.netmonitor.q0.z0;
import com.parizene.netmonitor.ui.HelpFragment;
import com.parizene.netmonitor.ui.HomeActivity;
import com.parizene.netmonitor.ui.HomeFragment;
import com.parizene.netmonitor.ui.IntroActivity;
import com.parizene.netmonitor.ui.ManageDatabaseFragment;
import com.parizene.netmonitor.ui.PurchaseFragment;
import com.parizene.netmonitor.ui.SettingsFragment;
import com.parizene.netmonitor.ui.cell.CellFragment;
import com.parizene.netmonitor.ui.k1;
import com.parizene.netmonitor.ui.l1;
import com.parizene.netmonitor.ui.log.LogFragment;
import com.parizene.netmonitor.ui.m1;
import com.parizene.netmonitor.ui.map.MapFragment;
import com.parizene.netmonitor.ui.nps.NpsActivity;
import com.parizene.netmonitor.ui.wifi.WifiFragment;
import f.b.b;
import java.util.Collections;
import java.util.Map;
import okhttp3.OkHttpClient;

/* compiled from: DaggerAppComponent.java */
/* loaded from: classes3.dex */
public final class v0 implements com.parizene.netmonitor.q0.s {
    private h.a.a<com.parizene.netmonitor.m0.u> A;
    private h.a.a<com.parizene.netmonitor.m0.r> B;
    private h.a.a<com.parizene.netmonitor.m0.e> C;
    private h.a.a<com.parizene.netmonitor.m0.e> D;
    private h.a.a<com.parizene.netmonitor.d0> E;
    private h.a.a<com.parizene.netmonitor.x> F;
    private h.a.a<PackageManager> G;
    private h.a.a<com.parizene.netmonitor.k0.e> H;
    private h.a.a<com.parizene.netmonitor.s0.c.c> I;
    private h.a.a<AlarmManager> J;
    private h.a.a<ConnectivityManager> K;
    private h.a.a<com.parizene.netmonitor.l0.c> L;
    private h.a.a<com.google.firebase.remoteconfig.g> M;
    private h.a.a<FirebaseAnalytics> N;
    private h.a.a<com.parizene.netmonitor.k> O;
    private h.a.a<b.a> P;
    private h.a.a<a.InterfaceC0164a> Q;
    private h.a.a<c.a> R;
    private h.a.a<x0.a> S;
    private h.a.a<a1.a> T;
    private h.a.a<y0.a> U;
    private h.a.a<w0.a> V;
    private h.a.a<b1.a> W;
    private h.a.a<z0.a> X;
    private h.a.a<h1.a> Y;
    private h.a.a<g1.a> Z;
    private h.a.a<Application> a;
    private h.a.a<i1.a> a0;

    /* renamed from: b */
    private h.a.a<Context> f13624b;
    private h.a.a<KeyguardManager> b0;

    /* renamed from: c */
    private h.a.a<SharedPreferences> f13625c;
    private h.a.a<ActivityManager> c0;

    /* renamed from: d */
    private h.a.a<NotificationManager> f13626d;
    private h.a.a<PowerManager> d0;

    /* renamed from: e */
    private h.a.a<com.parizene.netmonitor.a0> f13627e;
    private h.a.a<com.parizene.netmonitor.foreground.a> e0;

    /* renamed from: f */
    private h.a.a<TelephonyManager> f13628f;
    private h.a.a<com.parizene.netmonitor.foreground.d> f0;

    /* renamed from: g */
    private h.a.a<SubscriptionManager> f13629g;
    private h.a.a<l1> g0;

    /* renamed from: h */
    private h.a.a<com.parizene.netmonitor.m0.d0.c> f13630h;
    private h.a.a<com.parizene.netmonitor.i0> h0;

    /* renamed from: i */
    private h.a.a<com.parizene.netmonitor.m0.d0.d> f13631i;
    private h.a.a<com.google.android.play.core.review.a> i0;

    /* renamed from: j */
    private h.a.a<com.google.firebase.crashlytics.c> f13632j;
    private h.a.a<com.parizene.netmonitor.ui.nps.e> j0;

    /* renamed from: k */
    private h.a.a<AppDatabase> f13633k;
    private h.a.a<com.parizene.netmonitor.m0.c0.c> k0;

    /* renamed from: l */
    private h.a.a<OkHttpClient> f13634l;
    private h.a.a<e.c.d.f> l0;

    /* renamed from: m */
    private h.a.a<com.parizene.netmonitor.r0.d> f13635m;
    private h.a.a<com.parizene.netmonitor.ui.l0> m0;
    private h.a.a<org.greenrobot.eventbus.c> n;
    private h.a.a<com.parizene.netmonitor.m0.z.b> n0;
    private h.a.a<com.parizene.netmonitor.u> o;
    private h.a.a<com.parizene.netmonitor.ui.log.j> o0;
    private h.a.a<c.p.a.a> p;
    private h.a.a<com.parizene.netmonitor.ui.map.t0> p0;
    private h.a.a<com.parizene.netmonitor.db.celllog.b> q;
    private h.a.a<com.parizene.netmonitor.ui.map.u> q0;
    private h.a.a<LocationManager> r;
    private h.a.a<WifiManager> r0;
    private h.a.a<com.parizene.netmonitor.s0.d.c> s;
    private h.a.a<com.parizene.netmonitor.s0.e.c> s0;
    private h.a.a<com.parizene.netmonitor.f0> t;
    private h.a.a<com.parizene.netmonitor.db.i.d> t0;
    private h.a.a<com.parizene.netmonitor.m0.d0.e> u;
    private h.a.a<com.parizene.netmonitor.db.i.b> u0;
    private h.a.a<com.parizene.netmonitor.m0.d0.a> v;
    private h.a.a<com.parizene.netmonitor.m0.l> w;
    private h.a.a<com.parizene.netmonitor.m0.g> x;
    private h.a.a<com.parizene.netmonitor.m0.i> y;
    private h.a.a<com.parizene.netmonitor.m0.n> z;

    /* compiled from: DaggerAppComponent.java */
    class a implements h.a.a<h1.a> {
        a() {
        }

        @Override // h.a.a
        /* renamed from: a */
        public h1.a get() {
            return new v(v0.this, null);
        }
    }

    /* compiled from: DaggerAppComponent.java */
    private final class a0 implements y0 {
        /* synthetic */ a0(v0 v0Var, ManageDatabaseFragment manageDatabaseFragment, d dVar) {
            this(manageDatabaseFragment);
        }

        private ManageDatabaseFragment c(ManageDatabaseFragment manageDatabaseFragment) {
            com.parizene.netmonitor.ui.d1.a(manageDatabaseFragment, (com.parizene.netmonitor.k0.e) v0.this.H.get());
            com.parizene.netmonitor.ui.d1.e(manageDatabaseFragment, (com.parizene.netmonitor.db.celllog.b) v0.this.q.get());
            com.parizene.netmonitor.ui.d1.i(manageDatabaseFragment, (com.parizene.netmonitor.a0) v0.this.f13627e.get());
            com.parizene.netmonitor.ui.d1.c(manageDatabaseFragment, (com.parizene.netmonitor.db.i.b) v0.this.u0.get());
            com.parizene.netmonitor.ui.d1.j(manageDatabaseFragment, (SharedPreferences) v0.this.f13625c.get());
            com.parizene.netmonitor.ui.d1.d(manageDatabaseFragment, com.parizene.netmonitor.q0.y.c());
            com.parizene.netmonitor.ui.d1.l(manageDatabaseFragment, m0.c());
            com.parizene.netmonitor.ui.d1.h(manageDatabaseFragment, (com.parizene.netmonitor.x) v0.this.F.get());
            com.parizene.netmonitor.ui.d1.k(manageDatabaseFragment, (com.parizene.netmonitor.m0.d0.d) v0.this.f13631i.get());
            com.parizene.netmonitor.ui.d1.f(manageDatabaseFragment, (com.parizene.netmonitor.u) v0.this.o.get());
            com.parizene.netmonitor.ui.d1.g(manageDatabaseFragment, (c.p.a.a) v0.this.p.get());
            com.parizene.netmonitor.ui.d1.b(manageDatabaseFragment, (com.parizene.netmonitor.k) v0.this.O.get());
            return manageDatabaseFragment;
        }

        @Override // f.b.b
        /* renamed from: b */
        public void a(ManageDatabaseFragment manageDatabaseFragment) {
            c(manageDatabaseFragment);
        }

        private a0(ManageDatabaseFragment manageDatabaseFragment) {
        }
    }

    /* compiled from: DaggerAppComponent.java */
    class b implements h.a.a<g1.a> {
        b() {
        }

        @Override // h.a.a
        /* renamed from: a */
        public g1.a get() {
            return new n(v0.this, null);
        }
    }

    /* compiled from: DaggerAppComponent.java */
    private final class b0 implements i1.a {
        private b0() {
        }

        @Override // f.b.b.InterfaceC0194b
        /* renamed from: b */
        public i1 a(NetmonitorService netmonitorService) {
            f.c.f.b(netmonitorService);
            return new c0(v0.this, netmonitorService, null);
        }

        /* synthetic */ b0(v0 v0Var, d dVar) {
            this();
        }
    }

    /* compiled from: DaggerAppComponent.java */
    class c implements h.a.a<i1.a> {
        c() {
        }

        @Override // h.a.a
        /* renamed from: a */
        public i1.a get() {
            return new b0(v0.this, null);
        }
    }

    /* compiled from: DaggerAppComponent.java */
    private final class c0 implements i1 {
        /* synthetic */ c0(v0 v0Var, NetmonitorService netmonitorService, d dVar) {
            this(netmonitorService);
        }

        private NetmonitorService c(NetmonitorService netmonitorService) {
            com.parizene.netmonitor.z.f(netmonitorService, (PowerManager) v0.this.d0.get());
            com.parizene.netmonitor.z.e(netmonitorService, (com.parizene.netmonitor.a0) v0.this.f13627e.get());
            com.parizene.netmonitor.z.c(netmonitorService, (org.greenrobot.eventbus.c) v0.this.n.get());
            com.parizene.netmonitor.z.d(netmonitorService, (com.parizene.netmonitor.x) v0.this.F.get());
            com.parizene.netmonitor.z.a(netmonitorService, (ActivityManager) v0.this.c0.get());
            com.parizene.netmonitor.z.b(netmonitorService, f.c.b.a(v0.this.n0));
            return netmonitorService;
        }

        @Override // f.b.b
        /* renamed from: b */
        public void a(NetmonitorService netmonitorService) {
            c(netmonitorService);
        }

        private c0(NetmonitorService netmonitorService) {
        }
    }

    /* compiled from: DaggerAppComponent.java */
    class d implements h.a.a<b.a> {
        d() {
        }

        @Override // h.a.a
        /* renamed from: a */
        public b.a get() {
            return new x(v0.this, null);
        }
    }

    /* compiled from: DaggerAppComponent.java */
    private final class d0 implements c.a {
        private d0() {
        }

        @Override // f.b.b.InterfaceC0194b
        /* renamed from: b */
        public com.parizene.netmonitor.q0.c a(NpsActivity npsActivity) {
            f.c.f.b(npsActivity);
            return new e0(v0.this, npsActivity, null);
        }

        /* synthetic */ d0(v0 v0Var, d dVar) {
            this();
        }
    }

    /* compiled from: DaggerAppComponent.java */
    class e implements h.a.a<a.InterfaceC0164a> {
        e() {
        }

        @Override // h.a.a
        /* renamed from: a */
        public a.InterfaceC0164a get() {
            return new r(v0.this, null);
        }
    }

    /* compiled from: DaggerAppComponent.java */
    private final class e0 implements com.parizene.netmonitor.q0.c {
        /* synthetic */ e0(v0 v0Var, NpsActivity npsActivity, d dVar) {
            this(npsActivity);
        }

        private NpsActivity c(NpsActivity npsActivity) {
            com.parizene.netmonitor.ui.nps.d.a(npsActivity, (com.parizene.netmonitor.k0.e) v0.this.H.get());
            com.parizene.netmonitor.ui.nps.d.b(npsActivity, (com.parizene.netmonitor.ui.nps.e) v0.this.j0.get());
            return npsActivity;
        }

        @Override // f.b.b
        /* renamed from: b */
        public void a(NpsActivity npsActivity) {
            c(npsActivity);
        }

        private e0(NpsActivity npsActivity) {
        }
    }

    /* compiled from: DaggerAppComponent.java */
    class f implements h.a.a<c.a> {
        f() {
        }

        @Override // h.a.a
        /* renamed from: a */
        public c.a get() {
            return new d0(v0.this, null);
        }
    }

    /* compiled from: DaggerAppComponent.java */
    private final class f0 implements z0.a {
        private f0() {
        }

        @Override // f.b.b.InterfaceC0194b
        /* renamed from: b */
        public z0 a(PurchaseFragment purchaseFragment) {
            f.c.f.b(purchaseFragment);
            return new g0(v0.this, purchaseFragment, null);
        }

        /* synthetic */ f0(v0 v0Var, d dVar) {
            this();
        }
    }

    /* compiled from: DaggerAppComponent.java */
    class g implements h.a.a<x0.a> {
        g() {
        }

        @Override // h.a.a
        /* renamed from: a */
        public x0.a get() {
            return new t(v0.this, null);
        }
    }

    /* compiled from: DaggerAppComponent.java */
    private final class g0 implements z0 {
        /* synthetic */ g0(v0 v0Var, PurchaseFragment purchaseFragment, d dVar) {
            this(purchaseFragment);
        }

        private PurchaseFragment c(PurchaseFragment purchaseFragment) {
            com.parizene.netmonitor.ui.h1.a(purchaseFragment, (com.parizene.netmonitor.s0.c.c) v0.this.I.get());
            return purchaseFragment;
        }

        @Override // f.b.b
        /* renamed from: b */
        public void a(PurchaseFragment purchaseFragment) {
            c(purchaseFragment);
        }

        private g0(PurchaseFragment purchaseFragment) {
        }
    }

    /* compiled from: DaggerAppComponent.java */
    class h implements h.a.a<a1.a> {
        h() {
        }

        @Override // h.a.a
        /* renamed from: a */
        public a1.a get() {
            return new h0(v0.this, null);
        }
    }

    /* compiled from: DaggerAppComponent.java */
    private final class h0 implements a1.a {
        private h0() {
        }

        @Override // f.b.b.InterfaceC0194b
        /* renamed from: b */
        public a1 a(SettingsFragment settingsFragment) {
            f.c.f.b(settingsFragment);
            return new i0(v0.this, settingsFragment, null);
        }

        /* synthetic */ h0(v0 v0Var, d dVar) {
            this();
        }
    }

    /* compiled from: DaggerAppComponent.java */
    class i implements h.a.a<y0.a> {
        i() {
        }

        @Override // h.a.a
        /* renamed from: a */
        public y0.a get() {
            return new z(v0.this, null);
        }
    }

    /* compiled from: DaggerAppComponent.java */
    private final class i0 implements a1 {
        /* synthetic */ i0(v0 v0Var, SettingsFragment settingsFragment, d dVar) {
            this(settingsFragment);
        }

        private SettingsFragment c(SettingsFragment settingsFragment) {
            k1.a(settingsFragment, (com.parizene.netmonitor.k0.e) v0.this.H.get());
            k1.c(settingsFragment, (com.parizene.netmonitor.db.celllog.b) v0.this.q.get());
            k1.f(settingsFragment, (SharedPreferences) v0.this.f13625c.get());
            k1.e(settingsFragment, (com.parizene.netmonitor.x) v0.this.F.get());
            k1.h(settingsFragment, (com.parizene.netmonitor.s0.e.c) v0.this.s0.get());
            k1.d(settingsFragment, (org.greenrobot.eventbus.c) v0.this.n.get());
            k1.b(settingsFragment, com.parizene.netmonitor.q0.y.c());
            k1.g(settingsFragment, (l1) v0.this.g0.get());
            return settingsFragment;
        }

        @Override // f.b.b
        /* renamed from: b */
        public void a(SettingsFragment settingsFragment) {
            c(settingsFragment);
        }

        private i0(SettingsFragment settingsFragment) {
        }
    }

    /* compiled from: DaggerAppComponent.java */
    class j implements h.a.a<w0.a> {
        j() {
        }

        @Override // h.a.a
        /* renamed from: a */
        public w0.a get() {
            return new p(v0.this, null);
        }
    }

    /* compiled from: DaggerAppComponent.java */
    private final class j0 implements b1.a {
        private j0() {
        }

        @Override // f.b.b.InterfaceC0194b
        /* renamed from: b */
        public b1 a(com.parizene.netmonitor.ui.test.d dVar) {
            f.c.f.b(dVar);
            return new k0(v0.this, dVar, null);
        }

        /* synthetic */ j0(v0 v0Var, d dVar) {
            this();
        }
    }

    /* compiled from: DaggerAppComponent.java */
    class k implements h.a.a<b1.a> {
        k() {
        }

        @Override // h.a.a
        /* renamed from: a */
        public b1.a get() {
            return new j0(v0.this, null);
        }
    }

    /* compiled from: DaggerAppComponent.java */
    private final class k0 implements b1 {
        private h.a.a<com.parizene.netmonitor.m0.x> a;

        /* synthetic */ k0(v0 v0Var, com.parizene.netmonitor.ui.test.d dVar, d dVar2) {
            this(dVar);
        }

        private void b(com.parizene.netmonitor.ui.test.d dVar) {
            this.a = com.parizene.netmonitor.m0.y.a(v0.this.f13631i, v0.this.u, v0.this.v, v0.this.k0, v0.this.s, m0.a(), v0.this.O);
        }

        private com.parizene.netmonitor.ui.test.d d(com.parizene.netmonitor.ui.test.d dVar) {
            com.parizene.netmonitor.ui.test.f.d(dVar, m0.c());
            com.parizene.netmonitor.ui.test.f.a(dVar, (com.parizene.netmonitor.m0.e) v0.this.C.get());
            com.parizene.netmonitor.ui.test.f.b(dVar, (com.parizene.netmonitor.m0.e) v0.this.D.get());
            com.parizene.netmonitor.ui.test.f.c(dVar, f.c.b.a(this.a));
            return dVar;
        }

        @Override // f.b.b
        /* renamed from: c */
        public void a(com.parizene.netmonitor.ui.test.d dVar) {
            d(dVar);
        }

        private k0(com.parizene.netmonitor.ui.test.d dVar) {
            b(dVar);
        }
    }

    /* compiled from: DaggerAppComponent.java */
    class l implements h.a.a<z0.a> {
        l() {
        }

        @Override // h.a.a
        /* renamed from: a */
        public z0.a get() {
            return new f0(v0.this, null);
        }
    }

    /* compiled from: DaggerAppComponent.java */
    private static final class m extends s.a {
        private Application a;

        private m() {
        }

        @Override // com.parizene.netmonitor.q0.s.a
        /* renamed from: f */
        public m d(Application application) {
            this.a = (Application) f.c.f.b(application);
            return this;
        }

        @Override // f.b.b.a
        /* renamed from: g */
        public com.parizene.netmonitor.q0.s b() {
            f.c.f.a(this.a, Application.class);
            return new v0(this.a, null);
        }

        /* synthetic */ m(d dVar) {
            this();
        }
    }

    /* compiled from: DaggerAppComponent.java */
    private final class n implements g1.a {
        private n() {
        }

        @Override // f.b.b.InterfaceC0194b
        /* renamed from: b */
        public g1 a(ExportCellService exportCellService) {
            f.c.f.b(exportCellService);
            return new o(v0.this, exportCellService, null);
        }

        /* synthetic */ n(v0 v0Var, d dVar) {
            this();
        }
    }

    /* compiled from: DaggerAppComponent.java */
    private final class o implements g1 {
        /* synthetic */ o(v0 v0Var, ExportCellService exportCellService, d dVar) {
            this(exportCellService);
        }

        private ExportCellService c(ExportCellService exportCellService) {
            com.parizene.netmonitor.db.celllog.d.b(exportCellService, (com.parizene.netmonitor.db.celllog.b) v0.this.q.get());
            com.parizene.netmonitor.db.celllog.d.c(exportCellService, (com.parizene.netmonitor.a0) v0.this.f13627e.get());
            com.parizene.netmonitor.db.celllog.d.a(exportCellService, (com.parizene.netmonitor.k) v0.this.O.get());
            return exportCellService;
        }

        @Override // f.b.b
        /* renamed from: b */
        public void a(ExportCellService exportCellService) {
            c(exportCellService);
        }

        private o(ExportCellService exportCellService) {
        }
    }

    /* compiled from: DaggerAppComponent.java */
    private final class p implements w0.a {
        private p() {
        }

        @Override // f.b.b.InterfaceC0194b
        /* renamed from: b */
        public w0 a(HelpFragment helpFragment) {
            f.c.f.b(helpFragment);
            return new q(v0.this, helpFragment, null);
        }

        /* synthetic */ p(v0 v0Var, d dVar) {
            this();
        }
    }

    /* compiled from: DaggerAppComponent.java */
    private final class q implements w0 {
        /* synthetic */ q(v0 v0Var, HelpFragment helpFragment, d dVar) {
            this(helpFragment);
        }

        private HelpFragment c(HelpFragment helpFragment) {
            com.parizene.netmonitor.ui.s0.a(helpFragment, (com.parizene.netmonitor.x) v0.this.F.get());
            return helpFragment;
        }

        @Override // f.b.b
        /* renamed from: b */
        public void a(HelpFragment helpFragment) {
            c(helpFragment);
        }

        private q(HelpFragment helpFragment) {
        }
    }

    /* compiled from: DaggerAppComponent.java */
    private final class r implements a.InterfaceC0164a {
        private r() {
        }

        @Override // f.b.b.InterfaceC0194b
        /* renamed from: b */
        public com.parizene.netmonitor.q0.a a(HomeActivity homeActivity) {
            f.c.f.b(homeActivity);
            return new s(v0.this, homeActivity, null);
        }

        /* synthetic */ r(v0 v0Var, d dVar) {
            this();
        }
    }

    /* compiled from: DaggerAppComponent.java */
    private final class s implements com.parizene.netmonitor.q0.a {
        /* synthetic */ s(v0 v0Var, HomeActivity homeActivity, d dVar) {
            this(homeActivity);
        }

        private HomeActivity c(HomeActivity homeActivity) {
            com.parizene.netmonitor.ui.t0.c(homeActivity, f.c.b.a(v0.this.i0));
            com.parizene.netmonitor.ui.t0.a(homeActivity, f.c.b.a(v0.this.M));
            com.parizene.netmonitor.ui.t0.b(homeActivity, f.c.b.a(v0.this.j0));
            return homeActivity;
        }

        @Override // f.b.b
        /* renamed from: b */
        public void a(HomeActivity homeActivity) {
            c(homeActivity);
        }

        private s(HomeActivity homeActivity) {
        }
    }

    /* compiled from: DaggerAppComponent.java */
    private final class t implements x0.a {
        private t() {
        }

        @Override // f.b.b.InterfaceC0194b
        /* renamed from: b */
        public x0 a(HomeFragment homeFragment) {
            f.c.f.b(homeFragment);
            return new u(v0.this, homeFragment, null);
        }

        /* synthetic */ t(v0 v0Var, d dVar) {
            this();
        }
    }

    /* compiled from: DaggerAppComponent.java */
    private final class u implements x0 {
        private h.a.a<c1.a> a;

        /* renamed from: b */
        private h.a.a<d1.a> f13637b;

        /* renamed from: c */
        private h.a.a<e1.a> f13638c;

        /* renamed from: d */
        private h.a.a<f1.a> f13639d;

        /* renamed from: e */
        private h.a.a<com.parizene.netmonitor.m0.x> f13640e;

        /* renamed from: f */
        private h.a.a<com.parizene.netmonitor.q> f13641f;

        /* compiled from: DaggerAppComponent.java */
        class a implements h.a.a<c1.a> {
            a() {
            }

            @Override // h.a.a
            /* renamed from: a */
            public c1.a get() {
                return new e(u.this, null);
            }
        }

        /* compiled from: DaggerAppComponent.java */
        class b implements h.a.a<d1.a> {
            b() {
            }

            @Override // h.a.a
            /* renamed from: a */
            public d1.a get() {
                return new g(u.this, null);
            }
        }

        /* compiled from: DaggerAppComponent.java */
        class c implements h.a.a<e1.a> {
            c() {
            }

            @Override // h.a.a
            /* renamed from: a */
            public e1.a get() {
                return new i(u.this, null);
            }
        }

        /* compiled from: DaggerAppComponent.java */
        class d implements h.a.a<f1.a> {
            d() {
            }

            @Override // h.a.a
            /* renamed from: a */
            public f1.a get() {
                return new k(u.this, null);
            }
        }

        /* compiled from: DaggerAppComponent.java */
        private final class e implements c1.a {
            private e() {
            }

            @Override // f.b.b.InterfaceC0194b
            /* renamed from: b */
            public c1 a(CellFragment cellFragment) {
                f.c.f.b(cellFragment);
                return new f(u.this, cellFragment, null);
            }

            /* synthetic */ e(u uVar, d dVar) {
                this();
            }
        }

        /* compiled from: DaggerAppComponent.java */
        private final class f implements c1 {
            /* synthetic */ f(u uVar, CellFragment cellFragment, d dVar) {
                this(cellFragment);
            }

            private CellFragment c(CellFragment cellFragment) {
                com.parizene.netmonitor.ui.cell.g.a(cellFragment, (com.parizene.netmonitor.k0.e) v0.this.H.get());
                com.parizene.netmonitor.ui.cell.g.d(cellFragment, (org.greenrobot.eventbus.c) v0.this.n.get());
                com.parizene.netmonitor.ui.cell.g.c(cellFragment, com.parizene.netmonitor.q0.y.c());
                com.parizene.netmonitor.ui.cell.g.e(cellFragment, m0.c());
                com.parizene.netmonitor.ui.cell.g.b(cellFragment, (com.parizene.netmonitor.m0.z.b) v0.this.n0.get());
                return cellFragment;
            }

            @Override // f.b.b
            /* renamed from: b */
            public void a(CellFragment cellFragment) {
                c(cellFragment);
            }

            private f(CellFragment cellFragment) {
            }
        }

        /* compiled from: DaggerAppComponent.java */
        private final class g implements d1.a {
            private g() {
            }

            @Override // f.b.b.InterfaceC0194b
            /* renamed from: b */
            public d1 a(LogFragment logFragment) {
                f.c.f.b(logFragment);
                return new h(u.this, logFragment, null);
            }

            /* synthetic */ g(u uVar, d dVar) {
                this();
            }
        }

        /* compiled from: DaggerAppComponent.java */
        private final class h implements d1 {
            /* synthetic */ h(u uVar, LogFragment logFragment, d dVar) {
                this(logFragment);
            }

            private LogFragment c(LogFragment logFragment) {
                com.parizene.netmonitor.ui.log.f.b(logFragment, (com.parizene.netmonitor.k0.e) v0.this.H.get());
                com.parizene.netmonitor.ui.log.f.e(logFragment, (com.parizene.netmonitor.db.celllog.b) v0.this.q.get());
                com.parizene.netmonitor.ui.log.f.f(logFragment, (org.greenrobot.eventbus.c) v0.this.n.get());
                com.parizene.netmonitor.ui.log.f.d(logFragment, com.parizene.netmonitor.q0.y.c());
                com.parizene.netmonitor.ui.log.f.g(logFragment, m0.c());
                com.parizene.netmonitor.ui.log.f.c(logFragment, f.c.b.a(v0.this.n0));
                com.parizene.netmonitor.ui.log.f.a(logFragment, (com.parizene.netmonitor.ui.log.j) v0.this.o0.get());
                return logFragment;
            }

            @Override // f.b.b
            /* renamed from: b */
            public void a(LogFragment logFragment) {
                c(logFragment);
            }

            private h(LogFragment logFragment) {
            }
        }

        /* compiled from: DaggerAppComponent.java */
        private final class i implements e1.a {
            private i() {
            }

            @Override // f.b.b.InterfaceC0194b
            /* renamed from: b */
            public e1 a(MapFragment mapFragment) {
                f.c.f.b(mapFragment);
                return new j(u.this, mapFragment, null);
            }

            /* synthetic */ i(u uVar, d dVar) {
                this();
            }
        }

        /* compiled from: DaggerAppComponent.java */
        private final class j implements e1 {
            /* synthetic */ j(u uVar, MapFragment mapFragment, d dVar) {
                this(mapFragment);
            }

            private MapFragment c(MapFragment mapFragment) {
                com.parizene.netmonitor.ui.map.i0.c(mapFragment, (org.greenrobot.eventbus.c) v0.this.n.get());
                com.parizene.netmonitor.ui.map.i0.f(mapFragment, (com.parizene.netmonitor.ui.map.t0) v0.this.p0.get());
                com.parizene.netmonitor.ui.map.i0.d(mapFragment, (com.parizene.netmonitor.ui.map.u) v0.this.q0.get());
                com.parizene.netmonitor.ui.map.i0.b(mapFragment, (com.parizene.netmonitor.db.celllog.b) v0.this.q.get());
                com.parizene.netmonitor.ui.map.i0.a(mapFragment, (com.parizene.netmonitor.k0.e) v0.this.H.get());
                com.parizene.netmonitor.ui.map.i0.e(mapFragment, (com.parizene.netmonitor.x) v0.this.F.get());
                com.parizene.netmonitor.ui.map.i0.g(mapFragment, m0.c());
                com.parizene.netmonitor.ui.map.i0.h(mapFragment, com.parizene.netmonitor.q0.y.c());
                return mapFragment;
            }

            @Override // f.b.b
            /* renamed from: b */
            public void a(MapFragment mapFragment) {
                c(mapFragment);
            }

            private j(MapFragment mapFragment) {
            }
        }

        /* compiled from: DaggerAppComponent.java */
        private final class k implements f1.a {
            private k() {
            }

            @Override // f.b.b.InterfaceC0194b
            /* renamed from: b */
            public f1 a(WifiFragment wifiFragment) {
                f.c.f.b(wifiFragment);
                return new l(u.this, wifiFragment, null);
            }

            /* synthetic */ k(u uVar, d dVar) {
                this();
            }
        }

        /* compiled from: DaggerAppComponent.java */
        private final class l implements f1 {
            /* synthetic */ l(u uVar, WifiFragment wifiFragment, d dVar) {
                this(wifiFragment);
            }

            private WifiFragment c(WifiFragment wifiFragment) {
                com.parizene.netmonitor.ui.wifi.d.c(wifiFragment, (com.parizene.netmonitor.s0.e.c) v0.this.s0.get());
                com.parizene.netmonitor.ui.wifi.d.a(wifiFragment, (com.parizene.netmonitor.s0.d.c) v0.this.s.get());
                com.parizene.netmonitor.ui.wifi.d.b(wifiFragment, m0.c());
                return wifiFragment;
            }

            @Override // f.b.b
            /* renamed from: b */
            public void a(WifiFragment wifiFragment) {
                c(wifiFragment);
            }

            private l(WifiFragment wifiFragment) {
            }
        }

        /* synthetic */ u(v0 v0Var, HomeFragment homeFragment, d dVar) {
            this(homeFragment);
        }

        private f.b.c<Object> b() {
            return f.b.d.a(c(), Collections.emptyMap());
        }

        private Map<Class<?>, h.a.a<b.InterfaceC0194b<?>>> c() {
            return f.c.e.b(16).c(IntroActivity.class, v0.this.P).c(HomeActivity.class, v0.this.Q).c(NpsActivity.class, v0.this.R).c(HomeFragment.class, v0.this.S).c(SettingsFragment.class, v0.this.T).c(ManageDatabaseFragment.class, v0.this.U).c(HelpFragment.class, v0.this.V).c(com.parizene.netmonitor.ui.test.d.class, v0.this.W).c(PurchaseFragment.class, v0.this.X).c(ImportCellService.class, v0.this.Y).c(ExportCellService.class, v0.this.Z).c(NetmonitorService.class, v0.this.a0).c(CellFragment.class, this.a).c(LogFragment.class, this.f13637b).c(MapFragment.class, this.f13638c).c(WifiFragment.class, this.f13639d).a();
        }

        private void d(HomeFragment homeFragment) {
            this.a = new a();
            this.f13637b = new b();
            this.f13638c = new c();
            this.f13639d = new d();
            this.f13640e = com.parizene.netmonitor.m0.y.a(v0.this.f13631i, v0.this.u, v0.this.v, v0.this.k0, v0.this.s, m0.a(), v0.this.O);
            this.f13641f = C0233r.a(v0.this.f13624b);
        }

        private HomeFragment f(HomeFragment homeFragment) {
            com.parizene.netmonitor.ui.w0.c(homeFragment, b());
            com.parizene.netmonitor.ui.w0.f(homeFragment, (com.parizene.netmonitor.x) v0.this.F.get());
            com.parizene.netmonitor.ui.w0.b(homeFragment, (com.parizene.netmonitor.k0.e) v0.this.H.get());
            com.parizene.netmonitor.ui.w0.d(homeFragment, (org.greenrobot.eventbus.c) v0.this.n.get());
            com.parizene.netmonitor.ui.w0.h(homeFragment, (com.parizene.netmonitor.s0.c.c) v0.this.I.get());
            com.parizene.netmonitor.ui.w0.g(homeFragment, (SharedPreferences) v0.this.f13625c.get());
            com.parizene.netmonitor.ui.w0.j(homeFragment, m0.c());
            com.parizene.netmonitor.ui.w0.i(homeFragment, f.c.b.a(this.f13640e));
            com.parizene.netmonitor.ui.w0.e(homeFragment, f.c.b.a(this.f13641f));
            com.parizene.netmonitor.ui.w0.a(homeFragment, f.c.b.a(v0.this.m0));
            return homeFragment;
        }

        @Override // f.b.b
        /* renamed from: e */
        public void a(HomeFragment homeFragment) {
            f(homeFragment);
        }

        private u(HomeFragment homeFragment) {
            d(homeFragment);
        }
    }

    /* compiled from: DaggerAppComponent.java */
    private final class v implements h1.a {
        private v() {
        }

        @Override // f.b.b.InterfaceC0194b
        /* renamed from: b */
        public h1 a(ImportCellService importCellService) {
            f.c.f.b(importCellService);
            return new w(v0.this, importCellService, null);
        }

        /* synthetic */ v(v0 v0Var, d dVar) {
            this();
        }
    }

    /* compiled from: DaggerAppComponent.java */
    private final class w implements h1 {
        /* synthetic */ w(v0 v0Var, ImportCellService importCellService, d dVar) {
            this(importCellService);
        }

        private ImportCellService c(ImportCellService importCellService) {
            com.parizene.netmonitor.db.celllog.e.a(importCellService, (com.parizene.netmonitor.db.celllog.b) v0.this.q.get());
            com.parizene.netmonitor.db.celllog.e.c(importCellService, (com.parizene.netmonitor.a0) v0.this.f13627e.get());
            com.parizene.netmonitor.db.celllog.e.b(importCellService, (c.p.a.a) v0.this.p.get());
            return importCellService;
        }

        @Override // f.b.b
        /* renamed from: b */
        public void a(ImportCellService importCellService) {
            c(importCellService);
        }

        private w(ImportCellService importCellService) {
        }
    }

    /* compiled from: DaggerAppComponent.java */
    private final class x implements b.a {
        private x() {
        }

        @Override // f.b.b.InterfaceC0194b
        /* renamed from: b */
        public com.parizene.netmonitor.q0.b a(IntroActivity introActivity) {
            f.c.f.b(introActivity);
            return new y(v0.this, introActivity, null);
        }

        /* synthetic */ x(v0 v0Var, d dVar) {
            this();
        }
    }

    /* compiled from: DaggerAppComponent.java */
    private final class y implements com.parizene.netmonitor.q0.b {
        /* synthetic */ y(v0 v0Var, IntroActivity introActivity, d dVar) {
            this(introActivity);
        }

        private IntroActivity c(IntroActivity introActivity) {
            com.parizene.netmonitor.ui.a1.c(introActivity, (com.parizene.netmonitor.s0.c.c) v0.this.I.get());
            com.parizene.netmonitor.ui.a1.a(introActivity, (com.parizene.netmonitor.k0.e) v0.this.H.get());
            com.parizene.netmonitor.ui.a1.d(introActivity, f.c.b.a(v0.this.h0));
            com.parizene.netmonitor.ui.a1.b(introActivity, (org.greenrobot.eventbus.c) v0.this.n.get());
            return introActivity;
        }

        @Override // f.b.b
        /* renamed from: b */
        public void a(IntroActivity introActivity) {
            c(introActivity);
        }

        private y(IntroActivity introActivity) {
        }
    }

    /* compiled from: DaggerAppComponent.java */
    private final class z implements y0.a {
        private z() {
        }

        @Override // f.b.b.InterfaceC0194b
        /* renamed from: b */
        public y0 a(ManageDatabaseFragment manageDatabaseFragment) {
            f.c.f.b(manageDatabaseFragment);
            return new a0(v0.this, manageDatabaseFragment, null);
        }

        /* synthetic */ z(v0 v0Var, d dVar) {
            this();
        }
    }

    /* synthetic */ v0(Application application, d dVar) {
        this(application);
    }

    public static s.a T() {
        return new m(null);
    }

    private f.b.c<Object> U() {
        return f.b.d.a(V(), Collections.emptyMap());
    }

    private Map<Class<?>, h.a.a<b.InterfaceC0194b<?>>> V() {
        return f.c.e.b(12).c(IntroActivity.class, this.P).c(HomeActivity.class, this.Q).c(NpsActivity.class, this.R).c(HomeFragment.class, this.S).c(SettingsFragment.class, this.T).c(ManageDatabaseFragment.class, this.U).c(HelpFragment.class, this.V).c(com.parizene.netmonitor.ui.test.d.class, this.W).c(PurchaseFragment.class, this.X).c(ImportCellService.class, this.Y).c(ExportCellService.class, this.Z).c(NetmonitorService.class, this.a0).a();
    }

    private com.parizene.netmonitor.t0.g W() {
        return com.parizene.netmonitor.q0.k0.a(this.f13624b.get(), this.f13625c.get());
    }

    private void X(Application application) {
        f.c.c cVarA = f.c.d.a(application);
        this.a = cVarA;
        h.a.a<Context> aVarB = f.c.b.b(com.parizene.netmonitor.q0.h.a(cVarA));
        this.f13624b = aVarB;
        this.f13625c = f.c.b.b(com.parizene.netmonitor.q0.o.a(aVarB));
        h.a.a<NotificationManager> aVarB2 = f.c.b.b(com.parizene.netmonitor.q0.l.a(this.f13624b));
        this.f13626d = aVarB2;
        this.f13627e = f.c.b.b(com.parizene.netmonitor.b0.a(this.f13624b, aVarB2));
        this.f13628f = f.c.b.b(com.parizene.netmonitor.q0.q.a(this.f13624b));
        h.a.a<SubscriptionManager> aVarB3 = f.c.b.b(com.parizene.netmonitor.q0.p.a(this.f13624b));
        this.f13629g = aVarB3;
        h.a.a<com.parizene.netmonitor.m0.d0.c> aVarB4 = f.c.b.b(s0.a(aVarB3));
        this.f13630h = aVarB4;
        this.f13631i = f.c.b.b(t0.a(this.f13628f, aVarB4));
        h.a.a<com.google.firebase.crashlytics.c> aVarB5 = f.c.b.b(com.parizene.netmonitor.q0.c0.a());
        this.f13632j = aVarB5;
        this.f13633k = f.c.b.b(com.parizene.netmonitor.q0.v.a(this.f13624b, this.f13631i, aVarB5));
        h.a.a<OkHttpClient> aVarB6 = f.c.b.b(com.parizene.netmonitor.q0.i0.a(this.f13624b));
        this.f13634l = aVarB6;
        this.f13635m = f.c.b.b(com.parizene.netmonitor.q0.e0.a(aVarB6));
        h.a.a<org.greenrobot.eventbus.c> aVarB7 = f.c.b.b(com.parizene.netmonitor.q0.a0.a());
        this.n = aVarB7;
        this.o = f.c.b.b(com.parizene.netmonitor.v.a(this.f13624b, this.f13633k, this.f13635m, aVarB7, com.parizene.netmonitor.q0.y.a(), o0.a(), this.f13625c));
        this.p = f.c.b.b(com.parizene.netmonitor.q0.j.a(this.f13624b));
        this.q = f.c.b.b(com.parizene.netmonitor.db.celllog.c.a(this.f13624b, this.f13633k, com.parizene.netmonitor.q0.y.a(), this.o, this.p, this.f13632j));
        h.a.a<LocationManager> aVarB8 = f.c.b.b(com.parizene.netmonitor.q0.k.a(this.f13624b));
        this.r = aVarB8;
        this.s = f.c.b.b(com.parizene.netmonitor.s0.d.e.a(this.f13624b, aVarB8, com.parizene.netmonitor.q0.z.a(), com.parizene.netmonitor.q0.y.a()));
        this.t = f.c.b.b(com.parizene.netmonitor.g0.a());
        this.u = f.c.b.b(u0.a(this.f13631i));
        this.v = f.c.b.b(r0.a());
        h.a.a<com.parizene.netmonitor.m0.l> aVarB9 = f.c.b.b(com.parizene.netmonitor.m0.m.a());
        this.w = aVarB9;
        h.a.a<com.parizene.netmonitor.m0.g> aVarB10 = f.c.b.b(com.parizene.netmonitor.m0.h.a(aVarB9));
        this.x = aVarB10;
        this.y = f.c.b.b(com.parizene.netmonitor.m0.j.a(aVarB10, this.f13632j));
        this.z = f.c.b.b(com.parizene.netmonitor.m0.o.a(this.f13631i, this.u, this.w));
        this.A = f.c.b.b(com.parizene.netmonitor.m0.v.a(this.f13631i, this.f13632j));
        this.B = com.parizene.netmonitor.m0.s.a(this.f13631i, this.u, this.v);
        this.C = f.c.b.b(com.parizene.netmonitor.q0.h0.a(this.t, com.parizene.netmonitor.q0.z.a(), com.parizene.netmonitor.q0.y.a(), this.f13631i, this.u, this.v, this.y, this.z, this.A, this.B));
        this.D = f.c.b.b(com.parizene.netmonitor.q0.j0.a(com.parizene.netmonitor.q0.z.a(), com.parizene.netmonitor.q0.y.a(), this.f13631i, this.u, this.v, this.y, this.z, this.A, this.B));
        this.E = f.c.b.b(com.parizene.netmonitor.e0.a(this.f13624b, this.n));
        this.F = f.c.b.b(com.parizene.netmonitor.y.a(this.f13624b, this.n, this.f13625c, this.q, this.f13631i, this.s, com.parizene.netmonitor.q0.y.a(), this.C, this.D, this.o, this.E));
        h.a.a<PackageManager> aVarB11 = f.c.b.b(com.parizene.netmonitor.q0.m.a(this.f13624b));
        this.G = aVarB11;
        h.a.a<com.parizene.netmonitor.k0.e> aVarB12 = f.c.b.b(com.parizene.netmonitor.q0.u.a(this.a, this.f13631i, aVarB11));
        this.H = aVarB12;
        this.I = f.c.b.b(com.parizene.netmonitor.s0.c.d.a(this.f13624b, this.n, aVarB12, this.f13632j));
        this.J = f.c.b.b(com.parizene.netmonitor.q0.f.a(this.f13624b));
        h.a.a<ConnectivityManager> aVarB13 = f.c.b.b(com.parizene.netmonitor.q0.g.a(this.f13624b));
        this.K = aVarB13;
        this.L = f.c.b.b(com.parizene.netmonitor.l0.d.a(this.f13624b, this.n, aVarB13));
        this.M = f.c.b.b(com.parizene.netmonitor.q0.d0.a());
        this.N = f.c.b.b(com.parizene.netmonitor.q0.b0.a(this.f13624b));
        this.O = f.c.b.b(com.parizene.netmonitor.l.a(this.f13624b));
        this.P = new d();
        this.Q = new e();
        this.R = new f();
        this.S = new g();
        this.T = new h();
        this.U = new i();
        this.V = new j();
        this.W = new k();
        this.X = new l();
        this.Y = new a();
        this.Z = new b();
        this.a0 = new c();
        this.b0 = f.c.b.b(com.parizene.netmonitor.q0.i.a(this.f13624b));
        this.c0 = f.c.b.b(com.parizene.netmonitor.q0.e.a(this.f13624b));
        h.a.a<PowerManager> aVarB14 = f.c.b.b(com.parizene.netmonitor.q0.n.a(this.f13624b));
        this.d0 = aVarB14;
        h.a.a<com.parizene.netmonitor.foreground.a> aVarB15 = f.c.b.b(com.parizene.netmonitor.q0.g0.a(this.n, this.a, this.b0, this.c0, aVarB14));
        this.e0 = aVarB15;
        this.f0 = f.c.b.b(com.parizene.netmonitor.foreground.e.a(aVarB15));
        this.g0 = f.c.b.b(m1.a());
        this.h0 = f.c.b.b(n0.a(this.I));
        this.i0 = f.c.b.b(l0.a(this.f13624b));
        this.j0 = f.c.b.b(com.parizene.netmonitor.ui.nps.f.a());
        this.k0 = f.c.b.b(q0.a());
        h.a.a<e.c.d.f> aVarB16 = f.c.b.b(com.parizene.netmonitor.q0.f0.a());
        this.l0 = aVarB16;
        this.m0 = f.c.b.b(com.parizene.netmonitor.ui.m0.a(this.M, aVarB16));
        this.n0 = f.c.b.b(com.parizene.netmonitor.q0.x.a());
        this.o0 = f.c.b.b(com.parizene.netmonitor.ui.log.k.a(this.f13633k));
        this.p0 = f.c.b.b(com.parizene.netmonitor.ui.map.u0.a(this.f13624b));
        this.q0 = f.c.b.b(com.parizene.netmonitor.ui.map.v.a(this.f13624b, this.c0));
        h.a.a<WifiManager> aVarB17 = f.c.b.b(com.parizene.netmonitor.q0.r.a(this.f13624b));
        this.r0 = aVarB17;
        this.s0 = f.c.b.b(com.parizene.netmonitor.s0.e.e.a(this.f13624b, aVarB17, com.parizene.netmonitor.q0.z.a(), com.parizene.netmonitor.q0.y.a()));
        h.a.a<com.parizene.netmonitor.db.i.d> aVarB18 = f.c.b.b(com.parizene.netmonitor.q0.w.a());
        this.t0 = aVarB18;
        this.u0 = f.c.b.b(com.parizene.netmonitor.db.i.c.a(this.q, this.f13633k, this.O, aVarB18));
    }

    private App Z(App app) {
        com.parizene.netmonitor.m.n(app, this.f13625c.get());
        com.parizene.netmonitor.m.m(app, f.c.b.a(this.f13627e));
        com.parizene.netmonitor.m.f(app, f.c.b.a(this.q));
        com.parizene.netmonitor.m.g(app, f.c.b.a(this.n));
        com.parizene.netmonitor.m.l(app, f.c.b.a(this.F));
        com.parizene.netmonitor.m.o(app, this.I.get());
        com.parizene.netmonitor.m.a(app, f.c.b.a(this.J));
        com.parizene.netmonitor.m.e(app, this.L.get());
        com.parizene.netmonitor.m.d(app, f.c.b.a(com.parizene.netmonitor.q0.y.a()));
        com.parizene.netmonitor.m.r(app, f.c.b.a(m0.a()));
        com.parizene.netmonitor.m.p(app, W());
        com.parizene.netmonitor.m.j(app, this.M.get());
        com.parizene.netmonitor.m.i(app, f.c.b.a(this.f13632j));
        com.parizene.netmonitor.m.h(app, f.c.b.a(this.N));
        com.parizene.netmonitor.m.c(app, f.c.b.a(this.O));
        com.parizene.netmonitor.m.b(app, U());
        com.parizene.netmonitor.m.k(app, this.f0.get());
        com.parizene.netmonitor.m.q(app, this.g0.get());
        return app;
    }

    @Override // f.b.b
    /* renamed from: Y */
    public void a(App app) {
        Z(app);
    }

    private v0(Application application) {
        X(application);
    }
}