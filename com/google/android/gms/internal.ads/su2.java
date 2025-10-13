package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class su2 extends nu2 {

    /* renamed from: b, reason: collision with root package name */
    public final qu2 f8994b = new qu2();

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer f8995c;

    /* renamed from: d, reason: collision with root package name */
    public long f8996d;

    public su2(int i2) {
    }

    private final ByteBuffer j(int i2) {
        ByteBuffer byteBuffer = this.f8995c;
        int iCapacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb = new StringBuilder(44);
        sb.append("Buffer too small (");
        sb.append(iCapacity);
        sb.append(" < ");
        sb.append(i2);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.nu2
    public final void a() {
        super.a();
        ByteBuffer byteBuffer = this.f8995c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final void h(int i2) {
        ByteBuffer byteBuffer = this.f8995c;
        if (byteBuffer == null) {
            this.f8995c = j(i2);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = this.f8995c.position();
        int i3 = i2 + iPosition;
        if (iCapacity >= i3) {
            return;
        }
        ByteBuffer byteBufferJ = j(i3);
        if (iPosition > 0) {
            this.f8995c.position(0);
            this.f8995c.limit(iPosition);
            byteBufferJ.put(this.f8995c);
        }
        this.f8995c = byteBufferJ;
    }

    public final boolean i() {
        return g(1073741824);
    }
}