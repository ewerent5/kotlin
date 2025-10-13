package j;

import java.nio.channels.WritableByteChannel;

/* compiled from: BufferedSink.kt */
/* loaded from: classes3.dex */
public interface g extends b0, WritableByteChannel {
    g A0(byte[] bArr);

    g B0(i iVar);

    g I(int i2);

    g M0(long j2);

    g O();

    g Y(String str);

    f e();

    @Override // j.b0, java.io.Flushable
    void flush();

    g g0(byte[] bArr, int i2, int i3);

    long m0(d0 d0Var);

    g n0(long j2);

    g t();

    g u(int i2);

    g y(int i2);
}