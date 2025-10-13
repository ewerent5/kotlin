package androidx.room;

import c.r.a.c;

/* compiled from: AutoClosingRoomOpenHelperFactory.java */
/* loaded from: classes.dex */
final class y implements c.InterfaceC0068c {
    private final c.InterfaceC0068c a;

    /* renamed from: b, reason: collision with root package name */
    private final w f2012b;

    y(c.InterfaceC0068c interfaceC0068c, w wVar) {
        this.a = interfaceC0068c;
        this.f2012b = wVar;
    }

    @Override // c.r.a.c.InterfaceC0068c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public x a(c.b bVar) {
        return new x(this.a.a(bVar), this.f2012b);
    }
}