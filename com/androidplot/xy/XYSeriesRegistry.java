package com.androidplot.xy;

import com.androidplot.SeriesRegistry;
import java.util.Iterator;

/* loaded from: classes.dex */
public class XYSeriesRegistry extends SeriesRegistry<XYSeriesBundle, XYSeries, XYSeriesFormatter> {
    private Estimator estimator;

    public void estimate(XYPlot xYPlot) {
        if (this.estimator != null) {
            Iterator<XYSeriesBundle> it = getSeriesAndFormatterList().iterator();
            while (it.hasNext()) {
                getEstimator().run(xYPlot, it.next());
            }
        }
    }

    public Estimator getEstimator() {
        return this.estimator;
    }

    public void setEstimator(Estimator estimator) {
        this.estimator = estimator;
    }

    @Override // com.androidplot.SeriesRegistry
    public XYSeriesBundle newSeriesBundle(XYSeries xYSeries, XYSeriesFormatter xYSeriesFormatter) {
        return new XYSeriesBundle(xYSeries, xYSeriesFormatter);
    }
}