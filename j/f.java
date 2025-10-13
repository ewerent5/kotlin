package j;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import j$.util.Spliterator;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Objects;
import okhttp3.internal.connection.RealConnection;

/* compiled from: Buffer.kt */
/* loaded from: classes3.dex */
public final class f implements h, g, Cloneable, ByteChannel {

    /* renamed from: e, reason: collision with root package name */
    public y f16453e;

    /* renamed from: f, reason: collision with root package name */
    private long f16454f;

    /* compiled from: Buffer.kt */
    public static final class a implements Closeable {

        /* renamed from: e, reason: collision with root package name */
        public f f16455e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f16456f;

        /* renamed from: g, reason: collision with root package name */
        private y f16457g;

        /* renamed from: i, reason: collision with root package name */
        public byte[] f16459i;

        /* renamed from: h, reason: collision with root package name */
        public long f16458h = -1;

        /* renamed from: j, reason: collision with root package name */
        public int f16460j = -1;

        /* renamed from: k, reason: collision with root package name */
        public int f16461k = -1;

        public final int b() {
            long j2 = this.f16458h;
            f fVar = this.f16455e;
            i.y.d.l.b(fVar);
            if (!(j2 != fVar.y0())) {
                throw new IllegalStateException("no more bytes".toString());
            }
            long j3 = this.f16458h;
            return d(j3 == -1 ? 0L : j3 + (this.f16461k - this.f16460j));
        }

        public final long c(long j2) {
            f fVar = this.f16455e;
            if (fVar == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.f16456f) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            long jY0 = fVar.y0();
            int i2 = 1;
            if (j2 <= jY0) {
                if (!(j2 >= 0)) {
                    throw new IllegalArgumentException(("newSize < 0: " + j2).toString());
                }
                long j3 = jY0 - j2;
                while (true) {
                    if (j3 <= 0) {
                        break;
                    }
                    y yVar = fVar.f16453e;
                    i.y.d.l.b(yVar);
                    y yVar2 = yVar.f16506h;
                    i.y.d.l.b(yVar2);
                    int i3 = yVar2.f16502d;
                    long j4 = i3 - yVar2.f16501c;
                    if (j4 > j3) {
                        yVar2.f16502d = i3 - ((int) j3);
                        break;
                    }
                    fVar.f16453e = yVar2.b();
                    z.b(yVar2);
                    j3 -= j4;
                }
                this.f16457g = null;
                this.f16458h = j2;
                this.f16459i = null;
                this.f16460j = -1;
                this.f16461k = -1;
            } else if (j2 > jY0) {
                long j5 = j2 - jY0;
                boolean z = true;
                while (j5 > 0) {
                    y yVarO0 = fVar.O0(i2);
                    int iMin = (int) Math.min(j5, 8192 - yVarO0.f16502d);
                    int i4 = yVarO0.f16502d + iMin;
                    yVarO0.f16502d = i4;
                    j5 -= iMin;
                    if (z) {
                        this.f16457g = yVarO0;
                        this.f16458h = jY0;
                        this.f16459i = yVarO0.f16500b;
                        this.f16460j = i4 - iMin;
                        this.f16461k = i4;
                        z = false;
                    }
                    i2 = 1;
                }
            }
            fVar.v0(j2);
            return jY0;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!(this.f16455e != null)) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            this.f16455e = null;
            this.f16457g = null;
            this.f16458h = -1L;
            this.f16459i = null;
            this.f16460j = -1;
            this.f16461k = -1;
        }

