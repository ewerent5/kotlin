package com.google.firebase.crashlytics.d.n.c;

import com.google.firebase.crashlytics.d.n.c.c;
import java.io.File;
import java.util.Map;

/* compiled from: NativeSessionReport.java */
/* loaded from: classes.dex */
public class b implements c {
    private final File a;

    public b(File file) {
        this.a = file;
    }

    @Override // com.google.firebase.crashlytics.d.n.c.c
    public Map<String, String> a() {
        return null;
    }

    @Override // com.google.firebase.crashlytics.d.n.c.c
    public String b() {
        return this.a.getName();
    }

    @Override // com.google.firebase.crashlytics.d.n.c.c
    public File c() {
        return null;
    }

    @Override // com.google.firebase.crashlytics.d.n.c.c
    public File[] d() {
        return this.a.listFiles();
    }

    @Override // com.google.firebase.crashlytics.d.n.c.c
    public String e() {
        return null;
    }

    @Override // com.google.firebase.crashlytics.d.n.c.c
    public c.a getType() {
        return c.a.NATIVE;
    }

    @Override // com.google.firebase.crashlytics.d.n.c.c
    public void remove() {
        for (File file : d()) {
            com.google.firebase.crashlytics.d.b.f().b("Removing native report file at " + file.getPath());
            file.delete();
        }
        com.google.firebase.crashlytics.d.b.f().b("Removing native report directory at " + this.a);
        this.a.delete();
    }
}