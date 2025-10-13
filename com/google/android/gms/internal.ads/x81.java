package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class x81 implements zzf {
    private final oa0 a;

    /* renamed from: b, reason: collision with root package name */
    private final gb0 f10139b;

    /* renamed from: c, reason: collision with root package name */
    private final th0 f10140c;

    /* renamed from: d, reason: collision with root package name */
    private final ph0 f10141d;

    /* renamed from: e, reason: collision with root package name */
    private final y20 f10142e;

    /* renamed from: f, reason: collision with root package name */
    final AtomicBoolean f10143f = new AtomicBoolean(false);

    x81(oa0 oa0Var, gb0 gb0Var, th0 th0Var, ph0 ph0Var, y20 y20Var) {
        this.a = oa0Var;
        this.f10139b = gb0Var;
        this.f10140c = th0Var;
        this.f10141d = ph0Var;
        this.f10142e = y20Var;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zza(View view) {
        if (this.f10143f.compareAndSet(false, true)) {
            this.f10142e.b();
            this.f10141d.K0(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
        if (this.f10143f.get()) {
            this.a.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
        if (this.f10143f.get()) {
            this.f10139b.zza();
            this.f10140c.zza();
        }
    }
}