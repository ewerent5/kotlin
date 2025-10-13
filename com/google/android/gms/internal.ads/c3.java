package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class c3 extends p1 {

    /* renamed from: e, reason: collision with root package name */
    private final VideoController.VideoLifecycleCallbacks f5247e;

    public c3(VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.f5247e = videoLifecycleCallbacks;
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final void S2(boolean z) {
        this.f5247e.onVideoMute(z);
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final void zze() {
        this.f5247e.onVideoStart();
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final void zzf() {
        this.f5247e.onVideoPlay();
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final void zzg() {
        this.f5247e.onVideoPause();
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final void zzh() {
        this.f5247e.onVideoEnd();
    }
}