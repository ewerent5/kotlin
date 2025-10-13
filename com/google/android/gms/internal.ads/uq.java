package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class uq extends Thread {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f9530e;

    uq(vq vqVar, String str) {
        this.f9530e = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new jr(null).zza(this.f9530e);
    }
}