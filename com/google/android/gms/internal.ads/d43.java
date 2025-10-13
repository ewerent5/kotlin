package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import com.google.android.gms.common.internal.b;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class d43 {
    private final Runnable a = new z33(this);

    /* renamed from: b, reason: collision with root package name */
    private final Object f5427b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("lock")
    private g43 f5428c;

    /* renamed from: d, reason: collision with root package name */
    @GuardedBy("lock")
    private Context f5429d;

    /* renamed from: e, reason: collision with root package name */
    @GuardedBy("lock")
    private j43 f5430e;

    static /* synthetic */ void f(d43 d43Var) {
        synchronized (d43Var.f5427b) {
            g43 g43Var = d43Var.f5428c;
            if (g43Var == null) {
                return;
            }
            if (g43Var.isConnected() || d43Var.f5428c.isConnecting()) {
                d43Var.f5428c.disconnect();
            }
            d43Var.f5428c = null;
            d43Var.f5430e = null;
            Binder.flushPendingCommands();
        }
    }

    static /* synthetic */ g43 j(d43 d43Var, g43 g43Var) {
        d43Var.f5428c = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        synchronized (this.f5427b) {
            if (this.f5429d == null || this.f5428c != null) {
                return;
            }
            g43 g43VarE = e(new b43(this), new c43(this));
            this.f5428c = g43VarE;
            g43VarE.checkAvailabilityAndConnect();
        }
    }

    public final void a(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.f5427b) {
            if (this.f5429d != null) {
                return;
            }
            this.f5429d = context.getApplicationContext();
            if (((Boolean) c.c().b(w3.t2)).booleanValue()) {
                l();
            } else {
                if (((Boolean) c.c().b(w3.s2)).booleanValue()) {
                    zzs.zzf().b(new a43(this));
                }
            }
        }
    }

    public final void b() {
        if (((Boolean) c.c().b(w3.u2)).booleanValue()) {
            synchronized (this.f5427b) {
                l();
                l02 l02Var = zzr.zza;
                l02Var.removeCallbacks(this.a);
                l02Var.postDelayed(this.a, ((Long) c.c().b(w3.v2)).longValue());
            }
        }
    }

    public final e43 c(h43 h43Var) {
        synchronized (this.f5427b) {
            if (this.f5430e == null) {
                return new e43();
            }
            try {
                if (this.f5428c.c()) {
                    return this.f5430e.U(h43Var);
                }
                return this.f5430e.R(h43Var);
            } catch (RemoteException e2) {
                er.zzg("Unable to call into cache service.", e2);
                return new e43();
            }
        }
    }

    public final long d(h43 h43Var) {
        synchronized (this.f5427b) {
            if (this.f5430e == null) {
                return -2L;
            }
            if (this.f5428c.c()) {
                try {
                    return this.f5430e.Y(h43Var);
                } catch (RemoteException e2) {
                    er.zzg("Unable to call into cache service.", e2);
                }
            }
            return -2L;
        }
    }

    protected final synchronized g43 e(b.a aVar, b.InterfaceC0113b interfaceC0113b) {
        return new g43(this.f5429d, zzs.zzq().zza(), aVar, interfaceC0113b);
    }
}