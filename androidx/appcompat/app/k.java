package androidx.appcompat.app;

/* compiled from: TwilightCalculator.java */
/* loaded from: classes.dex */
class k {
    private static k a;

    /* renamed from: b, reason: collision with root package name */
    public long f136b;

    /* renamed from: c, reason: collision with root package name */
    public long f137c;

    /* renamed from: d, reason: collision with root package name */
    public int f138d;

    k() {
    }

    static k b() {
        if (a == null) {
            a = new k();
        }
        return a;
    }

    public void a(long j2, double d2, double d3) {
        double d4 = (0.01720197f * ((j2 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(d4) * 0.03341960161924362d) + d4 + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double dRound = Math.round((r3 - 9.0E-4f) - r9) + 9.0E-4f + ((-d3) / 360.0d) + (Math.sin(d4) * 0.0053d) + (Math.sin(2.0d * dSin) * (-0.0069d));
        double dAsin = Math.asin(Math.sin(dSin) * Math.sin(0.4092797040939331d));
        double d5 = 0.01745329238474369d * d2;
        double dSin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d5) * Math.sin(dAsin))) / (Math.cos(d5) * Math.cos(dAsin));
        if (dSin2 >= 1.0d) {
            this.f138d = 1;
            this.f136b = -1L;
            this.f137c = -1L;
        } else {
            if (dSin2 <= -1.0d) {
                this.f138d = 0;
                this.f136b = -1L;
                this.f137c = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin2) / 6.283185307179586d);
            this.f136b = Math.round((dRound + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dRound - dAcos) * 8.64E7d) + 946728000000L;
            this.f137c = jRound;
            if (jRound >= j2 || this.f136b <= j2) {
                this.f138d = 1;
            } else {
                this.f138d = 0;
            }
        }
    }
}