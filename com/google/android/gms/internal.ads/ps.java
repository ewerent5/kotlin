package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ps implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ rs f8260e;

    ps(rs rsVar) {
        this.f8260e = rsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f8260e.w != null) {
            this.f8260e.w.zzc();
        }
    }
}