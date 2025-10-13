package com.androidplot.util;

import j$.lang.Iterable;
import j$.time.a;
import j$.util.Collection;
import j$.util.List;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.Predicate;
import j$.util.function.UnaryOperator;
import j$.util.stream.Q1;
import j$.util.stream.Stream;
import java.util.Comparator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public class LinkedLayerList<Type> extends LinkedList<Type> implements Layerable<Type>, Collection, List {
    private LayerListOrganizer<Type> organizer = new LayerListOrganizer<>(this);

    public void addToBottom(Type type) {
        this.organizer.addToBottom(type);
    }

    public void addToTop(Type type) {
        this.organizer.addToTop(type);
    }

    @Override // com.androidplot.util.Layerable
    public java.util.List<Type> elements() {
        return this.organizer.elements();
    }

    @Override // j$.util.Collection, j$.lang.Iterable
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable.CC.$default$forEach(this, consumer);
    }

    @Override // com.androidplot.util.Layerable
    public boolean moveAbove(Type type, Type type2) {
        return this.organizer.moveAbove(type, type2);
    }

    @Override // com.androidplot.util.Layerable
    public boolean moveBeneath(Type type, Type type2) {
        return this.organizer.moveBeneath(type, type2);
    }

    @Override // com.androidplot.util.Layerable
    public boolean moveDown(Type type) {
        return this.organizer.moveDown(type);
    }

    @Override // com.androidplot.util.Layerable
    public boolean moveToBottom(Type type) {
        return this.organizer.moveToBottom(type);
    }

    @Override // com.androidplot.util.Layerable
    public boolean moveToTop(Type type) {
        return this.organizer.moveToTop(type);
    }

    @Override // com.androidplot.util.Layerable
    public boolean moveUp(Type type) {
        return this.organizer.moveUp(type);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return Q1.v(a.L(this), true);
    }

    @Override // j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // j$.util.List
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // java.util.LinkedList, java.util.Collection, java.lang.Iterable, java.util.List, j$.util.Collection, java.util.Set, j$.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Stream stream() {
        return Q1.v(a.L(this), false);
    }
}