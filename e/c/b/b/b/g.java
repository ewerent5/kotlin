package e.c.b.b.b;

import e.c.b.b.b.a;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
final class g<T> implements e<T> {
    private final /* synthetic */ a a;

    g(a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Incorrect types in method signature: (TT;)V */
    @Override // e.c.b.b.b.e
    public final void a(c cVar) {
        this.a.a = cVar;
        Iterator it = this.a.f14349c.iterator();
        while (it.hasNext()) {
            ((a.InterfaceC0176a) it.next()).a(this.a.a);
        }
        this.a.f14349c.clear();
        a.l(this.a, null);
    }
}