package com.google.firebase.crashlytics.d.h;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* compiled from: AppData.java */
/* loaded from: classes.dex */
class b {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12341b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12342c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12343d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12344e;

    /* renamed from: f, reason: collision with root package name */
    public final String f12345f;

    /* renamed from: g, reason: collision with root package name */
    public final com.google.firebase.crashlytics.d.r.b f12346g;

    public b(String str, String str2, String str3, String str4, String str5, String str6, com.google.firebase.crashlytics.d.r.b bVar) {
        this.a = str;
        this.f12341b = str2;
        this.f12342c = str3;
        this.f12343d = str4;
        this.f12344e = str5;
        this.f12345f = str6;
        this.f12346g = bVar;
    }

    public static b a(Context context, x xVar, String str, String str2, com.google.firebase.crashlytics.d.r.b bVar) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String strE = xVar.e();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String string = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new b(str, str2, strE, packageName, string, str3, bVar);
    }
}