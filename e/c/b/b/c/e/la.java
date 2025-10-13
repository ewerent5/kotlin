package e.c.b.b.c.e;

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
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
public final class la extends AbstractList<String> implements h8, RandomAccess, List {

    /* renamed from: e, reason: collision with root package name */
    private final h8 f14693e;

    public la(h8 h8Var) {
        this.f14693e = h8Var;
    }

    @Override // e.c.b.b.c.e.h8
    public final h8 A() {
        return this;
    }

    @Override // e.c.b.b.c.e.h8
    public final void D(g6 g6Var) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.Collection, j$.lang.Iterable
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable.CC.$default$forEach(this, consumer);
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final /* synthetic */ Object get(int i2) {
        return (String) this.f14693e.get(i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.lang.Iterable
    public final Iterator<String> iterator() {
        return new na(this);
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final ListIterator<String> listIterator(int i2) {
        return new oa(this, i2);
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
        return this.f14693e.size();
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

    @Override // e.c.b.b.c.e.h8
    public final Object zzb(int i2) {
        return this.f14693e.zzb(i2);
    }

    @Override // e.c.b.b.c.e.h8
    public final java.util.List<?> zzb() {
        return this.f14693e.zzb();
    }
}