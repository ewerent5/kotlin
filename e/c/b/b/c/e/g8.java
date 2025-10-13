package e.c.b.b.c.e;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class g8<K> implements Iterator<Map.Entry<K, Object>>, j$.util.Iterator {

    /* renamed from: e, reason: collision with root package name */
    private Iterator<Map.Entry<K, Object>> f14549e;

    public g8(Iterator<Map.Entry<K, Object>> it) {
        this.f14549e = it;
    }

    @Override // j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.f14549e.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.f14549e.next();
        return next.getValue() instanceof b8 ? new d8(next) : next;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        this.f14549e.remove();
    }
}