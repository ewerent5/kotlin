package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class qx0 implements ta0, dc0, zzp, rx {

    /* renamed from: e */
    private final Context f8518e;

    /* renamed from: f */
    private final kr f8519f;

    /* renamed from: g */
    private gx0 f8520g;

    /* renamed from: h */
    private ew f8521h;

    /* renamed from: i */
    private boolean f8522i;

    /* renamed from: j */
    private boolean f8523j;

    /* renamed from: k */
    private long f8524k;

    /* renamed from: l */
    private a1 f8525l;

    /* renamed from: m */
    private boolean f8526m;

    qx0(Context context, kr krVar) {
        this.f8518e = context;
        this.f8519f = krVar;
    }

    private final synchronized boolean d(a1 a1Var) {
        if (!((Boolean) c.c().b(w3.P5)).booleanValue()) {
            er.zzi("Ad inspector had an internal error.");
            try {
                a1Var.F(mq1.d(15, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.f8520g == null) {
            er.zzi("Ad inspector had an internal error.");
            try {
                a1Var.F(mq1.d(15, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.f8522i && !this.f8523j) {
            if (zzs.zzj().a() >= this.f8524k + ((Integer) c.c().b(w3.S5)).intValue()) {
                return true;
            }
        }
        er.zzi("Ad inspector cannot be opened because it is already open.");
        try {
            a1Var.F(mq1.d(18, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    private final synchronized void e() {
        if (this.f8522i && this.f8523j) {
            qr.f8450e.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.px0

                /* renamed from: e, reason: collision with root package name */
                private final qx0 f8294e;

                {
                    this.f8294e = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f8294e.c();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.ta0
    public final void B0(g93 g93Var) {
        e();
    }

    public final void a(gx0 gx0Var) {
        this.f8520g = gx0Var;
    }

    public final synchronized void b(a1 a1Var, ca caVar) {
        if (d(a1Var)) {
            try {
                zzs.zzd();
                ew ewVarA = qw.a(this.f8518e, vx.b(), "", false, false, null, null, this.f8519f, null, null, null, w43.a(), null, null);
                this.f8521h = ewVarA;
                tx txVarE0 = ewVarA.E0();
                if (txVarE0 == null) {
                    er.zzi("Failed to obtain a web view for the ad inspector");
                    try {
                        a1Var.F(mq1.d(16, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException unused) {
                        return;
                    }
                }
                this.f8525l = a1Var;
                txVarE0.z0(null, null, null, null, null, false, null, null, null, null, null, null, null, null, caVar);
                txVarE0.i0(this);
                this.f8521h.loadUrl((String) c.c().b(w3.Q5));
                zzs.zzb();
                zzn.zza(this.f8518e, new AdOverlayInfoParcel(this, this.f8521h, 1, this.f8519f), true);
                this.f8524k = zzs.zzj().a();
            } catch (pw e2) {
                er.zzj("Failed to obtain a web view for the ad inspector", e2);
                try {
                    a1Var.F(mq1.d(16, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException unused2) {
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.dc0
    public final void b0() {
        e();
    }

    final /* synthetic */ void c() {
        this.f8521h.o("window.inspectorInfo", this.f8520g.i().toString());
    }

    @Override // com.google.android.gms.internal.ads.rx
    public final synchronized void zza(boolean z) {
        if (z) {
            zze.zza("Ad inspector loaded.");
            this.f8522i = true;
            e();
        } else {
            er.zzi("Ad inspector failed to load.");
            try {
                a1 a1Var = this.f8525l;
                if (a1Var != null) {
                    a1Var.F(mq1.d(16, null, null));
                }
            } catch (RemoteException unused) {
            }
            this.f8526m = true;
            this.f8521h.destroy();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbJ() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzbo() {
        this.f8523j = true;
        e();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbs() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzbt(int i2) {
        this.f8521h.destroy();
        if (!this.f8526m) {
            zze.zza("Inspector closed.");
            a1 a1Var = this.f8525l;
            if (a1Var != null) {
                try {
                    a1Var.F(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.f8523j = false;
        this.f8522i = false;
        this.f8524k = 0L;
        this.f8526m = false;
        this.f8525l = null;
    }
}