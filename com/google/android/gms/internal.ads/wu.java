package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class wu {
    private long a;

    public final long a(ByteBuffer byteBuffer) {
        i80 i80Var;
        h70 h70Var;
        long j2 = this.a;
        if (j2 > 0) {
            return j2;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            Iterator<f50> it = new d30(new vu(byteBufferDuplicate), zu.f10639c).d().iterator();
            while (true) {
                i80Var = null;
                if (!it.hasNext()) {
                    h70Var = null;
                    break;
                }
                f50 next = it.next();
                if (next instanceof h70) {
                    h70Var = (h70) next;
                    break;
                }
            }
            Iterator<f50> it2 = h70Var.d().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                f50 next2 = it2.next();
                if (next2 instanceof i80) {
                    i80Var = (i80) next2;
                    break;
                }
            }
            long jI = (i80Var.i() * 1000) / i80Var.h();
            this.a = jI;
            return jI;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}