package com.androidplot.xy;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.androidplot.ui.VerticalPosition;
import com.androidplot.ui.VerticalPositioning;

/* loaded from: classes.dex */
public class XValueMarker extends ValueMarker<VerticalPosition> {
    public XValueMarker(Number number, String str) {
        super(number, str, new VerticalPosition(3.0f, VerticalPositioning.ABSOLUTE_FROM_TOP));
    }

    @Override // com.androidplot.xy.ValueMarker
    public void draw(Canvas canvas, XYPlot xYPlot, RectF rectF) {
        if (getValue() != null) {
            float fTransform = (float) xYPlot.getBounds().xRegion.transform(getValue().doubleValue(), rectF.left, rectF.right, false);
            canvas.drawLine(fTransform, rectF.top, fTransform, rectF.bottom, getLinePaint());
            float pixelValue = getTextPosition().getPixelValue(rectF.height()) + rectF.top;
            if (getText() != null) {
                drawMarkerText(canvas, getText(), rectF, fTransform, pixelValue);
            }
        }
    }

    public XValueMarker(Number number, String str, VerticalPosition verticalPosition, Paint paint, Paint paint2) {
        super(number, str, verticalPosition, paint, paint2);
    }

    public XValueMarker(Number number, String str, VerticalPosition verticalPosition, int i2, int i3) {
        super(number, str, verticalPosition, i2, i3);
    }
}