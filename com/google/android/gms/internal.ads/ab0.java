package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ab0 extends sf0<eb0> implements ua0 {
    public ab0(Set<nh0<eb0>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void e0(final g93 g93Var) {
        J0(new rf0(g93Var) { // from class: com.google.android.gms.internal.ads.ya0
            private final g93 a;

            {
                this.a = g93Var;
            }

            @Override // com.google.android.gms.internal.ads.rf0
            public final void zza(Object obj) {
                ((eb0) obj).I(this.a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void r0(qj0 qj0Var) {
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void zzd() {
        J0(za0.a);
    }
}