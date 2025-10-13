package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzp;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class n70 implements zzp {

    /* renamed from: e, reason: collision with root package name */
    private final wb0 f7662e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f7663f = new AtomicBoolean(false);

    public n70(wb0 wb0Var) {
        this.f7662e = wb0Var;
    }

    public final boolean a() {
        return this.f7663f.get();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbJ() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbo() {
        this.f7662e.zzc();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbs() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbt(int i2) {
        this.f7663f.set(true);
        this.f7662e.zza();
    }
}