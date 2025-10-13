package com.androidplot.xy;

import com.androidplot.Series;

/* loaded from: classes.dex */
public interface XYSeries extends Series {
    Number getX(int i2);

    Number getY(int i2);

    int size();
}