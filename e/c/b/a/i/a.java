package e.c.b.a.i;

import e.c.b.a.i.h;
import java.util.Map;
import java.util.Objects;

/* compiled from: AutoValue_EventInternal.java */
/* loaded from: classes.dex */
final class a extends h {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f14229b;

    /* renamed from: c, reason: collision with root package name */
    private final g f14230c;

    /* renamed from: d, reason: collision with root package name */
    private final long f14231d;

    /* renamed from: e, reason: collision with root package name */
    private final long f14232e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, String> f14233f;

    /* compiled from: AutoValue_EventInternal.java */
    static final class b extends h.a {
        private String a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f14234b;

        /* renamed from: c, reason: collision with root package name */
        private g f14235c;

        /* renamed from: d, reason: collision with root package name */
        private Long f14236d;

        /* renamed from: e, reason: collision with root package name */
        private Long f14237e;

        /* renamed from: f, reason: collision with root package name */
        private Map<String, String> f14238f;

        b() {
        }

        @Override // e.c.b.a.i.h.a
        public h d() {
            String str = "";
            if (this.a == null) {
                str = " transportName";
            }
            if (this.f14235c == null) {
                str = str + " encodedPayload";
            }
            if (this.f14236d == null) {
                str = str + " eventMillis";
            }
            if (this.f14237e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f14238f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new a(this.a, this.f14234b, this.f14235c, this.f14236d.longValue(), this.f14237e.longValue(), this.f14238f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // e.c.b.a.i.h.a
        protected Map<String, String> e() {
            Map<String, String> map = this.f14238f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // e.c.b.a.i.h.a
        protected h.a f(Map<String, String> map) {
            Objects.requireNonNull(map, "Null autoMetadata");
            this.f14238f = map;
            return this;
        }

        @Override // e.c.b.a.i.h.a
        public h.a g(Integer num) {
            this.f14234b = num;
            return this;
        }

        @Override // e.c.b.a.i.h.a
        public h.a h(g gVar) {
            Objects.requireNonNull(gVar, "Null encodedPayload");
            this.f14235c = gVar;
            return this;
        }

        @Override // e.c.b.a.i.h.a
        public h.a i(long j2) {
            this.f14236d = Long.valueOf(j2);
            return this;
        }

        @Override // e.c.b.a.i.h.a
        public h.a j(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.a = str;
            return this;
        }

        @Override // e.c.b.a.i.h.a
        public h.a k(long j2) {
            this.f14237e = Long.valueOf(j2);
            return this;
        }
    }

    @Override // e.c.b.a.i.h
    protected Map<String, String> c() {
        return this.f14233f;
    }

    @Override // e.c.b.a.i.h
    public Integer d() {
        return this.f14229b;
    }

    @Override // e.c.b.a.i.h
    public g e() {
        return this.f14230c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a.equals(hVar.j()) && ((num = this.f14229b) != null ? num.equals(hVar.d()) : hVar.d() == null) && this.f14230c.equals(hVar.e()) && this.f14231d == hVar.f() && this.f14232e == hVar.k() && this.f14233f.equals(hVar.c());
    }

    @Override // e.c.b.a.i.h
    public long f() {
        return this.f14231d;
    }

    public int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f14229b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f14230c.hashCode()) * 1000003;
        long j2 = this.f14231d;
        int i2 = (iHashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f14232e;
        return ((i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ this.f14233f.hashCode();
    }

    @Override // e.c.b.a.i.h
    public String j() {
        return this.a;
    }

    @Override // e.c.b.a.i.h
    public long k() {
        return this.f14232e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.f14229b + ", encodedPayload=" + this.f14230c + ", eventMillis=" + this.f14231d + ", uptimeMillis=" + this.f14232e + ", autoMetadata=" + this.f14233f + "}";
    }

    private a(String str, Integer num, g gVar, long j2, long j3, Map<String, String> map) {
        this.a = str;
        this.f14229b = num;
        this.f14230c = gVar;
        this.f14231d = j2;
        this.f14232e = j3;
        this.f14233f = map;
    }
}