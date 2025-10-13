package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class id0 extends sf0<jd0> implements jd0 {
    public id0(Set<nh0<jd0>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void R(final kp1 kp1Var) {
        J0(new rf0(kp1Var) { // from class: com.google.android.gms.internal.ads.hd0
            private final kp1 a;

            {
                this.a = kp1Var;
            }

            @Override // com.google.android.gms.internal.ads.rf0
            public final void zza(Object obj) {
                ((jd0) obj).R(this.a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void f(final ql qlVar) {
        J0(new rf0(qlVar) { // from class: com.google.android.gms.internal.ads.gd0
            private final ql a;

            {
                this.a = qlVar;
            }

            @Override // com.google.android.gms.internal.ads.rf0
            public final void zza(Object obj) {
                ((jd0) obj).f(this.a);
            }
        });
    }
}