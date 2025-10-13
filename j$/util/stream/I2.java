package j$.util.stream;

import j$.util.stream.S2;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class I2 extends E2 {

    /* renamed from: c, reason: collision with root package name */
    private S2.d f16139c;

    I2(A2 a2) {
        super(a2);
    }

    @Override // j$.util.stream.A2.g, j$.util.stream.A2
    public void accept(long j2) {
        this.f16139c.accept(j2);
    }

    @Override // j$.util.stream.A2.c, j$.util.stream.A2
    public void m() {
        long[] jArr = (long[]) this.f16139c.g();
        Arrays.sort(jArr);
        this.a.n(jArr.length);
        int i2 = 0;
        if (this.f16130b) {
            int length = jArr.length;
            while (i2 < length) {
                long j2 = jArr[i2];
                if (this.a.o()) {
                    break;
                }
                this.a.accept(j2);
                i2++;
            }
        } else {
            int length2 = jArr.length;
            while (i2 < length2) {
                this.a.accept(jArr[i2]);
                i2++;
            }
        }
        this.a.m();
    }

    @Override // j$.util.stream.A2.c, j$.util.stream.A2
    public void n(long j2) {
        if (j2 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f16139c = j2 > 0 ? new S2.d((int) j2) : new S2.d();
    }
}