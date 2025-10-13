package j$.time;

import ch.qos.logback.core.CoreConstants;
import j$.time.o.m;
import j$.time.o.n;
import j$.time.o.p;
import j$.time.o.q;
import java.io.Serializable;
import java.util.Objects;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes2.dex */
public final class g implements Comparable<g>, Serializable, Serializable {
    public static final g a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f15916b;

    /* renamed from: c, reason: collision with root package name */
    private static final g[] f15917c = new g[24];

    /* renamed from: d, reason: collision with root package name */
    private final byte f15918d;

    /* renamed from: e, reason: collision with root package name */
    private final byte f15919e;

    /* renamed from: f, reason: collision with root package name */
    private final byte f15920f;

    /* renamed from: g, reason: collision with root package name */
    private final int f15921g;

    static {
        int i2 = 0;
        while (true) {
            g[] gVarArr = f15917c;
            if (i2 >= gVarArr.length) {
                g gVar = gVarArr[0];
                g gVar2 = gVarArr[12];
                a = gVarArr[0];
                f15916b = new g(23, 59, 59, 999999999);
                return;
            }
            gVarArr[i2] = new g(i2, 0, 0, 0);
            i2++;
        }
    }

    private g(int i2, int i3, int i4, int i5) {
        this.f15918d = (byte) i2;
        this.f15919e = (byte) i3;
        this.f15920f = (byte) i4;
        this.f15921g = i5;
    }

    public static g A(long j2) {
        j$.time.o.h.NANO_OF_DAY.x(j2);
        int i2 = (int) (j2 / 3600000000000L);
        long j3 = j2 - (i2 * 3600000000000L);
        int i3 = (int) (j3 / 60000000000L);
        long j4 = j3 - (i3 * 60000000000L);
        int i4 = (int) (j4 / 1000000000);
        int i5 = (int) (j4 - (i4 * 1000000000));
        return ((i3 | i4) | i5) == 0 ? f15917c[i2] : new g(i2, i3, i4, i5);
    }

    public static g v(j$.time.o.k kVar) {
        Objects.requireNonNull(kVar, "temporal");
        int i2 = m.a;
        g gVar = (g) kVar.n(j$.time.o.f.a);
        if (gVar != null) {
            return gVar;
        }
        throw new c("Unable to obtain LocalTime from TemporalAccessor: " + kVar + " of type " + kVar.getClass().getName());
    }

    private int w(j$.time.o.l lVar) {
        switch (((j$.time.o.h) lVar).ordinal()) {
            case 0:
                return this.f15921g;
            case 1:
                throw new p("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 2:
                return this.f15921g / CoreConstants.MILLIS_IN_ONE_SECOND;
            case 3:
                throw new p("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 4:
                return this.f15921g / 1000000;
            case 5:
                return (int) (B() / 1000000);
            case 6:
                return this.f15920f;
            case 7:
                return C();
            case 8:
                return this.f15919e;
            case 9:
                return (this.f15918d * 60) + this.f15919e;
            case 10:
                return this.f15918d % 12;
            case 11:
                int i2 = this.f15918d % 12;
                if (i2 % 12 == 0) {
                    return 12;
                }
                return i2;
            case 12:
                return this.f15918d;
            case 13:
                byte b2 = this.f15918d;
                if (b2 == 0) {
                    return 24;
                }
                return b2;
            case 14:
                return this.f15918d / 12;
            default:
                throw new p("Unsupported field: " + lVar);
        }
    }

    public static g z(int i2, int i3) {
        j$.time.o.h.HOUR_OF_DAY.x(i2);
        if (i3 == 0) {
            return f15917c[i2];
        }
        j$.time.o.h.MINUTE_OF_HOUR.x(i3);
        return new g(i2, i3, 0, 0);
    }

    public long B() {
        return (this.f15920f * 1000000000) + (this.f15919e * 60000000000L) + (this.f15918d * 3600000000000L) + this.f15921g;
    }

    public int C() {
        return (this.f15919e * 60) + (this.f15918d * 3600) + this.f15920f;
    }

    public boolean d(j$.time.o.l lVar) {
        return lVar instanceof j$.time.o.h ? lVar.j() : lVar != null && lVar.n(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f15918d == gVar.f15918d && this.f15919e == gVar.f15919e && this.f15920f == gVar.f15920f && this.f15921g == gVar.f15921g;
    }

    public int h(j$.time.o.l lVar) {
        return lVar instanceof j$.time.o.h ? w(lVar) : a.f(this, lVar);
    }

    public int hashCode() {
        long jB = B();
        return (int) (jB ^ (jB >>> 32));
    }

    public q j(j$.time.o.l lVar) {
        return a.i(this, lVar);
    }

    public long l(j$.time.o.l lVar) {
        return lVar instanceof j$.time.o.h ? lVar == j$.time.o.h.NANO_OF_DAY ? B() : lVar == j$.time.o.h.MICRO_OF_DAY ? B() / 1000 : w(lVar) : lVar.l(this);
    }

    public Object n(n nVar) {
        int i2 = m.a;
        if (nVar == j$.time.o.b.a || nVar == j$.time.o.d.a || nVar == j$.time.o.g.a || nVar == j$.time.o.c.a) {
            return null;
        }
        if (nVar == j$.time.o.f.a) {
            return this;
        }
        if (nVar == j$.time.o.a.a) {
            return null;
        }
        return nVar == j$.time.o.e.a ? j$.time.o.i.NANOS : nVar.a(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public int compareTo(g gVar) {
        int iCompare = Integer.compare(this.f15918d, gVar.f15918d);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Integer.compare(this.f15919e, gVar.f15919e);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Integer.compare(this.f15920f, gVar.f15920f);
        return iCompare3 == 0 ? Integer.compare(this.f15921g, gVar.f15921g) : iCompare3;
    }

    public String toString() {
        int i2;
        StringBuilder sb = new StringBuilder(18);
        byte b2 = this.f15918d;
        byte b3 = this.f15919e;
        byte b4 = this.f15920f;
        int i3 = this.f15921g;
        sb.append(b2 < 10 ? "0" : "");
        sb.append((int) b2);
        sb.append(b3 < 10 ? ":0" : ":");
        sb.append((int) b3);
        if (b4 > 0 || i3 > 0) {
            sb.append(b4 >= 10 ? ":" : ":0");
            sb.append((int) b4);
            if (i3 > 0) {
                sb.append(CoreConstants.DOT);
                int i4 = 1000000;
                if (i3 % 1000000 == 0) {
                    i2 = (i3 / 1000000) + CoreConstants.MILLIS_IN_ONE_SECOND;
                } else {
                    if (i3 % CoreConstants.MILLIS_IN_ONE_SECOND == 0) {
                        i3 /= CoreConstants.MILLIS_IN_ONE_SECOND;
                    } else {
                        i4 = Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
                    }
                    i2 = i3 + i4;
                }
                sb.append(Integer.toString(i2).substring(1));
            }
        }
        return sb.toString();
    }

    public int x() {
        return this.f15921g;
    }

    public int y() {
        return this.f15920f;
    }
}