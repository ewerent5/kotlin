package j$.util;

import j$.util.function.C;
import j$.util.function.C0279g;
import j$.util.function.C0280h;
import java.util.Objects;

/* loaded from: classes2.dex */
public class n implements C, j$.util.function.w {
    private long count;
    private long sum;
    private long min = Long.MAX_VALUE;
    private long max = Long.MIN_VALUE;

    @Override // j$.util.function.w
    public void accept(int i2) {
        accept(i2);
    }

    @Override // j$.util.function.C
    public void accept(long j2) {
        this.count++;
        this.sum += j2;
        this.min = Math.min(this.min, j2);
        this.max = Math.max(this.max, j2);
    }

    public void b(n nVar) {
        this.count += nVar.count;
        this.sum += nVar.sum;
        this.min = Math.min(this.min, nVar.min);
        this.max = Math.max(this.max, nVar.max);
    }

    @Override // j$.util.function.C
    public C f(C c2) {
        Objects.requireNonNull(c2);
        return new C0280h(this, c2);
    }

    @Override // j$.util.function.w
    public j$.util.function.w l(j$.util.function.w wVar) {
        Objects.requireNonNull(wVar);
        return new C0279g(this, wVar);
    }

    public String toString() {
        Object[] objArr = new Object[6];
        objArr[0] = n.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        objArr[2] = Long.valueOf(this.sum);
        objArr[3] = Long.valueOf(this.min);
        long j2 = this.count;
        objArr[4] = Double.valueOf(j2 > 0 ? this.sum / j2 : 0.0d);
        objArr[5] = Long.valueOf(this.max);
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", objArr);
    }
}