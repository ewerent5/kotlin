package com.androidplot.ui;

import android.graphics.RectF;
import com.androidplot.ui.TableModel;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;

/* loaded from: classes.dex */
public class DynamicTableModel extends TableModel {
    private int numColumns;
    private int numRows;

    /* renamed from: com.androidplot.ui.DynamicTableModel$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$ui$TableModel$Axis;
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$ui$TableOrder;

        static {
            int[] iArr = new int[TableOrder.values().length];
            $SwitchMap$com$androidplot$ui$TableOrder = iArr;
            try {
                iArr[TableOrder.ROW_MAJOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$androidplot$ui$TableOrder[TableOrder.COLUMN_MAJOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[TableModel.Axis.values().length];
            $SwitchMap$com$androidplot$ui$TableModel$Axis = iArr2;
            try {
                iArr2[TableModel.Axis.ROW.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$androidplot$ui$TableModel$Axis[TableModel.Axis.COLUMN.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private class TableModelIterator implements Iterator<RectF>, j$.util.Iterator {
        private int calculatedColumns;
        private int calculatedNumElements;
        private int calculatedRows;
        private DynamicTableModel dynamicTableModel;
        private RectF lastElementRect;
        private TableOrder order;
        private RectF tableRect;
        private int totalElements;
        private boolean isOk = true;
        int lastColumn = 0;
        int lastRow = 0;
        int lastElement = 0;

        public TableModelIterator(DynamicTableModel dynamicTableModel, RectF rectF, int i2) {
            this.dynamicTableModel = dynamicTableModel;
            this.tableRect = rectF;
            this.totalElements = i2;
            this.order = dynamicTableModel.getOrder();
            if (dynamicTableModel.getNumColumns() == 0 && dynamicTableModel.getNumRows() >= 1) {
                int numRows = dynamicTableModel.getNumRows();
                this.calculatedRows = numRows;
                this.calculatedColumns = Float.valueOf((i2 / numRows) + 0.5f).intValue();
            } else if (dynamicTableModel.getNumRows() == 0 && dynamicTableModel.getNumColumns() >= 1) {
                int numColumns = dynamicTableModel.getNumColumns();
                this.calculatedColumns = numColumns;
                this.calculatedRows = Float.valueOf((i2 / numColumns) + 0.5f).intValue();
            } else if (dynamicTableModel.getNumColumns() == 0 && dynamicTableModel.getNumRows() == 0) {
                this.calculatedRows = 1;
                this.calculatedColumns = i2;
            } else {
                this.calculatedRows = dynamicTableModel.getNumRows();
                this.calculatedColumns = dynamicTableModel.getNumColumns();
            }
            this.calculatedNumElements = this.calculatedRows * this.calculatedColumns;
            this.lastElementRect = dynamicTableModel.getCellRect(rectF, i2);
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            return this.isOk && this.lastElement < this.calculatedNumElements;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public RectF next() {
            if (!hasNext()) {
                this.isOk = false;
                throw new IndexOutOfBoundsException();
            }
            int i2 = this.lastElement;
            if (i2 == 0) {
                this.lastElement = i2 + 1;
                return this.lastElementRect;
            }
            RectF rectF = new RectF(this.lastElementRect);
            int i3 = AnonymousClass1.$SwitchMap$com$androidplot$ui$TableOrder[this.order.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    this.isOk = false;
                    throw new IllegalArgumentException();
                }
                if (this.dynamicTableModel.getNumRows() <= 0 || this.lastRow < this.dynamicTableModel.getNumRows() - 1) {
                    RectF rectF2 = this.lastElementRect;
                    rectF.offsetTo(rectF2.left, rectF2.bottom);
                    this.lastRow++;
                } else {
                    rectF.offsetTo(this.lastElementRect.right, this.tableRect.top);
                    this.lastRow = 0;
                    this.lastColumn++;
                }
            } else if (this.dynamicTableModel.getNumColumns() <= 0 || this.lastColumn < this.dynamicTableModel.getNumColumns() - 1) {
                RectF rectF3 = this.lastElementRect;
                rectF.offsetTo(rectF3.right, rectF3.top);
                this.lastColumn++;
            } else {
                rectF.offsetTo(this.tableRect.left, this.lastElementRect.bottom);
                this.lastColumn = 0;
                this.lastRow++;
            }
            this.lastElement++;
            this.lastElementRect = rectF;
            return rectF;
        }
    }

    public DynamicTableModel(int i2, int i3) {
        this(i2, i3, TableOrder.ROW_MAJOR);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private float calculateCellSize(android.graphics.RectF r3, com.androidplot.ui.TableModel.Axis r4, int r5) {
        /*
            r2 = this;
            int[] r0 = com.androidplot.ui.DynamicTableModel.AnonymousClass1.$SwitchMap$com$androidplot$ui$TableModel$Axis
            int r4 = r4.ordinal()
            r4 = r0[r4]
            r0 = 1
            if (r4 == r0) goto L18
            r0 = 2
            if (r4 == r0) goto L11
            r3 = 0
            r4 = 0
            goto L21
        L11:
            int r4 = r2.numColumns
            float r3 = r3.width()
            goto L1e
        L18:
            int r4 = r2.numRows
            float r3 = r3.height()
        L1e:
            r1 = r4
            r4 = r3
            r3 = r1
        L21:
            if (r3 == 0) goto L26
            float r3 = (float) r3
        L24:
            float r4 = r4 / r3
            return r4
        L26:
            float r3 = (float) r5
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.androidplot.ui.DynamicTableModel.calculateCellSize(android.graphics.RectF, com.androidplot.ui.TableModel$Axis, int):float");
    }

    public RectF getCellRect(RectF rectF, int i2) {
        RectF rectF2 = new RectF();
        rectF2.left = rectF.left;
        rectF2.top = rectF.top;
        rectF2.bottom = rectF.top + calculateCellSize(rectF, TableModel.Axis.ROW, i2);
        rectF2.right = rectF.left + calculateCellSize(rectF, TableModel.Axis.COLUMN, i2);
        return rectF2;
    }

    public int getNumColumns() {
        return this.numColumns;
    }

    public int getNumRows() {
        return this.numRows;
    }

    public void setNumColumns(int i2) {
        this.numColumns = i2;
    }

    public void setNumRows(int i2) {
        this.numRows = i2;
    }

    public DynamicTableModel(int i2, int i3, TableOrder tableOrder) {
        super(tableOrder);
        this.numColumns = i2;
        this.numRows = i3;
    }

    @Override // com.androidplot.ui.TableModel
    public TableModelIterator getIterator(RectF rectF, int i2) {
        return new TableModelIterator(this, rectF, i2);
    }
}