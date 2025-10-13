package k.c.f;

/* compiled from: MapTileAreaZoomComputer.java */
/* loaded from: classes3.dex */
public class k implements i {
    private final int a;

    public k(int i2) {
        this.a = i2;
    }

    @Override // k.c.f.i
    public g a(g gVar, g gVar2) {
        if (gVar2 == null) {
            gVar2 = new g();
        }
        if (gVar.size() == 0) {
            gVar2.y();
            return gVar2;
        }
        int iX = gVar.x();
        int i2 = this.a;
        int i3 = iX + i2;
        if (i3 < 0 || i3 > m.a) {
            gVar2.y();
            return gVar2;
        }
        if (i2 <= 0) {
            gVar2.z(i3, gVar.r() >> (-this.a), gVar.u() >> (-this.a), gVar.t() >> (-this.a), gVar.o() >> (-this.a));
            return gVar2;
        }
        gVar2.z(i3, gVar.r() << this.a, gVar.u() << this.a, ((gVar.t() + 1) << this.a) - 1, ((gVar.o() + 1) << this.a) - 1);
        return gVar2;
    }
}