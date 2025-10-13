package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class u6 extends NativeAd.Image {
    private final t6 a;

    /* renamed from: b, reason: collision with root package name */
    private final Drawable f9387b;

    /* renamed from: c, reason: collision with root package name */
    private final Uri f9388c;

    /* renamed from: d, reason: collision with root package name */
    private final double f9389d;

    /* renamed from: e, reason: collision with root package name */
    private final int f9390e;

    /* renamed from: f, reason: collision with root package name */
    private final int f9391f;

    public u6(t6 t6Var) {
        double dZzd;
        int iZze;
        e.c.b.b.b.b bVarZzb;
        this.a = t6Var;
        Uri uriZzc = null;
        try {
            bVarZzb = t6Var.zzb();
        } catch (RemoteException e2) {
            er.zzg("", e2);
        }
        Drawable drawable = bVarZzb != null ? (Drawable) e.c.b.b.b.d.Y(bVarZzb) : null;
        this.f9387b = drawable;
        try {
            uriZzc = this.a.zzc();
        } catch (RemoteException e3) {
            er.zzg("", e3);
        }
        this.f9388c = uriZzc;
        try {
            dZzd = this.a.zzd();
        } catch (RemoteException e4) {
            er.zzg("", e4);
            dZzd = 1.0d;
        }
        this.f9389d = dZzd;
        int iZzf = -1;
        try {
            iZze = this.a.zze();
        } catch (RemoteException e5) {
            er.zzg("", e5);
            iZze = -1;
        }
        this.f9390e = iZze;
        try {
            iZzf = this.a.zzf();
        } catch (RemoteException e6) {
            er.zzg("", e6);
        }
        this.f9391f = iZzf;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Drawable getDrawable() {
        return this.f9387b;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final double getScale() {
        return this.f9389d;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Uri getUri() {
        return this.f9388c;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int zza() {
        return this.f9390e;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int zzb() {
        return this.f9391f;
    }
}