package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;
import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReport_Session.java */
/* loaded from: classes.dex */
final class f extends v.d {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12536b;

    /* renamed from: c, reason: collision with root package name */
    private final long f12537c;

    /* renamed from: d, reason: collision with root package name */
    private final Long f12538d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f12539e;

    /* renamed from: f, reason: collision with root package name */
    private final v.d.a f12540f;

    /* renamed from: g, reason: collision with root package name */
    private final v.d.f f12541g;

    /* renamed from: h, reason: collision with root package name */
    private final v.d.e f12542h;

    /* renamed from: i, reason: collision with root package name */
    private final v.d.c f12543i;

    /* renamed from: j, reason: collision with root package name */
    private final w<v.d.AbstractC0137d> f12544j;

    /* renamed from: k, reason: collision with root package name */
    private final int f12545k;

    /* compiled from: AutoValue_CrashlyticsReport_Session.java */
    static final class b extends v.d.b {
        private String a;

        /* renamed from: b, reason: collision with root package name */
        private String f12546b;

        /* renamed from: c, reason: collision with root package name */
        private Long f12547c;

        /* renamed from: d, reason: collision with root package name */
        private Long f12548d;

        /* renamed from: e, reason: collision with root package name */
        private Boolean f12549e;

        /* renamed from: f, reason: collision with root package name */
        private v.d.a f12550f;

        /* renamed from: g, reason: collision with root package name */
        private v.d.f f12551g;

        /* renamed from: h, reason: collision with root package name */
        private v.d.e f12552h;

        /* renamed from: i, reason: collision with root package name */
        private v.d.c f12553i;

        /* renamed from: j, reason: collision with root package name */
        private w<v.d.AbstractC0137d> f12554j;

        /* renamed from: k, reason: collision with root package name */
        private Integer f12555k;

        @Override // com.google.firebase.crashlytics.d.j.v.d.b
        public v.d a() {
            String str = "";
            if (this.a == null) {
                str = " generator";
            }
            if (this.f12546b == null) {
                str = str + " identifier";
            }
            if (this.f12547c == null) {
                str = str + " startedAt";
            }
            if (this.f12549e == null) {
                str = str + " crashed";
            }
            if (this.f12550f == null) {
                str = str + " app";
            }
            if (this.f12555k == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new f(this.a, this.f12546b, this.f12547c.longValue(), this.f12548d, this.f12549e.booleanValue(), this.f12550f, this.f12551g, this.f12552h, this.f12553i, this.f12554j, this.f12555k.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.b
        public v.d.b b(v.d.a aVar) {
            Objects.requireNonNull(aVar, "Null app");
            this.f12550f = aVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.b
        public v.d.b c(boolean z) {
            this.f12549e = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.b
        public v.d.b d(v.d.c cVar) {
            this.f12553i = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.b
        public v.d.b e(Long l2) {
            this.f12548d = l2;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.b
        public v.d.b f(w<v.d.AbstractC0137d> wVar) {
            this.f12554j = wVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.b
        public v.d.b g(String str) {
            Objects.requireNonNull(str, "Null generator");
            this.a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.b
        public v.d.b h(int i2) {
            this.f12555k = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.b
        public v.d.b i(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.f12546b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.b
        public v.d.b k(v.d.e eVar) {
            this.f12552h = eVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.b
        public v.d.b l(long j2) {
            this.f12547c = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.b
        public v.d.b m(v.d.f fVar) {
            this.f12551g = fVar;
            return this;
        }

        b() {
        }

        private b(v.d dVar) {
            this.a = dVar.f();
            this.f12546b = dVar.h();
            this.f12547c = Long.valueOf(dVar.k());
            this.f12548d = dVar.d();
            this.f12549e = Boolean.valueOf(dVar.m());
            this.f12550f = dVar.b();
            this.f12551g = dVar.l();
            this.f12552h = dVar.j();
            this.f12553i = dVar.c();
            this.f12554j = dVar.e();
            this.f12555k = Integer.valueOf(dVar.g());
        }
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d
    public v.d.a b() {
        return this.f12540f;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d
    public v.d.c c() {
        return this.f12543i;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d
    public Long d() {
        return this.f12538d;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d
    public w<v.d.AbstractC0137d> e() {
        return this.f12544j;
    }

    public boolean equals(Object obj) {
        Long l2;
        v.d.f fVar;
        v.d.e eVar;
        v.d.c cVar;
        w<v.d.AbstractC0137d> wVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d)) {
            return false;
        }
        v.d dVar = (v.d) obj;
        return this.a.equals(dVar.f()) && this.f12536b.equals(dVar.h()) && this.f12537c == dVar.k() && ((l2 = this.f12538d) != null ? l2.equals(dVar.d()) : dVar.d() == null) && this.f12539e == dVar.m() && this.f12540f.equals(dVar.b()) && ((fVar = this.f12541g) != null ? fVar.equals(dVar.l()) : dVar.l() == null) && ((eVar = this.f12542h) != null ? eVar.equals(dVar.j()) : dVar.j() == null) && ((cVar = this.f12543i) != null ? cVar.equals(dVar.c()) : dVar.c() == null) && ((wVar = this.f12544j) != null ? wVar.equals(dVar.e()) : dVar.e() == null) && this.f12545k == dVar.g();
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d
    public String f() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d
    public int g() {
        return this.f12545k;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d
    public String h() {
        return this.f12536b;
    }

    public int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f12536b.hashCode()) * 1000003;
        long j2 = this.f12537c;
        int i2 = (iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        Long l2 = this.f12538d;
        int iHashCode2 = (((((i2 ^ (l2 == null ? 0 : l2.hashCode())) * 1000003) ^ (this.f12539e ? 1231 : 1237)) * 1000003) ^ this.f12540f.hashCode()) * 1000003;
        v.d.f fVar = this.f12541g;
        int iHashCode3 = (iHashCode2 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        v.d.e eVar = this.f12542h;
        int iHashCode4 = (iHashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        v.d.c cVar = this.f12543i;
        int iHashCode5 = (iHashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        w<v.d.AbstractC0137d> wVar = this.f12544j;
        return ((iHashCode5 ^ (wVar != null ? wVar.hashCode() : 0)) * 1000003) ^ this.f12545k;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d
    public v.d.e j() {
        return this.f12542h;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d
    public long k() {
        return this.f12537c;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d
    public v.d.f l() {
        return this.f12541g;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d
    public boolean m() {
        return this.f12539e;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d
    public v.d.b n() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.a + ", identifier=" + this.f12536b + ", startedAt=" + this.f12537c + ", endedAt=" + this.f12538d + ", crashed=" + this.f12539e + ", app=" + this.f12540f + ", user=" + this.f12541g + ", os=" + this.f12542h + ", device=" + this.f12543i + ", events=" + this.f12544j + ", generatorType=" + this.f12545k + "}";
    }

    private f(String str, String str2, long j2, Long l2, boolean z, v.d.a aVar, v.d.f fVar, v.d.e eVar, v.d.c cVar, w<v.d.AbstractC0137d> wVar, int i2) {
        this.a = str;
        this.f12536b = str2;
        this.f12537c = j2;
        this.f12538d = l2;
        this.f12539e = z;
        this.f12540f = aVar;
        this.f12541g = fVar;
        this.f12542h = eVar;
        this.f12543i = cVar;
        this.f12544j = wVar;
        this.f12545k = i2;
    }
}