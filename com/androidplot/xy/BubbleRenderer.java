package com.androidplot.xy;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import com.androidplot.Region;
import com.androidplot.ui.RenderStack;
import com.androidplot.ui.SeriesBundle;
import com.androidplot.util.FontUtils;
import com.androidplot.util.PixelUtils;
import com.androidplot.util.SeriesUtils;
import com.androidplot.xy.BubbleFormatter;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class BubbleRenderer<FormatterType extends BubbleFormatter> extends XYSeriesRenderer<BubbleSeries, FormatterType> {
    protected static final float MAX_BUBBLE_RADIUS_DEFAULT_DP = 25.0f;
    protected static final float MIN_BUBBLE_RADIUS_DEFAULT_DP = 9.0f;
    private Region bubbleBounds;
    private BubbleScaleMode bubbleScaleMode;

    public enum BubbleScaleMode {
        LINEAR,
        SQUARE_ROOT
    }

    public BubbleRenderer(XYPlot xYPlot) {
        super(xYPlot);
        this.bubbleScaleMode = BubbleScaleMode.SQUARE_ROOT;
        this.bubbleBounds = new Region(Float.valueOf(PixelUtils.dpToPix(MIN_BUBBLE_RADIUS_DEFAULT_DP)), Float.valueOf(PixelUtils.dpToPix(MAX_BUBBLE_RADIUS_DEFAULT_DP)));
    }

    protected Region calculateBounds() {
        Region region = new Region();
        Iterator it = getSeriesAndFormatterList().iterator();
        while (it.hasNext()) {
            SeriesUtils.minMax(region, (List<Number>[]) new List[]{((BubbleSeries) ((SeriesBundle) it.next()).getSeries()).getZVals()});
        }
        if (region.getMax() == null || region.getMax().doubleValue() <= 0.0d) {
            return null;
        }
        BubbleScaleMode bubbleScaleMode = this.bubbleScaleMode;
        BubbleScaleMode bubbleScaleMode2 = BubbleScaleMode.SQUARE_ROOT;
        if (bubbleScaleMode == bubbleScaleMode2) {
            region.setMax(Double.valueOf(Math.sqrt(region.getMax().doubleValue())));
        }
        if (region.getMin().doubleValue() <= 0.0d) {
            region.setMax(0);
        } else if (this.bubbleScaleMode == bubbleScaleMode2) {
            region.setMin(Double.valueOf(Math.sqrt(region.getMin().doubleValue())));
        }
        return region;
    }

    protected void drawBubble(Canvas canvas, FormatterType formattertype, BubbleSeries bubbleSeries, int i2, PointF pointF, float f2) {
        canvas.drawCircle(pointF.x, pointF.y, f2, formattertype.getFillPaint());
        canvas.drawCircle(pointF.x, pointF.y, f2, formattertype.getStrokePaint());
        if (bubbleSeries == null || !formattertype.hasPointLabelFormatter() || formattertype.getPointLabeler() == null) {
            return;
        }
        FontUtils.drawTextVerticallyCentered(canvas, formattertype.getPointLabeler().getLabel(bubbleSeries, i2), pointF.x, pointF.y, formattertype.getPointLabelFormatter().getTextPaint());
    }

    public BubbleScaleMode getBubbleScaleMode() {
        return this.bubbleScaleMode;
    }

    public float getMaxBubbleRadius() {
        return this.bubbleBounds.getMax().floatValue();
    }

    public float getMinBubbleRadius() {
        return this.bubbleBounds.getMin().floatValue();
    }

    public void setBubbleScaleMode(BubbleScaleMode bubbleScaleMode) {
        this.bubbleScaleMode = bubbleScaleMode;
    }

    public void setMaxBubbleRadius(float f2) {
        this.bubbleBounds.setMax(Float.valueOf(f2));
    }

    public void setMinBubbleRadius(float f2) {
        this.bubbleBounds.setMin(Float.valueOf(f2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.androidplot.ui.SeriesRenderer
    public void doDrawLegendIcon(Canvas canvas, RectF rectF, FormatterType formattertype) {
        drawBubble(canvas, formattertype, null, 0, new PointF(rectF.centerX(), rectF.centerY()), rectF.width() / 2.5f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.androidplot.ui.SeriesRenderer
    public void onRender(Canvas canvas, RectF rectF, BubbleSeries bubbleSeries, FormatterType formattertype, RenderStack renderStack) {
        Region regionCalculateBounds = calculateBounds();
        for (int i2 = 0; i2 < bubbleSeries.size(); i2++) {
            if (bubbleSeries.getY(i2) != null && bubbleSeries.getZ(i2).doubleValue() > 0.0d) {
                drawBubble(canvas, formattertype, bubbleSeries, i2, getPlot().getBounds().transform(bubbleSeries.getX(i2), bubbleSeries.getY(i2), rectF, false, true), regionCalculateBounds.transform(this.bubbleScaleMode == BubbleScaleMode.SQUARE_ROOT ? Math.sqrt(bubbleSeries.getZ(i2).doubleValue()) : bubbleSeries.getZ(i2).doubleValue(), this.bubbleBounds).floatValue());
            }
        }
    }
}