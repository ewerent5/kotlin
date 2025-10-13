package com.androidplot.pie;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Region;
import com.androidplot.ui.RenderStack;
import com.androidplot.ui.SeriesBundle;
import com.androidplot.ui.SeriesRenderer;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class PieRenderer extends SeriesRenderer<PieChart, Segment, SegmentFormatter> {
    private static final float FULL_PIE_DEGS = 360.0f;
    private static final float HALF_PIE_DEGS = 180.0f;
    private DonutMode donutMode;
    private float donutSize;
    private float extentDegs;
    private float startDegs;

    /* renamed from: com.androidplot.pie.PieRenderer$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$pie$PieRenderer$DonutMode;

        static {
            int[] iArr = new int[DonutMode.values().length];
            $SwitchMap$com$androidplot$pie$PieRenderer$DonutMode = iArr;
            try {
                iArr[DonutMode.PERCENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$androidplot$pie$PieRenderer$DonutMode[DonutMode.PIXELS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum DonutMode {
        PERCENT,
        PIXELS
    }

    public PieRenderer(PieChart pieChart) {
        super(pieChart);
        this.startDegs = 0.0f;
        this.extentDegs = FULL_PIE_DEGS;
        this.donutSize = 0.5f;
        this.donutMode = DonutMode.PERCENT;
    }

    protected static float degsToScreenDegs(float f2) {
        float f3 = f2 % FULL_PIE_DEGS;
        return f3 > 0.0f ? FULL_PIE_DEGS - f3 : f3;
    }

    protected static double signedDistance(double d2, double d3) {
        double d4 = d2 - d3;
        double dAbs = Math.abs(d4) % 360.0d;
        if (dAbs > 180.0d) {
            dAbs = 360.0d - dAbs;
        }
        return dAbs * (((d4 < 0.0d || d4 > 180.0d) && (d4 > -180.0d || d4 < -360.0d)) ? -1 : 1);
    }

    protected static void validateInputDegs(float f2) {
        if (f2 < 0.0f || f2 > FULL_PIE_DEGS) {
            throw new IllegalArgumentException("Degrees values must be between 0.0 and 360.");
        }
    }

    protected PointF calculateLineEnd(float f2, float f3, float f4, float f5) {
        return calculateLineEnd(new PointF(f2, f3), f4, f5);
    }

    protected double calculateScale(double[] dArr) {
        double d2 = 0.0d;
        for (double d3 : dArr) {
            d2 += d3;
        }
        return 1.0d / d2;
    }

    protected void drawSegment(Canvas canvas, RectF rectF, Segment segment, SegmentFormatter segmentFormatter, float f2, float f3, float f4) {
        float f5;
        float f6;
        canvas.save();
        float radialInset = f3 + segmentFormatter.getRadialInset();
        float radialInset2 = f4 - (segmentFormatter.getRadialInset() * 2.0f);
        float f7 = radialInset + (radialInset2 / 2.0f);
        PointF pointFCalculateLineEnd = calculateLineEnd(rectF.centerX(), rectF.centerY(), segmentFormatter.getOffset(), f7);
        float f8 = pointFCalculateLineEnd.x;
        float f9 = pointFCalculateLineEnd.y;
        int i2 = AnonymousClass1.$SwitchMap$com$androidplot$pie$PieRenderer$DonutMode[this.donutMode.ordinal()];
        if (i2 == 1) {
            f5 = this.donutSize * f2;
        } else {
            if (i2 != 2) {
                throw new UnsupportedOperationException("Unsupported DonutMde: " + this.donutMode);
            }
            f5 = this.donutSize;
            if (f5 <= 0.0f) {
                f5 = f2 + f5;
            }
        }
        float outerInset = f2 - segmentFormatter.getOuterInset();
        float innerInset = f5 == 0.0f ? 0.0f : f5 + segmentFormatter.getInnerInset();
        if (Math.abs(radialInset2 - this.extentDegs) > Float.MIN_VALUE) {
            PointF pointFCalculateLineEnd2 = calculateLineEnd(f8, f9, outerInset, radialInset);
            PointF pointFCalculateLineEnd3 = calculateLineEnd(f8, f9, innerInset, radialInset);
            float f10 = radialInset + radialInset2;
            PointF pointFCalculateLineEnd4 = calculateLineEnd(f8, f9, outerInset, f10);
            PointF pointFCalculateLineEnd5 = calculateLineEnd(f8, f9, innerInset, f10);
            Path path = new Path();
            f6 = f7;
            path.arcTo(new RectF(rectF.left - outerInset, rectF.top - outerInset, rectF.right + outerInset, rectF.bottom + outerInset), radialInset, radialInset2);
            path.lineTo(f8, f9);
            path.close();
            canvas.clipPath(path);
            Path path2 = new Path();
            path2.arcTo(new RectF(f8 - outerInset, f9 - outerInset, f8 + outerInset, f9 + outerInset), radialInset, radialInset2);
            path2.lineTo(pointFCalculateLineEnd5.x, pointFCalculateLineEnd5.y);
            path2.arcTo(new RectF(f8 - innerInset, f9 - innerInset, f8 + innerInset, f9 + innerInset), f10, -radialInset2);
            path2.close();
            canvas.drawPath(path2, segmentFormatter.getFillPaint());
            canvas.drawLine(pointFCalculateLineEnd3.x, pointFCalculateLineEnd3.y, pointFCalculateLineEnd2.x, pointFCalculateLineEnd2.y, segmentFormatter.getRadialEdgePaint());
            canvas.drawLine(pointFCalculateLineEnd5.x, pointFCalculateLineEnd5.y, pointFCalculateLineEnd4.x, pointFCalculateLineEnd4.y, segmentFormatter.getRadialEdgePaint());
        } else {
            f6 = f7;
            canvas.save();
            Path path3 = new Path();
            path3.addCircle(f8, f9, outerInset, Path.Direction.CW);
            Path path4 = new Path();
            path4.addCircle(f8, f9, innerInset, Path.Direction.CW);
            canvas.clipPath(path4, Region.Op.DIFFERENCE);
            canvas.drawPath(path3, segmentFormatter.getFillPaint());
            canvas.restore();
        }
        canvas.drawCircle(f8, f9, innerInset, segmentFormatter.getInnerEdgePaint());
        canvas.drawCircle(f8, f9, outerInset, segmentFormatter.getOuterEdgePaint());
        canvas.restore();
        PointF pointFCalculateLineEnd6 = calculateLineEnd(f8, f9, outerInset - ((outerInset - innerInset) / 2.0f), f6);
        if (segmentFormatter.getLabelPaint() != null) {
            drawSegmentLabel(canvas, pointFCalculateLineEnd6, segment, segmentFormatter);
        }
    }

    protected void drawSegmentLabel(Canvas canvas, PointF pointF, Segment segment, SegmentFormatter segmentFormatter) {
        canvas.drawText(segment.getTitle(), pointF.x, pointF.y, segmentFormatter.getLabelPaint());
    }

    public Segment getContainingSegment(PointF pointF) {
        PieRenderer pieRenderer = this;
        RectF rectF = getPlot().getPie().getWidgetDimensions().marginatedRect;
        PointF pointF2 = new PointF(rectF.centerX(), rectF.centerY());
        double dAtan2 = Math.atan2(pointF.y - pointF2.y, pointF.x - pointF2.x) * 57.29577951308232d;
        if (dAtan2 < 0.0d) {
            dAtan2 += 360.0d;
        }
        List<SeriesBundle<Segment, ? extends SegmentFormatter>> seriesAndFormatterList = getSeriesAndFormatterList();
        int i2 = 0;
        double[] values = getValues();
        double dCalculateScale = pieRenderer.calculateScale(values);
        float fDegsToScreenDegs = degsToScreenDegs(pieRenderer.startDegs);
        for (SeriesBundle<Segment, ? extends SegmentFormatter> seriesBundle : seriesAndFormatterList) {
            float f2 = (((float) ((values[i2] * dCalculateScale) * pieRenderer.extentDegs)) + fDegsToScreenDegs) % FULL_PIE_DEGS;
            double d2 = f2;
            double dSignedDistance = signedDistance(d2, dAtan2);
            double d3 = dAtan2;
            double dSignedDistance2 = signedDistance(d2, fDegsToScreenDegs);
            if (dSignedDistance2 < 0.0d) {
                dSignedDistance2 += 360.0d;
            }
            if (dSignedDistance > 0.0d && dSignedDistance <= dSignedDistance2) {
                return (Segment) seriesBundle.getSeries();
            }
            i2++;
            pieRenderer = this;
            fDegsToScreenDegs = f2;
            dAtan2 = d3;
        }
        return null;
    }

    public float getExtentDegs() {
        return this.extentDegs;
    }

    public float getRadius(RectF rectF) {
        return (rectF.width() < rectF.height() ? rectF.width() : rectF.height()) / 2.0f;
    }

    public float getStartDegs() {
        return this.startDegs;
    }

    protected double[] getValues() {
        List<SeriesBundle<Segment, ? extends SegmentFormatter>> seriesAndFormatterList = getSeriesAndFormatterList();
        double[] dArr = new double[seriesAndFormatterList.size()];
        Iterator<SeriesBundle<Segment, ? extends SegmentFormatter>> it = seriesAndFormatterList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            dArr[i2] = ((Segment) it.next().getSeries()).getValue().doubleValue();
            i2++;
        }
        return dArr;
    }

    public void setDonutSize(float f2, DonutMode donutMode) {
        int i2 = AnonymousClass1.$SwitchMap$com$androidplot$pie$PieRenderer$DonutMode[donutMode.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                throw new UnsupportedOperationException("Not yet implemented.");
            }
        } else if (f2 < 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("Size parameter must be between 0 and 1 when operating in PERCENT mode.");
        }
        this.donutMode = donutMode;
        this.donutSize = f2;
    }

    public void setExtentDegs(float f2) {
        validateInputDegs(f2);
        this.extentDegs = f2;
    }

    public void setStartDegs(float f2) {
        validateInputDegs(f2);
        this.startDegs = f2;
    }

    protected PointF calculateLineEnd(PointF pointF, float f2, float f3) {
        double d2 = (f3 * 3.141592653589793d) / 180.0d;
        double d3 = f2;
        return new PointF(pointF.x + ((float) (Math.cos(d2) * d3)), pointF.y + ((float) (d3 * Math.sin(d2))));
    }

    @Override // com.androidplot.ui.SeriesRenderer
    public void doDrawLegendIcon(Canvas canvas, RectF rectF, SegmentFormatter segmentFormatter) {
        throw new UnsupportedOperationException("Not yet implemented.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.androidplot.ui.SeriesRenderer
    public void onRender(Canvas canvas, RectF rectF, Segment segment, SegmentFormatter segmentFormatter, RenderStack renderStack) {
        renderStack.disable(getClass());
        float radius = getRadius(rectF);
        PointF pointF = new PointF(rectF.centerX(), rectF.centerY());
        double[] values = getValues();
        double dCalculateScale = calculateScale(values);
        float fDegsToScreenDegs = degsToScreenDegs(this.startDegs);
        float f2 = pointF.x;
        float f3 = pointF.y;
        RectF rectF2 = new RectF(f2 - radius, f3 - radius, f2 + radius, f3 + radius);
        float f4 = fDegsToScreenDegs;
        int i2 = 0;
        for (SeriesBundle<Segment, ? extends SegmentFormatter> seriesBundle : getSeriesAndFormatterList()) {
            float f5 = (float) (values[i2] * dCalculateScale * this.extentDegs);
            drawSegment(canvas, rectF2, (Segment) seriesBundle.getSeries(), (SegmentFormatter) seriesBundle.getFormatter(), radius, f4, f5);
            i2++;
            f4 += f5;
        }
    }
}