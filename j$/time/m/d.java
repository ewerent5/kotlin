package j$.time.m;

import j$.time.m.b;
import j$.time.o.l;
import j$.time.o.n;
import j$.time.o.q;
import java.io.Serializable;

/* loaded from: classes2.dex */
final class d<D extends b> implements c<D>, Serializable, Serializable {
    @Override // j$.time.m.c
    public h a() {
        throw null;
    }

    @Override // j$.time.m.c
    public j$.time.g b() {
        return null;
    }

    @Override // j$.time.m.c
    public b c() {
        return null;
    }

    public boolean d(l lVar) {
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
        return (obj instanceof c) && j$.time.a.d(this, (c) obj) == 0;
    }

    public int h(l lVar) {
        if (!(lVar instanceof j$.time.o.h)) {
            return j(lVar).a(l(lVar), lVar);
        }
        ((j$.time.o.h) lVar).j();
        throw null;
    }

    public int hashCode() {
        throw null;
    }

    public q j(l lVar) {
        if (!(lVar instanceof j$.time.o.h)) {
            return lVar.t(this);
        }
        ((j$.time.o.h) lVar).j();
        throw null;
    }

    public long l(l lVar) {
        if (!(lVar instanceof j$.time.o.h)) {
            return lVar.l(this);
        }
        ((j$.time.o.h) lVar).j();
        throw null;
    }

    public /* synthetic */ Object n(n nVar) {
        return j$.time.a.g(this, nVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: p */
    public /* synthetic */ int compareTo(c cVar) {
        return j$.time.a.d(this, cVar);
    }

    public String toString() {
        throw null;
    }
}