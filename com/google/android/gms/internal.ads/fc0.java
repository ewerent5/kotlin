package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class fc0 extends sf0<hc0> implements hc0 {
    fc0(Set<nh0<hc0>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.hc0
    public final void u(final s60 s60Var) {
        J0(new rf0(s60Var) { // from class: com.google.android.gms.internal.ads.ec0
            private final s60 a;

            {
                this.a = s60Var;
            }

            @Override // com.google.android.gms.internal.ads.rf0
            public final void zza(Object obj) {
                ((hc0) obj).u(this.a);
            }
        });
    }
}