package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class js implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ MediaPlayer f6828e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ rs f6829f;

    js(rs rsVar, MediaPlayer mediaPlayer) {
        this.f6829f = rsVar;
        this.f6828e = mediaPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rs.I(this.f6829f, this.f6828e);
        if (this.f6829f.w != null) {
            this.f6829f.w.zzb();
        }
    }
}