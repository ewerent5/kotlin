package com.google.firebase.crashlytics.d.h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* compiled from: DataCollectionArbiter.java */
/* loaded from: classes.dex */
public class s {
    private final SharedPreferences a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.c f12459b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f12460c;

    /* renamed from: d, reason: collision with root package name */
    e.c.b.b.e.i<Void> f12461d;

    /* renamed from: e, reason: collision with root package name */
    boolean f12462e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f12463f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f12464g;

    /* renamed from: h, reason: collision with root package name */
    private e.c.b.b.e.i<Void> f12465h;

    public s(com.google.firebase.c cVar) {
        Object obj = new Object();
        this.f12460c = obj;
        this.f12461d = new e.c.b.b.e.i<>();
        this.f12462e = false;
        this.f12463f = false;
        this.f12465h = new e.c.b.b.e.i<>();
        Context contextG = cVar.g();
        this.f12459b = cVar;
        this.a = h.t(contextG);
        Boolean boolB = b();
        this.f12464g = boolB == null ? a(contextG) : boolB;
        synchronized (obj) {
            if (d()) {
                this.f12461d.e(null);
                this.f12462e = true;
            }
        }
    }

    private Boolean a(Context context) {
        Boolean boolF = f(context);
        if (boolF == null) {
            this.f12463f = false;
            return null;
        }
        this.f12463f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(boolF));
    }

    private Boolean b() {
        if (!this.a.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.f12463f = false;
        return Boolean.valueOf(this.a.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    private void e(boolean z) {
        com.google.firebase.crashlytics.d.b.f().b(String.format("Crashlytics automatic data collection %s by %s.", z ? "ENABLED" : "DISABLED", this.f12464g == null ? "global Firebase setting" : this.f12463f ? "firebase_crashlytics_collection_enabled manifest flag" : "API"));
    }

    private static Boolean f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e2) {
            com.google.firebase.crashlytics.d.b.f().c("Unable to get PackageManager. Falling through", e2);
            return null;
        }
    }

    @SuppressLint({"ApplySharedPref"})
    private static void h(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (bool != null) {
            editorEdit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("firebase_crashlytics_collection_enabled");
        }
        editorEdit.commit();
    }

    public void c(boolean z) {
        if (!z) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.f12465h.e(null);
    }

    public synchronized boolean d() {
        boolean zBooleanValue;
        Boolean bool = this.f12464g;
        zBooleanValue = bool != null ? bool.booleanValue() : this.f12459b.p();
        e(zBooleanValue);
        return zBooleanValue;
    }

    public synchronized void g(Boolean bool) {
        if (bool != null) {
            try {
                this.f12463f = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f12464g = bool != null ? bool : a(this.f12459b.g());
        h(this.a, bool);
        synchronized (this.f12460c) {
            if (d()) {
                if (!this.f12462e) {
                    this.f12461d.e(null);
                    this.f12462e = true;
                }
            } else if (this.f12462e) {
                this.f12461d = new e.c.b.b.e.i<>();
                this.f12462e = false;
            }
        }
    }

    public e.c.b.b.e.h<Void> i() {
        e.c.b.b.e.h<Void> hVarA;
        synchronized (this.f12460c) {
            hVarA = this.f12461d.a();
        }
        return hVarA;
    }

    public e.c.b.b.e.h<Void> j() {
        return k0.h(this.f12465h.a(), i());
    }
}