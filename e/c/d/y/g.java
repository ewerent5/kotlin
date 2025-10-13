package e.c.d.y;

import java.math.BigDecimal;

/* compiled from: LazilyParsedNumber.java */
/* loaded from: classes.dex */
public final class g extends Number {

    /* renamed from: e, reason: collision with root package name */
    private final String f15481e;

    public g(String str) {
        this.f15481e = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f15481e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        String str = this.f15481e;
        String str2 = ((g) obj).f15481e;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f15481e);
    }

    public int hashCode() {
        return this.f15481e.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f15481e);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.f15481e).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.f15481e);
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f15481e);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f15481e).longValue();
        }
    }

    public String toString() {
        return this.f15481e;
    }
}