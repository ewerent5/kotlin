package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class yx2 implements qy2 {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ zx2 f10509b;

    public yx2(zx2 zx2Var, int i2) {
        this.f10509b = zx2Var;
        this.a = i2;
    }

    @Override // com.google.android.gms.internal.ads.qy2
    public final void a(long j2) {
        this.f10509b.w(this.a, j2);
    }

    @Override // com.google.android.gms.internal.ads.qy2
    public final int b(ys2 ys2Var, su2 su2Var, boolean z) {
        return this.f10509b.v(this.a, ys2Var, su2Var, z);
    }

    @Override // com.google.android.gms.internal.ads.qy2
    public final boolean zza() {
        return this.f10509b.t(this.a);
    }

    @Override // com.google.android.gms.internal.ads.qy2
    public final void zzb() {
        this.f10509b.u();
    }
}