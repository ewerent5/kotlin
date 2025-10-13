package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;
import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReport_CustomAttribute.java */
/* loaded from: classes.dex */
final class c extends v.b {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12530b;

    /* compiled from: AutoValue_CrashlyticsReport_CustomAttribute.java */
    static final class b extends v.b.a {
        private String a;

        /* renamed from: b, reason: collision with root package name */
        private String f12531b;

        b() {
        }

        @Override // com.google.firebase.crashlytics.d.j.v.b.a
        public v.b a() {
            String str = "";
            if (this.a == null) {
                str = " key";
            }
            if (this.f12531b == null) {
                str = str + " value";
            }
            if (str.isEmpty()) {
                return new c(this.a, this.f12531b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.d.j.v.b.a
        public v.b.a b(String str) {
            Objects.requireNonNull(str, "Null key");
            this.a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.b.a
        public v.b.a c(String str) {
            Objects.requireNonNull(str, "Null value");
            this.f12531b = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.d.j.v.b
    public String b() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.b
    public String c() {
        return this.f12530b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.b)) {
            return false;
        }
        v.b bVar = (v.b) obj;
        return this.a.equals(bVar.b()) && this.f12530b.equals(bVar.c());
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f12530b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.a + ", value=" + this.f12530b + "}";
    }

    private c(String str, String str2) {
        this.a = str;
        this.f12530b = str2;
    }
}