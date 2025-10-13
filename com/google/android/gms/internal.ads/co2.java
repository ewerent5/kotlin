package com.google.android.gms.internal.ads;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class co2 implements Iterator, j$.util.Iterator {

    /* renamed from: e, reason: collision with root package name */
    int f5343e = 0;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ do2 f5344f;

    co2(do2 do2Var) {
        this.f5344f = do2Var;
    }

    @Override // j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.f5343e < this.f5344f.f5496f.size() || this.f5344f.f5497g.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (this.f5343e >= this.f5344f.f5496f.size()) {
            do2 do2Var = this.f5344f;
            do2Var.f5496f.add(do2Var.f5497g.next());
            return next();
        }
        List<E> list = this.f5344f.f5496f;
        int i2 = this.f5343e;
        this.f5343e = i2 + 1;
        return list.get(i2);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}