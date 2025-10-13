package com.parizene.netmonitor.ui.map;

/* compiled from: OsmMarker.java */
/* loaded from: classes3.dex */
public class r0 implements b0 {
    private k.c.g.g.f a;

    r0(k.c.g.g.f fVar) {
        this.a = fVar;
    }

    @Override // com.parizene.netmonitor.ui.map.b0
    public String a() {
        return this.a.d();
    }

    public void b(k.c.g.g.b<k.c.g.g.f> bVar) {
        bVar.L(this.a);
    }

    @Override // com.parizene.netmonitor.ui.map.b0
    public g0 getPosition() {
        return new g0((k.c.f.e) this.a.c());
    }

    @Override // com.parizene.netmonitor.ui.map.b0
    public String getTitle() {
        return this.a.e();
    }
}