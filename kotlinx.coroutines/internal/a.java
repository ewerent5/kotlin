package kotlinx.coroutines.internal;

import java.util.Objects;

/* compiled from: ArrayQueue.kt */
/* loaded from: classes3.dex */
public class a<T> {
    private Object[] a = new Object[16];

    /* renamed from: b, reason: collision with root package name */
    private int f16950b;

    /* renamed from: c, reason: collision with root package name */
    private int f16951c;

    private final void b() {
        Object[] objArr = this.a;
        int length = objArr.length;
        Object[] objArr2 = new Object[length << 1];
        i.t.g.f(objArr, objArr2, 0, this.f16950b, 0, 10, null);
        Object[] objArr3 = this.a;
        int length2 = objArr3.length;
        int i2 = this.f16950b;
        i.t.g.f(objArr3, objArr2, length2 - i2, 0, i2, 4, null);
        this.a = objArr2;
        this.f16950b = 0;
        this.f16951c = length;
    }

    public final void a(T t) {
        Object[] objArr = this.a;
        int i2 = this.f16951c;
        objArr[i2] = t;
        int length = (objArr.length - 1) & (i2 + 1);
        this.f16951c = length;
        if (length == this.f16950b) {
            b();
        }
    }

    public final boolean c() {
        return this.f16950b == this.f16951c;
    }

    public final T d() {
        int i2 = this.f16950b;
        if (i2 == this.f16951c) {
            return null;
        }
        Object[] objArr = this.a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f16950b = (i2 + 1) & (objArr.length - 1);
        Objects.requireNonNull(t, "null cannot be cast to non-null type T");
        return t;
    }
}