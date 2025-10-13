package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class v4 {
    private c.c.b.e a;

    /* renamed from: b, reason: collision with root package name */
    private c.c.b.b f9639b;

    /* renamed from: c, reason: collision with root package name */
    private c.c.b.d f9640c;

    /* renamed from: d, reason: collision with root package name */
    private t4 f9641d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
            for (int i2 = 0; i2 < listQueryIntentActivities.size(); i2++) {
                if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i2).activityInfo.name)) {
                    return resolveInfoResolveActivity.activityInfo.packageName.equals(xo2.a(context));
                }
            }
        }
        return false;
    }

    public final void b(Activity activity) {
        c.c.b.d dVar = this.f9640c;
        if (dVar == null) {
            return;
        }
        activity.unbindService(dVar);
        this.f9639b = null;
        this.a = null;
        this.f9640c = null;
    }

    public final c.c.b.e c() {
        c.c.b.b bVar = this.f9639b;
        if (bVar == null) {
            this.a = null;
        } else if (this.a == null) {
            this.a = bVar.b(null);
        }
        return this.a;
    }

    public final void d(t4 t4Var) {
        this.f9641d = t4Var;
    }

    public final void e(Activity activity) {
        String strA;
        if (this.f9639b == null && (strA = xo2.a(activity)) != null) {
            yo2 yo2Var = new yo2(this, null);
            this.f9640c = yo2Var;
            c.c.b.b.a(activity, strA, yo2Var);
        }
    }

    public final void f(c.c.b.b bVar) {
        this.f9639b = bVar;
        bVar.c(0L);
        t4 t4Var = this.f9641d;
        if (t4Var != null) {
            t4Var.zza();
        }
    }

    public final void g() {
        this.f9639b = null;
        this.a = null;
    }
}