package j$.util;

import j$.B0;
import j$.D0;
import j$.F0;
import j$.M;
import j$.util.Comparator;
import j$.util.function.Function;
import java.io.Serializable;
import java.util.Collections;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements java.util.Comparator, Serializable {
    public final /* synthetic */ Function a;

    public /* synthetic */ a(Function function) {
        this.a = function;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Function function = this.a;
        return ((Comparable) function.apply(obj)).compareTo(function.apply(obj2));
    }

    @Override // java.util.Comparator
    public /* synthetic */ java.util.Comparator reversed() {
        return Collections.reverseOrder(this);
    }

    @Override // java.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, comparator);
    }

    @Override // java.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparing(java.util.function.Function function) {
        return Comparator.CC.$default$thenComparing(this, M.c(function));
    }

    @Override // java.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return Comparator.CC.$default$thenComparingDouble(this, B0.a(toDoubleFunction));
    }

    @Override // java.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return Comparator.CC.$default$thenComparingInt(this, D0.a(toIntFunction));
    }

    @Override // java.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return Comparator.CC.$default$thenComparingLong(this, F0.a(toLongFunction));
    }

    @Override // java.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparing(java.util.function.Function function, java.util.Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, M.c(function), comparator);
    }
}