package g.a.a.a;

/* compiled from: RowHandler.java */
/* loaded from: classes3.dex */
final class g {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private String[] f15730b;

    /* renamed from: c, reason: collision with root package name */
    private int f15731c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f15733e;

    /* renamed from: d, reason: collision with root package name */
    private int f15732d = 1;

    /* renamed from: f, reason: collision with root package name */
    private long f15734f = 1;

    g(int i2) {
        this.a = i2;
        this.f15730b = new String[i2];
    }

    private d b() {
        if (this.f15731c <= 1 && this.f15730b[0].isEmpty()) {
            return new d(this.f15734f, this.f15733e);
        }
        int i2 = this.f15731c;
        String[] strArr = new String[i2];
        System.arraycopy(this.f15730b, 0, strArr, 0, i2);
        return new d(this.f15734f, strArr, this.f15733e);
    }

    private void e() {
        int i2 = this.a * 2;
        this.a = i2;
        String[] strArr = new String[i2];
        System.arraycopy(this.f15730b, 0, strArr, 0, this.f15731c);
        this.f15730b = strArr;
    }

    void a(String str) {
        if (this.f15731c == this.a) {
            e();
        }
        String[] strArr = this.f15730b;
        int i2 = this.f15731c;
        this.f15731c = i2 + 1;
        strArr[i2] = str;
    }

    d c() {
        d dVarB = this.f15731c > 0 ? b() : null;
        this.f15731c = 0;
        this.f15734f += this.f15732d;
        this.f15732d = 1;
        this.f15733e = false;
        return dVarB;
    }

    public void d() {
        this.f15733e = true;
    }

    public void f() {
        this.f15732d++;
    }

    public boolean g() {
        return this.f15733e;
    }
}