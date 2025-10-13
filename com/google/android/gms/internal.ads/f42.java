package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class f42<V> extends h42<V, List<V>> {
    f42(y12<? extends g52<? extends V>> y12Var, boolean z) {
        super(y12Var, true);
        Q();
    }

    @Override // com.google.android.gms.internal.ads.h42
    public final /* bridge */ /* synthetic */ Object V(List list) {
        ArrayList arrayListA = j22.a(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g42 g42Var = (g42) it.next();
            arrayListA.add(g42Var != null ? g42Var.a : null);
        }
        return Collections.unmodifiableList(arrayListA);
    }
}