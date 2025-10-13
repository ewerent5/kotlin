package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;
import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.java */
/* loaded from: classes.dex */
final class o extends v.d.AbstractC0137d.a.b.AbstractC0143d {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12618b;

    /* renamed from: c, reason: collision with root package name */
    private final long f12619c;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.java */
    static final class b extends v.d.AbstractC0137d.a.b.AbstractC0143d.AbstractC0144a {
        private String a;

        /* renamed from: b, reason: collision with root package name */
        private String f12620b;

        /* renamed from: c, reason: collision with root package name */
        private Long f12621c;

        b() {
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.AbstractC0143d.AbstractC0144a
        public v.d.AbstractC0137d.a.b.AbstractC0143d a() {
            String str = "";
            if (this.a == null) {
                str = " name";
            }
            if (this.f12620b == null) {
                str = str + " code";
            }
            if (this.f12621c == null) {
                str = str + " address";
            }
            if (str.isEmpty()) {
                return new o(this.a, this.f12620b, this.f12621c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.AbstractC0143d.AbstractC0144a
        public v.d.AbstractC0137d.a.b.AbstractC0143d.AbstractC0144a b(long j2) {
            this.f12621c = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.AbstractC0143d.AbstractC0144a
        public v.d.AbstractC0137d.a.b.AbstractC0143d.AbstractC0144a c(String str) {
            Objects.requireNonNull(str, "Null code");
            this.f12620b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.AbstractC0143d.AbstractC0144a
        public v.d.AbstractC0137d.a.b.AbstractC0143d.AbstractC0144a d(String str) {
            Objects.requireNonNull(str, "Null name");
            this.a = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.AbstractC0143d
    public long b() {
        return this.f12619c;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.AbstractC0143d
    public String c() {
        return this.f12618b;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.AbstractC0143d
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.AbstractC0137d.a.b.AbstractC0143d)) {
            return false;
        }
        v.d.AbstractC0137d.a.b.AbstractC0143d abstractC0143d = (v.d.AbstractC0137d.a.b.AbstractC0143d) obj;
        return this.a.equals(abstractC0143d.d()) && this.f12618b.equals(abstractC0143d.c()) && this.f12619c == abstractC0143d.b();
    }

    public int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f12618b.hashCode()) * 1000003;
        long j2 = this.f12619c;
        return iHashCode ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.a + ", code=" + this.f12618b + ", address=" + this.f12619c + "}";
    }

    private o(String str, String str2, long j2) {
        this.a = str;
        this.f12618b = str2;
        this.f12619c = j2;
    }
}