package com.google.android.gms.internal.ads;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
abstract class u22<F, T> implements Iterator<T>, j$.util.Iterator {

    /* renamed from: e, reason: collision with root package name */
    final Iterator<? extends F> f9360e;

    u22(Iterator<? extends F> it) {
        Objects.requireNonNull(it);
        this.f9360e = it;
    }

    abstract T a(F f2);

    @Override // j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.f9360e.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final T next() {
        return a(this.f9360e.next());
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        this.f9360e.remove();
    }
}