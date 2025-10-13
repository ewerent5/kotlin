package com.bumptech.glide.load.p.d;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* compiled from: DefaultImageHeaderParser.java */
/* loaded from: classes.dex */
public final class k implements ImageHeaderParser {
    static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f3969b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* compiled from: DefaultImageHeaderParser.java */
    private static final class a implements c {
        private final ByteBuffer a;

        a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.p.d.k.c
        public long h(long j2) {
            int iMin = (int) Math.min(this.a.remaining(), j2);
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }

        @Override // com.bumptech.glide.load.p.d.k.c
        public int i() {
            return (k() << 8) | k();
        }

        @Override // com.bumptech.glide.load.p.d.k.c
        public int j(byte[] bArr, int i2) {
            int iMin = Math.min(i2, this.a.remaining());
            if (iMin == 0) {
                return -1;
            }
            this.a.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // com.bumptech.glide.load.p.d.k.c
        public short k() throws c.a {
            if (this.a.remaining() >= 1) {
                return (short) (this.a.get() & 255);
            }
            throw new c.a();
        }
    }

    /* compiled from: DefaultImageHeaderParser.java */
    private static final class b {
        private final ByteBuffer a;

        b(byte[] bArr, int i2) {
            this.a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i2);
        }

        private boolean c(int i2, int i3) {
            return this.a.remaining() - i2 >= i3;
        }

        short a(int i2) {
            if (c(i2, 2)) {
                return this.a.getShort(i2);
            }
            return (short) -1;
        }

        int b(int i2) {
            if (c(i2, 4)) {
                return this.a.getInt(i2);
            }
            return -1;
        }

        int d() {
            return this.a.remaining();
        }

        void e(ByteOrder byteOrder) {
            this.a.order(byteOrder);
        }
    }

    /* compiled from: DefaultImageHeaderParser.java */
    private interface c {

        /* compiled from: DefaultImageHeaderParser.java */
        public static final class a extends IOException {
            a() {
                super("Unexpectedly reached end of a file");
            }
        }

        long h(long j2);

        int i();

        int j(byte[] bArr, int i2);

        short k();
    }

    /* compiled from: DefaultImageHeaderParser.java */
    private static final class d implements c {
        private final InputStream a;

        d(InputStream inputStream) {
            this.a = inputStream;
        }

        @Override // com.bumptech.glide.load.p.d.k.c
        public long h(long j2) throws IOException {
            if (j2 < 0) {
                return 0L;
            }
            long j3 = j2;
            while (j3 > 0) {
                long jSkip = this.a.skip(j3);
                if (jSkip <= 0) {
                    if (this.a.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j3 -= jSkip;
            }
            return j2 - j3;
        }

        @Override // com.bumptech.glide.load.p.d.k.c
        public int i() {
            return (k() << 8) | k();
        }

        @Override // com.bumptech.glide.load.p.d.k.c
        public int j(byte[] bArr, int i2) throws c.a {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2 && (i4 = this.a.read(bArr, i3, i2 - i3)) != -1) {
                i3 += i4;
            }
            if (i3 == 0 && i4 == -1) {
                throw new c.a();
            }
            return i3;
        }

        @Override // com.bumptech.glide.load.p.d.k.c
        public short k() throws IOException {
            int i2 = this.a.read();
            if (i2 != -1) {
                return (short) i2;
            }
            throw new c.a();
        }
    }

    private static int d(int i2, int i3) {
        return i2 + 2 + (i3 * 12);
    }

