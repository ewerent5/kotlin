package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class vd implements as<ad> {
    final /* synthetic */ fe a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ge f9683b;

    vd(ge geVar, fe feVar) {
        this.f9683b = geVar;
        this.a = feVar;
    }

    @Override // com.google.android.gms.internal.ads.as
    public final /* bridge */ /* synthetic */ void zza(ad adVar) {
        synchronized (this.f9683b.a) {
            this.f9683b.f6110h = 0;
            if (this.f9683b.f6109g != null && this.a != this.f9683b.f6109g) {
                zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                this.f9683b.f6109g.h();
            }
            this.f9683b.f6109g = this.a;
        }
    }
}