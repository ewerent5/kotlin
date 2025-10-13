package com.google.android.gms.internal.ads;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
abstract class n02<T> implements Iterator<T>, j$.util.Iterator {

    /* renamed from: e, reason: collision with root package name */
    @NullableDecl
    private T f7608e;

    /* renamed from: f, reason: collision with root package name */
    private int f7609f = 2;

    protected n02() {
    }

    protected abstract T a();

    @NullableDecl
    protected final T b() {
        this.f7609f = 3;
        return null;
    }

    @Override // j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f7609f;
        if (i2 == 4) {
            throw new IllegalStateException();
        }
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0) {
            return true;
        }
        if (i3 != 2) {
            this.f7609f = 4;
            this.f7608e = a();
            if (this.f7609f != 3) {
                this.f7609f = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f7609f = 2;
        T t = this.f7608e;
        this.f7608e = null;
        return t;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}