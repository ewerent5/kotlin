package kotlinx.coroutines.internal;

/* compiled from: ThreadContext.kt */
/* loaded from: classes3.dex */
final class g0 {
    private Object[] a;

    /* renamed from: b, reason: collision with root package name */
    private int f16979b;

    /* renamed from: c, reason: collision with root package name */
    private final i.v.g f16980c;

    public g0(i.v.g gVar, int i2) {
        this.f16980c = gVar;
        this.a = new Object[i2];
    }

    public final void a(Object obj) {
        Object[] objArr = this.a;
        int i2 = this.f16979b;
        this.f16979b = i2 + 1;
        objArr[i2] = obj;
    }

    public final i.v.g b() {
        return this.f16980c;
    }

    public final void c() {
        this.f16979b = 0;
    }

    public final Object d() {
        Object[] objArr = this.a;
        int i2 = this.f16979b;
        this.f16979b = i2 + 1;
        return objArr[i2];
    }
}