package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
public abstract class t6 {
    int a;

    /* renamed from: b, reason: collision with root package name */
    private int f14857b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14858c;

    private t6() {
        this.a = 100;
        this.f14857b = Integer.MAX_VALUE;
        this.f14858c = false;
    }

    public static long a(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    static t6 b(byte[] bArr, int i2, int i3, boolean z) {
        v6 v6Var = new v6(bArr, i3);
        try {
            v6Var.c(i3);
            return v6Var;
        } catch (a8 e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static int d(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    public abstract int c(int i2);

    public abstract int e();
}