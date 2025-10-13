package j$.time;

import ch.qos.logback.core.CoreConstants;
import j$.time.o.m;
import j$.time.o.n;
import j$.time.o.p;
import j$.time.o.q;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class Instant implements Comparable<Instant>, Serializable, Serializable {
    public static final Instant a = new Instant(0, 0);

    /* renamed from: b, reason: collision with root package name */
    private final long f15900b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15901c;

    static {
        z(-31557014167219200L, 0L);
        z(31556889864403199L, 999999999L);
    }

    private Instant(long j2, int i2) {
        this.f15900b = j2;
        this.f15901c = i2;
    }

    private static Instant v(long j2, int i2) {
        if ((i2 | j2) == 0) {
            return a;
        }
        if (j2 < -31557014167219200L || j2 > 31556889864403199L) {
            throw new c("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j2, i2);
    }

    public static Instant y(long j2) {
        long j3 = CoreConstants.MILLIS_IN_ONE_SECOND;
        return v(a.D(j2, j3), ((int) a.B(j2, j3)) * 1000000);
    }

    public static Instant z(long j2, long j3) {
        return v(a.z(j2, a.D(j3, 1000000000L)), (int) a.B(j3, 1000000000L));
    }

    @Override // java.lang.Comparable
    public int compareTo(Instant instant) {
        Instant instant2 = instant;
        int iCompare = Long.compare(this.f15900b, instant2.f15900b);
        return iCompare != 0 ? iCompare : this.f15901c - instant2.f15901c;
    }

    public boolean d(j$.time.o.l lVar) {
        return lVar instanceof j$.time.o.h ? lVar == j$.time.o.h.INSTANT_SECONDS || lVar == j$.time.o.h.NANO_OF_SECOND || lVar == j$.time.o.h.MICRO_OF_SECOND || lVar == j$.time.o.h.MILLI_OF_SECOND : lVar != null && lVar.n(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        return this.f15900b == instant.f15900b && this.f15901c == instant.f15901c;
    }

    public int h(j$.time.o.l lVar) {
        if (!(lVar instanceof j$.time.o.h)) {
            return a.i(this, lVar).a(lVar.l(this), lVar);
        }
        int iOrdinal = ((j$.time.o.h) lVar).ordinal();
        if (iOrdinal == 0) {
            return this.f15901c;
        }
        if (iOrdinal == 2) {
            return this.f15901c / CoreConstants.MILLIS_IN_ONE_SECOND;
        }
        if (iOrdinal == 4) {
            return this.f15901c / 1000000;
        }
        if (iOrdinal == 28) {
            j$.time.o.h.INSTANT_SECONDS.w(this.f15900b);
        }
        throw new p("Unsupported field: " + lVar);
    }

    public int hashCode() {
        long j2 = this.f15900b;
        return (this.f15901c * 51) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public q j(j$.time.o.l lVar) {
        return a.i(this, lVar);
    }

    public long l(j$.time.o.l lVar) {
        int i2;
        if (!(lVar instanceof j$.time.o.h)) {
            return lVar.l(this);
        }
        int iOrdinal = ((j$.time.o.h) lVar).ordinal();
        if (iOrdinal == 0) {
            i2 = this.f15901c;
        } else if (iOrdinal == 2) {
            i2 = this.f15901c / CoreConstants.MILLIS_IN_ONE_SECOND;
        } else {
            if (iOrdinal != 4) {
                if (iOrdinal == 28) {
                    return this.f15900b;
                }
                throw new p("Unsupported field: " + lVar);
            }
            i2 = this.f15901c / 1000000;
        }
        return i2;
    }

    public Object n(n nVar) {
        int i2 = m.a;
        if (nVar == j$.time.o.e.a) {
            return j$.time.o.i.NANOS;
        }
        if (nVar == j$.time.o.b.a || nVar == j$.time.o.d.a || nVar == j$.time.o.g.a || nVar == j$.time.o.c.a || nVar == j$.time.o.a.a || nVar == j$.time.o.f.a) {
            return null;
        }
        return nVar.a(this);
    }

    public int t(Instant instant) {
        int iCompare = Long.compare(this.f15900b, instant.f15900b);
        return iCompare != 0 ? iCompare : this.f15901c - instant.f15901c;
    }

    public long toEpochMilli() {
        long jC;
        long j2;
        long j3 = this.f15900b;
        if (j3 >= 0 || this.f15901c <= 0) {
            jC = a.C(j3, CoreConstants.MILLIS_IN_ONE_SECOND);
            j2 = this.f15901c / 1000000;
        } else {
            jC = a.C(j3 + 1, CoreConstants.MILLIS_IN_ONE_SECOND);
            j2 = (this.f15901c / 1000000) - CoreConstants.MILLIS_IN_ONE_SECOND;
        }
        return a.z(jC, j2);
    }

    public String toString() {
        return j$.time.n.b.a.a(this);
    }

    public long w() {
        return this.f15900b;
    }

    public int x() {
        return this.f15901c;
    }
}