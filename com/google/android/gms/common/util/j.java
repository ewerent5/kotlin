package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.RecentlyNonNull;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class j {
    private static Boolean a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f4775b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f4776c;

    /* renamed from: d, reason: collision with root package name */
    private static Boolean f4777d;

    public static boolean a(@RecentlyNonNull Context context) {
        if (f4776c == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z = true;
            }
            f4776c = Boolean.valueOf(z);
        }
        return f4776c.booleanValue();
    }

    @TargetApi(21)
    public static boolean b(@RecentlyNonNull Context context) {
        return g(context);
    }

    public static boolean c() {
        int i2 = com.google.android.gms.common.j.a;
        return "user".equals(Build.TYPE);
    }

    @TargetApi(20)
    public static boolean d(@RecentlyNonNull Context context) {
        return e(context.getPackageManager());
    }

    @TargetApi(20)
    public static boolean e(@RecentlyNonNull PackageManager packageManager) {
        if (a == null) {
            boolean z = false;
            if (n.g() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            a = Boolean.valueOf(z);
        }
        return a.booleanValue();
    }

    @TargetApi(26)
    public static boolean f(@RecentlyNonNull Context context) {
        if (d(context)) {
            if (!n.j()) {
                return true;
            }
            if (g(context) && !n.k()) {
                return true;
            }
        }
        return false;
    }

    @TargetApi(21)
    public static boolean g(@RecentlyNonNull Context context) {
        if (f4775b == null) {
            boolean z = false;
            if (n.h() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z = true;
            }
            f4775b = Boolean.valueOf(z);
        }
        return f4775b.booleanValue();
    }

    public static boolean h(@RecentlyNonNull Context context) {
        if (f4777d == null) {
            boolean z = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            f4777d = Boolean.valueOf(z);
        }
        return f4777d.booleanValue();
    }
}