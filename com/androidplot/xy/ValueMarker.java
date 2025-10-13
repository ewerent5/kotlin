package com.androidplot.xy;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.androidplot.ui.PositionMetric;
import com.androidplot.ui.TextOrientation;
import com.androidplot.util.FontUtils;

/* loaded from: classes.dex */
public abstract class ValueMarker<PositionMetricType extends PositionMetric> {
    private static final int MARKER_LABEL_SPACING = 2;
    private Paint linePaint;
    private String text;
    private int textMargin;
    private TextOrientation textOrientation;
    private Paint textPaint;
    private PositionMetricType textPosition;
    private Number value;

    public ValueMarker(Number number, String str, PositionMetricType positionmetrictype) {
        this.textMargin = 2;
        Paint paint = new Paint();
        this.linePaint = paint;
        paint.setColor(-65536);
        this.linePaint.setAntiAlias(true);
        this.linePaint.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.textPaint = paint2;
        paint2.setAntiAlias(true);
        this.textPaint.setColor(-65536);
        this.value = number;
        this.textPosition = positionmetrictype;
        this.text = str;
    }

    public abstract void draw(Canvas canvas, XYPlot xYPlot, RectF rectF);

    protected void drawMarkerText(Canvas canvas, String str, RectF rectF, float f2, float f3) {
        if (getText() != null) {
            RectF rectF2 = new RectF(FontUtils.getStringDimensions(str, getTextPaint()));
            rectF2.offsetTo(f2 + 2.0f, (f3 - 2.0f) - rectF2.height());
            float f4 = rectF2.right;
            float f5 = rectF.right;
            if (f4 > f5) {
                rectF2.offset(-(f4 - f5), 0.0f);
            }
            float f6 = rectF2.top;
            float f7 = rectF.top;
            if (f6 < f7) {
                rectF2.offset(0.0f, f7 - f6);
            }
            canvas.drawText(str, rectF2.left, rectF2.bottom, getTextPaint());
        }
    }

    public Paint getLinePaint() {
        return this.linePaint;
    }

    public String getText() {
        return this.text;
    }

    public int getTextMargin() {
        return this.textMargin;
    }

    public TextOrientation getTextOrientation() {
        return this.textOrientation;
    }

    public Paint getTextPaint() {
        return this.textPaint;
    }

    public PositionMetricType getTextPosition() {
        return this.textPosition;
    }

    public Number getValue() {
        return this.value;
    }

    public void setLinePaint(Paint paint) {
        this.linePaint = paint;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTextMargin(int i2) {
        this.textMargin = i2;
    }

    public void setTextOrientation(TextOrientation textOrientation) {
        this.textOrientation = textOrientation;
    }

    public void setTextPaint(Paint paint) {
        this.textPaint = paint;
    }

    public void setTextPosition(PositionMetricType positionmetrictype) {
        this.textPosition = positionmetrictype;
    }

    public void setValue(Number number) {
        this.value = number;
    }

    public ValueMarker(Number number, String str, PositionMetricType positionmetrictype, Paint paint, Paint paint2) {
        this(number, str, positionmetrictype);
        this.linePaint = paint;
        this.textPaint = paint2;
    }

    public ValueMarker(Number number, String str, PositionMetricType positionmetrictype, int i2, int i3) {
        this(number, str, positionmetrictype);
        this.linePaint.setColor(i2);
        this.textPaint.setColor(i3);
    }
}