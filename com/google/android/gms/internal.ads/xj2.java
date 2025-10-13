package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class xj2 extends zj2 {

    /* renamed from: c, reason: collision with root package name */
    private static final Class<?> f10179c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* synthetic */ xj2(vj2 vj2Var) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> f(Object obj, long j2, int i2) {
        tj2 tj2Var;
        List<L> list = (List) cm2.s(obj, j2);
        if (list.isEmpty()) {
            List<L> tj2Var2 = list instanceof uj2 ? new tj2(i2) : ((list instanceof sk2) && (list instanceof nj2)) ? ((nj2) list).v(i2) : new ArrayList<>(i2);
            cm2.t(obj, j2, tj2Var2);
            return tj2Var2;
        }
        if (f10179c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i2);
            arrayList.addAll(list);
            cm2.t(obj, j2, arrayList);
            tj2Var = arrayList;
        } else {
            if (!(list instanceof wl2)) {
                if (!(list instanceof sk2) || !(list instanceof nj2)) {
                    return list;
                }
                nj2 nj2Var = (nj2) list;
                if (nj2Var.zza()) {
                    return list;
                }
                nj2 nj2VarV = nj2Var.v(list.size() + i2);
                cm2.t(obj, j2, nj2VarV);
                return nj2VarV;
            }
            tj2 tj2Var3 = new tj2(list.size() + i2);
            tj2Var3.addAll(tj2Var3.size(), (wl2) list);
            cm2.t(obj, j2, tj2Var3);
            tj2Var = tj2Var3;
        }
        return tj2Var;
    }

    @Override // com.google.android.gms.internal.ads.zj2
    final <L> List<L> a(Object obj, long j2) {
        return f(obj, j2, 10);
    }

    @Override // com.google.android.gms.internal.ads.zj2
    final void b(Object obj, long j2) {
        Object objUnmodifiableList;
        List list = (List) cm2.s(obj, j2);
        if (list instanceof uj2) {
            objUnmodifiableList = ((uj2) list).zzi();
        } else {
            if (f10179c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof sk2) && (list instanceof nj2)) {
                nj2 nj2Var = (nj2) list;
                if (nj2Var.zza()) {
                    nj2Var.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        cm2.t(obj, j2, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.ads.zj2
    final <E> void c(Object obj, Object obj2, long j2) {
        List list = (List) cm2.s(obj2, j2);
        List listF = f(obj, j2, list.size());
        int size = listF.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listF.addAll(list);
        }
        if (size > 0) {
            list = listF;
        }
        cm2.t(obj, j2, list);
    }
}