package com.bumptech.glide.n;

import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.n.a;
import j$.util.Spliterator;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: StandardGifDecoder.java */
/* loaded from: classes.dex */
public class e implements a {
    private static final String a = "e";

    /* renamed from: b, reason: collision with root package name */
    private int[] f4124b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f4125c;

    /* renamed from: d, reason: collision with root package name */
    private final a.InterfaceC0099a f4126d;

    /* renamed from: e, reason: collision with root package name */
    private ByteBuffer f4127e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f4128f;

    /* renamed from: g, reason: collision with root package name */
    private short[] f4129g;

    /* renamed from: h, reason: collision with root package name */
    private byte[] f4130h;

    /* renamed from: i, reason: collision with root package name */
    private byte[] f4131i;

    /* renamed from: j, reason: collision with root package name */
    private byte[] f4132j;

    /* renamed from: k, reason: collision with root package name */
    private int[] f4133k;

    /* renamed from: l, reason: collision with root package name */
    private int f4134l;

    /* renamed from: m, reason: collision with root package name */
    private c f4135m;
    private Bitmap n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private int s;
    private Boolean t;
    private Bitmap.Config u;

    public e(a.InterfaceC0099a interfaceC0099a, c cVar, ByteBuffer byteBuffer, int i2) {
        this(interfaceC0099a);
        r(cVar, byteBuffer, i2);
    }

