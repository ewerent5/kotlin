package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class y6 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f11349e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ i6 f11350f;

    y6(i6 i6Var, AtomicReference atomicReference) {
        this.f11350f = i6Var;
        this.f11349e = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f11349e) {
            try {
                this.f11349e.set(Integer.valueOf(this.f11350f.i().q(this.f11350f.l().x(), t.O)));
            } finally {
                this.f11349e.notify();
            }
        }
    }
}