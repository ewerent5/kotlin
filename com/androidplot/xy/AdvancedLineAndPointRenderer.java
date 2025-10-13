package com.androidplot.xy;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import com.androidplot.ui.RenderStack;
import com.androidplot.ui.SeriesRenderer;

/* loaded from: classes.dex */
public class AdvancedLineAndPointRenderer extends XYSeriesRenderer<XYSeries, Formatter> {
    private int latestIndex;

    public static class Formatter extends XYSeriesFormatter<XYRegionFormatter> {
        private static final int DEFAULT_STROKE_WIDTH = 3;
        private Paint linePaint;

        public Formatter() {
            Paint paint = new Paint();
            this.linePaint = paint;
            paint.setStrokeWidth(3.0f);
            this.linePaint.setColor(-65536);
        }

        public Paint getLinePaint() {
            return this.linePaint;
        }

        @Override // com.androidplot.ui.Formatter
        public Class<? extends SeriesRenderer> getRendererClass() {
            return AdvancedLineAndPointRenderer.class;
        }

        public void setLinePaint(Paint paint) {
            this.linePaint = paint;
        }

        @Override // com.androidplot.ui.Formatter
        public AdvancedLineAndPointRenderer doGetRendererInstance(XYPlot xYPlot) {
            return new AdvancedLineAndPointRenderer(xYPlot);
        }

        public Paint getLinePaint(int i2, int i3, int i4) {
            return getLinePaint();
        }

        public Formatter(Context context, int i2) throws Resources.NotFoundException {
            this();
            configure(context, i2);
        }
    }

    public AdvancedLineAndPointRenderer(XYPlot xYPlot) {
        super(xYPlot);
    }

    public void setLatestIndex(int i2) {
        this.latestIndex = i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.androidplot.ui.SeriesRenderer
    public void doDrawLegendIcon(Canvas canvas, RectF rectF, Formatter formatter) {
        if (formatter.getLinePaint() != null) {
            canvas.drawLine(rectF.left, rectF.bottom, rectF.right, rectF.top, formatter.getLinePaint());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.androidplot.ui.SeriesRenderer
    public void onRender(Canvas canvas, RectF rectF, XYSeries xYSeries, Formatter formatter, RenderStack renderStack) {
        int i2 = 0;
        PointF pointF = null;
        while (i2 < xYSeries.size()) {
            Number y = xYSeries.getY(i2);
            Number x = xYSeries.getX(i2);
            PointF pointFTransformScreen = (y == null || x == null) ? null : getPlot().getBounds().transformScreen(x, y, rectF);
            if (formatter.getLinePaint() != null && pointFTransformScreen != null && pointF != null) {
                canvas.drawLine(pointF.x, pointF.y, pointFTransformScreen.x, pointFTransformScreen.y, formatter.getLinePaint(i2, this.latestIndex, xYSeries.size()));
            }
            i2++;
            pointF = pointFTransformScreen;
        }
    }
}