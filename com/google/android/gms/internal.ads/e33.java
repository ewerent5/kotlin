package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class e33 {
    final long a;

    /* renamed from: b, reason: collision with root package name */
    final String f5572b;

    /* renamed from: c, reason: collision with root package name */
    final int f5573c;

    e33(long j2, String str, int i2) {
        this.a = j2;
        this.f5572b = str;
        this.f5573c = i2;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof e33)) {
            e33 e33Var = (e33) obj;
            if (e33Var.a == this.a && e33Var.f5573c == this.f5573c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.a;
    }
}