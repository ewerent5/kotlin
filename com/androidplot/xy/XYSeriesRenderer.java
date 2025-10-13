package com.androidplot.xy;

import com.androidplot.ui.SeriesBundle;
import com.androidplot.ui.SeriesRenderer;
import com.androidplot.xy.XYSeries;
import com.androidplot.xy.XYSeriesFormatter;
import java.util.Hashtable;

/* loaded from: classes.dex */
public abstract class XYSeriesRenderer<SeriesType extends XYSeries, XYFormatterType extends XYSeriesFormatter> extends SeriesRenderer<XYPlot, SeriesType, XYFormatterType> {
    public XYSeriesRenderer(XYPlot xYPlot) {
        super(xYPlot);
    }

    public Hashtable<XYRegionFormatter, String> getUniqueRegionFormatters() {
        Hashtable<XYRegionFormatter, String> hashtable = new Hashtable<>();
        for (SeriesBundle<SeriesType, ? extends XYFormatterType> seriesBundle : getSeriesAndFormatterList()) {
            for (RectRegion rectRegion : ((XYSeriesFormatter) seriesBundle.getFormatter()).getRegions().elements()) {
                hashtable.put(((XYSeriesFormatter) seriesBundle.getFormatter()).getRegionFormatter(rectRegion), rectRegion.getLabel());
            }
        }
        return hashtable;
    }
}