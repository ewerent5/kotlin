package j$.time;

import j$.time.o.m;
import j$.time.o.n;
import j$.time.o.p;
import j$.time.o.q;

/* loaded from: classes2.dex */
public enum d implements j$.time.o.k {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    private static final d[] a = values();

    public static d v(int i2) {
        if (i2 >= 1 && i2 <= 7) {
            return a[i2 - 1];
        }
        throw new c("Invalid value for DayOfWeek: " + i2);
    }

    @Override // j$.time.o.k
    public boolean d(j$.time.o.l lVar) {
        return lVar instanceof j$.time.o.h ? lVar == j$.time.o.h.DAY_OF_WEEK : lVar != null && lVar.n(this);
    }

    @Override // j$.time.o.k
    public int h(j$.time.o.l lVar) {
        return lVar == j$.time.o.h.DAY_OF_WEEK ? t() : a.f(this, lVar);
    }

    @Override // j$.time.o.k
    public q j(j$.time.o.l lVar) {
        return lVar == j$.time.o.h.DAY_OF_WEEK ? lVar.h() : a.i(this, lVar);
    }

    @Override // j$.time.o.k
    public long l(j$.time.o.l lVar) {
        if (lVar == j$.time.o.h.DAY_OF_WEEK) {
            return t();
        }
        if (!(lVar instanceof j$.time.o.h)) {
            return lVar.l(this);
        }
        throw new p("Unsupported field: " + lVar);
    }

    @Override // j$.time.o.k
    public Object n(n nVar) {
        int i2 = m.a;
        return nVar == j$.time.o.e.a ? j$.time.o.i.DAYS : a.h(this, nVar);
    }

    public int t() {
        return ordinal() + 1;
    }
}