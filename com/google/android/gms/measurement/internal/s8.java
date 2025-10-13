package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.b;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class s8 implements ServiceConnection, b.a, b.InterfaceC0113b {
    private volatile boolean a;

    /* renamed from: b, reason: collision with root package name */
    private volatile w3 f11212b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ y7 f11213c;

    protected s8(y7 y7Var) {
        this.f11213c = y7Var;
    }

    static /* synthetic */ boolean c(s8 s8Var, boolean z) {
        s8Var.a = false;
        return false;
    }

    @Override // com.google.android.gms.common.internal.b.a
    public final void R(int i2) {
        com.google.android.gms.common.internal.p.e("MeasurementServiceConnection.onConnectionSuspended");
        this.f11213c.zzq().H().a("Service connection suspended");
        this.f11213c.zzp().u(new w8(this));
    }

    @Override // com.google.android.gms.common.internal.b.InterfaceC0113b
    public final void U(com.google.android.gms.common.b bVar) {
        com.google.android.gms.common.internal.p.e("MeasurementServiceConnection.onConnectionFailed");
        v3 v3VarW = this.f11213c.a.w();
        if (v3VarW != null) {
            v3VarW.D().b("Service connection failed", bVar);
        }
        synchronized (this) {
            this.a = false;
            this.f11212b = null;
        }
        this.f11213c.zzp().u(new v8(this));
    }

    @Override // com.google.android.gms.common.internal.b.a
    public final void Y(Bundle bundle) {
        com.google.android.gms.common.internal.p.e("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.f11213c.zzp().u(new t8(this, this.f11212b.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f11212b = null;
                this.a = false;
            }
        }
    }

    public final void a() {
        if (this.f11212b != null && (this.f11212b.isConnected() || this.f11212b.isConnecting())) {
            this.f11212b.disconnect();
        }
        this.f11212b = null;
    }

    public final void b(Intent intent) {
        this.f11213c.d();
        Context contextZzm = this.f11213c.zzm();
        com.google.android.gms.common.o.a aVarB = com.google.android.gms.common.o.a.b();
        synchronized (this) {
            if (this.a) {
                this.f11213c.zzq().I().a("Connection attempt already in progress");
                return;
            }
            this.f11213c.zzq().I().a("Using local app measurement service");
            this.a = true;
            aVarB.a(contextZzm, intent, this.f11213c.f11351c, 129);
        }
    }

    public final void d() {
        this.f11213c.d();
        Context contextZzm = this.f11213c.zzm();
        synchronized (this) {
            if (this.a) {
                this.f11213c.zzq().I().a("Connection attempt already in progress");
                return;
            }
            if (this.f11212b != null && (this.f11212b.isConnecting() || this.f11212b.isConnected())) {
                this.f11213c.zzq().I().a("Already awaiting connection attempt");
                return;
            }
            this.f11212b = new w3(contextZzm, Looper.getMainLooper(), this, this);
            this.f11213c.zzq().I().a("Connecting to remote service");
            this.a = true;
            this.f11212b.checkAvailabilityAndConnect();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.common.internal.p.e("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.a = false;
                this.f11213c.zzq().A().a("Service connected with null binder");
                return;
            }
            n3 p3Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    p3Var = iInterfaceQueryLocalInterface instanceof n3 ? (n3) iInterfaceQueryLocalInterface : new p3(iBinder);
                    this.f11213c.zzq().I().a("Bound to IMeasurementService interface");
                } else {
                    this.f11213c.zzq().A().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f11213c.zzq().A().a("Service connect failed to get IMeasurementService");
            }
            if (p3Var == null) {
                this.a = false;
                try {
                    com.google.android.gms.common.o.a.b().c(this.f11213c.zzm(), this.f11213c.f11351c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f11213c.zzp().u(new r8(this, p3Var));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.common.internal.p.e("MeasurementServiceConnection.onServiceDisconnected");
        this.f11213c.zzq().H().a("Service disconnected");
        this.f11213c.zzp().u(new u8(this, componentName));
    }
}