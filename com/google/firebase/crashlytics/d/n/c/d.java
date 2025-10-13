package com.google.firebase.crashlytics.d.n.c;

import com.google.firebase.crashlytics.d.n.c.c;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: SessionReport.java */
/* loaded from: classes.dex */
public class d implements c {
    private final File a;

    /* renamed from: b, reason: collision with root package name */
    private final File[] f12710b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f12711c;

    public d(File file) {
        this(file, Collections.emptyMap());
    }

    @Override // com.google.firebase.crashlytics.d.n.c.c
    public Map<String, String> a() {
        return Collections.unmodifiableMap(this.f12711c);
    }

    @Override // com.google.firebase.crashlytics.d.n.c.c
    public String b() {
        String strE = e();
        return strE.substring(0, strE.lastIndexOf(46));
    }

    @Override // com.google.firebase.crashlytics.d.n.c.c
    public File c() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.d.n.c.c
    public File[] d() {
        return this.f12710b;
    }

    @Override // com.google.firebase.crashlytics.d.n.c.c
    public String e() {
        return c().getName();
    }

    @Override // com.google.firebase.crashlytics.d.n.c.c
    public c.a getType() {
        return c.a.JAVA;
    }

    @Override // com.google.firebase.crashlytics.d.n.c.c
    public void remove() {
        com.google.firebase.crashlytics.d.b.f().b("Removing report at " + this.a.getPath());
        this.a.delete();
    }

    public d(File file, Map<String, String> map) {
        this.a = file;
        this.f12710b = new File[]{file};
        this.f12711c = new HashMap(map);
    }
}