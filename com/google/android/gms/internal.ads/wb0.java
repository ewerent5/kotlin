package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class wb0 extends sf0<qa0> {
    public wb0(Set<nh0<qa0>> set) {
        super(set);
    }

    public final void K0() {
        J0(rb0.a);
    }

    public final void L0(final gm gmVar, final String str, final String str2) {
        J0(new rf0(gmVar, str, str2) { // from class: com.google.android.gms.internal.ads.ub0
            private final gm a;

            /* renamed from: b, reason: collision with root package name */
            private final String f9412b;

            /* renamed from: c, reason: collision with root package name */
            private final String f9413c;

            {
                this.a = gmVar;
                this.f9412b = str;
                this.f9413c = str2;
            }

            @Override // com.google.android.gms.internal.ads.rf0
            public final void zza(Object obj) {
                ((qa0) obj).d(this.a, this.f9412b, this.f9413c);
            }
        });
    }

    public final void M0() {
        J0(vb0.a);
    }

    public final void zza() {
        J0(qb0.a);
    }

    public final void zzc() {
        J0(sb0.a);
    }

    public final void zzd() {
        J0(tb0.a);
    }
}