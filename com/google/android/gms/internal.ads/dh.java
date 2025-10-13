package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class dh extends hg {

    /* renamed from: e, reason: collision with root package name */
    private final UnifiedNativeAdMapper f5472e;

    public dh(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        this.f5472e = unifiedNativeAdMapper;
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final void B(e.c.b.b.b.b bVar) {
        this.f5472e.handleClick((View) e.c.b.b.b.d.Y(bVar));
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final void G0(e.c.b.b.b.b bVar, e.c.b.b.b.b bVar2, e.c.b.b.b.b bVar3) {
        this.f5472e.trackViews((View) e.c.b.b.b.d.Y(bVar), (HashMap) e.c.b.b.b.d.Y(bVar2), (HashMap) e.c.b.b.b.d.Y(bVar3));
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final l6 a() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final float f() {
        return this.f5472e.getMediaContentAspectRatio();
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final void m1(e.c.b.b.b.b bVar) {
        this.f5472e.untrackView((View) e.c.b.b.b.d.Y(bVar));
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final float zzA() {
        return this.f5472e.getDuration();
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final float zzB() {
        return this.f5472e.getCurrentTime();
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final String zze() {
        return this.f5472e.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final List zzf() {
        List<NativeAd.Image> images = this.f5472e.getImages();
        ArrayList arrayList = new ArrayList();
        if (images != null) {
            for (NativeAd.Image image : images) {
                arrayList.add(new c6(image.getDrawable(), image.getUri(), image.getScale(), image.zza(), image.zzb()));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final String zzg() {
        return this.f5472e.getBody();
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final t6 zzh() {
        NativeAd.Image icon = this.f5472e.getIcon();
        if (icon != null) {
            return new c6(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.zza(), icon.zzb());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final String zzi() {
        return this.f5472e.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final String zzj() {
        return this.f5472e.getAdvertiser();
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final double zzk() {
        if (this.f5472e.getStarRating() != null) {
            return this.f5472e.getStarRating().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final String zzl() {
        return this.f5472e.getStore();
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final String zzm() {
        return this.f5472e.getPrice();
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final n1 zzn() {
        if (this.f5472e.zzc() != null) {
            return this.f5472e.zzc().zzb();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final e.c.b.b.b.b zzp() {
        View adChoicesContent = this.f5472e.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return e.c.b.b.b.d.m4(adChoicesContent);
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final e.c.b.b.b.b zzq() {
        View viewZzd = this.f5472e.zzd();
        if (viewZzd == null) {
            return null;
        }
        return e.c.b.b.b.d.m4(viewZzd);
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final e.c.b.b.b.b zzr() {
        Object objZze = this.f5472e.zze();
        if (objZze == null) {
            return null;
        }
        return e.c.b.b.b.d.m4(objZze);
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final Bundle zzs() {
        return this.f5472e.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final boolean zzt() {
        return this.f5472e.getOverrideImpressionRecording();
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final boolean zzu() {
        return this.f5472e.getOverrideClickHandling();
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final void zzv() {
        this.f5472e.recordImpression();
    }
}