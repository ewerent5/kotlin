package com.androidplot.xy;

import android.graphics.Canvas;
import android.graphics.RectF;
import com.androidplot.ui.RenderStack;
import com.androidplot.ui.SeriesBundle;
import com.androidplot.util.PixelUtils;
import com.androidplot.util.RectFUtils;
import com.androidplot.xy.BarFormatter;
import j$.util.Comparator;
import j$.util.function.Function;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class BarRenderer<FormatterType extends BarFormatter> extends GroupRenderer<FormatterType> {
    private BarGroupWidthMode barGroupWidthMode;
    private BarOrientation barOrientation;
    private float width;

    /* renamed from: com.androidplot.xy.BarRenderer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$xy$BarRenderer$BarGroupWidthMode;
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$xy$BarRenderer$BarOrientation;

        static {
            int[] iArr = new int[BarOrientation.values().length];
            $SwitchMap$com$androidplot$xy$BarRenderer$BarOrientation = iArr;
            try {
                iArr[BarOrientation.IN_ORDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$androidplot$xy$BarRenderer$BarOrientation[BarOrientation.OVERLAID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$androidplot$xy$BarRenderer$BarOrientation[BarOrientation.SIDE_BY_SIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$androidplot$xy$BarRenderer$BarOrientation[BarOrientation.STACKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[BarGroupWidthMode.values().length];
            $SwitchMap$com$androidplot$xy$BarRenderer$BarGroupWidthMode = iArr2;
            try {
                iArr2[BarGroupWidthMode.FIXED_WIDTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$androidplot$xy$BarRenderer$BarGroupWidthMode[BarGroupWidthMode.FIXED_GAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static class Bar<FormatterType extends BarFormatter> {
        protected BarGroup barGroup;
        public final FormatterType formatter;

        /* renamed from: i, reason: collision with root package name */
        public final int f3511i;
        public final XYSeries series;
        public final int seriesOrder;
        public final float xPix;
        public final float yPix;

        public Bar(XYPlot xYPlot, XYSeries xYSeries, FormatterType formattertype, int i2, int i3, RectF rectF) {
            this.series = xYSeries;
            this.formatter = formattertype;
            this.f3511i = i3;
            this.seriesOrder = i2;
            this.xPix = (float) xYPlot.getBounds().getxRegion().transform(xYSeries.getX(i3).doubleValue(), rectF.left, rectF.right, false);
            if (xYSeries.getY(i3) == null) {
                this.yPix = 0.0f;
            } else {
                this.yPix = (float) xYPlot.getBounds().yRegion.transform(xYSeries.getY(i3).doubleValue(), rectF.top, rectF.bottom, true);
            }
        }

        public Number getY() {
            return this.series.getY(this.f3511i);
        }
    }

    public static class BarComparator implements Comparator<Bar>, j$.util.Comparator {
        private final BarOrientation barOrientation;
        private final float rangeOriginPx;

        public BarComparator(BarOrientation barOrientation, float f2) {
            this.rangeOriginPx = f2;
            this.barOrientation = barOrientation;
        }

        @Override // java.util.Comparator, j$.util.Comparator
        public /* synthetic */ Comparator reversed() {
            return Collections.reverseOrder(this);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ Comparator thenComparing(Function function) {
            return Comparator.CC.$default$thenComparing(this, function);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
            return Comparator.CC.$default$thenComparing(this, function, comparator);
        }

        @Override // java.util.Comparator, j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
            return Comparator.CC.$default$thenComparing(this, comparator);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
            return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
            return Comparator.CC.$default$thenComparingInt(this, toIntFunction);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
            return Comparator.CC.$default$thenComparingLong(this, toLongFunction);
        }

        @Override // java.util.Comparator, j$.util.Comparator
        public int compare(Bar bar, Bar bar2) {
            if (AnonymousClass1.$SwitchMap$com$androidplot$xy$BarRenderer$BarOrientation[this.barOrientation.ordinal()] != 2) {
                return Integer.valueOf(bar.seriesOrder).compareTo(Integer.valueOf(bar2.seriesOrder));
            }
            float f2 = bar.yPix;
            float f3 = this.rangeOriginPx;
            if (f2 > f3) {
                float f4 = bar2.yPix;
                if (f4 > f3) {
                    return Float.valueOf(f4).compareTo(Float.valueOf(bar.yPix));
                }
            }
            return Float.valueOf(f2).compareTo(Float.valueOf(bar2.yPix));
        }
    }

    private static class BarGroup {
        public ArrayList<Bar> bars = new ArrayList<>();
        public float centerPix;

        /* renamed from: i, reason: collision with root package name */
        public int f3512i;
        public float leftPix;
        public RectF plotArea;
        public float rightPix;

        public BarGroup(int i2, float f2, RectF rectF) {
            this.centerPix = f2;
            this.plotArea = rectF;
            this.f3512i = i2;
        }

        public void addBar(Bar bar) {
            bar.barGroup = this;
            this.bars.add(bar);
        }

        protected float getWidth() {
            return this.rightPix - this.leftPix;
        }
    }

    public enum BarGroupWidthMode {
        FIXED_WIDTH,
        FIXED_GAP
    }

    public enum BarOrientation {
        IN_ORDER,
        OVERLAID,
        STACKED,
        SIDE_BY_SIDE
    }

    public BarRenderer(XYPlot xYPlot) {
        super(xYPlot);
        this.barOrientation = BarOrientation.OVERLAID;
        this.barGroupWidthMode = BarGroupWidthMode.FIXED_WIDTH;
        this.width = PixelUtils.dpToPix(3.0f);
    }

    protected RectF createBarRect(float f2, float f3, float f4, float f5, BarFormatter barFormatter) {
        RectF rectFCreateFromEdges = RectFUtils.createFromEdges(f2, f3, f4, f5);
        rectFCreateFromEdges.left += barFormatter.getMarginLeft();
        rectFCreateFromEdges.right -= barFormatter.getMarginRight();
        rectFCreateFromEdges.top += barFormatter.getMarginTop();
        rectFCreateFromEdges.bottom -= barFormatter.getMarginBottom();
        return rectFCreateFromEdges;
    }

    protected void drawBar(Canvas canvas, Bar<FormatterType> bar, RectF rectF) {
        if (bar.getY() == null) {
            return;
        }
        BarFormatter formatter = getFormatter(bar.f3511i, bar.series);
        if (formatter == null) {
            formatter = bar.formatter;
        }
        if (rectF.height() > 0.0f && rectF.width() > 0.0f) {
            if (formatter.hasFillPaint()) {
                canvas.drawRect(rectF.left, rectF.top, rectF.right, rectF.bottom, formatter.getFillPaint());
            }
            if (formatter.hasLinePaint()) {
                canvas.drawRect(rectF.left, rectF.top, rectF.right, rectF.bottom, formatter.getBorderPaint());
            }
        }
        PointLabelFormatter pointLabelFormatter = formatter.hasPointLabelFormatter() ? formatter.getPointLabelFormatter() : null;
        PointLabeler pointLabeler = formatter.getPointLabeler();
        if (pointLabelFormatter == null || !pointLabelFormatter.hasTextPaint() || pointLabeler == null) {
            return;
        }
        canvas.drawText(pointLabeler.getLabel(bar.series, bar.f3511i), rectF.centerX() + pointLabelFormatter.hOffset, bar.yPix + pointLabelFormatter.vOffset, pointLabelFormatter.getTextPaint());
    }

    protected BarComparator getBarComparator(float f2) {
        return new BarComparator(getBarOrientation(), f2);
    }

    public float getBarGroupWidth() {
        return this.width;
    }

    public BarGroupWidthMode getBarGroupWidthMode() {
        return this.barGroupWidthMode;
    }

    public BarOrientation getBarOrientation() {
        return this.barOrientation;
    }

    public FormatterType getFormatter(int i2, XYSeries xYSeries) {
        return null;
    }

    @Override // com.androidplot.xy.GroupRenderer
    public void onRender(Canvas canvas, RectF rectF, List<SeriesBundle<XYSeries, ? extends FormatterType>> list, int i2, RenderStack renderStack) {
        ArrayList arrayList;
        ArrayList<BarGroup> arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < i2; i3++) {
            BarGroup barGroup = new BarGroup(i3, 0.0f, rectF);
            int i4 = 0;
            for (SeriesBundle<XYSeries, ? extends FormatterType> seriesBundle : list) {
                if (((XYSeries) seriesBundle.getSeries()).getX(i3) != null) {
                    Bar bar = new Bar(getPlot(), (XYSeries) seriesBundle.getSeries(), (BarFormatter) seriesBundle.getFormatter(), i4, i3, rectF);
                    barGroup.addBar(bar);
                    barGroup.centerPix = bar.xPix;
                }
                i4++;
            }
            arrayList2.add(barGroup);
        }
        int size = arrayList2.size();
        for (BarGroup barGroup2 : arrayList2) {
            int i5 = AnonymousClass1.$SwitchMap$com$androidplot$xy$BarRenderer$BarGroupWidthMode[this.barGroupWidthMode.ordinal()];
            if (i5 == 1) {
                float f2 = barGroup2.centerPix;
                float f3 = this.width;
                float f4 = f2 - (f3 / 2.0f);
                barGroup2.leftPix = f4;
                barGroup2.rightPix = f4 + f3;
            } else if (i5 == 2) {
                float fWidth = rectF.width();
                if (size > 1) {
                    fWidth = (((BarGroup) arrayList2.get(1)).centerPix - ((BarGroup) arrayList2.get(0)).centerPix) - this.width;
                }
                float f5 = fWidth / 2.0f;
                float f6 = barGroup2.centerPix;
                barGroup2.leftPix = f6 - f5;
                barGroup2.rightPix = f6 + f5;
            }
            float fTransform = (float) getPlot().getBounds().yRegion.transform(getPlot().getRangeOrigin().doubleValue(), rectF.top, rectF.bottom, true);
            BarComparator barComparator = getBarComparator(fTransform);
            int i6 = AnonymousClass1.$SwitchMap$com$androidplot$xy$BarRenderer$BarOrientation[this.barOrientation.ordinal()];
            if (i6 == 1 || i6 == 2) {
                arrayList = arrayList2;
                Collections.sort(barGroup2.bars, barComparator);
                Iterator<Bar> it = barGroup2.bars.iterator();
                while (it.hasNext()) {
                    Bar next = it.next();
                    BarGroup barGroup3 = next.barGroup;
                    drawBar(canvas, next, createBarRect(barGroup3.leftPix, next.yPix, barGroup3.rightPix, fTransform, next.formatter));
                }
            } else if (i6 == 3) {
                arrayList = arrayList2;
                float width = barGroup2.getWidth() / barGroup2.bars.size();
                float f7 = barGroup2.leftPix;
                Collections.sort(barGroup2.bars, barComparator);
                Iterator<Bar> it2 = barGroup2.bars.iterator();
                float f8 = f7;
                while (it2.hasNext()) {
                    Bar next2 = it2.next();
                    float f9 = f8 + width;
                    drawBar(canvas, next2, createBarRect(f8, next2.yPix, f9, fTransform, next2.formatter));
                    f8 = f9;
                }
            } else {
                if (i6 != 4) {
                    throw new UnsupportedOperationException("Unexpected BarOrientation: " + this.barOrientation);
                }
                float f10 = (int) barGroup2.plotArea.bottom;
                Collections.sort(barGroup2.bars, barComparator);
                Iterator<Bar> it3 = barGroup2.bars.iterator();
                float f11 = f10;
                while (it3.hasNext()) {
                    Bar next3 = it3.next();
                    BarGroup barGroup4 = next3.barGroup;
                    float f12 = f11 - (((int) barGroup4.plotArea.bottom) - next3.yPix);
                    drawBar(canvas, next3, createBarRect(barGroup4.leftPix, f12, barGroup4.rightPix, f11, next3.formatter));
                    f11 = f12;
                    arrayList2 = arrayList2;
                }
                arrayList = arrayList2;
            }
            arrayList2 = arrayList;
        }
    }

    public void setBarGroupWidth(BarGroupWidthMode barGroupWidthMode, float f2) {
        this.barGroupWidthMode = barGroupWidthMode;
        this.width = f2;
    }

    public void setBarOrientation(BarOrientation barOrientation) {
        this.barOrientation = barOrientation;
    }

    @Override // com.androidplot.ui.SeriesRenderer
    public void doDrawLegendIcon(Canvas canvas, RectF rectF, BarFormatter barFormatter) {
        if (barFormatter.hasFillPaint()) {
            canvas.drawRect(rectF, barFormatter.getFillPaint());
        }
        canvas.drawRect(rectF, barFormatter.getBorderPaint());
    }
}