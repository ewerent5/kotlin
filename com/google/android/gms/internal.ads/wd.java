package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class wd implements yr {
    final /* synthetic */ fe a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ge f9950b;

    wd(ge geVar, fe feVar) {
        this.f9950b = geVar;
        this.a = feVar;
    }

    @Override // com.google.android.gms.internal.ads.yr
    public final void zza() {
        synchronized (this.f9950b.a) {
            this.f9950b.f6110h = 1;
            zze.zza("Failed loading new engine. Marking new engine destroyable.");
            this.a.h();
        }
    }
}