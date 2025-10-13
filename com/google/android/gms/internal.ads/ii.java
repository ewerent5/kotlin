package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzp;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ii implements zzp {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ zzasz f6532e;

    ii(zzasz zzaszVar) {
        this.f6532e = zzaszVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbJ() {
        er.zzd("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbo() {
        er.zzd("Opening AdMobCustomTabsAdapter overlay.");
        this.f6532e.f10669b.onAdOpened(this.f6532e);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbs() {
        er.zzd("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbt(int i2) {
        er.zzd("AdMobCustomTabsAdapter overlay is closed.");
        this.f6532e.f10669b.onAdClosed(this.f6532e);
    }
}