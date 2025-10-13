package e.c.d.z;

import e.c.d.y.b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: TypeToken.java */
/* loaded from: classes.dex */
public class a<T> {
    final Class<? super T> a;

    /* renamed from: b, reason: collision with root package name */
    final Type f15580b;

    /* renamed from: c, reason: collision with root package name */
    final int f15581c;

    protected a() {
        Type typeD = d(a.class);
        this.f15580b = typeD;
        this.a = (Class<? super T>) b.k(typeD);
        this.f15581c = typeD.hashCode();
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls);
    }

    public static a<?> b(Type type) {
        return new a<>(type);
    }

    static Type d(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        return b.b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
    }

    public final Class<? super T> c() {
        return this.a;
    }

    public final Type e() {
        return this.f15580b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && b.f(this.f15580b, ((a) obj).f15580b);
    }

    public final int hashCode() {
        return this.f15581c;
    }

    public final String toString() {
        return b.u(this.f15580b);
    }

    a(Type type) {
        Type typeB = b.b((Type) e.c.d.y.a.b(type));
        this.f15580b = typeB;
        this.a = (Class<? super T>) b.k(typeB);
        this.f15581c = typeB.hashCode();
    }
}