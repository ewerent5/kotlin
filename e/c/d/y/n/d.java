package e.c.d.y.n;

import e.c.d.s;
import e.c.d.v;
import e.c.d.w;

/* compiled from: JsonAdapterAnnotationTypeAdapterFactory.java */
/* loaded from: classes.dex */
public final class d implements w {

    /* renamed from: e, reason: collision with root package name */
    private final e.c.d.y.c f15513e;

    public d(e.c.d.y.c cVar) {
        this.f15513e = cVar;
    }

    @Override // e.c.d.w
    public <T> v<T> a(e.c.d.f fVar, e.c.d.z.a<T> aVar) {
        e.c.d.x.b bVar = (e.c.d.x.b) aVar.c().getAnnotation(e.c.d.x.b.class);
        if (bVar == null) {
            return null;
        }
        return (v<T>) b(this.f15513e, fVar, aVar, bVar);
    }

    v<?> b(e.c.d.y.c cVar, e.c.d.f fVar, e.c.d.z.a<?> aVar, e.c.d.x.b bVar) {
        v<?> lVar;
        Object objA = cVar.a(e.c.d.z.a.a(bVar.value())).a();
        if (objA instanceof v) {
            lVar = (v) objA;
        } else if (objA instanceof w) {
            lVar = ((w) objA).a(fVar, aVar);
        } else {
            boolean z = objA instanceof s;
            if (!z && !(objA instanceof e.c.d.k)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objA.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            lVar = new l<>(z ? (s) objA : null, objA instanceof e.c.d.k ? (e.c.d.k) objA : null, fVar, aVar, null);
        }
        return (lVar == null || !bVar.nullSafe()) ? lVar : lVar.a();
    }
}