package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class n {
    final String a;

    /* renamed from: b, reason: collision with root package name */
    final String f11041b;

    /* renamed from: c, reason: collision with root package name */
    final long f11042c;

    /* renamed from: d, reason: collision with root package name */
    final long f11043d;

    /* renamed from: e, reason: collision with root package name */
    final long f11044e;

    /* renamed from: f, reason: collision with root package name */
    final long f11045f;

    /* renamed from: g, reason: collision with root package name */
    final long f11046g;

    /* renamed from: h, reason: collision with root package name */
    final Long f11047h;

    /* renamed from: i, reason: collision with root package name */
    final Long f11048i;

    /* renamed from: j, reason: collision with root package name */
    final Long f11049j;

    /* renamed from: k, reason: collision with root package name */
    final Boolean f11050k;

    n(String str, String str2, long j2, long j3, long j4, long j5, long j6, Long l2, Long l3, Long l4, Boolean bool) {
        com.google.android.gms.common.internal.p.f(str);
        com.google.android.gms.common.internal.p.f(str2);
        com.google.android.gms.common.internal.p.a(j2 >= 0);
        com.google.android.gms.common.internal.p.a(j3 >= 0);
        com.google.android.gms.common.internal.p.a(j4 >= 0);
        com.google.android.gms.common.internal.p.a(j6 >= 0);
        this.a = str;
        this.f11041b = str2;
        this.f11042c = j2;
        this.f11043d = j3;
        this.f11044e = j4;
        this.f11045f = j5;
        this.f11046g = j6;
        this.f11047h = l2;
        this.f11048i = l3;
        this.f11049j = l4;
        this.f11050k = bool;
    }

    final n a(long j2) {
        return new n(this.a, this.f11041b, this.f11042c, this.f11043d, this.f11044e, j2, this.f11046g, this.f11047h, this.f11048i, this.f11049j, this.f11050k);
    }

    final n b(long j2, long j3) {
        return new n(this.a, this.f11041b, this.f11042c, this.f11043d, this.f11044e, this.f11045f, j2, Long.valueOf(j3), this.f11048i, this.f11049j, this.f11050k);
    }

    final n c(Long l2, Long l3, Boolean bool) {
        return new n(this.a, this.f11041b, this.f11042c, this.f11043d, this.f11044e, this.f11045f, this.f11046g, this.f11047h, l2, l3, (bool == null || bool.booleanValue()) ? bool : null);
    }

    n(String str, String str2, long j2, long j3, long j4, long j5, Long l2, Long l3, Long l4, Boolean bool) {
        this(str, str2, 0L, 0L, 0L, j4, 0L, null, null, null, null);
    }
}