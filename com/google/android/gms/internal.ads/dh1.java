package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class dh1 implements Callable {
    private final List a;

    /* renamed from: b */
    private final Object f5473b;

    dh1(List list, Object obj) {
        this.a = list;
        this.f5473b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        List list = this.a;
        Object obj = this.f5473b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zg1 zg1Var = (zg1) ((g52) it.next()).get();
            if (zg1Var != null) {
                zg1Var.a(obj);
            }
        }
        return obj;
    }
}