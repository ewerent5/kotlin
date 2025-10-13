package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class yc0 extends sf0<ad0> implements ib0, pc0 {

    /* renamed from: f, reason: collision with root package name */
    private final xo1 f10403f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f10404g;

    public yc0(Set<nh0<ad0>> set, xo1 xo1Var) {
        super(set);
        this.f10404g = new AtomicBoolean();
        this.f10403f = xo1Var;
    }

    private final void zzc() {
        t93 t93Var;
        if (((Boolean) c.c().b(w3.a5)).booleanValue() && this.f10404g.compareAndSet(false, true) && (t93Var = this.f10403f.Z) != null && t93Var.f9099e == 3) {
            J0(new rf0(this) { // from class: com.google.android.gms.internal.ads.xc0
                private final yc0 a;

                {
                    this.a = this;
                }

                @Override // com.google.android.gms.internal.ads.rf0
                public final void zza(Object obj) {
                    this.a.K0((ad0) obj);
                }
            });
        }
    }

    final /* synthetic */ void K0(ad0 ad0Var) {
        ad0Var.c(this.f10403f.Z);
    }

    @Override // com.google.android.gms.internal.ads.ib0
    public final void b() {
        int i2 = this.f10403f.f10197b;
        if (i2 == 2 || i2 == 5 || i2 == 4 || i2 == 6) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.pc0
    public final void t() {
        if (this.f10403f.f10197b == 1) {
            zzc();
        }
    }
}