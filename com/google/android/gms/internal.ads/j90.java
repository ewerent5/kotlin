package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class j90 extends sn2 {
    ByteBuffer o;

    public j90(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.sn2
    public final void d(ByteBuffer byteBuffer) {
        this.o = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}