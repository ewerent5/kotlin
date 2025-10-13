package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class j32 {
    static final j32 a = new j32(null, null);

    /* renamed from: b, reason: collision with root package name */
    final Runnable f6672b;

    /* renamed from: c, reason: collision with root package name */
    final Executor f6673c;

    /* renamed from: d, reason: collision with root package name */
    @NullableDecl
    j32 f6674d;

    j32(Runnable runnable, Executor executor) {
        this.f6672b = runnable;
        this.f6673c = executor;
    }
}