package j$.time;

import ch.qos.logback.core.net.SyslogConstants;
import j$.time.o.m;
import j$.time.o.n;
import j$.time.o.p;
import j$.time.o.q;
import java.io.Serializable;
import java.util.Objects;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes2.dex */
public final class e implements j$.time.o.k, j$.time.m.b, Serializable {
    public static final e a = B(-999999999, 1, 1);

    /* renamed from: b, reason: collision with root package name */
    public static final e f15909b = B(999999999, 12, 31);

    /* renamed from: c, reason: collision with root package name */
    private final int f15910c;

    /* renamed from: d, reason: collision with root package name */
    private final short f15911d;

    /* renamed from: e, reason: collision with root package name */
    private final short f15912e;

    private e(int i2, int i3, int i4) {
        this.f15910c = i2;
        this.f15911d = (short) i3;
        this.f15912e = (short) i4;
    }

    public static e B(int i2, int i3, int i4) {
        long j2 = i2;
        j$.time.o.h.YEAR.x(j2);
        j$.time.o.h.MONTH_OF_YEAR.x(i3);
        j$.time.o.h.DAY_OF_MONTH.x(i4);
        int i5 = 28;
        if (i4 > 28) {
            if (i3 != 2) {
                i5 = (i3 == 4 || i3 == 6 || i3 == 9 || i3 == 11) ? 30 : 31;
            } else if (j$.time.m.i.a.h(j2)) {
                i5 = 29;
            }
            if (i4 > i5) {
                if (i4 == 29) {
                    throw new c("Invalid date 'February 29' as '" + i2 + "' is not a leap year");
                }
                StringBuilder sbA = j$.T0.a.a.a.a.a("Invalid date '");
                sbA.append(h.w(i3).name());
                sbA.append(" ");
                sbA.append(i4);
                sbA.append("'");
                throw new c(sbA.toString());
            }
        }
        return new e(i2, i3, i4);
    }

    public static e C(long j2) {
        long j3;
        long j4 = (j2 + 719528) - 60;
        if (j4 < 0) {
            long j5 = ((j4 + 1) / 146097) - 1;
            j3 = j5 * 400;
            j4 += (-j5) * 146097;
        } else {
            j3 = 0;
        }
        long j6 = ((j4 * 400) + 591) / 146097;
        long j7 = j4 - ((j6 / 400) + (((j6 / 4) + (j6 * 365)) - (j6 / 100)));
        if (j7 < 0) {
            j6--;
            j7 = j4 - ((j6 / 400) + (((j6 / 4) + (365 * j6)) - (j6 / 100)));
        }
        int i2 = (int) j7;
        int i3 = ((i2 * 5) + 2) / 153;
        return new e(j$.time.o.h.YEAR.w(j6 + j3 + (i3 / 10)), ((i3 + 2) % 12) + 1, (i2 - (((i3 * 306) + 5) / 10)) + 1);
    }

    public static e v(j$.time.o.k kVar) {
        Objects.requireNonNull(kVar, "temporal");
        int i2 = m.a;
        e eVar = (e) kVar.n(j$.time.o.a.a);
        if (eVar != null) {
            return eVar;
        }
        throw new c("Unable to obtain LocalDate from TemporalAccessor: " + kVar + " of type " + kVar.getClass().getName());
    }

