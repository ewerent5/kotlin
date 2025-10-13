package j$.util.stream;

import j$.util.stream.S2;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class G2 extends C2 {

    /* renamed from: c, reason: collision with root package name */
    private S2.b f16135c;

    G2(A2 a2) {
        super(a2);
    }

    @Override // j$.util.stream.A2.e, j$.util.stream.A2
    public void accept(double d2) {
        this.f16135c.accept(d2);
    }

    @Override // j$.util.stream.A2.a, j$.util.stream.A2
    public void m() {
        double[] dArr = (double[]) this.f16135c.g();
        Arrays.sort(dArr);
        this.a.n(dArr.length);
        int i2 = 0;
        if (this.f16116b) {
            int length = dArr.length;
            while (i2 < length) {
                double d2 = dArr[i2];
                if (this.a.o()) {
                    break;
                }
                this.a.accept(d2);
                i2++;
            }
        } else {
            int length2 = dArr.length;
            while (i2 < length2) {
                this.a.accept(dArr[i2]);
                i2++;
            }
        }
        this.a.m();
    }

    @Override // j$.util.stream.A2.a, j$.util.stream.A2
    public void n(long j2) {
        if (j2 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f16135c = j2 > 0 ? new S2.b((int) j2) : new S2.b();
    }
}