package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class yj2 extends zj2 {
    /* synthetic */ yj2(vj2 vj2Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zj2
    final <L> List<L> a(Object obj, long j2) {
        nj2 nj2Var = (nj2) cm2.s(obj, j2);
        if (nj2Var.zza()) {
            return nj2Var;
        }
        int size = nj2Var.size();
        nj2 nj2VarV = nj2Var.v(size == 0 ? 10 : size + size);
        cm2.t(obj, j2, nj2VarV);
        return nj2VarV;
    }

    @Override // com.google.android.gms.internal.ads.zj2
    final void b(Object obj, long j2) {
        ((nj2) cm2.s(obj, j2)).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zj2
    final <E> void c(Object obj, Object obj2, long j2) {
        nj2 nj2VarV = (nj2) cm2.s(obj, j2);
        nj2 nj2Var = (nj2) cm2.s(obj2, j2);
        int size = nj2VarV.size();
        int size2 = nj2Var.size();
        if (size > 0 && size2 > 0) {
            if (!nj2VarV.zza()) {
                nj2VarV = nj2VarV.v(size2 + size);
            }
            nj2VarV.addAll(nj2Var);
        }
        if (size > 0) {
            nj2Var = nj2VarV;
        }
        cm2.t(obj, j2, nj2Var);
    }
}