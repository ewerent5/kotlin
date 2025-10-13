package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class c6 extends s6 {

    /* renamed from: e, reason: collision with root package name */
    private final Drawable f5266e;

    /* renamed from: f, reason: collision with root package name */
    private final Uri f5267f;

    /* renamed from: g, reason: collision with root package name */
    private final double f5268g;

    /* renamed from: h, reason: collision with root package name */
    private final int f5269h;

    /* renamed from: i, reason: collision with root package name */
    private final int f5270i;

    public c6(Drawable drawable, Uri uri, double d2, int i2, int i3) {
        this.f5266e = drawable;
        this.f5267f = uri;
        this.f5268g = d2;
        this.f5269h = i2;
        this.f5270i = i3;
    }

    @Override // com.google.android.gms.internal.ads.t6
    public final e.c.b.b.b.b zzb() {
        return e.c.b.b.b.d.m4(this.f5266e);
    }

    @Override // com.google.android.gms.internal.ads.t6
    public final Uri zzc() {
        return this.f5267f;
    }

    @Override // com.google.android.gms.internal.ads.t6
    public final double zzd() {
        return this.f5268g;
    }

    @Override // com.google.android.gms.internal.ads.t6
    public final int zze() {
        return this.f5269h;
    }

    @Override // com.google.android.gms.internal.ads.t6
    public final int zzf() {
        return this.f5270i;
    }
}