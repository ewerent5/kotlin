package com.androidplot.xy;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import com.androidplot.ui.RenderStack;
import com.androidplot.ui.SeriesRenderer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class FastLineAndPointRenderer extends XYSeriesRenderer<XYSeries, Formatter> {
    private static final int MINIMUM_NUMBER_OF_POINTS_TO_DEFINE_A_LINE = 4;
    private float[] points;
    List<Integer> segmentLengths;
    List<Integer> segmentOffsets;

    public static class Formatter extends LineAndPointFormatter {
        public Formatter(Integer num, Integer num2, PointLabelFormatter pointLabelFormatter) {
            super(num, num2, null, pointLabelFormatter);
        }

        @Override // com.androidplot.xy.LineAndPointFormatter, com.androidplot.ui.Formatter
        public Class<? extends SeriesRenderer> getRendererClass() {
            return FastLineAndPointRenderer.class;
        }

        @Override // com.androidplot.xy.LineAndPointFormatter
        protected void initLinePaint(Integer num) {
            super.initLinePaint(num);
            getLinePaint().setAntiAlias(false);
        }

        @Override // com.androidplot.xy.LineAndPointFormatter, com.androidplot.ui.Formatter
        public SeriesRenderer doGetRendererInstance(XYPlot xYPlot) {
            return new FastLineAndPointRenderer(xYPlot);
        }
    }

    public FastLineAndPointRenderer(XYPlot xYPlot) {
        super(xYPlot);
        this.segmentOffsets = new ArrayList();
        this.segmentLengths = new ArrayList();
    }

    protected void drawSegment(Canvas canvas, float[] fArr, int i2, int i3, Formatter formatter) {
        Paint paint = formatter.linePaint;
        if (paint != null && i3 >= 4) {
            if ((i3 & 2) != 0) {
                int i4 = i3 - 2;
                canvas.drawLines(fArr, i2, i4, paint);
                canvas.drawLines(fArr, i2 + 2, i4, formatter.linePaint);
            } else {
                canvas.drawLines(fArr, i2, i3, paint);
                canvas.drawLines(fArr, i2 + 2, i3 - 4, formatter.linePaint);
            }
        }
        Paint paint2 = formatter.vertexPaint;
        if (paint2 != null) {
            canvas.drawPoints(fArr, i2, i3, paint2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.androidplot.ui.SeriesRenderer
    public void doDrawLegendIcon(Canvas canvas, RectF rectF, Formatter formatter) {
        if (formatter.hasLinePaint()) {
            canvas.drawLine(rectF.left, rectF.bottom, rectF.right, rectF.top, formatter.getLinePaint());
        }
        if (formatter.hasVertexPaint()) {
            canvas.drawPoint(rectF.centerX(), rectF.centerY(), formatter.getVertexPaint());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.androidplot.ui.SeriesRenderer
    public void onRender(Canvas canvas, RectF rectF, XYSeries xYSeries, Formatter formatter, RenderStack renderStack) {
        this.segmentOffsets.clear();
        this.segmentLengths.clear();
        int size = xYSeries.size() * 2;
        float[] fArr = this.points;
        if (fArr == null || fArr.length != size) {
            this.points = new float[xYSeries.size() * 2];
        }
        PointF pointF = new PointF();
        int i2 = 0;
        int i3 = 0;
        boolean z = true;
        int i4 = 0;
        while (i2 < xYSeries.size()) {
            Number y = xYSeries.getY(i2);
            Number x = xYSeries.getX(i2);
            if (y != null && x != null) {
                if (z) {
                    this.segmentOffsets.add(Integer.valueOf(i4));
                    i3 = 0;
                    z = false;
                }
                getPlot().getBounds().transformScreen(pointF, x, y, rectF);
                float[] fArr2 = this.points;
                fArr2[i4] = pointF.x;
                fArr2[i4 + 1] = pointF.y;
                i3 += 2;
                if (i2 == xYSeries.size() - 1) {
                    this.segmentLengths.add(Integer.valueOf(i3));
                }
            } else if (!z) {
                this.segmentLengths.add(Integer.valueOf(i3));
                z = true;
            }
            i2++;
            i4 += 2;
        }
        if (formatter.linePaint == null && formatter.vertexPaint == null) {
            return;
        }
        for (int i5 = 0; i5 < this.segmentOffsets.size(); i5++) {
            int iIntValue = this.segmentLengths.get(i5).intValue();
            drawSegment(canvas, this.points, this.segmentOffsets.get(i5).intValue(), iIntValue, formatter);
        }
    }
}