package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@TargetApi(19)
/* loaded from: classes.dex */
final class yt2 extends xt2 {

    /* renamed from: j, reason: collision with root package name */
    private final AudioTimestamp f10484j;

    /* renamed from: k, reason: collision with root package name */
    private long f10485k;

    /* renamed from: l, reason: collision with root package name */
    private long f10486l;

    /* renamed from: m, reason: collision with root package name */
    private long f10487m;

    public yt2() {
        super(null);
        this.f10484j = new AudioTimestamp();
    }

    @Override // com.google.android.gms.internal.ads.xt2
    public final void a(AudioTrack audioTrack, boolean z) {
        super.a(audioTrack, z);
        this.f10485k = 0L;
        this.f10486l = 0L;
        this.f10487m = 0L;
    }

    @Override // com.google.android.gms.internal.ads.xt2
    public final boolean f() {
        boolean timestamp = this.a.getTimestamp(this.f10484j);
        if (timestamp) {
            long j2 = this.f10484j.framePosition;
            if (this.f10486l > j2) {
                this.f10485k++;
            }
            this.f10486l = j2;
            this.f10487m = j2 + (this.f10485k << 32);
        }
        return timestamp;
    }

    @Override // com.google.android.gms.internal.ads.xt2
    public final long g() {
        return this.f10484j.nanoTime;
    }

    @Override // com.google.android.gms.internal.ads.xt2
    public final long h() {
        return this.f10487m;
    }
}