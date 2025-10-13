package com.androidplot.xy;

import com.androidplot.Series;

/* loaded from: classes.dex */
public abstract class CandlestickMaker {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public static void check(CandlestickSeries candlestickSeries) {
        check(candlestickSeries.getOpenSeries(), candlestickSeries.getCloseSeries(), candlestickSeries.getHighSeries(), candlestickSeries.getLowSeries());
    }

    public static void make(XYPlot xYPlot, CandlestickFormatter candlestickFormatter, XYSeries xYSeries, XYSeries xYSeries2, XYSeries xYSeries3, XYSeries xYSeries4) {
        xYPlot.addSeries((XYPlot) candlestickFormatter, (Series[]) new XYSeries[]{xYSeries3, xYSeries4, xYSeries, xYSeries2});
    }

    public static void check(XYSeries xYSeries, XYSeries xYSeries2, XYSeries xYSeries3, XYSeries xYSeries4) {
        int size = xYSeries.size();
        for (int i2 = 0; i2 < size; i2++) {
            xYSeries3.getY(i2).doubleValue();
            xYSeries4.getY(i2).doubleValue();
            xYSeries.getY(i2).doubleValue();
            xYSeries2.getY(i2).doubleValue();
        }
    }

    public static void make(XYPlot xYPlot, CandlestickFormatter candlestickFormatter, CandlestickSeries candlestickSeries) {
        make(xYPlot, candlestickFormatter, candlestickSeries.getOpenSeries(), candlestickSeries.getCloseSeries(), candlestickSeries.getHighSeries(), candlestickSeries.getLowSeries());
    }
}