package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ud implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ fe f9424e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ad f9425f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ ge f9426g;

    ud(ge geVar, fe feVar, ad adVar) {
        this.f9426g = geVar;
        this.f9424e = feVar;
        this.f9425f = adVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f9426g.a) {
            if (this.f9424e.d() != -1 && this.f9424e.d() != 1) {
                this.f9424e.c();
                qr.f8450e.execute(td.a(this.f9425f));
                zze.zza("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }
}