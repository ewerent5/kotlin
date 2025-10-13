package com.androidplot.pie;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.androidplot.Plot;
import com.androidplot.R;
import com.androidplot.ui.Anchor;
import com.androidplot.ui.DynamicTableModel;
import com.androidplot.ui.HorizontalPositioning;
import com.androidplot.ui.LayoutManager;
import com.androidplot.ui.Size;
import com.androidplot.ui.SizeMode;
import com.androidplot.ui.VerticalPositioning;
import com.androidplot.util.AttrUtils;
import com.androidplot.util.PixelUtils;

/* loaded from: classes.dex */
public class PieChart extends Plot<Segment, SegmentFormatter, PieRenderer, SegmentBundle, SegmentRegistry> {
    private static final int DEFAULT_LEGEND_WIDGET_H_DP = 30;
    private static final int DEFAULT_LEGEND_WIDGET_ICON_SIZE_DP = 18;
    private static final int DEFAULT_LEGEND_WIDGET_X_OFFSET_DP = 40;
    private static final int DEFAULT_LEGEND_WIDGET_Y_OFFSET_DP = 0;
    private static final int DEFAULT_PADDING_DP = 5;
    private static final int DEFAULT_PIE_WIDGET_H_DP = 18;
    private static final int DEFAULT_PIE_WIDGET_W_DP = 10;
    private static final int DEFAULT_PIE_WIDGET_X_OFFSET_DP = 0;
    private static final int DEFAULT_PIE_WIDGET_Y_OFFSET_DP = 0;
    private PieLegendWidget legend;
    private PieWidget pie;

    public PieChart(Context context, String str) {
        super(context, str);
    }

    public void addSegment(Segment segment, SegmentFormatter segmentFormatter) {
        addSeries((PieChart) segment, (Segment) segmentFormatter);
    }

    public PieLegendWidget getLegend() {
        return this.legend;
    }

    public PieWidget getPie() {
        return this.pie;
    }

    @Override // com.androidplot.Plot
    protected void onPreInit() {
        LayoutManager layoutManager = getLayoutManager();
        float fDpToPix = PixelUtils.dpToPix(18.0f);
        SizeMode sizeMode = SizeMode.FILL;
        PieWidget pieWidget = new PieWidget(layoutManager, this, new Size(fDpToPix, sizeMode, PixelUtils.dpToPix(10.0f), sizeMode));
        this.pie = pieWidget;
        pieWidget.position(PixelUtils.dpToPix(0.0f), HorizontalPositioning.ABSOLUTE_FROM_CENTER, PixelUtils.dpToPix(0.0f), VerticalPositioning.ABSOLUTE_FROM_CENTER, Anchor.CENTER);
        LayoutManager layoutManager2 = getLayoutManager();
        float fDpToPix2 = PixelUtils.dpToPix(30.0f);
        SizeMode sizeMode2 = SizeMode.ABSOLUTE;
        PieLegendWidget pieLegendWidget = new PieLegendWidget(layoutManager2, this, new Size(fDpToPix2, sizeMode2, 0.5f, SizeMode.RELATIVE), new DynamicTableModel(0, 1), new Size(PixelUtils.dpToPix(18.0f), sizeMode2, PixelUtils.dpToPix(18.0f), sizeMode2));
        this.legend = pieLegendWidget;
        pieLegendWidget.position(PixelUtils.dpToPix(40.0f), HorizontalPositioning.ABSOLUTE_FROM_RIGHT, PixelUtils.dpToPix(0.0f), VerticalPositioning.ABSOLUTE_FROM_BOTTOM, Anchor.RIGHT_BOTTOM);
        this.legend.setVisible(false);
        float fDpToPix3 = PixelUtils.dpToPix(5.0f);
        this.pie.setPadding(fDpToPix3, fDpToPix3, fDpToPix3, fDpToPix3);
    }

    @Override // com.androidplot.Plot
    protected void processAttrs(TypedArray typedArray) {
        AttrUtils.configureLinePaint(typedArray, getBorderPaint(), R.styleable.pie_PieChart_pieBorderColor, R.styleable.pie_PieChart_pieBorderThickness);
    }

    public void removeSegment(Segment segment) {
        removeSeries(segment);
    }

    public void setLegend(PieLegendWidget pieLegendWidget) {
        this.legend = pieLegendWidget;
    }

    public void setPie(PieWidget pieWidget) {
        this.pie = pieWidget;
    }

    public PieChart(Context context, String str, Plot.RenderMode renderMode) {
        super(context, str, renderMode);
    }

    @Override // com.androidplot.Plot
    public SegmentRegistry getRegistryInstance() {
        return new SegmentRegistry();
    }

    public PieChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}