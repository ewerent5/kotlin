package com.google.firebase.o;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.google.firebase.l.c;

/* compiled from: DataCollectionConfigStorage.java */
/* loaded from: classes.dex */
public class a {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f12892b;

    /* renamed from: c, reason: collision with root package name */
    private final c f12893c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f12894d;

    public a(Context context, String str, c cVar) {
        Context contextA = a(context);
        this.a = contextA;
        this.f12892b = contextA.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f12893c = cVar;
        this.f12894d = c();
    }

    private static Context a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : androidx.core.content.a.b(context);
    }

    private boolean c() {
        return this.f12892b.contains("firebase_data_collection_default_enabled") ? this.f12892b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public synchronized boolean b() {
        return this.f12894d;
    }
}