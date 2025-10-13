package k.c.f;

/* compiled from: MapTileAreaBorderComputer.java */
/* loaded from: classes3.dex */
public class h implements i {
    private final int a;

    public h(int i2) {
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
        int iR = gVar.r() - this.a;
        int iU = gVar.u();
        int i2 = this.a;
        int i3 = iU - i2;
        int i4 = (i2 * 2) - 1;
        gVar2.z(gVar.x(), iR, i3, gVar.w() + iR + i4, gVar.p() + i3 + i4);
        return gVar2;
    }
}