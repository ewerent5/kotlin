package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class vu implements xn2 {

    /* renamed from: e, reason: collision with root package name */
    private final ByteBuffer f9779e;

    vu(ByteBuffer byteBuffer) {
        this.f9779e = byteBuffer.duplicate();
    }

    @Override // com.google.android.gms.internal.ads.xn2
    public final int J0(ByteBuffer byteBuffer) {
        if (this.f9779e.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), this.f9779e.remaining());
        byte[] bArr = new byte[iMin];
        this.f9779e.get(bArr);
        byteBuffer.put(bArr);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.xn2
    public final void a(long j2) {
        this.f9779e.position((int) j2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.xn2
    public final ByteBuffer f(long j2, long j3) {
        int iPosition = this.f9779e.position();
        this.f9779e.position((int) j2);
        ByteBuffer byteBufferSlice = this.f9779e.slice();
        byteBufferSlice.limit((int) j3);
        this.f9779e.position(iPosition);
        return byteBufferSlice;
    }

    @Override // com.google.android.gms.internal.ads.xn2
    public final long zzb() {
        return this.f9779e.limit();
    }

    @Override // com.google.android.gms.internal.ads.xn2
    public final long zzc() {
        return this.f9779e.position();
    }
}