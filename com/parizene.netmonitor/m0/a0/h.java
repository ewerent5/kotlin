package com.parizene.netmonitor.m0.a0;

import android.os.Build;
import android.telephony.CellSignalStrengthLte;
import java.lang.reflect.Field;

/* compiled from: CellSignalStrengthLteExtender.java */
/* loaded from: classes.dex */
public class h {
    private final Field a;

    /* renamed from: b, reason: collision with root package name */
    private final Field f13224b;

    /* renamed from: c, reason: collision with root package name */
    private final Field f13225c;

    /* renamed from: d, reason: collision with root package name */
    private final Field f13226d;

    /* renamed from: e, reason: collision with root package name */
    private final Field f13227e;

    public h() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            this.a = null;
        } else {
            this.a = com.parizene.netmonitor.o0.a.a(CellSignalStrengthLte.class, "mSignalStrength");
        }
        if (i2 >= 26) {
            this.f13224b = null;
            this.f13225c = null;
            this.f13226d = null;
            this.f13227e = null;
            return;
        }
        this.f13224b = com.parizene.netmonitor.o0.a.a(CellSignalStrengthLte.class, "mRsrp");
        this.f13225c = com.parizene.netmonitor.o0.a.a(CellSignalStrengthLte.class, "mRsrq");
        this.f13226d = com.parizene.netmonitor.o0.a.a(CellSignalStrengthLte.class, "mRssnr");
        this.f13227e = com.parizene.netmonitor.o0.a.a(CellSignalStrengthLte.class, "mCqi");
    }

    public int a(CellSignalStrengthLte cellSignalStrengthLte) {
        return Build.VERSION.SDK_INT >= 26 ? cellSignalStrengthLte.getCqi() : ((Integer) com.parizene.netmonitor.o0.a.c(cellSignalStrengthLte, this.f13227e, Integer.MAX_VALUE)).intValue();
    }

    public int b(CellSignalStrengthLte cellSignalStrengthLte) {
        return Build.VERSION.SDK_INT >= 26 ? cellSignalStrengthLte.getRsrp() : ((Integer) com.parizene.netmonitor.o0.a.c(cellSignalStrengthLte, this.f13224b, Integer.MAX_VALUE)).intValue();
    }

    public int c(CellSignalStrengthLte cellSignalStrengthLte) {
        return Build.VERSION.SDK_INT >= 26 ? cellSignalStrengthLte.getRsrq() : ((Integer) com.parizene.netmonitor.o0.a.c(cellSignalStrengthLte, this.f13225c, Integer.MAX_VALUE)).intValue();
    }

    public int d(CellSignalStrengthLte cellSignalStrengthLte) {
        if (Build.VERSION.SDK_INT >= 29) {
            return cellSignalStrengthLte.getRssi();
        }
        return Integer.MAX_VALUE;
    }

    public int e(CellSignalStrengthLte cellSignalStrengthLte) {
        return Build.VERSION.SDK_INT >= 26 ? cellSignalStrengthLte.getRssnr() : ((Integer) com.parizene.netmonitor.o0.a.c(cellSignalStrengthLte, this.f13226d, Integer.MAX_VALUE)).intValue();
    }

    public int f(CellSignalStrengthLte cellSignalStrengthLte) {
        return ((Integer) com.parizene.netmonitor.o0.a.c(cellSignalStrengthLte, this.a, Integer.MAX_VALUE)).intValue();
    }
}