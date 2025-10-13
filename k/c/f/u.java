package k.c.f;

/* compiled from: TileSystemWebMercator.java */
/* loaded from: classes3.dex */
public class u extends t {
    @Override // k.c.f.t
    public double C(double d2) {
        return (d2 - x()) / (q() - x());
    }

    @Override // k.c.f.t
    public double F(double d2) {
        double dSin = Math.sin((d2 * 3.141592653589793d) / 180.0d);
        return 0.5d - (Math.log((dSin + 1.0d) / (1.0d - dSin)) / 12.566370614359172d);
    }

    @Override // k.c.f.t
    public double l(double d2) {
        return 90.0d - ((Math.atan(Math.exp(((d2 - 0.5d) * 2.0d) * 3.141592653589793d)) * 360.0d) / 3.141592653589793d);
    }

    @Override // k.c.f.t
    public double n(double d2) {
        return x() + ((q() - x()) * d2);
    }

    @Override // k.c.f.t
    public double p() {
        return 85.05112877980658d;
    }

    @Override // k.c.f.t
    public double q() {
        return 180.0d;
    }

    @Override // k.c.f.t
    public double w() {
        return -85.05112877980658d;
    }

    @Override // k.c.f.t
    public double x() {
        return -180.0d;
    }
}