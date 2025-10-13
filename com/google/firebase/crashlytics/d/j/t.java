package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;
import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
/* loaded from: classes.dex */
final class t extends v.d.e {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12644b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12645c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f12646d;

    /* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
    static final class b extends v.d.e.a {
        private Integer a;

        /* renamed from: b, reason: collision with root package name */
        private String f12647b;

        /* renamed from: c, reason: collision with root package name */
        private String f12648c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f12649d;

        b() {
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.e.a
        public v.d.e a() {
            String str = "";
            if (this.a == null) {
                str = " platform";
            }
            if (this.f12647b == null) {
                str = str + " version";
            }
            if (this.f12648c == null) {
                str = str + " buildVersion";
            }
            if (this.f12649d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new t(this.a.intValue(), this.f12647b, this.f12648c, this.f12649d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.e.a
        public v.d.e.a b(String str) {
            Objects.requireNonNull(str, "Null buildVersion");
            this.f12648c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.e.a
        public v.d.e.a c(boolean z) {
            this.f12649d = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.e.a
        public v.d.e.a d(int i2) {
            this.a = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.e.a
        public v.d.e.a e(String str) {
            Objects.requireNonNull(str, "Null version");
            this.f12647b = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.e
    public String b() {
        return this.f12645c;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.e
    public int c() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.e
    public String d() {
        return this.f12644b;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.e
    public boolean e() {
        return this.f12646d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.e)) {
            return false;
        }
        v.d.e eVar = (v.d.e) obj;
        return this.a == eVar.c() && this.f12644b.equals(eVar.d()) && this.f12645c.equals(eVar.b()) && this.f12646d == eVar.e();
    }

    public int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.f12644b.hashCode()) * 1000003) ^ this.f12645c.hashCode()) * 1000003) ^ (this.f12646d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.a + ", version=" + this.f12644b + ", buildVersion=" + this.f12645c + ", jailbroken=" + this.f12646d + "}";
    }

    private t(int i2, String str, String str2, boolean z) {
        this.a = i2;
        this.f12644b = str;
        this.f12645c = str2;
        this.f12646d = z;
    }
}