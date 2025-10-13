package j$.util.stream;

import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class R2<T> extends F2<T> {

    /* renamed from: d, reason: collision with root package name */
    private Object[] f16161d;

    /* renamed from: e, reason: collision with root package name */
    private int f16162e;

    R2(A2 a2, Comparator comparator) {
        super(a2, comparator);
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        Object[] objArr = this.f16161d;
        int i2 = this.f16162e;
        this.f16162e = i2 + 1;
        objArr[i2] = obj;
    }

    @Override // j$.util.stream.A2.d, j$.util.stream.A2
    public void m() {
        int i2 = 0;
        Arrays.sort(this.f16161d, 0, this.f16162e, this.f16133b);
        this.a.n(this.f16162e);
        if (this.f16134c) {
            while (i2 < this.f16162e && !this.a.o()) {
                this.a.accept(this.f16161d[i2]);
                i2++;
            }
        } else {
            while (i2 < this.f16162e) {
                this.a.accept(this.f16161d[i2]);
                i2++;
            }
        }
        this.a.m();
        this.f16161d = null;
    }

    @Override // j$.util.stream.A2.d, j$.util.stream.A2
    public void n(long j2) {
        if (j2 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f16161d = new Object[(int) j2];
    }
}