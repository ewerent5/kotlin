package e.c.b.a.i.w.j;

import e.c.b.a.i.w.j.d;

/* compiled from: AutoValue_EventStoreConfig.java */
/* loaded from: classes.dex */
final class a extends d {

    /* renamed from: b, reason: collision with root package name */
    private final long f14298b;

    /* renamed from: c, reason: collision with root package name */
    private final int f14299c;

    /* renamed from: d, reason: collision with root package name */
    private final int f14300d;

    /* renamed from: e, reason: collision with root package name */
    private final long f14301e;

    /* renamed from: f, reason: collision with root package name */
    private final int f14302f;

    /* compiled from: AutoValue_EventStoreConfig.java */
    static final class b extends d.a {
        private Long a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f14303b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f14304c;

        /* renamed from: d, reason: collision with root package name */
        private Long f14305d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f14306e;

        b() {
        }

        @Override // e.c.b.a.i.w.j.d.a
        d a() {
            String str = "";
            if (this.a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f14303b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f14304c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f14305d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f14306e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new a(this.a.longValue(), this.f14303b.intValue(), this.f14304c.intValue(), this.f14305d.longValue(), this.f14306e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // e.c.b.a.i.w.j.d.a
        d.a b(int i2) {
            this.f14304c = Integer.valueOf(i2);
            return this;
        }

        @Override // e.c.b.a.i.w.j.d.a
        d.a c(long j2) {
            this.f14305d = Long.valueOf(j2);
            return this;
        }

        @Override // e.c.b.a.i.w.j.d.a
        d.a d(int i2) {
            this.f14303b = Integer.valueOf(i2);
            return this;
        }

        @Override // e.c.b.a.i.w.j.d.a
        d.a e(int i2) {
            this.f14306e = Integer.valueOf(i2);
            return this;
        }

        @Override // e.c.b.a.i.w.j.d.a
        d.a f(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }
    }

    @Override // e.c.b.a.i.w.j.d
    int b() {
        return this.f14300d;
    }

    @Override // e.c.b.a.i.w.j.d
    long c() {
        return this.f14301e;
    }

    @Override // e.c.b.a.i.w.j.d
    int d() {
        return this.f14299c;
    }

    @Override // e.c.b.a.i.w.j.d
    int e() {
        return this.f14302f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f14298b == dVar.f() && this.f14299c == dVar.d() && this.f14300d == dVar.b() && this.f14301e == dVar.c() && this.f14302f == dVar.e();
    }

    @Override // e.c.b.a.i.w.j.d
    long f() {
        return this.f14298b;
    }

    public int hashCode() {
        long j2 = this.f14298b;
        int i2 = (((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f14299c) * 1000003) ^ this.f14300d) * 1000003;
        long j3 = this.f14301e;
        return this.f14302f ^ ((i2 ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f14298b + ", loadBatchSize=" + this.f14299c + ", criticalSectionEnterTimeoutMs=" + this.f14300d + ", eventCleanUpAge=" + this.f14301e + ", maxBlobByteSizePerRow=" + this.f14302f + "}";
    }

    private a(long j2, int i2, int i3, long j3, int i4) {
        this.f14298b = j2;
        this.f14299c = i2;
        this.f14300d = i3;
        this.f14301e = j3;
        this.f14302f = i4;
    }
}