package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class p9 implements z8 {
    private final b9 a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14773b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f14774c;

    /* renamed from: d, reason: collision with root package name */
    private final int f14775d;

    p9(b9 b9Var, String str, Object[] objArr) {
        this.a = b9Var;
        this.f14773b = str;
        this.f14774c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f14775d = cCharAt;
            return;
        }
        int i2 = cCharAt & 8191;
        int i3 = 13;
        int i4 = 1;
        while (true) {
            int i5 = i4 + 1;
            char cCharAt2 = str.charAt(i4);
            if (cCharAt2 < 55296) {
                this.f14775d = i2 | (cCharAt2 << i3);
                return;
            } else {
                i2 |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i4 = i5;
            }
        }
    }

    final String a() {
        return this.f14773b;
    }

    final Object[] b() {
        return this.f14774c;
    }

    @Override // e.c.b.b.c.e.z8
    public final int zza() {
        return (this.f14775d & 1) == 1 ? l9.a : l9.f14691b;
    }

    @Override // e.c.b.b.c.e.z8
    public final boolean zzb() {
        return (this.f14775d & 2) == 2;
    }

    @Override // e.c.b.b.c.e.z8
    public final b9 zzc() {
        return this.a;
    }
}