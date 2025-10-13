package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class g22 extends w22 {

    /* renamed from: e, reason: collision with root package name */
    boolean f6020e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Object f6021f;

    g22(Object obj) {
        this.f6021f = obj;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return !this.f6020e;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (this.f6020e) {
            throw new NoSuchElementException();
        }
        this.f6020e = true;
        return this.f6021f;
    }
}