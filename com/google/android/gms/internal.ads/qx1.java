package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class qx1 extends mx1 {
    private String a;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f8527b;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f8528c;

    qx1() {
    }

    @Override // com.google.android.gms.internal.ads.mx1
    public final mx1 a(String str) {
        Objects.requireNonNull(str, "Null clientVersion");
        this.a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.mx1
    public final mx1 b(boolean z) {
        this.f8527b = Boolean.valueOf(z);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.mx1
    public final mx1 c(boolean z) {
        this.f8528c = Boolean.TRUE;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.mx1
    public final nx1 d() {
        String strConcat = this.a == null ? " clientVersion" : "";
        if (this.f8527b == null) {
            strConcat = strConcat.concat(" shouldGetAdvertisingId");
        }
        if (this.f8528c == null) {
            strConcat = String.valueOf(strConcat).concat(" isGooglePlayServicesAvailable");
        }
        if (strConcat.isEmpty()) {
            return new sx1(this.a, this.f8527b.booleanValue(), this.f8528c.booleanValue(), null);
        }
        throw new IllegalStateException(strConcat.length() != 0 ? "Missing required properties:".concat(strConcat) : new String("Missing required properties:"));
    }
}