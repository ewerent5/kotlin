package com.parizene.netmonitor.m0.z;

/* compiled from: LteBands.kt */
/* loaded from: classes.dex */
public final class d {
    public static final d a = new d();

    /* renamed from: b, reason: collision with root package name */
    private static final a[] f13552b = {new a(1, "2100", 0, 599), new a(2, "1900 PCS", 600, 1199), new a(3, "1800+", 1200, 1949), new a(4, "AWS-1", 1950, 2399), new a(5, "850", 2400, 2649), new a(7, "2600", 2750, 3449), new a(8, "900 GSM", 3450, 3799), new a(9, "1800", 3800, 4149), new a(10, "AWS-1+", 4150, 4749), new a(11, "1500 Lower", 4750, 4949), new a(12, "700 a", 5010, 5179), new a(13, "700 c", 5180, 5279), new a(14, "700 PS", 5280, 5379), new a(17, "700 b", 5730, 5849), new a(18, "800 Lower", 5850, 5999), new a(19, "800 Upper", 6000, 6149), new a(20, "800 DD", 6150, 6449), new a(21, "1500 Upper", 6450, 6599), new a(22, "3500", 6600, 7399), new a(24, "1600 L-band", 7700, 8039), new a(25, "1900+", 8040, 8689), new a(26, "850+", 8690, 9039), new a(27, "800 SMR", 9040, 9209), new a(28, "700 APT", 9210, 9659), new a(29, "700 d", 9660, 9769), new a(30, "2300 WCS", 9770, 9869), new a(31, "450", 9870, 9919), new a(32, "1500 L-band", 9920, 10359), new a(33, "TD 1900", 36000, 36199), new a(34, "TD 2000", 36200, 36349), new a(35, "TD PCS Lower", 36350, 36949), new a(36, "TD PCS Upper", 36950, 37549), new a(37, "TD PCS Center gap", 37550, 37749), new a(38, "TD 2600", 37750, 38249), new a(39, "TD 1900+", 38250, 38649), new a(40, "TD 2300", 38650, 39649), new a(41, "TD 2600+", 39650, 41589), new a(42, "TD 3500", 41590, 43589), new a(43, "TD 3700", 43590, 45589), new a(44, "TD 700", 45590, 46589), new a(45, "TD 1500", 46590, 46789), new a(46, "TD Unlicensed", 46790, 54539), new a(47, "TD V2X", 54540, 55239), new a(48, "TD 3600", 55240, 56739), new a(49, "TD 3600r", 56740, 58239), new a(50, "TD 1500+", 58240, 59089), new a(51, "TD 1500-", 59090, 59139), new a(52, "TD 3300", 59140, 60139), new a(53, "TD 2500", 60140, 60254), new a(65, "2100+", 65536, 66435), new a(66, "AWS-3", 66436, 67335), new a(67, "700 EU", 67336, 67535), new a(68, "700 ME", 67536, 67835), new a(69, "DL B38", 67836, 68335), new a(70, "AWS-4", 68336, 68585), new a(71, "600", 68586, 68935), new a(72, "450 PMR/PAMR", 68936, 68985), new a(73, "450 APAC", 68986, 69035), new a(74, "L-band", 69036, 69465), new a(75, "DL B50", 69466, 70315), new a(76, "DL B51", 70316, 70365), new a(85, "700 a+", 70366, 70545), new a(87, "410", 70546, 70595), new a(88, "410+", 70596, 70645)};

    private d() {
    }

    public final String a(int i2) {
        a aVar;
        a[] aVarArr = f13552b;
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