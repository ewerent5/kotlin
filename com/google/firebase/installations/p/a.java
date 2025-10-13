package com.google.firebase.installations.p;

import com.google.firebase.installations.p.c;
import com.google.firebase.installations.p.d;
import java.util.Objects;

/* compiled from: AutoValue_PersistedInstallationEntry.java */
/* loaded from: classes.dex */
final class a extends d {

    /* renamed from: b, reason: collision with root package name */
    private final String f12812b;

    /* renamed from: c, reason: collision with root package name */
    private final c.a f12813c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12814d;

    /* renamed from: e, reason: collision with root package name */
    private final String f12815e;

    /* renamed from: f, reason: collision with root package name */
    private final long f12816f;

    /* renamed from: g, reason: collision with root package name */
    private final long f12817g;

    /* renamed from: h, reason: collision with root package name */
    private final String f12818h;

    /* compiled from: AutoValue_PersistedInstallationEntry.java */
    static final class b extends d.a {
        private String a;

        /* renamed from: b, reason: collision with root package name */
        private c.a f12819b;

        /* renamed from: c, reason: collision with root package name */
        private String f12820c;

        /* renamed from: d, reason: collision with root package name */
        private String f12821d;

        /* renamed from: e, reason: collision with root package name */
        private Long f12822e;

        /* renamed from: f, reason: collision with root package name */
        private Long f12823f;

        /* renamed from: g, reason: collision with root package name */
        private String f12824g;

        @Override // com.google.firebase.installations.p.d.a
        public d a() {
            String str = "";
            if (this.f12819b == null) {
                str = " registrationStatus";
            }
            if (this.f12822e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f12823f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.a, this.f12819b, this.f12820c, this.f12821d, this.f12822e.longValue(), this.f12823f.longValue(), this.f12824g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.p.d.a
        public d.a b(String str) {
            this.f12820c = str;
            return this;
        }

        @Override // com.google.firebase.installations.p.d.a
        public d.a c(long j2) {
            this.f12822e = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.installations.p.d.a
        public d.a d(String str) {
            this.a = str;
            return this;
        }

        @Override // com.google.firebase.installations.p.d.a
        public d.a e(String str) {
            this.f12824g = str;
            return this;
        }

        @Override // com.google.firebase.installations.p.d.a
        public d.a f(String str) {
            this.f12821d = str;
            return this;
        }

        @Override // com.google.firebase.installations.p.d.a
        public d.a g(c.a aVar) {
            Objects.requireNonNull(aVar, "Null registrationStatus");
            this.f12819b = aVar;
            return this;
        }

        @Override // com.google.firebase.installations.p.d.a
        public d.a h(long j2) {
            this.f12823f = Long.valueOf(j2);
            return this;
        }

        b() {
        }

        private b(d dVar) {
            this.a = dVar.d();
            this.f12819b = dVar.g();
            this.f12820c = dVar.b();
            this.f12821d = dVar.f();
            this.f12822e = Long.valueOf(dVar.c());
            this.f12823f = Long.valueOf(dVar.h());
            this.f12824g = dVar.e();
        }
    }

    @Override // com.google.firebase.installations.p.d
    public String b() {
        return this.f12814d;
    }

    @Override // com.google.firebase.installations.p.d
    public long c() {
        return this.f12816f;
    }

    @Override // com.google.firebase.installations.p.d
    public String d() {
        return this.f12812b;
    }

    @Override // com.google.firebase.installations.p.d
    public String e() {
        return this.f12818h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.f12812b;
        if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
            if (this.f12813c.equals(dVar.g()) && ((str = this.f12814d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f12815e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f12816f == dVar.c() && this.f12817g == dVar.h()) {
                String str4 = this.f12818h;
                if (str4 == null) {
                    if (dVar.e() == null) {
                        return true;
                    }
                } else if (str4.equals(dVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.p.d
    public String f() {
        return this.f12815e;
    }

    @Override // com.google.firebase.installations.p.d
    public c.a g() {
        return this.f12813c;
    }

    @Override // com.google.firebase.installations.p.d
    public long h() {
        return this.f12817g;
    }

    public int hashCode() {
        String str = this.f12812b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f12813c.hashCode()) * 1000003;
        String str2 = this.f12814d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f12815e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j2 = this.f12816f;
        int i2 = (iHashCode3 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f12817g;
        int i3 = (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str4 = this.f12818h;
        return i3 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.google.firebase.installations.p.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f12812b + ", registrationStatus=" + this.f12813c + ", authToken=" + this.f12814d + ", refreshToken=" + this.f12815e + ", expiresInSecs=" + this.f12816f + ", tokenCreationEpochInSecs=" + this.f12817g + ", fisError=" + this.f12818h + "}";
    }

    private a(String str, c.a aVar, String str2, String str3, long j2, long j3, String str4) {
        this.f12812b = str;
        this.f12813c = aVar;
        this.f12814d = str2;
        this.f12815e = str3;
        this.f12816f = j2;
        this.f12817g = j3;
        this.f12818h = str4;
    }
}