package androidx.room;

import androidx.room.q0;
import c.r.a.c;
import java.util.concurrent.Executor;

/* compiled from: QueryInterceptorOpenHelperFactory.java */
/* loaded from: classes.dex */
final class m0 implements c.InterfaceC0068c {
    private final c.InterfaceC0068c a;

    /* renamed from: b, reason: collision with root package name */
    private final q0.f f1897b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f1898c;

    m0(c.InterfaceC0068c interfaceC0068c, q0.f fVar, Executor executor) {
        this.a = interfaceC0068c;
        this.f1897b = fVar;
        this.f1898c = executor;
    }

    @Override // c.r.a.c.InterfaceC0068c
    public c.r.a.c a(c.b bVar) {
        return new l0(this.a.a(bVar), this.f1897b, this.f1898c);
    }
}