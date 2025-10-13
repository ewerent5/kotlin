package com.androidplot.xy;

import android.util.Log;

/* loaded from: classes.dex */
public class LTTBSampler implements Sampler {
    @Override // com.androidplot.xy.Sampler
    public RectRegion run(XYSeries xYSeries, EditableXYSeries editableXYSeries) {
        RectRegion rectRegion = new RectRegion();
        int size = editableXYSeries.size();
        int size2 = xYSeries.size();
        if (size >= size2 || size == 0) {
            throw new RuntimeException("Shouldnt be here!");
        }
        int i2 = size - 2;
        double d2 = (size2 - 2) / i2;
        setSample(xYSeries, editableXYSeries, 0, 0, rectRegion);
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1;
        while (i4 < i2) {
            int i8 = i4 + 1;
            double d3 = i8 * d2;
            int i9 = i7;
            int iFloor = ((int) Math.floor(d3)) + i3;
            int iFloor2 = ((int) Math.floor((i4 + 2) * d2)) + i3;
            if (iFloor2 >= size2) {
                iFloor2 = size2;
            }
            int i10 = iFloor2 - iFloor;
            double dDoubleValue = 0.0d;
            double dDoubleValue2 = 0.0d;
            while (iFloor < iFloor2) {
                int i11 = iFloor + 0;
                if (xYSeries.getX(i11) != null) {
                    dDoubleValue += xYSeries.getX(i11).doubleValue();
                }
                if (xYSeries.getY(i11) != null) {
                    dDoubleValue2 += xYSeries.getY(i11).doubleValue();
                }
                iFloor++;
            }
            double d4 = i10;
            double d5 = dDoubleValue / d4;
            double d6 = dDoubleValue2 / d4;
            int i12 = i5 + 0;
            double dDoubleValue3 = xYSeries.getX(i12).doubleValue();
            double dDoubleValue4 = xYSeries.getY(i12).doubleValue();
            int iFloor3 = ((int) Math.floor(d3)) + 1;
            double d7 = -1.0d;
            XYCoords xYCoords = null;
            int i13 = i6;
            for (int iFloor4 = ((int) Math.floor((i4 + 0) * d2)) + 1; iFloor4 < iFloor3; iFloor4++) {
                int i14 = iFloor4 + 0;
                double dAbs = Math.abs(((dDoubleValue3 - d5) * (xYSeries.getY(i14).doubleValue() - dDoubleValue4)) - ((dDoubleValue3 - xYSeries.getX(i14).doubleValue()) * (d6 - dDoubleValue4))) * 0.5d;
                if (dAbs > d7) {
                    if (xYSeries.getY(i14) == null) {
                        Log.i("LTTB", "Null value encountered in raw data at index: " + iFloor4);
                    }
                    xYCoords = new XYCoords(xYSeries.getX(i14), xYSeries.getY(i14));
                    i13 = iFloor4;
                    d7 = dAbs;
                }
            }
            setSample(editableXYSeries, xYCoords.x, xYCoords.y, i9, rectRegion);
            i7 = i9 + 1;
            i5 = i13;
            i6 = i5;
            i4 = i8;
            i3 = 1;
        }
        setSample(xYSeries, editableXYSeries, (size2 + 0) - 1, i7, rectRegion);
        return rectRegion;
    }

    protected void setSample(XYSeries xYSeries, EditableXYSeries editableXYSeries, int i2, int i3, RectRegion rectRegion) {
        setSample(editableXYSeries, xYSeries.getX(i2), xYSeries.getY(i2), i3, rectRegion);
    }

    protected void setSample(EditableXYSeries editableXYSeries, Number number, Number number2, int i2, RectRegion rectRegion) {
        rectRegion.union(number, number2);
        editableXYSeries.setX(number, i2);
        editableXYSeries.setY(number2, i2);
    }
}