package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ea {
    private boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f5605b = false;

    /* renamed from: c, reason: collision with root package name */
    private float f5606c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f5607d = new AtomicBoolean(false);

    public final synchronized void a(boolean z) {
        this.a = z;
        this.f5607d.set(true);
    }

    public final synchronized void b(boolean z, float f2) {
        this.f5605b = z;
        this.f5606c = f2;
    }

    public final synchronized boolean c(boolean z) {
        if (!this.f5607d.get()) {
            return z;
        }
        return this.a;
    }

    public final synchronized boolean d() {
        return this.f5605b;
    }

    public final synchronized float e() {
        return this.f5606c;
    }
}