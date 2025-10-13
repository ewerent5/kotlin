package com.androidplot.xy;

import android.content.Context;
import com.androidplot.ui.Formatter;
import com.androidplot.util.LayerHash;
import com.androidplot.util.Layerable;
import com.androidplot.xy.XYRegionFormatter;

/* loaded from: classes.dex */
public abstract class XYSeriesFormatter<XYRegionFormatterType extends XYRegionFormatter> extends Formatter<XYPlot> {
    private PointLabelFormatter pointLabelFormatter;
    private PointLabeler pointLabeler;
    LayerHash<RectRegion, XYRegionFormatterType> regions;

    public XYSeriesFormatter() {
        this.pointLabeler = new PointLabeler() { // from class: com.androidplot.xy.XYSeriesFormatter.1
            @Override // com.androidplot.xy.PointLabeler
            public String getLabel(XYSeries xYSeries, int i2) {
                return String.valueOf(xYSeries.getY(i2));
            }
        };
        this.regions = new LayerHash<>();
    }

    public void addRegion(RectRegion rectRegion, XYRegionFormatterType xyregionformattertype) {
        this.regions.addToBottom(rectRegion, xyregionformattertype);
    }

    public PointLabelFormatter getPointLabelFormatter() {
        if (this.pointLabelFormatter == null) {
            this.pointLabelFormatter = new PointLabelFormatter();
        }
        return this.pointLabelFormatter;
    }

    public PointLabeler getPointLabeler() {
        return this.pointLabeler;
    }

    public XYRegionFormatterType getRegionFormatter(RectRegion rectRegion) {
        return this.regions.get(rectRegion);
    }

    public Layerable<RectRegion> getRegions() {
        return this.regions;
    }

    public boolean hasPointLabelFormatter() {
        return this.pointLabelFormatter != null;
    }

    public void removeRegion(RectRegion rectRegion) {
        this.regions.remove(rectRegion);
    }

    public void setPointLabelFormatter(PointLabelFormatter pointLabelFormatter) {
        this.pointLabelFormatter = pointLabelFormatter;
    }

    public void setPointLabeler(PointLabeler pointLabeler) {
        this.pointLabeler = pointLabeler;
    }

    public XYSeriesFormatter(Context context, int i2) {
        super(context, i2);
        this.pointLabeler = new PointLabeler() { // from class: com.androidplot.xy.XYSeriesFormatter.1
            @Override // com.androidplot.xy.PointLabeler
            public String getLabel(XYSeries xYSeries, int i22) {
                return String.valueOf(xYSeries.getY(i22));
            }
        };
        this.regions = new LayerHash<>();
    }
}