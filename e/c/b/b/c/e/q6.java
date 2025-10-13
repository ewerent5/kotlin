package e.c.b.b.c.e;

import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
class q6 extends s6 {

    /* renamed from: i, reason: collision with root package name */
    protected final byte[] f14782i;

    q6(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f14782i = bArr;
    }

    @Override // e.c.b.b.c.e.g6
    public byte a(int i2) {
        return this.f14782i[i2];
    }

    @Override // e.c.b.b.c.e.g6
    public int c() {
        return this.f14782i.length;
    }

    @Override // e.c.b.b.c.e.g6
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g6) || c() != ((g6) obj).c()) {
            return false;
        }
        if (c() == 0) {
            return true;
        }
        if (!(obj instanceof q6)) {
            return obj.equals(this);
        }
        q6 q6Var = (q6) obj;
        int iX = x();
        int iX2 = q6Var.x();
        if (iX == 0 || iX2 == 0 || iX == iX2) {
            return y(q6Var, 0, c());
        }
        return false;
    }

    @Override // e.c.b.b.c.e.g6
    protected final int f(int i2, int i3, int i4) {
        return r7.a(i2, this.f14782i, z(), i4);
    }

    @Override // e.c.b.b.c.e.g6
    public final g6 h(int i2, int i3) {
        int iR = g6.r(0, i3, c());
        return iR == 0 ? g6.f14544e : new n6(this.f14782i, z(), iR);
    }

    @Override // e.c.b.b.c.e.g6
    protected final String m(Charset charset) {
        return new String(this.f14782i, z(), c(), charset);
    }

    @Override // e.c.b.b.c.e.g6
    final void n(h6 h6Var) {
        h6Var.a(this.f14782i, z(), c());
    }

    @Override // e.c.b.b.c.e.g6
    byte o(int i2) {
        return this.f14782i[i2];
    }

    @Override // e.c.b.b.c.e.g6
    public final boolean w() {
        int iZ = z();
        return ta.g(this.f14782i, iZ, c() + iZ);
    }

    @Override // e.c.b.b.c.e.s6
    final boolean y(g6 g6Var, int i2, int i3) {
        if (i3 > g6Var.c()) {
            int iC = c();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i3);
            sb.append(iC);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i3 > g6Var.c()) {
            int iC2 = g6Var.c();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i3);
            sb2.append(", ");
            sb2.append(iC2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!(g6Var instanceof q6)) {
            return g6Var.h(0, i3).equals(h(0, i3));
        }
        q6 q6Var = (q6) g6Var;
        byte[] bArr = this.f14782i;
        byte[] bArr2 = q6Var.f14782i;
        int iZ = z() + i3;
        int iZ2 = z();
        int iZ3 = q6Var.z();
        while (iZ2 < iZ) {
            if (bArr[iZ2] != bArr2[iZ3]) {
                return false;
            }
            iZ2++;
            iZ3++;
        }
        return true;
    }

    protected int z() {
        return 0;
    }
}