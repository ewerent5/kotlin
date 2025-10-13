package com.parizene.netmonitor.ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.navigation.NavController;
import com.google.android.play.core.review.ReviewInfo;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.ui.HomeFragment;
import com.parizene.netmonitor.ui.PermissionsFragment;
import com.parizene.netmonitor.ui.z0;

/* compiled from: HomeActivity.kt */
/* loaded from: classes3.dex */
public final class HomeActivity extends androidx.appcompat.app.c implements PermissionsFragment.a, HomeFragment.a {
    public static final a x = new a(null);
    public f.a<com.parizene.netmonitor.ui.nps.e> A;
    private NavController B;
    public f.a<com.google.android.play.core.review.a> y;
    public f.a<com.google.firebase.remoteconfig.g> z;

    /* compiled from: HomeActivity.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i.y.d.g gVar) {
            this();
        }
    }

    private final void Z() {
        String strH = U().get().h("rate_app_type");
        i.y.d.l.c(strH, "firebaseRemoteConfig.get().getString(FirebaseRemoteConfigConstants.KEY_RATE_APP_TYPE)");
        m.a.a.a("navigateRate: type=%s", strH);
        if (i.y.d.l.a(strH, "dialog")) {
            NavController navController = this.B;
            if (navController != null) {
                navController.k(R.id.rateDialog);
                return;
            } else {
                i.y.d.l.m("navController");
                throw null;
            }
        }
        if (!i.y.d.l.a(strH, "nps")) {
            e.c.b.d.a.f.e<ReviewInfo> eVarB = W().get().b();
            i.y.d.l.c(eVarB, "reviewManager.get().requestReviewFlow()");
            eVarB.a(new e.c.b.d.a.f.a() { // from class: com.parizene.netmonitor.ui.b
                @Override // e.c.b.d.a.f.a
                public final void a(e.c.b.d.a.f.e eVar) {
                    HomeActivity.a0(this.a, eVar);
                }
            });
        } else {
            if (!V().get().b()) {
                com.parizene.netmonitor.t0.f.p.f(-1);
                return;
            }
            NavController navController2 = this.B;
            if (navController2 != null) {
                navController2.k(R.id.npsActivity);
            } else {
                i.y.d.l.m("navController");
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(HomeActivity homeActivity, e.c.b.d.a.f.e eVar) {
        i.y.d.l.d(homeActivity, "this$0");
        i.y.d.l.d(eVar, "request");
        if (eVar.g()) {
            e.c.b.d.a.f.e<Void> eVarA = homeActivity.W().get().a(homeActivity, (ReviewInfo) eVar.e());
            i.y.d.l.c(eVarA, "reviewManager.get().launchReviewFlow(this, request.result)");
            eVarA.a(new e.c.b.d.a.f.a() { // from class: com.parizene.netmonitor.ui.c
                @Override // e.c.b.d.a.f.a
                public final void a(e.c.b.d.a.f.e eVar2) {
                    HomeActivity.b0(eVar2);
                }
            });
        } else {
            NavController navController = homeActivity.B;
            if (navController != null) {
                navController.k(R.id.rateDialog);
            } else {
                i.y.d.l.m("navController");
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b0(e.c.b.d.a.f.e eVar) {
        i.y.d.l.d(eVar, "it");
        com.parizene.netmonitor.t0.f.p.f(-1);
    }

    private final boolean c0() {
        com.parizene.netmonitor.t0.c cVar = com.parizene.netmonitor.t0.f.p;
        Integer numG = cVar.g();
        if (numG != null && numG.intValue() == -1) {
            return false;
        }
        i.y.d.l.c(numG, "rateCount");
        if (numG.intValue() >= 5) {
            return false;
        }
        Integer numValueOf = Integer.valueOf(numG.intValue() + 1);
        cVar.f(numValueOf);
        return numValueOf.intValue() == 5;
    }

    public final f.a<com.google.firebase.remoteconfig.g> U() {
        f.a<com.google.firebase.remoteconfig.g> aVar = this.z;
        if (aVar != null) {
            return aVar;
        }
        i.y.d.l.m("firebaseRemoteConfig");
        throw null;
    }

    public final f.a<com.parizene.netmonitor.ui.nps.e> V() {
        f.a<com.parizene.netmonitor.ui.nps.e> aVar = this.A;
        if (aVar != null) {
            return aVar;
        }
        i.y.d.l.m("npsController");
        throw null;
    }

    public final f.a<com.google.android.play.core.review.a> W() {
        f.a<com.google.android.play.core.review.a> aVar = this.y;
        if (aVar != null) {
            return aVar;
        }
        i.y.d.l.m("reviewManager");
        throw null;
    }

    @Override // com.parizene.netmonitor.ui.PermissionsFragment.a
    public void a() {
        PermissionsFragment.a.C0166a.b(this);
    }

    @Override // com.parizene.netmonitor.ui.HomeFragment.a
    public void c() {
        z0 z0VarA = new z0.b("home menu").b(true).a();
        i.y.d.l.c(z0VarA, "Builder(AnalyticsConstants.IntroSource.HOME_MENU)\n                .setShowOnlyPurchaseScreen(true)\n                .build()");
        NavController navController = this.B;
        if (navController != null) {
            navController.l(R.id.introActivity, z0VarA.d());
        } else {
            i.y.d.l.m("navController");
            throw null;
        }
    }

    @Override // com.parizene.netmonitor.ui.PermissionsFragment.a
    public void e() {
        PermissionsFragment.a.C0166a.a(this);
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        f.b.a.a(this);
        super.onCreate(bundle);
        setContentView(R.layout.activity_home);
        NavController navControllerA = androidx.navigation.q.a(this, R.id.nav_host_fragment);
        i.y.d.l.c(navControllerA, "findNavController(this, R.id.nav_host_fragment)");
        this.B = navControllerA;
        if (navControllerA == null) {
            i.y.d.l.m("navController");
            throw null;
        }
        androidx.navigation.k kVarC = navControllerA.h().c(R.navigation.home_graph);
        i.y.d.l.c(kVarC, "navController.navInflater.inflate(R.navigation.home_graph)");
        if (n0.a.a(this)) {
            kVarC.J(R.id.homeFragment);
            NavController navController = this.B;
            if (navController == null) {
                i.y.d.l.m("navController");
                throw null;
            }
            navController.x(kVarC);
            if (bundle == null && c0()) {
                Z();
                return;
            }
            return;
        }
        kVarC.J(R.id.blankFragment);
        NavController navController2 = this.B;
        if (navController2 == null) {
            i.y.d.l.m("navController");
            throw null;
        }
        navController2.x(kVarC);
        z0 z0VarA = new z0.b("grant permissions").a();
        i.y.d.l.c(z0VarA, "Builder(AnalyticsConstants.IntroSource.GRANT_PERMISSIONS)\n                    .build()");
        NavController navController3 = this.B;
        if (navController3 == null) {
            i.y.d.l.m("navController");
            throw null;
        }
        navController3.l(R.id.introActivity, z0VarA.d());
        finish();
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // com.parizene.netmonitor.ui.HomeFragment.a
    public void s(boolean z) {
        if (z) {
            getWindow().addFlags(128);
        } else {
            getWindow().clearFlags(128);
        }
    }
}