package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zg0 extends sf0<bh0> implements bh0 {
    public zg0(Set<nh0<bh0>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.bh0
    public final void c(final String str) {
        J0(new rf0(str) { // from class: com.google.android.gms.internal.ads.vg0
            private final String a;

            {
                this.a = str;
            }

            @Override // com.google.android.gms.internal.ads.rf0
            public final void zza(Object obj) {
                ((bh0) obj).c(this.a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.bh0
    public final void j0(final String str, final String str2) {
        J0(new rf0(str, str2) { // from class: com.google.android.gms.internal.ads.wg0
            private final String a;

            /* renamed from: b, reason: collision with root package name */
            private final String f9961b;

            {
                this.a = str;
                this.f9961b = str2;
            }

            @Override // com.google.android.gms.internal.ads.rf0
            public final void zza(Object obj) {
                ((bh0) obj).j0(this.a, this.f9961b);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.bh0
    public final void zza(final String str) {
        J0(new rf0(str) { // from class: com.google.android.gms.internal.ads.ug0
            private final String a;

            {
                this.a = str;
            }

            @Override // com.google.android.gms.internal.ads.rf0
            public final void zza(Object obj) {
                ((bh0) obj).zza(this.a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.bh0
    public final void zzd() {
        J0(xg0.a);
    }

    @Override // com.google.android.gms.internal.ads.bh0
    public final void zze() {
        J0(yg0.a);
    }
}