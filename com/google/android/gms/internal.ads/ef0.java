package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ef0 extends sf0<gs2> implements d9 {
    public ef0(Set<nh0<gs2>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.d9
    public final synchronized void G(final String str, final String str2) {
        J0(new rf0(str, str2) { // from class: com.google.android.gms.internal.ads.df0
            private final String a;

            /* renamed from: b, reason: collision with root package name */
            private final String f5470b;

            {
                this.a = str;
                this.f5470b = str2;
            }

            @Override // com.google.android.gms.internal.ads.rf0
            public final void zza(Object obj) {
                ((gs2) obj).a(this.a, this.f5470b);
            }
        });
    }
}