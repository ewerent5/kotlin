package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class s6 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f11205e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ i6 f11206f;

    s6(i6 i6Var, AtomicReference atomicReference) {
        this.f11206f = i6Var;
        this.f11205e = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f11205e) {
            try {
                this.f11205e.set(this.f11206f.i().J(this.f11206f.l().x()));
            } finally {
                this.f11205e.notify();
            }
        }
    }
}