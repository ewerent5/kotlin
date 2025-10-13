package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;
import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
/* loaded from: classes.dex */
final class q extends v.d.AbstractC0137d.a.b.e.AbstractC0146b {
    private final long a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12626b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12627c;

    /* renamed from: d, reason: collision with root package name */
    private final long f12628d;

    /* renamed from: e, reason: collision with root package name */
    private final int f12629e;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
    static final class b extends v.d.AbstractC0137d.a.b.e.AbstractC0146b.AbstractC0147a {
        private Long a;

        /* renamed from: b, reason: collision with root package name */
        private String f12630b;

        /* renamed from: c, reason: collision with root package name */
        private String f12631c;

        /* renamed from: d, reason: collision with root package name */
        private Long f12632d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f12633e;

        b() {
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.e.AbstractC0146b.AbstractC0147a
        public v.d.AbstractC0137d.a.b.e.AbstractC0146b a() {
            String str = "";
            if (this.a == null) {
                str = " pc";
            }
            if (this.f12630b == null) {
                str = str + " symbol";
            }
            if (this.f12632d == null) {
                str = str + " offset";
            }
            if (this.f12633e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new q(this.a.longValue(), this.f12630b, this.f12631c, this.f12632d.longValue(), this.f12633e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.e.AbstractC0146b.AbstractC0147a
        public v.d.AbstractC0137d.a.b.e.AbstractC0146b.AbstractC0147a b(String str) {
            this.f12631c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.e.AbstractC0146b.AbstractC0147a
        public v.d.AbstractC0137d.a.b.e.AbstractC0146b.AbstractC0147a c(int i2) {
            this.f12633e = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.e.AbstractC0146b.AbstractC0147a
        public v.d.AbstractC0137d.a.b.e.AbstractC0146b.AbstractC0147a d(long j2) {
            this.f12632d = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.e.AbstractC0146b.AbstractC0147a
        public v.d.AbstractC0137d.a.b.e.AbstractC0146b.AbstractC0147a e(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.e.AbstractC0146b.AbstractC0147a
        public v.d.AbstractC0137d.a.b.e.AbstractC0146b.AbstractC0147a f(String str) {
            Objects.requireNonNull(str, "Null symbol");
            this.f12630b = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.e.AbstractC0146b
    public String b() {
        return this.f12627c;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.e.AbstractC0146b
    public int c() {
        return this.f12629e;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.e.AbstractC0146b
    public long d() {
        return this.f12628d;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.e.AbstractC0146b
    public long e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.AbstractC0137d.a.b.e.AbstractC0146b)) {
            return false;
        }
        v.d.AbstractC0137d.a.b.e.AbstractC0146b abstractC0146b = (v.d.AbstractC0137d.a.b.e.AbstractC0146b) obj;
        return this.a == abstractC0146b.e() && this.f12626b.equals(abstractC0146b.f()) && ((str = this.f12627c) != null ? str.equals(abstractC0146b.b()) : abstractC0146b.b() == null) && this.f12628d == abstractC0146b.d() && this.f12629e == abstractC0146b.c();
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.e.AbstractC0146b
    public String f() {
        return this.f12626b;
    }

    public int hashCode() {
        long j2 = this.a;
        int iHashCode = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f12626b.hashCode()) * 1000003;
        String str = this.f12627c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.f12628d;
        return this.f12629e ^ ((iHashCode2 ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003);
    }

    public String toString() {
        return "Frame{pc=" + this.a + ", symbol=" + this.f12626b + ", file=" + this.f12627c + ", offset=" + this.f12628d + ", importance=" + this.f12629e + "}";
    }

    private q(long j2, String str, String str2, long j3, int i2) {
        this.a = j2;
        this.f12626b = str;
        this.f12627c = str2;
        this.f12628d = j3;
        this.f12629e = i2;
    }
}