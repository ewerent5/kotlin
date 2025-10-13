package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;
import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReport.java */
/* loaded from: classes.dex */
final class b extends v {

    /* renamed from: b, reason: collision with root package name */
    private final String f12515b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12516c;

    /* renamed from: d, reason: collision with root package name */
    private final int f12517d;

    /* renamed from: e, reason: collision with root package name */
    private final String f12518e;

    /* renamed from: f, reason: collision with root package name */
    private final String f12519f;

    /* renamed from: g, reason: collision with root package name */
    private final String f12520g;

    /* renamed from: h, reason: collision with root package name */
    private final v.d f12521h;

    /* renamed from: i, reason: collision with root package name */
    private final v.c f12522i;

    /* compiled from: AutoValue_CrashlyticsReport.java */
    /* renamed from: com.google.firebase.crashlytics.d.j.b$b, reason: collision with other inner class name */
    static final class C0135b extends v.a {
        private String a;

        /* renamed from: b, reason: collision with root package name */
        private String f12523b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f12524c;

        /* renamed from: d, reason: collision with root package name */
        private String f12525d;

        /* renamed from: e, reason: collision with root package name */
        private String f12526e;

        /* renamed from: f, reason: collision with root package name */
        private String f12527f;

        /* renamed from: g, reason: collision with root package name */
        private v.d f12528g;

        /* renamed from: h, reason: collision with root package name */
        private v.c f12529h;

        @Override // com.google.firebase.crashlytics.d.j.v.a
        public v a() {
            String str = "";
            if (this.a == null) {
                str = " sdkVersion";
            }
            if (this.f12523b == null) {
                str = str + " gmpAppId";
            }
            if (this.f12524c == null) {
                str = str + " platform";
            }
            if (this.f12525d == null) {
                str = str + " installationUuid";
            }
            if (this.f12526e == null) {
                str = str + " buildVersion";
            }
            if (this.f12527f == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new b(this.a, this.f12523b, this.f12524c.intValue(), this.f12525d, this.f12526e, this.f12527f, this.f12528g, this.f12529h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.d.j.v.a
        public v.a b(String str) {
            Objects.requireNonNull(str, "Null buildVersion");
            this.f12526e = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.a
        public v.a c(String str) {
            Objects.requireNonNull(str, "Null displayVersion");
            this.f12527f = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.a
        public v.a d(String str) {
            Objects.requireNonNull(str, "Null gmpAppId");
            this.f12523b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.a
        public v.a e(String str) {
            Objects.requireNonNull(str, "Null installationUuid");
            this.f12525d = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.a
        public v.a f(v.c cVar) {
            this.f12529h = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.a
        public v.a g(int i2) {
            this.f12524c = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.a
        public v.a h(String str) {
            Objects.requireNonNull(str, "Null sdkVersion");
            this.a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.a
        public v.a i(v.d dVar) {
            this.f12528g = dVar;
            return this;
        }

        C0135b() {
        }

        private C0135b(v vVar) {
            this.a = vVar.i();
            this.f12523b = vVar.e();
            this.f12524c = Integer.valueOf(vVar.h());
            this.f12525d = vVar.f();
            this.f12526e = vVar.c();
            this.f12527f = vVar.d();
            this.f12528g = vVar.j();
            this.f12529h = vVar.g();
        }
    }

    @Override // com.google.firebase.crashlytics.d.j.v
    public String c() {
        return this.f12519f;
    }

    @Override // com.google.firebase.crashlytics.d.j.v
    public String d() {
        return this.f12520g;
    }

    @Override // com.google.firebase.crashlytics.d.j.v
    public String e() {
        return this.f12516c;
    }

    public boolean equals(Object obj) {
        v.d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f12515b.equals(vVar.i()) && this.f12516c.equals(vVar.e()) && this.f12517d == vVar.h() && this.f12518e.equals(vVar.f()) && this.f12519f.equals(vVar.c()) && this.f12520g.equals(vVar.d()) && ((dVar = this.f12521h) != null ? dVar.equals(vVar.j()) : vVar.j() == null)) {
            v.c cVar = this.f12522i;
            if (cVar == null) {
                if (vVar.g() == null) {
                    return true;
                }
            } else if (cVar.equals(vVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.d.j.v
    public String f() {
        return this.f12518e;
    }

    @Override // com.google.firebase.crashlytics.d.j.v
    public v.c g() {
        return this.f12522i;
    }

    @Override // com.google.firebase.crashlytics.d.j.v
    public int h() {
        return this.f12517d;
    }

    public int hashCode() {
        int iHashCode = (((((((((((this.f12515b.hashCode() ^ 1000003) * 1000003) ^ this.f12516c.hashCode()) * 1000003) ^ this.f12517d) * 1000003) ^ this.f12518e.hashCode()) * 1000003) ^ this.f12519f.hashCode()) * 1000003) ^ this.f12520g.hashCode()) * 1000003;
        v.d dVar = this.f12521h;
        int iHashCode2 = (iHashCode ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        v.c cVar = this.f12522i;
        return iHashCode2 ^ (cVar != null ? cVar.hashCode() : 0);
    }

    @Override // com.google.firebase.crashlytics.d.j.v
    public String i() {
        return this.f12515b;
    }

    @Override // com.google.firebase.crashlytics.d.j.v
    public v.d j() {
        return this.f12521h;
    }

    @Override // com.google.firebase.crashlytics.d.j.v
    protected v.a l() {
        return new C0135b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f12515b + ", gmpAppId=" + this.f12516c + ", platform=" + this.f12517d + ", installationUuid=" + this.f12518e + ", buildVersion=" + this.f12519f + ", displayVersion=" + this.f12520g + ", session=" + this.f12521h + ", ndkPayload=" + this.f12522i + "}";
    }

    private b(String str, String str2, int i2, String str3, String str4, String str5, v.d dVar, v.c cVar) {
        this.f12515b = str;
        this.f12516c = str2;
        this.f12517d = i2;
        this.f12518e = str3;
        this.f12519f = str4;
        this.f12520g = str5;
        this.f12521h = dVar;
        this.f12522i = cVar;
    }
}