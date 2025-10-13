package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ks implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ rs f7062e;

    ks(rs rsVar) {
        this.f7062e = rsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f7062e.w != null) {
            this.f7062e.w.zze();
        }
    }
}