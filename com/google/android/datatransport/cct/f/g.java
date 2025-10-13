package com.google.android.datatransport.cct.f;

import com.google.android.datatransport.cct.f.m;
import java.util.List;

/* compiled from: AutoValue_LogRequest.java */
/* loaded from: classes.dex */
final class g extends m {
    private final long a;

    /* renamed from: b, reason: collision with root package name */
    private final long f4326b;

    /* renamed from: c, reason: collision with root package name */
    private final k f4327c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f4328d;

    /* renamed from: e, reason: collision with root package name */
    private final String f4329e;

    /* renamed from: f, reason: collision with root package name */
    private final List<l> f4330f;

    /* renamed from: g, reason: collision with root package name */
    private final p f4331g;

    /* compiled from: AutoValue_LogRequest.java */
    static final class b extends m.a {
        private Long a;

        /* renamed from: b, reason: collision with root package name */
        private Long f4332b;

        /* renamed from: c, reason: collision with root package name */
        private k f4333c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f4334d;

        /* renamed from: e, reason: collision with root package name */
        private String f4335e;

        /* renamed from: f, reason: collision with root package name */
        private List<l> f4336f;

        /* renamed from: g, reason: collision with root package name */
        private p f4337g;

        b() {
        }

        @Override // com.google.android.datatransport.cct.f.m.a
        public m a() {
            String str = "";
            if (this.a == null) {
                str = " requestTimeMs";
            }
            if (this.f4332b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.a.longValue(), this.f4332b.longValue(), this.f4333c, this.f4334d, this.f4335e, this.f4336f, this.f4337g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.cct.f.m.a
        public m.a b(k kVar) {
            this.f4333c = kVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.f.m.a
        public m.a c(List<l> list) {
            this.f4336f = list;
            return this;
        }

        @Override // com.google.android.datatransport.cct.f.m.a
        m.a d(Integer num) {
            this.f4334d = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.f.m.a
        m.a e(String str) {
            this.f4335e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.f.m.a
        public m.a f(p pVar) {
            this.f4337g = pVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.f.m.a
        public m.a g(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.android.datatransport.cct.f.m.a
        public m.a h(long j2) {
            this.f4332b = Long.valueOf(j2);
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.f.m
    public k b() {
        return this.f4327c;
    }

    @Override // com.google.android.datatransport.cct.f.m
    public List<l> c() {
        return this.f4330f;
    }

    @Override // com.google.android.datatransport.cct.f.m
    public Integer d() {
        return this.f4328d;
    }

    @Override // com.google.android.datatransport.cct.f.m
    public String e() {
        return this.f4329e;
    }

    public boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List<l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.a == mVar.g() && this.f4326b == mVar.h() && ((kVar = this.f4327c) != null ? kVar.equals(mVar.b()) : mVar.b() == null) && ((num = this.f4328d) != null ? num.equals(mVar.d()) : mVar.d() == null) && ((str = this.f4329e) != null ? str.equals(mVar.e()) : mVar.e() == null) && ((list = this.f4330f) != null ? list.equals(mVar.c()) : mVar.c() == null)) {
            p pVar = this.f4331g;
            if (pVar == null) {
                if (mVar.f() == null) {
                    return true;
                }
            } else if (pVar.equals(mVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.f.m
    public p f() {
        return this.f4331g;
    }

    @Override // com.google.android.datatransport.cct.f.m
    public long g() {
        return this.a;
    }

    @Override // com.google.android.datatransport.cct.f.m
    public long h() {
        return this.f4326b;
    }

    public int hashCode() {
        long j2 = this.a;
        long j3 = this.f4326b;
        int i2 = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        k kVar = this.f4327c;
        int iHashCode = (i2 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f4328d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f4329e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<l> list = this.f4330f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.f4331g;
        return iHashCode4 ^ (pVar != null ? pVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.f4326b + ", clientInfo=" + this.f4327c + ", logSource=" + this.f4328d + ", logSourceName=" + this.f4329e + ", logEvents=" + this.f4330f + ", qosTier=" + this.f4331g + "}";
    }

    private g(long j2, long j3, k kVar, Integer num, String str, List<l> list, p pVar) {
        this.a = j2;
        this.f4326b = j3;
        this.f4327c = kVar;
        this.f4328d = num;
        this.f4329e = str;
        this.f4330f = list;
        this.f4331g = pVar;
    }
}