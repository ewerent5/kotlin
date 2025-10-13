package kotlinx.coroutines.internal;

import kotlinx.coroutines.o1;

/* compiled from: Scopes.kt */
/* loaded from: classes3.dex */
public class v<T> extends kotlinx.coroutines.a<T> implements i.v.j.a.e {

    /* renamed from: h, reason: collision with root package name */
    public final i.v.d<T> f17001h;

    /* JADX WARN: Multi-variable type inference failed */
    public v(i.v.g gVar, i.v.d<? super T> dVar) {
        super(gVar, true);
        this.f17001h = dVar;
    }

    @Override // kotlinx.coroutines.a
    protected void B0(Object obj) {
        i.v.d<T> dVar = this.f17001h;
        dVar.e(kotlinx.coroutines.a0.a(obj, dVar));
    }

    public final o1 H0() {
        return (o1) this.f16926g.get(o1.f17025d);
    }

    @Override // kotlinx.coroutines.v1
    protected final boolean a0() {
        return true;
    }

    @Override // i.v.j.a.e
    public final i.v.j.a.e c() {
        i.v.d<T> dVar = this.f17001h;
        if (!(dVar instanceof i.v.j.a.e)) {
            dVar = null;
        }
        return (i.v.j.a.e) dVar;
    }

    @Override // i.v.j.a.e
    public final StackTraceElement h() {
        return null;
    }

    @Override // kotlinx.coroutines.v1
    protected void u(Object obj) {
        f.c(i.v.i.c.b(this.f17001h), kotlinx.coroutines.a0.a(obj, this.f17001h), null, 2, null);
    }
}