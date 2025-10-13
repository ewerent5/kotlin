package com.androidplot.util;

import com.androidplot.Region;
import com.androidplot.xy.OrderedXYSeries;
import com.androidplot.xy.RectRegion;
import com.androidplot.xy.XYConstraints;
import com.androidplot.xy.XYSeries;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class SeriesUtils {
    protected static Region getNullRegion(XYSeries xYSeries, int i2) {
        Region region = new Region();
        if (xYSeries.getX(i2) != null) {
            throw new IllegalArgumentException("Attempt to find null region for non null index: " + i2);
        }
        int i3 = i2 - 1;
        while (true) {
            if (i3 < 0) {
                break;
            }
            if (xYSeries.getX(i3) != null) {
                region.setMin(Integer.valueOf(i3));
                break;
            }
            i3--;
        }
        while (true) {
            i2++;
            if (i2 >= xYSeries.size()) {
                break;
            }
            if (xYSeries.getX(i2) != null) {
                region.setMax(Integer.valueOf(i2));
                break;
            }
        }
        return region;
    }

    public static OrderedXYSeries.XOrder getXYOrder(XYSeries xYSeries) {
        return xYSeries instanceof OrderedXYSeries ? ((OrderedXYSeries) xYSeries).getXOrder() : OrderedXYSeries.XOrder.NONE;
    }

    public static Region iBounds(XYSeries xYSeries, RectRegion rectRegion) {
        float f2 = xYSeries.size() >= 200 ? 50.0f : 1.0f;
        return new Region(Integer.valueOf(iBoundsMin(xYSeries, rectRegion.getMinX().doubleValue(), f2)), Integer.valueOf(iBoundsMax(xYSeries, rectRegion.getMaxX().doubleValue(), f2)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        r2 = r2 - 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static int iBoundsMax(com.androidplot.xy.XYSeries r7, double r8, float r10) {
        /*
            int r0 = r7.size()
            int r0 = r0 + (-1)
            int r1 = r7.size()
            float r2 = (float) r1
            float r2 = r2 / r10
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
        L12:
            if (r2 < 0) goto L3b
            int r3 = (int) r10
            int r3 = r3 * r2
            r4 = 0
        L18:
            float r5 = (float) r4
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 >= 0) goto L38
            int r5 = r3 + r4
            if (r5 >= r1) goto L35
            java.lang.Number r6 = r7.getX(r5)
            if (r6 == 0) goto L35
            double r3 = r6.doubleValue()
            int r6 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r6 <= 0) goto L31
            r0 = r5
            goto L38
        L31:
            if (r6 != 0) goto L34
            return r5
        L34:
            return r0
        L35:
            int r4 = r4 + 1
            goto L18
        L38:
            int r2 = r2 + (-1)
            goto L12
        L3b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.androidplot.util.SeriesUtils.iBoundsMax(com.androidplot.xy.XYSeries, double, float):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static int iBoundsMin(com.androidplot.xy.XYSeries r9, double r10, float r12) {
        /*
            int r0 = r9.size()
            float r0 = (float) r0
            float r0 = r0 / r12
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            r1 = 1
            r2 = 0
            r3 = 1
        Lf:
            if (r3 > r0) goto L45
            int r4 = (int) r12
            int r4 = r4 * r3
            r5 = 1
        L15:
            float r6 = (float) r5
            int r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r6 > 0) goto L42
            int r6 = r4 - r5
            if (r6 >= 0) goto L1f
            goto L42
        L1f:
            int r7 = r9.size()
            if (r6 >= r7) goto L3f
            java.lang.Number r7 = r9.getX(r6)
            if (r7 == 0) goto L3f
            double r4 = r7.doubleValue()
            int r8 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r8 >= 0) goto L35
            r2 = r6
            goto L42
        L35:
            double r0 = r7.doubleValue()
            int r9 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r9 != 0) goto L3e
            return r6
        L3e:
            return r2
        L3f:
            int r5 = r5 + 1
            goto L15
        L42:
            int r3 = r3 + 1
            goto Lf
        L45:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.androidplot.util.SeriesUtils.iBoundsMin(com.androidplot.xy.XYSeries, double, float):int");
    }

    public static RectRegion minMax(List<XYSeries> list) {
        return minMax((XYConstraints) null, list);
    }

    public static Region minMaxX(XYSeries... xYSeriesArr) {
        Region region = new Region();
        for (XYSeries xYSeries : xYSeriesArr) {
            for (int i2 = 0; i2 < xYSeries.size(); i2++) {
                region.union(xYSeries.getX(i2));
            }
        }
        return region;
    }

    public static Region minMaxY(XYSeries... xYSeriesArr) {
        Region region = new Region();
        for (XYSeries xYSeries : xYSeriesArr) {
            for (int i2 = 0; i2 < xYSeries.size(); i2++) {
                region.union(xYSeries.getY(i2));
            }
        }
        return region;
    }

    public static RectRegion minMax(XYSeries... xYSeriesArr) {
        return minMax((XYConstraints) null, xYSeriesArr);
    }

    public static RectRegion minMax(XYConstraints xYConstraints, List<XYSeries> list) {
        return minMax(xYConstraints, (XYSeries[]) list.toArray(new XYSeries[list.size()]));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.androidplot.xy.RectRegion minMax(com.androidplot.xy.XYConstraints r9, com.androidplot.xy.XYSeries... r10) {
        /*
            com.androidplot.xy.RectRegion r0 = new com.androidplot.xy.RectRegion
            r0.<init>()
            if (r10 == 0) goto L4b
            int r1 = r10.length
            if (r1 <= 0) goto L4b
            int r1 = r10.length
            r2 = 0
            r3 = 0
        Ld:
            if (r3 >= r1) goto L4b
            r4 = r10[r3]
            boolean r5 = r4 instanceof com.androidplot.xy.FastXYSeries
            if (r5 == 0) goto L2b
            r5 = r4
            com.androidplot.xy.FastXYSeries r5 = (com.androidplot.xy.FastXYSeries) r5
            com.androidplot.xy.RectRegion r5 = r5.minMax()
            if (r5 != 0) goto L1f
            goto L48
        L1f:
            if (r9 == 0) goto L27
            boolean r6 = r9.contains(r5)
            if (r6 == 0) goto L2b
        L27:
            r0.union(r5)
            goto L48
        L2b:
            r5 = 0
        L2c:
            int r6 = r4.size()
            if (r5 >= r6) goto L48
            java.lang.Number r6 = r4.getX(r5)
            java.lang.Number r7 = r4.getY(r5)
            if (r9 == 0) goto L42
            boolean r8 = r9.contains(r6, r7)
            if (r8 == 0) goto L45
        L42:
            r0.union(r6, r7)
        L45:
            int r5 = r5 + 1
            goto L2c
        L48:
            int r3 = r3 + 1
            goto Ld
        L4b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.androidplot.util.SeriesUtils.minMax(com.androidplot.xy.XYConstraints, com.androidplot.xy.XYSeries[]):com.androidplot.xy.RectRegion");
    }

    public static Region minMax(Region region, List<Number>... listArr) {
        for (List<Number> list : listArr) {
            Iterator<Number> it = list.iterator();
            while (it.hasNext()) {
                region.union(it.next());
            }
        }
        return region;
    }

    public static Region minMax(List<Number>... listArr) {
        return minMax(new Region(), listArr);
    }
}