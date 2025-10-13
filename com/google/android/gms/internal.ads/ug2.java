package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ug2 implements r62 {
    private final w92 a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9454b;

    public ug2(w92 w92Var, int i2) throws InvalidAlgorithmParameterException {
        this.a = w92Var;
        this.f9454b = i2;
        if (i2 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        w92Var.a(new byte[0], i2);
    }

    @Override // com.google.android.gms.internal.ads.r62
    public final byte[] c(byte[] bArr) {
        return this.a.a(bArr, this.f9454b);
    }
}