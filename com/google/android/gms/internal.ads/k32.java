package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class k32 extends g32 {
    final AtomicReferenceFieldUpdater<q32, Thread> a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<q32, q32> f6943b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<f32, q32> f6944c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<f32, j32> f6945d;

    /* renamed from: e, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<f32, Object> f6946e;

    k32(AtomicReferenceFieldUpdater<q32, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<q32, q32> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<f32, q32> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<f32, j32> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<f32, Object> atomicReferenceFieldUpdater5) {
        super(null);
        this.a = atomicReferenceFieldUpdater;
        this.f6943b = atomicReferenceFieldUpdater2;
        this.f6944c = atomicReferenceFieldUpdater3;
        this.f6945d = atomicReferenceFieldUpdater4;
        this.f6946e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.ads.g32
    final void a(q32 q32Var, Thread thread) {
        this.a.lazySet(q32Var, thread);
    }

    @Override // com.google.android.gms.internal.ads.g32
    final void b(q32 q32Var, q32 q32Var2) {
        this.f6943b.lazySet(q32Var, q32Var2);
    }

    @Override // com.google.android.gms.internal.ads.g32
    final boolean c(f32<?> f32Var, q32 q32Var, q32 q32Var2) {
        return this.f6944c.compareAndSet(f32Var, q32Var, q32Var2);
    }

    @Override // com.google.android.gms.internal.ads.g32
    final boolean d(f32<?> f32Var, j32 j32Var, j32 j32Var2) {
        return this.f6945d.compareAndSet(f32Var, j32Var, j32Var2);
    }

    @Override // com.google.android.gms.internal.ads.g32
    final boolean e(f32<?> f32Var, Object obj, Object obj2) {
        return this.f6946e.compareAndSet(f32Var, obj, obj2);
    }
}