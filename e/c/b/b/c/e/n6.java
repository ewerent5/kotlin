package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class n6 extends q6 {

    /* renamed from: j, reason: collision with root package name */
    private final int f14723j;

    /* renamed from: k, reason: collision with root package name */
    private final int f14724k;

    n6(byte[] bArr, int i2, int i3) {
        super(bArr);
        g6.r(i2, i2 + i3, bArr.length);
        this.f14723j = i2;
        this.f14724k = i3;
    }

    @Override // e.c.b.b.c.e.q6, e.c.b.b.c.e.g6
    public final byte a(int i2) {
        int iC = c();
        if (((iC - (i2 + 1)) | i2) >= 0) {
            return this.f14782i[this.f14723j + i2];
        }
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i2);
        sb2.append(", ");
        sb2.append(iC);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // e.c.b.b.c.e.q6, e.c.b.b.c.e.g6
    public final int c() {
        return this.f14724k;
    }

    @Override // e.c.b.b.c.e.q6, e.c.b.b.c.e.g6
    final byte o(int i2) {
        return this.f14782i[this.f14723j + i2];
    }

    @Override // e.c.b.b.c.e.q6
    protected final int z() {
        return this.f14723j;
    }
}