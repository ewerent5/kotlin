package j$.time;

import j$.time.o.m;
import j$.time.o.n;
import j$.time.o.p;
import j$.time.o.q;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class ZonedDateTime implements j$.time.m.f<e>, Serializable, Serializable {
    private final f a;

    /* renamed from: b, reason: collision with root package name */
    private final k f15906b;

    /* renamed from: c, reason: collision with root package name */
    private final j f15907c;

    private ZonedDateTime(f fVar, k kVar, j jVar) {
        this.a = fVar;
        this.f15906b = kVar;
        this.f15907c = jVar;
    }

    public static ZonedDateTime t(Instant instant, j jVar) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(jVar, "zone");
        long jW = instant.w();
        int iX = instant.x();
        k kVarC = jVar.t().c(Instant.z(jW, iX));
        return new ZonedDateTime(f.A(jW, iX, kVarC), kVarC, jVar);
    }

    @Override // j$.time.m.f
    public j$.time.m.h a() {
        Objects.requireNonNull((e) c());
        return j$.time.m.i.a;
    }

    @Override // j$.time.m.f
    public g b() {
        return this.a.b();
    }

    @Override // j$.time.m.f
    public j$.time.m.b c() {
        return this.a.C();
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(j$.time.m.f<?> fVar) {
        return j$.time.m.e.a(this, fVar);
    }

    public boolean d(j$.time.o.l lVar) {
        return (lVar instanceof j$.time.o.h) || (lVar != null && lVar.n(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZonedDateTime)) {
            return false;
        }
        ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
        return this.a.equals(zonedDateTime.a) && this.f15906b.equals(zonedDateTime.f15906b) && this.f15907c.equals(zonedDateTime.f15907c);
    }

    @Override // j$.time.m.f
    public k f() {
        return this.f15906b;
    }

    public int h(j$.time.o.l lVar) {
        if (!(lVar instanceof j$.time.o.h)) {
            return j$.time.m.e.b(this, lVar);
        }
        int iOrdinal = ((j$.time.o.h) lVar).ordinal();
        if (iOrdinal != 28) {
            return iOrdinal != 29 ? this.a.h(lVar) : this.f15906b.y();
        }
        throw new p("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public int hashCode() {
        return (this.a.hashCode() ^ this.f15906b.hashCode()) ^ Integer.rotateLeft(this.f15907c.hashCode(), 3);
    }

    public q j(j$.time.o.l lVar) {
        return lVar instanceof j$.time.o.h ? (lVar == j$.time.o.h.INSTANT_SECONDS || lVar == j$.time.o.h.OFFSET_SECONDS) ? lVar.h() : this.a.j(lVar) : lVar.t(this);
    }

    @Override // j$.time.m.f
    public j k() {
        return this.f15907c;
    }

    public long l(j$.time.o.l lVar) {
        if (!(lVar instanceof j$.time.o.h)) {
            return lVar.l(this);
        }
        int iOrdinal = ((j$.time.o.h) lVar).ordinal();
        return iOrdinal != 28 ? iOrdinal != 29 ? this.a.l(lVar) : this.f15906b.y() : j$.time.m.e.d(this);
    }

    public Object n(n nVar) {
        int i2 = m.a;
        return nVar == j$.time.o.a.a ? this.a.C() : j$.time.m.e.c(this, nVar);
    }

    @Override // j$.time.m.f
    public j$.time.m.c q() {
        return this.a;
    }

    public String toString() {
        String str = this.a.toString() + this.f15906b.toString();
        if (this.f15906b == this.f15907c) {
            return str;
        }
        return str + '[' + this.f15907c.toString() + ']';
    }

    @Override // j$.time.m.f
    public /* synthetic */ long u() {
        return j$.time.m.e.d(this);
    }

    public f v() {
        return this.a;
    }
}