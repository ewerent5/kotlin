package com.androidplot.xy;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public class XYConstraints {
    private XYFramingModel domainFramingModel;
    private BoundaryMode domainLowerBoundaryMode;
    private BoundaryMode domainUpperBoundaryMode;
    private Number maxX;
    private Number maxY;
    private Number minX;
    private Number minY;
    private XYFramingModel rangeFramingModel;
    private BoundaryMode rangeLowerBoundaryMode;
    private BoundaryMode rangeUpperBoundaryMode;

    public XYConstraints() {
        this(null, null, null, null);
    }

    public boolean contains(RectRegion rectRegion) {
        return contains(rectRegion.getMinY(), rectRegion.getMinY()) && contains(rectRegion.getMaxX(), rectRegion.getMaxY());
    }

    public XYFramingModel getDomainFramingModel() {
        return this.domainFramingModel;
    }

    public BoundaryMode getDomainLowerBoundaryMode() {
        return this.domainLowerBoundaryMode;
    }

    public BoundaryMode getDomainUpperBoundaryMode() {
        return this.domainUpperBoundaryMode;
    }

    public Number getMaxX() {
        return this.maxX;
    }

    public Number getMaxY() {
        return this.maxY;
    }

    public Number getMinX() {
        return this.minX;
    }

    public Number getMinY() {
        return this.minY;
    }

    public XYFramingModel getRangeFramingModel() {
        return this.rangeFramingModel;
    }

    public BoundaryMode getRangeLowerBoundaryMode() {
        return this.rangeLowerBoundaryMode;
    }

    public BoundaryMode getRangeUpperBoundaryMode() {
        return this.rangeUpperBoundaryMode;
    }

    public void setDomainFramingModel(XYFramingModel xYFramingModel) {
        this.domainFramingModel = xYFramingModel;
    }

    public void setDomainLowerBoundaryMode(BoundaryMode boundaryMode) {
        this.domainLowerBoundaryMode = boundaryMode;
    }

    public void setDomainUpperBoundaryMode(BoundaryMode boundaryMode) {
        this.domainUpperBoundaryMode = boundaryMode;
    }

    public void setMaxX(Number number) {
        this.maxX = number;
    }

    public void setMaxY(Number number) {
        this.maxY = number;
    }

    public void setMinX(Number number) {
        this.minX = number;
    }

    public void setMinY(Number number) {
        this.minY = number;
    }

    public void setRangeFramingModel(XYFramingModel xYFramingModel) {
        this.rangeFramingModel = xYFramingModel;
    }

    public void setRangeLowerBoundaryMode(BoundaryMode boundaryMode) {
        this.rangeLowerBoundaryMode = boundaryMode;
    }

    public void setRangeUpperBoundaryMode(BoundaryMode boundaryMode) {
        this.rangeUpperBoundaryMode = boundaryMode;
    }

    public String toString() {
        return "XYConstraints{domainFramingModel=" + this.domainFramingModel + ", rangeFramingModel=" + this.rangeFramingModel + ", domainUpperBoundaryMode=" + this.domainUpperBoundaryMode + ", domainLowerBoundaryMode=" + this.domainLowerBoundaryMode + ", rangeUpperBoundaryMode=" + this.rangeUpperBoundaryMode + ", rangeLowerBoundaryMode=" + this.rangeLowerBoundaryMode + ", minX=" + this.minX + ", maxX=" + this.maxX + ", minY=" + this.minY + ", maxY=" + this.maxY + CoreConstants.CURLY_RIGHT;
    }

    public XYConstraints(Number number, Number number2, Number number3, Number number4) {
        XYFramingModel xYFramingModel = XYFramingModel.EDGE;
        this.domainFramingModel = xYFramingModel;
        this.rangeFramingModel = xYFramingModel;
        BoundaryMode boundaryMode = BoundaryMode.AUTO;
        this.domainUpperBoundaryMode = boundaryMode;
        this.domainLowerBoundaryMode = boundaryMode;
        this.rangeUpperBoundaryMode = boundaryMode;
        this.rangeLowerBoundaryMode = boundaryMode;
        this.minX = number;
        this.minY = number3;
        this.maxX = number2;
        this.maxY = number4;
    }

    public boolean contains(Number number, Number number2) {
        if (number == null || number2 == null) {
            return false;
        }
        if (this.minX == null && this.maxX == null && this.minY == null && this.maxY == null) {
            return true;
        }
        double dDoubleValue = number.doubleValue();
        Number number3 = this.minX;
        if (number3 != null && dDoubleValue < number3.doubleValue()) {
            return false;
        }
        Number number4 = this.maxX;
        if (number4 != null && dDoubleValue > number4.doubleValue()) {
            return false;
        }
        double dDoubleValue2 = number2.doubleValue();
        Number number5 = this.minY;
        if (number5 != null && dDoubleValue2 < number5.doubleValue()) {
            return false;
        }
        Number number6 = this.maxY;
        return number6 == null || dDoubleValue2 <= number6.doubleValue();
    }
}