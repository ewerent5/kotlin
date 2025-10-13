package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import java.util.HashMap;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
final class z0 extends i {

    /* renamed from: e, reason: collision with root package name */
    private final Context f4754e;

    /* renamed from: f, reason: collision with root package name */
    private final Handler f4755f;

    /* renamed from: d, reason: collision with root package name */
    @GuardedBy("connectionStatus")
    private final HashMap<v0, x0> f4753d = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.common.o.a f4756g = com.google.android.gms.common.o.a.b();

    /* renamed from: h, reason: collision with root package name */
    private final long f4757h = 5000;

    /* renamed from: i, reason: collision with root package name */
    private final long f4758i = 300000;

    z0(Context context) {
        this.f4754e = context.getApplicationContext();
        this.f4755f = new e.c.b.b.c.c.d(context.getMainLooper(), new y0(this, null));
    }

    @Override // com.google.android.gms.common.internal.i
    protected final boolean d(v0 v0Var, ServiceConnection serviceConnection, String str) {
        boolean zE;
        p.k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f4753d) {
            x0 x0Var = this.f4753d.get(v0Var);
            if (x0Var == null) {
                x0Var = new x0(this, v0Var);
                x0Var.c(serviceConnection, serviceConnection, str);
                x0Var.a(str);
                this.f4753d.put(v0Var, x0Var);
            } else {
                this.f4755f.removeMessages(0, v0Var);
                if (x0Var.g(serviceConnection)) {
                    String strValueOf = String.valueOf(v0Var);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(strValueOf);
                    throw new IllegalStateException(sb.toString());
                }
                x0Var.c(serviceConnection, serviceConnection, str);
                int iF = x0Var.f();
                if (iF == 1) {
                    serviceConnection.onServiceConnected(x0Var.j(), x0Var.i());
                } else if (iF == 2) {
                    x0Var.a(str);
                }
            }
            zE = x0Var.e();
        }
        return zE;
    }

    @Override // com.google.android.gms.common.internal.i
    protected final void e(v0 v0Var, ServiceConnection serviceConnection, String str) {
        p.k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f4753d) {
            x0 x0Var = this.f4753d.get(v0Var);
            if (x0Var == null) {
                String strValueOf = String.valueOf(v0Var);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(strValueOf);
                throw new IllegalStateException(sb.toString());
            }
            if (!x0Var.g(serviceConnection)) {
                String strValueOf2 = String.valueOf(v0Var);
                StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(strValueOf2);
                throw new IllegalStateException(sb2.toString());
            }
            x0Var.d(serviceConnection, str);
            if (x0Var.h()) {
                this.f4755f.sendMessageDelayed(this.f4755f.obtainMessage(0, v0Var), this.f4757h);
            }
        }
    }
}