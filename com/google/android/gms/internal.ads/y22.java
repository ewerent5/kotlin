package com.google.android.gms.internal.ads;

import j$.util.Iterator;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class y22<E> extends w22<E> implements ListIterator<E>, Iterator {
    protected y22() {
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void add(E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void set(E e2) {
        throw new UnsupportedOperationException();
    }
}