        public final int d(long j2) {
            y yVarC;
            f fVar = this.f16455e;
            if (fVar == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (j2 < -1 || j2 > fVar.y0()) {
                i.y.d.x xVar = i.y.d.x.a;
                String str = String.format("offset=%s > size=%s", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(fVar.y0())}, 2));
                i.y.d.l.c(str, "java.lang.String.format(format, *args)");
                throw new ArrayIndexOutOfBoundsException(str);
            }
            if (j2 == -1 || j2 == fVar.y0()) {
                this.f16457g = null;
                this.f16458h = j2;
                this.f16459i = null;
                this.f16460j = -1;
                this.f16461k = -1;
                return -1;
            }
            long j3 = 0;
            long jY0 = fVar.y0();
            y yVar = fVar.f16453e;
            y yVar2 = this.f16457g;
            if (yVar2 != null) {
                long j4 = this.f16458h;
                int i2 = this.f16460j;
                i.y.d.l.b(yVar2);
                long j5 = j4 - (i2 - yVar2.f16501c);
                if (j5 > j2) {
                    yVarC = yVar;
                    yVar = this.f16457g;
                    jY0 = j5;
                } else {
                    yVarC = this.f16457g;
                    j3 = j5;
                }
            } else {
                yVarC = yVar;
            }
            if (jY0 - j2 > j2 - j3) {
                while (true) {
                    i.y.d.l.b(yVarC);
                    int i3 = yVarC.f16502d;
                    int i4 = yVarC.f16501c;
                    if (j2 < (i3 - i4) + j3) {
                        break;
                    }
                    j3 += i3 - i4;
                    yVarC = yVarC.f16505g;
                }
            } else {
                while (jY0 > j2) {
                    i.y.d.l.b(yVar);
                    yVar = yVar.f16506h;
                    i.y.d.l.b(yVar);
                    jY0 -= yVar.f16502d - yVar.f16501c;
                }
                j3 = jY0;
                yVarC = yVar;
            }
            if (this.f16456f) {
                i.y.d.l.b(yVarC);
                if (yVarC.f16503e) {
                    y yVarF = yVarC.f();
                    if (fVar.f16453e == yVarC) {
                        fVar.f16453e = yVarF;
                    }
                    yVarC = yVarC.c(yVarF);
                    y yVar3 = yVarC.f16506h;
                    i.y.d.l.b(yVar3);
                    yVar3.b();
                }
            }
            this.f16457g = yVarC;
            this.f16458h = j2;
            i.y.d.l.b(yVarC);
            this.f16459i = yVarC.f16500b;
            int i5 = yVarC.f16501c + ((int) (j2 - j3));
            this.f16460j = i5;
            int i6 = yVarC.f16502d;
            this.f16461k = i6;
            return i6 - i5;
        }
    }

    public static /* synthetic */ a a0(f fVar, a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = new a();
        }
        return fVar.Z(aVar);
    }

    public long A(byte b2, long j2, long j3) {
        y yVar;
        int i2;
        long jY0 = 0;
        if (!(0 <= j2 && j3 >= j2)) {
            throw new IllegalArgumentException(("size=" + y0() + " fromIndex=" + j2 + " toIndex=" + j3).toString());
        }
        if (j3 > y0()) {
            j3 = y0();
        }
        if (j2 == j3 || (yVar = this.f16453e) == null) {
            return -1L;
        }
        if (y0() - j2 < j2) {
            jY0 = y0();
            while (jY0 > j2) {
                yVar = yVar.f16506h;
                i.y.d.l.b(yVar);
                jY0 -= yVar.f16502d - yVar.f16501c;
            }
            while (jY0 < j3) {
                byte[] bArr = yVar.f16500b;
                int iMin = (int) Math.min(yVar.f16502d, (yVar.f16501c + j3) - jY0);
                i2 = (int) ((yVar.f16501c + j2) - jY0);
                while (i2 < iMin) {
                    if (bArr[i2] != b2) {
                        i2++;
                    }
                }
                jY0 += yVar.f16502d - yVar.f16501c;
                yVar = yVar.f16505g;
                i.y.d.l.b(yVar);
                j2 = jY0;
            }
            return -1L;
        }
        while (true) {
            long j4 = (yVar.f16502d - yVar.f16501c) + jY0;
            if (j4 > j2) {
                break;
            }
            yVar = yVar.f16505g;
            i.y.d.l.b(yVar);
            jY0 = j4;
        }
        while (jY0 < j3) {
            byte[] bArr2 = yVar.f16500b;
            int iMin2 = (int) Math.min(yVar.f16502d, (yVar.f16501c + j3) - jY0);
            i2 = (int) ((yVar.f16501c + j2) - jY0);
            while (i2 < iMin2) {
                if (bArr2[i2] != b2) {
                    i2++;
                }
            }
            jY0 += yVar.f16502d - yVar.f16501c;
            yVar = yVar.f16505g;
            i.y.d.l.b(yVar);
            j2 = jY0;
        }
        return -1L;
        return (i2 - yVar.f16501c) + jY0;
    }

    public long B(i iVar) {
        i.y.d.l.d(iVar, "bytes");
        return C(iVar, 0L);
    }

    public long C(i iVar, long j2) {
        long j3 = j2;
        i.y.d.l.d(iVar, "bytes");
        if (!(iVar.u() > 0)) {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
        long j4 = 0;
        if (!(j3 >= 0)) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j3).toString());
        }
        y yVar = this.f16453e;
        if (yVar != null) {
            if (y0() - j3 < j3) {
                long jY0 = y0();
                while (jY0 > j3) {
                    yVar = yVar.f16506h;
                    i.y.d.l.b(yVar);
                    jY0 -= yVar.f16502d - yVar.f16501c;
                }
                byte[] bArrL = iVar.l();
                byte b2 = bArrL[0];
                int iU = iVar.u();
                long jY02 = (y0() - iU) + 1;
                while (jY0 < jY02) {
                    byte[] bArr = yVar.f16500b;
                    long j5 = jY0;
                    int iMin = (int) Math.min(yVar.f16502d, (yVar.f16501c + jY02) - jY0);
                    for (int i2 = (int) ((yVar.f16501c + j3) - j5); i2 < iMin; i2++) {
                        if (bArr[i2] == b2 && j.f0.a.b(yVar, i2 + 1, bArrL, 1, iU)) {
                            return (i2 - yVar.f16501c) + j5;
                        }
                    }
                    jY0 = j5 + (yVar.f16502d - yVar.f16501c);
                    yVar = yVar.f16505g;
                    i.y.d.l.b(yVar);
                    j3 = jY0;
                }
            } else {
                while (true) {
                    long j6 = (yVar.f16502d - yVar.f16501c) + j4;
                    if (j6 > j3) {
                        break;
                    }
                    yVar = yVar.f16505g;
                    i.y.d.l.b(yVar);
                    j4 = j6;
                }
                byte[] bArrL2 = iVar.l();
                byte b3 = bArrL2[0];
                int iU2 = iVar.u();
                long jY03 = (y0() - iU2) + 1;
                while (j4 < jY03) {
                    byte[] bArr2 = yVar.f16500b;
                    long j7 = jY03;
                    int iMin2 = (int) Math.min(yVar.f16502d, (yVar.f16501c + jY03) - j4);
                    for (int i3 = (int) ((yVar.f16501c + j3) - j4); i3 < iMin2; i3++) {
                        if (bArr2[i3] == b3 && j.f0.a.b(yVar, i3 + 1, bArrL2, 1, iU2)) {
                            return (i3 - yVar.f16501c) + j4;
                        }
                    }
                    j4 += yVar.f16502d - yVar.f16501c;
                    yVar = yVar.f16505g;
                    i.y.d.l.b(yVar);
                    j3 = j4;
                    jY03 = j7;
                }
            }
        }
        return -1L;
    }

    public final i C0() {
        if (y0() <= ((long) Integer.MAX_VALUE)) {
            return H0((int) y0());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + y0()).toString());
    }

    public long D(i iVar) {
        i.y.d.l.d(iVar, "targetBytes");
        return N(iVar, 0L);
    }

    @Override // j.h
    public byte[] F() {
        return w0(y0());
    }

    @Override // j.h
    public boolean H() {
        return this.f16454f == 0;
    }

    public final i H0(int i2) {
        if (i2 == 0) {
            return i.f16463e;
        }
        c.b(y0(), 0L, i2);
        y yVar = this.f16453e;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            i.y.d.l.b(yVar);
            int i6 = yVar.f16502d;
            int i7 = yVar.f16501c;
            if (i6 == i7) {
                throw new AssertionError("s.limit == s.pos");
            }
            i4 += i6 - i7;
            i5++;
            yVar = yVar.f16505g;
        }
        byte[][] bArr = new byte[i5][];
        int[] iArr = new int[i5 * 2];
        y yVar2 = this.f16453e;
        int i8 = 0;
        while (i3 < i2) {
            i.y.d.l.b(yVar2);
            bArr[i8] = yVar2.f16500b;
            i3 += yVar2.f16502d - yVar2.f16501c;
            iArr[i8] = Math.min(i3, i2);
            iArr[i8 + i5] = yVar2.f16501c;
            yVar2.f16503e = true;
            i8++;
            yVar2 = yVar2.f16505g;
        }
        return new a0(bArr, iArr);
    }

    @Override // j.h
    public void L0(long j2) throws EOFException {
        if (this.f16454f < j2) {
            throw new EOFException();
        }
    }

    @Override // j.h
    public void M(f fVar, long j2) throws EOFException {
        i.y.d.l.d(fVar, "sink");
        if (y0() >= j2) {
            fVar.write(this, j2);
        } else {
            fVar.write(this, y0());
            throw new EOFException();
        }
    }

    public long N(i iVar, long j2) {
        int i2;
        int i3;
        i.y.d.l.d(iVar, "targetBytes");
        long jY0 = 0;
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j2).toString());
        }
        y yVar = this.f16453e;
        if (yVar == null) {
            return -1L;
        }
        if (y0() - j2 < j2) {
            jY0 = y0();
            while (jY0 > j2) {
                yVar = yVar.f16506h;
                i.y.d.l.b(yVar);
                jY0 -= yVar.f16502d - yVar.f16501c;
            }
            if (iVar.u() == 2) {
                byte bD = iVar.d(0);
                byte bD2 = iVar.d(1);
                while (jY0 < y0()) {
                    byte[] bArr = yVar.f16500b;
                    i2 = (int) ((yVar.f16501c + j2) - jY0);
                    int i4 = yVar.f16502d;
                    while (i2 < i4) {
                        byte b2 = bArr[i2];
                        if (b2 == bD || b2 == bD2) {
                            i3 = yVar.f16501c;
                        } else {
                            i2++;
                        }
                    }
                    jY0 += yVar.f16502d - yVar.f16501c;
                    yVar = yVar.f16505g;
                    i.y.d.l.b(yVar);
                    j2 = jY0;
                }
                return -1L;
            }
            byte[] bArrL = iVar.l();
            while (jY0 < y0()) {
                byte[] bArr2 = yVar.f16500b;
                i2 = (int) ((yVar.f16501c + j2) - jY0);
                int i5 = yVar.f16502d;
                while (i2 < i5) {
                    byte b3 = bArr2[i2];
                    for (byte b4 : bArrL) {
                        if (b3 == b4) {
                            i3 = yVar.f16501c;
                        }
                    }
                    i2++;
                }
                jY0 += yVar.f16502d - yVar.f16501c;
                yVar = yVar.f16505g;
                i.y.d.l.b(yVar);
                j2 = jY0;
            }
            return -1L;
        }
        while (true) {
            long j3 = (yVar.f16502d - yVar.f16501c) + jY0;
            if (j3 > j2) {
                break;
            }
            yVar = yVar.f16505g;
            i.y.d.l.b(yVar);
            jY0 = j3;
        }
        if (iVar.u() == 2) {
            byte bD3 = iVar.d(0);
            byte bD4 = iVar.d(1);
            while (jY0 < y0()) {
                byte[] bArr3 = yVar.f16500b;
                i2 = (int) ((yVar.f16501c + j2) - jY0);
                int i6 = yVar.f16502d;
                while (i2 < i6) {
                    byte b5 = bArr3[i2];
                    if (b5 == bD3 || b5 == bD4) {
                        i3 = yVar.f16501c;
                    } else {
                        i2++;
                    }
                }
                jY0 += yVar.f16502d - yVar.f16501c;
                yVar = yVar.f16505g;
                i.y.d.l.b(yVar);
                j2 = jY0;
            }
            return -1L;
        }
        byte[] bArrL2 = iVar.l();
        while (jY0 < y0()) {
            byte[] bArr4 = yVar.f16500b;
            i2 = (int) ((yVar.f16501c + j2) - jY0);
            int i7 = yVar.f16502d;
            while (i2 < i7) {
                byte b6 = bArr4[i2];
                for (byte b7 : bArrL2) {
                    if (b6 == b7) {
                        i3 = yVar.f16501c;
                    }
                }
                i2++;
            }
            jY0 += yVar.f16502d - yVar.f16501c;
            yVar = yVar.f16505g;
            i.y.d.l.b(yVar);
            j2 = jY0;
        }
        return -1L;
        return (i2 - i3) + jY0;
    }

    public final y O0(int i2) {
        if (!(i2 >= 1 && i2 <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        y yVar = this.f16453e;
        if (yVar != null) {
            i.y.d.l.b(yVar);
            y yVar2 = yVar.f16506h;
            i.y.d.l.b(yVar2);
            return (yVar2.f16502d + i2 > 8192 || !yVar2.f16504f) ? yVar2.c(z.c()) : yVar2;
        }
        y yVarC = z.c();
        this.f16453e = yVarC;
        yVarC.f16506h = yVarC;
        yVarC.f16505g = yVarC;
        return yVarC;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c2 A[EDGE_INSN: B:51:0x00c2->B:41:0x00c2 BREAK  A[LOOP:0: B:5:0x0011->B:53:?], SYNTHETIC] */
    @Override // j.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long P() throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j.f.P():long");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae A[EDGE_INSN: B:43:0x00ae->B:37:0x00ae BREAK  A[LOOP:0: B:5:0x000d->B:45:?], SYNTHETIC] */
    @Override // j.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long P0() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.y0()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb8
            r0 = 0
            r4 = r2
            r1 = 0
        Ld:
            j.y r6 = r15.f16453e
            i.y.d.l.b(r6)
            byte[] r7 = r6.f16500b
            int r8 = r6.f16501c
            int r9 = r6.f16502d
        L18:
            if (r8 >= r9) goto L9a
            r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L29
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L29
            int r11 = r10 - r11
            goto L43
        L29:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L38
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L38
        L33:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L43
        L38:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L7b
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L7b
            goto L33
        L43:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L53
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L53:
            j.f r0 = new j.f
            r0.<init>()
            j.f r0 = r0.n0(r4)
            j.f r0 = r0.I(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.l0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L7b:
            if (r0 == 0) goto L7f
            r1 = 1
            goto L9a
        L7f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = j.c.e(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L9a:
            if (r8 != r9) goto La6
            j.y r7 = r6.b()
            r15.f16453e = r7
            j.z.b(r6)
            goto La8
        La6:
            r6.f16501c = r8
        La8:
            if (r1 != 0) goto Lae
            j.y r6 = r15.f16453e
            if (r6 != 0) goto Ld
        Lae:
            long r1 = r15.y0()
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.v0(r1)
            return r4
        Lb8:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.f.P0():long");
    }

    @Override // j.h
    public String Q(long j2) throws EOFException {
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j2).toString());
        }
        long j3 = j2 != Long.MAX_VALUE ? j2 + 1 : Long.MAX_VALUE;
        byte b2 = (byte) 10;
        long jA = A(b2, 0L, j3);
        if (jA != -1) {
            return j.f0.a.c(this, jA);
        }
        if (j3 < y0() && v(j3 - 1) == ((byte) 13) && v(j3) == b2) {
            return j.f0.a.c(this, j3);
        }
        f fVar = new f();
        j(fVar, 0L, Math.min(32, y0()));
        throw new EOFException("\\n not found: limit=" + Math.min(y0(), j2) + " content=" + fVar.o0().k() + (char) 8230);
    }

    @Override // j.h
    public InputStream Q0() {
        return new b();
    }

    @Override // j.h
    public int R0(t tVar) throws EOFException {
        i.y.d.l.d(tVar, "options");
        int iE = j.f0.a.e(this, tVar, false, 2, null);
        if (iE == -1) {
            return -1;
        }
        h(tVar.f()[iE].u());
        return iE;
    }

    @Override // j.g
    /* renamed from: S0, reason: merged with bridge method [inline-methods] */
    public f B0(i iVar) {
        i.y.d.l.d(iVar, "byteString");
        iVar.y(this, 0, iVar.u());
        return this;
    }

    public boolean T(long j2, i iVar, int i2, int i3) {
        i.y.d.l.d(iVar, "bytes");
        if (j2 < 0 || i2 < 0 || i3 < 0 || y0() - j2 < i3 || iVar.u() - i2 < i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (v(i4 + j2) != iVar.d(i2 + i4)) {
                return false;
            }
        }
        return true;
    }

    public f T0(d0 d0Var, long j2) {
        i.y.d.l.d(d0Var, "source");
        while (j2 > 0) {
            long j3 = d0Var.read(this, j2);
            if (j3 == -1) {
                throw new EOFException();
            }
            j2 -= j3;
        }
        return this;
    }

    @Override // j.g
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public f A0(byte[] bArr) {
        i.y.d.l.d(bArr, "source");
        return g0(bArr, 0, bArr.length);
    }

    @Override // j.g
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public f g0(byte[] bArr, int i2, int i3) {
        i.y.d.l.d(bArr, "source");
        long j2 = i3;
        c.b(bArr.length, i2, j2);
        int i4 = i3 + i2;
        while (i2 < i4) {
            y yVarO0 = O0(1);
            int iMin = Math.min(i4 - i2, 8192 - yVarO0.f16502d);
            int i5 = i2 + iMin;
            i.t.g.c(bArr, yVarO0.f16500b, yVarO0.f16502d, i2, i5);
            yVarO0.f16502d += iMin;
            i2 = i5;
        }
        v0(y0() + j2);
        return this;
    }

    public int W(byte[] bArr, int i2, int i3) {
        i.y.d.l.d(bArr, "sink");
        c.b(bArr.length, i2, i3);
        y yVar = this.f16453e;
        if (yVar == null) {
            return -1;
        }
        int iMin = Math.min(i3, yVar.f16502d - yVar.f16501c);
        byte[] bArr2 = yVar.f16500b;
        int i4 = yVar.f16501c;
        i.t.g.c(bArr2, bArr, i2, i4, i4 + iMin);
        yVar.f16501c += iMin;
        v0(y0() - iMin);
        if (yVar.f16501c != yVar.f16502d) {
            return iMin;
        }
        this.f16453e = yVar.b();
        z.b(yVar);
        return iMin;
    }

    @Override // j.g
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public f I(int i2) {
        y yVarO0 = O0(1);
        byte[] bArr = yVarO0.f16500b;
        int i3 = yVarO0.f16502d;
        yVarO0.f16502d = i3 + 1;
        bArr[i3] = (byte) i2;
        v0(y0() + 1);
        return this;
    }

    @Override // j.g
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public f M0(long j2) {
        if (j2 == 0) {
            return I(48);
        }
        boolean z = false;
        int i2 = 1;
        if (j2 < 0) {
            j2 = -j2;
            if (j2 < 0) {
                return Y("-9223372036854775808");
            }
            z = true;
        }
        if (j2 >= 100000000) {
            i2 = j2 < 1000000000000L ? j2 < RealConnection.IDLE_CONNECTION_HEALTHY_NS ? j2 < 1000000000 ? 9 : 10 : j2 < 100000000000L ? 11 : 12 : j2 < 1000000000000000L ? j2 < 10000000000000L ? 13 : j2 < 100000000000000L ? 14 : 15 : j2 < 100000000000000000L ? j2 < 10000000000000000L ? 16 : 17 : j2 < 1000000000000000000L ? 18 : 19;
        } else if (j2 >= AbstractComponentTracker.LINGERING_TIMEOUT) {
            i2 = j2 < 1000000 ? j2 < 100000 ? 5 : 6 : j2 < 10000000 ? 7 : 8;
        } else if (j2 >= 100) {
            i2 = j2 < 1000 ? 3 : 4;
        } else if (j2 >= 10) {
            i2 = 2;
        }
        if (z) {
            i2++;
        }
        y yVarO0 = O0(i2);
        byte[] bArr = yVarO0.f16500b;
        int i3 = yVarO0.f16502d + i2;
        while (j2 != 0) {
            long j3 = 10;
            i3--;
            bArr[i3] = j.f0.a.a()[(int) (j2 % j3)];
            j2 /= j3;
        }
        if (z) {
            bArr[i3 - 1] = (byte) 45;
        }
        yVarO0.f16502d += i2;
        v0(y0() + i2);
        return this;
    }

    @Override // j.g
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public f n0(long j2) {
        if (j2 == 0) {
            return I(48);
        }
        long j3 = (j2 >>> 1) | j2;
        long j4 = j3 | (j3 >>> 2);
        long j5 = j4 | (j4 >>> 4);
        long j6 = j5 | (j5 >>> 8);
        long j7 = j6 | (j6 >>> 16);
        long j8 = j7 | (j7 >>> 32);
        long j9 = j8 - ((j8 >>> 1) & 6148914691236517205L);
        long j10 = ((j9 >>> 2) & 3689348814741910323L) + (j9 & 3689348814741910323L);
        long j11 = ((j10 >>> 4) + j10) & 1085102592571150095L;
        long j12 = j11 + (j11 >>> 8);
        long j13 = j12 + (j12 >>> 16);
        int i2 = (int) ((((j13 & 63) + ((j13 >>> 32) & 63)) + 3) / 4);
        y yVarO0 = O0(i2);
        byte[] bArr = yVarO0.f16500b;
        int i3 = yVarO0.f16502d;
        for (int i4 = (i3 + i2) - 1; i4 >= i3; i4--) {
            bArr[i4] = j.f0.a.a()[(int) (15 & j2)];
            j2 >>>= 4;
        }
        yVarO0.f16502d += i2;
        v0(y0() + i2);
        return this;
    }

    public final a Z(a aVar) {
        i.y.d.l.d(aVar, "unsafeCursor");
        if (!(aVar.f16455e == null)) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        aVar.f16455e = this;
        aVar.f16456f = true;
        return aVar;
    }

    @Override // j.g
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public f y(int i2) {
        y yVarO0 = O0(4);
        byte[] bArr = yVarO0.f16500b;
        int i3 = yVarO0.f16502d;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 24) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i2 >>> 16) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i2 >>> 8) & 255);
        bArr[i6] = (byte) (i2 & 255);
        yVarO0.f16502d = i6 + 1;
        v0(y0() + 4);
        return this;
    }

    public f a1(long j2) {
        y yVarO0 = O0(8);
        byte[] bArr = yVarO0.f16500b;
        int i2 = yVarO0.f16502d;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j2 >>> 56) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j2 >>> 48) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((j2 >>> 40) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j2 >>> 32) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j2 >>> 24) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j2 >>> 16) & 255);
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((j2 >>> 8) & 255);
        bArr[i9] = (byte) (j2 & 255);
        yVarO0.f16502d = i9 + 1;
        v0(y0() + 8);
        return this;
    }

    public final void b() {
        h(y0());
    }

    @Override // j.g
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public f u(int i2) {
        y yVarO0 = O0(2);
        byte[] bArr = yVarO0.f16500b;
        int i3 = yVarO0.f16502d;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 8) & 255);
        bArr[i4] = (byte) (i2 & 255);
        yVarO0.f16502d = i4 + 1;
        v0(y0() + 2);
        return this;
    }

    public f c1(String str, int i2, int i3, Charset charset) {
        i.y.d.l.d(str, "string");
        i.y.d.l.d(charset, "charset");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i2).toString());
        }
        if (!(i3 >= i2)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i3 + " < " + i2).toString());
        }
        if (!(i3 <= str.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i3 + " > " + str.length()).toString());
        }
        if (i.y.d.l.a(charset, i.d0.d.a)) {
            return f1(str, i2, i3);
        }
        String strSubstring = str.substring(i2, i3);
        i.y.d.l.c(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        Objects.requireNonNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes = strSubstring.getBytes(charset);
        i.y.d.l.c(bytes, "(this as java.lang.String).getBytes(charset)");
        return g0(bytes, 0, bytes.length);
    }

    @Override // j.d0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public f clone() {
        return i();
    }

    public f d1(String str, Charset charset) {
        i.y.d.l.d(str, "string");
        i.y.d.l.d(charset, "charset");
        return c1(str, 0, str.length(), charset);
    }

    @Override // j.h, j.g
    public f e() {
        return this;
    }

    @Override // j.h
    public boolean e0(long j2, i iVar) {
        i.y.d.l.d(iVar, "bytes");
        return T(j2, iVar, 0, iVar.u());
    }

    @Override // j.g
    /* renamed from: e1, reason: merged with bridge method [inline-methods] */
    public f Y(String str) {
        i.y.d.l.d(str, "string");
        return f1(str, 0, str.length());
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (y0() != fVar.y0()) {
                return false;
            }
            if (y0() != 0) {
                y yVar = this.f16453e;
                i.y.d.l.b(yVar);
                y yVar2 = fVar.f16453e;
                i.y.d.l.b(yVar2);
                int i2 = yVar.f16501c;
                int i3 = yVar2.f16501c;
                long j2 = 0;
                while (j2 < y0()) {
                    long jMin = Math.min(yVar.f16502d - i2, yVar2.f16502d - i3);
                    long j3 = 0;
                    while (j3 < jMin) {
                        int i4 = i2 + 1;
                        int i5 = i3 + 1;
                        if (yVar.f16500b[i2] != yVar2.f16500b[i3]) {
                            return false;
                        }
                        j3++;
                        i2 = i4;
                        i3 = i5;
                    }
                    if (i2 == yVar.f16502d) {
                        yVar = yVar.f16505g;
                        i.y.d.l.b(yVar);
                        i2 = yVar.f16501c;
                    }
                    if (i3 == yVar2.f16502d) {
                        yVar2 = yVar2.f16505g;
                        i.y.d.l.b(yVar2);
                        i3 = yVar2.f16501c;
                    }
                    j2 += jMin;
                }
            }
        }
        return true;
    }

    @Override // j.h
    public String f0(Charset charset) {
        i.y.d.l.d(charset, "charset");
        return k0(this.f16454f, charset);
    }

    public f f1(String str, int i2, int i3) {
        i.y.d.l.d(str, "string");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i2).toString());
        }
        if (!(i3 >= i2)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i3 + " < " + i2).toString());
        }
        if (!(i3 <= str.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i3 + " > " + str.length()).toString());
        }
        while (i2 < i3) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                y yVarO0 = O0(1);
                byte[] bArr = yVarO0.f16500b;
                int i4 = yVarO0.f16502d - i2;
                int iMin = Math.min(i3, 8192 - i4);
                int i5 = i2 + 1;
                bArr[i2 + i4] = (byte) cCharAt;
                while (i5 < iMin) {
                    char cCharAt2 = str.charAt(i5);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[i5 + i4] = (byte) cCharAt2;
                    i5++;
                }
                int i6 = yVarO0.f16502d;
                int i7 = (i4 + i5) - i6;
                yVarO0.f16502d = i6 + i7;
                v0(y0() + i7);
                i2 = i5;
            } else {
                if (cCharAt < 2048) {
                    y yVarO02 = O0(2);
                    byte[] bArr2 = yVarO02.f16500b;
                    int i8 = yVarO02.f16502d;
                    bArr2[i8] = (byte) ((cCharAt >> 6) | 192);
                    bArr2[i8 + 1] = (byte) ((cCharAt & '?') | 128);
                    yVarO02.f16502d = i8 + 2;
                    v0(y0() + 2);
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    y yVarO03 = O0(3);
                    byte[] bArr3 = yVarO03.f16500b;
                    int i9 = yVarO03.f16502d;
                    bArr3[i9] = (byte) ((cCharAt >> '\f') | 224);
                    bArr3[i9 + 1] = (byte) ((63 & (cCharAt >> 6)) | 128);
                    bArr3[i9 + 2] = (byte) ((cCharAt & '?') | 128);
                    yVarO03.f16502d = i9 + 3;
                    v0(y0() + 3);
                } else {
                    int i10 = i2 + 1;
                    char cCharAt3 = i10 < i3 ? str.charAt(i10) : (char) 0;
                    if (cCharAt > 56319 || 56320 > cCharAt3 || 57343 < cCharAt3) {
                        I(63);
                        i2 = i10;
                    } else {
                        int i11 = (((cCharAt & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        y yVarO04 = O0(4);
                        byte[] bArr4 = yVarO04.f16500b;
                        int i12 = yVarO04.f16502d;
                        bArr4[i12] = (byte) ((i11 >> 18) | 240);
                        bArr4[i12 + 1] = (byte) (((i11 >> 12) & 63) | 128);
                        bArr4[i12 + 2] = (byte) (((i11 >> 6) & 63) | 128);
                        bArr4[i12 + 3] = (byte) ((i11 & 63) | 128);
                        yVarO04.f16502d = i12 + 4;
                        v0(y0() + 4);
                        i2 += 2;
                    }
                }
                i2++;
            }
        }
        return this;
    }

    @Override // j.g, j.b0, java.io.Flushable
    public void flush() {
    }

    public final long g() {
        long jY0 = y0();
        if (jY0 == 0) {
            return 0L;
        }
        y yVar = this.f16453e;
        i.y.d.l.b(yVar);
        y yVar2 = yVar.f16506h;
        i.y.d.l.b(yVar2);
        if (yVar2.f16502d < 8192 && yVar2.f16504f) {
            jY0 -= r3 - yVar2.f16501c;
        }
        return jY0;
    }

    public f g1(int i2) {
        if (i2 < 128) {
            I(i2);
        } else if (i2 < 2048) {
            y yVarO0 = O0(2);
            byte[] bArr = yVarO0.f16500b;
            int i3 = yVarO0.f16502d;
            bArr[i3] = (byte) ((i2 >> 6) | 192);
            bArr[i3 + 1] = (byte) ((i2 & 63) | 128);
            yVarO0.f16502d = i3 + 2;
            v0(y0() + 2);
        } else if (55296 <= i2 && 57343 >= i2) {
            I(63);
        } else if (i2 < 65536) {
            y yVarO02 = O0(3);
            byte[] bArr2 = yVarO02.f16500b;
            int i4 = yVarO02.f16502d;
            bArr2[i4] = (byte) ((i2 >> 12) | 224);
            bArr2[i4 + 1] = (byte) (((i2 >> 6) & 63) | 128);
            bArr2[i4 + 2] = (byte) ((i2 & 63) | 128);
            yVarO02.f16502d = i4 + 3;
            v0(y0() + 3);
        } else {
            if (i2 > 1114111) {
                throw new IllegalArgumentException("Unexpected code point: 0x" + c.f(i2));
            }
            y yVarO03 = O0(4);
            byte[] bArr3 = yVarO03.f16500b;
            int i5 = yVarO03.f16502d;
            bArr3[i5] = (byte) ((i2 >> 18) | 240);
            bArr3[i5 + 1] = (byte) (((i2 >> 12) & 63) | 128);
            bArr3[i5 + 2] = (byte) (((i2 >> 6) & 63) | 128);
            bArr3[i5 + 3] = (byte) ((i2 & 63) | 128);
            yVarO03.f16502d = i5 + 4;
            v0(y0() + 4);
        }
        return this;
    }

    @Override // j.h
    public void h(long j2) throws EOFException {
        while (j2 > 0) {
            y yVar = this.f16453e;
            if (yVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j2, yVar.f16502d - yVar.f16501c);
            long j3 = iMin;
            v0(y0() - j3);
            j2 -= j3;
            int i2 = yVar.f16501c + iMin;
            yVar.f16501c = i2;
            if (i2 == yVar.f16502d) {
                this.f16453e = yVar.b();
                z.b(yVar);
            }
        }
    }

    public int h0() {
        return c.c(readInt());
    }

    public int hashCode() {
        y yVar = this.f16453e;
        if (yVar == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i3 = yVar.f16502d;
            for (int i4 = yVar.f16501c; i4 < i3; i4++) {
                i2 = (i2 * 31) + yVar.f16500b[i4];
            }
            yVar = yVar.f16505g;
            i.y.d.l.b(yVar);
        } while (yVar != this.f16453e);
        return i2;
    }

    public final f i() {
        f fVar = new f();
        if (y0() != 0) {
            y yVar = this.f16453e;
            i.y.d.l.b(yVar);
            y yVarD = yVar.d();
            fVar.f16453e = yVarD;
            yVarD.f16506h = yVarD;
            yVarD.f16505g = yVarD;
            for (y yVar2 = yVar.f16505g; yVar2 != yVar; yVar2 = yVar2.f16505g) {
                y yVar3 = yVarD.f16506h;
                i.y.d.l.b(yVar3);
                i.y.d.l.b(yVar2);
                yVar3.c(yVar2.d());
            }
            fVar.v0(y0());
        }
        return fVar;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final f j(f fVar, long j2, long j3) {
        i.y.d.l.d(fVar, "out");
        c.b(y0(), j2, j3);
        if (j3 != 0) {
            fVar.v0(fVar.y0() + j3);
            y yVar = this.f16453e;
            while (true) {
                i.y.d.l.b(yVar);
                int i2 = yVar.f16502d;
                int i3 = yVar.f16501c;
                if (j2 < i2 - i3) {
                    break;
                }
                j2 -= i2 - i3;
                yVar = yVar.f16505g;
            }
            while (j3 > 0) {
                i.y.d.l.b(yVar);
                y yVarD = yVar.d();
                int i4 = yVarD.f16501c + ((int) j2);
                yVarD.f16501c = i4;
                yVarD.f16502d = Math.min(i4 + ((int) j3), yVarD.f16502d);
                y yVar2 = fVar.f16453e;
                if (yVar2 == null) {
                    yVarD.f16506h = yVarD;
                    yVarD.f16505g = yVarD;
                    fVar.f16453e = yVarD;
                } else {
                    i.y.d.l.b(yVar2);
                    y yVar3 = yVar2.f16506h;
                    i.y.d.l.b(yVar3);
                    yVar3.c(yVarD);
                }
                j3 -= yVarD.f16502d - yVarD.f16501c;
                yVar = yVar.f16505g;
                j2 = 0;
            }
        }
        return this;
    }

    public short j0() {
        return c.d(readShort());
    }

    public String k0(long j2, Charset charset) throws EOFException {
        i.y.d.l.d(charset, "charset");
        if (!(j2 >= 0 && j2 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f16454f < j2) {
            throw new EOFException();
        }
        if (j2 == 0) {
            return "";
        }
        y yVar = this.f16453e;
        i.y.d.l.b(yVar);
        int i2 = yVar.f16501c;
        if (i2 + j2 > yVar.f16502d) {
            return new String(w0(j2), charset);
        }
        int i3 = (int) j2;
        String str = new String(yVar.f16500b, i2, i3, charset);
        int i4 = yVar.f16501c + i3;
        yVar.f16501c = i4;
        this.f16454f -= j2;
        if (i4 == yVar.f16502d) {
            this.f16453e = yVar.b();
            z.b(yVar);
        }
        return str;
    }

    public String l0() {
        return k0(this.f16454f, i.d0.d.a);
    }

    @Override // j.g
    public long m0(d0 d0Var) {
        i.y.d.l.d(d0Var, "source");
        long j2 = 0;
        while (true) {
            long j3 = d0Var.read(this, 8192);
            if (j3 == -1) {
                return j2;
            }
            j2 += j3;
        }
    }

    @Override // j.h
    public i o(long j2) throws EOFException {
        if (!(j2 >= 0 && j2 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (y0() < j2) {
            throw new EOFException();
        }
        if (j2 < Spliterator.CONCURRENT) {
            return new i(w0(j2));
        }
        i iVarH0 = H0((int) j2);
        h(j2);
        return iVarH0;
    }

    @Override // j.h
    public i o0() {
        return o(y0());
    }

    @Override // j.h
    public boolean p0(long j2) {
        return this.f16454f >= j2;
    }

    @Override // j.h
    public h peek() {
        return q.d(new v(this));
    }

    @Override // j.g
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public f t() {
        return this;
    }

    public String q0(long j2) throws EOFException {
        return k0(j2, i.d0.d.a);
    }

    public int r0() throws EOFException {
        int i2;
        int i3;
        int i4;
        if (y0() == 0) {
            throw new EOFException();
        }
        byte bV = v(0L);
        if ((bV & 128) == 0) {
            i2 = bV & 127;
            i3 = 1;
            i4 = 0;
        } else if ((bV & 224) == 192) {
            i2 = bV & 31;
            i3 = 2;
            i4 = 128;
        } else if ((bV & 240) == 224) {
            i2 = bV & 15;
            i3 = 3;
            i4 = 2048;
        } else {
            if ((bV & 248) != 240) {
                h(1L);
                return 65533;
            }
            i2 = bV & 7;
            i3 = 4;
            i4 = 65536;
        }
        long j2 = i3;
        if (y0() < j2) {
            throw new EOFException("size < " + i3 + ": " + y0() + " (to read code point prefixed 0x" + c.e(bV) + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        for (int i5 = 1; i5 < i3; i5++) {
            long j3 = i5;
            byte bV2 = v(j3);
            if ((bV2 & 192) != 128) {
                h(j3);
                return 65533;
            }
            i2 = (i2 << 6) | (bV2 & 63);
        }
        h(j2);
        if (i2 > 1114111) {
            return 65533;
        }
        if ((55296 <= i2 && 57343 >= i2) || i2 < i4) {
            return 65533;
        }
        return i2;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        i.y.d.l.d(byteBuffer, "sink");
        y yVar = this.f16453e;
        if (yVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), yVar.f16502d - yVar.f16501c);
        byteBuffer.put(yVar.f16500b, yVar.f16501c, iMin);
        int i2 = yVar.f16501c + iMin;
        yVar.f16501c = i2;
        this.f16454f -= iMin;
        if (i2 == yVar.f16502d) {
            this.f16453e = yVar.b();
            z.b(yVar);
        }
        return iMin;
    }

    @Override // j.h
    public byte readByte() {
        if (y0() == 0) {
            throw new EOFException();
        }
        y yVar = this.f16453e;
        i.y.d.l.b(yVar);
        int i2 = yVar.f16501c;
        int i3 = yVar.f16502d;
        int i4 = i2 + 1;
        byte b2 = yVar.f16500b[i2];
        v0(y0() - 1);
        if (i4 == i3) {
            this.f16453e = yVar.b();
            z.b(yVar);
        } else {
            yVar.f16501c = i4;
        }
        return b2;
    }

    @Override // j.h
    public void readFully(byte[] bArr) throws EOFException {
        i.y.d.l.d(bArr, "sink");
        int i2 = 0;
        while (i2 < bArr.length) {
            int iW = W(bArr, i2, bArr.length - i2);
            if (iW == -1) {
                throw new EOFException();
            }
            i2 += iW;
        }
    }

    @Override // j.h
    public int readInt() throws EOFException {
        if (y0() < 4) {
            throw new EOFException();
        }
        y yVar = this.f16453e;
        i.y.d.l.b(yVar);
        int i2 = yVar.f16501c;
        int i3 = yVar.f16502d;
        if (i3 - i2 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = yVar.f16500b;
        int i4 = i2 + 1;
        int i5 = i4 + 1;
        int i6 = ((bArr[i2] & 255) << 24) | ((bArr[i4] & 255) << 16);
        int i7 = i5 + 1;
        int i8 = i6 | ((bArr[i5] & 255) << 8);
        int i9 = i7 + 1;
        int i10 = i8 | (bArr[i7] & 255);
        v0(y0() - 4);
        if (i9 == i3) {
            this.f16453e = yVar.b();
            z.b(yVar);
        } else {
            yVar.f16501c = i9;
        }
        return i10;
    }

    @Override // j.h
    public long readLong() throws EOFException {
        if (y0() < 8) {
            throw new EOFException();
        }
        y yVar = this.f16453e;
        i.y.d.l.b(yVar);
        int i2 = yVar.f16501c;
        int i3 = yVar.f16502d;
        if (i3 - i2 < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = yVar.f16500b;
        long j2 = (bArr[i2] & 255) << 56;
        long j3 = j2 | ((bArr[r6] & 255) << 48);
        long j4 = j3 | ((bArr[r1] & 255) << 40);
        int i4 = i2 + 1 + 1 + 1 + 1;
        long j5 = ((bArr[r6] & 255) << 32) | j4;
        long j6 = j5 | ((bArr[i4] & 255) << 24);
        long j7 = j6 | ((bArr[r8] & 255) << 16);
        long j8 = j7 | ((bArr[r1] & 255) << 8);
        int i5 = i4 + 1 + 1 + 1 + 1;
        long j9 = j8 | (bArr[r8] & 255);
        v0(y0() - 8);
        if (i5 == i3) {
            this.f16453e = yVar.b();
            z.b(yVar);
        } else {
            yVar.f16501c = i5;
        }
        return j9;
    }

    @Override // j.h
    public short readShort() throws EOFException {
        if (y0() < 2) {
            throw new EOFException();
        }
        y yVar = this.f16453e;
        i.y.d.l.b(yVar);
        int i2 = yVar.f16501c;
        int i3 = yVar.f16502d;
        if (i3 - i2 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = yVar.f16500b;
        int i4 = i2 + 1;
        int i5 = i4 + 1;
        int i6 = ((bArr[i2] & 255) << 8) | (bArr[i4] & 255);
        v0(y0() - 2);
        if (i5 == i3) {
            this.f16453e = yVar.b();
            z.b(yVar);
        } else {
            yVar.f16501c = i5;
        }
        return (short) i6;
    }

    @Override // j.g
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public f O() {
        return this;
    }

    @Override // j.d0
    public e0 timeout() {
        return e0.NONE;
    }

    public String toString() {
        return C0().toString();
    }

    @Override // j.h
    public String u0() {
        return Q(Long.MAX_VALUE);
    }

    public final byte v(long j2) {
        c.b(y0(), j2, 1L);
        y yVar = this.f16453e;
        if (yVar == null) {
            i.y.d.l.b(null);
            throw null;
        }
        if (y0() - j2 < j2) {
            long jY0 = y0();
            while (jY0 > j2) {
                yVar = yVar.f16506h;
                i.y.d.l.b(yVar);
                jY0 -= yVar.f16502d - yVar.f16501c;
            }
            i.y.d.l.b(yVar);
            return yVar.f16500b[(int) ((yVar.f16501c + j2) - jY0)];
        }
        long j3 = 0;
        while (true) {
            long j4 = (yVar.f16502d - yVar.f16501c) + j3;
            if (j4 > j2) {
                i.y.d.l.b(yVar);
                return yVar.f16500b[(int) ((yVar.f16501c + j2) - j3)];
            }
            yVar = yVar.f16505g;
            i.y.d.l.b(yVar);
            j3 = j4;
        }
    }

    public final void v0(long j2) {
        this.f16454f = j2;
    }

    @Override // j.h
    public byte[] w0(long j2) throws EOFException {
        if (!(j2 >= 0 && j2 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (y0() < j2) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j2];
        readFully(bArr);
        return bArr;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        i.y.d.l.d(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i2 = iRemaining;
        while (i2 > 0) {
            y yVarO0 = O0(1);
            int iMin = Math.min(i2, 8192 - yVarO0.f16502d);
            byteBuffer.get(yVarO0.f16500b, yVarO0.f16502d, iMin);
            i2 -= iMin;
            yVarO0.f16502d += iMin;
        }
        this.f16454f += iRemaining;
        return iRemaining;
    }

    public final long y0() {
        return this.f16454f;
    }

    /* compiled from: Buffer.kt */
    public static final class b extends InputStream {
        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(f.this.y0(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (f.this.y0() > 0) {
                return f.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return f.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) {
            i.y.d.l.d(bArr, "sink");
            return f.this.W(bArr, i2, i3);
        }
    }

    @Override // j.b0
    public void write(f fVar, long j2) {
        y yVar;
        i.y.d.l.d(fVar, "source");
        if (fVar != this) {
            c.b(fVar.y0(), 0L, j2);
            while (j2 > 0) {
                y yVar2 = fVar.f16453e;
                i.y.d.l.b(yVar2);
                int i2 = yVar2.f16502d;
                i.y.d.l.b(fVar.f16453e);
                if (j2 < i2 - r2.f16501c) {
                    y yVar3 = this.f16453e;
                    if (yVar3 != null) {
                        i.y.d.l.b(yVar3);
                        yVar = yVar3.f16506h;
                    } else {
                        yVar = null;
                    }
                    if (yVar != null && yVar.f16504f) {
                        if ((yVar.f16502d + j2) - (yVar.f16503e ? 0 : yVar.f16501c) <= 8192) {
                            y yVar4 = fVar.f16453e;
                            i.y.d.l.b(yVar4);
                            yVar4.g(yVar, (int) j2);
                            fVar.v0(fVar.y0() - j2);
                            v0(y0() + j2);
                            return;
                        }
                    }
                    y yVar5 = fVar.f16453e;
                    i.y.d.l.b(yVar5);
                    fVar.f16453e = yVar5.e((int) j2);
                }
                y yVar6 = fVar.f16453e;
                i.y.d.l.b(yVar6);
                long j3 = yVar6.f16502d - yVar6.f16501c;
                fVar.f16453e = yVar6.b();
                y yVar7 = this.f16453e;
                if (yVar7 == null) {
                    this.f16453e = yVar6;
                    yVar6.f16506h = yVar6;
                    yVar6.f16505g = yVar6;
                } else {
                    i.y.d.l.b(yVar7);
                    y yVar8 = yVar7.f16506h;
                    i.y.d.l.b(yVar8);
                    yVar8.c(yVar6).a();
                }
                fVar.v0(fVar.y0() - j3);
                v0(y0() + j3);
                j2 -= j3;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    @Override // j.d0
    public long read(f fVar, long j2) {
        i.y.d.l.d(fVar, "sink");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (y0() == 0) {
            return -1L;
        }
        if (j2 > y0()) {
            j2 = y0();
        }
        fVar.write(this, j2);
        return j2;
    }
}