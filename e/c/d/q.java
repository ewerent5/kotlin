package e.c.d;

import java.math.BigInteger;

/* compiled from: JsonPrimitive.java */
/* loaded from: classes.dex */
public final class q extends l {
    private final Object a;

    public q(Boolean bool) {
        this.a = e.c.d.y.a.b(bool);
    }

    private static boolean w(q qVar) {
        Object obj = qVar.a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.a == null) {
            return qVar.a == null;
        }
        if (w(this) && w(qVar)) {
            return t().longValue() == qVar.t().longValue();
        }
        Object obj2 = this.a;
        if (!(obj2 instanceof Number) || !(qVar.a instanceof Number)) {
            return obj2.equals(qVar.a);
        }
        double dDoubleValue = t().doubleValue();
        double dDoubleValue2 = qVar.t().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    @Override // e.c.d.l
    public String f() {
        return x() ? t().toString() : u() ? ((Boolean) this.a).toString() : (String) this.a;
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.a == null) {
            return 31;
        }
        if (w(this)) {
            jDoubleToLongBits = t().longValue();
        } else {
            Object obj = this.a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(t().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    public boolean n() {
        return u() ? ((Boolean) this.a).booleanValue() : Boolean.parseBoolean(f());
    }

    public double o() {
        return x() ? t().doubleValue() : Double.parseDouble(f());
    }

    public int p() {
        return x() ? t().intValue() : Integer.parseInt(f());
    }

    public long r() {
        return x() ? t().longValue() : Long.parseLong(f());
    }

    public Number t() {
        Object obj = this.a;
        return obj instanceof String ? new e.c.d.y.g((String) this.a) : (Number) obj;
    }

    public boolean u() {
        return this.a instanceof Boolean;
    }

    public boolean x() {
        return this.a instanceof Number;
    }

    public boolean y() {
        return this.a instanceof String;
    }

    public q(Number number) {
        this.a = e.c.d.y.a.b(number);
    }

    public q(String str) {
        this.a = e.c.d.y.a.b(str);
    }
}