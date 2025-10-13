package com.google.android.gms.common.util;

import androidx.annotation.RecentlyNonNull;
import j$.util.Spliterator;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
@Deprecated
/* loaded from: classes.dex */
public final class l {
    public static void a(@Nullable Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @Deprecated
    public static long b(@RecentlyNonNull InputStream inputStream, @RecentlyNonNull OutputStream outputStream) {
        return c(inputStream, outputStream, false, Spliterator.IMMUTABLE);
    }

    @Deprecated
    public static long c(@RecentlyNonNull InputStream inputStream, @RecentlyNonNull OutputStream outputStream, boolean z, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        long j2 = 0;
        while (true) {
            try {
                int i3 = inputStream.read(bArr, 0, i2);
                if (i3 == -1) {
                    break;
                }
                j2 += i3;
                outputStream.write(bArr, 0, i3);
            } catch (Throwable th) {
                if (z) {
                    a(inputStream);
                    a(outputStream);
                }
                throw th;
            }
        }
        if (z) {
            a(inputStream);
            a(outputStream);
        }
        return j2;
    }

    @RecentlyNonNull
    @Deprecated
    public static byte[] d(@RecentlyNonNull InputStream inputStream, boolean z) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        c(inputStream, byteArrayOutputStream, z, Spliterator.IMMUTABLE);
        return byteArrayOutputStream.toByteArray();
    }
}