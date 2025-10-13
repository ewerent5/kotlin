package com.google.android.gms.internal.ads;

import j$.lang.Iterable;
import j$.util.Collection;
import j$.util.List;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.Predicate;
import j$.util.function.UnaryOperator;
import j$.util.stream.Q1;
import j$.util.stream.Stream;
import java.util.AbstractList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class do2<E> extends AbstractList<E> implements List {

    /* renamed from: e, reason: collision with root package name */
    private static final eo2 f5495e = eo2.b(do2.class);

    /* renamed from: f, reason: collision with root package name */
    final java.util.List<E> f5496f;

    /* renamed from: g, reason: collision with root package name */
    final Iterator<E> f5497g;

    public do2(java.util.List<E> list, Iterator<E> it) {
        this.f5496f = list;
        this.f5497g = it;
    }

    @Override // j$.util.Collection, j$.lang.Iterable
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable.CC.$default$forEach(this, consumer);
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final E get(int i2) {
        if (this.f5496f.size() > i2) {
            return this.f5496f.get(i2);
        }
        if (!this.f5497g.hasNext()) {
            throw new NoSuchElementException();
        }
        this.f5496f.add(this.f5497g.next());
        return get(i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.lang.Iterable
    public final Iterator<E> iterator() {
        return new co2(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return Q1.v(j$.time.a.L(this), true);
    }

    @Override // j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // j$.util.List
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final int size() {
        eo2 eo2Var = f5495e;
        eo2Var.a("potentially expensive size() call");
        eo2Var.a("blowup running");
        while (this.f5497g.hasNext()) {
            this.f5496f.add(this.f5497g.next());
        }
        return this.f5496f.size();
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Stream stream() {
        return Q1.v(j$.time.a.L(this), false);
    }
}