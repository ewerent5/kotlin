package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
abstract class r12<E> extends y22<E> {

    /* renamed from: e, reason: collision with root package name */
    private final int f8558e;

    /* renamed from: f, reason: collision with root package name */
    private int f8559f;

    protected r12(int i2, int i3) {
        h12.e(i3, i2, "index");
        this.f8558e = i2;
        this.f8559f = i3;
    }

    protected abstract E a(int i2);

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.f8559f < this.f8558e;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f8559f > 0;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f8559f;
        this.f8559f = i2 + 1;
        return a(i2);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f8559f;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f8559f - 1;
        this.f8559f = i2;
        return a(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f8559f - 1;
    }
}