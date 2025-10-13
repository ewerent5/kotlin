package com.androidplot.xy;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class CatmullRomInterpolator implements Interpolator<Params> {

    static class ExtrapolatedXYSeries implements XYSeries {
        private final XYCoords first;
        private final XYCoords last;
        private final XYSeries series;

        public ExtrapolatedXYSeries(XYSeries xYSeries, XYCoords xYCoords, XYCoords xYCoords2) {
            this.series = xYSeries;
            this.first = xYCoords;
            this.last = xYCoords2;
        }

        @Override // com.androidplot.Series
        public String getTitle() {
            return this.series.getTitle();
        }

        @Override // com.androidplot.xy.XYSeries
        public Number getX(int i2) {
            return i2 == 0 ? this.first.x : i2 == this.series.size() + 1 ? this.last.x : this.series.getX(i2 - 1);
        }

        @Override // com.androidplot.xy.XYSeries
        public Number getY(int i2) {
            return i2 == 0 ? this.first.y : i2 == this.series.size() + 1 ? this.last.y : this.series.getY(i2 - 1);
        }

        @Override // com.androidplot.xy.XYSeries
        public int size() {
            return this.series.size() + 2;
        }
    }

    public static class Params implements InterpolationParams {
        private int pointPerSegment;
        private Type type;

        public Params(int i2, Type type) {
            this.pointPerSegment = i2;
            this.type = type;
        }

        @Override // com.androidplot.xy.InterpolationParams
        public Class<CatmullRomInterpolator> getInterpolatorClass() {
            return CatmullRomInterpolator.class;
        }

        public int getPointPerSegment() {
            return this.pointPerSegment;
        }

        public Type getType() {
            return this.type;
        }

        public void setPointPerSegment(int i2) {
            this.pointPerSegment = i2;
        }

        public void setType(Type type) {
            this.type = type;
        }
    }

    public enum Type {
        Uniform,
        Centripetal
    }

    @Override // com.androidplot.xy.Interpolator
    public List<XYCoords> interpolate(XYSeries xYSeries, Params params) {
        if (params.getPointPerSegment() < 2) {
            throw new IllegalArgumentException("pointsPerSegment must be greater than 2, since 2 points is just the linear segment.");
        }
        if (xYSeries.size() < 3) {
            throw new IllegalArgumentException("Cannot interpolate a series with fewer than 3 vertices.");
        }
        XYCoords xYCoords = new XYCoords(Double.valueOf(xYSeries.getX(0).doubleValue() - (xYSeries.getX(1).doubleValue() - xYSeries.getX(0).doubleValue())), Double.valueOf(xYSeries.getY(0).doubleValue() - (xYSeries.getY(1).doubleValue() - xYSeries.getY(0).doubleValue())));
        int size = xYSeries.size() - 1;
        int i2 = size - 1;
        ExtrapolatedXYSeries extrapolatedXYSeries = new ExtrapolatedXYSeries(xYSeries, xYCoords, new XYCoords(Double.valueOf(xYSeries.getX(size).doubleValue() + (xYSeries.getX(size).doubleValue() - xYSeries.getX(i2).doubleValue())), Double.valueOf(xYSeries.getY(size).doubleValue() + (xYSeries.getY(size).doubleValue() - xYSeries.getY(i2).doubleValue()))));
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < extrapolatedXYSeries.size() - 3; i3++) {
            List<XYCoords> listInterpolate = interpolate(extrapolatedXYSeries, i3, params);
            if (arrayList.size() > 0) {
                listInterpolate.remove(0);
            }
            arrayList.addAll(listInterpolate);
        }
        return arrayList;
    }

    protected List<XYCoords> interpolate(XYSeries xYSeries, int i2, Params params) {
        double dPow;
        ArrayList arrayList = new ArrayList();
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        double[] dArr3 = new double[4];
        for (int i3 = 0; i3 < 4; i3++) {
            int i4 = i2 + i3;
            dArr[i3] = xYSeries.getX(i4).doubleValue();
            dArr2[i3] = xYSeries.getY(i4).doubleValue();
            dArr3[i3] = i3;
        }
        double d2 = 1.0d;
        double d3 = 2.0d;
        if (params.getType() != Type.Uniform) {
            double d4 = 0.0d;
            int i5 = 1;
            for (int i6 = 4; i5 < i6; i6 = 4) {
                int i7 = i5 - 1;
                double d5 = dArr[i5] - dArr[i7];
                double d6 = dArr2[i5] - dArr2[i7];
                if (params.getType() == Type.Centripetal) {
                    dPow = Math.pow((d5 * d5) + (d6 * d6), 0.25d);
                } else {
                    dPow = Math.pow((d5 * d5) + (d6 * d6), 0.5d);
                }
                d4 += dPow;
                dArr3[i5] = d4;
                i5++;
            }
            d2 = dArr3[1];
            d3 = dArr3[2];
        }
        int pointPerSegment = params.getPointPerSegment() - 1;
        int i8 = i2 + 1;
        arrayList.add(new XYCoords(xYSeries.getX(i8), xYSeries.getY(i8)));
        for (int i9 = 1; i9 < pointPerSegment; i9++) {
            double d7 = ((i9 * (d3 - d2)) / pointPerSegment) + d2;
            arrayList.add(new XYCoords(Double.valueOf(interpolate(dArr, dArr3, d7)), Double.valueOf(interpolate(dArr2, dArr3, d7))));
        }
        int i10 = i2 + 2;
        arrayList.add(new XYCoords(xYSeries.getX(i10), xYSeries.getY(i10)));
        return arrayList;
    }

    protected static double interpolate(double[] dArr, double[] dArr2, double d2) {
        double d3 = ((dArr[0] * (dArr2[1] - d2)) / (dArr2[1] - dArr2[0])) + ((dArr[1] * (d2 - dArr2[0])) / (dArr2[1] - dArr2[0]));
        double d4 = ((dArr[1] * (dArr2[2] - d2)) / (dArr2[2] - dArr2[1])) + ((dArr[2] * (d2 - dArr2[1])) / (dArr2[2] - dArr2[1]));
        double d5 = ((dArr[2] * (dArr2[3] - d2)) / (dArr2[3] - dArr2[2])) + ((dArr[3] * (d2 - dArr2[2])) / (dArr2[3] - dArr2[2]));
        return (((((d3 * (dArr2[2] - d2)) / (dArr2[2] - dArr2[0])) + (((d2 - dArr2[0]) * d4) / (dArr2[2] - dArr2[0]))) * (dArr2[2] - d2)) / (dArr2[2] - dArr2[1])) + (((((d4 * (dArr2[3] - d2)) / (dArr2[3] - dArr2[1])) + ((d5 * (d2 - dArr2[1])) / (dArr2[3] - dArr2[1]))) * (d2 - dArr2[1])) / (dArr2[2] - dArr2[1]));
    }
}