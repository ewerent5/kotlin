package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class j6 implements Runnable {

    /* renamed from: e */
    private final /* synthetic */ AtomicReference f10966e;

    /* renamed from: f */
    private final /* synthetic */ i6 f10967f;

    j6(i6 i6Var, AtomicReference atomicReference) {
        this.f10967f = i6Var;
        this.f10966e = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f10966e) {
            try {
                this.f10966e.set(Boolean.valueOf(this.f10967f.i().I(this.f10967f.l().x())));
            } finally {
                this.f10966e.notify();
            }
        }
    }
}