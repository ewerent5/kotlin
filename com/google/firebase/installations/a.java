package com.google.firebase.installations;

import com.google.firebase.installations.l;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-installations-interop@@16.0.0 */
/* loaded from: classes.dex */
final class a extends l {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final long f12779b;

    /* renamed from: c, reason: collision with root package name */
    private final long f12780c;

    /* compiled from: com.google.firebase:firebase-installations-interop@@16.0.0 */
    static final class b extends l.a {
        private String a;

        /* renamed from: b, reason: collision with root package name */
        private Long f12781b;

        /* renamed from: c, reason: collision with root package name */
        private Long f12782c;

        b() {
        }

        @Override // com.google.firebase.installations.l.a
        public l a() {
            String str = "";
            if (this.a == null) {
                str = " token";
            }
            if (this.f12781b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f12782c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.a, this.f12781b.longValue(), this.f12782c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.l.a
        public l.a b(String str) {
            Objects.requireNonNull(str, "Null token");
            this.a = str;
            return this;
        }

        @Override // com.google.firebase.installations.l.a
        public l.a c(long j2) {
            this.f12782c = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.installations.l.a
        public l.a d(long j2) {
            this.f12781b = Long.valueOf(j2);
            return this;
        }
    }

    @Override // com.google.firebase.installations.l
    public String b() {
        return this.a;
    }

    @Override // com.google.firebase.installations.l
    public long c() {
        return this.f12780c;
    }

    @Override // com.google.firebase.installations.l
    public long d() {
        return this.f12779b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.a.equals(lVar.b()) && this.f12779b == lVar.d() && this.f12780c == lVar.c();
    }

    public int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j2 = this.f12779b;
        long j3 = this.f12780c;
        return ((iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.f12779b + ", tokenCreationTimestamp=" + this.f12780c + "}";
    }

    private a(String str, long j2, long j3) {
        this.a = str;
        this.f12779b = j2;
        this.f12780c = j3;
    }
}