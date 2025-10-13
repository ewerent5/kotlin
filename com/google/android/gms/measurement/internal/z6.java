package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class z6 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f11379e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ i6 f11380f;

    z6(i6 i6Var, AtomicReference atomicReference) {
        this.f11380f = i6Var;
        this.f11379e = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f11379e) {
            try {
                this.f11379e.set(Long.valueOf(this.f11380f.i().l(this.f11380f.l().x(), t.N)));
            } finally {
                this.f11379e.notify();
            }
        }
    }
}