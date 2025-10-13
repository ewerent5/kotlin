package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ax1 {
    private final BlockingQueue<Runnable> a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f5020b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<zw1> f5021c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private zw1 f5022d = null;

    public ax1() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.a = linkedBlockingQueue;
        this.f5020b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void c() {
        zw1 zw1VarPoll = this.f5021c.poll();
        this.f5022d = zw1VarPoll;
        if (zw1VarPoll != null) {
            zw1VarPoll.executeOnExecutor(this.f5020b, new Object[0]);
        }
    }

    public final void a(zw1 zw1Var) {
        zw1Var.b(this);
        this.f5021c.add(zw1Var);
        if (this.f5022d == null) {
            c();
        }
    }

    public final void b(zw1 zw1Var) {
        this.f5022d = null;
        c();
    }
}