package com.google.android.gms.internal.ads;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class al2 implements Iterator<yh2>, j$.util.Iterator {

    /* renamed from: e, reason: collision with root package name */
    private final ArrayDeque<cl2> f4936e;

    /* renamed from: f, reason: collision with root package name */
    private yh2 f4937f;

    /* synthetic */ al2(ci2 ci2Var, yk2 yk2Var) {
        if (!(ci2Var instanceof cl2)) {
            this.f4936e = null;
            this.f4937f = (yh2) ci2Var;
            return;
        }
        cl2 cl2Var = (cl2) ci2Var;
        ArrayDeque<cl2> arrayDeque = new ArrayDeque<>(cl2Var.o());
        this.f4936e = arrayDeque;
        arrayDeque.push(cl2Var);
        this.f4937f = b(cl2Var.f5329k);
    }

    private final yh2 b(ci2 ci2Var) {
        while (ci2Var instanceof cl2) {
            cl2 cl2Var = (cl2) ci2Var;
            this.f4936e.push(cl2Var);
            ci2Var = cl2Var.f5329k;
        }
        return (yh2) ci2Var;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final yh2 next() {
        yh2 yh2VarB;
        yh2 yh2Var = this.f4937f;
        if (yh2Var == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque<cl2> arrayDeque = this.f4936e;
            yh2VarB = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            yh2VarB = b(this.f4936e.pop().f5330l);
        } while (yh2VarB.F());
        this.f4937f = yh2VarB;
        return yh2Var;
    }

    @Override // j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.f4937f != null;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}