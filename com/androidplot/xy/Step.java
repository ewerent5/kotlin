package com.androidplot.xy;

/* loaded from: classes.dex */
public class Step {
    private final double stepCount;
    private final double stepPix;
    private final double stepVal;

    public Step(double d2, double d3, double d4) {
        this.stepCount = d2;
        this.stepPix = d3;
        this.stepVal = d4;
    }

    public double getStepCount() {
        return this.stepCount;
    }

    public double getStepPix() {
        return this.stepPix;
    }

    public double getStepVal() {
        return this.stepVal;
    }
}