package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import okhttp3.internal.http2.Settings;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class et2 {
    static Pair<ByteBuffer, Long> a(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair<ByteBuffer, Long> pairE = e(randomAccessFile, 0);
        return pairE != null ? pairE : e(randomAccessFile, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
    }

    public static long b(ByteBuffer byteBuffer) {
        f(byteBuffer);
        return g(byteBuffer, byteBuffer.position() + 16);
    }

    public static void c(ByteBuffer byteBuffer, long j2) {
        f(byteBuffer);
        int iPosition = byteBuffer.position() + 16;
        if (j2 >= 0 && j2 <= 4294967295L) {
            byteBuffer.putInt(byteBuffer.position() + iPosition, (int) j2);
            return;
        }
        StringBuilder sb = new StringBuilder(47);
        sb.append("uint32 value of out range: ");
        sb.append(j2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static long d(ByteBuffer byteBuffer) {
        f(byteBuffer);
        return g(byteBuffer, byteBuffer.position() + 12);
    }

    private static Pair<ByteBuffer, Long> e(RandomAccessFile randomAccessFile, int i2) throws IOException {
        int i3;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i2, (-22) + length)) + 22);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - byteBufferAllocate.capacity();
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        f(byteBufferAllocate);
        int iCapacity = byteBufferAllocate.capacity();
        if (iCapacity < 22) {
            i3 = -1;
        } else {
            int i4 = iCapacity - 22;
            int iMin = Math.min(i4, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            for (int i5 = 0; i5 < iMin; i5++) {
                i3 = i4 - i5;
                if (byteBufferAllocate.getInt(i3) == 101010256 && ((char) byteBufferAllocate.getShort(i3 + 20)) == i5) {
                    break;
                }
            }
            i3 = -1;
        }
        if (i3 == -1) {
            return null;
        }
        byteBufferAllocate.position(i3);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + i3));
    }

    private static void f(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    private static long g(ByteBuffer byteBuffer, int i2) {
        return byteBuffer.getInt(i2) & 4294967295L;
    }
}