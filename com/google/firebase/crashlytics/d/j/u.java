package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;
import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReport_Session_User.java */
/* loaded from: classes.dex */
final class u extends v.d.f {
    private final String a;

    /* compiled from: AutoValue_CrashlyticsReport_Session_User.java */
    static final class b extends v.d.f.a {
        private String a;

        b() {
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.f.a
        public v.d.f a() {
            String str = "";
            if (this.a == null) {
                str = " identifier";
            }
            if (str.isEmpty()) {
                return new u(this.a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.f.a
        public v.d.f.a b(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.a = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.f
    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v.d.f) {
            return this.a.equals(((v.d.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.a + "}";
    }

    private u(String str) {
        this.a = str;
    }
}