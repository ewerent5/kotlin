package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
class v12<E> extends x12<E> {
    Object[] a;

    /* renamed from: b, reason: collision with root package name */
    int f9621b = 0;

    /* renamed from: c, reason: collision with root package name */
    boolean f9622c;

    v12(int i2) {
        this.a = new Object[i2];
    }

    private final void e(int i2) {
        Object[] objArr = this.a;
        int length = objArr.length;
        if (length < i2) {
            this.a = Arrays.copyOf(objArr, x12.b(length, i2));
            this.f9622c = false;
        } else if (this.f9622c) {
            this.a = (Object[]) objArr.clone();
            this.f9622c = false;
        }
    }

    public final v12<E> c(E e2) {
        e(this.f9621b + 1);
        Object[] objArr = this.a;
        int i2 = this.f9621b;
        this.f9621b = i2 + 1;
        objArr[i2] = e2;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final x12<E> d(Iterable<? extends E> iterable) {
        e(this.f9621b + iterable.size());
        if (iterable instanceof y12) {
            this.f9621b = ((y12) iterable).l(this.a, this.f9621b);
            return this;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return this;
    }
}