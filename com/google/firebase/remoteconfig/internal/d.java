package com.google.firebase.remoteconfig.internal;

import java.util.concurrent.Executor;

/* compiled from: ConfigCacheClient.java */
/* loaded from: classes.dex */
final /* synthetic */ class d implements Executor {

    /* renamed from: e, reason: collision with root package name */
    private static final d f12923e = new d();

    private d() {
    }

    public static Executor a() {
        return f12923e;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}