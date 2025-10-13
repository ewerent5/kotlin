package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class p {
    private static final p a = new p();

    /* renamed from: b, reason: collision with root package name */
    private final boolean f16084b;

    /* renamed from: c, reason: collision with root package name */
    private final double f16085c;

    private p() {
        this.f16084b = false;
        this.f16085c = Double.NaN;
    }

    private p(double d2) {
        this.f16084b = true;
        this.f16085c = d2;
    }

    public static p a() {
        return a;
    }

    public static p d(double d2) {
        return new p(d2);
    }

    public double b() {
        if (this.f16084b) {
            return this.f16085c;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean c() {
        return this.f16084b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        boolean z = this.f16084b;
        if (z && pVar.f16084b) {
            if (Double.compare(this.f16085c, pVar.f16085c) == 0) {
                return true;
            }
        } else if (z == pVar.f16084b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (!this.f16084b) {
            return 0;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.f16085c);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public String toString() {
        return this.f16084b ? String.format("OptionalDouble[%s]", Double.valueOf(this.f16085c)) : "OptionalDouble.empty";
    }
}