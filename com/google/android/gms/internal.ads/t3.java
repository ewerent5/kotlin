package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class t3 implements x5 {
    final /* synthetic */ u3 a;

    t3(u3 u3Var) {
        this.a = u3Var;
    }

    @Override // com.google.android.gms.internal.ads.x5
    public final String a(String str, String str2) {
        return this.a.f9366i.getString(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.x5
    public final Long b(String str, long j2) {
        try {
            return Long.valueOf(this.a.f9366i.getLong(str, j2));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.a.f9366i.getInt(str, (int) j2));
        }
    }

    @Override // com.google.android.gms.internal.ads.x5
    public final Double c(String str, double d2) {
        return Double.valueOf(this.a.f9366i.getFloat(str, (float) d2));
    }

    @Override // com.google.android.gms.internal.ads.x5
    public final Boolean d(String str, boolean z) {
        return Boolean.valueOf(this.a.f9366i.getBoolean(str, z));
    }
}