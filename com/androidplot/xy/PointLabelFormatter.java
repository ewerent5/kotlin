package com.androidplot.xy;

import android.graphics.Paint;
import com.androidplot.util.PixelUtils;

/* loaded from: classes.dex */
public class PointLabelFormatter {
    private static final float DEFAULT_H_OFFSET_DP = 0.0f;
    private static final float DEFAULT_TEXT_SIZE_SP = 12.0f;
    private static final float DEFAULT_V_OFFSET_DP = -4.0f;
    public float hOffset;
    private Paint textPaint;
    public float vOffset;

    public PointLabelFormatter() {
        this(-1);
    }

    public Paint getTextPaint() {
        if (this.textPaint == null) {
            initTextPaint(0);
        }
        return this.textPaint;
    }

    public boolean hasTextPaint() {
        return this.textPaint != null;
    }

    protected void initTextPaint(Integer num) {
        if (num == null) {
            setTextPaint(null);
            return;
        }
        setTextPaint(new Paint());
        getTextPaint().setAntiAlias(true);
        getTextPaint().setColor(num.intValue());
        getTextPaint().setTextAlign(Paint.Align.CENTER);
        getTextPaint().setTextSize(PixelUtils.spToPix(DEFAULT_TEXT_SIZE_SP));
    }

    public void setTextPaint(Paint paint) {
        this.textPaint = paint;
    }

    public PointLabelFormatter(int i2) {
        this(i2, PixelUtils.dpToPix(DEFAULT_H_OFFSET_DP), PixelUtils.dpToPix(DEFAULT_V_OFFSET_DP));
    }

    public PointLabelFormatter(int i2, float f2, float f3) {
        initTextPaint(Integer.valueOf(i2));
        this.hOffset = f2;
        this.vOffset = f3;
    }
}