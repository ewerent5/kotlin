package com.google.android.gms.internal.ads;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ll2 implements Iterator<Map.Entry>, j$.util.Iterator {

    /* renamed from: e, reason: collision with root package name */
    private int f7264e = -1;

    /* renamed from: f, reason: collision with root package name */
    private boolean f7265f;

    /* renamed from: g, reason: collision with root package name */
    private Iterator<Map.Entry> f7266g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ nl2 f7267h;

    /* synthetic */ ll2(nl2 nl2Var, gl2 gl2Var) {
        this.f7267h = nl2Var;
    }

    private final Iterator<Map.Entry> a() {
        if (this.f7266g == null) {
            this.f7266g = this.f7267h.f7737g.entrySet().iterator();
        }
        return this.f7266g;
    }

    @Override // j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        if (this.f7264e + 1 >= this.f7267h.f7736f.size()) {
            return !this.f7267h.f7737g.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f7265f = true;
        int i2 = this.f7264e + 1;
        this.f7264e = i2;
        return i2 < this.f7267h.f7736f.size() ? (Map.Entry) this.f7267h.f7736f.get(this.f7264e) : a().next();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        if (!this.f7265f) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f7265f = false;
        this.f7267h.m();
        if (this.f7264e >= this.f7267h.f7736f.size()) {
            a().remove();
            return;
        }
        nl2 nl2Var = this.f7267h;
        int i2 = this.f7264e;
        this.f7264e = i2 - 1;
        nl2Var.k(i2);
    }
}