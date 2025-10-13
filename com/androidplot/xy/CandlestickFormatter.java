package com.androidplot.xy;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import com.androidplot.ui.SeriesRenderer;
import com.androidplot.util.PixelUtils;

/* loaded from: classes.dex */
public class CandlestickFormatter extends XYSeriesFormatter<XYRegionFormatter> {
    private BodyStyle bodyStyle;
    private float bodyWidth;
    private Paint fallingBodyFillPaint;
    private Paint fallingBodyStrokePaint;
    private Paint lowerCapPaint;
    private float lowerCapWidth;
    private Paint risingBodyFillPaint;
    private Paint risingBodyStrokePaint;
    private Paint upperCapPaint;
    private float upperCapWidth;
    private Paint wickPaint;
    private static final float DEFAULT_WIDTH_PIX = PixelUtils.dpToPix(10.0f);
    private static final float DEFAULT_STROKE_PIX = PixelUtils.dpToPix(4.0f);

    public enum BodyStyle {
        SQUARE,
        TRIANGULAR
    }

    public CandlestickFormatter(Context context, int i2) throws Resources.NotFoundException {
        this();
        configure(context, i2);
    }

    protected static Paint getDefaultFillPaint(int i2) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i2);
        return paint;
    }

    protected static Paint getDefaultStrokePaint(int i2) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(DEFAULT_STROKE_PIX);
        paint.setColor(i2);
        paint.setAntiAlias(true);
        return paint;
    }

    public BodyStyle getBodyStyle() {
        return this.bodyStyle;
    }

    public float getBodyWidth() {
        return this.bodyWidth;
    }

    public Paint getFallingBodyFillPaint() {
        return this.fallingBodyFillPaint;
    }

    public Paint getFallingBodyStrokePaint() {
        return this.fallingBodyStrokePaint;
    }

    public Paint getLowerCapPaint() {
        return this.lowerCapPaint;
    }

    public float getLowerCapWidth() {
        return this.lowerCapWidth;
    }

    @Override // com.androidplot.ui.Formatter
    public Class<? extends SeriesRenderer> getRendererClass() {
        return CandlestickRenderer.class;
    }

    public Paint getRisingBodyFillPaint() {
        return this.risingBodyFillPaint;
    }

    public Paint getRisingBodyStrokePaint() {
        return this.risingBodyStrokePaint;
    }

    public Paint getUpperCapPaint() {
        return this.upperCapPaint;
    }

    public float getUpperCapWidth() {
        return this.upperCapWidth;
    }

    public Paint getWickPaint() {
        return this.wickPaint;
    }

    public void setBodyStyle(BodyStyle bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public void setBodyWidth(float f2) {
        this.bodyWidth = f2;
    }

    public void setCapAndWickPaint(Paint paint) {
        setUpperCapPaint(paint);
        setLowerCapPaint(paint);
        setWickPaint(paint);
    }

    public void setFallingBodyFillPaint(Paint paint) {
        this.fallingBodyFillPaint = paint;
    }

    public void setFallingBodyStrokePaint(Paint paint) {
        this.fallingBodyStrokePaint = paint;
    }

    public void setLowerCapPaint(Paint paint) {
        this.lowerCapPaint = paint;
    }

    public void setLowerCapWidth(float f2) {
        this.lowerCapWidth = f2;
    }

    public void setRisingBodyFillPaint(Paint paint) {
        this.risingBodyFillPaint = paint;
    }

    public void setRisingBodyStrokePaint(Paint paint) {
        this.risingBodyStrokePaint = paint;
    }

    public void setUpperCapPaint(Paint paint) {
        this.upperCapPaint = paint;
    }

    public void setUpperCapWidth(float f2) {
        this.upperCapWidth = f2;
    }

    public void setWickPaint(Paint paint) {
        this.wickPaint = paint;
    }

    @Override // com.androidplot.ui.Formatter
    public SeriesRenderer doGetRendererInstance(XYPlot xYPlot) {
        return new CandlestickRenderer(xYPlot);
    }

    public CandlestickFormatter() {
        this(getDefaultStrokePaint(-256), getDefaultFillPaint(-16711936), getDefaultFillPaint(-65536), getDefaultStrokePaint(-16711936), getDefaultStrokePaint(-65536), getDefaultStrokePaint(-256), getDefaultStrokePaint(-256), BodyStyle.SQUARE);
    }

    public CandlestickFormatter(Paint paint, Paint paint2, Paint paint3, Paint paint4, Paint paint5, Paint paint6, Paint paint7, BodyStyle bodyStyle) {
        float f2 = DEFAULT_WIDTH_PIX;
        this.bodyWidth = f2;
        this.upperCapWidth = f2;
        this.lowerCapWidth = f2;
        setWickPaint(paint);
        setRisingBodyFillPaint(paint2);
        setFallingBodyFillPaint(paint3);
        setRisingBodyStrokePaint(paint4);
        setFallingBodyStrokePaint(paint5);
        setUpperCapPaint(paint6);
        setLowerCapPaint(paint7);
        setBodyStyle(bodyStyle);
    }
}