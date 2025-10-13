package j$.util.stream;

import j$.util.stream.S2;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class H2 extends D2 {

    /* renamed from: c, reason: collision with root package name */
    private S2.c f16136c;

    H2(A2 a2) {
        super(a2);
    }

    @Override // j$.util.stream.A2.f, j$.util.stream.A2, j$.util.function.w
    public void accept(int i2) {
        this.f16136c.accept(i2);
    }

    @Override // j$.util.stream.A2.b, j$.util.stream.A2
    public void m() {
        int[] iArr = (int[]) this.f16136c.g();
        Arrays.sort(iArr);
        this.a.n(iArr.length);
        int i2 = 0;
        if (this.f16127b) {
            int length = iArr.length;
            while (i2 < length) {
                int i3 = iArr[i2];
                if (this.a.o()) {
                    break;
                }
                this.a.accept(i3);
                i2++;
            }
        } else {
            int length2 = iArr.length;
            while (i2 < length2) {
                this.a.accept(iArr[i2]);
                i2++;
            }
        }
        this.a.m();
    }

    @Override // j$.util.stream.A2.b, j$.util.stream.A2
    public void n(long j2) {
        if (j2 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f16136c = j2 > 0 ? new S2.c((int) j2) : new S2.c();
    }
}