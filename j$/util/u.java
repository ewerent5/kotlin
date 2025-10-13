package j$.util;

import j$.util.v;
import java.util.SortedSet;

/* JADX INFO: Add missing generic type declarations: [E] */
/* loaded from: classes2.dex */
class u<E> extends v.i<E> {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ SortedSet f16418f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(SortedSet sortedSet, java.util.Collection collection, int i2) {
        super(collection, i2);
        this.f16418f = sortedSet;
    }

    @Override // j$.util.v.i, j$.util.Spliterator
    public java.util.Comparator getComparator() {
        return this.f16418f.comparator();
    }
}