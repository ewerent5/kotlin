package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class os implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ rs f8011e;

    os(rs rsVar) {
        this.f8011e = rsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f8011e.w != null) {
            this.f8011e.w.zzd();
            this.f8011e.w.zzh();
        }
    }
}