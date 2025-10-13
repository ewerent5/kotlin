package c.k.a;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import ch.qos.logback.classic.Level;
import ch.qos.logback.core.net.SyslogConstants;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* compiled from: ExifInterface.java */
/* loaded from: classes.dex */
public class a {
    private static SimpleDateFormat A;
    private static final d[] E;
    private static final d[] F;
    private static final d[] G;
    private static final d[] H;
    private static final d[] I;
    private static final d J;
    private static final d[] K;
    private static final d[] L;
    private static final d[] M;
    private static final d[] N;
    static final d[][] O;
    private static final d[] P;
    private static final d Q;
    private static final d R;
    private static final HashMap<Integer, d>[] S;
    private static final HashMap<String, d>[] T;
    private static final HashSet<String> U;
    private static final HashMap<Integer, Integer> V;
    static final Charset W;
    static final byte[] X;
    private static final byte[] Y;
    private static final Pattern Z;
    private static final Pattern a0;
    private String b0;
    private FileDescriptor c0;
    private AssetManager.AssetInputStream d0;
    private int e0;
    private boolean f0;
    private final HashMap<String, c>[] g0;
    private Set<Integer> h0;
    private ByteOrder i0;
    private boolean j0;
    private boolean k0;
    private boolean l0;
    private int m0;
    private int n0;
    private byte[] o0;
    private int p0;
    private int q0;
    private int r0;
    private int s0;
    private int t0;
    private int u0;
    private boolean v0;
    private boolean w0;
    private static final boolean a = Log.isLoggable("ExifInterface", 3);

    /* renamed from: b, reason: collision with root package name */
    private static final List<Integer> f3219b = Arrays.asList(1, 6, 3, 8);

    /* renamed from: c, reason: collision with root package name */
    private static final List<Integer> f3220c = Arrays.asList(2, 7, 4, 5);

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f3221d = {8, 8, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f3222e = {4};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f3223f = {8};

    /* renamed from: g, reason: collision with root package name */
    static final byte[] f3224g = {-1, -40, -1};

    /* renamed from: h, reason: collision with root package name */
    private static final byte[] f3225h = {102, 116, 121, 112};

    /* renamed from: i, reason: collision with root package name */
    private static final byte[] f3226i = {109, 105, 102, 49};

    /* renamed from: j, reason: collision with root package name */
    private static final byte[] f3227j = {104, 101, 105, 99};

    /* renamed from: k, reason: collision with root package name */
    private static final byte[] f3228k = {79, 76, 89, 77, 80, 0};

    /* renamed from: l, reason: collision with root package name */
    private static final byte[] f3229l = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: m, reason: collision with root package name */
    private static final byte[] f3230m = {-119, 80, 78, 71, 13, 10, 26, 10};
    private static final byte[] n = {101, 88, 73, 102};
    private static final byte[] o = {73, 72, 68, 82};
    private static final byte[] p = {73, 69, 78, 68};
    private static final byte[] q = {82, 73, 70, 70};
    private static final byte[] r = {87, 69, 66, 80};
    private static final byte[] s = {69, 88, 73, 70};
    private static final byte[] t = {-99, 1, 42};
    private static final byte[] u = "VP8X".getBytes(Charset.defaultCharset());
    private static final byte[] v = "VP8L".getBytes(Charset.defaultCharset());
    private static final byte[] w = "VP8 ".getBytes(Charset.defaultCharset());
    private static final byte[] x = "ANIM".getBytes(Charset.defaultCharset());
    private static final byte[] y = "ANMF".getBytes(Charset.defaultCharset());
    private static final byte[] z = "XMP ".getBytes(Charset.defaultCharset());
    static final String[] B = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    static final int[] C = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] D = {65, 83, 67, 73, 73, 0, 0, 0};

    /* compiled from: ExifInterface.java */
    /* renamed from: c.k.a.a$a, reason: collision with other inner class name */
    class C0065a extends MediaDataSource {

        /* renamed from: e, reason: collision with root package name */
        long f3231e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ b f3232f;

        C0065a(b bVar) {
            this.f3232f = bVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j2, byte[] bArr, int i2, int i3) {
            if (i3 == 0) {
                return 0;
            }
            if (j2 < 0) {
                return -1;
            }
            try {
                long j3 = this.f3231e;
                if (j3 != j2) {
                    if (j3 >= 0 && j2 >= j3 + this.f3232f.available()) {
                        return -1;
                    }
                    this.f3232f.g(j2);
                    this.f3231e = j2;
                }
                if (i3 > this.f3232f.available()) {
                    i3 = this.f3232f.available();
                }
                int i4 = this.f3232f.read(bArr, i2, i3);
                if (i4 >= 0) {
                    this.f3231e += i4;
                    return i4;
                }
            } catch (IOException unused) {
            }
            this.f3231e = -1L;
            return -1;
        }
    }

    /* compiled from: ExifInterface.java */
    private static class b extends InputStream implements DataInput {

        /* renamed from: e, reason: collision with root package name */
        private static final ByteOrder f3234e = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: f, reason: collision with root package name */
        private static final ByteOrder f3235f = ByteOrder.BIG_ENDIAN;

        /* renamed from: g, reason: collision with root package name */
        private DataInputStream f3236g;

        /* renamed from: h, reason: collision with root package name */
        private ByteOrder f3237h;

        /* renamed from: i, reason: collision with root package name */
        final int f3238i;

        /* renamed from: j, reason: collision with root package name */
        int f3239j;

        public b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f3236g.available();
        }

        public int b() {
            return this.f3238i;
        }

        public int c() {
            return this.f3239j;
        }

        public long d() {
            return readInt() & 4294967295L;
        }

