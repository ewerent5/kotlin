package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ji implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AdOverlayInfoParcel f6760e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ zzasz f6761f;

    ji(zzasz zzaszVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f6761f = zzaszVar;
        this.f6760e = adOverlayInfoParcel;
    }

    @Override // java.lang.Runnable
    public final void run() throws NumberFormatException {
        zzs.zzb();
        zzn.zza(this.f6761f.a, this.f6760e, true);
    }
}