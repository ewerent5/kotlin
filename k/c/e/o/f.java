package k.c.e.o;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: StreamUtils.java */
/* loaded from: classes3.dex */
public class f {
    public static void a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static long b(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        long j2 = 0;
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                return j2;
            }
            outputStream.write(bArr, 0, i2);
            j2 += i2;
        }
    }
}