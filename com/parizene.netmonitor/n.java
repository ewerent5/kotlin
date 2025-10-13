package com.parizene.netmonitor;

/* compiled from: DbmConstants.java */
/* loaded from: classes.dex */
public class n {
    private static final int[] a = {-120, -52};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f13555b = {-113, -51};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f13556c = {-121, -25};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f13557d = {-140, -44};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f13558e = {-120, -24};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f13559f = {-140, -44};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f13560g = {-95, -85};

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f13561h = {-115, -90};

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f13562i = {-100, -55};

    /* compiled from: DbmConstants.java */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[o.values().length];
            a = iArr;
            try {
                iArr[o.Cdma.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[o.Gsm.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[o.Wcdma.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[o.Lte.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[o.Wifi.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[o.Tdscdma.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[o.Nr.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static int[] a(o oVar) {
        switch (a.a[oVar.ordinal()]) {
            case 1:
                return a;
            case 2:
                return f13555b;
            case 3:
                return f13556c;
            case 4:
                return f13557d;
            case 5:
                return f13562i;
            case 6:
                return f13558e;
            case 7:
                return f13559f;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static int[] b(o oVar) {
        int i2 = a.a[oVar.ordinal()];
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            if (i2 == 4) {
                return f13561h;
            }
            if (i2 != 6 && i2 != 7) {
                throw new IllegalArgumentException();
            }
        }
        return f13560g;
    }
}