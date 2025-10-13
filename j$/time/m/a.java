package j$.time.m;

import j$.time.Instant;
import j$.time.j;
import j$.time.o.k;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class a implements h {
    static {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        new Locale("ja", "JP", "JP");
    }

    protected a() {
    }

    @Override // java.lang.Comparable
    /* renamed from: e */
    public int compareTo(h hVar) {
        return "ISO".compareTo(hVar.g());
    }

    @Override // j$.time.m.h
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && compareTo((a) obj) == 0;
    }

    public int hashCode() {
        return getClass().hashCode() ^ 72805;
    }

    @Override // j$.time.m.h
    public c o(k kVar) {
        try {
            return j$.time.f.z(j$.time.e.v(kVar), j$.time.g.v(kVar));
        } catch (j$.time.c e2) {
            StringBuilder sbA = j$.T0.a.a.a.a.a("Unable to obtain ChronoLocalDateTime from TemporalAccessor: ");
            sbA.append(kVar.getClass());
            throw new j$.time.c(sbA.toString(), e2);
        }
    }

    @Override // j$.time.m.h
    public f r(Instant instant, j jVar) {
        return g.t(this, instant, jVar);
    }

    public String toString() {
        return "ISO";
    }
}