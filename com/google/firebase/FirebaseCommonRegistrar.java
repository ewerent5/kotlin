package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements com.google.firebase.components.h {
    static /* synthetic */ String a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    static /* synthetic */ String b(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
    }

    static /* synthetic */ String c(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 16 || !context.getPackageManager().hasSystemFeature("android.hardware.type.television")) ? (i2 < 20 || !context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) ? (i2 < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) ? (i2 < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded" : "auto" : "watch" : "tv";
    }

    static /* synthetic */ String d(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? e(installerPackageName) : "";
    }

    private static String e(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.h
    public List<com.google.firebase.components.d<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.google.firebase.p.c.b());
        arrayList.add(com.google.firebase.m.c.b());
        arrayList.add(com.google.firebase.p.h.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(com.google.firebase.p.h.a("fire-core", "19.4.0"));
        arrayList.add(com.google.firebase.p.h.a("device-name", e(Build.PRODUCT)));
        arrayList.add(com.google.firebase.p.h.a("device-model", e(Build.DEVICE)));
        arrayList.add(com.google.firebase.p.h.a("device-brand", e(Build.BRAND)));
        arrayList.add(com.google.firebase.p.h.b("android-target-sdk", d.b()));
        arrayList.add(com.google.firebase.p.h.b("android-min-sdk", e.b()));
        arrayList.add(com.google.firebase.p.h.b("android-platform", f.b()));
        arrayList.add(com.google.firebase.p.h.b("android-installer", g.b()));
        String strA = com.google.firebase.p.e.a();
        if (strA != null) {
            arrayList.add(com.google.firebase.p.h.a("kotlin", strA));
        }
        return arrayList;
    }
}