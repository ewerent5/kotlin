package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class u43 {
    private final InputStream a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f9378b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f9379c;

    /* renamed from: d, reason: collision with root package name */
    private final long f9380d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f9381e;

    private u43(InputStream inputStream, boolean z, boolean z2, long j2, boolean z3) {
        this.a = inputStream;
        this.f9378b = z;
        this.f9379c = z2;
        this.f9380d = j2;
        this.f9381e = z3;
    }

    public static u43 a(InputStream inputStream, boolean z, boolean z2, long j2, boolean z3) {
        return new u43(inputStream, z, z2, j2, z3);
    }

    public final InputStream b() {
        return this.a;
    }

    public final boolean c() {
        return this.f9378b;
    }

    public final boolean d() {
        return this.f9379c;
    }

    public final long e() {
        return this.f9380d;
    }

    public final boolean f() {
        return this.f9381e;
    }
}