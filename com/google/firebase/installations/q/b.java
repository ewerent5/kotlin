package com.google.firebase.installations.q;

import com.google.firebase.installations.q.f;

/* compiled from: AutoValue_TokenResult.java */
/* loaded from: classes.dex */
final class b extends f {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final long f12842b;

    /* renamed from: c, reason: collision with root package name */
    private final f.b f12843c;

    /* compiled from: AutoValue_TokenResult.java */
    /* renamed from: com.google.firebase.installations.q.b$b, reason: collision with other inner class name */
    static final class C0154b extends f.a {
        private String a;

        /* renamed from: b, reason: collision with root package name */
        private Long f12844b;

        /* renamed from: c, reason: collision with root package name */
        private f.b f12845c;

        C0154b() {
        }

        @Override // com.google.firebase.installations.q.f.a
        public f a() {
            String str = "";
            if (this.f12844b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.a, this.f12844b.longValue(), this.f12845c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.q.f.a
        public f.a b(f.b bVar) {
            this.f12845c = bVar;
            return this;
        }

        @Override // com.google.firebase.installations.q.f.a
        public f.a c(String str) {
            this.a = str;
            return this;
        }

        @Override // com.google.firebase.installations.q.f.a
        public f.a d(long j2) {
            this.f12844b = Long.valueOf(j2);
            return this;
        }
    }

    @Override // com.google.firebase.installations.q.f
    public f.b b() {
        return this.f12843c;
    }

    @Override // com.google.firebase.installations.q.f
    public String c() {
        return this.a;
    }

    @Override // com.google.firebase.installations.q.f
    public long d() {
        return this.f12842b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.a;
        if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
            if (this.f12842b == fVar.d()) {
                f.b bVar = this.f12843c;
                if (bVar == null) {
                    if (fVar.b() == null) {
                        return true;
                    }
                } else if (bVar.equals(fVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j2 = this.f12842b;
        int i2 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        f.b bVar = this.f12843c;
        return i2 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.f12842b + ", responseCode=" + this.f12843c + "}";
    }

    private b(String str, long j2, f.b bVar) {
        this.a = str;
        this.f12842b = j2;
        this.f12843c = bVar;
    }
}