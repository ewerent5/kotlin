package com.google.android.play.core.assetpacks;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class r2 implements e.c.b.d.a.b.h0<Executor> {
    private final /* synthetic */ int a = 0;

    public r2() {
    }

    public r2(byte[] bArr) {
    }

    public r2(char[] cArr) {
    }

    public r2(short[] sArr) {
    }

    public static Executor b() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(i2.a);
        e.c.b.d.a.b.s.d(executorServiceNewSingleThreadExecutor);
        return executorServiceNewSingleThreadExecutor;
    }

    public static Executor c() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(i2.f12042b);
        e.c.b.d.a.b.s.d(executorServiceNewSingleThreadExecutor);
        return executorServiceNewSingleThreadExecutor;
    }

    public static e0 d() {
        return new e0();
    }

    public static o0 e() {
        return new o0();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.play.core.assetpacks.e0, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.play.core.assetpacks.o0, java.util.concurrent.Executor] */
    @Override // e.c.b.d.a.b.h0
    public final /* bridge */ /* synthetic */ Executor a() {
        int i2 = this.a;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? e() : d() : c() : b();
    }
}