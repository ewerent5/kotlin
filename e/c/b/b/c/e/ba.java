package e.c.b.b.c.e;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class ba<K, V> implements Iterator<Map.Entry<K, V>>, j$.util.Iterator {

    /* renamed from: e, reason: collision with root package name */
    private int f14411e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14412f;

    /* renamed from: g, reason: collision with root package name */
    private Iterator<Map.Entry<K, V>> f14413g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ t9 f14414h;

    private ba(t9 t9Var) {
        this.f14414h = t9Var;
        this.f14411e = -1;
    }

    private final Iterator<Map.Entry<K, V>> a() {
        if (this.f14413g == null) {
            this.f14413g = this.f14414h.f14861g.entrySet().iterator();
        }
        return this.f14413g;
    }

    @Override // j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.f14411e + 1 < this.f14414h.f14860f.size() || (!this.f14414h.f14861g.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ Object next() {
        this.f14412f = true;
        int i2 = this.f14411e + 1;
        this.f14411e = i2;
        return i2 < this.f14414h.f14860f.size() ? (Map.Entry) this.f14414h.f14860f.get(this.f14411e) : a().next();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        if (!this.f14412f) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f14412f = false;
        this.f14414h.p();
        if (this.f14411e >= this.f14414h.f14860f.size()) {
            a().remove();
            return;
        }
        t9 t9Var = this.f14414h;
        int i2 = this.f14411e;
        this.f14411e = i2 - 1;
        t9Var.k(i2);
    }

    /* synthetic */ ba(t9 t9Var, w9 w9Var) {
        this(t9Var);
    }
}