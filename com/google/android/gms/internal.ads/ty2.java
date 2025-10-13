package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ty2 extends jt2 {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f9297b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final long f9298c;

    /* renamed from: d, reason: collision with root package name */
    private final long f9299d;

    public ty2(long j2, boolean z) {
        this.f9298c = j2;
        this.f9299d = j2;
    }

    @Override // com.google.android.gms.internal.ads.jt2
    public final int a() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.jt2
    public final it2 b(int i2, it2 it2Var, boolean z, long j2) {
        f03.c(i2, 0, 1);
        it2Var.a = this.f9299d;
        return it2Var;
    }

    @Override // com.google.android.gms.internal.ads.jt2
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.jt2
    public final ht2 d(int i2, ht2 ht2Var, boolean z) {
        f03.c(i2, 0, 1);
        Object obj = z ? f9297b : null;
        long j2 = this.f9298c;
        ht2Var.a = obj;
        ht2Var.f6381b = obj;
        ht2Var.f6382c = j2;
        return ht2Var;
    }

    @Override // com.google.android.gms.internal.ads.jt2
    public final int e(Object obj) {
        return f9297b.equals(obj) ? 0 : -1;
    }
}