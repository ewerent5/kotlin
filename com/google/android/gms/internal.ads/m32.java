package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.f32;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class m32 extends g32 {
    /* synthetic */ m32(f32.a aVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.g32
    final void a(q32 q32Var, Thread thread) {
        q32Var.f8321b = thread;
    }

    @Override // com.google.android.gms.internal.ads.g32
    final void b(q32 q32Var, q32 q32Var2) {
        q32Var.f8322c = q32Var2;
    }

    @Override // com.google.android.gms.internal.ads.g32
    final boolean c(f32<?> f32Var, q32 q32Var, q32 q32Var2) {
        synchronized (f32Var) {
            if (((f32) f32Var).f5794k != q32Var) {
                return false;
            }
            ((f32) f32Var).f5794k = q32Var2;
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.g32
    final boolean d(f32<?> f32Var, j32 j32Var, j32 j32Var2) {
        synchronized (f32Var) {
            if (((f32) f32Var).f5793j != j32Var) {
                return false;
            }
            ((f32) f32Var).f5793j = j32Var2;
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.g32
    final boolean e(f32<?> f32Var, Object obj, Object obj2) {
        synchronized (f32Var) {
            if (((f32) f32Var).f5792i != obj) {
                return false;
            }
            ((f32) f32Var).f5792i = obj2;
            return true;
        }
    }
}