package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import java.util.Objects;

/* compiled from: AutoValue_CreationContext.java */
/* loaded from: classes.dex */
final class c extends h {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final e.c.b.a.i.y.a f4374b;

    /* renamed from: c, reason: collision with root package name */
    private final e.c.b.a.i.y.a f4375c;

    /* renamed from: d, reason: collision with root package name */
    private final String f4376d;

    c(Context context, e.c.b.a.i.y.a aVar, e.c.b.a.i.y.a aVar2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.a = context;
        Objects.requireNonNull(aVar, "Null wallClock");
        this.f4374b = aVar;
        Objects.requireNonNull(aVar2, "Null monotonicClock");
        this.f4375c = aVar2;
        Objects.requireNonNull(str, "Null backendName");
        this.f4376d = str;
    }

    @Override // com.google.android.datatransport.runtime.backends.h
    public Context b() {
        return this.a;
    }

    @Override // com.google.android.datatransport.runtime.backends.h
    public String c() {
        return this.f4376d;
    }

    @Override // com.google.android.datatransport.runtime.backends.h
    public e.c.b.a.i.y.a d() {
        return this.f4375c;
    }

    @Override // com.google.android.datatransport.runtime.backends.h
    public e.c.b.a.i.y.a e() {
        return this.f4374b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a.equals(hVar.b()) && this.f4374b.equals(hVar.e()) && this.f4375c.equals(hVar.d()) && this.f4376d.equals(hVar.c());
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f4374b.hashCode()) * 1000003) ^ this.f4375c.hashCode()) * 1000003) ^ this.f4376d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.a + ", wallClock=" + this.f4374b + ", monotonicClock=" + this.f4375c + ", backendName=" + this.f4376d + "}";
    }
}