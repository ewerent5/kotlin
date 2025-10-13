package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;
import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.java */
/* loaded from: classes.dex */
final class p extends v.d.AbstractC0137d.a.b.e {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final int f12622b;

    /* renamed from: c, reason: collision with root package name */
    private final w<v.d.AbstractC0137d.a.b.e.AbstractC0146b> f12623c;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.java */
    static final class b extends v.d.AbstractC0137d.a.b.e.AbstractC0145a {
        private String a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f12624b;

        /* renamed from: c, reason: collision with root package name */
        private w<v.d.AbstractC0137d.a.b.e.AbstractC0146b> f12625c;

        b() {
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.e.AbstractC0145a
        public v.d.AbstractC0137d.a.b.e a() {
            String str = "";
            if (this.a == null) {
                str = " name";
            }
            if (this.f12624b == null) {
                str = str + " importance";
            }
            if (this.f12625c == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new p(this.a, this.f12624b.intValue(), this.f12625c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.e.AbstractC0145a
        public v.d.AbstractC0137d.a.b.e.AbstractC0145a b(w<v.d.AbstractC0137d.a.b.e.AbstractC0146b> wVar) {
            Objects.requireNonNull(wVar, "Null frames");
            this.f12625c = wVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.e.AbstractC0145a
        public v.d.AbstractC0137d.a.b.e.AbstractC0145a c(int i2) {
            this.f12624b = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.e.AbstractC0145a
        public v.d.AbstractC0137d.a.b.e.AbstractC0145a d(String str) {
            Objects.requireNonNull(str, "Null name");
            this.a = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.e
    public w<v.d.AbstractC0137d.a.b.e.AbstractC0146b> b() {
        return this.f12623c;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.e
    public int c() {
        return this.f12622b;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.AbstractC0137d.a.b.e
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.AbstractC0137d.a.b.e)) {
            return false;
        }
        v.d.AbstractC0137d.a.b.e eVar = (v.d.AbstractC0137d.a.b.e) obj;
        return this.a.equals(eVar.d()) && this.f12622b == eVar.c() && this.f12623c.equals(eVar.b());
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f12622b) * 1000003) ^ this.f12623c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.a + ", importance=" + this.f12622b + ", frames=" + this.f12623c + "}";
    }

    private p(String str, int i2, w<v.d.AbstractC0137d.a.b.e.AbstractC0146b> wVar) {
        this.a = str;
        this.f12622b = i2;
        this.f12623c = wVar;
    }
}