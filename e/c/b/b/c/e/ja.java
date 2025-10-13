package e.c.b.b.c.e;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
public final class ja {
    private static final ja a = new ja(0, new int[0], new Object[0], false);

    /* renamed from: b, reason: collision with root package name */
    private int f14643b;

    /* renamed from: c, reason: collision with root package name */
    private int[] f14644c;

    /* renamed from: d, reason: collision with root package name */
    private Object[] f14645d;

    /* renamed from: e, reason: collision with root package name */
    private int f14646e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14647f;

    private ja() {
        this(0, new int[8], new Object[8], true);
    }

    public static ja a() {
        return a;
    }

    static ja b(ja jaVar, ja jaVar2) {
        int i2 = jaVar.f14643b + jaVar2.f14643b;
        int[] iArrCopyOf = Arrays.copyOf(jaVar.f14644c, i2);
        System.arraycopy(jaVar2.f14644c, 0, iArrCopyOf, jaVar.f14643b, jaVar2.f14643b);
        Object[] objArrCopyOf = Arrays.copyOf(jaVar.f14645d, i2);
        System.arraycopy(jaVar2.f14645d, 0, objArrCopyOf, jaVar.f14643b, jaVar2.f14643b);
        return new ja(i2, iArrCopyOf, objArrCopyOf, true);
    }

    private static void d(int i2, Object obj, eb ebVar) {
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            ebVar.zza(i3, ((Long) obj).longValue());
            return;
        }
        if (i4 == 1) {
            ebVar.G(i3, ((Long) obj).longValue());
            return;
        }
        if (i4 == 2) {
            ebVar.p(i3, (g6) obj);
            return;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new RuntimeException(a8.d());
            }
            ebVar.F(i3, ((Integer) obj).intValue());
        } else if (ebVar.zza() == hb.a) {
            ebVar.b(i3);
            ((ja) obj).h(ebVar);
            ebVar.zzb(i3);
        } else {
            ebVar.zzb(i3);
            ((ja) obj).h(ebVar);
            ebVar.b(i3);
        }
    }

    static ja g() {
        return new ja();
    }

    final void c(int i2, Object obj) {
        if (!this.f14647f) {
            throw new UnsupportedOperationException();
        }
        int i3 = this.f14643b;
        int[] iArr = this.f14644c;
        if (i3 == iArr.length) {
            int i4 = i3 + (i3 < 4 ? 8 : i3 >> 1);
            this.f14644c = Arrays.copyOf(iArr, i4);
            this.f14645d = Arrays.copyOf(this.f14645d, i4);
        }
        int[] iArr2 = this.f14644c;
        int i5 = this.f14643b;
        iArr2[i5] = i2;
        this.f14645d[i5] = obj;
        this.f14643b = i5 + 1;
    }

    final void e(eb ebVar) {
        if (ebVar.zza() == hb.f14592b) {
            for (int i2 = this.f14643b - 1; i2 >= 0; i2--) {
                ebVar.l(this.f14644c[i2] >>> 3, this.f14645d[i2]);
            }
            return;
        }
        for (int i3 = 0; i3 < this.f14643b; i3++) {
            ebVar.l(this.f14644c[i3] >>> 3, this.f14645d[i3]);
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ja)) {
            return false;
        }
        ja jaVar = (ja) obj;
        int i2 = this.f14643b;
        if (i2 == jaVar.f14643b) {
            int[] iArr = this.f14644c;
            int[] iArr2 = jaVar.f14644c;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    z = true;
                    break;
                }
                if (iArr[i3] != iArr2[i3]) {
                    z = false;
                    break;
                }
                i3++;
            }
            if (z) {
                Object[] objArr = this.f14645d;
                Object[] objArr2 = jaVar.f14645d;
                int i4 = this.f14643b;
                int i5 = 0;
                while (true) {
                    if (i5 >= i4) {
                        z2 = true;
                        break;
                    }
                    if (!objArr[i5].equals(objArr2[i5])) {
                        z2 = false;
                        break;
                    }
                    i5++;
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    final void f(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.f14643b; i3++) {
            c9.d(sb, i2, String.valueOf(this.f14644c[i3] >>> 3), this.f14645d[i3]);
        }
    }

    public final void h(eb ebVar) {
        if (this.f14643b == 0) {
            return;
        }
        if (ebVar.zza() == hb.a) {
            for (int i2 = 0; i2 < this.f14643b; i2++) {
                d(this.f14644c[i2], this.f14645d[i2], ebVar);
            }
            return;
        }
        for (int i3 = this.f14643b - 1; i3 >= 0; i3--) {
            d(this.f14644c[i3], this.f14645d[i3], ebVar);
        }
    }

    public final int hashCode() {
        int i2 = this.f14643b;
        int i3 = (i2 + 527) * 31;
        int[] iArr = this.f14644c;
        int iHashCode = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i3 + i4) * 31;
        Object[] objArr = this.f14645d;
        int i7 = this.f14643b;
        for (int i8 = 0; i8 < i7; i8++) {
            iHashCode = (iHashCode * 31) + objArr[i8].hashCode();
        }
        return i6 + iHashCode;
    }

    public final void i() {
        this.f14647f = false;
    }

    public final int j() {
        int i2 = this.f14646e;
        if (i2 != -1) {
            return i2;
        }
        int iC0 = 0;
        for (int i3 = 0; i3 < this.f14643b; i3++) {
            iC0 += y6.c0(this.f14644c[i3] >>> 3, (g6) this.f14645d[i3]);
        }
        this.f14646e = iC0;
        return iC0;
    }

    public final int k() {
        int iH0;
        int i2 = this.f14646e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f14643b; i4++) {
            int i5 = this.f14644c[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                iH0 = y6.h0(i6, ((Long) this.f14645d[i4]).longValue());
            } else if (i7 == 1) {
                iH0 = y6.q0(i6, ((Long) this.f14645d[i4]).longValue());
            } else if (i7 == 2) {
                iH0 = y6.T(i6, (g6) this.f14645d[i4]);
            } else if (i7 == 3) {
                iH0 = (y6.g0(i6) << 1) + ((ja) this.f14645d[i4]).k();
            } else {
                if (i7 != 5) {
                    throw new IllegalStateException(a8.d());
                }
                iH0 = y6.x0(i6, ((Integer) this.f14645d[i4]).intValue());
            }
            i3 += iH0;
        }
        this.f14646e = i3;
        return i3;
    }

    private ja(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.f14646e = -1;
        this.f14643b = i2;
        this.f14644c = iArr;
        this.f14645d = objArr;
        this.f14647f = z;
    }
}