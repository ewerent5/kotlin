package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class c53 {
    fs2 a;

    /* renamed from: b, reason: collision with root package name */
    boolean f5265b;

    public c53() {
    }

    public c53(Context context) {
        w3.a(context);
        if (((Boolean) c.c().b(w3.c3)).booleanValue()) {
            try {
                this.a = (fs2) ir.a(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", z43.a);
                e.c.b.b.b.d.m4(context);
                this.a.l3(e.c.b.b.b.d.m4(context), "GMA_SDK");
                this.f5265b = true;
            } catch (RemoteException | hr | NullPointerException unused) {
                er.zzd("Cannot dynamite load clearcut");
            }
        }
    }
}