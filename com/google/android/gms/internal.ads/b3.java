package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.ShouldDelayBannerRenderingListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class b3 extends g8 {

    /* renamed from: e, reason: collision with root package name */
    private final ShouldDelayBannerRenderingListener f5053e;

    public b3(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
        this.f5053e = shouldDelayBannerRenderingListener;
    }

    @Override // com.google.android.gms.internal.ads.h8
    public final boolean k(e.c.b.b.b.b bVar) {
        return this.f5053e.shouldDelayBannerRendering((Runnable) e.c.b.b.b.d.Y(bVar));
    }
}