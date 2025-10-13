package com.bumptech.glide.t;

import java.util.concurrent.Executor;

/* compiled from: Executors.java */
/* loaded from: classes.dex */
public final class e {
    private static final Executor a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final Executor f4244b = new b();

    /* compiled from: Executors.java */
    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            k.t(runnable);
        }
    }

    /* compiled from: Executors.java */
    class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return f4244b;
    }

    public static Executor b() {
        return a;
    }
}