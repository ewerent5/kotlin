package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class eg2 implements b62 {
    private final pg2 a;

    /* renamed from: b, reason: collision with root package name */
    private final r62 f5635b;

    public eg2(pg2 pg2Var, r62 r62Var, int i2) {
        this.a = pg2Var;
        this.f5635b = r62Var;
    }

    @Override // com.google.android.gms.internal.ads.b62
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArrC = this.a.c(bArr);
        return rf2.a(bArrC, this.f5635b.c(rf2.a(bArr2, bArrC, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }
}