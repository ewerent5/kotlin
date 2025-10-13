package e.c.b.a.i;

import java.util.Set;

/* compiled from: TransportFactoryImpl.java */
/* loaded from: classes.dex */
final class n implements e.c.b.a.g {
    private final Set<e.c.b.a.b> a;

    /* renamed from: b, reason: collision with root package name */
    private final m f14263b;

    /* renamed from: c, reason: collision with root package name */
    private final p f14264c;

    n(Set<e.c.b.a.b> set, m mVar, p pVar) {
        this.a = set;
        this.f14263b = mVar;
        this.f14264c = pVar;
    }

    @Override // e.c.b.a.g
    public <T> e.c.b.a.f<T> a(String str, Class<T> cls, e.c.b.a.b bVar, e.c.b.a.e<T, byte[]> eVar) {
        if (this.a.contains(bVar)) {
            return new o(this.f14263b, str, bVar, eVar, this.f14264c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, this.a));
    }
}