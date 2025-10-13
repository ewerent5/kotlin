package com.androidplot.xy;

/* loaded from: classes.dex */
public class StepModel {
    private StepMode mode;
    private double value;

    public StepModel(StepMode stepMode, double d2) {
        setMode(stepMode);
        setValue(d2);
    }

    public StepMode getMode() {
        return this.mode;
    }

    public double getValue() {
        return this.value;
    }

    public void setMode(StepMode stepMode) {
        this.mode = stepMode;
    }

    public void setValue(double d2) {
        this.value = d2;
    }
}