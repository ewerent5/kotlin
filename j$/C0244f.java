package j$;

import j$.util.function.Consumer;
import j$.util.t;
import java.util.PrimitiveIterator;

/* renamed from: j$.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0244f implements t.c {
    final /* synthetic */ PrimitiveIterator.OfLong a;

    private /* synthetic */ C0244f(PrimitiveIterator.OfLong ofLong) {
        this.a = ofLong;
    }

    public static /* synthetic */ t.c a(PrimitiveIterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof C0246g ? ((C0246g) ofLong).a : new C0244f(ofLong);
    }

    @Override // j$.util.t.c
    /* renamed from: c */
    public /* synthetic */ void forEachRemaining(j$.util.function.C c2) {
        this.a.forEachRemaining(C0247g0.a(c2));
    }

    @Override // j$.util.t.c, j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(C0388x.a(consumer));
    }

    @Override // j$.util.t
    public /* synthetic */ void forEachRemaining(Object obj) {
        this.a.forEachRemaining((PrimitiveIterator.OfLong) obj);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public /* synthetic */ boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // j$.util.t.c, java.util.Iterator, j$.util.Iterator
    public /* synthetic */ Long next() {
        return this.a.next();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public /* synthetic */ Object next() {
        return this.a.next();
    }

    @Override // j$.util.t.c
    public /* synthetic */ long nextLong() {
        return this.a.nextLong();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public /* synthetic */ void remove() {
        this.a.remove();
    }
}