    private int w(j$.time.o.l lVar) {
        switch (((j$.time.o.h) lVar).ordinal()) {
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                return x().t();
            case 16:
                return ((this.f15912e - 1) % 7) + 1;
            case 17:
                return ((y() - 1) % 7) + 1;
            case 18:
                return this.f15912e;
            case 19:
                return y();
            case 20:
                throw new p("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 21:
                return ((this.f15912e - 1) / 7) + 1;
            case 22:
                return ((y() - 1) / 7) + 1;
            case 23:
                return this.f15911d;
            case SyslogConstants.LOG_DAEMON /* 24 */:
                throw new p("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 25:
                int i2 = this.f15910c;
                return i2 >= 1 ? i2 : 1 - i2;
            case 26:
                return this.f15910c;
            case 27:
                return this.f15910c >= 1 ? 1 : 0;
            default:
                throw new p("Unsupported field: " + lVar);
        }
    }

    public boolean A() {
        return j$.time.m.i.a.h(this.f15910c);
    }

    public e D(long j2) {
        int i2;
        if (j2 == 0) {
            return this;
        }
        int iW = j$.time.o.h.YEAR.w(this.f15910c + j2);
        short s = this.f15911d;
        int iMin = this.f15912e;
        if (s != 2) {
            if (s == 4 || s == 6 || s == 9 || s == 11) {
                i2 = 30;
            }
            return new e(iW, s, iMin);
        }
        i2 = j$.time.m.i.a.h((long) iW) ? 29 : 28;
        iMin = Math.min(iMin, i2);
        return new e(iW, s, iMin);
    }

    public e E(int i2) {
        if (y() == i2) {
            return this;
        }
        int i3 = this.f15910c;
        long j2 = i3;
        j$.time.o.h.YEAR.x(j2);
        j$.time.o.h.DAY_OF_YEAR.x(i2);
        boolean zH = j$.time.m.i.a.h(j2);
        if (i2 == 366 && !zH) {
            throw new c("Invalid date 'DayOfYear 366' as '" + i3 + "' is not a leap year");
        }
        int i4 = 31;
        h hVarW = h.w(((i2 - 1) / 31) + 1);
        int iT = hVarW.t(zH);
        int iOrdinal = hVarW.ordinal();
        if (iOrdinal == 1) {
            i4 = zH ? 29 : 28;
        } else if (iOrdinal == 3 || iOrdinal == 5 || iOrdinal == 8 || iOrdinal == 10) {
            i4 = 30;
        }
        if (i2 > (iT + i4) - 1) {
            hVarW = hVarW.x(1L);
        }
        return new e(i3, hVarW.v(), (i2 - hVarW.t(zH)) + 1);
    }

    @Override // j$.time.m.b
    public j$.time.m.h a() {
        return j$.time.m.i.a;
    }

    @Override // j$.time.o.k
    public boolean d(j$.time.o.l lVar) {
        return lVar instanceof j$.time.o.h ? lVar.v() : lVar != null && lVar.n(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && t((e) obj) == 0;
    }

    @Override // j$.time.o.k
    public int h(j$.time.o.l lVar) {
        return lVar instanceof j$.time.o.h ? w(lVar) : a.f(this, lVar);
    }

    public int hashCode() {
        int i2 = this.f15910c;
        return (((i2 << 11) + (this.f15911d << 6)) + this.f15912e) ^ (i2 & (-2048));
    }

    @Override // j$.time.o.k
    public q j(j$.time.o.l lVar) {
        int i2;
        if (!(lVar instanceof j$.time.o.h)) {
            return lVar.t(this);
        }
        j$.time.o.h hVar = (j$.time.o.h) lVar;
        if (!hVar.v()) {
            throw new p("Unsupported field: " + lVar);
        }
        int iOrdinal = hVar.ordinal();
        if (iOrdinal == 18) {
            short s = this.f15911d;
            i2 = s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : A() ? 29 : 28;
        } else {
            if (iOrdinal != 19) {
                if (iOrdinal == 21) {
                    return q.i(1L, (h.w(this.f15911d) != h.FEBRUARY || A()) ? 5L : 4L);
                }
                if (iOrdinal != 25) {
                    return lVar.h();
                }
                return q.i(1L, this.f15910c <= 0 ? 1000000000L : 999999999L);
            }
            i2 = A() ? 366 : 365;
        }
        return q.i(1L, i2);
    }

    @Override // j$.time.o.k
    public long l(j$.time.o.l lVar) {
        return lVar instanceof j$.time.o.h ? lVar == j$.time.o.h.EPOCH_DAY ? m() : lVar == j$.time.o.h.PROLEPTIC_MONTH ? ((this.f15910c * 12) + this.f15911d) - 1 : w(lVar) : lVar.l(this);
    }

    @Override // j$.time.m.b
    public long m() {
        long j2;
        long j3 = this.f15910c;
        long j4 = this.f15911d;
        long j5 = (365 * j3) + 0;
        if (j3 >= 0) {
            j2 = ((j3 + 399) / 400) + (((3 + j3) / 4) - ((99 + j3) / 100)) + j5;
        } else {
            j2 = j5 - ((j3 / (-400)) + ((j3 / (-4)) - (j3 / (-100))));
        }
        long j6 = (((367 * j4) - 362) / 12) + j2 + (this.f15912e - 1);
        if (j4 > 2) {
            j6--;
            if (!A()) {
                j6--;
            }
        }
        return j6 - 719528;
    }

    @Override // j$.time.o.k
    public Object n(n nVar) {
        int i2 = m.a;
        if (nVar == j$.time.o.a.a) {
            return this;
        }
        if (nVar == j$.time.o.d.a || nVar == j$.time.o.g.a || nVar == j$.time.o.c.a || nVar == j$.time.o.f.a) {
            return null;
        }
        if (nVar != j$.time.o.b.a) {
            return nVar == j$.time.o.e.a ? j$.time.o.i.DAYS : nVar.a(this);
        }
        a();
        return j$.time.m.i.a;
    }

    @Override // java.lang.Comparable
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public int compareTo(j$.time.m.b bVar) {
        if (bVar instanceof e) {
            return t((e) bVar);
        }
        int iCompare = Long.compare(m(), bVar.m());
        if (iCompare != 0) {
            return iCompare;
        }
        a();
        return j$.time.m.i.a.compareTo(bVar.a());
    }

    int t(e eVar) {
        int i2 = this.f15910c - eVar.f15910c;
        if (i2 != 0) {
            return i2;
        }
        int i3 = this.f15911d - eVar.f15911d;
        return i3 == 0 ? this.f15912e - eVar.f15912e : i3;
    }

    public String toString() {
        int i2;
        int i3 = this.f15910c;
        short s = this.f15911d;
        short s2 = this.f15912e;
        int iAbs = Math.abs(i3);
        StringBuilder sb = new StringBuilder(10);
        if (iAbs < 1000) {
            if (i3 < 0) {
                sb.append(i3 - 10000);
                i2 = 1;
            } else {
                sb.append(i3 + 10000);
                i2 = 0;
            }
            sb.deleteCharAt(i2);
        } else {
            if (i3 > 9999) {
                sb.append('+');
            }
            sb.append(i3);
        }
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        sb.append(s2 >= 10 ? "-" : "-0");
        sb.append((int) s2);
        return sb.toString();
    }

    public d x() {
        return d.v(((int) a.B(m() + 3, 7)) + 1);
    }

    public int y() {
        return (h.w(this.f15911d).t(A()) + this.f15912e) - 1;
    }

    public int z() {
        return this.f15910c;
    }
}