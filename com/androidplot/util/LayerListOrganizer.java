package com.androidplot.util;

import java.util.List;

/* loaded from: classes.dex */
public class LayerListOrganizer<ElementType> implements Layerable<ElementType> {
    private static final int ONE = 1;
    private static final int ZERO = 0;
    private List<ElementType> list;

    public LayerListOrganizer(List<ElementType> list) {
        this.list = list;
    }

    public void addToBottom(ElementType elementtype) {
        this.list.add(0, elementtype);
    }

    public void addToTop(ElementType elementtype) {
        List<ElementType> list = this.list;
        list.add(list.size(), elementtype);
    }

    @Override // com.androidplot.util.Layerable
    public List<ElementType> elements() {
        return this.list;
    }

    @Override // com.androidplot.util.Layerable
    public boolean moveAbove(ElementType elementtype, ElementType elementtype2) {
        if (elementtype == elementtype2) {
            throw new IllegalArgumentException("Illegal argument to moveAbove(A, B); A cannot be equal to B.");
        }
        this.list.remove(elementtype);
        this.list.add(this.list.indexOf(elementtype2) + 1, elementtype);
        return true;
    }

    @Override // com.androidplot.util.Layerable
    public boolean moveBeneath(ElementType elementtype, ElementType elementtype2) {
        if (elementtype == elementtype2) {
            throw new IllegalArgumentException("Illegal argument to moveBeaneath(A, B); A cannot be equal to B.");
        }
        this.list.remove(elementtype);
        this.list.add(this.list.indexOf(elementtype2), elementtype);
        return true;
    }

    @Override // com.androidplot.util.Layerable
    public boolean moveDown(ElementType elementtype) {
        int iIndexOf = this.list.indexOf(elementtype);
        if (iIndexOf == -1) {
            return false;
        }
        if (iIndexOf <= 0) {
            return true;
        }
        return moveBeneath(elementtype, this.list.get(iIndexOf - 1));
    }

    @Override // com.androidplot.util.Layerable
    public boolean moveToBottom(ElementType elementtype) {
        this.list.remove(elementtype);
        this.list.add(0, elementtype);
        return true;
    }

    @Override // com.androidplot.util.Layerable
    public boolean moveToTop(ElementType elementtype) {
        if (!this.list.remove(elementtype)) {
            return false;
        }
        List<ElementType> list = this.list;
        list.add(list.size(), elementtype);
        return true;
    }

    @Override // com.androidplot.util.Layerable
    public boolean moveUp(ElementType elementtype) {
        int iIndexOf = this.list.indexOf(elementtype);
        if (iIndexOf == -1) {
            return false;
        }
        if (iIndexOf >= this.list.size() - 1) {
            return true;
        }
        return moveAbove(elementtype, this.list.get(iIndexOf + 1));
    }
}