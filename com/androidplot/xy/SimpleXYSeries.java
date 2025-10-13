package com.androidplot.xy;

import android.graphics.Canvas;
import com.androidplot.Plot;
import com.androidplot.PlotListener;
import com.androidplot.xy.OrderedXYSeries;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public class SimpleXYSeries implements EditableXYSeries, OrderedXYSeries, PlotListener {
    private ReentrantReadWriteLock lock;
    private volatile String title;
    private OrderedXYSeries.XOrder xOrder;
    private volatile LinkedList<Number> xVals;
    private volatile LinkedList<Number> yVals;

    /* renamed from: com.androidplot.xy.SimpleXYSeries$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$xy$SimpleXYSeries$ArrayFormat;

        static {
            int[] iArr = new int[ArrayFormat.values().length];
            $SwitchMap$com$androidplot$xy$SimpleXYSeries$ArrayFormat = iArr;
            try {
                iArr[ArrayFormat.Y_VALS_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$androidplot$xy$SimpleXYSeries$ArrayFormat[ArrayFormat.XY_VALS_INTERLEAVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum ArrayFormat {
        Y_VALS_ONLY,
        XY_VALS_INTERLEAVED
    }

    public SimpleXYSeries(String str) {
        this.xVals = new LinkedList<>();
        this.yVals = new LinkedList<>();
        this.title = null;
        this.lock = new ReentrantReadWriteLock(true);
        this.xOrder = OrderedXYSeries.XOrder.NONE;
        this.title = str;
    }

    protected static List<Number> asNumberList(Number... numberArr) {
        ArrayList arrayList = new ArrayList(numberArr.length);
        Collections.addAll(arrayList, numberArr);
        return arrayList;
    }

    public void addFirst(Number number, Number number2) {
        this.lock.writeLock().lock();
        try {
            if (this.xVals != null) {
                this.xVals.addFirst(number);
            }
            this.yVals.addFirst(number2);
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    public void addLast(Number number, Number number2) {
        this.lock.writeLock().lock();
        try {
            if (this.xVals != null) {
                this.xVals.addLast(number);
            }
            this.yVals.addLast(number2);
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    public void clear() {
        this.lock.writeLock().lock();
        try {
            if (this.xVals != null) {
                this.xVals.clear();
            }
            this.yVals.clear();
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    @Override // com.androidplot.Series
    public String getTitle() {
        return this.title;
    }

    @Override // com.androidplot.xy.XYSeries
    public Number getX(int i2) {
        return this.xVals != null ? this.xVals.get(i2) : Integer.valueOf(i2);
    }

    @Override // com.androidplot.xy.OrderedXYSeries
    public OrderedXYSeries.XOrder getXOrder() {
        return this.xOrder;
    }

    @Override // com.androidplot.xy.XYSeries
    public Number getY(int i2) {
        return this.yVals.get(i2);
    }

    public LinkedList<Number> getxVals() {
        return this.xVals;
    }

    public LinkedList<Number> getyVals() {
        return this.yVals;
    }

    @Override // com.androidplot.PlotListener
    public void onAfterDraw(Plot plot, Canvas canvas) {
        this.lock.readLock().unlock();
    }

    @Override // com.androidplot.PlotListener
    public void onBeforeDraw(Plot plot, Canvas canvas) {
        this.lock.readLock().lock();
    }

    public XYCoords removeFirst() {
        this.lock.writeLock().lock();
        try {
            if (size() > 0) {
                return new XYCoords(this.xVals != null ? this.xVals.removeFirst() : 0, this.yVals.removeFirst());
            }
            throw new NoSuchElementException();
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    public XYCoords removeLast() {
        this.lock.writeLock().lock();
        try {
            if (size() > 0) {
                return new XYCoords(this.xVals != null ? this.xVals.removeLast() : Integer.valueOf(this.yVals.size() - 1), this.yVals.removeLast());
            }
            throw new NoSuchElementException();
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    @Override // com.androidplot.xy.EditableXYSeries
    public void resize(int i2) {
        try {
            this.lock.writeLock().lock();
            if (this.xVals.size() < i2) {
                for (int size = this.xVals.size(); size < i2; size++) {
                    this.xVals.add(null);
                    this.yVals.add(null);
                }
            } else if (this.xVals.size() > i2) {
                for (int size2 = this.xVals.size(); size2 > i2; size2--) {
                    this.xVals.removeLast();
                    this.yVals.removeLast();
                }
            }
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    public void setModel(List<? extends Number> list, ArrayFormat arrayFormat) {
        this.lock.writeLock().lock();
        try {
            this.xVals.clear();
            this.yVals.clear();
            if (list != null && list.size() != 0) {
                int i2 = AnonymousClass1.$SwitchMap$com$androidplot$xy$SimpleXYSeries$ArrayFormat[arrayFormat.ordinal()];
                int i3 = 0;
                if (i2 == 1) {
                    this.yVals.addAll(list);
                    while (i3 < this.yVals.size()) {
                        this.xVals.add(Integer.valueOf(i3));
                        i3++;
                    }
                } else {
                    if (i2 != 2) {
                        throw new IllegalArgumentException("Unexpected enum value: " + arrayFormat);
                    }
                    if (this.xVals == null) {
                        this.xVals = new LinkedList<>();
                    }
                    if (list.size() % 2 != 0) {
                        throw new IndexOutOfBoundsException("Cannot auto-generate series from odd-sized xy List.");
                    }
                    int size = list.size() / 2;
                    int i4 = 0;
                    while (i3 < size) {
                        this.xVals.add(list.get(i4));
                        this.yVals.add(list.get(i4 + 1));
                        i3++;
                        i4 += 2;
                    }
                }
            }
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    public void setTitle(String str) {
        this.lock.writeLock().lock();
        try {
            this.title = str;
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    @Override // com.androidplot.xy.EditableXYSeries
    public void setX(Number number, int i2) {
        this.lock.writeLock().lock();
        try {
            this.xVals.set(i2, number);
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    public void setXOrder(OrderedXYSeries.XOrder xOrder) {
        this.xOrder = xOrder;
    }

    public void setXY(Number number, Number number2, int i2) {
        this.lock.writeLock().lock();
        try {
            this.yVals.set(i2, number2);
            this.xVals.set(i2, number);
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    @Override // com.androidplot.xy.EditableXYSeries
    public void setY(Number number, int i2) {
        this.lock.writeLock().lock();
        try {
            this.yVals.set(i2, number);
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    @Override // com.androidplot.xy.XYSeries
    public int size() {
        if (this.yVals != null) {
            return this.yVals.size();
        }
        return 0;
    }

    public void useImplicitXVals() {
        this.lock.writeLock().lock();
        try {
            this.xVals = null;
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    public SimpleXYSeries(ArrayFormat arrayFormat, String str, Number... numberArr) {
        this(asNumberList(numberArr), arrayFormat, str);
    }

    public SimpleXYSeries(List<? extends Number> list, ArrayFormat arrayFormat, String str) {
        this(str);
        setModel(list, arrayFormat);
    }

    public SimpleXYSeries(List<? extends Number> list, List<? extends Number> list2, String str) {
        this(str);
        if (list != null && list2 != null) {
            if (list.size() == list2.size()) {
                this.xVals.addAll(list);
                this.yVals.addAll(list2);
                return;
            }
            throw new IllegalArgumentException("xVals and yVals List parameters must be of the same size.");
        }
        throw new IllegalArgumentException("Neither the xVals nor the yVals parameters may be null.");
    }
}