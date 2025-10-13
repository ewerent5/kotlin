package com.bumptech.glide.load.p;

import com.bumptech.glide.load.n.v;
import com.bumptech.glide.t.j;

/* compiled from: SimpleResource.java */
/* loaded from: classes.dex */
public class b<T> implements v<T> {

    /* renamed from: e, reason: collision with root package name */
    protected final T f3950e;

    public b(T t) {
        this.f3950e = (T) j.d(t);
    }

    @Override // com.bumptech.glide.load.n.v
    public void b() {
    }

    @Override // com.bumptech.glide.load.n.v
    public final int c() {
        return 1;
    }

    @Override // com.bumptech.glide.load.n.v
    public Class<T> d() {
        return (Class<T>) this.f3950e.getClass();
    }

    @Override // com.bumptech.glide.load.n.v
    public final T get() {
        return this.f3950e;
    }
}