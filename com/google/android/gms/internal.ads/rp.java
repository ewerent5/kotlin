package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class rp implements qg0 {
    private final ByteBuffer a;

    public rp(ByteBuffer byteBuffer) {
        this.a = byteBuffer.slice();
    }

    @Override // com.google.android.gms.internal.ads.qg0
    public final void a(MessageDigest[] messageDigestArr, long j2, int i2) {
        ByteBuffer byteBufferSlice;
        synchronized (this.a) {
            int i3 = (int) j2;
            this.a.position(i3);
            this.a.limit(i3 + i2);
            byteBufferSlice = this.a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }

    @Override // com.google.android.gms.internal.ads.qg0
    public final long zza() {
        return this.a.capacity();
    }
}