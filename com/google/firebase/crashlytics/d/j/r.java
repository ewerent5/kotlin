package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Device.java */
/* loaded from: classes.dex */
final class r extends v.d.AbstractC0137d.c {
    private final Double a;

    /* renamed from: b, reason: collision with root package name */
    private final int f12634b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f12635c;

    /* renamed from: d, reason: collision with root package name */
    private final int f12636d;

    /* renamed from: e, reason: collision with root package name */
    private final long f12637e;

    /* renamed from: f, reason: collision with root package name */
    private final long f12638f;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Device.java */
    static final class b extends v.d.AbstractC0137d.c.a {
        private Double a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f12639b;

        /* renamed from: c, reason: collision with root package name */
        private Boolean f12640c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f12641d;

        /* renamed from: e, reason: collision with root package name */
        private Long f12642e;

        /* renamed from: f, reason: collision with root package name */
        private Long f12643f;

        b() {
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.c.a
        public v.d.AbstractC0137d.c a() {
            String str = "";
            if (this.f12639b == null) {
                str = " batteryVelocity";
            }
            if (this.f12640c == null) {
                str = str + " proximityOn";
            }
            if (this.f12641d == null) {
                str = str + " orientation";
            }
            if (this.f12642e == null) {
                str = str + " ramUsed";
            }
            if (this.f12643f == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new r(this.a, this.f12639b.intValue(), this.f12640c.booleanValue(), this.f12641d.intValue(), this.f12642e.longValue(), this.f12643f.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.c.a
        public v.d.AbstractC0137d.c.a b(Double d2) {
            this.a = d2;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.c.a
        public v.d.AbstractC0137d.c.a c(int i2) {
            this.f12639b = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.c.a
        public v.d.AbstractC0137d.c.a d(long j2) {
            this.f12643f = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.c.a
        public v.d.AbstractC0137d.c.a e(int i2) {
            this.f12641d = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.c.a
        public v.d.AbstractC0137d.c.a f(boolean z) {
            this.f12640c = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.c.a
        public v.d.AbstractC0137d.c.a g(long j2) {
            this.f12642e = Long.valueOf(j2);
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.c
    public Double b() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.c
    public int c() {
        return this.f12634b;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.c
    public long d() {
        return this.f12638f;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.c
    public int e() {
        return this.f12636d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.AbstractC0137d.c)) {
            return false;
        }
        v.d.AbstractC0137d.c cVar = (v.d.AbstractC0137d.c) obj;
        Double d2 = this.a;
        if (d2 != null ? d2.equals(cVar.b()) : cVar.b() == null) {
            if (this.f12634b == cVar.c() && this.f12635c == cVar.g() && this.f12636d == cVar.e() && this.f12637e == cVar.f() && this.f12638f == cVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.c
    public long f() {
        return this.f12637e;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.c
    public boolean g() {
        return this.f12635c;
    }

    public int hashCode() {
        Double d2 = this.a;
        int iHashCode = ((((((((d2 == null ? 0 : d2.hashCode()) ^ 1000003) * 1000003) ^ this.f12634b) * 1000003) ^ (this.f12635c ? 1231 : 1237)) * 1000003) ^ this.f12636d) * 1000003;
        long j2 = this.f12637e;
        long j3 = this.f12638f;
        return ((iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.a + ", batteryVelocity=" + this.f12634b + ", proximityOn=" + this.f12635c + ", orientation=" + this.f12636d + ", ramUsed=" + this.f12637e + ", diskUsed=" + this.f12638f + "}";
    }

    private r(Double d2, int i2, boolean z, int i3, long j2, long j3) {
        this.a = d2;
        this.f12634b = i2;
        this.f12635c = z;
        this.f12636d = i3;
        this.f12637e = j2;
        this.f12638f = j3;
    }
}