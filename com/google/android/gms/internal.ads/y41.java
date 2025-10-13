package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class y41 implements e42 {
    private final a51 a;

    /* renamed from: b */
    private final Uri f10366b;

    /* renamed from: c */
    private final kp1 f10367c;

    /* renamed from: d */
    private final xo1 f10368d;

    y41(a51 a51Var, Uri uri, kp1 kp1Var, xo1 xo1Var) {
        this.a = a51Var;
        this.f10366b = uri;
        this.f10367c = kp1Var;
        this.f10368d = xo1Var;
    }

    @Override // com.google.android.gms.internal.ads.e42
    public final g52 zza(Object obj) {
        return this.a.c(this.f10366b, this.f10367c, this.f10368d, obj);
    }
}