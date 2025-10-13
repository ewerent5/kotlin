package com.androidplot.xy;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import com.androidplot.ui.SeriesRenderer;
import com.androidplot.util.PixelUtils;

/* loaded from: classes.dex */
public class BubbleFormatter extends XYSeriesFormatter<XYRegionFormatter> {
    private static final int DEFAULT_FILL_COLOR = -256;
    private static final int DEFAULT_STROKE_COLOR = -16777216;
    private static final float DEFAULT_STROKE_PIX = 1.0f;
    private Paint fillPaint;
    private Paint strokePaint;

    public BubbleFormatter() {
        Paint paint = new Paint();
        this.strokePaint = paint;
        paint.setAntiAlias(true);
        this.strokePaint.setStrokeWidth(PixelUtils.dpToPix(DEFAULT_STROKE_PIX));
        this.strokePaint.setStyle(Paint.Style.STROKE);
        this.strokePaint.setColor(DEFAULT_STROKE_COLOR);
        Paint paint2 = new Paint();
        this.fillPaint = paint2;
        paint2.setAntiAlias(true);
        this.fillPaint.setColor(DEFAULT_FILL_COLOR);
        setPointLabeler(new PointLabeler<BubbleSeries>() { // from class: com.androidplot.xy.BubbleFormatter.1
            @Override // com.androidplot.xy.PointLabeler
            public String getLabel(BubbleSeries bubbleSeries, int i2) {
                return String.valueOf(bubbleSeries.getZ(i2));
            }
        });
    }

    public Paint getFillPaint() {
        return this.fillPaint;
    }

    @Override // com.androidplot.ui.Formatter
    public Class<? extends SeriesRenderer> getRendererClass() {
        return BubbleRenderer.class;
    }

    public Paint getStrokePaint() {
        return this.strokePaint;
    }

    public void setFillPaint(Paint paint) {
        this.fillPaint = paint;
    }

    public void setStrokePaint(Paint paint) {
        this.strokePaint = paint;
    }

    @Override // com.androidplot.ui.Formatter
    public BubbleRenderer doGetRendererInstance(XYPlot xYPlot) {
        return new BubbleRenderer(xYPlot);
    }

    public BubbleFormatter(Context context, int i2) throws Resources.NotFoundException {
        this();
        configure(context, i2);
    }

    public BubbleFormatter(int i2, int i3) {
        Paint paint = new Paint();
        this.strokePaint = paint;
        paint.setAntiAlias(true);
        this.strokePaint.setStrokeWidth(PixelUtils.dpToPix(DEFAULT_STROKE_PIX));
        this.strokePaint.setStyle(Paint.Style.STROKE);
        this.strokePaint.setColor(DEFAULT_STROKE_COLOR);
        Paint paint2 = new Paint();
        this.fillPaint = paint2;
        paint2.setAntiAlias(true);
        this.fillPaint.setColor(DEFAULT_FILL_COLOR);
        setPointLabeler(new PointLabeler<BubbleSeries>() { // from class: com.androidplot.xy.BubbleFormatter.1
            @Override // com.androidplot.xy.PointLabeler
            public String getLabel(BubbleSeries bubbleSeries, int i22) {
                return String.valueOf(bubbleSeries.getZ(i22));
            }
        });
        this.fillPaint.setColor(i2);
        this.strokePaint.setColor(i3);
    }
}