package com.parizene.netmonitor.m0.a0;

import android.os.Build;
import android.telephony.CellSignalStrengthGsm;
import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: CellSignalStrengthGsmExtender.java */
/* loaded from: classes.dex */
public class g {
    private final Field a;

    /* renamed from: b, reason: collision with root package name */
    private final Field f13221b;

    /* renamed from: c, reason: collision with root package name */
    private final Field f13222c;

    /* renamed from: d, reason: collision with root package name */
    private final Pattern f13223d;

    public g() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            this.a = null;
        } else {
            this.a = com.parizene.netmonitor.o0.a.a(CellSignalStrengthGsm.class, "mSignalStrength");
        }
        if (i2 >= 29) {
            this.f13221b = null;
        } else {
            this.f13221b = com.parizene.netmonitor.o0.a.a(CellSignalStrengthGsm.class, "mBitErrorRate");
        }
        if (i2 < 26 && i2 >= 24) {
            this.f13222c = com.parizene.netmonitor.o0.a.a(CellSignalStrengthGsm.class, "mTimingAdvance");
        } else {
            this.f13222c = null;
        }
        if (i2 >= 29) {
            this.f13223d = Pattern.compile("rssi=([^ ]*)");
        } else {
            this.f13223d = null;
        }
    }

    public int a(CellSignalStrengthGsm cellSignalStrengthGsm) {
        return Build.VERSION.SDK_INT >= 29 ? cellSignalStrengthGsm.getBitErrorRate() : ((Integer) com.parizene.netmonitor.o0.a.c(cellSignalStrengthGsm, this.f13221b, Integer.MAX_VALUE)).intValue();
    }

    public int b(CellSignalStrengthGsm cellSignalStrengthGsm) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            return cellSignalStrengthGsm.getRssi();
        }
        if (i2 < 29) {
            return Integer.MAX_VALUE;
        }
        try {
            Matcher matcher = this.f13223d.matcher(cellSignalStrengthGsm.toString());
            if (matcher.find()) {
                return Integer.parseInt(matcher.group(1));
            }
            return Integer.MAX_VALUE;
        } catch (Exception e2) {
            m.a.a.g(e2);
            return Integer.MAX_VALUE;
        }
    }

    public int c(CellSignalStrengthGsm cellSignalStrengthGsm) {
        return ((Integer) com.parizene.netmonitor.o0.a.c(cellSignalStrengthGsm, this.a, Integer.MAX_VALUE)).intValue();
    }

    public int d(CellSignalStrengthGsm cellSignalStrengthGsm) {
        return Build.VERSION.SDK_INT >= 26 ? cellSignalStrengthGsm.getTimingAdvance() : ((Integer) com.parizene.netmonitor.o0.a.c(cellSignalStrengthGsm, this.f13222c, Integer.MAX_VALUE)).intValue();
    }
}