package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class qu2 {
    public byte[] a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f8475b;

    /* renamed from: c, reason: collision with root package name */
    public int f8476c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f8477d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f8478e;

    /* renamed from: f, reason: collision with root package name */
    public int f8479f;

    /* renamed from: g, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f8480g;

    /* renamed from: h, reason: collision with root package name */
    private final pu2 f8481h;

    public qu2() {
        int i2 = v03.a;
        MediaCodec.CryptoInfo cryptoInfo = i2 >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.f8480g = cryptoInfo;
        this.f8481h = i2 >= 24 ? new pu2(cryptoInfo, null) : null;
    }

    public final void a(int i2, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i3) {
        this.f8479f = i2;
        this.f8477d = iArr;
        this.f8478e = iArr2;
        this.f8475b = bArr;
        this.a = bArr2;
        this.f8476c = 1;
        int i4 = v03.a;
        if (i4 >= 16) {
            MediaCodec.CryptoInfo cryptoInfo = this.f8480g;
            cryptoInfo.numSubSamples = i2;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr;
            cryptoInfo.iv = bArr2;
            cryptoInfo.mode = 1;
            if (i4 >= 24) {
                pu2.a(this.f8481h, 0, 0);
            }
        }
    }

    @TargetApi(16)
    public final MediaCodec.CryptoInfo b() {
        return this.f8480g;
    }
}