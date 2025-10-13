package com.androidplot.xy;

/* loaded from: classes.dex */
public class ZoomEstimator extends Estimator {
    protected double calculateZoom(SampledXYSeries sampledXYSeries, RectRegion rectRegion) {
        double dAbs = Math.abs(Math.round(sampledXYSeries.getMaxZoomFactor() / sampledXYSeries.getBounds().getxRegion().ratio(rectRegion.getxRegion()).doubleValue()));
        if (dAbs > 0.0d) {
            return dAbs;
        }
        return 1.0d;
    }

    @Override // com.androidplot.xy.Estimator
    public void run(XYPlot xYPlot, XYSeriesBundle xYSeriesBundle) {
        if (xYSeriesBundle.getSeries() instanceof SampledXYSeries) {
            SampledXYSeries sampledXYSeries = (SampledXYSeries) xYSeriesBundle.getSeries();
            sampledXYSeries.setZoomFactor(calculateZoom(sampledXYSeries, xYPlot.getBounds()));
        }
    }
}