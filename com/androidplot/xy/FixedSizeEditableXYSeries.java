package com.androidplot.xy;

import com.androidplot.util.FastNumber;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class FixedSizeEditableXYSeries implements EditableXYSeries {
    private String title;
    private List<FastNumber> xVals = new ArrayList();
    private List<FastNumber> yVals = new ArrayList();

    public FixedSizeEditableXYSeries(String str, int i2) {
        setTitle(str);
        resize(i2);
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

    @Override // com.androidplot.xy.EditableXYSeries
    public void resize(int i2) {
        resize(this.xVals, i2);
        resize(this.yVals, i2);
    }

    public void setTitle(String str) {
        this.title = str;
    }

    @Override // com.androidplot.xy.EditableXYSeries
    public void setX(Number number, int i2) {
        this.xVals.set(i2, FastNumber.orNull(number));
    }

    @Override // com.androidplot.xy.EditableXYSeries
    public void setY(Number number, int i2) {
        this.yVals.set(i2, FastNumber.orNull(number));
    }

    @Override // com.androidplot.xy.XYSeries
    public int size() {
        return this.xVals.size();
    }

    protected void resize(List list, int i2) {
        if (i2 > list.size()) {
            while (list.size() < i2) {
                list.add(null);
            }
        } else if (i2 < list.size()) {
            while (list.size() > i2) {
                list.remove(list.size() - 1);
            }
        }
    }
}