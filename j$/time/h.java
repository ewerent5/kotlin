package j$.time;

import ch.qos.logback.core.net.SyslogConstants;
import j$.time.o.m;
import j$.time.o.n;
import j$.time.o.p;
import j$.time.o.q;

/* loaded from: classes2.dex */
public enum h implements j$.time.o.k {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    private static final h[] a = values();

    public static h w(int i2) {
        if (i2 >= 1 && i2 <= 12) {
            return a[i2 - 1];
        }
        throw new c("Invalid value for MonthOfYear: " + i2);
    }

    @Override // j$.time.o.k
    public boolean d(j$.time.o.l lVar) {
        return lVar instanceof j$.time.o.h ? lVar == j$.time.o.h.MONTH_OF_YEAR : lVar != null && lVar.n(this);
    }

    @Override // j$.time.o.k
    public int h(j$.time.o.l lVar) {
        return lVar == j$.time.o.h.MONTH_OF_YEAR ? v() : a.f(this, lVar);
    }

    @Override // j$.time.o.k
    public q j(j$.time.o.l lVar) {
        return lVar == j$.time.o.h.MONTH_OF_YEAR ? lVar.h() : a.i(this, lVar);
    }

    @Override // j$.time.o.k
    public long l(j$.time.o.l lVar) {
        if (lVar == j$.time.o.h.MONTH_OF_YEAR) {
            return v();
        }
        if (!(lVar instanceof j$.time.o.h)) {
            return lVar.l(this);
        }
        throw new p("Unsupported field: " + lVar);
    }

    @Override // j$.time.o.k
    public Object n(n nVar) {
        int i2 = m.a;
        return nVar == j$.time.o.b.a ? j$.time.m.i.a : nVar == j$.time.o.e.a ? j$.time.o.i.MONTHS : a.h(this, nVar);
    }

    public int t(boolean z) {
        int i2;
        switch (this) {
            case JANUARY:
                return 1;
            case FEBRUARY:
                return 32;
            case MARCH:
                i2 = 60;
                break;
            case APRIL:
                i2 = 91;
                break;
            case MAY:
                i2 = 121;
                break;
            case JUNE:
                i2 = SyslogConstants.LOG_LOCAL3;
                break;
            case JULY:
                i2 = 182;
                break;
            case AUGUST:
                i2 = 213;
                break;
            case SEPTEMBER:
                i2 = 244;
                break;
            case OCTOBER:
                i2 = 274;
                break;
            case NOVEMBER:
                i2 = 305;
                break;
            default:
                i2 = 335;
                break;
        }
        return (z ? 1 : 0) + i2;
    }

    public int v() {
        return ordinal() + 1;
    }

    public h x(long j2) {
        return a[((((int) (j2 % 12)) + 12) + ordinal()) % 12];
    }
}