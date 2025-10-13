package com.androidplot.xy;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.androidplot.ui.RenderStack;
import com.androidplot.ui.SeriesBundle;
import com.androidplot.xy.CandlestickFormatter;
import java.util.List;

/* loaded from: classes.dex */
public class CandlestickRenderer<FormatterType extends CandlestickFormatter> extends GroupRenderer<FormatterType> {
    protected static final int CLOSE_INDEX = 3;
    protected static final int HIGH_INDEX = 0;
    protected static final int LOW_INDEX = 1;
    protected static final int OPEN_INDEX = 2;

    /* renamed from: com.androidplot.xy.CandlestickRenderer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$xy$CandlestickFormatter$BodyStyle;

        static {
            int[] iArr = new int[CandlestickFormatter.BodyStyle.values().length];
            $SwitchMap$com$androidplot$xy$CandlestickFormatter$BodyStyle = iArr;
            try {
                iArr[CandlestickFormatter.BodyStyle.SQUARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$androidplot$xy$CandlestickFormatter$BodyStyle[CandlestickFormatter.BodyStyle.TRIANGULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public CandlestickRenderer(XYPlot xYPlot) {
        super(xYPlot);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.androidplot.ui.SeriesRenderer
    public void doDrawLegendIcon(Canvas canvas, RectF rectF, FormatterType formattertype) {
    }

    protected void drawBody(Canvas canvas, PointF pointF, PointF pointF2, FormatterType formattertype) {
        float bodyWidth = formattertype.getBodyWidth() / 2.0f;
        RectF rectF = new RectF(pointF.x - bodyWidth, pointF.y, pointF2.x + bodyWidth, pointF2.y);
        Paint risingBodyFillPaint = pointF.y >= pointF2.y ? formattertype.getRisingBodyFillPaint() : formattertype.getFallingBodyFillPaint();
        Paint risingBodyStrokePaint = pointF.y >= pointF2.y ? formattertype.getRisingBodyStrokePaint() : formattertype.getFallingBodyStrokePaint();
        int i2 = AnonymousClass1.$SwitchMap$com$androidplot$xy$CandlestickFormatter$BodyStyle[formattertype.getBodyStyle().ordinal()];
        if (i2 == 1) {
            canvas.drawRect(rectF, risingBodyFillPaint);
            canvas.drawRect(rectF, risingBodyStrokePaint);
        } else {
            if (i2 != 2) {
                return;
            }
            drawTriangle(canvas, rectF, risingBodyFillPaint, risingBodyStrokePaint);
        }
    }

    protected void drawLowerCap(Canvas canvas, PointF pointF, FormatterType formattertype) {
        float lowerCapWidth = formattertype.getLowerCapWidth();
        float f2 = pointF.x;
        float f3 = pointF.y;
        canvas.drawLine(f2 - lowerCapWidth, f3, f2 + lowerCapWidth, f3, formattertype.getLowerCapPaint());
    }

    protected void drawTextLabel(Canvas canvas, PointF pointF, String str, PointLabelFormatter pointLabelFormatter) {
        if (str != null) {
            canvas.drawText(str, pointF.x + pointLabelFormatter.hOffset, pointF.y + pointLabelFormatter.vOffset, pointLabelFormatter.getTextPaint());
        }
    }

    protected void drawTriangle(Canvas canvas, RectF rectF, Paint paint, Paint paint2) {
        Path path = new Path();
        path.moveTo(rectF.centerX(), rectF.bottom);
        path.lineTo(rectF.left, rectF.top);
        path.lineTo(rectF.right, rectF.top);
        path.close();
        canvas.drawPath(path, paint);
        canvas.drawPath(path, paint2);
    }

    protected void drawUpperCap(Canvas canvas, PointF pointF, FormatterType formattertype) {
        float upperCapWidth = formattertype.getUpperCapWidth();
        float f2 = pointF.x;
        float f3 = pointF.y;
        canvas.drawLine(f2 - upperCapWidth, f3, f2 + upperCapWidth, f3, formattertype.getUpperCapPaint());
    }

    protected void drawWick(Canvas canvas, PointF pointF, PointF pointF2, FormatterType formattertype) {
        canvas.drawLine(pointF.x, pointF.y, pointF2.x, pointF2.y, formattertype.getWickPaint());
    }

    @Override // com.androidplot.xy.GroupRenderer
    public void onRender(Canvas canvas, RectF rectF, List<SeriesBundle<XYSeries, ? extends FormatterType>> list, int i2, RenderStack renderStack) {
        List<SeriesBundle<XYSeries, ? extends FormatterType>> list2 = list;
        int i3 = 0;
        CandlestickFormatter candlestickFormatter = (CandlestickFormatter) list2.get(0).getFormatter();
        int i4 = 0;
        while (i4 < i2) {
            XYSeries xYSeries = (XYSeries) list2.get(i3).getSeries();
            XYSeries xYSeries2 = (XYSeries) list2.get(1).getSeries();
            XYSeries xYSeries3 = (XYSeries) list2.get(2).getSeries();
            XYSeries xYSeries4 = (XYSeries) list2.get(3).getSeries();
            Number x = xYSeries.getX(i4);
            Number y = xYSeries.getY(i4);
            Number y2 = xYSeries2.getY(i4);
            Number y3 = xYSeries3.getY(i4);
            Number y4 = xYSeries4.getY(i4);
            PointF pointFTransformScreen = getPlot().getBounds().transformScreen(x, y, rectF);
            PointF pointFTransformScreen2 = getPlot().getBounds().transformScreen(x, y2, rectF);
            PointF pointFTransformScreen3 = getPlot().getBounds().transformScreen(x, y3, rectF);
            PointF pointFTransformScreen4 = getPlot().getBounds().transformScreen(x, y4, rectF);
            drawWick(canvas, pointFTransformScreen, pointFTransformScreen2, candlestickFormatter);
            drawBody(canvas, pointFTransformScreen3, pointFTransformScreen4, candlestickFormatter);
            drawUpperCap(canvas, pointFTransformScreen, candlestickFormatter);
            drawLowerCap(canvas, pointFTransformScreen2, candlestickFormatter);
            PointLabelFormatter pointLabelFormatter = candlestickFormatter.hasPointLabelFormatter() ? candlestickFormatter.getPointLabelFormatter() : null;
            PointLabeler pointLabeler = candlestickFormatter.getPointLabeler();
            if (pointLabelFormatter != null && pointLabeler != null) {
                drawTextLabel(canvas, pointFTransformScreen, pointLabeler.getLabel(xYSeries, i4), pointLabelFormatter);
                drawTextLabel(canvas, pointFTransformScreen2, pointLabeler.getLabel(xYSeries2, i4), pointLabelFormatter);
                drawTextLabel(canvas, pointFTransformScreen3, pointLabeler.getLabel(xYSeries3, i4), pointLabelFormatter);
                drawTextLabel(canvas, pointFTransformScreen4, pointLabeler.getLabel(xYSeries4, i4), pointLabelFormatter);
            }
            i4++;
            list2 = list;
            i3 = 0;
        }
    }
}