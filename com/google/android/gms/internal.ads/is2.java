package com.google.android.gms.internal.ads;

import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class is2 {
    public static final int a;

    /* renamed from: b, reason: collision with root package name */
    public static final UUID f6585b;

    /* renamed from: c, reason: collision with root package name */
    public static final UUID f6586c;

    /* renamed from: d, reason: collision with root package name */
    public static final UUID f6587d;

    /* renamed from: e, reason: collision with root package name */
    public static final UUID f6588e;

    static {
        a = v03.a < 23 ? 1020 : 6396;
        f6585b = new UUID(0L, 0L);
        f6586c = new UUID(1186680826959645954L, -5988876978535335093L);
        f6587d = new UUID(-1301668207276963122L, -6645017420763422227L);
        f6588e = new UUID(-7348484286925749626L, -6083546864340672619L);
    }

    public static long a(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j2 / 1000;
    }

    public static long b(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j2 * 1000;
    }
}