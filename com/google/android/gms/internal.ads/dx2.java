package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@TargetApi(21)
/* loaded from: classes.dex */
final class dx2 implements bx2 {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private MediaCodecInfo[] f5538b;

    public dx2(boolean z) {
        this.a = z ? 1 : 0;
    }

    private final void b() {
        if (this.f5538b == null) {
            this.f5538b = new MediaCodecList(this.a).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.bx2
    public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    @Override // com.google.android.gms.internal.ads.bx2
    public final int zza() {
        b();
        return this.f5538b.length;
    }

    @Override // com.google.android.gms.internal.ads.bx2
    public final MediaCodecInfo zzb(int i2) {
        b();
        return this.f5538b[i2];
    }

    @Override // com.google.android.gms.internal.ads.bx2
    public final boolean zzc() {
        return true;
    }
}