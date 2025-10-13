package com.parizene.netmonitor.k0;

import android.app.Application;
import android.content.pm.PackageManager;
import e.a.a.k;
import e.a.a.l;
import org.json.JSONException;

/* compiled from: AmplitudeAnalyticsTracker.java */
/* loaded from: classes.dex */
public class a implements e {
    public a(Application application, com.parizene.netmonitor.m0.d0.d dVar, PackageManager packageManager) throws JSONException {
        String strA = b.a(dVar.u());
        int iT = dVar.t();
        e.a.a.b.a().s0().p(false).a0(2).e0(new l().b().c()).x(application, "3da5e048766f603eb8823f4ddaa78ad4").n().o(application).h0(true).u(new k().c("phone_type", strA).e("telephony_type").b("phone_count", iT).d("has_telephony", packageManager.hasSystemFeature("android.hardware.telephony")));
    }

    @Override // com.parizene.netmonitor.k0.e
    public void a(c cVar) {
        e.a.a.b.a().F(cVar.a(), cVar.b());
    }

    @Override // com.parizene.netmonitor.k0.e
    public void setEnabled(boolean z) {
        e.a.a.b.a().b0(!z);
    }
}