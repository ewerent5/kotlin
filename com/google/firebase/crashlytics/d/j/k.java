package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;
import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
/* loaded from: classes.dex */
final class k extends v.d.AbstractC0137d.a {
    private final v.d.AbstractC0137d.a.b a;

    /* renamed from: b, reason: collision with root package name */
    private final w<v.b> f12592b;

    /* renamed from: c, reason: collision with root package name */
    private final Boolean f12593c;

    /* renamed from: d, reason: collision with root package name */
    private final int f12594d;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
    static final class b extends v.d.AbstractC0137d.a.AbstractC0138a {
        private v.d.AbstractC0137d.a.b a;

        /* renamed from: b, reason: collision with root package name */
        private w<v.b> f12595b;

        /* renamed from: c, reason: collision with root package name */
        private Boolean f12596c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f12597d;

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.AbstractC0138a
        public v.d.AbstractC0137d.a a() {
            String str = "";
            if (this.a == null) {
                str = " execution";
            }
            if (this.f12597d == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new k(this.a, this.f12595b, this.f12596c, this.f12597d.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.AbstractC0138a
        public v.d.AbstractC0137d.a.AbstractC0138a b(Boolean bool) {
            this.f12596c = bool;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.AbstractC0138a
        public v.d.AbstractC0137d.a.AbstractC0138a c(w<v.b> wVar) {
            this.f12595b = wVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.AbstractC0138a
        public v.d.AbstractC0137d.a.AbstractC0138a d(v.d.AbstractC0137d.a.b bVar) {
            Objects.requireNonNull(bVar, "Null execution");
            this.a = bVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.AbstractC0138a
        public v.d.AbstractC0137d.a.AbstractC0138a e(int i2) {
            this.f12597d = Integer.valueOf(i2);
            return this;
        }

        b() {
        }

        private b(v.d.AbstractC0137d.a aVar) {
            this.a = aVar.d();
            this.f12595b = aVar.c();
            this.f12596c = aVar.b();
            this.f12597d = Integer.valueOf(aVar.e());
        }
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a
    public Boolean b() {
        return this.f12593c;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a
    public w<v.b> c() {
        return this.f12592b;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a
    public v.d.AbstractC0137d.a.b d() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a
    public int e() {
        return this.f12594d;
    }

    public boolean equals(Object obj) {
        w<v.b> wVar;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.AbstractC0137d.a)) {
            return false;
        }
        v.d.AbstractC0137d.a aVar = (v.d.AbstractC0137d.a) obj;
        return this.a.equals(aVar.d()) && ((wVar = this.f12592b) != null ? wVar.equals(aVar.c()) : aVar.c() == null) && ((bool = this.f12593c) != null ? bool.equals(aVar.b()) : aVar.b() == null) && this.f12594d == aVar.e();
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a
    public v.d.AbstractC0137d.a.AbstractC0138a f() {
        return new b(this);
    }

    public int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        w<v.b> wVar = this.f12592b;
        int iHashCode2 = (iHashCode ^ (wVar == null ? 0 : wVar.hashCode())) * 1000003;
        Boolean bool = this.f12593c;
        return ((iHashCode2 ^ (bool != null ? bool.hashCode() : 0)) * 1000003) ^ this.f12594d;
    }

    public String toString() {
        return "Application{execution=" + this.a + ", customAttributes=" + this.f12592b + ", background=" + this.f12593c + ", uiOrientation=" + this.f12594d + "}";
    }

    private k(v.d.AbstractC0137d.a.b bVar, w<v.b> wVar, Boolean bool, int i2) {
        this.a = bVar;
        this.f12592b = wVar;
        this.f12593c = bool;
        this.f12594d = i2;
    }
}