package com.parizene.netmonitor.m0;

/* compiled from: DbmCalculator.java */
/* loaded from: classes.dex */
class k {
    static int a(int i2, int i3) {
        return i2 < i3 ? i2 : i3;
    }

    static int b(int i2, com.parizene.netmonitor.m0.b0.c cVar) {
        if (i2 != Integer.MAX_VALUE) {
            return com.parizene.netmonitor.m0.b0.c.MINUS_113 == cVar ? com.parizene.netmonitor.m0.b0.c.b(i2) : com.parizene.netmonitor.m0.b0.c.a(i2);
        }
        return Integer.MAX_VALUE;
    }

    static int c(int i2, int i3, com.parizene.netmonitor.m0.b0.c cVar) {
        if (com.parizene.netmonitor.m0.b0.c.MINUS_116 == cVar) {
            if (i2 != Integer.MAX_VALUE) {
                return com.parizene.netmonitor.m0.b0.c.c(i2);
            }
        } else {
            if (com.parizene.netmonitor.m0.b0.c.MINUS_140 != cVar) {
                return (i3 != Integer.MAX_VALUE || i2 == Integer.MAX_VALUE) ? i3 : com.parizene.netmonitor.m0.b0.c.a(i2);
            }
            if (i2 != Integer.MAX_VALUE) {
                return com.parizene.netmonitor.m0.b0.c.d(i2);
            }
        }
        return Integer.MAX_VALUE;
    }

    static int d(int i2, com.parizene.netmonitor.m0.b0.c cVar) {
        if (i2 != Integer.MAX_VALUE) {
            return com.parizene.netmonitor.m0.b0.c.MINUS_116 == cVar ? com.parizene.netmonitor.m0.b0.c.c(i2) : com.parizene.netmonitor.m0.b0.c.a(i2);
        }
        return Integer.MAX_VALUE;
    }

    static int e(int i2, int i3, com.parizene.netmonitor.m0.b0.c cVar) {
        if (com.parizene.netmonitor.m0.b0.c.DBM == cVar) {
            return i3;
        }
        if (i2 != Integer.MAX_VALUE) {
            return i2 < 0 ? i2 : com.parizene.netmonitor.m0.b0.c.a(i2);
        }
        return Integer.MAX_VALUE;
    }

    static int f(int i2, int i3, int i4) {
        if (i4 == Integer.MAX_VALUE) {
            if (i2 != Integer.MAX_VALUE) {
                return com.parizene.netmonitor.m0.b0.c.a(i2);
            }
            if (i3 != Integer.MAX_VALUE) {
                return i3 < 0 ? i3 : com.parizene.netmonitor.m0.b0.c.a(i3);
            }
        }
        return i4;
    }

    static int g(int i2, int i3, com.parizene.netmonitor.m0.b0.c cVar) {
        if (com.parizene.netmonitor.m0.b0.c.DBM == cVar) {
            return i3;
        }
        if (i2 != Integer.MAX_VALUE) {
            return com.parizene.netmonitor.m0.b0.c.MINUS_116 == cVar ? com.parizene.netmonitor.m0.b0.c.c(i2) : i2 < 0 ? i2 : com.parizene.netmonitor.m0.b0.c.a(i2);
        }
        return Integer.MAX_VALUE;
    }
}