package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class ha3 extends sa3<ab> {

    /* renamed from: b */
    final /* synthetic */ Context f6316b;

    /* renamed from: c */
    final /* synthetic */ tf f6317c;

    /* renamed from: d */
    final /* synthetic */ OnH5AdsEventListener f6318d;

    ha3(ra3 ra3Var, Context context, tf tfVar, OnH5AdsEventListener onH5AdsEventListener) {
        this.f6316b = context;
        this.f6317c = tfVar;
        this.f6318d = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.internal.ads.sa3
    protected final /* bridge */ /* synthetic */ ab a() {
        return new hb();
    }

    @Override // com.google.android.gms.internal.ads.sa3
    public final /* bridge */ /* synthetic */ ab b() {
        try {
            return ((db) ir.a(this.f6316b, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", ga3.a)).g2(e.c.b.b.b.d.m4(this.f6316b), this.f6317c, 210890000, new ua(this.f6318d));
        } catch (RemoteException | hr | NullPointerException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.sa3
    public final /* bridge */ /* synthetic */ ab c(h0 h0Var) {
        return h0Var.zzo(e.c.b.b.b.d.m4(this.f6316b), this.f6317c, 210890000, new ua(this.f6318d));
    }
}