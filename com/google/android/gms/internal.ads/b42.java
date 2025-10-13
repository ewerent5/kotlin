package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class b42 extends z32 {
    /* synthetic */ b42(y32 y32Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.z32
    final void a(c42 c42Var, Set<Throwable> set, Set<Throwable> set2) {
        synchronized (c42Var) {
            if (c42Var.n == null) {
                c42Var.n = set2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.z32
    final int b(c42 c42Var) {
        int I;
        synchronized (c42Var) {
            I = c42.I(c42Var);
        }
        return I;
    }
}