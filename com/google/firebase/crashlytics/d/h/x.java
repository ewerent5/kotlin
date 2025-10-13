package com.google.firebase.crashlytics.d.h;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* compiled from: IdManager.java */
/* loaded from: classes.dex */
public class x implements y {
    private static final Pattern a = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: b, reason: collision with root package name */
    private static final String f12485b = Pattern.quote("/");

    /* renamed from: c, reason: collision with root package name */
    private final z f12486c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f12487d;

    /* renamed from: e, reason: collision with root package name */
    private final String f12488e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.firebase.installations.g f12489f;

    /* renamed from: g, reason: collision with root package name */
    private String f12490g;

    public x(Context context, String str, com.google.firebase.installations.g gVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f12487d = context;
        this.f12488e = str;
        this.f12489f = gVar;
        this.f12486c = new z();
    }

    private synchronized String b(String str, SharedPreferences sharedPreferences) {
        String strC;
        strC = c(UUID.randomUUID().toString());
        com.google.firebase.crashlytics.d.b.f().b("Created new Crashlytics IID: " + strC);
        sharedPreferences.edit().putString("crashlytics.installation.id", strC).putString("firebase.installation.id", str).apply();
        return strC;
    }

    private static String c(String str) {
        if (str == null) {
            return null;
        }
        return a.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    private synchronized void i(String str, String str2, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        com.google.firebase.crashlytics.d.b.f().b("Migrating legacy Crashlytics IID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", str).putString("firebase.installation.id", str2).apply();
        sharedPreferences2.edit().remove("crashlytics.installation.id").remove("crashlytics.advertising.id").apply();
    }

    private String j(String str) {
        return str.replaceAll(f12485b, "");
    }

    @Override // com.google.firebase.crashlytics.d.h.y
    public synchronized String a() {
        String str;
        String str2 = this.f12490g;
        if (str2 != null) {
            return str2;
        }
        SharedPreferences sharedPreferencesT = h.t(this.f12487d);
        e.c.b.b.e.h<String> hVarG = this.f12489f.G();
        String string = sharedPreferencesT.getString("firebase.installation.id", null);
        try {
            str = (String) k0.a(hVarG);
        } catch (Exception e2) {
            com.google.firebase.crashlytics.d.b.f().c("Failed to retrieve installation id", e2);
            str = string != null ? string : null;
        }
        if (string != null) {
            if (string.equals(str)) {
                this.f12490g = sharedPreferencesT.getString("crashlytics.installation.id", null);
                com.google.firebase.crashlytics.d.b.f().b("Found matching FID, using Crashlytics IID: " + this.f12490g);
                if (this.f12490g == null) {
                    this.f12490g = b(str, sharedPreferencesT);
                }
            } else {
                this.f12490g = b(str, sharedPreferencesT);
            }
            return this.f12490g;
        }
        SharedPreferences sharedPreferencesO = h.o(this.f12487d);
        String string2 = sharedPreferencesO.getString("crashlytics.installation.id", null);
        com.google.firebase.crashlytics.d.b.f().b("No cached FID; legacy id is " + string2);
        if (string2 == null) {
            this.f12490g = b(str, sharedPreferencesT);
        } else {
            this.f12490g = string2;
            i(string2, str, sharedPreferencesT, sharedPreferencesO);
        }
        return this.f12490g;
    }

    public String d() {
        return this.f12488e;
    }

    public String e() {
        return this.f12486c.a(this.f12487d);
    }

    public String f() {
        return String.format(Locale.US, "%s/%s", j(Build.MANUFACTURER), j(Build.MODEL));
    }

    public String g() {
        return j(Build.VERSION.INCREMENTAL);
    }

    public String h() {
        return j(Build.VERSION.RELEASE);
    }
}