package com.google.android.gms.measurement.internal;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class p implements Iterator<String>, j$.util.Iterator {

    /* renamed from: e, reason: collision with root package name */
    private Iterator<String> f11101e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ q f11102f;

    p(q qVar) {
        this.f11102f = qVar;
        this.f11101e = qVar.f11138e.keySet().iterator();
    }

    @Override // j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.f11101e.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f11101e.next();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}