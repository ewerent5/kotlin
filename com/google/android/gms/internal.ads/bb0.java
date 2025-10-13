package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class bb0 extends sf0<ua0> implements ua0 {
    public bb0(ab0 ab0Var, Set<nh0<ua0>> set, Executor executor) {
        super(set);
        H0(ab0Var, executor);
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void e0(final g93 g93Var) {
        J0(new rf0(g93Var) { // from class: com.google.android.gms.internal.ads.va0
            private final g93 a;

            {
                this.a = g93Var;
            }

            @Override // com.google.android.gms.internal.ads.rf0
            public final void zza(Object obj) {
                ((ua0) obj).e0(this.a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void r0(final qj0 qj0Var) {
        J0(new rf0(qj0Var) { // from class: com.google.android.gms.internal.ads.wa0
            private final qj0 a;

            {
                this.a = qj0Var;
            }

            @Override // com.google.android.gms.internal.ads.rf0
            public final void zza(Object obj) {
                ((ua0) obj).r0(this.a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void zzd() {
        J0(xa0.a);
    }
}