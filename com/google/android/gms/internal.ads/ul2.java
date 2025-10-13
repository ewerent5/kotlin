package com.google.android.gms.internal.ads;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ul2 implements ListIterator<String>, Iterator {

    /* renamed from: e, reason: collision with root package name */
    final ListIterator<String> f9504e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f9505f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ wl2 f9506g;

    ul2(wl2 wl2Var, int i2) {
        this.f9506g = wl2Var;
        this.f9505f = i2;
        this.f9504e = wl2Var.f9989e.listIterator(i2);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.f9504e.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f9504e.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return this.f9504e.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f9504e.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ String previous() {
        return this.f9504e.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f9504e.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}