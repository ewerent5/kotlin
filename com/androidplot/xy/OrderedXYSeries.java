package com.androidplot.xy;

/* loaded from: classes.dex */
public interface OrderedXYSeries extends XYSeries {

    public enum XOrder {
        ASCENDING,
        DESCENDING,
        NONE
    }

    XOrder getXOrder();
}