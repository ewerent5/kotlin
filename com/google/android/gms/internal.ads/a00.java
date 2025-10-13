package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class a00 extends ThreadLocal<ByteBuffer> {
    a00(b10 b10Var) {
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ ByteBuffer initialValue() {
        return ByteBuffer.allocate(32);
    }
}