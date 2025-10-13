package com.google.android.gms.internal.ads;

import j$.lang.Iterable;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class il2 implements Iterable<Object>, Iterable {
    il2() {
    }

    @Override // j$.lang.Iterable
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable.CC.$default$forEach(this, consumer);
    }

    @Override // java.lang.Iterable, j$.lang.Iterable
    public final Iterator<Object> iterator() {
        return jl2.a;
    }

    @Override // java.lang.Iterable, j$.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return j$.util.v.o(iterator(), 0);
    }
}