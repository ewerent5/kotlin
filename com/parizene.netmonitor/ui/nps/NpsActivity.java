package com.parizene.netmonitor.ui.nps;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.navigation.NavController;
import androidx.navigation.q;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.k0.d;
import com.parizene.netmonitor.ui.e1;
import com.parizene.netmonitor.ui.nps.NpsCollectFragment;
import com.parizene.netmonitor.ui.nps.NpsRateAppFragment;
import com.parizene.netmonitor.ui.nps.NpsSendFeedbackFragment;
import com.parizene.netmonitor.ui.nps.g;
import com.parizene.netmonitor.ui.nps.h;
import i.y.d.l;

/* compiled from: NpsActivity.kt */
/* loaded from: classes3.dex */
public final class NpsActivity extends androidx.appcompat.app.c implements NpsCollectFragment.a, NpsSendFeedbackFragment.a, NpsRateAppFragment.a {
    public static final a x = new a(null);
    public e A;
    private NavController y;
    public com.parizene.netmonitor.k0.e z;

    /* compiled from: NpsActivity.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i.y.d.g gVar) {
            this();
        }
    }

    private final void W(String str, String str2) {
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:"));
        Intent intent2 = new Intent("android.intent.action.SEND");
        intent2.putExtra("android.intent.extra.EMAIL", new String[]{"netmonitor@parizene.com"});
        intent2.putExtra("android.intent.extra.SUBJECT", str);
        intent2.putExtra("android.intent.extra.TEXT", str2);
        intent2.setSelector(intent);
        startActivity(Intent.createChooser(intent2, getString(R.string.nps_send_email_title)));
    }

    public final com.parizene.netmonitor.k0.e U() {
        com.parizene.netmonitor.k0.e eVar = this.z;
        if (eVar != null) {
            return eVar;
        }
        l.m("analyticsTracker");
        throw null;
    }

    public final e V() {
        e eVar = this.A;
        if (eVar != null) {
            return eVar;
        }
        l.m("npsController");
        throw null;
    }

    @Override // com.parizene.netmonitor.ui.nps.NpsRateAppFragment.a
    public void h(int i2) {
        U().a(d.g.b(i2));
        V().a(i.OPEN_PLAY_STORE_CLICKED);
        e1.a.d(this);
        finish();
    }

    @Override // com.parizene.netmonitor.ui.nps.NpsSendFeedbackFragment.a
    public void n(int i2, String str) {
        l.d(str, "feedback");
        U().a(d.g.e(i2));
        V().a(i.SEND_EMAIL_CLICKED);
        W(l.i(getString(R.string.app_name), " (1.10.2)"), "MANUFACTURER: " + ((Object) Build.MANUFACTURER) + "\nMODEL: " + ((Object) Build.MODEL) + "\nSDK_INT: " + Build.VERSION.SDK_INT + "\nScore: " + i2 + "\nFeedback: " + str);
        finish();
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        f.b.a.a(this);
        super.onCreate(bundle);
        setContentView(R.layout.activity_nps);
        if (bundle == null) {
            U().a(d.g.c());
            V().a(i.OPENED);
        }
        NavController navControllerA = q.a(this, R.id.nav_host_fragment);
        l.c(navControllerA, "findNavController(this, R.id.nav_host_fragment)");
        this.y = navControllerA;
    }

    @Override // com.parizene.netmonitor.ui.nps.NpsCollectFragment.a
    public void p(int i2) {
        U().a(d.g.d(i2));
        V().a(i.SUBMIT_SCORE_CLICKED);
        if (i2 < 5) {
            h hVarA = new h.b(i2).a();
            l.c(hVarA, "Builder(score).build()");
            NavController navController = this.y;
            if (navController != null) {
                navController.l(R.id.action_npsCollectFragment_to_npsSendFeedbackFragment, hVarA.c());
                return;
            } else {
                l.m("navController");
                throw null;
            }
        }
        g gVarA = new g.b(i2).a();
        l.c(gVarA, "Builder(score).build()");
        NavController navController2 = this.y;
        if (navController2 != null) {
            navController2.l(R.id.action_npsCollectFragment_to_npsRateAppFragment, gVarA.c());
        } else {
            l.m("navController");
            throw null;
        }
    }
}