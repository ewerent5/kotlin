package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class v6 extends t6 {

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f14888d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f14889e;

    /* renamed from: f, reason: collision with root package name */
    private int f14890f;

    /* renamed from: g, reason: collision with root package name */
    private int f14891g;

    /* renamed from: h, reason: collision with root package name */
    private int f14892h;

    /* renamed from: i, reason: collision with root package name */
    private int f14893i;

    /* renamed from: j, reason: collision with root package name */
    private int f14894j;

    private v6(byte[] bArr, int i2, int i3, boolean z) {
        super();
        this.f14894j = Integer.MAX_VALUE;
        this.f14888d = bArr;
        this.f14890f = i3 + i2;
        this.f14892h = i2;
        this.f14893i = i2;
        this.f14889e = z;
    }

    private final void f() {
        int i2 = this.f14890f + this.f14891g;
        this.f14890f = i2;
        int i3 = i2 - this.f14893i;
        int i4 = this.f14894j;
        if (i3 <= i4) {
            this.f14891g = 0;
            return;
        }
        int i5 = i3 - i4;
        this.f14891g = i5;
        this.f14890f = i2 - i5;
    }

    @Override // e.c.b.b.c.e.t6
    public final int c(int i2) throws a8 {
        if (i2 < 0) {
            throw a8.b();
        }
        int iE = i2 + e();
        int i3 = this.f14894j;
        if (iE > i3) {
            throw a8.a();
        }
        this.f14894j = iE;
        f();
        return i3;
    }

    @Override // e.c.b.b.c.e.t6
    public final int e() {
        return this.f14892h - this.f14893i;
    }
}