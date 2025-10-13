package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ko {
    private final com.google.android.gms.common.util.f a;

    /* renamed from: b, reason: collision with root package name */
    private final zzg f7013b;

    /* renamed from: c, reason: collision with root package name */
    private final kp f7014c;

    ko(com.google.android.gms.common.util.f fVar, zzg zzgVar, kp kpVar) {
        this.a = fVar;
        this.f7013b = zzgVar;
        this.f7014c = kpVar;
    }

    public final void a(int i2, long j2) {
        if (((Boolean) c.c().b(w3.k0)).booleanValue()) {
            return;
        }
        if (j2 - this.f7013b.zzD() < 0) {
            zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) c.c().b(w3.l0)).booleanValue()) {
            this.f7013b.zzC(i2);
            this.f7013b.zzE(j2);
        } else {
            this.f7013b.zzC(-1);
            this.f7013b.zzE(j2);
        }
        b();
    }

    public final void b() {
        if (((Boolean) c.c().b(w3.l0)).booleanValue()) {
            this.f7014c.f();
        }
    }
}