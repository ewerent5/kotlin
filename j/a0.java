package j;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: SegmentedByteString.kt */
/* loaded from: classes3.dex */
public final class a0 extends i {

    /* renamed from: j, reason: collision with root package name */
    private final transient byte[][] f16447j;

    /* renamed from: k, reason: collision with root package name */
    private final transient int[] f16448k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(byte[][] bArr, int[] iArr) {
        super(i.f16463e.e());
        i.y.d.l.d(bArr, "segments");
        i.y.d.l.d(iArr, "directory");
        this.f16447j = bArr;
        this.f16448k = iArr;
    }

    private final i C() {
        return new i(B());
    }

    public final byte[][] A() {
        return this.f16447j;
    }

    public byte[] B() {
        byte[] bArr = new byte[u()];
        int length = A().length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int i5 = z()[length + i2];
            int i6 = z()[i2];
            int i7 = i6 - i3;
            i.t.g.c(A()[i2], bArr, i4, i5, i5 + i7);
            i4 += i7;
            i2++;
            i3 = i6;
        }
        return bArr;
    }

    @Override // j.i
    public String a() {
        return C().a();
    }

    @Override // j.i
    public i c(String str) throws NoSuchAlgorithmException {
        i.y.d.l.d(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = A().length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = z()[length + i2];
            int i5 = z()[i2];
            messageDigest.update(A()[i2], i4, i5 - i3);
            i2++;
            i3 = i5;
        }
        byte[] bArrDigest = messageDigest.digest();
        i.y.d.l.c(bArrDigest, "digest.digest()");
        return new i(bArrDigest);
    }

    @Override // j.i
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.u() == u() && o(0, iVar, 0, u())) {
                return true;
            }
        }
        return false;
    }

    @Override // j.i
    public int h() {
        return z()[A().length - 1];
    }

    @Override // j.i
    public int hashCode() {
        int iF = f();
        if (iF != 0) {
            return iF;
        }
        int length = A().length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int i5 = z()[length + i2];
            int i6 = z()[i2];
            byte[] bArr = A()[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        q(i3);
        return i3;
    }

    @Override // j.i
    public String k() {
        return C().k();
    }

    @Override // j.i
    public byte[] l() {
        return B();
    }

    @Override // j.i
    public byte m(int i2) {
        c.b(z()[A().length - 1], i2, 1L);
        int iB = j.f0.c.b(this, i2);
        return A()[iB][(i2 - (iB == 0 ? 0 : z()[iB - 1])) + z()[A().length + iB]];
    }

    @Override // j.i
    public boolean o(int i2, i iVar, int i3, int i4) {
        i.y.d.l.d(iVar, "other");
        if (i2 < 0 || i2 > u() - i4) {
            return false;
        }
        int i5 = i4 + i2;
        int iB = j.f0.c.b(this, i2);
        while (i2 < i5) {
            int i6 = iB == 0 ? 0 : z()[iB - 1];
            int i7 = z()[iB] - i6;
            int i8 = z()[A().length + iB];
            int iMin = Math.min(i5, i7 + i6) - i2;
            if (!iVar.p(i3, A()[iB], i8 + (i2 - i6), iMin)) {
                return false;
            }
            i3 += iMin;
            i2 += iMin;
            iB++;
        }
        return true;
    }

    @Override // j.i
    public boolean p(int i2, byte[] bArr, int i3, int i4) {
        i.y.d.l.d(bArr, "other");
        if (i2 < 0 || i2 > u() - i4 || i3 < 0 || i3 > bArr.length - i4) {
            return false;
        }
        int i5 = i4 + i2;
        int iB = j.f0.c.b(this, i2);
        while (i2 < i5) {
            int i6 = iB == 0 ? 0 : z()[iB - 1];
            int i7 = z()[iB] - i6;
            int i8 = z()[A().length + iB];
            int iMin = Math.min(i5, i7 + i6) - i2;
            if (!c.a(A()[iB], i8 + (i2 - i6), bArr, i3, iMin)) {
                return false;
            }
            i3 += iMin;
            i2 += iMin;
            iB++;
        }
        return true;
    }

    @Override // j.i
    public String toString() {
        return C().toString();
    }

    @Override // j.i
    public i w() {
        return C().w();
    }

    @Override // j.i
    public void y(f fVar, int i2, int i3) {
        i.y.d.l.d(fVar, "buffer");
        int i4 = i3 + i2;
        int iB = j.f0.c.b(this, i2);
        while (i2 < i4) {
            int i5 = iB == 0 ? 0 : z()[iB - 1];
            int i6 = z()[iB] - i5;
            int i7 = z()[A().length + iB];
            int iMin = Math.min(i4, i6 + i5) - i2;
            int i8 = i7 + (i2 - i5);
            y yVar = new y(A()[iB], i8, i8 + iMin, true, false);
            y yVar2 = fVar.f16453e;
            if (yVar2 == null) {
                yVar.f16506h = yVar;
                yVar.f16505g = yVar;
                fVar.f16453e = yVar;
            } else {
                i.y.d.l.b(yVar2);
                y yVar3 = yVar2.f16506h;
                i.y.d.l.b(yVar3);
                yVar3.c(yVar);
            }
            i2 += iMin;
            iB++;
        }
        fVar.v0(fVar.y0() + u());
    }

    public final int[] z() {
        return this.f16448k;
    }
}