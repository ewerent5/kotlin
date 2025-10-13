package com.google.firebase.crashlytics.d.h;

import java.io.File;
import java.io.IOException;

/* compiled from: CrashlyticsFileMarker.java */
/* loaded from: classes.dex */
class n {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.crashlytics.d.l.h f12450b;

    public n(String str, com.google.firebase.crashlytics.d.l.h hVar) {
        this.a = str;
        this.f12450b = hVar;
    }

    private File b() {
        return new File(this.f12450b.b(), this.a);
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e2) {
            com.google.firebase.crashlytics.d.b.f().e("Error creating marker: " + this.a, e2);
            return false;
        }
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}