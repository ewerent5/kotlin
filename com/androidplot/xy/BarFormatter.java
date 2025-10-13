package com.androidplot.xy;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import com.androidplot.ui.SeriesRenderer;

/* loaded from: classes.dex */
public class BarFormatter extends LineAndPointFormatter {
    private Paint borderPaint;
    private Paint fillPaint;
    private float marginBottom;
    private float marginLeft;
    private float marginRight;
    private float marginTop;

    public BarFormatter() {
        Paint paint = new Paint();
        this.fillPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.fillPaint.setAlpha(100);
        Paint paint2 = new Paint();
        this.borderPaint = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.borderPaint.setAlpha(100);
    }

    public Paint getBorderPaint() {
        return this.borderPaint;
    }

    @Override // com.androidplot.xy.LineAndPointFormatter
    public Paint getFillPaint() {
        return this.fillPaint;
    }

    public float getMarginBottom() {
        return this.marginBottom;
    }

    public float getMarginLeft() {
        return this.marginLeft;
    }

    public float getMarginRight() {
        return this.marginRight;
    }

    public float getMarginTop() {
        return this.marginTop;
    }

    @Override // com.androidplot.xy.LineAndPointFormatter, com.androidplot.ui.Formatter
    public Class<? extends SeriesRenderer> getRendererClass() {
        return BarRenderer.class;
    }

    public void setBorderPaint(Paint paint) {
        this.borderPaint = paint;
    }

    @Override // com.androidplot.xy.LineAndPointFormatter
    public void setFillPaint(Paint paint) {
        this.fillPaint = paint;
    }

    public void setMarginBottom(float f2) {
        this.marginBottom = f2;
    }

    public void setMarginLeft(float f2) {
        this.marginLeft = f2;
    }

    public void setMarginRight(float f2) {
        this.marginRight = f2;
    }

    public void setMarginTop(float f2) {
        this.marginTop = f2;
    }

    @Override // com.androidplot.xy.LineAndPointFormatter, com.androidplot.ui.Formatter
    public SeriesRenderer doGetRendererInstance(XYPlot xYPlot) {
        return new BarRenderer(xYPlot);
    }

    public BarFormatter(int i2, int i3) {
        this();
        this.fillPaint.setColor(i2);
        this.borderPaint.setColor(i3);
    }

    public BarFormatter(Context context, int i2) throws Resources.NotFoundException {
        this();
        configure(context, i2);
    }
}