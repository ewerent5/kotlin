package com.google.android.datatransport.cct.f;

import com.google.android.datatransport.cct.f.l;
import java.util.Arrays;

/* compiled from: AutoValue_LogEvent.java */
/* loaded from: classes.dex */
final class f extends l {
    private final long a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f4314b;

    /* renamed from: c, reason: collision with root package name */
    private final long f4315c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f4316d;

    /* renamed from: e, reason: collision with root package name */
    private final String f4317e;

    /* renamed from: f, reason: collision with root package name */
    private final long f4318f;

    /* renamed from: g, reason: collision with root package name */
    private final o f4319g;

    /* compiled from: AutoValue_LogEvent.java */
    static final class b extends l.a {
        private Long a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f4320b;

        /* renamed from: c, reason: collision with root package name */
        private Long f4321c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f4322d;

        /* renamed from: e, reason: collision with root package name */
        private String f4323e;

        /* renamed from: f, reason: collision with root package name */
        private Long f4324f;

        /* renamed from: g, reason: collision with root package name */
        private o f4325g;

        b() {
        }

        @Override // com.google.android.datatransport.cct.f.l.a
        public l a() {
            String str = "";
            if (this.a == null) {
                str = " eventTimeMs";
            }
            if (this.f4321c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f4324f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.a.longValue(), this.f4320b, this.f4321c.longValue(), this.f4322d, this.f4323e, this.f4324f.longValue(), this.f4325g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.cct.f.l.a
        public l.a b(Integer num) {
            this.f4320b = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.f.l.a
        public l.a c(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.android.datatransport.cct.f.l.a
        public l.a d(long j2) {
            this.f4321c = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.android.datatransport.cct.f.l.a
        public l.a e(o oVar) {
            this.f4325g = oVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.f.l.a
        l.a f(byte[] bArr) {
            this.f4322d = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.cct.f.l.a
        l.a g(String str) {
            this.f4323e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.f.l.a
        public l.a h(long j2) {
            this.f4324f = Long.valueOf(j2);
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.f.l
    public Integer b() {
        return this.f4314b;
    }

    @Override // com.google.android.datatransport.cct.f.l
    public long c() {
        return this.a;
    }

    @Override // com.google.android.datatransport.cct.f.l
    public long d() {
        return this.f4315c;
    }

    @Override // com.google.android.datatransport.cct.f.l
    public o e() {
        return this.f4319g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.a == lVar.c() && ((num = this.f4314b) != null ? num.equals(lVar.b()) : lVar.b() == null) && this.f4315c == lVar.d()) {
            if (Arrays.equals(this.f4316d, lVar instanceof f ? ((f) lVar).f4316d : lVar.f()) && ((str = this.f4317e) != null ? str.equals(lVar.g()) : lVar.g() == null) && this.f4318f == lVar.h()) {
                o oVar = this.f4319g;
                if (oVar == null) {
                    if (lVar.e() == null) {
                        return true;
                    }
                } else if (oVar.equals(lVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.f.l
    public byte[] f() {
        return this.f4316d;
    }

    @Override // com.google.android.datatransport.cct.f.l
    public String g() {
        return this.f4317e;
    }

    @Override // com.google.android.datatransport.cct.f.l
    public long h() {
        return this.f4318f;
    }

    public int hashCode() {
        long j2 = this.a;
        int i2 = (((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f4314b;
        int iHashCode = num == null ? 0 : num.hashCode();
        long j3 = this.f4315c;
        int iHashCode2 = (((((i2 ^ iHashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f4316d)) * 1000003;
        String str = this.f4317e;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        long j4 = this.f4318f;
        int i3 = (((iHashCode2 ^ iHashCode3) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003;
        o oVar = this.f4319g;
        return i3 ^ (oVar != null ? oVar.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.f4314b + ", eventUptimeMs=" + this.f4315c + ", sourceExtension=" + Arrays.toString(this.f4316d) + ", sourceExtensionJsonProto3=" + this.f4317e + ", timezoneOffsetSeconds=" + this.f4318f + ", networkConnectionInfo=" + this.f4319g + "}";
    }

    private f(long j2, Integer num, long j3, byte[] bArr, String str, long j4, o oVar) {
        this.a = j2;
        this.f4314b = num;
        this.f4315c = j3;
        this.f4316d = bArr;
        this.f4317e = str;
        this.f4318f = j4;
        this.f4319g = oVar;
    }
}