package com.google.android.gms.internal.ads;

import j$.util.Comparator;
import j$.util.function.Function;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class h33 implements Comparator<w23>, j$.util.Comparator {
    public h33(i33 i33Var) {
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        w23 w23Var = (w23) obj;
        w23 w23Var2 = (w23) obj2;
        if (w23Var.b() >= w23Var2.b()) {
            if (w23Var.b() > w23Var2.b()) {
                return 1;
            }
            if (w23Var.a() >= w23Var2.a()) {
                if (w23Var.a() > w23Var2.a()) {
                    return 1;
                }
                float fD = (w23Var.d() - w23Var.b()) * (w23Var.c() - w23Var.a());
                float fD2 = (w23Var2.d() - w23Var2.b()) * (w23Var2.c() - w23Var2.a());
                if (fD <= fD2) {
                    return fD < fD2 ? 1 : 0;
                }
            }
        }
        return -1;
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public /* synthetic */ Comparator reversed() {
        return Collections.reverseOrder(this);
    }

    @Override // j$.util.Comparator
    public /* synthetic */ Comparator thenComparing(Function function) {
        return Comparator.CC.$default$thenComparing(this, function);
    }

    @Override // j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, function, comparator);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, comparator);
    }

    @Override // j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
    }

    @Override // j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return Comparator.CC.$default$thenComparingInt(this, toIntFunction);
    }

    @Override // j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return Comparator.CC.$default$thenComparingLong(this, toLongFunction);
    }
}