        public void g(long j2) throws IOException {
            int i2 = this.f3239j;
            if (i2 > j2) {
                this.f3239j = 0;
                this.f3236g.reset();
                this.f3236g.mark(this.f3238i);
            } else {
                j2 -= i2;
            }
            int i3 = (int) j2;
            if (skipBytes(i3) != i3) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        public void i(ByteOrder byteOrder) {
            this.f3237h = byteOrder;
        }

        @Override // java.io.InputStream
        public int read() {
            this.f3239j++;
            return this.f3236g.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f3239j++;
            return this.f3236g.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws EOFException {
            int i2 = this.f3239j + 1;
            this.f3239j = i2;
            if (i2 > this.f3238i) {
                throw new EOFException();
            }
            int i3 = this.f3236g.read();
            if (i3 >= 0) {
                return (byte) i3;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f3239j += 2;
            return this.f3236g.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i2, int i3) throws IOException {
            int i4 = this.f3239j + i3;
            this.f3239j = i4;
            if (i4 > this.f3238i) {
                throw new EOFException();
            }
            if (this.f3236g.read(bArr, i2, i3) != i3) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            int i2 = this.f3239j + 4;
            this.f3239j = i2;
            if (i2 > this.f3238i) {
                throw new EOFException();
            }
            int i3 = this.f3236g.read();
            int i4 = this.f3236g.read();
            int i5 = this.f3236g.read();
            int i6 = this.f3236g.read();
            if ((i3 | i4 | i5 | i6) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f3237h;
            if (byteOrder == f3234e) {
                return (i6 << 24) + (i5 << 16) + (i4 << 8) + i3;
            }
            if (byteOrder == f3235f) {
                return (i3 << 24) + (i4 << 16) + (i5 << 8) + i6;
            }
            throw new IOException("Invalid byte order: " + this.f3237h);
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            int i2 = this.f3239j + 8;
            this.f3239j = i2;
            if (i2 > this.f3238i) {
                throw new EOFException();
            }
            int i3 = this.f3236g.read();
            int i4 = this.f3236g.read();
            int i5 = this.f3236g.read();
            int i6 = this.f3236g.read();
            int i7 = this.f3236g.read();
            int i8 = this.f3236g.read();
            int i9 = this.f3236g.read();
            int i10 = this.f3236g.read();
            if ((i3 | i4 | i5 | i6 | i7 | i8 | i9 | i10) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f3237h;
            if (byteOrder == f3234e) {
                return (i10 << 56) + (i9 << 48) + (i8 << 40) + (i7 << 32) + (i6 << 24) + (i5 << 16) + (i4 << 8) + i3;
            }
            if (byteOrder == f3235f) {
                return (i3 << 56) + (i4 << 48) + (i5 << 40) + (i6 << 32) + (i7 << 24) + (i8 << 16) + (i9 << 8) + i10;
            }
            throw new IOException("Invalid byte order: " + this.f3237h);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            int i2 = this.f3239j + 2;
            this.f3239j = i2;
            if (i2 > this.f3238i) {
                throw new EOFException();
            }
            int i3 = this.f3236g.read();
            int i4 = this.f3236g.read();
            if ((i3 | i4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f3237h;
            if (byteOrder == f3234e) {
                return (short) ((i4 << 8) + i3);
            }
            if (byteOrder == f3235f) {
                return (short) ((i3 << 8) + i4);
            }
            throw new IOException("Invalid byte order: " + this.f3237h);
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f3239j += 2;
            return this.f3236g.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f3239j++;
            return this.f3236g.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            int i2 = this.f3239j + 2;
            this.f3239j = i2;
            if (i2 > this.f3238i) {
                throw new EOFException();
            }
            int i3 = this.f3236g.read();
            int i4 = this.f3236g.read();
            if ((i3 | i4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f3237h;
            if (byteOrder == f3234e) {
                return (i4 << 8) + i3;
            }
            if (byteOrder == f3235f) {
                return (i3 << 8) + i4;
            }
            throw new IOException("Invalid byte order: " + this.f3237h);
        }

        @Override // java.io.DataInput
        public int skipBytes(int i2) {
            int iMin = Math.min(i2, this.f3238i - this.f3239j);
            int iSkipBytes = 0;
            while (iSkipBytes < iMin) {
                iSkipBytes += this.f3236g.skipBytes(iMin - iSkipBytes);
            }
            this.f3239j += iSkipBytes;
            return iSkipBytes;
        }

        b(InputStream inputStream, ByteOrder byteOrder) {
            this.f3237h = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f3236g = dataInputStream;
            int iAvailable = dataInputStream.available();
            this.f3238i = iAvailable;
            this.f3239j = 0;
            this.f3236g.mark(iAvailable);
            this.f3237h = byteOrder;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
            int i4 = this.f3236g.read(bArr, i2, i3);
            this.f3239j += i4;
            return i4;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            int length = this.f3239j + bArr.length;
            this.f3239j = length;
            if (length <= this.f3238i) {
                if (this.f3236g.read(bArr, 0, bArr.length) != bArr.length) {
                    throw new IOException("Couldn't read up to the length of buffer");
                }
                return;
            }
            throw new EOFException();
        }

        public b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr));
        }
    }

    /* compiled from: ExifInterface.java */
    private static class c {
        public final int a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3240b;

        /* renamed from: c, reason: collision with root package name */
        public final long f3241c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f3242d;

        c(int i2, int i3, byte[] bArr) {
            this(i2, i3, -1L, bArr);
        }

        public static c a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.W);
            return new c(2, bytes.length, bytes);
        }

        public static c b(long j2, ByteOrder byteOrder) {
            return c(new long[]{j2}, byteOrder);
        }

        public static c c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.C[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j2 : jArr) {
                byteBufferWrap.putInt((int) j2);
            }
            return new c(4, jArr.length, byteBufferWrap.array());
        }

        public static c d(e eVar, ByteOrder byteOrder) {
            return e(new e[]{eVar}, byteOrder);
        }

        public static c e(e[] eVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.C[5] * eVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (e eVar : eVarArr) {
                byteBufferWrap.putInt((int) eVar.a);
                byteBufferWrap.putInt((int) eVar.f3246b);
            }
            return new c(5, eVarArr.length, byteBufferWrap.array());
        }

        public static c f(int i2, ByteOrder byteOrder) {
            return g(new int[]{i2}, byteOrder);
        }

        public static c g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.C[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i2 : iArr) {
                byteBufferWrap.putShort((short) i2);
            }
            return new c(3, iArr.length, byteBufferWrap.array());
        }

        public double h(ByteOrder byteOrder) throws Throwable {
            Object objK = k(byteOrder);
            if (objK == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objK instanceof String) {
                return Double.parseDouble((String) objK);
            }
            if (objK instanceof long[]) {
                if (((long[]) objK).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objK instanceof int[]) {
                if (((int[]) objK).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objK instanceof double[]) {
                double[] dArr = (double[]) objK;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objK instanceof e[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            e[] eVarArr = (e[]) objK;
            if (eVarArr.length == 1) {
                return eVarArr[0].a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int i(ByteOrder byteOrder) throws Throwable {
            Object objK = k(byteOrder);
            if (objK == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objK instanceof String) {
                return Integer.parseInt((String) objK);
            }
            if (objK instanceof long[]) {
                long[] jArr = (long[]) objK;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objK instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objK;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String j(ByteOrder byteOrder) throws Throwable {
            Object objK = k(byteOrder);
            if (objK == null) {
                return null;
            }
            if (objK instanceof String) {
                return (String) objK;
            }
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            if (objK instanceof long[]) {
                long[] jArr = (long[]) objK;
                while (i2 < jArr.length) {
                    sb.append(jArr[i2]);
                    i2++;
                    if (i2 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objK instanceof int[]) {
                int[] iArr = (int[]) objK;
                while (i2 < iArr.length) {
                    sb.append(iArr[i2]);
                    i2++;
                    if (i2 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objK instanceof double[]) {
                double[] dArr = (double[]) objK;
                while (i2 < dArr.length) {
                    sb.append(dArr[i2]);
                    i2++;
                    if (i2 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(objK instanceof e[])) {
                return null;
            }
            e[] eVarArr = (e[]) objK;
            while (i2 < eVarArr.length) {
                sb.append(eVarArr[i2].a);
                sb.append('/');
                sb.append(eVarArr[i2].f3246b);
                i2++;
                if (i2 != eVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x01a0: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:152:0x01a0 */
        /* JADX WARN: Removed duplicated region for block: B:170:0x01a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        java.lang.Object k(java.nio.ByteOrder r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 456
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: c.k.a.a.c.k(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            return "(" + a.B[this.a] + ", data length:" + this.f3242d.length + ")";
        }

        c(int i2, int i3, long j2, byte[] bArr) {
            this.a = i2;
            this.f3240b = i3;
            this.f3241c = j2;
            this.f3242d = bArr;
        }
    }

    /* compiled from: ExifInterface.java */
    private static class e {
        public final long a;

        /* renamed from: b, reason: collision with root package name */
        public final long f3246b;

        e(long j2, long j3) {
            if (j3 == 0) {
                this.a = 0L;
                this.f3246b = 1L;
            } else {
                this.a = j2;
                this.f3246b = j3;
            }
        }

        public double a() {
            return this.a / this.f3246b;
        }

        public String toString() {
            return this.a + "/" + this.f3246b;
        }
    }

    static {
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", SyslogConstants.SYSLOG_PORT, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        E = dVarArr;
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        F = dVarArr2;
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        G = dVarArr3;
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        H = dVarArr4;
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", SyslogConstants.SYSLOG_PORT, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        I = dVarArr5;
        J = new d("StripOffsets", 273, 3);
        d[] dVarArr6 = {new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)};
        K = dVarArr6;
        d[] dVarArr7 = {new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)};
        L = dVarArr7;
        d[] dVarArr8 = {new d("AspectFrame", 4371, 3)};
        M = dVarArr8;
        d[] dVarArr9 = {new d("ColorSpace", 55, 3)};
        N = dVarArr9;
        d[][] dVarArr10 = {dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, dVarArr6, dVarArr7, dVarArr8, dVarArr9};
        O = dVarArr10;
        P = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        Q = new d("JPEGInterchangeFormat", 513, 4);
        R = new d("JPEGInterchangeFormatLength", SyslogConstants.SYSLOG_PORT, 4);
        S = new HashMap[dVarArr10.length];
        T = new HashMap[dVarArr10.length];
        U = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        V = new HashMap<>();
        Charset charsetForName = Charset.forName("US-ASCII");
        W = charsetForName;
        X = "Exif\u0000\u0000".getBytes(charsetForName);
        Y = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        A = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            d[][] dVarArr11 = O;
            if (i2 >= dVarArr11.length) {
                HashMap<Integer, Integer> map = V;
                d[] dVarArr12 = P;
                map.put(Integer.valueOf(dVarArr12[0].a), 5);
                map.put(Integer.valueOf(dVarArr12[1].a), 1);
                map.put(Integer.valueOf(dVarArr12[2].a), 2);
                map.put(Integer.valueOf(dVarArr12[3].a), 3);
                map.put(Integer.valueOf(dVarArr12[4].a), 7);
                map.put(Integer.valueOf(dVarArr12[5].a), 8);
                Z = Pattern.compile(".*[1-9].*");
                a0 = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
            S[i2] = new HashMap<>();
            T[i2] = new HashMap<>();
            for (d dVar : dVarArr11[i2]) {
                S[i2].put(Integer.valueOf(dVar.a), dVar);
                T[i2].put(dVar.f3243b, dVar);
            }
            i2++;
        }
    }

    public a(InputStream inputStream) {
        this(inputStream, false);
    }

    private boolean A(HashMap map) {
        c cVar;
        int i2;
        c cVar2 = (c) map.get("BitsPerSample");
        if (cVar2 != null) {
            int[] iArr = (int[]) cVar2.k(this.i0);
            int[] iArr2 = f3221d;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.e0 == 3 && (cVar = (c) map.get("PhotometricInterpretation")) != null && (((i2 = cVar.i(this.i0)) == 1 && Arrays.equals(iArr, f3223f)) || (i2 == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!a) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    private boolean B(HashMap map) {
        c cVar = (c) map.get("ImageLength");
        c cVar2 = (c) map.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.i(this.i0) <= 512 && cVar2.i(this.i0) <= 512;
    }

    private boolean C(byte[] bArr) {
        int i2 = 0;
        while (true) {
            byte[] bArr2 = q;
            if (i2 >= bArr2.length) {
                int i3 = 0;
                while (true) {
                    byte[] bArr3 = r;
                    if (i3 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[q.length + i3 + 4] != bArr3[i3]) {
                        return false;
                    }
                    i3++;
                }
            } else {
                if (bArr[i2] != bArr2[i2]) {
                    return false;
                }
                i2++;
            }
        }
    }

    private void D(InputStream inputStream) {
        Objects.requireNonNull(inputStream, "inputstream shouldn't be null");
        for (int i2 = 0; i2 < O.length; i2++) {
            try {
                try {
                    this.g0[i2] = new HashMap<>();
                } catch (IOException e2) {
                    this.v0 = false;
                    boolean z2 = a;
                    if (z2) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e2);
                    }
                    a();
                    if (!z2) {
                        return;
                    }
                }
            } finally {
                a();
                if (a) {
                    F();
                }
            }
        }
        if (!this.f0) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, Level.TRACE_INT);
            this.e0 = i(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        b bVar = new b(inputStream);
        if (!this.f0) {
            switch (this.e0) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                case 8:
                case 11:
                    m(bVar);
                    break;
                case 4:
                    h(bVar, 0, 0);
                    break;
                case 7:
                    j(bVar);
                    break;
                case 9:
                    l(bVar);
                    break;
                case 10:
                    n(bVar);
                    break;
                case 12:
                    g(bVar);
                    break;
                case 13:
                    k(bVar);
                    break;
                case 14:
                    p(bVar);
                    break;
            }
        } else {
            o(bVar);
        }
        K(bVar);
        this.v0 = true;
    }

    private void E(b bVar, int i2) throws IOException {
        ByteOrder byteOrderG = G(bVar);
        this.i0 = byteOrderG;
        bVar.i(byteOrderG);
        int unsignedShort = bVar.readUnsignedShort();
        int i3 = this.e0;
        if (i3 != 7 && i3 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i4 = bVar.readInt();
        if (i4 < 8 || i4 >= i2) {
            throw new IOException("Invalid first Ifd offset: " + i4);
        }
        int i5 = i4 - 8;
        if (i5 <= 0 || bVar.skipBytes(i5) == i5) {
            return;
        }
        throw new IOException("Couldn't jump to first Ifd: " + i5);
    }

    private void F() {
        for (int i2 = 0; i2 < this.g0.length; i2++) {
            Log.d("ExifInterface", "The size of tag group[" + i2 + "]: " + this.g0[i2].size());
            for (Map.Entry<String, c> entry : this.g0[i2].entrySet()) {
                c value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.j(this.i0) + "'");
            }
        }
    }

    private ByteOrder G(b bVar) throws IOException {
        short s2 = bVar.readShort();
        if (s2 == 18761) {
            if (a) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s2 == 19789) {
            if (a) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s2));
    }

    private void H(byte[] bArr, int i2) throws IOException {
        b bVar = new b(bArr);
        E(bVar, bArr.length);
        I(bVar, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void I(c.k.a.a.b r31, int r32) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1044
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.k.a.a.I(c.k.a.a$b, int):void");
    }

    private void J(b bVar, int i2) throws IOException {
        c cVar;
        c cVar2 = this.g0[i2].get("ImageLength");
        c cVar3 = this.g0[i2].get("ImageWidth");
        if ((cVar2 == null || cVar3 == null) && (cVar = this.g0[i2].get("JPEGInterchangeFormat")) != null) {
            h(bVar, cVar.i(this.i0), i2);
        }
    }

    private void K(b bVar) throws Throwable {
        HashMap<String, c> map = this.g0[4];
        c cVar = map.get("Compression");
        if (cVar == null) {
            this.p0 = 6;
            q(bVar, map);
            return;
        }
        int i2 = cVar.i(this.i0);
        this.p0 = i2;
        if (i2 != 1) {
            if (i2 == 6) {
                q(bVar, map);
                return;
            } else if (i2 != 7) {
                return;
            }
        }
        if (A(map)) {
            r(bVar, map);
        }
    }

    private static boolean L(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private void M(int i2, int i3) throws Throwable {
        if (this.g0[i2].isEmpty() || this.g0[i3].isEmpty()) {
            if (a) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = this.g0[i2].get("ImageLength");
        c cVar2 = this.g0[i2].get("ImageWidth");
        c cVar3 = this.g0[i3].get("ImageLength");
        c cVar4 = this.g0[i3].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (a) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (cVar3 == null || cVar4 == null) {
            if (a) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int i4 = cVar.i(this.i0);
        int i5 = cVar2.i(this.i0);
        int i6 = cVar3.i(this.i0);
        int i7 = cVar4.i(this.i0);
        if (i4 >= i6 || i5 >= i7) {
            return;
        }
        HashMap<String, c>[] mapArr = this.g0;
        HashMap<String, c> map = mapArr[i2];
        mapArr[i2] = mapArr[i3];
        mapArr[i3] = map;
    }

    private void N(b bVar, int i2) throws Throwable {
        c cVarF;
        c cVarF2;
        c cVar = this.g0[i2].get("DefaultCropSize");
        c cVar2 = this.g0[i2].get("SensorTopBorder");
        c cVar3 = this.g0[i2].get("SensorLeftBorder");
        c cVar4 = this.g0[i2].get("SensorBottomBorder");
        c cVar5 = this.g0[i2].get("SensorRightBorder");
        if (cVar == null) {
            if (cVar2 == null || cVar3 == null || cVar4 == null || cVar5 == null) {
                J(bVar, i2);
                return;
            }
            int i3 = cVar2.i(this.i0);
            int i4 = cVar4.i(this.i0);
            int i5 = cVar5.i(this.i0);
            int i6 = cVar3.i(this.i0);
            if (i4 <= i3 || i5 <= i6) {
                return;
            }
            c cVarF3 = c.f(i4 - i3, this.i0);
            c cVarF4 = c.f(i5 - i6, this.i0);
            this.g0[i2].put("ImageLength", cVarF3);
            this.g0[i2].put("ImageWidth", cVarF4);
            return;
        }
        if (cVar.a == 5) {
            e[] eVarArr = (e[]) cVar.k(this.i0);
            if (eVarArr == null || eVarArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                return;
            }
            cVarF = c.d(eVarArr[0], this.i0);
            cVarF2 = c.d(eVarArr[1], this.i0);
        } else {
            int[] iArr = (int[]) cVar.k(this.i0);
            if (iArr == null || iArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            cVarF = c.f(iArr[0], this.i0);
            cVarF2 = c.f(iArr[1], this.i0);
        }
        this.g0[i2].put("ImageWidth", cVarF);
        this.g0[i2].put("ImageLength", cVarF2);
    }

    private void O() throws Throwable {
        M(0, 5);
        M(0, 4);
        M(5, 4);
        c cVar = this.g0[1].get("PixelXDimension");
        c cVar2 = this.g0[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            this.g0[0].put("ImageWidth", cVar);
            this.g0[0].put("ImageLength", cVar2);
        }
        if (this.g0[4].isEmpty() && B(this.g0[5])) {
            HashMap<String, c>[] mapArr = this.g0;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        if (B(this.g0[4])) {
            return;
        }
        Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
    }

    private void a() {
        String strD = d("DateTimeOriginal");
        if (strD != null && d("DateTime") == null) {
            this.g0[0].put("DateTime", c.a(strD));
        }
        if (d("ImageWidth") == null) {
            this.g0[0].put("ImageWidth", c.b(0L, this.i0));
        }
        if (d("ImageLength") == null) {
            this.g0[0].put("ImageLength", c.b(0L, this.i0));
        }
        if (d("Orientation") == null) {
            this.g0[0].put("Orientation", c.b(0L, this.i0));
        }
        if (d("LightSource") == null) {
            this.g0[1].put("LightSource", c.b(0L, this.i0));
        }
    }

    private static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b2)));
        }
        return sb.toString();
    }

    private static long[] c(Object obj) {
        if (!(obj instanceof int[])) {
            if (obj instanceof long[]) {
                return (long[]) obj;
            }
            return null;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            jArr[i2] = iArr[i2];
        }
        return jArr;
    }

    private c f(String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        if ("ISOSpeedRatings".equals(str)) {
            if (a) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i2 = 0; i2 < O.length; i2++) {
            c cVar = this.g0[i2].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    private void g(b bVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                mediaMetadataRetriever.setDataSource(new C0065a(bVar));
            } else {
                FileDescriptor fileDescriptor = this.c0;
                if (fileDescriptor != null) {
                    mediaMetadataRetriever.setDataSource(fileDescriptor);
                } else {
                    String str = this.b0;
                    if (str == null) {
                        return;
                    } else {
                        mediaMetadataRetriever.setDataSource(str);
                    }
                }
            }
            String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(33);
            String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(34);
            String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(26);
            String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(17);
            String strExtractMetadata7 = null;
            if ("yes".equals(strExtractMetadata5)) {
                strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(29);
                strExtractMetadata = mediaMetadataRetriever.extractMetadata(30);
                strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
            } else if ("yes".equals(strExtractMetadata6)) {
                strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(18);
                strExtractMetadata = mediaMetadataRetriever.extractMetadata(19);
                strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
            } else {
                strExtractMetadata = null;
                strExtractMetadata2 = null;
            }
            if (strExtractMetadata7 != null) {
                this.g0[0].put("ImageWidth", c.f(Integer.parseInt(strExtractMetadata7), this.i0));
            }
            if (strExtractMetadata != null) {
                this.g0[0].put("ImageLength", c.f(Integer.parseInt(strExtractMetadata), this.i0));
            }
            if (strExtractMetadata2 != null) {
                int i2 = 1;
                int i3 = Integer.parseInt(strExtractMetadata2);
                if (i3 == 90) {
                    i2 = 6;
                } else if (i3 == 180) {
                    i2 = 3;
                } else if (i3 == 270) {
                    i2 = 8;
                }
                this.g0[0].put("Orientation", c.f(i2, this.i0));
            }
            if (strExtractMetadata3 != null && strExtractMetadata4 != null) {
                int i4 = Integer.parseInt(strExtractMetadata3);
                int i5 = Integer.parseInt(strExtractMetadata4);
                if (i5 <= 6) {
                    throw new IOException("Invalid exif length");
                }
                bVar.g(i4);
                byte[] bArr = new byte[6];
                if (bVar.read(bArr) != 6) {
                    throw new IOException("Can't read identifier");
                }
                int i6 = i4 + 6;
                int i7 = i5 - 6;
                if (!Arrays.equals(bArr, X)) {
                    throw new IOException("Invalid identifier");
                }
                byte[] bArr2 = new byte[i7];
                if (bVar.read(bArr2) != i7) {
                    throw new IOException("Can't read exif");
                }
                this.q0 = i6;
                H(bArr2, 0);
            }
            if (a) {
                Log.d("ExifInterface", "Heif meta: " + strExtractMetadata7 + "x" + strExtractMetadata + ", rotation " + strExtractMetadata2);
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0199, code lost:
    
        r20.i(r19.i0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x019e, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void h(c.k.a.a.b r20, int r21, int r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.k.a.a.h(c.k.a.a$b, int, int):void");
    }

    private int i(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(Level.TRACE_INT);
        byte[] bArr = new byte[Level.TRACE_INT];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (u(bArr)) {
            return 4;
        }
        if (x(bArr)) {
            return 9;
        }
        if (t(bArr)) {
            return 12;
        }
        if (v(bArr)) {
            return 7;
        }
        if (y(bArr)) {
            return 10;
        }
        if (w(bArr)) {
            return 13;
        }
        return C(bArr) ? 14 : 0;
    }

    private void j(b bVar) throws Throwable {
        m(bVar);
        c cVar = this.g0[1].get("MakerNote");
        if (cVar != null) {
            b bVar2 = new b(cVar.f3242d);
            bVar2.i(this.i0);
            byte[] bArr = f3228k;
            byte[] bArr2 = new byte[bArr.length];
            bVar2.readFully(bArr2);
            bVar2.g(0L);
            byte[] bArr3 = f3229l;
            byte[] bArr4 = new byte[bArr3.length];
            bVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                bVar2.g(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                bVar2.g(12L);
            }
            I(bVar2, 6);
            c cVar2 = this.g0[7].get("PreviewImageStart");
            c cVar3 = this.g0[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                this.g0[5].put("JPEGInterchangeFormat", cVar2);
                this.g0[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = this.g0[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.k(this.i0);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                if (iArr[2] <= iArr[0] || iArr[3] <= iArr[1]) {
                    return;
                }
                int i2 = (iArr[2] - iArr[0]) + 1;
                int i3 = (iArr[3] - iArr[1]) + 1;
                if (i2 < i3) {
                    int i4 = i2 + i3;
                    i3 = i4 - i3;
                    i2 = i4 - i3;
                }
                c cVarF = c.f(i2, this.i0);
                c cVarF2 = c.f(i3, this.i0);
                this.g0[0].put("ImageWidth", cVarF);
                this.g0[0].put("ImageLength", cVarF2);
            }
        }
    }

    private void k(b bVar) throws Throwable {
        if (a) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.i(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f3230m;
        bVar.skipBytes(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int i2 = bVar.readInt();
                int i3 = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i4 = i3 + 4;
                if (i4 == 16 && !Arrays.equals(bArr2, o)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, p)) {
                    return;
                }
                if (Arrays.equals(bArr2, n)) {
                    byte[] bArr3 = new byte[i2];
                    if (bVar.read(bArr3) != i2) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr2));
                    }
                    int i5 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i5) {
                        this.q0 = i4;
                        H(bArr3, 0);
                        O();
                        return;
                    } else {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i5 + ", calculated CRC value: " + crc32.getValue());
                    }
                }
                int i6 = i2 + 4;
                bVar.skipBytes(i6);
                length = i4 + i6;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private void l(b bVar) throws IOException {
        bVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        bVar.read(bArr);
        bVar.skipBytes(4);
        bVar.read(bArr2);
        int i2 = ByteBuffer.wrap(bArr).getInt();
        int i3 = ByteBuffer.wrap(bArr2).getInt();
        h(bVar, i2, 5);
        bVar.g(i3);
        bVar.i(ByteOrder.BIG_ENDIAN);
        int i4 = bVar.readInt();
        if (a) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == J.a) {
                short s2 = bVar.readShort();
                short s3 = bVar.readShort();
                c cVarF = c.f(s2, this.i0);
                c cVarF2 = c.f(s3, this.i0);
                this.g0[0].put("ImageLength", cVarF);
                this.g0[0].put("ImageWidth", cVarF2);
                if (a) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s2) + ", width: " + ((int) s3));
                    return;
                }
                return;
            }
            bVar.skipBytes(unsignedShort2);
        }
    }

    private void m(b bVar) throws Throwable {
        c cVar;
        E(bVar, bVar.available());
        I(bVar, 0);
        N(bVar, 0);
        N(bVar, 5);
        N(bVar, 4);
        O();
        if (this.e0 != 8 || (cVar = this.g0[1].get("MakerNote")) == null) {
            return;
        }
        b bVar2 = new b(cVar.f3242d);
        bVar2.i(this.i0);
        bVar2.g(6L);
        I(bVar2, 9);
        c cVar2 = this.g0[9].get("ColorSpace");
        if (cVar2 != null) {
            this.g0[1].put("ColorSpace", cVar2);
        }
    }

    private void n(b bVar) throws Throwable {
        m(bVar);
        if (this.g0[0].get("JpgFromRaw") != null) {
            h(bVar, this.u0, 5);
        }
        c cVar = this.g0[0].get("ISO");
        c cVar2 = this.g0[1].get("PhotographicSensitivity");
        if (cVar == null || cVar2 != null) {
            return;
        }
        this.g0[1].put("PhotographicSensitivity", cVar);
    }

    private void o(b bVar) throws IOException {
        byte[] bArr = X;
        bVar.skipBytes(bArr.length);
        byte[] bArr2 = new byte[bVar.available()];
        bVar.readFully(bArr2);
        this.q0 = bArr.length;
        H(bArr2, 0);
    }

    private void p(b bVar) throws IOException {
        if (a) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.i(ByteOrder.LITTLE_ENDIAN);
        bVar.skipBytes(q.length);
        int i2 = bVar.readInt() + 8;
        int iSkipBytes = bVar.skipBytes(r.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (bVar.read(bArr) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i3 = bVar.readInt();
                int i4 = iSkipBytes + 4 + 4;
                if (Arrays.equals(s, bArr)) {
                    byte[] bArr2 = new byte[i3];
                    if (bVar.read(bArr2) == i3) {
                        this.q0 = i4;
                        H(bArr2, 0);
                        this.q0 = i4;
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr));
                    }
                }
                if (i3 % 2 == 1) {
                    i3++;
                }
                int i5 = i4 + i3;
                if (i5 == i2) {
                    return;
                }
                if (i5 > i2) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                int iSkipBytes2 = bVar.skipBytes(i3);
                if (iSkipBytes2 != i3) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                iSkipBytes = i4 + iSkipBytes2;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private void q(b bVar, HashMap map) throws Throwable {
        c cVar = (c) map.get("JPEGInterchangeFormat");
        c cVar2 = (c) map.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int i2 = cVar.i(this.i0);
        int i3 = cVar2.i(this.i0);
        if (this.e0 == 7) {
            i2 += this.r0;
        }
        int iMin = Math.min(i3, bVar.b() - i2);
        if (i2 > 0 && iMin > 0) {
            this.j0 = true;
            int i4 = this.q0 + i2;
            this.m0 = i4;
            this.n0 = iMin;
            if (this.b0 == null && this.d0 == null && this.c0 == null) {
                byte[] bArr = new byte[iMin];
                bVar.g(i4);
                bVar.readFully(bArr);
                this.o0 = bArr;
            }
        }
        if (a) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + i2 + ", length: " + iMin);
        }
    }

    private void r(b bVar, HashMap map) throws IOException {
        c cVar = (c) map.get("StripOffsets");
        c cVar2 = (c) map.get("StripByteCounts");
        if (cVar == null || cVar2 == null) {
            return;
        }
        long[] jArrC = c(cVar.k(this.i0));
        long[] jArrC2 = c(cVar2.k(this.i0));
        if (jArrC == null || jArrC.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrC2 == null || jArrC2.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (jArrC.length != jArrC2.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j2 = 0;
        for (long j3 : jArrC2) {
            j2 += j3;
        }
        int i2 = (int) j2;
        byte[] bArr = new byte[i2];
        this.l0 = true;
        this.k0 = true;
        this.j0 = true;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < jArrC.length; i5++) {
            int i6 = (int) jArrC[i5];
            int i7 = (int) jArrC2[i5];
            if (i5 < jArrC.length - 1 && i6 + i7 != jArrC[i5 + 1]) {
                this.l0 = false;
            }
            int i8 = i6 - i3;
            if (i8 < 0) {
                Log.d("ExifInterface", "Invalid strip offset value");
            }
            bVar.g(i8);
            int i9 = i3 + i8;
            byte[] bArr2 = new byte[i7];
            bVar.read(bArr2);
            i3 = i9 + i7;
            System.arraycopy(bArr2, 0, bArr, i4, i7);
            i4 += i7;
        }
        this.o0 = bArr;
        if (this.l0) {
            this.m0 = ((int) jArrC[0]) + this.q0;
            this.n0 = i2;
        }
    }

    private static boolean s(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = X;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i2 = 0;
        while (true) {
            byte[] bArr3 = X;
            if (i2 >= bArr3.length) {
                return true;
            }
            if (bArr2[i2] != bArr3[i2]) {
                return false;
            }
            i2++;
        }
    }

    private boolean t(byte[] bArr) throws Throwable {
        b bVar;
        long length;
        byte[] bArr2;
        b bVar2 = null;
        try {
            try {
                bVar = new b(bArr);
                try {
                    length = bVar.readInt();
                    bArr2 = new byte[4];
                    bVar.read(bArr2);
                } catch (Exception e2) {
                    e = e2;
                    bVar2 = bVar;
                    if (a) {
                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                    }
                    if (bVar2 != null) {
                        bVar2.close();
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
        }
        if (!Arrays.equals(bArr2, f3225h)) {
            bVar.close();
            return false;
        }
        long j2 = 16;
        if (length == 1) {
            length = bVar.readLong();
            if (length < 16) {
                bVar.close();
                return false;
            }
        } else {
            j2 = 8;
        }
        if (length > bArr.length) {
            length = bArr.length;
        }
        long j3 = length - j2;
        if (j3 < 8) {
            bVar.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z2 = false;
        boolean z3 = false;
        for (long j4 = 0; j4 < j3 / 4; j4++) {
            if (bVar.read(bArr3) != 4) {
                bVar.close();
                return false;
            }
            if (j4 != 1) {
                if (Arrays.equals(bArr3, f3226i)) {
                    z2 = true;
                } else if (Arrays.equals(bArr3, f3227j)) {
                    z3 = true;
                }
                if (z2 && z3) {
                    bVar.close();
                    return true;
                }
            }
        }
        bVar.close();
        return false;
    }

    private static boolean u(byte[] bArr) {
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f3224g;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    private boolean v(byte[] bArr) throws Throwable {
        b bVar;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            ByteOrder byteOrderG = G(bVar);
            this.i0 = byteOrderG;
            bVar.i(byteOrderG);
            short s2 = bVar.readShort();
            boolean z2 = s2 == 20306 || s2 == 21330;
            bVar.close();
            return z2;
        } catch (Exception unused2) {
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
    }

    private boolean w(byte[] bArr) {
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f3230m;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    private boolean x(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i2 = 0; i2 < bytes.length; i2++) {
            if (bArr[i2] != bytes[i2]) {
                return false;
            }
        }
        return true;
    }

    private boolean y(byte[] bArr) throws Throwable {
        b bVar;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            ByteOrder byteOrderG = G(bVar);
            this.i0 = byteOrderG;
            bVar.i(byteOrderG);
            boolean z2 = bVar.readShort() == 85;
            bVar.close();
            return z2;
        } catch (Exception unused2) {
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
    }

    private static boolean z(FileDescriptor fileDescriptor) throws ErrnoException {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
                return true;
            } catch (Exception unused) {
                if (a) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
            }
        }
        return false;
    }

    public String d(String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        c cVarF = f(str);
        if (cVarF != null) {
            if (!U.contains(str)) {
                return cVarF.j(this.i0);
            }
            if (str.equals("GPSTimeStamp")) {
                int i2 = cVarF.a;
                if (i2 != 5 && i2 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + cVarF.a);
                    return null;
                }
                e[] eVarArr = (e[]) cVarF.k(this.i0);
                if (eVarArr != null && eVarArr.length == 3) {
                    return String.format("%02d:%02d:%02d", Integer.valueOf((int) (eVarArr[0].a / eVarArr[0].f3246b)), Integer.valueOf((int) (eVarArr[1].a / eVarArr[1].f3246b)), Integer.valueOf((int) (eVarArr[2].a / eVarArr[2].f3246b)));
                }
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                return null;
            }
            try {
                return Double.toString(cVarF.h(this.i0));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public int e(String str, int i2) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        c cVarF = f(str);
        if (cVarF == null) {
            return i2;
        }
        try {
            return cVarF.i(this.i0);
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private a(java.io.InputStream r3, boolean r4) {
        /*
            r2 = this;
            r2.<init>()
            c.k.a.a$d[][] r0 = c.k.a.a.O
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r2.g0 = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r2.h0 = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r2.i0 = r0
            java.lang.String r0 = "inputStream cannot be null"
            java.util.Objects.requireNonNull(r3, r0)
            r0 = 0
            r2.b0 = r0
            if (r4 == 0) goto L3e
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream
            r1 = 5000(0x1388, float:7.006E-42)
            r4.<init>(r3, r1)
            boolean r3 = s(r4)
            if (r3 != 0) goto L35
            java.lang.String r3 = "ExifInterface"
            java.lang.String r4 = "Given data does not follow the structure of an Exif-only data."
            android.util.Log.w(r3, r4)
            return
        L35:
            r3 = 1
            r2.f0 = r3
            r2.d0 = r0
            r2.c0 = r0
            r3 = r4
            goto L68
        L3e:
            boolean r4 = r3 instanceof android.content.res.AssetManager.AssetInputStream
            if (r4 == 0) goto L4a
            r4 = r3
            android.content.res.AssetManager$AssetInputStream r4 = (android.content.res.AssetManager.AssetInputStream) r4
            r2.d0 = r4
            r2.c0 = r0
            goto L68
        L4a:
            boolean r4 = r3 instanceof java.io.FileInputStream
            if (r4 == 0) goto L64
            r4 = r3
            java.io.FileInputStream r4 = (java.io.FileInputStream) r4
            java.io.FileDescriptor r1 = r4.getFD()
            boolean r1 = z(r1)
            if (r1 == 0) goto L64
            r2.d0 = r0
            java.io.FileDescriptor r4 = r4.getFD()
            r2.c0 = r4
            goto L68
        L64:
            r2.d0 = r0
            r2.c0 = r0
        L68:
            r2.D(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.k.a.a.<init>(java.io.InputStream, boolean):void");
    }

    /* compiled from: ExifInterface.java */
    static class d {
        public final int a;

        /* renamed from: b, reason: collision with root package name */
        public final String f3243b;

        /* renamed from: c, reason: collision with root package name */
        public final int f3244c;

        /* renamed from: d, reason: collision with root package name */
        public final int f3245d;

        d(String str, int i2, int i3) {
            this.f3243b = str;
            this.a = i2;
            this.f3244c = i3;
            this.f3245d = -1;
        }

        boolean a(int i2) {
            int i3;
            int i4 = this.f3244c;
            if (i4 == 7 || i2 == 7 || i4 == i2 || (i3 = this.f3245d) == i2) {
                return true;
            }
            if ((i4 == 4 || i3 == 4) && i2 == 3) {
                return true;
            }
            if ((i4 == 9 || i3 == 9) && i2 == 8) {
                return true;
            }
            return (i4 == 12 || i3 == 12) && i2 == 11;
        }

        d(String str, int i2, int i3, int i4) {
            this.f3243b = str;
            this.a = i2;
            this.f3244c = i3;
            this.f3245d = i4;
        }
    }
}