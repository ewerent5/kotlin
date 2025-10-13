package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;
import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.java */
/* loaded from: classes.dex */
final class n extends v.d.AbstractC0137d.a.b.c {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12610b;

    /* renamed from: c, reason: collision with root package name */
    private final w<v.d.AbstractC0137d.a.b.e.AbstractC0146b> f12611c;

    /* renamed from: d, reason: collision with root package name */
    private final v.d.AbstractC0137d.a.b.c f12612d;

    /* renamed from: e, reason: collision with root package name */
    private final int f12613e;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.java */
    static final class b extends v.d.AbstractC0137d.a.b.c.AbstractC0142a {
        private String a;

        /* renamed from: b, reason: collision with root package name */
        private String f12614b;

        /* renamed from: c, reason: collision with root package name */
        private w<v.d.AbstractC0137d.a.b.e.AbstractC0146b> f12615c;

        /* renamed from: d, reason: collision with root package name */
        private v.d.AbstractC0137d.a.b.c f12616d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f12617e;

        b() {
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.c.AbstractC0142a
        public v.d.AbstractC0137d.a.b.c a() {
            String str = "";
            if (this.a == null) {
                str = " type";
            }
            if (this.f12615c == null) {
                str = str + " frames";
            }
            if (this.f12617e == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new n(this.a, this.f12614b, this.f12615c, this.f12616d, this.f12617e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.c.AbstractC0142a
        public v.d.AbstractC0137d.a.b.c.AbstractC0142a b(v.d.AbstractC0137d.a.b.c cVar) {
            this.f12616d = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.c.AbstractC0142a
        public v.d.AbstractC0137d.a.b.c.AbstractC0142a c(w<v.d.AbstractC0137d.a.b.e.AbstractC0146b> wVar) {
            Objects.requireNonNull(wVar, "Null frames");
            this.f12615c = wVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.c.AbstractC0142a
        public v.d.AbstractC0137d.a.b.c.AbstractC0142a d(int i2) {
            this.f12617e = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.c.AbstractC0142a
        public v.d.AbstractC0137d.a.b.c.AbstractC0142a e(String str) {
            this.f12614b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.c.AbstractC0142a
        public v.d.AbstractC0137d.a.b.c.AbstractC0142a f(String str) {
            Objects.requireNonNull(str, "Null type");
            this.a = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.c
    public v.d.AbstractC0137d.a.b.c b() {
        return this.f12612d;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.c
    public w<v.d.AbstractC0137d.a.b.e.AbstractC0146b> c() {
        return this.f12611c;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.c
    public int d() {
        return this.f12613e;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.c
    public String e() {
        return this.f12610b;
    }

    public boolean equals(Object obj) {
        String str;
        v.d.AbstractC0137d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.AbstractC0137d.a.b.c)) {
            return false;
        }
        v.d.AbstractC0137d.a.b.c cVar2 = (v.d.AbstractC0137d.a.b.c) obj;
        return this.a.equals(cVar2.f()) && ((str = this.f12610b) != null ? str.equals(cVar2.e()) : cVar2.e() == null) && this.f12611c.equals(cVar2.c()) && ((cVar = this.f12612d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.f12613e == cVar2.d();
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.c
    public String f() {
        return this.a;
    }

    public int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.f12610b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f12611c.hashCode()) * 1000003;
        v.d.AbstractC0137d.a.b.c cVar = this.f12612d;
        return ((iHashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003) ^ this.f12613e;
    }

    public String toString() {
        return "Exception{type=" + this.a + ", reason=" + this.f12610b + ", frames=" + this.f12611c + ", causedBy=" + this.f12612d + ", overflowCount=" + this.f12613e + "}";
    }

    private n(String str, String str2, w<v.d.AbstractC0137d.a.b.e.AbstractC0146b> wVar, v.d.AbstractC0137d.a.b.c cVar, int i2) {
        this.a = str;
        this.f12610b = str2;
        this.f12611c = wVar;
        this.f12612d = cVar;
        this.f12613e = i2;
    }
}