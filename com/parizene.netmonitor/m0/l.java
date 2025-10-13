package com.parizene.netmonitor.m0;

/* compiled from: MccMncHelper.java */
/* loaded from: classes.dex */
public class l {
    private final c.e.e<String, c.h.k.d<String, String>> a = new c.e.e<>(10);

    /* renamed from: b, reason: collision with root package name */
    private final String[] f13501b = {"311", "312", "313", "316", "330", "334", "338", "344", "346", "352", "356", "360", "365", "366", "708", "722", "732", "750"};

    /* renamed from: c, reason: collision with root package name */
    private final String[] f13502c = {"250", "310", "350", "405", "467", "502", "714", "738"};

    /* renamed from: d, reason: collision with root package name */
    private final String[][] f13503d = {new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09"}, new String[]{"032", "033", "004", "005", "006", "010", "012", "013", "014", "015", "016", "017", "020", "030", "032", "033", "034", "035", "040", "050", "053", "054", "060", "066", "070", "080", "090"}, new String[]{"000", "01", "02", "05"}, new String[]{"01", "025", "026", "027", "028", "029", "03", "030", "031", "032", "033", "034", "035", "036", "037", "038", "039", "04", "041", "042", "043", "044", "045", "046", "047", "05", "06", "07", "08", "09"}, new String[]{"05", "06"}, new String[]{"01"}, new String[]{"01", "02", "020", "03", "04"}, new String[]{"01", "002", "003", "05"}};

    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c.h.k.d<java.lang.String, java.lang.String> a(int r8, int r9) {
        /*
            r7 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r8 == r0) goto La8
            if (r9 != r0) goto L9
            goto La8
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = ";"
            r0.append(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            c.e.e<java.lang.String, c.h.k.d<java.lang.String, java.lang.String>> r1 = r7.a
            java.lang.Object r1 = r1.c(r0)
            c.h.k.d r1 = (c.h.k.d) r1
            if (r1 == 0) goto L28
            return r1
        L28:
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r1 = 0
            r2 = 0
        L2e:
            java.lang.String[] r3 = r7.f13501b
            int r4 = r3.length
            r5 = 1
            if (r2 >= r4) goto L58
            r3 = r3[r2]
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L55
            c.h.k.d r2 = new c.h.k.d
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r3[r1] = r9
            java.lang.String r9 = "%03d"
            java.lang.String r9 = java.lang.String.format(r9, r3)
            r2.<init>(r8, r9)
            c.e.e<java.lang.String, c.h.k.d<java.lang.String, java.lang.String>> r8 = r7.a
            r8.d(r0, r2)
            return r2
        L55:
            int r2 = r2 + 1
            goto L2e
        L58:
            r2 = 0
        L59:
            java.lang.String[] r3 = r7.f13502c
            int r4 = r3.length
            if (r2 >= r4) goto L8f
            r3 = r3[r2]
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L8c
            r3 = 0
        L67:
            java.lang.String[][] r4 = r7.f13503d
            r6 = r4[r2]
            int r6 = r6.length
            if (r3 >= r6) goto L8c
            r4 = r4[r2]
            r4 = r4[r3]
            int r4 = java.lang.Integer.parseInt(r4)
            if (r4 != r9) goto L89
            c.h.k.d r9 = new c.h.k.d
            java.lang.String[][] r1 = r7.f13503d
            r1 = r1[r2]
            r1 = r1[r3]
            r9.<init>(r8, r1)
            c.e.e<java.lang.String, c.h.k.d<java.lang.String, java.lang.String>> r8 = r7.a
            r8.d(r0, r9)
            return r9
        L89:
            int r3 = r3 + 1
            goto L67
        L8c:
            int r2 = r2 + 1
            goto L59
        L8f:
            c.h.k.d r2 = new c.h.k.d
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r3[r1] = r9
            java.lang.String r9 = "%02d"
            java.lang.String r9 = java.lang.String.format(r9, r3)
            r2.<init>(r8, r9)
            c.e.e<java.lang.String, c.h.k.d<java.lang.String, java.lang.String>> r8 = r7.a
            r8.d(r0, r2)
            return r2
        La8:
            c.h.k.d r8 = new c.h.k.d
            r9 = 0
            r8.<init>(r9, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.parizene.netmonitor.m0.l.a(int, int):c.h.k.d");
    }
}