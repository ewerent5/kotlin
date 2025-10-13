package e.c.d.y.n;

import e.c.d.v;
import e.c.d.y.n.i;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* compiled from: TypeAdapterRuntimeTypeWrapper.java */
/* loaded from: classes.dex */
final class m<T> extends v<T> {
    private final e.c.d.f a;

    /* renamed from: b, reason: collision with root package name */
    private final v<T> f15548b;

    /* renamed from: c, reason: collision with root package name */
    private final Type f15549c;

    m(e.c.d.f fVar, v<T> vVar, Type type) {
        this.a = fVar;
        this.f15548b = vVar;
        this.f15549c = type;
    }

    private Type e(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    @Override // e.c.d.v
    public T b(e.c.d.a0.a aVar) {
        return this.f15548b.b(aVar);
    }

    @Override // e.c.d.v
    public void d(e.c.d.a0.c cVar, T t) {
        v<T> vVarL = this.f15548b;
        Type typeE = e(this.f15549c, t);
        if (typeE != this.f15549c) {
            vVarL = this.a.l(e.c.d.z.a.b(typeE));
            if (vVarL instanceof i.b) {
                v<T> vVar = this.f15548b;
                if (!(vVar instanceof i.b)) {
                    vVarL = vVar;
                }
            }
        }
        vVarL.d(cVar, t);
    }
}