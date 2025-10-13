package com.google.android.gms.measurement.internal;

import java.lang.Thread;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class y4 implements Thread.UncaughtExceptionHandler {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ w4 f11348b;

    public y4(w4 w4Var, String str) {
        this.f11348b = w4Var;
        com.google.android.gms.common.internal.p.j(str);
        this.a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f11348b.zzq().A().b(this.a, th);
    }
}