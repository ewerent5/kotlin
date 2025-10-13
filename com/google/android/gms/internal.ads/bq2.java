package com.google.android.gms.internal.ads;

import java.security.cert.X509Certificate;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class bq2 extends cr2 {

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f5170f;

    public bq2(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f5170f = bArr;
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.f5170f;
    }
}