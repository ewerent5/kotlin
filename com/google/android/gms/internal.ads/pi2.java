package com.google.android.gms.internal.ads;

import okhttp3.internal.http2.Settings;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class pi2 {
    private final Object a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8171b;

    pi2(Object obj, int i2) {
        this.a = obj;
        this.f8171b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pi2)) {
            return false;
        }
        pi2 pi2Var = (pi2) obj;
        return this.a == pi2Var.a && this.f8171b == pi2Var.f8171b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f8171b;
    }
}