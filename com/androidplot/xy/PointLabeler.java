package com.androidplot.xy;

import com.androidplot.xy.XYSeries;

/* loaded from: classes.dex */
public interface PointLabeler<SeriesType extends XYSeries> {
    String getLabel(SeriesType seriestype, int i2);
}