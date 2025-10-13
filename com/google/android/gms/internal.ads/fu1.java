package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class fu1 implements cu1 {
    private final cu1 a;

    /* renamed from: b, reason: collision with root package name */
    private final Queue<bu1> f5947b = new LinkedBlockingQueue();

    /* renamed from: c, reason: collision with root package name */
    private final int f5948c = ((Integer) c.c().b(w3.L5)).intValue();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f5949d = new AtomicBoolean(false);

    public fu1(cu1 cu1Var, ScheduledExecutorService scheduledExecutorService) {
        this.a = cu1Var;
        long jIntValue = ((Integer) c.c().b(w3.K5)).intValue();
        scheduledExecutorService.scheduleAtFixedRate(new Runnable(this) { // from class: com.google.android.gms.internal.ads.eu1

            /* renamed from: e, reason: collision with root package name */
            private final fu1 f5706e;

            {
                this.f5706e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f5706e.c();
            }
        }, jIntValue, jIntValue, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.cu1
    public final String a(bu1 bu1Var) {
        return this.a.a(bu1Var);
    }

    @Override // com.google.android.gms.internal.ads.cu1
    public final void b(bu1 bu1Var) {
        if (this.f5947b.size() < this.f5948c) {
            this.f5947b.offer(bu1Var);
            return;
        }
        if (this.f5949d.getAndSet(true)) {
            return;
        }
        Queue<bu1> queue = this.f5947b;
        bu1 bu1VarA = bu1.a("dropped_event");
        Map<String, String> mapJ = bu1Var.j();
        if (mapJ.containsKey("action")) {
            bu1VarA.c("dropped_action", mapJ.get("action"));
        }
        queue.offer(bu1VarA);
    }

    final /* bridge */ /* synthetic */ void c() {
        while (!this.f5947b.isEmpty()) {
            this.a.b(this.f5947b.remove());
        }
    }
}