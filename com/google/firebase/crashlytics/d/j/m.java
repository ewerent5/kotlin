package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;
import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.java */
/* loaded from: classes.dex */
final class m extends v.d.AbstractC0137d.a.b.AbstractC0139a {
    private final long a;

    /* renamed from: b, reason: collision with root package name */
    private final long f12604b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12605c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12606d;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.java */
    static final class b extends v.d.AbstractC0137d.a.b.AbstractC0139a.AbstractC0140a {
        private Long a;

        /* renamed from: b, reason: collision with root package name */
        private Long f12607b;

        /* renamed from: c, reason: collision with root package name */
        private String f12608c;

        /* renamed from: d, reason: collision with root package name */
        private String f12609d;

        b() {
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.AbstractC0139a.AbstractC0140a
        public v.d.AbstractC0137d.a.b.AbstractC0139a a() {
            String str = "";
            if (this.a == null) {
                str = " baseAddress";
            }
            if (this.f12607b == null) {
                str = str + " size";
            }
            if (this.f12608c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new m(this.a.longValue(), this.f12607b.longValue(), this.f12608c, this.f12609d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.AbstractC0139a.AbstractC0140a
        public v.d.AbstractC0137d.a.b.AbstractC0139a.AbstractC0140a b(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.AbstractC0139a.AbstractC0140a
        public v.d.AbstractC0137d.a.b.AbstractC0139a.AbstractC0140a c(String str) {
            Objects.requireNonNull(str, "Null name");
            this.f12608c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.AbstractC0139a.AbstractC0140a
        public v.d.AbstractC0137d.a.b.AbstractC0139a.AbstractC0140a d(long j2) {
            this.f12607b = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.AbstractC0139a.AbstractC0140a
        public v.d.AbstractC0137d.a.b.AbstractC0139a.AbstractC0140a e(String str) {
            this.f12609d = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.AbstractC0139a
    public long b() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.AbstractC0139a
    public String c() {
        return this.f12605c;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.AbstractC0139a
    public long d() {
        return this.f12604b;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.AbstractC0139a
    public String e() {
        return this.f12606d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.AbstractC0137d.a.b.AbstractC0139a)) {
            return false;
        }
        v.d.AbstractC0137d.a.b.AbstractC0139a abstractC0139a = (v.d.AbstractC0137d.a.b.AbstractC0139a) obj;
        if (this.a == abstractC0139a.b() && this.f12604b == abstractC0139a.d() && this.f12605c.equals(abstractC0139a.c())) {
            String str = this.f12606d;
            if (str == null) {
                if (abstractC0139a.e() == null) {
                    return true;
                }
            } else if (str.equals(abstractC0139a.e())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.a;
        long j3 = this.f12604b;
        int iHashCode = (((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f12605c.hashCode()) * 1000003;
        String str = this.f12606d;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.a + ", size=" + this.f12604b + ", name=" + this.f12605c + ", uuid=" + this.f12606d + "}";
    }

    private m(long j2, long j3, String str, String str2) {
        this.a = j2;
        this.f12604b = j3;
        this.f12605c = str;
        this.f12606d = str2;
    }
}