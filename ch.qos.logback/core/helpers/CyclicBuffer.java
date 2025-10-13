package ch.qos.logback.core.helpers;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class CyclicBuffer<E> {
    E[] ea;
    int first;
    int last;
    int maxSize;
    int numElems;

    public CyclicBuffer(int i2) {
        if (i2 >= 1) {
            init(i2);
            return;
        }
        throw new IllegalArgumentException("The maxSize argument (" + i2 + ") is not a positive integer.");
    }

    public CyclicBuffer(CyclicBuffer<E> cyclicBuffer) {
        int i2 = cyclicBuffer.maxSize;
        this.maxSize = i2;
        E[] eArr = (E[]) new Object[i2];
        this.ea = eArr;
        System.arraycopy(cyclicBuffer.ea, 0, eArr, 0, i2);
        this.last = cyclicBuffer.last;
        this.first = cyclicBuffer.first;
        this.numElems = cyclicBuffer.numElems;
    }

    private void init(int i2) {
        this.maxSize = i2;
        this.ea = (E[]) new Object[i2];
        this.first = 0;
        this.last = 0;
        this.numElems = 0;
    }

    public void add(E e2) {
        E[] eArr = this.ea;
        int i2 = this.last;
        eArr[i2] = e2;
        int i3 = i2 + 1;
        this.last = i3;
        int i4 = this.maxSize;
        if (i3 == i4) {
            this.last = 0;
        }
        int i5 = this.numElems;
        if (i5 < i4) {
            this.numElems = i5 + 1;
            return;
        }
        int i6 = this.first + 1;
        this.first = i6;
        if (i6 == i4) {
            this.first = 0;
        }
    }

    public List<E> asList() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < length(); i2++) {
            arrayList.add(get(i2));
        }
        return arrayList;
    }

    public void clear() {
        init(this.maxSize);
    }

    public E get() {
        int i2 = this.numElems;
        if (i2 <= 0) {
            return null;
        }
        this.numElems = i2 - 1;
        E[] eArr = this.ea;
        int i3 = this.first;
        E e2 = eArr[i3];
        eArr[i3] = null;
        int i4 = i3 + 1;
        this.first = i4;
        if (i4 == this.maxSize) {
            this.first = 0;
        }
        return e2;
    }

    public E get(int i2) {
        if (i2 < 0 || i2 >= this.numElems) {
            return null;
        }
        return this.ea[(this.first + i2) % this.maxSize];
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public int length() {
        return this.numElems;
    }

    public void resize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Negative array size [" + i2 + "] not allowed.");
        }
        int i3 = this.numElems;
        if (i2 == i3) {
            return;
        }
        E[] eArr = (E[]) new Object[i2];
        if (i2 < i3) {
            i3 = i2;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            E[] eArr2 = this.ea;
            int i5 = this.first;
            eArr[i4] = eArr2[i5];
            eArr2[i5] = null;
            int i6 = i5 + 1;
            this.first = i6;
            if (i6 == this.numElems) {
                this.first = 0;
            }
        }
        this.ea = eArr;
        this.first = 0;
        this.numElems = i3;
        this.maxSize = i2;
        if (i3 == i2) {
            this.last = 0;
        } else {
            this.last = i3;
        }
    }
}