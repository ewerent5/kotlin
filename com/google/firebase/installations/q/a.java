package com.google.firebase.installations.q;

import com.google.firebase.installations.q.d;

/* compiled from: AutoValue_InstallationResponse.java */
/* loaded from: classes.dex */
final class a extends d {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12834b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12835c;

    /* renamed from: d, reason: collision with root package name */
    private final f f12836d;

    /* renamed from: e, reason: collision with root package name */
    private final d.b f12837e;

    /* compiled from: AutoValue_InstallationResponse.java */
    static final class b extends d.a {
        private String a;

        /* renamed from: b, reason: collision with root package name */
        private String f12838b;

        /* renamed from: c, reason: collision with root package name */
        private String f12839c;

        /* renamed from: d, reason: collision with root package name */
        private f f12840d;

        /* renamed from: e, reason: collision with root package name */
        private d.b f12841e;

        b() {
        }

        @Override // com.google.firebase.installations.q.d.a
        public d a() {
            return new a(this.a, this.f12838b, this.f12839c, this.f12840d, this.f12841e);
        }

        @Override // com.google.firebase.installations.q.d.a
        public d.a b(f fVar) {
            this.f12840d = fVar;
            return this;
        }

        @Override // com.google.firebase.installations.q.d.a
        public d.a c(String str) {
            this.f12838b = str;
            return this;
        }

        @Override // com.google.firebase.installations.q.d.a
        public d.a d(String str) {
            this.f12839c = str;
            return this;
        }

        @Override // com.google.firebase.installations.q.d.a
        public d.a e(d.b bVar) {
            this.f12841e = bVar;
            return this;
        }

        @Override // com.google.firebase.installations.q.d.a
        public d.a f(String str) {
            this.a = str;
            return this;
        }
    }

    @Override // com.google.firebase.installations.q.d
    public f b() {
        return this.f12836d;
    }

    @Override // com.google.firebase.installations.q.d
    public String c() {
        return this.f12834b;
    }

    @Override // com.google.firebase.installations.q.d
    public String d() {
        return this.f12835c;
    }

    @Override // com.google.firebase.installations.q.d
    public d.b e() {
        return this.f12837e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.a;
        if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
            String str2 = this.f12834b;
            if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                String str3 = this.f12835c;
                if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                    f fVar = this.f12836d;
                    if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                        d.b bVar = this.f12837e;
                        if (bVar == null) {
                            if (dVar.e() == null) {
                                return true;
                            }
                        } else if (bVar.equals(dVar.e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.q.d
    public String f() {
        return this.a;
    }

    public int hashCode() {
        String str = this.a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f12834b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f12835c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f12836d;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f12837e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.a + ", fid=" + this.f12834b + ", refreshToken=" + this.f12835c + ", authToken=" + this.f12836d + ", responseCode=" + this.f12837e + "}";
    }

    private a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.a = str;
        this.f12834b = str2;
        this.f12835c = str3;
        this.f12836d = fVar;
        this.f12837e = bVar;
    }
}