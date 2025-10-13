package com.google.android.gms.internal.ads;

import ch.qos.logback.classic.Level;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public class nu2 {
    private int a;

    public void a() {
        this.a = 0;
    }

    public final boolean b() {
        return g(Level.ALL_INT);
    }

    public final boolean c() {
        return g(4);
    }

    public final boolean d() {
        return g(1);
    }

    public final void e(int i2) {
        this.a = i2;
    }

    public final void f(int i2) {
        this.a |= Level.ALL_INT;
    }

    protected final boolean g(int i2) {
        return (this.a & i2) == i2;
    }
}