package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class nq {
    private final Object a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private volatile int f7770c = 1;

    /* renamed from: b, reason: collision with root package name */
    private volatile long f7769b = 0;

    /* synthetic */ nq(mq mqVar) {
    }

    public final void a() {
        long jA = zzs.zzj().a();
        synchronized (this.a) {
            if (this.f7770c == 3) {
                if (this.f7769b + ((Long) c.c().b(w3.c4)).longValue() <= jA) {
                    this.f7770c = 1;
                }
            }
        }
        long jA2 = zzs.zzj().a();
        synchronized (this.a) {
            if (this.f7770c != 2) {
                return;
            }
            this.f7770c = 3;
            if (this.f7770c == 3) {
                this.f7769b = jA2;
            }
        }
    }
}