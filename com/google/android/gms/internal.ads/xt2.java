package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
class xt2 {
    protected AudioTrack a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f10258b;

    /* renamed from: c, reason: collision with root package name */
    private int f10259c;

    /* renamed from: d, reason: collision with root package name */
    private long f10260d;

    /* renamed from: e, reason: collision with root package name */
    private long f10261e;

    /* renamed from: f, reason: collision with root package name */
    private long f10262f;

    /* renamed from: g, reason: collision with root package name */
    private long f10263g;

    /* renamed from: h, reason: collision with root package name */
    private long f10264h;

    /* renamed from: i, reason: collision with root package name */
    private long f10265i;

    /* synthetic */ xt2(wt2 wt2Var) {
    }

    public void a(AudioTrack audioTrack, boolean z) {
        this.a = audioTrack;
        this.f10258b = z;
        this.f10263g = -9223372036854775807L;
        this.f10260d = 0L;
        this.f10261e = 0L;
        this.f10262f = 0L;
        if (audioTrack != null) {
            this.f10259c = audioTrack.getSampleRate();
        }
    }

    public final void b(long j2) {
        this.f10264h = d();
        this.f10263g = SystemClock.elapsedRealtime() * 1000;
        this.f10265i = j2;
        this.a.stop();
    }

    public final void c() {
        if (this.f10263g != -9223372036854775807L) {
            return;
        }
        this.a.pause();
    }

    public final long d() {
        if (this.f10263g != -9223372036854775807L) {
            return Math.min(this.f10265i, this.f10264h + ((((SystemClock.elapsedRealtime() * 1000) - this.f10263g) * this.f10259c) / 1000000));
        }
        int playState = this.a.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = this.a.getPlaybackHeadPosition() & 4294967295L;
        if (this.f10258b) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f10262f = this.f10260d;
            }
            playbackHeadPosition += this.f10262f;
        }
        if (this.f10260d > playbackHeadPosition) {
            this.f10261e++;
        }
        this.f10260d = playbackHeadPosition;
        return playbackHeadPosition + (this.f10261e << 32);
    }

    public final long e() {
        return (d() * 1000000) / this.f10259c;
    }

    public boolean f() {
        return false;
    }

    public long g() {
        throw new UnsupportedOperationException();
    }

    public long h() {
        throw new UnsupportedOperationException();
    }
}