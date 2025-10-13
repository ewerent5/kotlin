package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class lo0 implements x02 {
    private final String a;

    /* renamed from: b */
    private final double f7278b;

    /* renamed from: c */
    private final int f7279c;

    /* renamed from: d */
    private final int f7280d;

    lo0(String str, double d2, int i2, int i3) {
        this.a = str;
        this.f7278b = d2;
        this.f7279c = i2;
        this.f7280d = i3;
    }

    @Override // com.google.android.gms.internal.ads.x02
    public final Object apply(Object obj) {
        String str = this.a;
        return new c6(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), this.f7278b, this.f7279c, this.f7280d);
    }
}