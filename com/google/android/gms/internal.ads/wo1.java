package com.google.android.gms.internal.ads;

import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class wo1 {
    private final com.google.android.gms.common.util.f a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f10012b = new Object();

    /* renamed from: d, reason: collision with root package name */
    @GuardedBy("lock")
    private volatile int f10014d = 1;

    /* renamed from: c, reason: collision with root package name */
    private volatile long f10013c = 0;

    public wo1(com.google.android.gms.common.util.f fVar) {
        this.a = fVar;
    }

    private final void e() {
        long jA = this.a.a();
        synchronized (this.f10012b) {
            if (this.f10014d == 3) {
                if (this.f10013c + ((Long) c.c().b(w3.c4)).longValue() <= jA) {
                    this.f10014d = 1;
                }
            }
        }
    }

    private final void f(int i2, int i3) {
        e();
        long jA = this.a.a();
        synchronized (this.f10012b) {
            if (this.f10014d != i2) {
                return;
            }
            this.f10014d = i3;
            if (this.f10014d == 3) {
                this.f10013c = jA;
            }
        }
    }

    public final void a(boolean z) {
        if (z) {
            f(1, 2);
        } else {
            f(2, 1);
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this.f10012b) {
            e();
            z = this.f10014d == 2;
        }
        return z;
    }

    public final boolean c() {
        boolean z;
        synchronized (this.f10012b) {
            e();
            z = this.f10014d == 3;
        }
        return z;
    }

    public final void d() {
        f(2, 3);
    }
}