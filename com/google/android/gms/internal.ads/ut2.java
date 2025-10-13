package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ut2 {
    private final Handler a;

    /* renamed from: b, reason: collision with root package name */
    private final vt2 f9556b;

    public ut2(Handler handler, vt2 vt2Var) {
        Objects.requireNonNull(handler);
        this.a = handler;
        this.f9556b = vt2Var;
    }

    public final void a(ru2 ru2Var) {
        this.a.post(new ot2(this, ru2Var));
    }

    public final void b(String str, long j2, long j3) {
        this.a.post(new pt2(this, str, j2, j3));
    }

    public final void c(xs2 xs2Var) {
        this.a.post(new qt2(this, xs2Var));
    }

    public final void d(int i2, long j2, long j3) {
        this.a.post(new rt2(this, i2, j2, j3));
    }

    public final void e(ru2 ru2Var) {
        this.a.post(new st2(this, ru2Var));
    }

    public final void f(int i2) {
        this.a.post(new tt2(this, i2));
    }
}