package com.parizene.netmonitor.m0.z;

/* compiled from: UmtsBands.kt */
/* loaded from: classes.dex */
public final class f {
    public static final f a = new f();

    /* renamed from: b, reason: collision with root package name */
    private static final a[] f13554b = {new a(1, "2100", 10562, 10838), new a(2, "1900 PCS", 9662, 9938), new a(3, "1800 DCS", 1162, 1513), new a(4, "AWS-1", 1537, 1738), new a(5, "850", 4357, 4458), new a(6, "850 Japan", 4387, 4413), new a(7, "2600", 2237, 2563), new a(8, "900 GSM", 2937, 3088), new a(9, "1800 Japan", 9237, 9387), new a(10, "AWS-1+", 3112, 3388), new a(11, "1500 Lower", 3712, 3787), new a(12, "700 a", 3842, 3903), new a(13, "700 c", 4017, 4043), new a(14, "700 PS", 4117, 4143), new a(19, "800 Japan", 712, 763), new a(20, "800 DD", 4512, 4638), new a(21, "1500 Upper", 862, 912), new a(22, "3500", 4662, 5038), new a(25, "1900+", 5112, 5413), new a(26, "850+", 5762, 5913), new a(32, "1500 L-band", 6617, 6813), new a(33, "TD 1900", 9500, 9600), new a(34, "TD 2000", 10050, 10125), new a(35, "TD PCS Lower", 9250, 9550), new a(36, "TD PCS Upper", 9650, 9950), new a(37, "TD PCS Center gap", 9550, 9650), new a(38, "TD 2600", 12850, 13100), new a(39, "TD 1900+", 9400, 9600), new a(40, "TD 2300", 11500, 12000)};

    private f() {
    }

    public final String a(int i2) {
        a aVar;
        a[] aVarArr = f13554b;
        int length = aVarArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                aVar = null;
                break;
            }
            aVar = aVarArr[i3];
            if (aVar.a(i2)) {
                break;
            }
            i3++;
        }
        if (aVar == null) {
            return "";
        }
        return 'B' + aVar.c() + ": " + aVar.b();
    }
}