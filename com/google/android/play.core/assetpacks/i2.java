package com.google.android.play.core.assetpacks;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
final /* synthetic */ class i2 implements ThreadFactory {

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f12043c = 0;

    /* renamed from: b, reason: collision with root package name */
    static final ThreadFactory f12042b = new i2(null);
    static final ThreadFactory a = new i2();

    private i2() {
    }

    private i2(byte[] bArr) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return this.f12043c != 0 ? new Thread(runnable, "AssetPackBackgroundExecutor") : new Thread(runnable, "UpdateListenerExecutor");
    }
}