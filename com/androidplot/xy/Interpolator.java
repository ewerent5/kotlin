package com.androidplot.xy;

import com.androidplot.xy.InterpolationParams;
import java.util.List;

/* loaded from: classes.dex */
public interface Interpolator<ParamsType extends InterpolationParams> {
    List<XYCoords> interpolate(XYSeries xYSeries, ParamsType paramstype);
}