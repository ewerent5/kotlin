package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.p;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public class j {

    @Deprecated
    public static final int a = 12451000;

    /* renamed from: c */
    private static boolean f4760c = false;

    /* renamed from: d */
    static boolean f4761d = false;

    /* renamed from: b */
    static final AtomicBoolean f4759b = new AtomicBoolean();

    /* renamed from: e */
    private static final AtomicBoolean f4762e = new AtomicBoolean();

    j() {
    }

    @Deprecated
    public static int a(@RecentlyNonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    public static String b(int i2) {
        return b.M(i2);
    }

    @RecentlyNullable
    public static Context c(@RecentlyNonNull Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @RecentlyNullable
    public static Resources d(@RecentlyNonNull Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean e(@RecentlyNonNull Context context) {
        try {
            if (!f4761d) {
                PackageInfo packageInfoF = com.google.android.gms.common.p.c.a(context).f("com.google.android.gms", 64);
                k.a(context);
                if (packageInfoF == null || k.e(packageInfoF, false) || !k.e(packageInfoF, true)) {
                    f4760c = false;
                } else {
                    f4760c = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
        } finally {
            f4761d = true;
        }
        return f4760c || !com.google.android.gms.common.util.j.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x00b3  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int f(@androidx.annotation.RecentlyNonNull android.content.Context r10, int r11) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.j.f(android.content.Context, int):int");
    }

    @Deprecated
    public static boolean g(@RecentlyNonNull Context context, int i2) {
        if (i2 == 18) {
            return true;
        }
        if (i2 == 1) {
            return k(context, "com.google.android.gms");
        }
        return false;
    }

    @TargetApi(18)
    public static boolean h(@RecentlyNonNull Context context) {
        if (!com.google.android.gms.common.util.n.e()) {
            return false;
        }
        Object systemService = context.getSystemService("user");
        p.j(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @Deprecated
    public static boolean i(int i2) {
        return i2 == 1 || i2 == 2 || i2 == 3 || i2 == 9;
    }

    @TargetApi(19)
    @Deprecated
    public static boolean j(@RecentlyNonNull Context context, int i2, @RecentlyNonNull String str) {
        return com.google.android.gms.common.util.s.b(context, i2, str);
    }

    @TargetApi(21)
    static boolean k(Context context, String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo;
        boolean zEquals = str.equals("com.google.android.gms");
        if (com.google.android.gms.common.util.n.h()) {
            try {
                Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return zEquals ? applicationInfo.enabled : applicationInfo.enabled && !h(context);
    }
}