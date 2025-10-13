package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class j22 {
    public static <E> ArrayList<E> a(int i2) {
        s12.b(i2, "initialArraySize");
        return new ArrayList<>(i2);
    }

    public static <F, T> List<T> b(List<F> list, x02<? super F, ? extends T> x02Var) {
        return new i22(list, x02Var);
    }
}