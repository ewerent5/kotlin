package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class qs implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ rs f8454e;

    qs(rs rsVar) {
        this.f8454e = rsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f8454e.w != null) {
            this.f8454e.w.zzd();
        }
    }
}