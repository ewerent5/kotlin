package com.google.firebase.crashlytics.d.j;

import j$.lang.Iterable;
import j$.util.Collection;
import j$.util.List;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.Predicate;
import j$.util.function.UnaryOperator;
import j$.util.stream.Q1;
import j$.util.stream.Stream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: ImmutableList.java */
/* loaded from: classes.dex */
public final class w<E> implements List<E>, RandomAccess, j$.util.List {

    /* renamed from: e, reason: collision with root package name */
    private final List<E> f12654e;

    private w(List<E> list) {
        this.f12654e = Collections.unmodifiableList(list);
    }

    public static <E> w<E> a(List<E> list) {
        return new w<>(list);
    }

    public static <E> w<E> c(E... eArr) {
        return new w<>(Arrays.asList(eArr));
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, java.util.AbstractCollection, j$.util.Collection, java.util.Set, j$.util.Set
    public boolean add(E e2) {
        return this.f12654e.add(e2);
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        return this.f12654e.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, java.util.AbstractCollection, j$.util.Collection, java.util.Set, j$.util.Set
    public void clear() {
        this.f12654e.clear();
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public boolean contains(Object obj) {
        return this.f12654e.contains(obj);
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public boolean containsAll(Collection<?> collection) {
        return this.f12654e.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public boolean equals(Object obj) {
        return this.f12654e.equals(obj);
    }

    @Override // j$.util.Collection, j$.lang.Iterable
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable.CC.$default$forEach(this, consumer);
    }

    @Override // java.util.List, j$.util.List
    public E get(int i2) {
        return this.f12654e.get(i2);
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public int hashCode() {
        return this.f12654e.hashCode();
    }

    @Override // java.util.List, j$.util.List
    public int indexOf(Object obj) {
        return this.f12654e.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public boolean isEmpty() {
        return this.f12654e.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, java.util.AbstractCollection, j$.util.Collection, java.util.Set, j$.lang.Iterable
    public Iterator<E> iterator() {
        return this.f12654e.iterator();
    }

    @Override // java.util.List, j$.util.List
    public int lastIndexOf(Object obj) {
        return this.f12654e.lastIndexOf(obj);
    }

    @Override // java.util.List, j$.util.List
    public ListIterator<E> listIterator() {
        return this.f12654e.listIterator();
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return Q1.v(j$.time.a.L(this), true);
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public boolean remove(Object obj) {
        return this.f12654e.remove(obj);
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public boolean removeAll(Collection<?> collection) {
        return this.f12654e.removeAll(collection);
    }

    @Override // j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // j$.util.List
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public boolean retainAll(java.util.Collection<?> collection) {
        return this.f12654e.retainAll(collection);
    }

    @Override // java.util.List, j$.util.List
    public E set(int i2, E e2) {
        return this.f12654e.set(i2, e2);
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public int size() {
        return this.f12654e.size();
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection, java.util.Set, j$.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Stream stream() {
        return Q1.v(j$.time.a.L(this), false);
    }

    @Override // java.util.List, j$.util.List
    public java.util.List<E> subList(int i2, int i3) {
        return this.f12654e.subList(i2, i3);
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public Object[] toArray() {
        return this.f12654e.toArray();
    }

    @Override // java.util.List, j$.util.List
    public void add(int i2, E e2) {
        this.f12654e.add(i2, e2);
    }

    @Override // java.util.List, j$.util.List
    public boolean addAll(int i2, java.util.Collection<? extends E> collection) {
        return this.f12654e.addAll(i2, collection);
    }

    @Override // java.util.List, j$.util.List
    public ListIterator<E> listIterator(int i2) {
        return this.f12654e.listIterator(i2);
    }

    @Override // java.util.List, j$.util.List
    public E remove(int i2) {
        return this.f12654e.remove(i2);
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.f12654e.toArray(tArr);
    }
}