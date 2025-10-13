package com.androidplot.xy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class CandlestickSeries {
    private SimpleXYSeries closeSeries;
    private SimpleXYSeries highSeries;
    private SimpleXYSeries lowSeries;
    private SimpleXYSeries openSeries;

    public static class Item {
        private double close;
        private double high;
        private double low;
        private double open;

        public Item(double d2, double d3, double d4, double d5) {
            this.low = d2;
            this.high = d3;
            this.open = d4;
            this.close = d5;
        }

        public double getClose() {
            return this.close;
        }

        public double getHigh() {
            return this.high;
        }

        public double getLow() {
            return this.low;
        }

        public double getOpen() {
            return this.open;
        }

        public void setClose(double d2) {
            this.close = d2;
        }

        public void setHigh(double d2) {
            this.high = d2;
        }

        public void setLow(double d2) {
            this.low = d2;
        }

        public void setOpen(double d2) {
            this.open = d2;
        }
    }

    public CandlestickSeries(Item... itemArr) {
        this((List<Item>) Arrays.asList(itemArr));
    }

    protected static List<Number> generateRange(int i2, int i3) {
        ArrayList arrayList = new ArrayList(i3 - i2);
        while (i2 < i3) {
            arrayList.add(Integer.valueOf(i2));
            i2++;
        }
        return arrayList;
    }

    public SimpleXYSeries getCloseSeries() {
        return this.closeSeries;
    }

    public SimpleXYSeries getHighSeries() {
        return this.highSeries;
    }

    public SimpleXYSeries getLowSeries() {
        return this.lowSeries;
    }

    public SimpleXYSeries getOpenSeries() {
        return this.openSeries;
    }

    public void setCloseSeries(SimpleXYSeries simpleXYSeries) {
        this.closeSeries = simpleXYSeries;
    }

    public void setHighSeries(SimpleXYSeries simpleXYSeries) {
        this.highSeries = simpleXYSeries;
    }

    public void setLowSeries(SimpleXYSeries simpleXYSeries) {
        this.lowSeries = simpleXYSeries;
    }

    public void setOpenSeries(SimpleXYSeries simpleXYSeries) {
        this.openSeries = simpleXYSeries;
    }

    public CandlestickSeries(List<Item> list) {
        this(generateRange(0, list.size()), list);
    }

    public CandlestickSeries(List<Number> list, List<Item> list2) {
        this.highSeries = new SimpleXYSeries(null);
        this.lowSeries = new SimpleXYSeries(null);
        this.openSeries = new SimpleXYSeries(null);
        this.closeSeries = new SimpleXYSeries(null);
        if (list.size() == list2.size()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                Number number = list.get(i2);
                this.highSeries.addLast(number, Double.valueOf(list2.get(i2).getHigh()));
                this.lowSeries.addLast(number, Double.valueOf(list2.get(i2).getLow()));
                this.openSeries.addLast(number, Double.valueOf(list2.get(i2).getOpen()));
                this.closeSeries.addLast(number, Double.valueOf(list2.get(i2).getClose()));
            }
            return;
        }
        throw new IllegalArgumentException("xVals and yVals length must be identical.");
    }
}