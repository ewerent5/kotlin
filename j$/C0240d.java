package j$;

import j$.util.function.Consumer;
import j$.util.t;
import java.util.PrimitiveIterator;

/* renamed from: j$.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0240d implements t.b {
    final /* synthetic */ PrimitiveIterator.OfInt a;

    private /* synthetic */ C0240d(PrimitiveIterator.OfInt ofInt) {
        this.a = ofInt;
    }

    public static /* synthetic */ t.b a(PrimitiveIterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof C0242e ? ((C0242e) ofInt).a : new C0240d(ofInt);
    }

    @Override // j$.util.t.b
    /* renamed from: b */
    public /* synthetic */ void forEachRemaining(j$.util.function.w wVar) {
        this.a.forEachRemaining(S.a(wVar));
    }

    @Override // j$.util.t.b, j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(C0388x.a(consumer));
    }

    @Override // j$.util.t
    public /* synthetic */ void forEachRemaining(Object obj) {
        this.a.forEachRemaining((PrimitiveIterator.OfInt) obj);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public /* synthetic */ boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // j$.util.t.b, java.util.Iterator, j$.util.Iterator
    public /* synthetic */ Integer next() {
        return this.a.next();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public /* synthetic */ Object next() {
        return this.a.next();
    }

    @Override // j$.util.t.b
    public /* synthetic */ int nextInt() {
        return this.a.nextInt();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public /* synthetic */ void remove() {
        this.a.remove();
    }
}