package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;
import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution.java */
/* loaded from: classes.dex */
final class l extends v.d.AbstractC0137d.a.b {
    private final w<v.d.AbstractC0137d.a.b.e> a;

    /* renamed from: b, reason: collision with root package name */
    private final v.d.AbstractC0137d.a.b.c f12598b;

    /* renamed from: c, reason: collision with root package name */
    private final v.d.AbstractC0137d.a.b.AbstractC0143d f12599c;

    /* renamed from: d, reason: collision with root package name */
    private final w<v.d.AbstractC0137d.a.b.AbstractC0139a> f12600d;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution.java */
    static final class b extends v.d.AbstractC0137d.a.b.AbstractC0141b {
        private w<v.d.AbstractC0137d.a.b.e> a;

        /* renamed from: b, reason: collision with root package name */
        private v.d.AbstractC0137d.a.b.c f12601b;

        /* renamed from: c, reason: collision with root package name */
        private v.d.AbstractC0137d.a.b.AbstractC0143d f12602c;

        /* renamed from: d, reason: collision with root package name */
        private w<v.d.AbstractC0137d.a.b.AbstractC0139a> f12603d;

        b() {
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.AbstractC0141b
        public v.d.AbstractC0137d.a.b a() {
            String str = "";
            if (this.a == null) {
                str = " threads";
            }
            if (this.f12601b == null) {
                str = str + " exception";
            }
            if (this.f12602c == null) {
                str = str + " signal";
            }
            if (this.f12603d == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new l(this.a, this.f12601b, this.f12602c, this.f12603d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.AbstractC0141b
        public v.d.AbstractC0137d.a.b.AbstractC0141b b(w<v.d.AbstractC0137d.a.b.AbstractC0139a> wVar) {
            Objects.requireNonNull(wVar, "Null binaries");
            this.f12603d = wVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.AbstractC0141b
        public v.d.AbstractC0137d.a.b.AbstractC0141b c(v.d.AbstractC0137d.a.b.c cVar) {
            Objects.requireNonNull(cVar, "Null exception");
            this.f12601b = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.AbstractC0141b
        public v.d.AbstractC0137d.a.b.AbstractC0141b d(v.d.AbstractC0137d.a.b.AbstractC0143d abstractC0143d) {
            Objects.requireNonNull(abstractC0143d, "Null signal");
            this.f12602c = abstractC0143d;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.AbstractC0141b
        public v.d.AbstractC0137d.a.b.AbstractC0141b e(w<v.d.AbstractC0137d.a.b.e> wVar) {
            Objects.requireNonNull(wVar, "Null threads");
            this.a = wVar;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b
    public w<v.d.AbstractC0137d.a.b.AbstractC0139a> b() {
        return this.f12600d;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b
    public v.d.AbstractC0137d.a.b.c c() {
        return this.f12598b;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b
    public v.d.AbstractC0137d.a.b.AbstractC0143d d() {
        return this.f12599c;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b
    public w<v.d.AbstractC0137d.a.b.e> e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.AbstractC0137d.a.b)) {
            return false;
        }
        v.d.AbstractC0137d.a.b bVar = (v.d.AbstractC0137d.a.b) obj;
        return this.a.equals(bVar.e()) && this.f12598b.equals(bVar.c()) && this.f12599c.equals(bVar.d()) && this.f12600d.equals(bVar.b());
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f12598b.hashCode()) * 1000003) ^ this.f12599c.hashCode()) * 1000003) ^ this.f12600d.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.a + ", exception=" + this.f12598b + ", signal=" + this.f12599c + ", binaries=" + this.f12600d + "}";
    }

    private l(w<v.d.AbstractC0137d.a.b.e> wVar, v.d.AbstractC0137d.a.b.c cVar, v.d.AbstractC0137d.a.b.AbstractC0143d abstractC0143d, w<v.d.AbstractC0137d.a.b.AbstractC0139a> wVar2) {
        this.a = wVar;
        this.f12598b = cVar;
        this.f12599c = abstractC0143d;
        this.f12600d = wVar2;
    }
}