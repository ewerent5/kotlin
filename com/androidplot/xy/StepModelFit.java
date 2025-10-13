package com.androidplot.xy;

import ch.qos.logback.core.CoreConstants;
import com.androidplot.Region;
import java.util.Arrays;

/* loaded from: classes.dex */
public class StepModelFit extends StepModel {
    private Region scale;
    private double[] steps;

    public StepModelFit(Region region, double[] dArr, double d2) {
        super(StepMode.INCREMENT_BY_FIT, d2);
        setSteps(dArr);
        setScale(region);
    }

    public Region getScale() {
        return this.scale;
    }

    public double[] getSteps() {
        return this.steps;
    }

    @Override // com.androidplot.xy.StepModel
    public double getValue() {
        Region region;
        if (this.steps == null || (region = this.scale) == null || !region.isDefined()) {
            return super.getValue();
        }
        double d2 = this.steps[0];
        double dAbs = Math.abs((this.scale.length().doubleValue() / d2) - super.getValue());
        for (double d3 : this.steps) {
            double dAbs2 = Math.abs((this.scale.length().doubleValue() / d3) - super.getValue());
            if (dAbs2 < dAbs) {
                d2 = d3;
                dAbs = dAbs2;
            }
        }
        return d2;
    }

    public void setScale(Region region) {
        this.scale = region;
    }

    public void setSteps(double[] dArr) {
        if (dArr == null || dArr.length == 0) {
            return;
        }
        for (double d2 : dArr) {
            if (d2 <= 0.0d) {
                return;
            }
        }
        this.steps = dArr;
    }

    public String toString() {
        return "StepModelFit{steps=" + Arrays.toString(this.steps) + ", scale=" + this.scale + ", current stepping=" + getValue() + CoreConstants.CURLY_RIGHT;
    }
}