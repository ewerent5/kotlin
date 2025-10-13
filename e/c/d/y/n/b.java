package e.c.d.y.n;

import e.c.d.v;
import e.c.d.w;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: CollectionTypeAdapterFactory.java */
/* loaded from: classes.dex */
public final class b implements w {

    /* renamed from: e, reason: collision with root package name */
    private final e.c.d.y.c f15510e;

    /* compiled from: CollectionTypeAdapterFactory.java */
    private static final class a<E> extends v<Collection<E>> {
        private final v<E> a;

        /* renamed from: b, reason: collision with root package name */
        private final e.c.d.y.i<? extends Collection<E>> f15511b;

        public a(e.c.d.f fVar, Type type, v<E> vVar, e.c.d.y.i<? extends Collection<E>> iVar) {
            this.a = new m(fVar, vVar, type);
            this.f15511b = iVar;
        }

        @Override // e.c.d.v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection<E> b(e.c.d.a0.a aVar) throws IOException {
            if (aVar.k0() == e.c.d.a0.b.NULL) {
                aVar.a0();
                return null;
            }
            Collection<E> collectionA = this.f15511b.a();
            aVar.b();
            while (aVar.v()) {
                collectionA.add(this.a.b(aVar));
            }
            aVar.j();
            return collectionA;
        }

        @Override // e.c.d.v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(e.c.d.a0.c cVar, Collection<E> collection) throws IOException {
            if (collection == null) {
                cVar.C();
                return;
            }
            cVar.d();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.a.d(cVar, it.next());
            }
            cVar.j();
        }
    }

    public b(e.c.d.y.c cVar) {
        this.f15510e = cVar;
    }

    @Override // e.c.d.w
    public <T> v<T> a(e.c.d.f fVar, e.c.d.z.a<T> aVar) {
        Type typeE = aVar.e();
        Class<? super T> clsC = aVar.c();
        if (!Collection.class.isAssignableFrom(clsC)) {
            return null;
        }
        Type typeH = e.c.d.y.b.h(typeE, clsC);
        return new a(fVar, typeH, fVar.l(e.c.d.z.a.b(typeH)), this.f15510e.a(aVar));
    }
}