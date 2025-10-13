package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.b;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class tx1 implements b.a, b.InterfaceC0113b {
    protected final zy1 a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9289b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9290c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedBlockingQueue<u91> f9291d;

    /* renamed from: e, reason: collision with root package name */
    private final HandlerThread f9292e;

    public tx1(Context context, String str, String str2) {
        this.f9289b = str;
        this.f9290c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f9292e = handlerThread;
        handlerThread.start();
        zy1 zy1Var = new zy1(context, handlerThread.getLooper(), this, this, 9200000);
        this.a = zy1Var;
        this.f9291d = new LinkedBlockingQueue<>();
        zy1Var.checkAvailabilityAndConnect();
    }

    static u91 c() {
        eu0 eu0VarZ0 = u91.z0();
        eu0VarZ0.e0(32768L);
        return eu0VarZ0.n();
    }

    @Override // com.google.android.gms.common.internal.b.a
    public final void R(int i2) throws InterruptedException {
        try {
            this.f9291d.put(c());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.b.InterfaceC0113b
    public final void U(com.google.android.gms.common.b bVar) throws InterruptedException {
        try {
            this.f9291d.put(c());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.b.a
    public final void Y(Bundle bundle) {
        ez1 ez1VarD = d();
        if (ez1VarD != null) {
            try {
                try {
                    this.f9291d.put(ez1VarD.R(new az1(this.f9289b, this.f9290c)).c());
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    b();
                    this.f9292e.quit();
                    throw th;
                }
            } catch (Throwable unused2) {
                this.f9291d.put(c());
            }
            b();
            this.f9292e.quit();
        }
    }

    public final u91 a(int i2) throws InterruptedException {
        u91 u91VarPoll;
        try {
            u91VarPoll = this.f9291d.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            u91VarPoll = null;
        }
        return u91VarPoll == null ? c() : u91VarPoll;
    }

    public final void b() {
        zy1 zy1Var = this.a;
        if (zy1Var != null) {
            if (zy1Var.isConnected() || this.a.isConnecting()) {
                this.a.disconnect();
            }
        }
    }

    protected final ez1 d() {
        try {
            return this.a.c();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}