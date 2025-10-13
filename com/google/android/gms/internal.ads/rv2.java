package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import ch.qos.logback.core.net.SyslogConstants;
import com.androidplot.BuildConfig;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class rv2 implements av2 {
    public static final cv2 a = new ov2();

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f8757b = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f8758c = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};

    /* renamed from: d, reason: collision with root package name */
    private static final UUID f8759d = new UUID(72057594037932032L, -9223371306706625679L);
    private boolean A;
    private long B;
    private long C;
    private long D;
    private i03 E;
    private i03 F;
    private boolean G;
    private int H;
    private long I;
    private long J;
    private int K;
    private int L;
    private int[] M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private byte V;
    private int W;
    private int X;
    private int Y;
    private boolean Z;
    private boolean a0;
    private bv2 b0;
    private final nv2 c0;

    /* renamed from: e, reason: collision with root package name */
    private final tv2 f8760e;

    /* renamed from: f, reason: collision with root package name */
    private final SparseArray<qv2> f8761f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f8762g;

    /* renamed from: h, reason: collision with root package name */
    private final o03 f8763h;

    /* renamed from: i, reason: collision with root package name */
    private final o03 f8764i;

    /* renamed from: j, reason: collision with root package name */
    private final o03 f8765j;

    /* renamed from: k, reason: collision with root package name */
    private final o03 f8766k;

    /* renamed from: l, reason: collision with root package name */
    private final o03 f8767l;

    /* renamed from: m, reason: collision with root package name */
    private final o03 f8768m;
    private final o03 n;
    private final o03 o;
    private final o03 p;
    private ByteBuffer q;
    private long r;
    private long s;
    private long t;
    private long u;
    private long v;
    private qv2 w;
    private boolean x;
    private int y;
    private long z;

    public rv2(int i2) {
        nv2 nv2Var = new nv2();
        this.s = -1L;
        this.t = -9223372036854775807L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.B = -1L;
        this.C = -1L;
        this.D = -9223372036854775807L;
        this.c0 = nv2Var;
        nv2Var.b(new pv2(this, null));
        this.f8762g = true;
        this.f8760e = new tv2();
        this.f8761f = new SparseArray<>();
        this.f8765j = new o03(4);
        this.f8766k = new o03(ByteBuffer.allocate(4).putInt(-1).array());
        this.f8767l = new o03(4);
        this.f8763h = new o03(m03.a);
        this.f8764i = new o03(4);
        this.f8768m = new o03();
        this.n = new o03();
        this.o = new o03(8);
        this.p = new o03();
    }

    static final int l(int i2) {
        switch (i2) {
            case 131:
            case SyslogConstants.LOG_LOCAL1 /* 136 */:
            case 155:
            case 159:
            case SyslogConstants.LOG_LOCAL6 /* 176 */:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 2274716:
                return 3;
            case SyslogConstants.LOG_LOCAL4 /* 160 */:
            case 174:
            case 183:
            case 187:
            case 224:
            case BuildConfig.VERSION_CODE /* 225 */:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                return 5;
            default:
                return 0;
        }
    }

    static final boolean m(int i2) {
        return i2 == 357149030 || i2 == 524531317 || i2 == 475249515 || i2 == 374648427;
    }

    private final void n(qv2 qv2Var, long j2) {
        byte[] bArrD;
        if ("S_TEXT/UTF8".equals(qv2Var.a)) {
            byte[] bArr = this.n.a;
            long j3 = this.J;
            if (j3 == -9223372036854775807L) {
                bArrD = f8758c;
            } else {
                int i2 = (int) (j3 / 3600000000L);
                long j4 = j3 - (i2 * 3600000000L);
                int i3 = (int) (j4 / 60000000);
                long j5 = j4 - (60000000 * i3);
                bArrD = v03.d(String.format(Locale.US, "%02d:%02d:%02d,%03d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) (j5 / 1000000)), Integer.valueOf((int) ((j5 - (r4 * 1000000)) / 1000))));
            }
            System.arraycopy(bArrD, 0, bArr, 19, 12);
            kv2 kv2Var = qv2Var.O;
            o03 o03Var = this.n;
            kv2Var.c(o03Var, o03Var.e());
            this.Y += this.n.e();
        }
        qv2Var.O.b(j2, this.P, this.Y, 0, qv2Var.f8493g);
        this.Z = true;
        o();
    }

    private final void o() {
        this.Q = 0;
        this.Y = 0;
        this.X = 0;
        this.R = false;
        this.S = false;
        this.U = false;
        this.W = 0;
        this.V = (byte) 0;
        this.T = false;
        this.f8768m.c();
    }

    private final long p(long j2) throws at2 {
        long j3 = this.t;
        if (j3 != -9223372036854775807L) {
            return v03.j(j2, j3, 1000L);
        }
        throw new at2("Can't scale timecode prior to timecodeScale being set.");
    }

    private static int[] q(int[] iArr, int i2) {
        if (iArr == null) {
            return new int[i2];
        }
        int length = iArr.length;
        return length >= i2 ? iArr : new int[Math.max(length + length, i2)];
    }

    private final void r(zu2 zu2Var, int i2) throws InterruptedException, EOFException {
        if (this.f8765j.e() >= i2) {
            return;
        }
        if (this.f8765j.h() < i2) {
            o03 o03Var = this.f8765j;
            byte[] bArr = o03Var.a;
            int length = bArr.length;
            o03Var.b(Arrays.copyOf(bArr, Math.max(length + length, i2)), this.f8765j.e());
        }
        o03 o03Var2 = this.f8765j;
        zu2Var.b(o03Var2.a, o03Var2.e(), i2 - this.f8765j.e(), false);
        this.f8765j.f(i2);
    }

    private final void s(zu2 zu2Var, qv2 qv2Var, int i2) throws at2, InterruptedException, EOFException {
        int i3;
        if ("S_TEXT/UTF8".equals(qv2Var.a)) {
            byte[] bArr = f8757b;
            int length = bArr.length;
            int i4 = i2 + 32;
            if (this.n.h() < i4) {
                this.n.a = Arrays.copyOf(bArr, i4 + i2);
            }
            byte[] bArr2 = this.n.a;
            int length2 = bArr.length;
            zu2Var.b(bArr2, 32, i2, false);
            this.n.i(0);
            this.n.f(i4);
            return;
        }
        kv2 kv2Var = qv2Var.O;
        if (!this.R) {
            if (qv2Var.f8491e) {
                this.P &= -1073741825;
                if (!this.S) {
                    zu2Var.b(this.f8765j.a, 0, 1, false);
                    this.Q++;
                    byte b2 = this.f8765j.a[0];
                    if ((b2 & 128) == 128) {
                        throw new at2("Extension bit is set in signal byte");
                    }
                    this.V = b2;
                    this.S = true;
                }
                byte b3 = this.V;
                if ((b3 & 1) == 1) {
                    int i5 = b3 & 2;
                    this.P |= 1073741824;
                    if (!this.T) {
                        zu2Var.b(this.o.a, 0, 8, false);
                        this.Q += 8;
                        this.T = true;
                        o03 o03Var = this.f8765j;
                        o03Var.a[0] = (byte) ((i5 != 2 ? 0 : 128) | 8);
                        o03Var.i(0);
                        kv2Var.c(this.f8765j, 1);
                        this.Y++;
                        this.o.i(0);
                        kv2Var.c(this.o, 8);
                        this.Y += 8;
                    }
                    if (i5 == 2) {
                        if (!this.U) {
                            zu2Var.b(this.f8765j.a, 0, 1, false);
                            this.Q++;
                            this.f8765j.i(0);
                            this.W = this.f8765j.l();
                            this.U = true;
                        }
                        int i6 = this.W * 4;
                        this.f8765j.a(i6);
                        zu2Var.b(this.f8765j.a, 0, i6, false);
                        this.Q += i6;
                        int i7 = (this.W >> 1) + 1;
                        int i8 = (i7 * 6) + 2;
                        ByteBuffer byteBuffer = this.q;
                        if (byteBuffer == null || byteBuffer.capacity() < i8) {
                            this.q = ByteBuffer.allocate(i8);
                        }
                        this.q.position(0);
                        this.q.putShort((short) i7);
                        int i9 = 0;
                        int i10 = 0;
                        while (true) {
                            i3 = this.W;
                            if (i9 >= i3) {
                                break;
                            }
                            int iU = this.f8765j.u();
                            if (i9 % 2 == 0) {
                                this.q.putShort((short) (iU - i10));
                            } else {
                                this.q.putInt(iU - i10);
                            }
                            i9++;
                            i10 = iU;
                        }
                        int i11 = (i2 - this.Q) - i10;
                        if ((i3 & 1) == 1) {
                            this.q.putInt(i11);
                        } else {
                            this.q.putShort((short) i11);
                            this.q.putInt(0);
                        }
                        this.p.b(this.q.array(), i8);
                        kv2Var.c(this.p, i8);
                        this.Y += i8;
                    }
                }
            } else {
                byte[] bArr3 = qv2Var.f8492f;
                if (bArr3 != null) {
                    this.f8768m.b(bArr3, bArr3.length);
                }
            }
            this.R = true;
        }
        int iE = i2 + this.f8768m.e();
        if (!"V_MPEG4/ISO/AVC".equals(qv2Var.a) && !"V_MPEGH/ISO/HEVC".equals(qv2Var.a)) {
            while (true) {
                int i12 = this.Q;
                if (i12 >= iE) {
                    break;
                } else {
                    t(zu2Var, kv2Var, iE - i12);
                }
            }
        } else {
            byte[] bArr4 = this.f8764i.a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i13 = qv2Var.P;
            int i14 = 4 - i13;
            while (this.Q < iE) {
                int i15 = this.X;
                if (i15 == 0) {
                    int iMin = Math.min(i13, this.f8768m.d());
                    zu2Var.b(bArr4, i14 + iMin, i13 - iMin, false);
                    if (iMin > 0) {
                        this.f8768m.k(bArr4, i14, iMin);
                    }
                    this.Q += i13;
                    this.f8764i.i(0);
                    this.X = this.f8764i.u();
                    this.f8763h.i(0);
                    kv2Var.c(this.f8763h, 4);
                    this.Y += 4;
                } else {
                    this.X = i15 - t(zu2Var, kv2Var, i15);
                }
            }
        }
        if ("A_VORBIS".equals(qv2Var.a)) {
            this.f8766k.i(0);
            kv2Var.c(this.f8766k, 4);
            this.Y += 4;
        }
    }

    private final int t(zu2 zu2Var, kv2 kv2Var, int i2) {
        int iD;
        int iD2 = this.f8768m.d();
        if (iD2 > 0) {
            iD = Math.min(i2, iD2);
            kv2Var.c(this.f8768m, iD);
        } else {
            iD = kv2Var.d(zu2Var, i2, false);
        }
        this.Q += iD;
        this.Y += iD;
        return iD;
    }

    final void a(int i2, long j2, long j3) throws at2 {
        if (i2 == 160) {
            this.a0 = false;
            return;
        }
        if (i2 == 174) {
            this.w = new qv2(null);
            return;
        }
        if (i2 == 187) {
            this.G = false;
            return;
        }
        if (i2 == 19899) {
            this.y = -1;
            this.z = -1L;
            return;
        }
        if (i2 == 20533) {
            this.w.f8491e = true;
            return;
        }
        if (i2 == 21968) {
            this.w.q = true;
            return;
        }
        if (i2 == 408125543) {
            long j4 = this.s;
            if (j4 != -1 && j4 != j2) {
                throw new at2("Multiple Segment elements not supported");
            }
            this.s = j2;
            this.r = j3;
            return;
        }
        if (i2 == 475249515) {
            this.E = new i03(32);
            this.F = new i03(32);
        } else if (i2 == 524531317 && !this.x) {
            if (this.f8762g && this.B != -1) {
                this.A = true;
            } else {
                this.b0.b(new hv2(this.v));
                this.x = true;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.av2
    public final int b(zu2 zu2Var, fv2 fv2Var) {
        this.Z = false;
        while (!this.Z) {
            if (!this.c0.c(zu2Var)) {
                return -1;
            }
            long jH = zu2Var.h();
            if (this.A) {
                this.C = jH;
                fv2Var.a = this.B;
                this.A = false;
                return 1;
            }
            if (this.x) {
                long j2 = this.C;
                if (j2 != -1) {
                    fv2Var.a = j2;
                    this.C = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.av2
    public final boolean c(zu2 zu2Var) {
        return new sv2().a(zu2Var);
    }

    @Override // com.google.android.gms.internal.ads.av2
    public final void d(bv2 bv2Var) {
        this.b0 = bv2Var;
    }

    final void e(int i2) throws at2 {
        iv2 hv2Var;
        i03 i03Var;
        i03 i03Var2;
        int i3;
        int i4 = 0;
        if (i2 == 160) {
            if (this.H != 2) {
                return;
            }
            if (!this.a0) {
                this.P |= 1;
            }
            n(this.f8761f.get(this.N), this.I);
            this.H = 0;
            return;
        }
        if (i2 == 174) {
            String str = this.w.a;
            if ("V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) {
                qv2 qv2Var = this.w;
                qv2Var.a(this.b0, qv2Var.f8488b);
                SparseArray<qv2> sparseArray = this.f8761f;
                qv2 qv2Var2 = this.w;
                sparseArray.put(qv2Var2.f8488b, qv2Var2);
            }
            this.w = null;
            return;
        }
        if (i2 == 19899) {
            int i5 = this.y;
            if (i5 != -1) {
                long j2 = this.z;
                if (j2 != -1) {
                    if (i5 == 475249515) {
                        this.B = j2;
                        return;
                    }
                    return;
                }
            }
            throw new at2("Mandatory element SeekID or SeekPosition not found");
        }
        if (i2 == 25152) {
            qv2 qv2Var3 = this.w;
            if (qv2Var3.f8491e) {
                if (qv2Var3.f8493g == null) {
                    throw new at2("Encrypted Track found but ContentEncKeyID was not found");
                }
                qv2Var3.f8495i = new wu2(new vu2(is2.f6585b, "video/webm", this.w.f8493g.f6861b, false));
                return;
            }
            return;
        }
        if (i2 == 28032) {
            qv2 qv2Var4 = this.w;
            if (qv2Var4.f8491e && qv2Var4.f8492f != null) {
                throw new at2("Combining encryption and compression is not supported");
            }
            return;
        }
        if (i2 == 357149030) {
            if (this.t == -9223372036854775807L) {
                this.t = 1000000L;
            }
            long j3 = this.u;
            if (j3 != -9223372036854775807L) {
                this.v = p(j3);
                return;
            }
            return;
        }
        if (i2 == 374648427) {
            if (this.f8761f.size() == 0) {
                throw new at2("No valid tracks were found");
            }
            this.b0.g();
            return;
        }
        if (i2 == 475249515 && !this.x) {
            bv2 bv2Var = this.b0;
            if (this.s == -1 || this.v == -9223372036854775807L || (i03Var = this.E) == null || i03Var.c() == 0 || (i03Var2 = this.F) == null || i03Var2.c() != this.E.c()) {
                this.E = null;
                this.F = null;
                hv2Var = new hv2(this.v);
            } else {
                int iC = this.E.c();
                int[] iArr = new int[iC];
                long[] jArr = new long[iC];
                long[] jArr2 = new long[iC];
                long[] jArr3 = new long[iC];
                for (int i6 = 0; i6 < iC; i6++) {
                    jArr3[i6] = this.E.b(i6);
                    jArr[i6] = this.s + this.F.b(i6);
                }
                while (true) {
                    i3 = iC - 1;
                    if (i4 >= i3) {
                        break;
                    }
                    int i7 = i4 + 1;
                    iArr[i4] = (int) (jArr[i7] - jArr[i4]);
                    jArr2[i4] = jArr3[i7] - jArr3[i4];
                    i4 = i7;
                }
                iArr[i3] = (int) ((this.s + this.r) - jArr[i3]);
                jArr2[i3] = this.v - jArr3[i3];
                this.E = null;
                this.F = null;
                hv2Var = new yu2(iArr, jArr, jArr2, jArr3);
            }
            bv2Var.b(hv2Var);
            this.x = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.av2
    public final void f(long j2, long j3) {
        this.D = -9223372036854775807L;
        this.H = 0;
        this.c0.a();
        this.f8760e.a();
        o();
    }

    final void g(int i2, long j2) throws at2 {
        if (i2 == 20529) {
            if (j2 == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("ContentEncodingOrder ");
            sb.append(j2);
            sb.append(" not supported");
            throw new at2(sb.toString());
        }
        if (i2 == 20530) {
            if (j2 == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("ContentEncodingScope ");
            sb2.append(j2);
            sb2.append(" not supported");
            throw new at2(sb2.toString());
        }
        switch (i2) {
            case 131:
                this.w.f8489c = (int) j2;
                return;
            case SyslogConstants.LOG_LOCAL1 /* 136 */:
                this.w.L = j2 == 1;
                return;
            case 155:
                this.J = p(j2);
                return;
            case 159:
                this.w.G = (int) j2;
                return;
            case SyslogConstants.LOG_LOCAL6 /* 176 */:
                this.w.f8496j = (int) j2;
                return;
            case 179:
                this.E.a(p(j2));
                return;
            case 186:
                this.w.f8497k = (int) j2;
                return;
            case 215:
                this.w.f8488b = (int) j2;
                return;
            case 231:
                this.D = p(j2);
                return;
            case 241:
                if (this.G) {
                    return;
                }
                this.F.a(j2);
                this.G = true;
                return;
            case 251:
                this.a0 = true;
                return;
            case 16980:
                if (j2 == 3) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(50);
                sb3.append("ContentCompAlgo ");
                sb3.append(j2);
                sb3.append(" not supported");
                throw new at2(sb3.toString());
            case 17029:
                if (j2 < 1 || j2 > 2) {
                    StringBuilder sb4 = new StringBuilder(53);
                    sb4.append("DocTypeReadVersion ");
                    sb4.append(j2);
                    sb4.append(" not supported");
                    throw new at2(sb4.toString());
                }
                return;
            case 17143:
                if (j2 == 1) {
                    return;
                }
                StringBuilder sb5 = new StringBuilder(50);
                sb5.append("EBMLReadVersion ");
                sb5.append(j2);
                sb5.append(" not supported");
                throw new at2(sb5.toString());
            case 18401:
                if (j2 == 5) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(49);
                sb6.append("ContentEncAlgo ");
                sb6.append(j2);
                sb6.append(" not supported");
                throw new at2(sb6.toString());
            case 18408:
                if (j2 == 1) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(56);
                sb7.append("AESSettingsCipherMode ");
                sb7.append(j2);
                sb7.append(" not supported");
                throw new at2(sb7.toString());
            case 21420:
                this.z = j2 + this.s;
                return;
            case 21432:
                int i3 = (int) j2;
                if (i3 == 0) {
                    this.w.p = 0;
                    return;
                }
                if (i3 == 1) {
                    this.w.p = 2;
                    return;
                } else if (i3 == 3) {
                    this.w.p = 1;
                    return;
                } else {
                    if (i3 != 15) {
                        return;
                    }
                    this.w.p = 3;
                    return;
                }
            case 21680:
                this.w.f8498l = (int) j2;
                return;
            case 21682:
                this.w.n = (int) j2;
                return;
            case 21690:
                this.w.f8499m = (int) j2;
                return;
            case 21930:
                this.w.M = j2 == 1;
                return;
            case 22186:
                this.w.J = j2;
                return;
            case 22203:
                this.w.K = j2;
                return;
            case 25188:
                this.w.H = (int) j2;
                return;
            case 2352003:
                this.w.f8490d = (int) j2;
                return;
            case 2807729:
                this.t = j2;
                return;
            default:
                switch (i2) {
                    case 21945:
                        int i4 = (int) j2;
                        if (i4 == 1) {
                            this.w.t = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            this.w.t = 1;
                            return;
                        }
                    case 21946:
                        int i5 = (int) j2;
                        if (i5 != 1) {
                            if (i5 == 16) {
                                this.w.s = 6;
                                return;
                            } else if (i5 == 18) {
                                this.w.s = 7;
                                return;
                            } else if (i5 != 6 && i5 != 7) {
                                return;
                            }
                        }
                        this.w.s = 3;
                        return;
                    case 21947:
                        qv2 qv2Var = this.w;
                        qv2Var.q = true;
                        int i6 = (int) j2;
                        if (i6 == 1) {
                            qv2Var.r = 1;
                            return;
                        }
                        if (i6 == 9) {
                            qv2Var.r = 6;
                            return;
                        } else {
                            if (i6 == 4 || i6 == 5 || i6 == 6 || i6 == 7) {
                                qv2Var.r = 2;
                                return;
                            }
                            return;
                        }
                    case 21948:
                        this.w.u = (int) j2;
                        return;
                    case 21949:
                        this.w.v = (int) j2;
                        return;
                    default:
                        return;
                }
        }
    }

    final void h(int i2, double d2) {
        if (i2 == 181) {
            this.w.I = (int) d2;
            return;
        }
        if (i2 == 17545) {
            this.u = (long) d2;
            return;
        }
        switch (i2) {
            case 21969:
                this.w.w = (float) d2;
                break;
            case 21970:
                this.w.x = (float) d2;
                break;
            case 21971:
                this.w.y = (float) d2;
                break;
            case 21972:
                this.w.z = (float) d2;
                break;
            case 21973:
                this.w.A = (float) d2;
                break;
            case 21974:
                this.w.B = (float) d2;
                break;
            case 21975:
                this.w.C = (float) d2;
                break;
            case 21976:
                this.w.D = (float) d2;
                break;
            case 21977:
                this.w.E = (float) d2;
                break;
            case 21978:
                this.w.F = (float) d2;
                break;
        }
    }

    final void i(int i2, String str) throws at2 {
        if (i2 == 134) {
            this.w.a = str;
            return;
        }
        if (i2 != 17026) {
            if (i2 != 2274716) {
                return;
            }
            this.w.N = str;
        } else {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            StringBuilder sb = new StringBuilder(str.length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw new at2(sb.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ed, code lost:
    
        throw new com.google.android.gms.internal.ads.at2("EBML lacing sample size out of range.");
     */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x023e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void k(int r19, int r20, com.google.android.gms.internal.ads.zu2 r21) throws com.google.android.gms.internal.ads.at2, java.lang.InterruptedException, java.io.EOFException {
        /*
            Method dump skipped, instructions count: 650
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rv2.k(int, int, com.google.android.gms.internal.ads.zu2):void");
    }
}