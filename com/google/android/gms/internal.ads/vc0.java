package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzp;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class vc0 extends sf0<zzp> implements zzp {
    public vc0(Set<nh0<zzp>> set) {
        super(set);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzbJ() {
        J0(tc0.a);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzbo() {
        J0(uc0.a);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzbr() {
        J0(rc0.a);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzbs() {
        J0(sc0.a);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzbt(final int i2) {
        J0(new rf0(i2) { // from class: com.google.android.gms.internal.ads.qc0
            private final int a;

            {
                this.a = i2;
            }

            @Override // com.google.android.gms.internal.ads.rf0
            public final void zza(Object obj) {
                ((zzp) obj).zzbt(this.a);
            }
        });
    }
}