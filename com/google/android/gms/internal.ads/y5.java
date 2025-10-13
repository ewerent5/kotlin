package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class y5 {
    private static final AtomicReference<x5> a = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    static final AtomicBoolean f10378b = new AtomicBoolean();

    static x5 a() {
        return a.get();
    }

    public static void b(x5 x5Var) {
        a.set(x5Var);
    }
}