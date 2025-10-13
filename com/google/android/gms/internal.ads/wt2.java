package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class wt2 extends Thread {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AudioTrack f10035e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ eu2 f10036f;

    wt2(eu2 eu2Var, AudioTrack audioTrack) {
        this.f10036f = eu2Var;
        this.f10035e = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.f10035e.flush();
            this.f10035e.release();
        } finally {
            this.f10036f.f5710e.open();
        }
    }
}