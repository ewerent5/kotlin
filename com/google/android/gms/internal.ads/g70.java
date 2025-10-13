package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class g70 {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f6070b;

    /* renamed from: c, reason: collision with root package name */
    private final g52<z60> f6071c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f6072d = true;

    public g70(Executor executor, ScheduledExecutorService scheduledExecutorService, g52<z60> g52Var) {
        this.a = executor;
        this.f6070b = scheduledExecutorService;
        this.f6071c = g52Var;
    }

    static /* synthetic */ void e(final g70 g70Var, List list, final u42 u42Var) {
        if (list == null || list.isEmpty()) {
            g70Var.a.execute(new Runnable(u42Var) { // from class: com.google.android.gms.internal.ads.a70

                /* renamed from: e, reason: collision with root package name */
                private final u42 f4850e;

                {
                    this.f4850e = u42Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f4850e.zza(new tx0(3));
                }
            });
            return;
        }
        g52 g52VarA = y42.a(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final g52 g52Var = (g52) it.next();
            g52VarA = y42.h(y42.f(g52VarA, Throwable.class, new e42(u42Var) { // from class: com.google.android.gms.internal.ads.b70
                private final u42 a;

                {
                    this.a = u42Var;
                }

                @Override // com.google.android.gms.internal.ads.e42
                public final g52 zza(Object obj) {
                    this.a.zza((Throwable) obj);
                    return y42.a(null);
                }
            }, g70Var.a), new e42(g70Var, u42Var, g52Var) { // from class: com.google.android.gms.internal.ads.c70
                private final g70 a;

                /* renamed from: b, reason: collision with root package name */
                private final u42 f5273b;

                /* renamed from: c, reason: collision with root package name */
                private final g52 f5274c;

                {
                    this.a = g70Var;
                    this.f5273b = u42Var;
                    this.f5274c = g52Var;
                }

                @Override // com.google.android.gms.internal.ads.e42
                public final g52 zza(Object obj) {
                    return this.a.d(this.f5273b, this.f5274c, (s60) obj);
                }
            }, g70Var.a);
        }
        y42.o(g52VarA, new f70(g70Var, u42Var), g70Var.a);
    }

    public final void a(u42<s60> u42Var) {
        y42.o(this.f6071c, new e70(this, u42Var), this.a);
    }

    public final boolean b() {
        return this.f6072d;
    }

    final /* synthetic */ void c() {
        this.f6072d = false;
    }

    final /* synthetic */ g52 d(u42 u42Var, g52 g52Var, s60 s60Var) {
        if (s60Var != null) {
            u42Var.zzb(s60Var);
        }
        return y42.g(g52Var, v5.f9653b.e().longValue(), TimeUnit.MILLISECONDS, this.f6070b);
    }
}