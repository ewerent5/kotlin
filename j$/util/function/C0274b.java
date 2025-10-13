package j$.util.function;

import java.util.Objects;

/* renamed from: j$.util.function.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0274b implements BiFunction {
    public final /* synthetic */ BiFunction a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f16073b;

    public /* synthetic */ C0274b(BiFunction biFunction, Function function) {
        this.a = biFunction;
        this.f16073b = function;
    }

    @Override // j$.util.function.BiFunction
    public BiFunction a(Function function) {
        Objects.requireNonNull(function);
        return new C0274b(this, function);
    }

    @Override // j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return this.f16073b.apply(this.a.apply(obj, obj2));
    }
}