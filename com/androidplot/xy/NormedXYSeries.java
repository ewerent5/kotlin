package com.androidplot.xy;

import com.androidplot.Region;
import com.androidplot.util.SeriesUtils;

/* loaded from: classes.dex */
public class NormedXYSeries implements XYSeries {
    private Region minMaxX;
    private Region minMaxY;
    private XYSeries rawData;
    private Region transformX;
    private Region transformY;

    public static class Norm {
        final Region minMax;
        final double offset;
        final boolean useOffsetCompression;

        public Norm(Region region) {
            this(region, 0.0d, false);
        }

        public Norm(Region region, double d2, boolean z) {
            this.minMax = region;
            this.offset = d2;
            this.useOffsetCompression = z;
            if (z) {
                if (d2 <= -1.0d || d2 >= 1.0d) {
                    throw new IllegalArgumentException("When useOffsetCompression is true, offset must be > -1 and < 1.");
                }
            }
        }
    }

    public NormedXYSeries(XYSeries xYSeries) {
        this(xYSeries, null, new Norm(null, 0.0d, false));
    }

    protected Region calculateTransform(Norm norm) {
        if (!norm.useOffsetCompression) {
            return new Region(Double.valueOf(norm.offset + 0.0d), Double.valueOf(norm.offset + 1.0d));
        }
        double d2 = norm.offset;
        if (d2 <= 0.0d) {
            d2 = 0.0d;
        }
        Double dValueOf = Double.valueOf(d2);
        double d3 = norm.offset;
        return new Region(dValueOf, Double.valueOf(d3 < 0.0d ? 1.0d + d3 : 1.0d));
    }

    public Number denormalizeXVal(Number number) {
        if (number != null) {
            return this.transformX.transform(number.doubleValue(), this.minMaxX);
        }
        return null;
    }

    public Number denormalizeYVal(Number number) {
        if (number != null) {
            return this.transformY.transform(number.doubleValue(), this.minMaxY);
        }
        return null;
    }

    @Override // com.androidplot.Series
    public String getTitle() {
        return this.rawData.getTitle();
    }

    @Override // com.androidplot.xy.XYSeries
    public Number getX(int i2) {
        Number x = this.rawData.getX(i2);
        return (x == null || this.transformX == null) ? x : this.minMaxX.transform(x.doubleValue(), this.transformX);
    }

    @Override // com.androidplot.xy.XYSeries
    public Number getY(int i2) {
        Number y = this.rawData.getY(i2);
        return (y == null || this.transformY == null) ? y : this.minMaxY.transform(y.doubleValue(), this.transformY);
    }

    protected void normalize(Norm norm, Norm norm2) {
        if (norm != null) {
            Region regionMinMaxX = norm.minMax;
            if (regionMinMaxX == null) {
                regionMinMaxX = SeriesUtils.minMaxX(this.rawData);
            }
            this.minMaxX = regionMinMaxX;
            this.transformX = calculateTransform(norm);
        }
        if (norm2 != null) {
            Region regionMinMaxY = norm2.minMax;
            if (regionMinMaxY == null) {
                regionMinMaxY = SeriesUtils.minMaxY(this.rawData);
            }
            this.minMaxY = regionMinMaxY;
            this.transformY = calculateTransform(norm2);
        }
    }

    @Override // com.androidplot.xy.XYSeries
    public int size() {
        return this.rawData.size();
    }

    public NormedXYSeries(XYSeries xYSeries, Norm norm, Norm norm2) {
        this.rawData = xYSeries;
        normalize(norm, norm2);
    }
}