package com.androidplot.xy;

import android.graphics.RectF;
import com.androidplot.Region;

/* loaded from: classes.dex */
public class XYStepCalculator {

    /* renamed from: com.androidplot.xy.XYStepCalculator$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$xy$Axis;
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$xy$StepMode;

        static {
            int[] iArr = new int[StepMode.values().length];
            $SwitchMap$com$androidplot$xy$StepMode = iArr;
            try {
                iArr[StepMode.INCREMENT_BY_VAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$androidplot$xy$StepMode[StepMode.INCREMENT_BY_FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$androidplot$xy$StepMode[StepMode.INCREMENT_BY_PIXELS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$androidplot$xy$StepMode[StepMode.SUBDIVIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Axis.values().length];
            $SwitchMap$com$androidplot$xy$Axis = iArr2;
            try {
                iArr2[Axis.DOMAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$androidplot$xy$Axis[Axis.RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static Step getStep(XYPlot xYPlot, Axis axis, RectF rectF) {
        int i2 = AnonymousClass1.$SwitchMap$com$androidplot$xy$Axis[axis.ordinal()];
        if (i2 == 1) {
            return getStep(xYPlot.getDomainStepMode(), xYPlot.getDomainStepValue(), xYPlot.getBounds().getxRegion(), new Region(Float.valueOf(rectF.left), Float.valueOf(rectF.right)));
        }
        if (i2 != 2) {
            return null;
        }
        return getStep(xYPlot.getRangeStepMode(), xYPlot.getRangeStepValue(), xYPlot.getBounds().getyRegion(), new Region(Float.valueOf(rectF.top), Float.valueOf(rectF.bottom)));
    }

    public static Step getStep(StepMode stepMode, double d2, Region region, Region region2) {
        double dDoubleValue;
        double dDoubleValue2;
        double dDoubleValue3;
        double d3;
        int i2 = AnonymousClass1.$SwitchMap$com$androidplot$xy$StepMode[stepMode.ordinal()];
        if (i2 == 1 || i2 == 2) {
            dDoubleValue = d2 / region.ratio(region2).doubleValue();
            dDoubleValue2 = d2;
            dDoubleValue3 = region2.length().doubleValue() / dDoubleValue;
        } else {
            if (i2 == 3) {
                double dDoubleValue4 = region.ratio(region2).doubleValue() * d2;
                d3 = d2;
                dDoubleValue3 = region2.length().doubleValue() / d2;
                dDoubleValue2 = dDoubleValue4;
            } else if (i2 != 4) {
                dDoubleValue3 = 0.0d;
                d3 = 0.0d;
                dDoubleValue2 = 0.0d;
            } else {
                dDoubleValue = region2.length().doubleValue() / (d2 - 1.0d);
                dDoubleValue3 = d2;
                dDoubleValue2 = region.ratio(region2).doubleValue() * dDoubleValue;
            }
            return new Step(dDoubleValue3, d3, dDoubleValue2);
        }
        d3 = dDoubleValue;
        return new Step(dDoubleValue3, d3, dDoubleValue2);
    }
}