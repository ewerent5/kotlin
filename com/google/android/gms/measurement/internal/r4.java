package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class r4 {
    final z4 a;

    r4(z4 z4Var) {
        this.a = z4Var;
    }

    private final boolean c() {
        try {
            com.google.android.gms.common.p.b bVarA = com.google.android.gms.common.p.c.a(this.a.zzm());
            if (bVarA != null) {
                return bVarA.f("com.android.vending", 128).versionCode >= 80837300;
            }
            this.a.zzq().I().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e2) {
            this.a.zzq().I().b("Failed to retrieve Play Store version for Install Referrer", e2);
            return false;
        }
    }

    final Bundle a(String str, e.c.b.b.c.e.o2 o2Var) {
        this.a.zzp().d();
        if (o2Var == null) {
            this.a.zzq().D().a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle bundleW = o2Var.w(bundle);
            if (bundleW != null) {
                return bundleW;
            }
            this.a.zzq().A().a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e2) {
            this.a.zzq().A().b("Exception occurred while retrieving the Install Referrer", e2.getMessage());
            return null;
        }
    }

    protected final void b(String str) {
        if (str == null || str.isEmpty()) {
            this.a.zzq().E().a("Install Referrer Reporter was called with invalid app package name");
            return;
        }
        this.a.zzp().d();
        if (!c()) {
            this.a.zzq().G().a("Install Referrer Reporter is not available");
            return;
        }
        q4 q4Var = new q4(this, str);
        this.a.zzp().d();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = this.a.zzm().getPackageManager();
        if (packageManager == null) {
            this.a.zzq().E().a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
            return;
        }
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            this.a.zzq().G().a("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
        if (serviceInfo != null) {
            String str2 = serviceInfo.packageName;
            if (serviceInfo.name == null || !"com.android.vending".equals(str2) || !c()) {
                this.a.zzq().D().a("Play Store version 8.3.73 or higher required for Install Referrer");
                return;
            }
            try {
                this.a.zzq().I().b("Install Referrer Service is", com.google.android.gms.common.o.a.b().a(this.a.zzm(), new Intent(intent), q4Var, 1) ? "available" : "not available");
            } catch (Exception e2) {
                this.a.zzq().A().b("Exception occurred while binding to Install Referrer Service", e2.getMessage());
            }
        }
    }
}