package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class da3 extends sa3<zp> {

    /* renamed from: b */
    final /* synthetic */ Context f5459b;

    /* renamed from: c */
    final /* synthetic */ tf f5460c;

    da3(ra3 ra3Var, Context context, tf tfVar) {
        this.f5459b = context;
        this.f5460c = tfVar;
    }

    @Override // com.google.android.gms.internal.ads.sa3
    protected final /* bridge */ /* synthetic */ zp a() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.sa3
    public final /* bridge */ /* synthetic */ zp b() {
        try {
            return ((cq) ir.a(this.f5459b, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", ca3.a)).T(e.c.b.b.b.d.m4(this.f5459b), this.f5460c, 210890000);
        } catch (RemoteException | hr | NullPointerException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.sa3
    public final /* bridge */ /* synthetic */ zp c(h0 h0Var) {
        return h0Var.zzm(e.c.b.b.b.d.m4(this.f5459b), this.f5460c, 210890000);
    }
}