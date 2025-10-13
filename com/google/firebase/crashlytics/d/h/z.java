package com.google.firebase.crashlytics.d.h;

import android.content.Context;

/* compiled from: InstallerPackageNameProvider.java */
/* loaded from: classes.dex */
class z {
    private String a;

    z() {
    }

    private static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    synchronized String a(Context context) {
        if (this.a == null) {
            this.a = b(context);
        }
        return "".equals(this.a) ? null : this.a;
    }
}