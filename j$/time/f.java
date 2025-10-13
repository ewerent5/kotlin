package j$.time;

import j$.time.o.m;
import j$.time.o.n;
import j$.time.o.q;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class f implements j$.time.m.c<e>, Serializable, Serializable {
    public static final f a = z(e.a, g.a);

    /* renamed from: b */
    public static final f f15913b = z(e.f15909b, g.f15916b);

    /* renamed from: c */
    private final e f15914c;

    /* renamed from: d */
    private final g f15915d;

    private f(e eVar, g gVar) {
        this.f15914c = eVar;
        this.f15915d = gVar;
    }

    public static f A(long j2, int i2, k kVar) {
        Objects.requireNonNull(kVar, "offset");
        long j3 = i2;
        j$.time.o.h.NANO_OF_SECOND.x(j3);
        return new f(e.C(a.D(j2 + kVar.y(), 86400)), g.A((((int) a.B(r5, r7)) * 1000000000) + j3));
    }

    public static f v(j$.time.o.k kVar) {
        if (kVar instanceof f) {
            return (f) kVar;
        }
        if (kVar instanceof ZonedDateTime) {
            return ((ZonedDateTime) kVar).v();
        }
        if (kVar instanceof i) {
            return ((i) kVar).v();
        }
        try {
            return new f(e.v(kVar), g.v(kVar));
        } catch (c e2) {
            throw new c("Unable to obtain LocalDateTime from TemporalAccessor: " + kVar + " of type " + kVar.getClass().getName(), e2);
        }
    }

    public static f y(int i2, int i3, int i4, int i5, int i6) {
        return new f(e.B(i2, i3, i4), g.z(i5, i6));
    }

    public static f z(e eVar, g gVar) {
        Objects.requireNonNull(eVar, "date");
        Objects.requireNonNull(gVar, "time");
        return new f(eVar, gVar);
    }

    public /* synthetic */ long B(k kVar) {
        return a.j(this, kVar);
    }

    public e C() {
        return this.f15914c;
    }

    @Override // j$.time.m.c
    public j$.time.m.h a() {
        Objects.requireNonNull(this.f15914c);
        return j$.time.m.i.a;
    }

    @Override // j$.time.m.c
    public g b() {
        return this.f15915d;
    }

    @Override // j$.time.m.c
    public j$.time.m.b c() {
        return this.f15914c;
    }

    public boolean d(j$.time.o.l lVar) {
        if (!(lVar instanceof j$.time.o.h)) {
            return lVar != null && lVar.n(this);
        }
        j$.time.o.h hVar = (j$.time.o.h) lVar;
        return hVar.v() || hVar.j();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f15914c.equals(fVar.f15914c) && this.f15915d.equals(fVar.f15915d);
    }

    public int h(j$.time.o.l lVar) {
        return lVar instanceof j$.time.o.h ? ((j$.time.o.h) lVar).j() ? this.f15915d.h(lVar) : this.f15914c.h(lVar) : a.f(this, lVar);
    }

    public int hashCode() {
        return this.f15914c.hashCode() ^ this.f15915d.hashCode();
    }

    public q j(j$.time.o.l lVar) {
        if (!(lVar instanceof j$.time.o.h)) {
            return lVar.t(this);
        }
        if (!((j$.time.o.h) lVar).j()) {
            return this.f15914c.j(lVar);
        }
        g gVar = this.f15915d;
        Objects.requireNonNull(gVar);
        return a.i(gVar, lVar);
    }

    public long l(j$.time.o.l lVar) {
        return lVar instanceof j$.time.o.h ? ((j$.time.o.h) lVar).j() ? this.f15915d.l(lVar) : this.f15914c.l(lVar) : lVar.l(this);
    }

    public Object n(n nVar) {
        int i2 = m.a;
        return nVar == j$.time.o.a.a ? this.f15914c : a.g(this, nVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: p */
    public int compareTo(j$.time.m.c cVar) {
        if (!(cVar instanceof f)) {
            return a.d(this, cVar);
        }
        f fVar = (f) cVar;
        int iT = this.f15914c.t(fVar.f15914c);
        return iT == 0 ? this.f15915d.compareTo(fVar.f15915d) : iT;
    }

    public i t(k kVar) {
        return i.t(this, kVar);
    }

    public String toString() {
        return this.f15914c.toString() + 'T' + this.f15915d.toString();
    }

    public int w() {
        return this.f15915d.y();
    }

    public int x() {
        return this.f15914c.z();
    }
}