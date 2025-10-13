package com.androidplot.xy;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class BubbleSeries implements XYSeries {
    private String title;
    private List<Number> xVals;
    private List<Number> yVals;
    private List<Number> zVals;

    public BubbleSeries(Number... numberArr) {
        if (numberArr == null || numberArr.length % 3 > 0) {
            throw new RuntimeException("BubbleSeries interleave array length must be a non-zero multiple of 3.");
        }
        this.xVals = new ArrayList();
        this.yVals = new ArrayList();
        this.zVals = new ArrayList();
        for (int i2 = 0; i2 < numberArr.length; i2 += 3) {
            this.xVals.add(numberArr[i2]);
            this.yVals.add(numberArr[i2 + 1]);
            this.zVals.add(numberArr[i2 + 2]);
        }
    }

    @Override // com.androidplot.Series
    public String getTitle() {
        return this.title;
    }

    @Override // com.androidplot.xy.XYSeries
    public Number getX(int i2) {
        return this.xVals.get(i2);
    }

    @Override // com.androidplot.xy.XYSeries
    public Number getY(int i2) {
        return this.yVals.get(i2);
    }

    public Number getZ(int i2) {
        return this.zVals.get(i2);
    }

    public List<Number> getZVals() {
        return this.zVals;
    }

    @Override // com.androidplot.xy.XYSeries
    public int size() {
        return this.xVals.size();
    }

    public BubbleSeries(List<Number> list, List<Number> list2, String str) {
        this.yVals = list;
        this.zVals = list2;
        this.title = str;
        this.xVals = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list2.size(); i2++) {
            this.xVals.add(Integer.valueOf(i2));
        }
    }

    public BubbleSeries(List<Number> list, List<Number> list2, List<Number> list3, String str) {
        this.xVals = list;
        this.yVals = list2;
        this.zVals = list3;
        this.title = str;
    }
}