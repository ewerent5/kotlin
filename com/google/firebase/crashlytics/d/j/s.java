package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;
import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Log.java */
/* loaded from: classes.dex */
final class s extends v.d.AbstractC0137d.AbstractC0148d {
    private final String a;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Log.java */
    static final class b extends v.d.AbstractC0137d.AbstractC0148d.a {
        private String a;

        b() {
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.AbstractC0148d.a
        public v.d.AbstractC0137d.AbstractC0148d a() {
            String str = "";
            if (this.a == null) {
                str = " content";
            }
            if (str.isEmpty()) {
                return new s(this.a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.AbstractC0148d.a
        public v.d.AbstractC0137d.AbstractC0148d.a b(String str) {
            Objects.requireNonNull(str, "Null content");
            this.a = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.AbstractC0148d
    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v.d.AbstractC0137d.AbstractC0148d) {
            return this.a.equals(((v.d.AbstractC0137d.AbstractC0148d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.a + "}";
    }

    private s(String str) {
        this.a = str;
    }
}