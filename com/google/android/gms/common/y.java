package com.google.android.gms.common;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
final class y extends x {

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f4781f;

    y(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f4781f = bArr;
    }

    @Override // com.google.android.gms.common.x
    final byte[] Y() {
        return this.f4781f;
    }
}