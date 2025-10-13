package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class jf implements Runnable {

    /* renamed from: e */
    private final lf f6742e;

    /* renamed from: f */
    private final Context f6743f;

    /* renamed from: g */
    private final String f6744g;

    jf(lf lfVar, Context context, String str) {
        this.f6742e = lfVar;
        this.f6743f = context;
        this.f6744g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f6743f;
        String str = this.f6744g;
        w3.a(context);
        Bundle bundle = new Bundle();
        bundle.putBoolean("measurementEnabled", ((Boolean) c.c().b(w3.c0)).booleanValue());
        if (((Boolean) c.c().b(w3.j0)).booleanValue()) {
            bundle.putString("ad_storage", "denied");
            bundle.putString("analytics_storage", "denied");
        }
        try {
            ((by) ir.a(context, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", kf.a)).G1(e.c.b.b.b.d.m4(context), new Cif(com.google.android.gms.measurement.a.a.k(context, "FA-Ads", "am", str, bundle)));
        } catch (RemoteException | hr | NullPointerException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }
}