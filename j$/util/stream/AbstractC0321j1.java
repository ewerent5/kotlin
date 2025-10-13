package j$.util.stream;

/* renamed from: j$.util.stream.j1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0321j1 {
    protected final int a;

    /* renamed from: b, reason: collision with root package name */
    protected int f16310b;

    /* renamed from: c, reason: collision with root package name */
    protected int f16311c;

    /* renamed from: d, reason: collision with root package name */
    protected long[] f16312d;

    protected AbstractC0321j1() {
        this.a = 4;
    }

    protected AbstractC0321j1(int i2) {
        if (i2 >= 0) {
            this.a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i2 - 1));
            return;
        }
        throw new IllegalArgumentException("Illegal Capacity: " + i2);
    }

    public abstract void clear();

    public long count() {
        int i2 = this.f16311c;
        return i2 == 0 ? this.f16310b : this.f16312d[i2] + this.f16310b;
    }

    protected int s(int i2) {
        return 1 << ((i2 == 0 || i2 == 1) ? this.a : Math.min((this.a + i2) - 1, 30));
    }
}