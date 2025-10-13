package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class un2 extends sn2 implements f50 {
    private int o;

    protected un2(String str) {
        super("mvhd");
    }

    public final int f() {
        if (!this.f8933h) {
            e();
        }
        return this.o;
    }

    protected final long g(ByteBuffer byteBuffer) {
        this.o = e40.c(byteBuffer.get());
        e40.b(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}