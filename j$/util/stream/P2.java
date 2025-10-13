package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class P2 extends D2 {

    /* renamed from: c, reason: collision with root package name */
    private int[] f16157c;

    /* renamed from: d, reason: collision with root package name */
    private int f16158d;

    P2(A2 a2) {
        super(a2);
    }

    @Override // j$.util.stream.A2.f, j$.util.stream.A2, j$.util.function.w
    public void accept(int i2) {
        int[] iArr = this.f16157c;
        int i3 = this.f16158d;
        this.f16158d = i3 + 1;
        iArr[i3] = i2;
    }

    @Override // j$.util.stream.A2.b, j$.util.stream.A2
    public void m() {
        int i2 = 0;
        Arrays.sort(this.f16157c, 0, this.f16158d);
        this.a.n(this.f16158d);
        if (this.f16127b) {
            while (i2 < this.f16158d && !this.a.o()) {
                this.a.accept(this.f16157c[i2]);
                i2++;
            }
        } else {
            while (i2 < this.f16158d) {
                this.a.accept(this.f16157c[i2]);
                i2++;
            }
        }
        this.a.m();
        this.f16157c = null;
    }

    @Override // j$.util.stream.A2.b, j$.util.stream.A2
    public void n(long j2) {
        if (j2 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f16157c = new int[(int) j2];
    }
}