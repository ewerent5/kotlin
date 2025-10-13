package k.c.f;

/* compiled from: Delay.java */
/* loaded from: classes3.dex */
public class b {
    private final long[] a;

    /* renamed from: b, reason: collision with root package name */
    private long f16723b;

    /* renamed from: c, reason: collision with root package name */
    private long f16724c;

    /* renamed from: d, reason: collision with root package name */
    private int f16725d;

    public b(long[] jArr) {
        if (jArr == null || jArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.a = jArr;
        a();
    }

    private long b() {
        return System.nanoTime() / 1000000;
    }

    public long a() {
        long j2;
        long[] jArr = this.a;
        if (jArr == null) {
            j2 = this.f16723b;
        } else {
            int i2 = this.f16725d;
            long j3 = jArr[i2];
            if (i2 < jArr.length - 1) {
                this.f16725d = i2 + 1;
            }
            j2 = j3;
        }
        this.f16724c = b() + j2;
        return j2;
    }

    public boolean c() {
        return b() < this.f16724c;
    }
}