package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.internal.ads.c;
import com.google.android.gms.internal.ads.c93;
import com.google.android.gms.internal.ads.w3;
import com.google.android.gms.internal.ads.wj;
import e.c.b.b.b.b;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zzv extends wj {
    private final AdOverlayInfoParcel zza;
    private final Activity zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzv(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zza = adOverlayInfoParcel;
        this.zzb = activity;
    }

    private final synchronized void zzb() {
        if (this.zzd) {
            return;
        }
        zzp zzpVar = this.zza.zzc;
        if (zzpVar != null) {
            zzpVar.zzbt(4);
        }
        this.zzd = true;
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final void zzf() {
        zzp zzpVar = this.zza.zzc;
        if (zzpVar != null) {
            zzpVar.zzbr();
        }
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final boolean zzg() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final void zzh(Bundle bundle) {
        zzp zzpVar;
        if (((Boolean) c.c().b(w3.N5)).booleanValue()) {
            this.zzb.requestWindowFeature(1);
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zza;
        if (adOverlayInfoParcel == null) {
            this.zzb.finish();
            return;
        }
        if (z) {
            this.zzb.finish();
            return;
        }
        if (bundle == null) {
            c93 c93Var = adOverlayInfoParcel.zzb;
            if (c93Var != null) {
                c93Var.onAdClicked();
            }
            if (this.zzb.getIntent() != null && this.zzb.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (zzpVar = this.zza.zzc) != null) {
                zzpVar.zzbo();
            }
        }
        com.google.android.gms.ads.internal.zzs.zza();
        Activity activity = this.zzb;
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zza;
        zzc zzcVar = adOverlayInfoParcel2.zza;
        if (zza.zzb(activity, zzcVar, adOverlayInfoParcel2.zzi, zzcVar.zzi)) {
            return;
        }
        this.zzb.finish();
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final void zzk() {
        if (this.zzc) {
            this.zzb.finish();
            return;
        }
        this.zzc = true;
        zzp zzpVar = this.zza.zzc;
        if (zzpVar != null) {
            zzpVar.zzbJ();
        }
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final void zzl() {
        zzp zzpVar = this.zza.zzc;
        if (zzpVar != null) {
            zzpVar.zzbs();
        }
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final void zzm(int i2, int i3, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final void zzn(b bVar) {
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final void zzo(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final void zzp() {
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final void zzq() {
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final void zzs() {
    }
}