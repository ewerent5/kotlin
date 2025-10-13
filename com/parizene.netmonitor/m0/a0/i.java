package com.parizene.netmonitor.m0.a0;

import android.os.Build;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthWcdma;
import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: CellSignalStrengthWcdmaExtender.java */
/* loaded from: classes.dex */
public class i {
    private final Field a;

    /* renamed from: b, reason: collision with root package name */
    private final Field f13228b;

    /* renamed from: c, reason: collision with root package name */
    private final Pattern f13229c;

    /* renamed from: d, reason: collision with root package name */
    private final Pattern f13230d;

    /* renamed from: e, reason: collision with root package name */
    private final Pattern f13231e;

    public i() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            this.a = null;
        } else {
            this.a = com.parizene.netmonitor.o0.a.a(CellSignalStrengthGsm.class, "mSignalStrength");
        }
        this.f13228b = com.parizene.netmonitor.o0.a.a(CellSignalStrengthWcdma.class, "mBitErrorRate");
        if (i2 >= 29) {
            this.f13229c = Pattern.compile("ss=([^ ]*)");
            this.f13230d = Pattern.compile("rscp=([^ ]*)");
            this.f13231e = Pattern.compile("ecno=([^ ]*)");
        } else {
            this.f13229c = null;
            this.f13230d = null;
            this.f13231e = null;
        }
    }

    public int a(CellSignalStrengthWcdma cellSignalStrengthWcdma) {
        return ((Integer) com.parizene.netmonitor.o0.a.c(cellSignalStrengthWcdma, this.f13228b, Integer.MAX_VALUE)).intValue();
    }

    public int b(CellSignalStrengthWcdma cellSignalStrengthWcdma) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            return cellSignalStrengthWcdma.getEcNo();
        }
        if (i2 < 29) {
            return Integer.MAX_VALUE;
        }
        try {
            Matcher matcher = this.f13231e.matcher(cellSignalStrengthWcdma.toString());
            if (matcher.find()) {
                return Integer.parseInt(matcher.group(1));
            }
            return Integer.MAX_VALUE;
        } catch (Exception e2) {
            m.a.a.g(e2);
            return Integer.MAX_VALUE;
        }
    }

    public int c(CellSignalStrengthWcdma cellSignalStrengthWcdma) {
        if (Build.VERSION.SDK_INT < 29) {
            return Integer.MAX_VALUE;
        }
        try {
            Matcher matcher = this.f13230d.matcher(cellSignalStrengthWcdma.toString());
            if (matcher.find()) {
                return Integer.parseInt(matcher.group(1));
            }
            return Integer.MAX_VALUE;
        } catch (Exception e2) {
            m.a.a.g(e2);
            return Integer.MAX_VALUE;
        }
    }

    public int d(CellSignalStrengthWcdma cellSignalStrengthWcdma) {
        Pattern pattern = this.f13229c;
        if (pattern == null) {
            return Integer.MAX_VALUE;
        }
        try {
            Matcher matcher = pattern.matcher(cellSignalStrengthWcdma.toString());
            if (matcher.find()) {
                return Integer.parseInt(matcher.group(1));
            }
            return Integer.MAX_VALUE;
        } catch (Exception e2) {
            m.a.a.g(e2);
            return Integer.MAX_VALUE;
        }
    }

    public int e(CellSignalStrengthWcdma cellSignalStrengthWcdma) {
        return ((Integer) com.parizene.netmonitor.o0.a.c(cellSignalStrengthWcdma, this.a, Integer.MAX_VALUE)).intValue();
    }
}