package com.parizene.netmonitor.m0.c0;

import ch.qos.logback.core.CoreConstants;
import i.y.d.l;

/* compiled from: Meta.kt */
/* loaded from: classes.dex */
public final class f {
    private final boolean a;

    /* renamed from: b, reason: collision with root package name */
    private final long f13343b;

    /* renamed from: c, reason: collision with root package name */
    private final int f13344c;

    /* renamed from: d, reason: collision with root package name */
    private final int f13345d;

    /* renamed from: e, reason: collision with root package name */
    private final a f13346e;

    public f(boolean z, long j2, int i2, int i3, a aVar) {
        l.d(aVar, "cellInfoType");
        this.a = z;
        this.f13343b = j2;
        this.f13344c = i2;
        this.f13345d = i3;
        this.f13346e = aVar;
    }

    public final a a() {
        return this.f13346e;
    }

    public final int b() {
        return this.f13344c;
    }

    public final int c() {
        return this.f13345d;
    }

    public final long d() {
        return this.f13343b;
    }

    public final boolean e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && this.f13343b == fVar.f13343b && this.f13344c == fVar.f13344c && this.f13345d == fVar.f13345d && this.f13346e == fVar.f13346e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((((((r0 * 31) + e.a(this.f13343b)) * 31) + this.f13344c) * 31) + this.f13345d) * 31) + this.f13346e.hashCode();
    }

    public String toString() {
        return "Meta(isRegistered=" + this.a + ", timestampMillis=" + this.f13343b + ", mcc=" + this.f13344c + ", mnc=" + this.f13345d + ", cellInfoType=" + this.f13346e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}