    private int j(int i2, int i3, int i4) {
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = i2; i10 < this.q + i2; i10++) {
            byte[] bArr = this.f4132j;
            if (i10 >= bArr.length || i10 >= i3) {
                break;
            }
            int i11 = this.f4124b[bArr[i10] & 255];
            if (i11 != 0) {
                i5 += (i11 >> 24) & 255;
                i6 += (i11 >> 16) & 255;
                i7 += (i11 >> 8) & 255;
                i8 += i11 & 255;
                i9++;
            }
        }
        int i12 = i2 + i4;
        for (int i13 = i12; i13 < this.q + i12; i13++) {
            byte[] bArr2 = this.f4132j;
            if (i13 >= bArr2.length || i13 >= i3) {
                break;
            }
            int i14 = this.f4124b[bArr2[i13] & 255];
            if (i14 != 0) {
                i5 += (i14 >> 24) & 255;
                i6 += (i14 >> 16) & 255;
                i7 += (i14 >> 8) & 255;
                i8 += i14 & 255;
                i9++;
            }
        }
        if (i9 == 0) {
            return 0;
        }
        return ((i5 / i9) << 24) | ((i6 / i9) << 16) | ((i7 / i9) << 8) | (i8 / i9);
    }

    private void k(b bVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr = this.f4133k;
        int i7 = bVar.f4101d;
        int i8 = this.q;
        int i9 = i7 / i8;
        int i10 = bVar.f4099b / i8;
        int i11 = bVar.f4100c / i8;
        int i12 = bVar.a / i8;
        boolean z = this.f4134l == 0;
        int i13 = this.s;
        int i14 = this.r;
        byte[] bArr = this.f4132j;
        int[] iArr2 = this.f4124b;
        Boolean bool = this.t;
        int i15 = 8;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1;
        while (i16 < i9) {
            Boolean bool2 = bool;
            if (bVar.f4102e) {
                if (i17 >= i9) {
                    i2 = i9;
                    int i19 = i18 + 1;
                    if (i19 == 2) {
                        i18 = i19;
                        i17 = 4;
                    } else if (i19 == 3) {
                        i18 = i19;
                        i17 = 2;
                        i15 = 4;
                    } else if (i19 != 4) {
                        i18 = i19;
                    } else {
                        i18 = i19;
                        i17 = 1;
                        i15 = 2;
                    }
                } else {
                    i2 = i9;
                }
                i3 = i17 + i15;
            } else {
                i2 = i9;
                i3 = i17;
                i17 = i16;
            }
            int i20 = i17 + i10;
            boolean z2 = i8 == 1;
            if (i20 < i14) {
                int i21 = i20 * i13;
                int i22 = i21 + i12;
                int i23 = i22 + i11;
                int i24 = i21 + i13;
                if (i24 < i23) {
                    i23 = i24;
                }
                i4 = i3;
                int i25 = i16 * i8 * bVar.f4100c;
                if (z2) {
                    int i26 = i22;
                    while (i26 < i23) {
                        int i27 = i10;
                        int i28 = iArr2[bArr[i25] & 255];
                        if (i28 != 0) {
                            iArr[i26] = i28;
                        } else if (z && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i25 += i8;
                        i26++;
                        i10 = i27;
                    }
                } else {
                    i6 = i10;
                    int i29 = ((i23 - i22) * i8) + i25;
                    int i30 = i22;
                    while (true) {
                        i5 = i11;
                        if (i30 < i23) {
                            int iJ = j(i25, i29, bVar.f4100c);
                            if (iJ != 0) {
                                iArr[i30] = iJ;
                            } else if (z && bool2 == null) {
                                bool2 = Boolean.TRUE;
                            }
                            i25 += i8;
                            i30++;
                            i11 = i5;
                        }
                    }
                    bool = bool2;
                    i16++;
                    i10 = i6;
                    i11 = i5;
                    i9 = i2;
                    i17 = i4;
                }
            } else {
                i4 = i3;
            }
            i6 = i10;
            i5 = i11;
            bool = bool2;
            i16++;
            i10 = i6;
            i11 = i5;
            i9 = i2;
            i17 = i4;
        }
        Boolean bool3 = bool;
        if (this.t == null) {
            this.t = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
        }
    }

    private void l(b bVar) {
        b bVar2 = bVar;
        int[] iArr = this.f4133k;
        int i2 = bVar2.f4101d;
        int i3 = bVar2.f4099b;
        int i4 = bVar2.f4100c;
        int i5 = bVar2.a;
        boolean z = this.f4134l == 0;
        int i6 = this.s;
        byte[] bArr = this.f4132j;
        int[] iArr2 = this.f4124b;
        int i7 = 0;
        byte b2 = -1;
        while (i7 < i2) {
            int i8 = (i7 + i3) * i6;
            int i9 = i8 + i5;
            int i10 = i9 + i4;
            int i11 = i8 + i6;
            if (i11 < i10) {
                i10 = i11;
            }
            int i12 = bVar2.f4100c * i7;
            int i13 = i9;
            while (i13 < i10) {
                byte b3 = bArr[i12];
                int i14 = i2;
                int i15 = b3 & 255;
                if (i15 != b2) {
                    int i16 = iArr2[i15];
                    if (i16 != 0) {
                        iArr[i13] = i16;
                    } else {
                        b2 = b3;
                    }
                }
                i12++;
                i13++;
                i2 = i14;
            }
            i7++;
            bVar2 = bVar;
        }
        Boolean bool = this.t;
        this.t = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.t == null && z && b2 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15, types: [short] */
    /* JADX WARN: Type inference failed for: r7v17 */
    private void m(b bVar) {
        int i2;
        int i3;
        short s;
        e eVar = this;
        if (bVar != null) {
            eVar.f4127e.position(bVar.f4107j);
        }
        if (bVar == null) {
            c cVar = eVar.f4135m;
            i2 = cVar.f4113f;
            i3 = cVar.f4114g;
        } else {
            i2 = bVar.f4100c;
            i3 = bVar.f4101d;
        }
        int i4 = i2 * i3;
        byte[] bArr = eVar.f4132j;
        if (bArr == null || bArr.length < i4) {
            eVar.f4132j = eVar.f4126d.e(i4);
        }
        byte[] bArr2 = eVar.f4132j;
        if (eVar.f4129g == null) {
            eVar.f4129g = new short[Spliterator.CONCURRENT];
        }
        short[] sArr = eVar.f4129g;
        if (eVar.f4130h == null) {
            eVar.f4130h = new byte[Spliterator.CONCURRENT];
        }
        byte[] bArr3 = eVar.f4130h;
        if (eVar.f4131i == null) {
            eVar.f4131i = new byte[4097];
        }
        byte[] bArr4 = eVar.f4131i;
        int iQ = q();
        int i5 = 1 << iQ;
        int i6 = i5 + 1;
        int i7 = i5 + 2;
        int i8 = iQ + 1;
        int i9 = (1 << i8) - 1;
        int i10 = 0;
        for (int i11 = 0; i11 < i5; i11++) {
            sArr[i11] = 0;
            bArr3[i11] = (byte) i11;
        }
        byte[] bArr5 = eVar.f4128f;
        int i12 = i8;
        int i13 = i7;
        int i14 = i9;
        int iP = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = -1;
        int i20 = 0;
        int i21 = 0;
        while (true) {
            if (i10 >= i4) {
                break;
            }
            if (iP == 0) {
                iP = p();
                if (iP <= 0) {
                    eVar.p = 3;
                    break;
                }
                i15 = 0;
            }
            i17 += (bArr5[i15] & 255) << i16;
            i15++;
            iP--;
            int i22 = i16 + 8;
            int i23 = i13;
            int i24 = i12;
            int i25 = i19;
            int i26 = i8;
            int i27 = i20;
            while (true) {
                if (i22 < i24) {
                    i19 = i25;
                    i13 = i23;
                    i16 = i22;
                    eVar = this;
                    i20 = i27;
                    i8 = i26;
                    i12 = i24;
                    break;
                }
                int i28 = i7;
                int i29 = i17 & i14;
                i17 >>= i24;
                i22 -= i24;
                if (i29 == i5) {
                    i14 = i9;
                    i24 = i26;
                    i23 = i28;
                    i7 = i23;
                    i25 = -1;
                } else {
                    if (i29 == i6) {
                        i16 = i22;
                        i20 = i27;
                        i13 = i23;
                        i8 = i26;
                        i7 = i28;
                        i19 = i25;
                        i12 = i24;
                        eVar = this;
                        break;
                    }
                    if (i25 == -1) {
                        bArr2[i18] = bArr3[i29];
                        i18++;
                        i10++;
                        i25 = i29;
                        i27 = i25;
                        i7 = i28;
                        i22 = i22;
                    } else {
                        if (i29 >= i23) {
                            bArr4[i21] = (byte) i27;
                            i21++;
                            s = i25;
                        } else {
                            s = i29;
                        }
                        while (s >= i5) {
                            bArr4[i21] = bArr3[s];
                            i21++;
                            s = sArr[s];
                        }
                        i27 = bArr3[s] & 255;
                        byte b2 = (byte) i27;
                        bArr2[i18] = b2;
                        while (true) {
                            i18++;
                            i10++;
                            if (i21 <= 0) {
                                break;
                            }
                            i21--;
                            bArr2[i18] = bArr4[i21];
                        }
                        byte[] bArr6 = bArr4;
                        if (i23 < 4096) {
                            sArr[i23] = (short) i25;
                            bArr3[i23] = b2;
                            i23++;
                            if ((i23 & i14) == 0 && i23 < 4096) {
                                i24++;
                                i14 += i23;
                            }
                        }
                        i25 = i29;
                        i7 = i28;
                        i22 = i22;
                        bArr4 = bArr6;
                    }
                }
            }
        }
        Arrays.fill(bArr2, i18, i4, (byte) 0);
    }

    private Bitmap o() {
        Boolean bool = this.t;
        Bitmap bitmapA = this.f4126d.a(this.s, this.r, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.u);
        bitmapA.setHasAlpha(true);
        return bitmapA;
    }

    private int p() {
        int iQ = q();
        if (iQ <= 0) {
            return iQ;
        }
        ByteBuffer byteBuffer = this.f4127e;
        byteBuffer.get(this.f4128f, 0, Math.min(iQ, byteBuffer.remaining()));
        return iQ;
    }

    private int q() {
        return this.f4127e.get() & 255;
    }

    private Bitmap s(b bVar, b bVar2) {
        int i2;
        int i3;
        Bitmap bitmap;
        int[] iArr = this.f4133k;
        int i4 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.n;
            if (bitmap2 != null) {
                this.f4126d.c(bitmap2);
            }
            this.n = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f4104g == 3 && this.n == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i3 = bVar2.f4104g) > 0) {
            if (i3 == 2) {
                if (!bVar.f4103f) {
                    c cVar = this.f4135m;
                    int i5 = cVar.f4119l;
                    if (bVar.f4108k == null || cVar.f4117j != bVar.f4105h) {
                        i4 = i5;
                    }
                }
                int i6 = bVar2.f4101d;
                int i7 = this.q;
                int i8 = i6 / i7;
                int i9 = bVar2.f4099b / i7;
                int i10 = bVar2.f4100c / i7;
                int i11 = bVar2.a / i7;
                int i12 = this.s;
                int i13 = (i9 * i12) + i11;
                int i14 = (i8 * i12) + i13;
                while (i13 < i14) {
                    int i15 = i13 + i10;
                    for (int i16 = i13; i16 < i15; i16++) {
                        iArr[i16] = i4;
                    }
                    i13 += this.s;
                }
            } else if (i3 == 3 && (bitmap = this.n) != null) {
                int i17 = this.s;
                bitmap.getPixels(iArr, 0, i17, 0, 0, i17, this.r);
            }
        }
        m(bVar);
        if (bVar.f4102e || this.q != 1) {
            k(bVar);
        } else {
            l(bVar);
        }
        if (this.o && ((i2 = bVar.f4104g) == 0 || i2 == 1)) {
            if (this.n == null) {
                this.n = o();
            }
            Bitmap bitmap3 = this.n;
            int i18 = this.s;
            bitmap3.setPixels(iArr, 0, i18, 0, 0, i18, this.r);
        }
        Bitmap bitmapO = o();
        int i19 = this.s;
        bitmapO.setPixels(iArr, 0, i19, 0, 0, i19, this.r);
        return bitmapO;
    }

    @Override // com.bumptech.glide.n.a
    public synchronized Bitmap a() {
        if (this.f4135m.f4110c <= 0 || this.f4134l < 0) {
            String str = a;
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Unable to decode frame, frameCount=" + this.f4135m.f4110c + ", framePointer=" + this.f4134l);
            }
            this.p = 1;
        }
        int i2 = this.p;
        if (i2 != 1 && i2 != 2) {
            this.p = 0;
            if (this.f4128f == null) {
                this.f4128f = this.f4126d.e(255);
            }
            b bVar = this.f4135m.f4112e.get(this.f4134l);
            int i3 = this.f4134l - 1;
            b bVar2 = i3 >= 0 ? this.f4135m.f4112e.get(i3) : null;
            int[] iArr = bVar.f4108k;
            if (iArr == null) {
                iArr = this.f4135m.a;
            }
            this.f4124b = iArr;
            if (iArr == null) {
                String str2 = a;
                if (Log.isLoggable(str2, 3)) {
                    Log.d(str2, "No valid color table found for frame #" + this.f4134l);
                }
                this.p = 1;
                return null;
            }
            if (bVar.f4103f) {
                System.arraycopy(iArr, 0, this.f4125c, 0, iArr.length);
                int[] iArr2 = this.f4125c;
                this.f4124b = iArr2;
                iArr2[bVar.f4105h] = 0;
                if (bVar.f4104g == 2 && this.f4134l == 0) {
                    this.t = Boolean.TRUE;
                }
            }
            return s(bVar, bVar2);
        }
        String str3 = a;
        if (Log.isLoggable(str3, 3)) {
            Log.d(str3, "Unable to decode frame, status=" + this.p);
        }
        return null;
    }

    @Override // com.bumptech.glide.n.a
    public void b() {
        this.f4134l = (this.f4134l + 1) % this.f4135m.f4110c;
    }

    @Override // com.bumptech.glide.n.a
    public int c() {
        return this.f4135m.f4110c;
    }

    @Override // com.bumptech.glide.n.a
    public void clear() {
        this.f4135m = null;
        byte[] bArr = this.f4132j;
        if (bArr != null) {
            this.f4126d.d(bArr);
        }
        int[] iArr = this.f4133k;
        if (iArr != null) {
            this.f4126d.f(iArr);
        }
        Bitmap bitmap = this.n;
        if (bitmap != null) {
            this.f4126d.c(bitmap);
        }
        this.n = null;
        this.f4127e = null;
        this.t = null;
        byte[] bArr2 = this.f4128f;
        if (bArr2 != null) {
            this.f4126d.d(bArr2);
        }
    }

    @Override // com.bumptech.glide.n.a
    public int d() {
        int i2;
        if (this.f4135m.f4110c <= 0 || (i2 = this.f4134l) < 0) {
            return 0;
        }
        return n(i2);
    }

    @Override // com.bumptech.glide.n.a
    public void e(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.u = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    @Override // com.bumptech.glide.n.a
    public ByteBuffer f() {
        return this.f4127e;
    }

    @Override // com.bumptech.glide.n.a
    public void g() {
        this.f4134l = -1;
    }

    @Override // com.bumptech.glide.n.a
    public int h() {
        return this.f4134l;
    }

    @Override // com.bumptech.glide.n.a
    public int i() {
        return this.f4127e.limit() + this.f4132j.length + (this.f4133k.length * 4);
    }

    public int n(int i2) {
        if (i2 >= 0) {
            c cVar = this.f4135m;
            if (i2 < cVar.f4110c) {
                return cVar.f4112e.get(i2).f4106i;
            }
        }
        return -1;
    }

    public synchronized void r(c cVar, ByteBuffer byteBuffer, int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i2);
        }
        int iHighestOneBit = Integer.highestOneBit(i2);
        this.p = 0;
        this.f4135m = cVar;
        this.f4134l = -1;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f4127e = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f4127e.order(ByteOrder.LITTLE_ENDIAN);
        this.o = false;
        Iterator<b> it = cVar.f4112e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().f4104g == 3) {
                this.o = true;
                break;
            }
        }
        this.q = iHighestOneBit;
        int i3 = cVar.f4113f;
        this.s = i3 / iHighestOneBit;
        int i4 = cVar.f4114g;
        this.r = i4 / iHighestOneBit;
        this.f4132j = this.f4126d.e(i3 * i4);
        this.f4133k = this.f4126d.b(this.s * this.r);
    }

    public e(a.InterfaceC0099a interfaceC0099a) {
        this.f4125c = new int[256];
        this.u = Bitmap.Config.ARGB_8888;
        this.f4126d = interfaceC0099a;
        this.f4135m = new c();
    }
}