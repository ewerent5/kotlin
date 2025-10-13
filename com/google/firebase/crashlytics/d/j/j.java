package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;
import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
/* loaded from: classes.dex */
final class j extends v.d.AbstractC0137d {
    private final long a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12584b;

    /* renamed from: c, reason: collision with root package name */
    private final v.d.AbstractC0137d.a f12585c;

    /* renamed from: d, reason: collision with root package name */
    private final v.d.AbstractC0137d.c f12586d;

    /* renamed from: e, reason: collision with root package name */
    private final v.d.AbstractC0137d.AbstractC0148d f12587e;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
    static final class b extends v.d.AbstractC0137d.b {
        private Long a;

        /* renamed from: b, reason: collision with root package name */
        private String f12588b;

        /* renamed from: c, reason: collision with root package name */
        private v.d.AbstractC0137d.a f12589c;

        /* renamed from: d, reason: collision with root package name */
        private v.d.AbstractC0137d.c f12590d;

        /* renamed from: e, reason: collision with root package name */
        private v.d.AbstractC0137d.AbstractC0148d f12591e;

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.b
        public v.d.AbstractC0137d a() {
            String str = "";
            if (this.a == null) {
                str = " timestamp";
            }
            if (this.f12588b == null) {
                str = str + " type";
            }
            if (this.f12589c == null) {
                str = str + " app";
            }
            if (this.f12590d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new j(this.a.longValue(), this.f12588b, this.f12589c, this.f12590d, this.f12591e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.b
        public v.d.AbstractC0137d.b b(v.d.AbstractC0137d.a aVar) {
            Objects.requireNonNull(aVar, "Null app");
            this.f12589c = aVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.b
        public v.d.AbstractC0137d.b c(v.d.AbstractC0137d.c cVar) {
            Objects.requireNonNull(cVar, "Null device");
            this.f12590d = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.b
        public v.d.AbstractC0137d.b d(v.d.AbstractC0137d.AbstractC0148d abstractC0148d) {
            this.f12591e = abstractC0148d;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.b
        public v.d.AbstractC0137d.b e(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.b
        public v.d.AbstractC0137d.b f(String str) {
            Objects.requireNonNull(str, "Null type");
            this.f12588b = str;
            return this;
        }

        b() {
        }

        private b(v.d.AbstractC0137d abstractC0137d) {
            this.a = Long.valueOf(abstractC0137d.e());
            this.f12588b = abstractC0137d.f();
            this.f12589c = abstractC0137d.b();
            this.f12590d = abstractC0137d.c();
            this.f12591e = abstractC0137d.d();
        }
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d
    public v.d.AbstractC0137d.a b() {
        return this.f12585c;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d
    public v.d.AbstractC0137d.c c() {
        return this.f12586d;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d
    public v.d.AbstractC0137d.AbstractC0148d d() {
        return this.f12587e;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d
    public long e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.AbstractC0137d)) {
            return false;
        }
        v.d.AbstractC0137d abstractC0137d = (v.d.AbstractC0137d) obj;
        if (this.a == abstractC0137d.e() && this.f12584b.equals(abstractC0137d.f()) && this.f12585c.equals(abstractC0137d.b()) && this.f12586d.equals(abstractC0137d.c())) {
            v.d.AbstractC0137d.AbstractC0148d abstractC0148d = this.f12587e;
            if (abstractC0148d == null) {
                if (abstractC0137d.d() == null) {
                    return true;
                }
            } else if (abstractC0148d.equals(abstractC0137d.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d
    public String f() {
        return this.f12584b;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d
    public v.d.AbstractC0137d.b g() {
        return new b(this);
    }

    public int hashCode() {
        long j2 = this.a;
        int iHashCode = (((((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f12584b.hashCode()) * 1000003) ^ this.f12585c.hashCode()) * 1000003) ^ this.f12586d.hashCode()) * 1000003;
        v.d.AbstractC0137d.AbstractC0148d abstractC0148d = this.f12587e;
        return (abstractC0148d == null ? 0 : abstractC0148d.hashCode()) ^ iHashCode;
    }

    public String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.f12584b + ", app=" + this.f12585c + ", device=" + this.f12586d + ", log=" + this.f12587e + "}";
    }

    private j(long j2, String str, v.d.AbstractC0137d.a aVar, v.d.AbstractC0137d.c cVar, v.d.AbstractC0137d.AbstractC0148d abstractC0148d) {
        this.a = j2;
        this.f12584b = str;
        this.f12585c = aVar;
        this.f12586d = cVar;
        this.f12587e = abstractC0148d;
    }
}