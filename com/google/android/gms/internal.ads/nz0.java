package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzs;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class nz0 extends gz0 {

    /* renamed from: g, reason: collision with root package name */
    private String f7851g;

    /* renamed from: h, reason: collision with root package name */
    private int f7852h = 1;

    public nz0(Context context) {
        this.f6251f = new al(context, zzs.zzq().zza(), this, this);
    }

    @Override // com.google.android.gms.internal.ads.gz0, com.google.android.gms.common.internal.b.InterfaceC0113b
    public final void U(com.google.android.gms.common.b bVar) {
        er.zzd("Cannot connect to remote service, fallback to local instance.");
        this.a.zzd(new uz0(1));
    }

    @Override // com.google.android.gms.common.internal.b.a
    public final void Y(Bundle bundle) {
        synchronized (this.f6247b) {
            if (!this.f6249d) {
                this.f6249d = true;
                try {
                    try {
                        int i2 = this.f7852h;
                        if (i2 == 2) {
                            this.f6251f.c().J0(this.f6250e, new fz0(this));
                        } else if (i2 == 3) {
                            this.f6251f.c().i3(this.f7851g, new fz0(this));
                        } else {
                            this.a.zzd(new uz0(1));
                        }
                    } catch (Throwable th) {
                        zzs.zzg().g(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                        this.a.zzd(new uz0(1));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.a.zzd(new uz0(1));
                }
            }
        }
    }

    public final g52<InputStream> b(ql qlVar) {
        synchronized (this.f6247b) {
            int i2 = this.f7852h;
            if (i2 != 1 && i2 != 2) {
                return y42.b(new uz0(2));
            }
            if (this.f6248c) {
                return this.a;
            }
            this.f7852h = 2;
            this.f6248c = true;
            this.f6250e = qlVar;
            this.f6251f.checkAvailabilityAndConnect();
            this.a.zze(new Runnable(this) { // from class: com.google.android.gms.internal.ads.lz0

                /* renamed from: e, reason: collision with root package name */
                private final nz0 f7372e;

                {
                    this.f7372e = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f7372e.a();
                }
            }, qr.f8451f);
            return this.a;
        }
    }

    public final g52<InputStream> c(String str) {
        synchronized (this.f6247b) {
            int i2 = this.f7852h;
            if (i2 != 1 && i2 != 3) {
                return y42.b(new uz0(2));
            }
            if (this.f6248c) {
                return this.a;
            }
            this.f7852h = 3;
            this.f6248c = true;
            this.f7851g = str;
            this.f6251f.checkAvailabilityAndConnect();
            this.a.zze(new Runnable(this) { // from class: com.google.android.gms.internal.ads.mz0

                /* renamed from: e, reason: collision with root package name */
                private final nz0 f7603e;

                {
                    this.f7603e = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f7603e.a();
                }
            }, qr.f8451f);
            return this.a;
        }
    }
}