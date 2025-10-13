package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class zi extends NativeAd.Image {
    private final t6 a;

    /* renamed from: b, reason: collision with root package name */
    private final Drawable f10599b;

    /* renamed from: c, reason: collision with root package name */
    private final Uri f10600c;

    /* renamed from: d, reason: collision with root package name */
    private final double f10601d;

    public zi(t6 t6Var) {
        double dZzd;
        e.c.b.b.b.b bVarZzb;
        this.a = t6Var;
        Uri uriZzc = null;
        try {
            bVarZzb = t6Var.zzb();
        } catch (RemoteException e2) {
            er.zzg("", e2);
        }
        Drawable drawable = bVarZzb != null ? (Drawable) e.c.b.b.b.d.Y(bVarZzb) : null;
        this.f10599b = drawable;
        try {
            uriZzc = this.a.zzc();
        } catch (RemoteException e3) {
            er.zzg("", e3);
        }
        this.f10600c = uriZzc;
        try {
            dZzd = this.a.zzd();
        } catch (RemoteException e4) {
            er.zzg("", e4);
            dZzd = 1.0d;
        }
        this.f10601d = dZzd;
        try {
            this.a.zze();
        } catch (RemoteException e5) {
            er.zzg("", e5);
        }
        try {
            this.a.zzf();
        } catch (RemoteException e6) {
            er.zzg("", e6);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final Drawable getDrawable() {
        return this.f10599b;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final double getScale() {
        return this.f10601d;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final Uri getUri() {
        return this.f10600c;
    }
}