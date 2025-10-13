package e.c.b.b.c.e;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class oa implements ListIterator<String>, Iterator {

    /* renamed from: e, reason: collision with root package name */
    private ListIterator<String> f14755e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f14756f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ la f14757g;

    oa(la laVar, int i2) {
        this.f14757g = laVar;
        this.f14756f = i2;
        this.f14755e = laVar.f14693e.listIterator(i2);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.f14755e.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f14755e.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f14755e.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f14755e.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.f14755e.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f14755e.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}