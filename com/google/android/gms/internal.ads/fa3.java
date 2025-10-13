package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class fa3 extends sa3<kj> {

    /* renamed from: b */
    final /* synthetic */ Context f5831b;

    /* renamed from: c */
    final /* synthetic */ tf f5832c;

    fa3(ra3 ra3Var, Context context, tf tfVar) {
        this.f5831b = context;
        this.f5832c = tfVar;
    }

    @Override // com.google.android.gms.internal.ads.sa3
    protected final /* bridge */ /* synthetic */ kj a() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.sa3
    public final /* bridge */ /* synthetic */ kj b() {
        try {
            return ((oj) ir.a(this.f5831b, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", ea3.a)).T(e.c.b.b.b.d.m4(this.f5831b), this.f5832c, 210890000);
        } catch (RemoteException | hr | NullPointerException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.sa3
    public final /* bridge */ /* synthetic */ kj c(h0 h0Var) {
        return h0Var.zzn(e.c.b.b.b.d.m4(this.f5831b), this.f5832c, 210890000);
    }
}