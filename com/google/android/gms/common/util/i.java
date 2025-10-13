package com.google.android.gms.common.util;

import android.os.SystemClock;
import androidx.annotation.RecentlyNonNull;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public class i implements f {
    private static final i a = new i();

    private i() {
    }

    @RecentlyNonNull
    public static f d() {
        return a;
    }

    @Override // com.google.android.gms.common.util.f
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.common.util.f
    public final long b() {
        return SystemClock.currentThreadTimeMillis();
    }

    @Override // com.google.android.gms.common.util.f
    public final long c() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.common.util.f
    public final long nanoTime() {
        return System.nanoTime();
    }
}