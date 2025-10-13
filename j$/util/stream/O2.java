package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class O2 extends C2 {

    /* renamed from: c, reason: collision with root package name */
    private double[] f16154c;

    /* renamed from: d, reason: collision with root package name */
    private int f16155d;

    O2(A2 a2) {
        super(a2);
    }

    @Override // j$.util.stream.A2.e, j$.util.stream.A2
    public void accept(double d2) {
        double[] dArr = this.f16154c;
        int i2 = this.f16155d;
        this.f16155d = i2 + 1;
        dArr[i2] = d2;
    }

    @Override // j$.util.stream.A2.a, j$.util.stream.A2
    public void m() {
        int i2 = 0;
        Arrays.sort(this.f16154c, 0, this.f16155d);
        this.a.n(this.f16155d);
        if (this.f16116b) {
            while (i2 < this.f16155d && !this.a.o()) {
                this.a.accept(this.f16154c[i2]);
                i2++;
            }
        } else {
            while (i2 < this.f16155d) {
                this.a.accept(this.f16154c[i2]);
                i2++;
            }
        }
        this.a.m();
        this.f16154c = null;
    }

    @Override // j$.util.stream.A2.a, j$.util.stream.A2
    public void n(long j2) {
        if (j2 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f16154c = new double[(int) j2];
    }
}