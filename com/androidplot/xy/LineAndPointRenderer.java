package com.androidplot.xy;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.androidplot.Plot;
import com.androidplot.PlotListener;
import com.androidplot.Region;
import com.androidplot.ui.RenderStack;
import com.androidplot.util.SeriesUtils;
import com.androidplot.xy.LineAndPointFormatter;
import com.androidplot.xy.OrderedXYSeries;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class LineAndPointRenderer<FormatterType extends LineAndPointFormatter> extends XYSeriesRenderer<XYSeries, FormatterType> {
    protected static final int ONE = 1;
    protected static final int ZERO = 0;
    private final Path path;
    protected final ConcurrentHashMap<XYSeries, ArrayList<PointF>> pointsCaches;

    /* renamed from: com.androidplot.xy.LineAndPointRenderer$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$xy$FillDirection;

        static {
            int[] iArr = new int[FillDirection.values().length];
            $SwitchMap$com$androidplot$xy$FillDirection = iArr;
            try {
                iArr[FillDirection.BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$androidplot$xy$FillDirection[FillDirection.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$androidplot$xy$FillDirection[FillDirection.RANGE_ORIGIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public LineAndPointRenderer(XYPlot xYPlot) {
        super(xYPlot);
        this.path = new Path();
        this.pointsCaches = new ConcurrentHashMap<>(2, 0.75f, 2);
        xYPlot.addListener(new PlotListener() { // from class: com.androidplot.xy.LineAndPointRenderer.1
            @Override // com.androidplot.PlotListener
            public void onAfterDraw(Plot plot, Canvas canvas) {
            }

            @Override // com.androidplot.PlotListener
            public void onBeforeDraw(Plot plot, Canvas canvas) {
                LineAndPointRenderer.this.cullPointsCache();
            }
        });
    }

    protected void appendToPath(Path path, PointF pointF, PointF pointF2) {
        path.lineTo(pointF.x, pointF.y);
    }

    protected PointF convertPoint(XYCoords xYCoords, RectF rectF) {
        return getPlot().getBounds().transformScreen(xYCoords, rectF);
    }

    protected void cullPointsCache() {
        for (XYSeries xYSeries : this.pointsCaches.keySet()) {
            if (!getPlot().getRegistry().contains(xYSeries, LineAndPointFormatter.class)) {
                this.pointsCaches.remove(xYSeries);
            }
        }
    }

    protected void drawSeries(Canvas canvas, RectF rectF, XYSeries xYSeries, LineAndPointFormatter lineAndPointFormatter) {
        int i2;
        int i3;
        int i4;
        this.path.reset();
        ArrayList<PointF> pointsCache = getPointsCache(xYSeries);
        int size = xYSeries.size();
        if (SeriesUtils.getXYOrder(xYSeries) == OrderedXYSeries.XOrder.ASCENDING) {
            Region regionIBounds = SeriesUtils.iBounds(xYSeries, getPlot().getBounds());
            int iIntValue = regionIBounds.getMin().intValue();
            if (iIntValue > 0) {
                iIntValue--;
            }
            int iIntValue2 = regionIBounds.getMax().intValue() + 1;
            if (iIntValue2 < xYSeries.size() - 1) {
                iIntValue2++;
            }
            i2 = iIntValue2;
            i3 = iIntValue;
        } else {
            i2 = size;
            i3 = 0;
        }
        int i5 = i3;
        PointF pointF = null;
        PointF pointF2 = null;
        while (i5 < i2) {
            Number y = xYSeries.getY(i5);
            Number x = xYSeries.getX(i5);
            PointF pointF3 = pointsCache.get(i5);
            if (y == null || x == null) {
                pointsCache.set(i5, null);
                pointF3 = null;
            } else {
                if (pointF3 == null) {
                    pointF3 = new PointF();
                    pointsCache.set(i5, pointF3);
                }
                getPlot().getBounds().transformScreen(pointF3, x, y, rectF);
            }
            if (!lineAndPointFormatter.hasLinePaint() || lineAndPointFormatter.getInterpolationParams() != null) {
                i4 = i5;
            } else if (pointF3 != null) {
                if (pointF == null) {
                    this.path.reset();
                    this.path.moveTo(pointF3.x, pointF3.y);
                    pointF = pointF3;
                }
                if (pointF2 != null) {
                    appendToPath(this.path, pointF3, pointF2);
                }
                pointF2 = pointF3;
                i4 = i5;
            } else {
                if (pointF2 != null) {
                    i4 = i5;
                    renderPath(canvas, rectF, this.path, pointF, pointF2, lineAndPointFormatter);
                } else {
                    i4 = i5;
                }
                pointF = null;
                pointF2 = null;
            }
            i5 = i4 + 1;
        }
        if (lineAndPointFormatter.hasLinePaint()) {
            if (lineAndPointFormatter.getInterpolationParams() != null) {
                List<XYCoords> listInterpolate = getInterpolator(lineAndPointFormatter.getInterpolationParams()).interpolate(xYSeries, lineAndPointFormatter.getInterpolationParams());
                PointF pointFConvertPoint = convertPoint(listInterpolate.get(0), rectF);
                PointF pointFConvertPoint2 = convertPoint(listInterpolate.get(listInterpolate.size() - 1), rectF);
                this.path.reset();
                this.path.moveTo(pointFConvertPoint.x, pointFConvertPoint.y);
                for (int i6 = 1; i6 < listInterpolate.size(); i6++) {
                    PointF pointFConvertPoint3 = convertPoint(listInterpolate.get(i6), rectF);
                    this.path.lineTo(pointFConvertPoint3.x, pointFConvertPoint3.y);
                }
                pointF = pointFConvertPoint;
                pointF2 = pointFConvertPoint2;
            }
            if (pointF != null) {
                renderPath(canvas, rectF, this.path, pointF, pointF2, lineAndPointFormatter);
            }
        }
        renderPoints(canvas, rectF, xYSeries, i3, i2, pointsCache, lineAndPointFormatter);
    }

    protected Interpolator getInterpolator(InterpolationParams interpolationParams) {
        try {
            return (Interpolator) interpolationParams.getInterpolatorClass().newInstance();
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        }
    }

    protected ArrayList<PointF> getPointsCache(XYSeries xYSeries) {
        ArrayList<PointF> arrayList = (ArrayList) this.pointsCaches.get(xYSeries);
        int size = xYSeries.size();
        if (arrayList == null) {
            arrayList = new ArrayList<>(size);
            this.pointsCaches.put(xYSeries, arrayList);
        }
        if (arrayList.size() < size) {
            while (arrayList.size() < size) {
                arrayList.add(null);
            }
        } else if (arrayList.size() > size) {
            while (arrayList.size() > size) {
                arrayList.remove(0);
            }
        }
        return arrayList;
    }

    protected void renderPath(Canvas canvas, RectF rectF, Path path, PointF pointF, PointF pointF2, LineAndPointFormatter lineAndPointFormatter) {
        RectF rectFAsRectF;
        Path path2 = new Path(path);
        int i2 = AnonymousClass2.$SwitchMap$com$androidplot$xy$FillDirection[lineAndPointFormatter.getFillDirection().ordinal()];
        if (i2 == 1) {
            path.lineTo(pointF2.x, rectF.bottom);
            path.lineTo(pointF.x, rectF.bottom);
            path.close();
        } else if (i2 == 2) {
            path.lineTo(pointF2.x, rectF.top);
            path.lineTo(pointF.x, rectF.top);
            path.close();
        } else {
            if (i2 != 3) {
                throw new UnsupportedOperationException("Fill direction not yet implemented: " + lineAndPointFormatter.getFillDirection());
            }
            float fTransform = (float) getPlot().getBounds().getxRegion().transform(getPlot().getRangeOrigin().doubleValue(), rectF.top, rectF.bottom, true);
            path.lineTo(pointF2.x, fTransform);
            path.lineTo(pointF.x, fTransform);
            path.close();
        }
        if (lineAndPointFormatter.getFillPaint() != null) {
            canvas.drawPath(path, lineAndPointFormatter.getFillPaint());
        }
        RectRegion bounds = getPlot().getBounds();
        RectRegion rectRegion = new RectRegion(rectF);
        for (RectRegion rectRegion2 : bounds.intersects(lineAndPointFormatter.getRegions().elements())) {
            XYRegionFormatter regionFormatter = lineAndPointFormatter.getRegionFormatter(rectRegion2);
            RectRegion rectRegionTransform = bounds.transform(rectRegion2, rectRegion, false, true);
            rectRegionTransform.intersect(rectRegion);
            if (rectRegion2.isFullyDefined() && (rectFAsRectF = rectRegionTransform.asRectF()) != null) {
                try {
                    canvas.save();
                    canvas.clipPath(path);
                    canvas.drawRect(rectFAsRectF, regionFormatter.getPaint());
                } finally {
                    canvas.restore();
                }
            }
        }
        if (lineAndPointFormatter.hasLinePaint()) {
            canvas.drawPath(path2, lineAndPointFormatter.getLinePaint());
        }
        path.rewind();
    }

    protected void renderPoints(Canvas canvas, RectF rectF, XYSeries xYSeries, int i2, int i3, List<PointF> list, LineAndPointFormatter lineAndPointFormatter) {
        if (lineAndPointFormatter.hasVertexPaint() || lineAndPointFormatter.hasPointLabelFormatter()) {
            Paint vertexPaint = lineAndPointFormatter.hasVertexPaint() ? lineAndPointFormatter.getVertexPaint() : null;
            boolean zHasPointLabelFormatter = lineAndPointFormatter.hasPointLabelFormatter();
            PointLabelFormatter pointLabelFormatter = zHasPointLabelFormatter ? lineAndPointFormatter.getPointLabelFormatter() : null;
            PointLabeler pointLabeler = zHasPointLabelFormatter ? lineAndPointFormatter.getPointLabeler() : null;
            while (i2 < i3) {
                PointF pointF = list.get(i2);
                if (pointF != null) {
                    if (vertexPaint != null) {
                        canvas.drawPoint(pointF.x, pointF.y, vertexPaint);
                    }
                    if (pointLabeler != null) {
                        canvas.drawText(pointLabeler.getLabel(xYSeries, i2), pointF.x + pointLabelFormatter.hOffset, pointF.y + pointLabelFormatter.vOffset, pointLabelFormatter.getTextPaint());
                    }
                }
                i2++;
            }
        }
    }

    @Override // com.androidplot.ui.SeriesRenderer
    public void doDrawLegendIcon(Canvas canvas, RectF rectF, LineAndPointFormatter lineAndPointFormatter) {
        float fCenterY = rectF.centerY();
        float fCenterX = rectF.centerX();
        if (lineAndPointFormatter.getFillPaint() != null) {
            canvas.drawRect(rectF, lineAndPointFormatter.getFillPaint());
        }
        if (lineAndPointFormatter.hasLinePaint()) {
            canvas.drawLine(rectF.left, rectF.bottom, rectF.right, rectF.top, lineAndPointFormatter.getLinePaint());
        }
        if (lineAndPointFormatter.hasVertexPaint()) {
            canvas.drawPoint(fCenterX, fCenterY, lineAndPointFormatter.getVertexPaint());
        }
    }

    @Override // com.androidplot.ui.SeriesRenderer
    public void onRender(Canvas canvas, RectF rectF, XYSeries xYSeries, FormatterType formattertype, RenderStack renderStack) {
        drawSeries(canvas, rectF, xYSeries, formattertype);
    }
}