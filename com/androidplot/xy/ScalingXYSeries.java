package com.androidplot.xy;

/* loaded from: classes.dex */
public class ScalingXYSeries implements XYSeries {
    private Mode mode;
    private double scale;
    private XYSeries series;

    public enum Mode {
        X_ONLY,
        Y_ONLY,
        X_AND_Y
    }

    public ScalingXYSeries(XYSeries xYSeries, double d2, Mode mode) {
        this.series = xYSeries;
        this.scale = d2;
        this.mode = mode;
    }

    public double getScale() {
        return this.scale;
    }

    @Override // com.androidplot.Series
    public String getTitle() {
        return this.series.getTitle();
    }

    @Override // com.androidplot.xy.XYSeries
    public Number getX(int i2) {
        Number x = this.series.getX(i2);
        Mode mode = this.mode;
        if (mode != Mode.X_ONLY && mode != Mode.X_AND_Y) {
            return x;
        }
        if (x == null) {
            return null;
        }
        return Double.valueOf(x.doubleValue() * this.scale);
    }

    @Override // com.androidplot.xy.XYSeries
    public Number getY(int i2) {
        Number y = this.series.getY(i2);
        Mode mode = this.mode;
        if (mode != Mode.Y_ONLY && mode != Mode.X_AND_Y) {
            return y;
        }
        if (y == null) {
            return null;
        }
        return Double.valueOf(y.doubleValue() * this.scale);
    }

    public void setScale(double d2) {
        this.scale = d2;
    }

    @Override // com.androidplot.xy.XYSeries
    public int size() {
        return this.series.size();
    }
}