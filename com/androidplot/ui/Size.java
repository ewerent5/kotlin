package com.androidplot.ui;

import android.graphics.RectF;

/* loaded from: classes.dex */
public class Size {
    public static Size FILL;
    private SizeMetric height;
    private SizeMetric width;

    static {
        SizeMode sizeMode = SizeMode.FILL;
        FILL = new Size(0.0f, sizeMode, 0.0f, sizeMode);
    }

    public Size(float f2, SizeMode sizeMode, float f3, SizeMode sizeMode2) {
        this.height = new SizeMetric(f2, sizeMode);
        this.width = new SizeMetric(f3, sizeMode2);
    }

    public SizeMetric getHeight() {
        return this.height;
    }

    public RectF getRectF(RectF rectF) {
        return new RectF(0.0f, 0.0f, this.width.getPixelValue(rectF.width()), this.height.getPixelValue(rectF.height()));
    }

    public SizeMetric getWidth() {
        return this.width;
    }

    public void setHeight(SizeMetric sizeMetric) {
        this.height = sizeMetric;
    }

    public void setWidth(SizeMetric sizeMetric) {
        this.width = sizeMetric;
    }

    public Size(SizeMetric sizeMetric, SizeMetric sizeMetric2) {
        this.height = sizeMetric;
        this.width = sizeMetric2;
    }
}