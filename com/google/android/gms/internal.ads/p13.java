package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.view.Surface;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class p13 {
    private final Handler a;

    /* renamed from: b, reason: collision with root package name */
    private final q13 f8063b;

    public p13(Handler handler, q13 q13Var) {
        Objects.requireNonNull(handler);
        this.a = handler;
        this.f8063b = q13Var;
    }

    public final void a(ru2 ru2Var) {
        this.a.post(new h13(this, ru2Var));
    }

    public final void b(String str, long j2, long j3) {
        this.a.post(new i13(this, str, j2, j3));
    }

    public final void c(xs2 xs2Var) {
        this.a.post(new j13(this, xs2Var));
    }

    public final void d(int i2, long j2) {
        this.a.post(new k13(this, i2, j2));
    }

    public final void e(int i2, int i3, int i4, float f2) {
        this.a.post(new l13(this, i2, i3, i4, f2));
    }

    public final void f(Surface surface) {
        this.a.post(new n13(this, surface));
    }

    public final void g(ru2 ru2Var) {
        this.a.post(new o13(this, ru2Var));
    }
}