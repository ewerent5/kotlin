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
final class vx1 implements b.a, b.InterfaceC0113b {
    protected final zy1 a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9806b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9807c;

    /* renamed from: d, reason: collision with root package name */
    private final sr2 f9808d;

    /* renamed from: e, reason: collision with root package name */
    private final LinkedBlockingQueue<lz1> f9809e;

    /* renamed from: f, reason: collision with root package name */
    private final HandlerThread f9810f;

    /* renamed from: g, reason: collision with root package name */
    private final lx1 f9811g;

    /* renamed from: h, reason: collision with root package name */
    private final long f9812h;

    public vx1(Context context, int i2, sr2 sr2Var, String str, String str2, String str3, lx1 lx1Var) {
        this.f9806b = str;
        this.f9808d = sr2Var;
        this.f9807c = str2;
        this.f9811g = lx1Var;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f9810f = handlerThread;
        handlerThread.start();
        this.f9812h = System.currentTimeMillis();
        zy1 zy1Var = new zy1(context, handlerThread.getLooper(), this, this, 19621000);
        this.a = zy1Var;
        this.f9809e = new LinkedBlockingQueue<>();
        zy1Var.checkAvailabilityAndConnect();
    }

    static lz1 c() {
        return new lz1(null, 1);
    }

    private final void e(int i2, long j2, Exception exc) {
        lx1 lx1Var = this.f9811g;
        if (lx1Var != null) {
            lx1Var.d(i2, System.currentTimeMillis() - j2, exc);
        }
    }

    @Override // com.google.android.gms.common.internal.b.a
    public final void R(int i2) throws InterruptedException {
        try {
            e(4011, this.f9812h, null);
            this.f9809e.put(c());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.b.InterfaceC0113b
    public final void U(com.google.android.gms.common.b bVar) throws InterruptedException {
        try {
            e(4012, this.f9812h, null);
            this.f9809e.put(c());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.b.a
    public final void Y(Bundle bundle) {
        ez1 ez1VarD = d();
        if (ez1VarD != null) {
            try {
                lz1 lz1VarY = ez1VarD.Y(new jz1(1, this.f9808d, this.f9806b, this.f9807c));
                e(5011, this.f9812h, null);
                this.f9809e.put(lz1VarY);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public final lz1 a(int i2) throws InterruptedException {
        lz1 lz1VarPoll;
        try {
            lz1VarPoll = this.f9809e.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            e(2009, this.f9812h, e2);
            lz1VarPoll = null;
        }
        e(3004, this.f9812h, null);
        if (lz1VarPoll != null) {
            if (lz1VarPoll.f7375g == 7) {
                lx1.a(rg0.DISABLED);
            } else {
                lx1.a(rg0.ENABLED);
            }
        }
        return lz1VarPoll == null ? c() : lz1VarPoll;
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