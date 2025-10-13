package e.c.b.b.c.e;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class na implements Iterator<String>, j$.util.Iterator {

    /* renamed from: e, reason: collision with root package name */
    private Iterator<String> f14732e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ la f14733f;

    na(la laVar) {
        this.f14733f = laVar;
        this.f14732e = laVar.f14693e.iterator();
    }

    @Override // j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.f14732e.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f14732e.next();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}