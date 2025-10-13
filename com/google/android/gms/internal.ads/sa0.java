package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class sa0 extends sf0<ta0> implements ta0 {
    public sa0(Set<nh0<ta0>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.ta0
    public final void B0(final g93 g93Var) {
        J0(new rf0(g93Var) { // from class: com.google.android.gms.internal.ads.ra0
            private final g93 a;

            {
                this.a = g93Var;
            }

            @Override // com.google.android.gms.internal.ads.rf0
            public final void zza(Object obj) {
                ((ta0) obj).B0(this.a);
            }
        });
    }
}