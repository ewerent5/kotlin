package com.parizene.netmonitor;

/* compiled from: Threads_Factory.java */
/* loaded from: classes.dex */
public final class g0 implements f.c.c<f0> {

    /* compiled from: Threads_Factory.java */
    private static final class a {
        private static final g0 a = new g0();
    }

    public static g0 a() {
        return a.a;
    }

    public static f0 c() {
        return new f0();
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public f0 get() {
        return c();
    }
}