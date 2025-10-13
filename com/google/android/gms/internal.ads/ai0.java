package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ai0 extends sf0<ra> implements ra {
    public ai0(Set<nh0<ra>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.ra
    public final void x(final tm tmVar) {
        J0(new rf0(tmVar) { // from class: com.google.android.gms.internal.ads.yh0
            private final tm a;

            {
                this.a = tmVar;
            }

            @Override // com.google.android.gms.internal.ads.rf0
            public final void zza(Object obj) {
                ((ra) obj).x(this.a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ra
    public final synchronized void zza() {
        J0(xh0.a);
    }

    @Override // com.google.android.gms.internal.ads.ra
    public final void zzc() {
        J0(zh0.a);
    }
}