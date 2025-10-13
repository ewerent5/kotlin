package com.androidplot.xy;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import e.d.a.a;
import e.d.a.b;

/* loaded from: classes.dex */
public class XYRegionFormatter {
    private Paint paint;

    public XYRegionFormatter(Context context, int i2) throws Resources.NotFoundException {
        Paint paint = new Paint();
        this.paint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.paint.setAntiAlias(true);
        if (getClass().equals(XYRegionFormatter.class)) {
            try {
                a.a(context, this, i2);
            } catch (b e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public int getColor() {
        return this.paint.getColor();
    }

    public Paint getPaint() {
        return this.paint;
    }

    public void setColor(int i2) {
        this.paint.setColor(i2);
    }

    public XYRegionFormatter(int i2) {
        Paint paint = new Paint();
        this.paint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.paint.setAntiAlias(true);
        this.paint.setColor(i2);
    }
}