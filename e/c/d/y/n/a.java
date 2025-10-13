package e.c.d.y.n;

import e.c.d.v;
import e.c.d.w;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* compiled from: ArrayTypeAdapter.java */
/* loaded from: classes.dex */
public final class a<E> extends v<Object> {
    public static final w a = new C0191a();

    /* renamed from: b, reason: collision with root package name */
    private final Class<E> f15508b;

    /* renamed from: c, reason: collision with root package name */
    private final v<E> f15509c;

    /* compiled from: ArrayTypeAdapter.java */
    /* renamed from: e.c.d.y.n.a$a, reason: collision with other inner class name */
    class C0191a implements w {
        C0191a() {
        }

        @Override // e.c.d.w
        public <T> v<T> a(e.c.d.f fVar, e.c.d.z.a<T> aVar) {
            Type typeE = aVar.e();
            if (!(typeE instanceof GenericArrayType) && (!(typeE instanceof Class) || !((Class) typeE).isArray())) {
                return null;
            }
            Type typeG = e.c.d.y.b.g(typeE);
            return new a(fVar, fVar.l(e.c.d.z.a.b(typeG)), e.c.d.y.b.k(typeG));
        }
    }

    public a(e.c.d.f fVar, v<E> vVar, Class<E> cls) {
        this.f15509c = new m(fVar, vVar, cls);
        this.f15508b = cls;
    }

    @Override // e.c.d.v
    public Object b(e.c.d.a0.a aVar) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        if (aVar.k0() == e.c.d.a0.b.NULL) {
            aVar.a0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.b();
        while (aVar.v()) {
            arrayList.add(this.f15509c.b(aVar));
        }
        aVar.j();
        int size = arrayList.size();
        Object objNewInstance = Array.newInstance((Class<?>) this.f15508b, size);
        for (int i2 = 0; i2 < size; i2++) {
            Array.set(objNewInstance, i2, arrayList.get(i2));
        }
        return objNewInstance;
    }

    @Override // e.c.d.v
    public void d(e.c.d.a0.c cVar, Object obj) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (obj == null) {
            cVar.C();
            return;
        }
        cVar.d();
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            this.f15509c.d(cVar, Array.get(obj, i2));
        }
        cVar.j();
    }
}