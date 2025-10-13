package com.parizene.netmonitor.ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.navigation.NavController;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.k0.d;
import com.parizene.netmonitor.ui.PermissionsFragment;
import com.parizene.netmonitor.ui.PurchaseFragment;

/* compiled from: IntroActivity.kt */
/* loaded from: classes3.dex */
public final class IntroActivity extends androidx.appcompat.app.c implements PermissionsFragment.a, PurchaseFragment.a {
    public org.greenrobot.eventbus.c A;
    private z0 B;
    private NavController C;
    public com.parizene.netmonitor.s0.c.c x;
    public com.parizene.netmonitor.k0.e y;
    public f.a<com.parizene.netmonitor.i0> z;

    private final void Y() {
        startActivity(new Intent(this, (Class<?>) HomeActivity.class));
    }

    private final void Z() {
        startActivity(e1.a.b());
    }

    public final com.parizene.netmonitor.k0.e U() {
        com.parizene.netmonitor.k0.e eVar = this.y;
        if (eVar != null) {
            return eVar;
        }
        i.y.d.l.m("analyticsTracker");
        throw null;
    }

    public final org.greenrobot.eventbus.c V() {
        org.greenrobot.eventbus.c cVar = this.A;
        if (cVar != null) {
            return cVar;
        }
        i.y.d.l.m("eventBus");
        throw null;
    }

    public final com.parizene.netmonitor.s0.c.c W() {
        com.parizene.netmonitor.s0.c.c cVar = this.x;
        if (cVar != null) {
            return cVar;
        }
        i.y.d.l.m("premiumHelper");
        throw null;
    }

    public final f.a<com.parizene.netmonitor.i0> X() {
        f.a<com.parizene.netmonitor.i0> aVar = this.z;
        if (aVar != null) {
            return aVar;
        }
        i.y.d.l.m("userInfo");
        throw null;
    }

    @Override // com.parizene.netmonitor.ui.PermissionsFragment.a
    public void a() {
        Z();
    }

    @Override // com.parizene.netmonitor.ui.PurchaseFragment.a
    public void d() {
        Z();
    }

    @Override // com.parizene.netmonitor.ui.PermissionsFragment.a
    public void e() {
        boolean zA = X().get().a();
        U().a(d.c.c(zA));
        if (!zA) {
            finish();
            return;
        }
        X().get().b(false);
        NavController navController = this.C;
        if (navController == null) {
            i.y.d.l.m("navController");
            throw null;
        }
        navController.k(R.id.action_permissionsFragment_to_purchaseFragment);
        V().r(this);
    }

    @Override // android.app.Activity
    public void finish() {
        z0 z0Var = this.B;
        if (z0Var == null) {
            i.y.d.l.m("args");
            throw null;
        }
        if (!z0Var.b()) {
            Y();
        }
        super.finish();
    }

    @Override // com.parizene.netmonitor.ui.PurchaseFragment.a
    public void j() {
        com.parizene.netmonitor.k0.e eVarU = U();
        z0 z0Var = this.B;
        if (z0Var == null) {
            i.y.d.l.m("args");
            throw null;
        }
        eVarU.a(d.c.e(z0Var.c()));
        W().y(this);
    }

    @Override // com.parizene.netmonitor.ui.PurchaseFragment.a
    public void l() {
        finish();
    }

    @org.greenrobot.eventbus.m(sticky = true)
    public final void on(com.parizene.netmonitor.s0.c.b bVar) {
        if (W().x()) {
            com.parizene.netmonitor.k0.e eVarU = U();
            z0 z0Var = this.B;
            if (z0Var == null) {
                i.y.d.l.m("args");
                throw null;
            }
            eVarU.a(d.c.d(z0Var.c()));
            finish();
        }
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        W().f(i2, i3, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        z0 z0Var = this.B;
        if (z0Var == null) {
            i.y.d.l.m("args");
            throw null;
        }
        if (z0Var.b()) {
            super.onBackPressed();
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        f.b.a.a(this);
        super.onCreate(bundle);
        setContentView(R.layout.activity_intro);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        z0 z0VarA = z0.a(extras);
        i.y.d.l.c(z0VarA, "fromBundle(intent.extras ?: Bundle())");
        this.B = z0VarA;
        if (bundle == null) {
            com.parizene.netmonitor.k0.e eVarU = U();
            z0 z0Var = this.B;
            if (z0Var == null) {
                i.y.d.l.m("args");
                throw null;
            }
            eVarU.a(d.c.b(z0Var.c()));
        }
        NavController navControllerA = androidx.navigation.q.a(this, R.id.nav_host_fragment);
        i.y.d.l.c(navControllerA, "findNavController(this, R.id.nav_host_fragment)");
        this.C = navControllerA;
        if (navControllerA == null) {
            i.y.d.l.m("navController");
            throw null;
        }
        androidx.navigation.k kVarC = navControllerA.h().c(R.navigation.intro_graph);
        i.y.d.l.c(kVarC, "navController.navInflater.inflate(R.navigation.intro_graph)");
        z0 z0Var2 = this.B;
        if (z0Var2 == null) {
            i.y.d.l.m("args");
            throw null;
        }
        if (!z0Var2.b()) {
            kVarC.J(R.id.permissionsFragment);
            NavController navController = this.C;
            if (navController != null) {
                navController.x(kVarC);
                return;
            } else {
                i.y.d.l.m("navController");
                throw null;
            }
        }
        kVarC.J(R.id.purchaseFragment);
        NavController navController2 = this.C;
        if (navController2 == null) {
            i.y.d.l.m("navController");
            throw null;
        }
        navController2.x(kVarC);
        V().r(this);
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.d, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        V().t(this);
    }
}