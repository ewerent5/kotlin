package j;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* compiled from: BufferedSource.kt */
/* loaded from: classes3.dex */
public interface h extends d0, ReadableByteChannel {
    byte[] F();

    boolean H();

    void L0(long j2);

    void M(f fVar, long j2);

    long P();

    long P0();

    String Q(long j2);

    InputStream Q0();

    int R0(t tVar);

    f e();

    boolean e0(long j2, i iVar);

    String f0(Charset charset);

    void h(long j2);

    i o(long j2);

    i o0();

    boolean p0(long j2);

    h peek();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    String u0();

    byte[] w0(long j2);
}