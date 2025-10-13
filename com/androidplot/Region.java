package com.androidplot;

import ch.qos.logback.core.CoreConstants;
import com.androidplot.util.FastNumber;
import java.util.Objects;

/* loaded from: classes.dex */
public class Region {
    private FastNumber cachedLength;
    private Region defaults = this;
    private FastNumber max;
    private FastNumber min;

    public Region() {
    }

    public static Number measure(Number number, Number number2) {
        return new Region(number, number2).length();
    }

    public static Region withDefaults(Region region) {
        if (region == null || !region.isDefined()) {
            throw new IllegalArgumentException("When specifying default min and max must both be non-null values");
        }
        Region region2 = new Region();
        region2.defaults = region;
        return region2;
    }

    public Number center() {
        return Double.valueOf(getMax().doubleValue() - (length().doubleValue() / 2.0d));
    }

    public boolean contains(Number number) {
        return number.doubleValue() >= getMin().doubleValue() && number.doubleValue() <= getMax().doubleValue();
    }

    public Number getMax() {
        return isMaxSet() ? this.max : this.defaults.max;
    }

    public Number getMin() {
        return isMinSet() ? this.min : this.defaults.min;
    }

    public void intersect(Region region) {
        if (getMin().doubleValue() < region.getMin().doubleValue()) {
            setMin(region.getMin());
        }
        if (getMax().doubleValue() > region.getMax().doubleValue()) {
            setMax(region.getMax());
        }
    }

    public boolean intersects(Region region) {
        return intersects(region.getMin(), region.getMax());
    }

    public boolean isDefined() {
        return (this.min == null || this.max == null) ? false : true;
    }

    public boolean isMaxSet() {
        return this.max != null;
    }

    public boolean isMinSet() {
        return this.min != null;
    }

    public Number length() {
        if (this.cachedLength == null) {
            Double dValueOf = (getMax() == null || getMin() == null) ? null : Double.valueOf(getMax().doubleValue() - getMin().doubleValue());
            if (dValueOf != null) {
                this.cachedLength = FastNumber.orNull(dValueOf);
            }
        }
        return this.cachedLength;
    }

    public Number ratio(Region region) {
        return Double.valueOf(ratio(region.getMin().doubleValue(), region.getMax().doubleValue()));
    }

    public void setMax(Number number) {
        this.cachedLength = null;
        if (number == null) {
            Objects.requireNonNull(this.defaults, "Region values can never be null unless defaults have been set.");
            this.max = null;
            return;
        }
        FastNumber fastNumber = this.max;
        if (fastNumber == null || !fastNumber.equals(number)) {
            this.max = FastNumber.orNull(number);
        }
    }

    public void setMin(Number number) {
        this.cachedLength = null;
        if (number == null) {
            Objects.requireNonNull(this.defaults, "Region values cannot be null unless defaults have been set.");
            this.min = null;
            return;
        }
        FastNumber fastNumber = this.min;
        if (fastNumber == null || !fastNumber.equals(number)) {
            this.min = FastNumber.orNull(number);
        }
    }

    public void setMinMax(Region region) {
        setMin(region.getMin());
        setMax(region.getMax());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Region{");
        sb.append("min=");
        sb.append(this.min);
        sb.append(", max=");
        sb.append(this.max);
        sb.append(", cachedLength=");
        sb.append(this.cachedLength);
        sb.append(", defaults=");
        Region region = this.defaults;
        if (region != this) {
            sb.append(region);
        } else {
            sb.append("this");
        }
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }

    public Number transform(double d2, Region region) {
        return transform(d2, region, false);
    }

    public void union(Number number) {
        if (number == null) {
            return;
        }
        double dDoubleValue = number.doubleValue();
        if (getMin() == null || dDoubleValue < getMin().doubleValue()) {
            setMin(number);
        }
        if (getMax() == null || dDoubleValue > getMax().doubleValue()) {
            setMax(number);
        }
    }

    public boolean intersects(Number number, Number number2) {
        return (number.doubleValue() <= getMin().doubleValue() && number2.doubleValue() >= getMax().doubleValue()) || contains(number) || contains(number2);
    }

    public double ratio(double d2, double d3) {
        return length().doubleValue() / (d3 - d2);
    }

    public Number transform(double d2, Region region, boolean z) {
        return Double.valueOf(transform(d2, region.getMin().doubleValue(), region.getMax().doubleValue(), z));
    }

    public Region(Number number, Number number2) {
        if (number != null && number2 != null && number.doubleValue() < number2.doubleValue()) {
            setMin(number);
            setMax(number2);
        } else {
            setMin(number2);
            setMax(number);
        }
    }

    public double transform(double d2, double d3, double d4, boolean z) {
        double dDoubleValue = (d4 - d3) / length().doubleValue();
        if (!z) {
            return d3 + (dDoubleValue * (d2 - getMin().doubleValue()));
        }
        return d4 - (dDoubleValue * (d2 - getMin().doubleValue()));
    }

    public void union(Region region) {
        union(region.getMin());
        union(region.getMax());
    }
}