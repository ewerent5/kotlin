package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class bt2 {
    public static final bt2 a = new bt2(1.0f, 1.0f);

    /* renamed from: b, reason: collision with root package name */
    public final float f5187b;

    /* renamed from: c, reason: collision with root package name */
    public final float f5188c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    private final int f5189d;

    public bt2(float f2, float f3) {
        this.f5187b = f2;
        this.f5189d = Math.round(f2 * 1000.0f);
    }

    public final long a(long j2) {
        return j2 * this.f5189d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && bt2.class == obj.getClass() && this.f5187b == ((bt2) obj).f5187b;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f5187b) + 527) * 31) + Float.floatToRawIntBits(1.0f);
    }
}