package com.google.android.gms.measurement.internal;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class a5 extends Thread {

    /* renamed from: e, reason: collision with root package name */
    private final Object f10743e;

    /* renamed from: f, reason: collision with root package name */
    private final BlockingQueue<x4<?>> f10744f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f10745g = false;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ w4 f10746h;

    public a5(w4 w4Var, String str, BlockingQueue<x4<?>> blockingQueue) {
        this.f10746h = w4Var;
        com.google.android.gms.common.internal.p.j(str);
        com.google.android.gms.common.internal.p.j(blockingQueue);
        this.f10743e = new Object();
        this.f10744f = blockingQueue;
        setName(str);
    }

    private final void b(InterruptedException interruptedException) {
        this.f10746h.zzq().D().b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    private final void c() {
        synchronized (this.f10746h.f11310j) {
            if (!this.f10745g) {
                this.f10746h.f11311k.release();
                this.f10746h.f11310j.notifyAll();
                if (this == this.f10746h.f11304d) {
                    w4.p(this.f10746h, null);
                } else if (this == this.f10746h.f11305e) {
                    w4.v(this.f10746h, null);
                } else {
                    this.f10746h.zzq().A().a("Current scheduler thread is neither worker nor network");
                }
                this.f10745g = true;
            }
        }
    }

    public final void a() {
        synchronized (this.f10743e) {
            this.f10743e.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException {
        boolean z = false;
        while (!z) {
            try {
                this.f10746h.f11311k.acquire();
                z = true;
            } catch (InterruptedException e2) {
                b(e2);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                x4<?> x4VarPoll = this.f10744f.poll();
                if (x4VarPoll == null) {
                    synchronized (this.f10743e) {
                        if (this.f10744f.peek() == null && !this.f10746h.f11312l) {
                            try {
                                this.f10743e.wait(30000L);
                            } catch (InterruptedException e3) {
                                b(e3);
                            }
                        }
                    }
                    synchronized (this.f10746h.f11310j) {
                        if (this.f10744f.peek() == null) {
                            break;
                        }
                    }
                } else {
                    Process.setThreadPriority(x4VarPoll.f11331f ? threadPriority : 10);
                    x4VarPoll.run();
                }
            }
            if (this.f10746h.i().o(t.s0)) {
                c();
            }
        } finally {
            c();
        }
    }
}