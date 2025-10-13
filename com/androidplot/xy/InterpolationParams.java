package com.androidplot.xy;

import com.androidplot.xy.Interpolator;

/* loaded from: classes.dex */
public interface InterpolationParams<InterpolatorType extends Interpolator> {
    Class<InterpolatorType> getInterpolatorClass();
}