package com.parizene.netmonitor.n0;

/* compiled from: ClfExporter.java */
/* loaded from: classes.dex */
public class a {

    /* compiled from: ClfExporter.java */
    /* renamed from: com.parizene.netmonitor.n0.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0163a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[e.values().length];
            a = iArr;
            try {
                iArr[e.Hex20.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[e.Dec21.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[e.Hex30.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[e.Dec30.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static String a(c cVar) {
        return String.format("%04X%04X%s%s\t%s", Long.valueOf(cVar.a()), Integer.valueOf(cVar.d()), cVar.i(), cVar.j(), cVar.c());
    }

    private static String b(c cVar) {
        return String.format("%05d%05d%s%s\t%s", Long.valueOf(cVar.a()), Integer.valueOf(cVar.d()), cVar.i(), cVar.j(), cVar.c());
    }

    private static String c(c cVar) {
        return String.format("%s%s;%05d;%05d;00000;%s;%s;-1;%s;0", cVar.i(), cVar.j(), Long.valueOf(cVar.a()), Integer.valueOf(cVar.d()), cVar.f(), cVar.h(), cVar.c());
    }

    private static String d(c cVar) {
        return String.format("%s%s;0x%04X;0x%04X;0x0000;%s;%s;-1;%s;0", cVar.i(), cVar.j(), Long.valueOf(cVar.a()), Integer.valueOf(cVar.d()), cVar.f(), cVar.h(), cVar.c());
    }

    private static String e(c cVar) {
        return String.format("%s;%s;%d;%d;%s;%s;%s", cVar.i(), cVar.j(), Integer.valueOf(cVar.d()), Long.valueOf(cVar.a()), cVar.f(), cVar.h(), cVar.c());
    }

    public static String f(c cVar, e eVar) {
        if (!cVar.l() && !cVar.k()) {
            return null;
        }
        int i2 = C0163a.a[eVar.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? e(cVar) : c(cVar) : d(cVar) : b(cVar) : a(cVar);
    }
}