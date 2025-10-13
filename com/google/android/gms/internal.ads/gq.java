package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class gq implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Context f6155e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ wr f6156f;

    gq(hq hqVar, Context context, wr wrVar) {
        this.f6155e = context;
        this.f6156f = wrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f6156f.zzc(AdvertisingIdClient.getAdvertisingIdInfo(this.f6155e));
        } catch (com.google.android.gms.common.g | com.google.android.gms.common.h | IOException | IllegalStateException e2) {
            this.f6156f.zzd(e2);
            er.zzg("Exception while getting advertising Id info", e2);
        }
    }
}