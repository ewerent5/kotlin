package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
final class y0 implements Handler.Callback {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ z0 f4752e;

    /* synthetic */ y0(z0 z0Var, w0 w0Var) {
        this.f4752e = z0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            synchronized (this.f4752e.f4753d) {
                v0 v0Var = (v0) message.obj;
                x0 x0Var = (x0) this.f4752e.f4753d.get(v0Var);
                if (x0Var != null && x0Var.h()) {
                    if (x0Var.e()) {
                        x0Var.b("GmsClientSupervisor");
                    }
                    this.f4752e.f4753d.remove(v0Var);
                }
            }
            return true;
        }
        if (i2 != 1) {
            return false;
        }
        synchronized (this.f4752e.f4753d) {
            v0 v0Var2 = (v0) message.obj;
            x0 x0Var2 = (x0) this.f4752e.f4753d.get(v0Var2);
            if (x0Var2 != null && x0Var2.f() == 3) {
                String strValueOf = String.valueOf(v0Var2);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
                sb.append("Timeout waiting for ServiceConnection callback ");
                sb.append(strValueOf);
                Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                ComponentName componentNameJ = x0Var2.j();
                if (componentNameJ == null) {
                    componentNameJ = v0Var2.b();
                }
                if (componentNameJ == null) {
                    String strA = v0Var2.a();
                    p.j(strA);
                    componentNameJ = new ComponentName(strA, "unknown");
                }
                x0Var2.onServiceDisconnected(componentNameJ);
            }
        }
        return true;
    }
}