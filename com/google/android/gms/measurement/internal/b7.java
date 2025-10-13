package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class b7 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f10770e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ i6 f10771f;

    b7(i6 i6Var, AtomicReference atomicReference) {
        this.f10771f = i6Var;
        this.f10770e = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f10770e) {
            try {
                this.f10770e.set(Double.valueOf(this.f10771f.i().r(this.f10771f.l().x(), t.P)));
            } finally {
                this.f10770e.notify();
            }
        }
    }
}