package com.androidplot;

import android.graphics.Paint;
import com.androidplot.util.PixelUtils;

/* loaded from: classes.dex */
public class SimpleLineLabelFormatter implements LineLabelFormatter {
    private static final int DEFAULT_STROKE_SIZE_DP = 2;
    private static final int DEFAULT_TEXT_SIZE_SP = 12;
    private Paint paint;

    public SimpleLineLabelFormatter() {
        this(new Paint());
        getPaint().setColor(-1);
        getPaint().setTextSize(PixelUtils.spToPix(12.0f));
        getPaint().setStrokeWidth(PixelUtils.dpToPix(2.0f));
    }

    public Paint getPaint() {
        return this.paint;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
    }

    @Override // com.androidplot.LineLabelFormatter
    public Paint getPaint(Number number) {
        return getPaint();
    }

    public SimpleLineLabelFormatter(int i2) {
        this();
        getPaint().setColor(i2);
    }

    public SimpleLineLabelFormatter(Paint paint) {
        this.paint = paint;
    }
}