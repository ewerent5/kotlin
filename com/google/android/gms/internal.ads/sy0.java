package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import java.io.InputStream;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class sy0 {
    private final ScheduledExecutorService a;

    /* renamed from: b, reason: collision with root package name */
    private final h52 f9021b;

    /* renamed from: c, reason: collision with root package name */
    private final iz0 f9022c;

    /* renamed from: d, reason: collision with root package name */
    private final go2<v01> f9023d;

    public sy0(ScheduledExecutorService scheduledExecutorService, h52 h52Var, iz0 iz0Var, go2<v01> go2Var) {
        this.a = scheduledExecutorService;
        this.f9021b = h52Var;
        this.f9022c = iz0Var;
        this.f9023d = go2Var;
    }

    public final g52<InputStream> a(final ql qlVar) {
        g52 g52VarB;
        String str = qlVar.f8404h;
        zzs.zzc();
        if (zzr.zzE(str)) {
            g52VarB = y42.b(new uz0(1));
        } else {
            final iz0 iz0Var = this.f9022c;
            synchronized (iz0Var.f6247b) {
                if (iz0Var.f6248c) {
                    g52VarB = iz0Var.a;
                } else {
                    iz0Var.f6248c = true;
                    iz0Var.f6250e = qlVar;
                    iz0Var.f6251f.checkAvailabilityAndConnect();
                    iz0Var.a.zze(new Runnable(iz0Var) { // from class: com.google.android.gms.internal.ads.hz0

                        /* renamed from: e, reason: collision with root package name */
                        private final iz0 f6446e;

                        {
                            this.f6446e = iz0Var;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f6446e.a();
                        }
                    }, qr.f8451f);
                    g52VarB = iz0Var.a;
                }
            }
        }
        final int callingUid = Binder.getCallingUid();
        return y42.f((p42) y42.g(p42.D(g52VarB), ((Integer) c.c().b(w3.H3)).intValue(), TimeUnit.SECONDS, this.a), Throwable.class, new e42(this, qlVar, callingUid) { // from class: com.google.android.gms.internal.ads.ry0
            private final sy0 a;

            /* renamed from: b, reason: collision with root package name */
            private final ql f8793b;

            /* renamed from: c, reason: collision with root package name */
            private final int f8794c;

            {
                this.a = this;
                this.f8793b = qlVar;
                this.f8794c = callingUid;
            }

            @Override // com.google.android.gms.internal.ads.e42
            public final g52 zza(Object obj) {
                return this.a.b(this.f8793b, this.f8794c, (Throwable) obj);
            }
        }, this.f9021b);
    }

    final /* synthetic */ g52 b(ql qlVar, int i2, Throwable th) {
        return this.f9023d.zzb().L4(qlVar, i2);
    }
}