package com.google.firebase.p;

import java.util.Objects;
import javax.annotation.Nonnull;

/* compiled from: AutoValue_LibraryVersion.java */
/* loaded from: classes.dex */
final class a extends f {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12895b;

    a(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.a = str;
        Objects.requireNonNull(str2, "Null version");
        this.f12895b = str2;
    }

    @Override // com.google.firebase.p.f
    @Nonnull
    public String b() {
        return this.a;
    }

    @Override // com.google.firebase.p.f
    @Nonnull
    public String c() {
        return this.f12895b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a.equals(fVar.b()) && this.f12895b.equals(fVar.c());
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f12895b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.a + ", version=" + this.f12895b + "}";
    }
}