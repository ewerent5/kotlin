package j$.time;

import j$.time.o.m;
import j$.time.o.n;
import j$.time.o.p;
import j$.time.o.q;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class i implements Comparable<i>, Serializable, Serializable {
    private final f a;

    /* renamed from: b, reason: collision with root package name */
    private final k f15923b;

    static {
        f.a.t(k.f15928f);
        f.f15913b.t(k.f15927e);
    }

    private i(f fVar, k kVar) {
        Objects.requireNonNull(fVar, "dateTime");
        this.a = fVar;
        Objects.requireNonNull(kVar, "offset");
        this.f15923b = kVar;
    }

    public static i t(f fVar, k kVar) {
        return new i(fVar, kVar);
    }

    public g b() {
        return this.a.b();
    }

    @Override // java.lang.Comparable
    public int compareTo(i iVar) {
        int iCompare;
        i iVar2 = iVar;
        if (this.f15923b.equals(iVar2.f15923b)) {
            iCompare = this.a.compareTo(iVar2.a);
        } else {
            iCompare = Long.compare(u(), iVar2.u());
            if (iCompare == 0) {
                iCompare = b().x() - iVar2.b().x();
            }
        }
        return iCompare == 0 ? this.a.compareTo(iVar2.a) : iCompare;
    }

    public boolean d(j$.time.o.l lVar) {
        return (lVar instanceof j$.time.o.h) || (lVar != null && lVar.n(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a.equals(iVar.a) && this.f15923b.equals(iVar.f15923b);
    }

    public int h(j$.time.o.l lVar) {
        if (!(lVar instanceof j$.time.o.h)) {
            return a.f(this, lVar);
        }
        int iOrdinal = ((j$.time.o.h) lVar).ordinal();
        if (iOrdinal != 28) {
            return iOrdinal != 29 ? this.a.h(lVar) : this.f15923b.y();
        }
        throw new p("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public int hashCode() {
        return this.a.hashCode() ^ this.f15923b.hashCode();
    }

    public q j(j$.time.o.l lVar) {
        return lVar instanceof j$.time.o.h ? (lVar == j$.time.o.h.INSTANT_SECONDS || lVar == j$.time.o.h.OFFSET_SECONDS) ? lVar.h() : this.a.j(lVar) : lVar.t(this);
    }

    public long l(j$.time.o.l lVar) {
        if (!(lVar instanceof j$.time.o.h)) {
            return lVar.l(this);
        }
        int iOrdinal = ((j$.time.o.h) lVar).ordinal();
        return iOrdinal != 28 ? iOrdinal != 29 ? this.a.l(lVar) : this.f15923b.y() : u();
    }

    public Object n(n nVar) {
        int i2 = m.a;
        if (nVar == j$.time.o.c.a || nVar == j$.time.o.g.a) {
            return this.f15923b;
        }
        if (nVar == j$.time.o.d.a) {
            return null;
        }
        return nVar == j$.time.o.a.a ? this.a.C() : nVar == j$.time.o.f.a ? b() : nVar == j$.time.o.b.a ? j$.time.m.i.a : nVar == j$.time.o.e.a ? j$.time.o.i.NANOS : nVar.a(this);
    }

    public String toString() {
        return this.a.toString() + this.f15923b.toString();
    }

    public long u() {
        f fVar = this.a;
        k kVar = this.f15923b;
        Objects.requireNonNull(fVar);
        return a.j(fVar, kVar);
    }

    public f v() {
        return this.a;
    }
}