package com.parizene.netmonitor.m0.z;

import com.google.android.gms.ads.AdRequest;
import i.d0.p;
import i.t.h;

/* compiled from: GsmBands.kt */
/* loaded from: classes.dex */
public final class c {
    public static final c a = new c();

    /* renamed from: b, reason: collision with root package name */
    private static final a[] f13549b = {new a(450, "450", 259, 293), new a(480, "480", 306, 340), new a(850, "850", 128, 251), new a(900, "900 P", 1, 124), new a(900, "900 E", 0, 124), new a(900, "900 E", 975, 1023), new a(900, "900 R", 0, 124), new a(900, "900 R", 955, 1023), new a(900, "900 ER", 0, 124), new a(900, "900 ER", 940, 1023), new a(-1, "", AdRequest.MAX_CONTENT_URL_LENGTH, 810), new a(1800, "1800 DSC", 811, 885)};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f13550c = {"352", "372", "360", "712"};

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f13551d = {"342", "346", "348", "338", "356", "358", "362", "363", "370", "374", "376", "724", "734", "748"};

    private c() {
    }

    public final String a(int i2, String str) {
        a aVar;
        String string;
        a[] aVarArr = f13549b;
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
        if (aVar != null && aVar.c() == -1) {
            return str == null ? "" : (p.B(str, "3", false, 2, null) || p.B(str, "7", false, 2, null)) ? h.m(f13551d, str) ? "1800/1900" : h.m(f13550c, str) ? "1800 " : "1900" : "1800";
        }
        Integer numValueOf = aVar != null ? Integer.valueOf(aVar.c()) : null;
        return (numValueOf == null || (string = numValueOf.toString()) == null) ? "" : string;
    }
}