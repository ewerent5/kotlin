package com.google.android.gms.internal.ads;

import j$.util.Iterator;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
abstract class v22<F, T> extends u22<F, T> implements ListIterator<T>, Iterator {
    v22(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    @Override // java.util.ListIterator
    public final void add(T t) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f9360e.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f9360e.nextIndex();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ListIterator
    public final T previous() {
        return (T) a(this.f9360e.previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f9360e.previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(T t) {
        throw new UnsupportedOperationException();
    }
}