package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
final class x0 implements ServiceConnection, a1 {
    private final Map<ServiceConnection, ServiceConnection> a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private int f4746b = 2;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4747c;

    /* renamed from: d, reason: collision with root package name */
    private IBinder f4748d;

    /* renamed from: e, reason: collision with root package name */
    private final v0 f4749e;

    /* renamed from: f, reason: collision with root package name */
    private ComponentName f4750f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ z0 f4751g;

    public x0(z0 z0Var, v0 v0Var) {
        this.f4751g = z0Var;
        this.f4749e = v0Var;
    }

    public final void a(String str) {
        this.f4746b = 3;
        boolean zD = this.f4751g.f4756g.d(this.f4751g.f4754e, str, this.f4749e.d(this.f4751g.f4754e), this, this.f4749e.c());
        this.f4747c = zD;
        if (zD) {
            this.f4751g.f4755f.sendMessageDelayed(this.f4751g.f4755f.obtainMessage(1, this.f4749e), this.f4751g.f4758i);
        } else {
            this.f4746b = 2;
            try {
                this.f4751g.f4756g.c(this.f4751g.f4754e, this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public final void b(String str) {
        this.f4751g.f4755f.removeMessages(1, this.f4749e);
        this.f4751g.f4756g.c(this.f4751g.f4754e, this);
        this.f4747c = false;
        this.f4746b = 2;
    }

    public final void c(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.a.put(serviceConnection, serviceConnection2);
    }

    public final void d(ServiceConnection serviceConnection, String str) {
        this.a.remove(serviceConnection);
    }

    public final boolean e() {
        return this.f4747c;
    }

    public final int f() {
        return this.f4746b;
    }

    public final boolean g(ServiceConnection serviceConnection) {
        return this.a.containsKey(serviceConnection);
    }

    public final boolean h() {
        return this.a.isEmpty();
    }

    public final IBinder i() {
        return this.f4748d;
    }

    public final ComponentName j() {
        return this.f4750f;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f4751g.f4753d) {
            this.f4751g.f4755f.removeMessages(1, this.f4749e);
            this.f4748d = iBinder;
            this.f4750f = componentName;
            Iterator<ServiceConnection> it = this.a.values().iterator();
            while (it.hasNext()) {
                it.next().onServiceConnected(componentName, iBinder);
            }
            this.f4746b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f4751g.f4753d) {
            this.f4751g.f4755f.removeMessages(1, this.f4749e);
            this.f4748d = null;
            this.f4750f = componentName;
            Iterator<ServiceConnection> it = this.a.values().iterator();
            while (it.hasNext()) {
                it.next().onServiceDisconnected(componentName);
            }
            this.f4746b = 2;
        }
    }
}