package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ms implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ rs f7535e;

    ms(rs rsVar) {
        this.f7535e = rsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f7535e.w != null) {
            this.f7535e.w.zza();
        }
    }
}