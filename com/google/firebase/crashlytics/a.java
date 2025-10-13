package com.google.firebase.crashlytics;

import android.os.Bundle;
import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.analytics.a.a;

/* compiled from: CrashlyticsAnalyticsListener.java */
/* loaded from: classes.dex */
class a implements a.b {
    private com.google.firebase.crashlytics.d.f.b a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.firebase.crashlytics.d.f.b f12308b;

    a() {
    }

    private static void b(com.google.firebase.crashlytics.d.f.b bVar, String str, Bundle bundle) {
        if (bVar == null) {
            return;
        }
        bVar.b(str, bundle);
    }

    private void c(String str, Bundle bundle) {
        b("clx".equals(bundle.getString("_o")) ? this.a : this.f12308b, str, bundle);
    }

    @Override // com.google.firebase.analytics.a.a.b
    public void a(int i2, Bundle bundle) {
        String string;
        com.google.firebase.crashlytics.d.b.f().b("Received Analytics message: " + i2 + " " + bundle);
        if (bundle == null || (string = bundle.getString(Action.NAME_ATTRIBUTE)) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        c(string, bundle2);
    }

    public void d(com.google.firebase.crashlytics.d.f.b bVar) {
        this.f12308b = bVar;
    }

    public void e(com.google.firebase.crashlytics.d.f.b bVar) {
        this.a = bVar;
    }
}