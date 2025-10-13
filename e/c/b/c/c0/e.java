package e.c.b.c.c0;

/* compiled from: CutCornerTreatment.java */
/* loaded from: classes.dex */
public class e extends d {
    float a = -1.0f;

    @Override // e.c.b.c.c0.d
    public void a(m mVar, float f2, float f3, float f4) {
        mVar.o(0.0f, f4 * f3, 180.0f, 180.0f - f2);
        double d2 = f4;
        double d3 = f3;
        mVar.m((float) (Math.sin(Math.toRadians(f2)) * d2 * d3), (float) (Math.sin(Math.toRadians(90.0f - f2)) * d2 * d3));
    }
}