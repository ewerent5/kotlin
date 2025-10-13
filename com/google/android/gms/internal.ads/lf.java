package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class lf {
    private static lf a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f7241b = new AtomicBoolean(false);

    lf() {
    }

    public static lf a() {
        if (a == null) {
            a = new lf();
        }
        return a;
    }

    public final Thread b(final Context context, final String str) {
        if (!this.f7241b.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new Runnable(this, context, str) { // from class: com.google.android.gms.internal.ads.jf

            /* renamed from: e, reason: collision with root package name */
            private final lf f6742e;

            /* renamed from: f, reason: collision with root package name */
            private final Context f6743f;

            /* renamed from: g, reason: collision with root package name */
            private final String f6744g;

            {
                this.f6742e = this;
                this.f6743f = context;
                this.f6744g = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = this.f6743f;
                String str2 = this.f6744g;
                w3.a(context2);
                Bundle bundle = new Bundle();
                bundle.putBoolean("measurementEnabled", ((Boolean) c.c().b(w3.c0)).booleanValue());
                if (((Boolean) c.c().b(w3.j0)).booleanValue()) {
                    bundle.putString("ad_storage", "denied");
                    bundle.putString("analytics_storage", "denied");
                }
                try {
                    ((by) ir.a(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", kf.a)).G1(e.c.b.b.b.d.m4(context2), new Cif(com.google.android.gms.measurement.a.a.k(context2, "FA-Ads", "am", str2, bundle)));
                } catch (RemoteException | hr | NullPointerException e2) {
                    er.zzl("#007 Could not call remote method.", e2);
                }
            }
        });
        thread.start();
        return thread;
    }
}