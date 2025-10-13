package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class Q2 extends E2 {

    /* renamed from: c, reason: collision with root package name */
    private long[] f16159c;

    /* renamed from: d, reason: collision with root package name */
    private int f16160d;

    Q2(A2 a2) {
        super(a2);
    }

    @Override // j$.util.stream.A2.g, j$.util.stream.A2
    public void accept(long j2) {
        long[] jArr = this.f16159c;
        int i2 = this.f16160d;
        this.f16160d = i2 + 1;
        jArr[i2] = j2;
    }

    @Override // j$.util.stream.A2.c, j$.util.stream.A2
    public void m() {
        int i2 = 0;
        Arrays.sort(this.f16159c, 0, this.f16160d);
        this.a.n(this.f16160d);
        if (this.f16130b) {
            while (i2 < this.f16160d && !this.a.o()) {
                this.a.accept(this.f16159c[i2]);
                i2++;
            }
        } else {
            while (i2 < this.f16160d) {
                this.a.accept(this.f16159c[i2]);
                i2++;
            }
        }
        this.a.m();
        this.f16159c = null;
    }

    @Override // j$.util.stream.A2.c, j$.util.stream.A2
    public void n(long j2) {
        if (j2 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f16159c = new long[(int) j2];
    }
}