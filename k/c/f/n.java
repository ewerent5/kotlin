package k.c.f;

/* compiled from: MapTileList.java */
/* loaded from: classes3.dex */
public class n implements l {

    /* renamed from: e, reason: collision with root package name */
    private long[] f16761e;

    /* renamed from: f, reason: collision with root package name */
    private int f16762f;

    public void a() {
        this.f16762f = 0;
    }

    public void b(int i2) {
        if (i2 == 0) {
            return;
        }
        long[] jArr = this.f16761e;
        if (jArr == null || jArr.length < i2) {
            synchronized (this) {
                long[] jArr2 = new long[i2];
                long[] jArr3 = this.f16761e;
                if (jArr3 != null) {
                    System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
                }
                this.f16761e = jArr2;
            }
        }
    }

    public long c(int i2) {
        return this.f16761e[i2];
    }

    public int d() {
        return this.f16762f;
    }

    @Override // k.c.f.l
    public boolean e(long j2) {
        if (this.f16761e == null) {
            return false;
        }
        for (int i2 = 0; i2 < this.f16762f; i2++) {
            if (this.f16761e[i2] == j2) {
                return true;
            }
        }
        return false;
    }

    public void f(long j2) {
        b(this.f16762f + 1);
        long[] jArr = this.f16761e;
        int i2 = this.f16762f;
        this.f16762f = i2 + 1;
        jArr[i2] = j2;
    }
}