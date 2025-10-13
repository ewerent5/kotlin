package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class q4 implements ServiceConnection {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r4 f11139b;

    q4(r4 r4Var, String str) {
        this.f11139b = r4Var;
        this.a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f11139b.a.zzq().D().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            e.c.b.b.c.e.o2 o2VarU = e.c.b.b.c.e.q5.U(iBinder);
            if (o2VarU == null) {
                this.f11139b.a.zzq().D().a("Install Referrer Service implementation was not found");
            } else {
                this.f11139b.a.zzq().I().a("Install Referrer Service connected");
                this.f11139b.a.zzp().u(new t4(this, o2VarU, this));
            }
        } catch (Exception e2) {
            this.f11139b.a.zzq().D().b("Exception occurred while calling Install Referrer API", e2);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f11139b.a.zzq().I().a("Install Referrer Service disconnected");
    }
}