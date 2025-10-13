package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class h32 {
    static final h32 a;

    /* renamed from: b, reason: collision with root package name */
    static final h32 f6282b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f6283c;

    /* renamed from: d, reason: collision with root package name */
    @NullableDecl
    final Throwable f6284d;

    static {
        if (f32.f5788e) {
            f6282b = null;
            a = null;
        } else {
            f6282b = new h32(false, null);
            a = new h32(true, null);
        }
    }

    h32(boolean z, @NullableDecl Throwable th) {
        this.f6283c = z;
        this.f6284d = th;
    }
}