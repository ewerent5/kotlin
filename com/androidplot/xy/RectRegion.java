package com.androidplot.xy;

import android.graphics.PointF;
import android.graphics.RectF;
import ch.qos.logback.core.CoreConstants;
import com.androidplot.Region;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class RectRegion {
    private String label;
    Region xRegion;
    Region yRegion;

    public RectRegion() {
        this.xRegion = new Region();
        this.yRegion = new Region();
    }

    private static Number distanceBetween(Number number, Number number2) {
        return Double.valueOf(Math.abs(number.doubleValue() - number2.doubleValue()));
    }

    public static RectRegion withDefaults(RectRegion rectRegion) {
        if (rectRegion == null || !rectRegion.isFullyDefined()) {
            throw new IllegalArgumentException("When specifying defaults, RectRegion param must contain no null values.");
        }
        RectRegion rectRegion2 = new RectRegion();
        rectRegion2.xRegion = Region.withDefaults(rectRegion.getxRegion());
        rectRegion2.yRegion = Region.withDefaults(rectRegion.getyRegion());
        return rectRegion2;
    }

    public RectF asRectF() {
        return new RectF(getMinX().floatValue(), getMinY().floatValue(), getMaxX().floatValue(), getMaxY().floatValue());
    }

    public boolean contains(Number number, Number number2) {
        return getxRegion().contains(number) && getyRegion().contains(number2);
    }

    public Number getHeight() {
        return distanceBetween(getMinY(), getMaxY());
    }

    public String getLabel() {
        return this.label;
    }

    public Number getMaxX() {
        return this.xRegion.getMax();
    }

    public Number getMaxY() {
        return this.yRegion.getMax();
    }

    public Number getMinX() {
        return this.xRegion.getMin();
    }

    public Number getMinY() {
        return this.yRegion.getMin();
    }

    public Number getWidth() {
        return distanceBetween(getMinX(), getMaxX());
    }

    public Region getxRegion() {
        return this.xRegion;
    }

    public Region getyRegion() {
        return this.yRegion;
    }

    public void intersect(RectRegion rectRegion) {
        if (intersects(rectRegion)) {
            this.xRegion.intersect(rectRegion.xRegion);
            this.yRegion.intersect(rectRegion.yRegion);
        } else {
            setMinY(null);
            setMaxY(null);
            setMinX(null);
            setMaxX(null);
        }
    }

    public boolean intersects(RectRegion rectRegion) {
        return intersects(rectRegion.getMinX(), rectRegion.getMaxX(), rectRegion.getMinY(), rectRegion.getMaxY());
    }

    public boolean isFullyDefined() {
        return this.xRegion.isDefined() && this.yRegion.isDefined();
    }

    public boolean isMaxXSet() {
        return this.xRegion.isMaxSet();
    }

    public boolean isMaxYSet() {
        return this.yRegion.isMaxSet();
    }

    public boolean isMinXSet() {
        return this.xRegion.isMinSet();
    }

    public boolean isMinYSet() {
        return this.yRegion.isMinSet();
    }

    public void set(Number number, Number number2, Number number3, Number number4) {
        setMinX(number);
        setMaxX(number2);
        setMinY(number3);
        setMaxY(number4);
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public void setMaxX(Number number) {
        this.xRegion.setMax(number);
    }

    public void setMaxY(Number number) {
        this.yRegion.setMax(number);
    }

    public void setMinX(Number number) {
        this.xRegion.setMin(number);
    }

    public void setMinY(Number number) {
        this.yRegion.setMin(number);
    }

    public void setxRegion(Region region) {
        this.xRegion = region;
    }

    public void setyRegion(Region region) {
        this.yRegion = region;
    }

    public String toString() {
        return "RectRegion{xRegion=" + this.xRegion + ", yRegion=" + this.yRegion + ", label='" + this.label + CoreConstants.SINGLE_QUOTE_CHAR + CoreConstants.CURLY_RIGHT;
    }

    public XYCoords transform(Number number, Number number2, RectRegion rectRegion, boolean z, boolean z2) {
        return new XYCoords(this.xRegion.transform(number.doubleValue(), rectRegion.xRegion, z), this.yRegion.transform(number2.doubleValue(), rectRegion.yRegion, z2));
    }

    public PointF transformScreen(Number number, Number number2, RectF rectF) {
        return transform(number, number2, rectF, false, true);
    }

    public void union(Number number, Number number2) {
        this.xRegion.union(number);
        this.yRegion.union(number2);
    }

    public boolean intersects(Number number, Number number2, Number number3, Number number4) {
        return this.xRegion.intersects(number, number2) && this.yRegion.intersects(number3, number4);
    }

    public void transformScreen(PointF pointF, Number number, Number number2, RectF rectF) {
        transform(pointF, number, number2, rectF, false, true);
    }

    public List<RectRegion> intersects(List<RectRegion> list) {
        ArrayList arrayList = new ArrayList();
        for (RectRegion rectRegion : list) {
            if (rectRegion.intersects(getMinX(), getMaxX(), getMinY(), getMaxY())) {
                arrayList.add(rectRegion);
            }
        }
        return arrayList;
    }

    public PointF transformScreen(XYCoords xYCoords, RectF rectF) {
        return transform(xYCoords, rectF, false, true);
    }

    public void union(RectRegion rectRegion) {
        this.xRegion.union(rectRegion.xRegion);
        this.yRegion.union(rectRegion.yRegion);
    }

    public RectRegion(XYCoords xYCoords, XYCoords xYCoords2) {
        this(xYCoords.x, xYCoords2.x, xYCoords.y, xYCoords2.y);
    }

    public XYCoords transform(Number number, Number number2, RectRegion rectRegion) {
        return transform(number, number2, rectRegion, false, false);
    }

    public RectRegion(Number number, Number number2, Number number3, Number number4, String str) {
        this.xRegion = new Region(number, number2);
        this.yRegion = new Region(number3, number4);
        setLabel(str);
    }

    public XYCoords transform(XYCoords xYCoords, RectRegion rectRegion) {
        return transform(xYCoords.x, xYCoords.y, rectRegion);
    }

    public RectRegion transform(RectRegion rectRegion, RectRegion rectRegion2, boolean z, boolean z2) {
        return new RectRegion(transform(rectRegion.getMinX(), rectRegion.getMinY(), rectRegion2, z, z2), transform(rectRegion.getMaxX(), rectRegion.getMaxY(), rectRegion2, z, z2));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RectRegion(RectF rectF) {
        float f2 = rectF.left;
        float f3 = rectF.right;
        Float fValueOf = Float.valueOf(f2 >= f3 ? f3 : f2);
        float f4 = rectF.right;
        float f5 = rectF.left;
        Float fValueOf2 = Float.valueOf(f4 <= f5 ? f5 : f4);
        float f6 = rectF.bottom;
        float f7 = rectF.top;
        Float fValueOf3 = Float.valueOf(f6 >= f7 ? f7 : f6);
        float f8 = rectF.top;
        float f9 = rectF.bottom;
        this(fValueOf, fValueOf2, fValueOf3, Float.valueOf(f8 <= f9 ? f9 : f8));
    }

    public void transform(PointF pointF, Number number, Number number2, RectF rectF, boolean z, boolean z2) {
        pointF.x = (float) this.xRegion.transform(number.doubleValue(), rectF.left, rectF.right, z);
        pointF.y = (float) this.yRegion.transform(number2.doubleValue(), rectF.top, rectF.bottom, z2);
    }

    public PointF transform(Number number, Number number2, RectF rectF, boolean z, boolean z2) {
        PointF pointF = new PointF();
        transform(pointF, number, number2, rectF, z, z2);
        return pointF;
    }

    public PointF transform(XYCoords xYCoords, RectF rectF, boolean z, boolean z2) {
        return transform(xYCoords.x, xYCoords.y, rectF, z, z2);
    }

    public RectRegion(Number number, Number number2, Number number3, Number number4) {
        this(number, number2, number3, number4, null);
    }
}