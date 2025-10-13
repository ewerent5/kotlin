package j$.time.m;

import j$.time.Instant;
import j$.time.j;
import j$.time.k;
import j$.time.m.b;
import j$.time.o.l;
import j$.time.o.n;
import j$.time.o.q;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes2.dex */
final class g<D extends b> implements f<D>, Serializable {
    private final transient d a;

    /* renamed from: b, reason: collision with root package name */
    private final transient k f15933b;

    /* renamed from: c, reason: collision with root package name */
    private final transient j f15934c;

    private g(d dVar, k kVar, j jVar) {
        Objects.requireNonNull(dVar, "dateTime");
        this.a = dVar;
        this.f15933b = kVar;
        this.f15934c = jVar;
    }

    static g t(h hVar, Instant instant, j jVar) {
        k kVarC = jVar.t().c(instant);
        Objects.requireNonNull(kVarC, "offset");
        return new g((d) hVar.o(j$.time.f.A(instant.w(), instant.x(), kVarC)), kVarC, jVar);
    }

    @Override // j$.time.m.f
    public h a() {
        c();
        throw null;
    }

    @Override // j$.time.m.f
    public j$.time.g b() {
        return ((d) q()).b();
    }

    @Override // j$.time.m.f
    public b c() {
        return ((d) q()).c();
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(f<?> fVar) {
        return e.a(this, fVar);
    }

    public boolean d(l lVar) {
        return (lVar instanceof j$.time.o.h) || (lVar != null && lVar.n(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && e.a(this, (f) obj) == 0;
    }

    @Override // j$.time.m.f
    public k f() {
        return this.f15933b;
    }

    public /* synthetic */ int h(l lVar) {
        return e.b(this, lVar);
    }

    public int hashCode() {
        Objects.requireNonNull(this.a);
        throw null;
    }

    public q j(l lVar) {
        return lVar instanceof j$.time.o.h ? (lVar == j$.time.o.h.INSTANT_SECONDS || lVar == j$.time.o.h.OFFSET_SECONDS) ? lVar.h() : ((d) q()).j(lVar) : lVar.t(this);
    }

    @Override // j$.time.m.f
    public j k() {
        return this.f15934c;
    }

    public long l(l lVar) {
        if (!(lVar instanceof j$.time.o.h)) {
            return lVar.l(this);
        }
        int iOrdinal = ((j$.time.o.h) lVar).ordinal();
        return iOrdinal != 28 ? iOrdinal != 29 ? ((d) q()).l(lVar) : f().y() : u();
    }

    public /* synthetic */ Object n(n nVar) {
        return e.c(this, nVar);
    }

    @Override // j$.time.m.f
    public c q() {
        return this.a;
    }

    public String toString() {
        Objects.requireNonNull(this.a);
        throw null;
    }

    @Override // j$.time.m.f
    public /* synthetic */ long u() {
        return e.d(this);
    }
}