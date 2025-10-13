package com.google.android.gms.internal.ads;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class vl2 implements Iterator<String>, j$.util.Iterator {

    /* renamed from: e, reason: collision with root package name */
    final Iterator<String> f9736e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ wl2 f9737f;

    vl2(wl2 wl2Var) {
        this.f9737f = wl2Var;
        this.f9736e = wl2Var.f9989e.iterator();
    }

    @Override // j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.f9736e.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return this.f9736e.next();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}