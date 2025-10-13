package e.c.b.b.c.e;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class v9<K, V> implements Iterator<Map.Entry<K, V>>, j$.util.Iterator {

    /* renamed from: e, reason: collision with root package name */
    private int f14897e;

    /* renamed from: f, reason: collision with root package name */
    private Iterator<Map.Entry<K, V>> f14898f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ t9 f14899g;

    private v9(t9 t9Var) {
        this.f14899g = t9Var;
        this.f14897e = t9Var.f14860f.size();
    }

    private final Iterator<Map.Entry<K, V>> a() {
        if (this.f14898f == null) {
            this.f14898f = this.f14899g.f14864j.entrySet().iterator();
        }
        return this.f14898f;
    }

    @Override // j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f14897e;
        return (i2 > 0 && i2 <= this.f14899g.f14860f.size()) || a().hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ Object next() {
        if (a().hasNext()) {
            return a().next();
        }
        List list = this.f14899g.f14860f;
        int i2 = this.f14897e - 1;
        this.f14897e = i2;
        return (Map.Entry) list.get(i2);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ v9(t9 t9Var, w9 w9Var) {
        this(t9Var);
    }
}