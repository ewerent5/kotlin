package com.parizene.netmonitor.k0;

import com.parizene.netmonitor.db.celllog.i.g;
import com.parizene.netmonitor.ui.n1;

/* compiled from: AnalyticsConstants.java */
/* loaded from: classes.dex */
public class b {

    /* compiled from: AnalyticsConstants.java */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f13201b;

        static {
            int[] iArr = new int[n1.valuesCustom().length];
            f13201b = iArr;
            try {
                iArr[n1.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13201b[n1.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13201b[n1.FOLLOW_SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[g.values().length];
            a = iArr2;
            try {
                iArr2[g.CELL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[g.DBM.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[g.GPS.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: AnalyticsConstants.java */
    /* renamed from: com.parizene.netmonitor.k0.b$b, reason: collision with other inner class name */
    public static final class C0158b {
        public static String a(int i2) {
            if (i2 == 0) {
                return "default";
            }
            if (i2 == 1) {
                return "gsm 0000x dec";
            }
            if (i2 == 2) {
                return "gsm x0000 dec";
            }
            if (i2 == 3) {
                return "cdma 000x hex";
            }
            if (i2 != 4) {
                return null;
            }
            return "cdma 0x00 hex";
        }
    }

    /* compiled from: AnalyticsConstants.java */
    public static final class c {
        public static String a(g gVar) {
            int i2 = a.a[gVar.ordinal()];
            if (i2 == 1) {
                return "cell";
            }
            if (i2 == 2) {
                return "dbm";
            }
            if (i2 != 3) {
                return null;
            }
            return "gps";
        }
    }

    /* compiled from: AnalyticsConstants.java */
    public static final class d {
        public static String a(int i2) {
            if (i2 == 0) {
                return "default";
            }
            if (i2 == 1) {
                return "clf v2.0 hex";
            }
            if (i2 == 2) {
                return "clf v2.1 dec";
            }
            if (i2 == 3) {
                return "clf v3.0 hex";
            }
            if (i2 != 4) {
                return null;
            }
            return "clf v3.0 dec";
        }
    }

    /* compiled from: AnalyticsConstants.java */
    public static final class e {
        public static String a(int i2) {
            if (i2 == 0) {
                return "last mentioned desc";
            }
            if (i2 == 1) {
                return "last mentioned asc";
            }
            if (i2 == 2) {
                return "first appearance desc";
            }
            if (i2 != 3) {
                return null;
            }
            return "first appearance asc";
        }
    }

    /* compiled from: AnalyticsConstants.java */
    public static final class f {
        public static String a(n1 n1Var) {
            int i2 = a.f13201b[n1Var.ordinal()];
            if (i2 == 1) {
                return "dark";
            }
            if (i2 == 2) {
                return "light";
            }
            if (i2 != 3) {
                return null;
            }
            return "follow system";
        }
    }

    public static String a(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "none" : "sip" : "cdma" : "gsm";
    }
}