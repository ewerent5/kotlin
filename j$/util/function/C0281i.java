package j$.util.function;

import java.util.Objects;

/* renamed from: j$.util.function.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0281i implements F {
    public final /* synthetic */ F a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F f16078b;

    public /* synthetic */ C0281i(F f2, F f3) {
        this.a = f2;
        this.f16078b = f3;
    }

    @Override // j$.util.function.F
    public F a(F f2) {
        Objects.requireNonNull(f2);
        return new C0281i(this, f2);
    }

    @Override // j$.util.function.F
    public final long applyAsLong(long j2) {
        return this.f16078b.applyAsLong(this.a.applyAsLong(j2));
    }

    @Override // j$.util.function.F
    public F b(F f2) {
        Objects.requireNonNull(f2);
        return new C0282j(this, f2);
    }
}