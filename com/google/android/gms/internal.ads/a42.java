package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class a42 extends z32 {
    final AtomicReferenceFieldUpdater<c42, Set<Throwable>> a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicIntegerFieldUpdater<c42> f4841b;

    a42(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.a = atomicReferenceFieldUpdater;
        this.f4841b = atomicIntegerFieldUpdater;
    }

    @Override // com.google.android.gms.internal.ads.z32
    final void a(c42 c42Var, Set<Throwable> set, Set<Throwable> set2) {
        this.a.compareAndSet(c42Var, null, set2);
    }

    @Override // com.google.android.gms.internal.ads.z32
    final int b(c42 c42Var) {
        return this.f4841b.decrementAndGet(c42Var);
    }
}