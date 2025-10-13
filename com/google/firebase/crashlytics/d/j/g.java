package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;
import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReport_Session_Application.java */
/* loaded from: classes.dex */
final class g extends v.d.a {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12556b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12557c;

    /* renamed from: d, reason: collision with root package name */
    private final v.d.a.b f12558d;

    /* renamed from: e, reason: collision with root package name */
    private final String f12559e;

    /* renamed from: f, reason: collision with root package name */
    private final String f12560f;

    /* renamed from: g, reason: collision with root package name */
    private final String f12561g;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Application.java */
    static final class b extends v.d.a.AbstractC0136a {
        private String a;

        /* renamed from: b, reason: collision with root package name */
        private String f12562b;

        /* renamed from: c, reason: collision with root package name */
        private String f12563c;

        /* renamed from: d, reason: collision with root package name */
        private v.d.a.b f12564d;

        /* renamed from: e, reason: collision with root package name */
        private String f12565e;

        /* renamed from: f, reason: collision with root package name */
        private String f12566f;

        /* renamed from: g, reason: collision with root package name */
        private String f12567g;

        b() {
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.a.AbstractC0136a
        public v.d.a a() {
            String str = "";
            if (this.a == null) {
                str = " identifier";
            }
            if (this.f12562b == null) {
                str = str + " version";
            }
            if (str.isEmpty()) {
                return new g(this.a, this.f12562b, this.f12563c, this.f12564d, this.f12565e, this.f12566f, this.f12567g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.a.AbstractC0136a
        public v.d.a.AbstractC0136a b(String str) {
            this.f12566f = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.a.AbstractC0136a
        public v.d.a.AbstractC0136a c(String str) {
            this.f12567g = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.a.AbstractC0136a
        public v.d.a.AbstractC0136a d(String str) {
            this.f12563c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.a.AbstractC0136a
        public v.d.a.AbstractC0136a e(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.a.AbstractC0136a
        public v.d.a.AbstractC0136a f(String str) {
            this.f12565e = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.a.AbstractC0136a
        public v.d.a.AbstractC0136a g(String str) {
            Objects.requireNonNull(str, "Null version");
            this.f12562b = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.a
    public String b() {
        return this.f12560f;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.a
    public String c() {
        return this.f12561g;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.a
    public String d() {
        return this.f12557c;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.a
    public String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        String str;
        v.d.a.b bVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.a)) {
            return false;
        }
        v.d.a aVar = (v.d.a) obj;
        if (this.a.equals(aVar.e()) && this.f12556b.equals(aVar.h()) && ((str = this.f12557c) != null ? str.equals(aVar.d()) : aVar.d() == null) && ((bVar = this.f12558d) != null ? bVar.equals(aVar.g()) : aVar.g() == null) && ((str2 = this.f12559e) != null ? str2.equals(aVar.f()) : aVar.f() == null) && ((str3 = this.f12560f) != null ? str3.equals(aVar.b()) : aVar.b() == null)) {
            String str4 = this.f12561g;
            if (str4 == null) {
                if (aVar.c() == null) {
                    return true;
                }
            } else if (str4.equals(aVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.a
    public String f() {
        return this.f12559e;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.a
    public v.d.a.b g() {
        return this.f12558d;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.a
    public String h() {
        return this.f12556b;
    }

    public int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f12556b.hashCode()) * 1000003;
        String str = this.f12557c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        v.d.a.b bVar = this.f12558d;
        int iHashCode3 = (iHashCode2 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        String str2 = this.f12559e;
        int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f12560f;
        int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f12561g;
        return iHashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Application{identifier=" + this.a + ", version=" + this.f12556b + ", displayVersion=" + this.f12557c + ", organization=" + this.f12558d + ", installationUuid=" + this.f12559e + ", developmentPlatform=" + this.f12560f + ", developmentPlatformVersion=" + this.f12561g + "}";
    }

    private g(String str, String str2, String str3, v.d.a.b bVar, String str4, String str5, String str6) {
        this.a = str;
        this.f12556b = str2;
        this.f12557c = str3;
        this.f12558d = bVar;
        this.f12559e = str4;
        this.f12560f = str5;
        this.f12561g = str6;
    }
}