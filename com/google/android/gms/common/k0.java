package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
final class k0 extends l0 {

    /* renamed from: e, reason: collision with root package name */
    private final Callable<String> f4765e;

    /* synthetic */ k0(Callable callable, j0 j0Var) {
        super(false, null, null);
        this.f4765e = callable;
    }

    @Override // com.google.android.gms.common.l0
    final String a() {
        try {
            return this.f4765e.call();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}