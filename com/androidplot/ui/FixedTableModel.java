package com.androidplot.ui;

import android.graphics.RectF;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;

/* loaded from: classes.dex */
public class FixedTableModel extends TableModel {
    private float cellHeight;
    private float cellWidth;

    /* renamed from: com.androidplot.ui.FixedTableModel$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
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
        }
    }

    private class FixedTableModelIterator implements Iterator<RectF>, j$.util.Iterator {
        private int lastElement;
        private RectF lastRect;
        private FixedTableModel model;
        private int numElements;
        private RectF tableRect;

        protected FixedTableModelIterator(FixedTableModel fixedTableModel, RectF rectF, int i2) {
            this.model = fixedTableModel;
            this.tableRect = rectF;
            this.numElements = i2;
            float f2 = rectF.left;
            this.lastRect = new RectF(f2, rectF.top, fixedTableModel.getCellWidth() + f2, rectF.top + fixedTableModel.getCellHeight());
        }

        private boolean isColumnFinished() {
            return this.lastRect.bottom + this.model.getCellHeight() > this.tableRect.height();
        }

        private boolean isRowFinished() {
            return this.lastRect.right + this.model.getCellWidth() > this.tableRect.width();
        }

        private void moveDown() {
            RectF rectF = this.lastRect;
            rectF.offsetTo(rectF.left, rectF.bottom);
        }

        private void moveDownAndBack() {
            RectF rectF = this.lastRect;
            rectF.offsetTo(this.tableRect.left, rectF.bottom);
        }

        private void moveOver() {
            RectF rectF = this.lastRect;
            rectF.offsetTo(rectF.right, rectF.top);
        }

        private void moveOverAndUp() {
            RectF rectF = this.lastRect;
            rectF.offsetTo(rectF.right, this.tableRect.top);
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            return this.lastElement < this.numElements && !(isColumnFinished() && isRowFinished());
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public RectF next() {
            try {
                int i2 = this.lastElement;
                if (i2 == 0) {
                    RectF rectF = this.lastRect;
                    this.lastElement = i2 + 1;
                    return rectF;
                }
                if (i2 >= this.numElements) {
                    throw new IndexOutOfBoundsException();
                }
                int i3 = AnonymousClass1.$SwitchMap$com$androidplot$ui$TableOrder[this.model.getOrder().ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new UnsupportedOperationException();
                    }
                    if (isRowFinished()) {
                        moveDownAndBack();
                    } else {
                        moveOver();
                    }
                } else if (isColumnFinished()) {
                    moveOverAndUp();
                } else {
                    moveDown();
                }
                return this.lastRect;
            } finally {
                this.lastElement++;
            }
        }
    }

    public FixedTableModel(float f2, float f3, TableOrder tableOrder) {
        super(tableOrder);
        setCellWidth(f2);
        setCellHeight(f3);
    }

    public float getCellHeight() {
        return this.cellHeight;
    }

    public float getCellWidth() {
        return this.cellWidth;
    }

    @Override // com.androidplot.ui.TableModel
    public java.util.Iterator<RectF> getIterator(RectF rectF, int i2) {
        return new FixedTableModelIterator(this, rectF, i2);
    }

    public void setCellHeight(float f2) {
        this.cellHeight = f2;
    }

    public void setCellWidth(float f2) {
        this.cellWidth = f2;
    }
}