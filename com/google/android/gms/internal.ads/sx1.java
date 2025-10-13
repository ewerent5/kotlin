package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class sx1 extends nx1 {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f9018b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f9019c;

    /* synthetic */ sx1(String str, boolean z, boolean z2, px1 px1Var) {
        this.a = str;
        this.f9018b = z;
        this.f9019c = z2;
    }

    @Override // com.google.android.gms.internal.ads.nx1
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.nx1
    public final boolean b() {
        return this.f9018b;
    }

    @Override // com.google.android.gms.internal.ads.nx1
    public final boolean c() {
        return this.f9019c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nx1) {
            nx1 nx1Var = (nx1) obj;
            if (this.a.equals(nx1Var.a()) && this.f9018b == nx1Var.b() && this.f9019c == nx1Var.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f9018b ? 1237 : 1231)) * 1000003) ^ (true == this.f9019c ? 1231 : 1237);
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.f9018b;
        boolean z2 = this.f9019c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 99);
        sb.append("AdShield2Options{clientVersion=");
        sb.append(str);
        sb.append(", shouldGetAdvertisingId=");
        sb.append(z);
        sb.append(", isGooglePlayServicesAvailable=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}