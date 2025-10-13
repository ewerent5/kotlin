package com.parizene.netmonitor.ui;

/* compiled from: CidDivider.java */
/* loaded from: classes3.dex */
public enum p0 {
    Default,
    Brackets,
    Dot,
    Comma;

    /* compiled from: CidDivider.java */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[p0.values().length];
            a = iArr;
            try {
                iArr[p0.Brackets.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[p0.Dot.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[p0.Comma.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static String a(long j2, int i2, p0 p0Var, boolean z) {
        if (3 == i2) {
            return b((int) j2, p0Var);
        }
        if (1 == i2) {
            int i3 = (int) j2;
            return c(i3, i3 >> 8, i3 & 255, p0Var, z);
        }
        if (2 != i2) {
            return String.valueOf(j2);
        }
        int i4 = (int) j2;
        return e(i4, 65535 & i4, p0Var);
    }

    public static String b(int i2, p0 p0Var) {
        return i2 != Integer.MAX_VALUE ? Default == p0Var ? String.valueOf(i2) : d(i2 / 10, i2 % 10, p0Var) : "-";
    }

    public static String c(int i2, int i3, int i4, p0 p0Var, boolean z) {
        if (i2 == Integer.MAX_VALUE) {
            return "-";
        }
        if (!z) {
            return "" + i2;
        }
        if (Default != p0Var) {
            return d(i3, i4, p0Var);
        }
        return i3 + " " + i4;
    }

    private static String d(int i2, int i3, p0 p0Var) {
        int i4 = a.a[p0Var.ordinal()];
        if (i4 == 1) {
            return i2 + "(" + i3 + ")";
        }
        if (i4 == 2) {
            return i2 + "." + i3;
        }
        if (i4 != 3) {
            throw new IllegalStateException();
        }
        return i2 + "," + i3;
    }

    public static String e(int i2, int i3, p0 p0Var) {
        return i2 != Integer.MAX_VALUE ? Default == p0Var ? String.valueOf(i3) : d(i3 / 10, i3 % 10, p0Var) : "-";
    }
}