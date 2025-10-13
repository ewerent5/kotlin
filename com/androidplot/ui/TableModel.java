package com.androidplot.ui;

import android.graphics.RectF;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class TableModel {
    private TableOrder order;

    public enum Axis {
        ROW,
        COLUMN
    }

    public enum CellSizingMethod {
        FIXED,
        FILL
    }

    protected TableModel(TableOrder tableOrder) {
        setOrder(tableOrder);
    }

    public abstract Iterator<RectF> getIterator(RectF rectF, int i2);

    public TableOrder getOrder() {
        return this.order;
    }

    public void setOrder(TableOrder tableOrder) {
        this.order = tableOrder;
    }
}