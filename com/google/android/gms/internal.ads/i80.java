package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class i80 extends un2 {
    private Date p;
    private Date q;
    private long r;
    private long s;
    private double t;
    private float u;
    private fo2 v;
    private long w;

    public i80() {
        super("mvhd");
        this.t = 1.0d;
        this.u = 1.0f;
        this.v = fo2.a;
    }

    @Override // com.google.android.gms.internal.ads.sn2
    public final void d(ByteBuffer byteBuffer) {
        g(byteBuffer);
        if (f() == 1) {
            this.p = zn2.a(e40.d(byteBuffer));
            this.q = zn2.a(e40.d(byteBuffer));
            this.r = e40.a(byteBuffer);
            this.s = e40.d(byteBuffer);
        } else {
            this.p = zn2.a(e40.a(byteBuffer));
            this.q = zn2.a(e40.a(byteBuffer));
            this.r = e40.a(byteBuffer);
            this.s = e40.a(byteBuffer);
        }
        this.t = e40.e(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.u = ((short) ((r0[1] & 255) | ((short) ((r0[0] << 8) & 65280)))) / 256.0f;
        e40.b(byteBuffer);
        e40.a(byteBuffer);
        e40.a(byteBuffer);
        this.v = fo2.a(byteBuffer);
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.w = e40.a(byteBuffer);
    }

    public final long h() {
        return this.r;
    }

    public final long i() {
        return this.s;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.p + ";modificationTime=" + this.q + ";timescale=" + this.r + ";duration=" + this.s + ";rate=" + this.t + ";volume=" + this.u + ";matrix=" + this.v + ";nextTrackId=" + this.w + "]";
    }
}