    private int e(c cVar, com.bumptech.glide.load.n.a0.b bVar) {
        try {
            int i2 = cVar.i();
            if (!g(i2)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + i2);
                }
                return -1;
            }
            int i3 = i(cVar);
            if (i3 == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) bVar.e(i3, byte[].class);
            try {
                return k(cVar, bArr, i3);
            } finally {
                bVar.d(bArr);
            }
        } catch (c.a unused) {
            return -1;
        }
    }

    private ImageHeaderParser.ImageType f(c cVar) {
        try {
            int i2 = cVar.i();
            if (i2 == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iK = (i2 << 8) | cVar.k();
            if (iK == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iK2 = (iK << 8) | cVar.k();
            if (iK2 == -1991225785) {
                cVar.h(21L);
                try {
                    return cVar.k() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (c.a unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iK2 != 1380533830) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            cVar.h(4L);
            if (((cVar.i() << 16) | cVar.i()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i3 = (cVar.i() << 16) | cVar.i();
            if ((i3 & (-256)) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i4 = i3 & 255;
            if (i4 == 88) {
                cVar.h(4L);
                return (cVar.k() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (i4 != 76) {
                return ImageHeaderParser.ImageType.WEBP;
            }
            cVar.h(4L);
            return (cVar.k() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        } catch (c.a unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    private static boolean g(int i2) {
        return (i2 & 65496) == 65496 || i2 == 19789 || i2 == 18761;
    }

    private boolean h(byte[] bArr, int i2) {
        boolean z = bArr != null && i2 > a.length;
        if (z) {
            int i3 = 0;
            while (true) {
                byte[] bArr2 = a;
                if (i3 >= bArr2.length) {
                    break;
                }
                if (bArr[i3] != bArr2[i3]) {
                    return false;
                }
                i3++;
            }
        }
        return z;
    }

    private int i(c cVar) {
        short sK;
        int i2;
        long j2;
        long jH;
        do {
            short sK2 = cVar.k();
            if (sK2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) sK2));
                }
                return -1;
            }
            sK = cVar.k();
            if (sK == 218) {
                return -1;
            }
            if (sK == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            i2 = cVar.i() - 2;
            if (sK == 225) {
                return i2;
            }
            j2 = i2;
            jH = cVar.h(j2);
        } while (jH == j2);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) sK) + ", wanted to skip: " + i2 + ", but actually skipped: " + jH);
        }
        return -1;
    }

    private static int j(b bVar) {
        ByteOrder byteOrder;
        short sA = bVar.a(6);
        if (sA != 18761) {
            if (sA != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) sA));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        bVar.e(byteOrder);
        int iB = bVar.b(10) + 6;
        short sA2 = bVar.a(iB);
        for (int i2 = 0; i2 < sA2; i2++) {
            int iD = d(iB, i2);
            short sA3 = bVar.a(iD);
            if (sA3 == 274) {
                short sA4 = bVar.a(iD + 2);
                if (sA4 >= 1 && sA4 <= 12) {
                    int iB2 = bVar.b(iD + 4);
                    if (iB2 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got tagIndex=" + i2 + " tagType=" + ((int) sA3) + " formatCode=" + ((int) sA4) + " componentCount=" + iB2);
                        }
                        int i3 = iB2 + f3969b[sA4];
                        if (i3 <= 4) {
                            int i4 = iD + 8;
                            if (i4 >= 0 && i4 <= bVar.d()) {
                                if (i3 >= 0 && i3 + i4 <= bVar.d()) {
                                    return bVar.a(i4);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) sA3));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i4 + " tagType=" + ((int) sA3));
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) sA4));
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Negative tiff component count");
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) sA4));
                }
            }
        }
        return -1;
    }

    private int k(c cVar, byte[] bArr, int i2) {
        int iJ = cVar.j(bArr, i2);
        if (iJ == i2) {
            if (h(bArr, i2)) {
                return j(new b(bArr, i2));
            }
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i2 + ", actually read: " + iJ);
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        return f(new a((ByteBuffer) com.bumptech.glide.t.j.d(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType b(InputStream inputStream) {
        return f(new d((InputStream) com.bumptech.glide.t.j.d(inputStream)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int c(InputStream inputStream, com.bumptech.glide.load.n.a0.b bVar) {
        return e(new d((InputStream) com.bumptech.glide.t.j.d(inputStream)), (com.bumptech.glide.load.n.a0.b) com.bumptech.glide.t.j.d(bVar));
    }
}