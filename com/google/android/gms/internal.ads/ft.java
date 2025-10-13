package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import com.google.android.gms.ads.internal.util.zzr;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@TargetApi(14)
/* loaded from: classes.dex */
public final class ft {

    /* renamed from: b, reason: collision with root package name */
    private long f5942b;
    private final long a = TimeUnit.MILLISECONDS.toNanos(((Long) c.c().b(w3.z)).longValue());

    /* renamed from: c, reason: collision with root package name */
    private boolean f5943c = true;

    ft() {
    }

    public final void a() {
        this.f5943c = true;
    }

    public final void b(SurfaceTexture surfaceTexture, ss ssVar) {
        if (ssVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (this.f5943c || Math.abs(timestamp - this.f5942b) >= this.a) {
            this.f5943c = false;
            this.f5942b = timestamp;
            zzr.zza.post(new et(this, ssVar));
        }
    }
}