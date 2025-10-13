package com.parizene.netmonitor.m0.a0;

import android.os.Build;
import android.telephony.CellSignalStrength;
import android.telephony.SignalStrength;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* compiled from: SignalStrengthExtender.java */
/* loaded from: classes.dex */
public class l {
    private final Field a;

    /* renamed from: b, reason: collision with root package name */
    private final Field f13233b;

    /* renamed from: c, reason: collision with root package name */
    private final Field f13234c;

    /* renamed from: d, reason: collision with root package name */
    private final Field f13235d;

    /* renamed from: e, reason: collision with root package name */
    private final Field f13236e;

    /* renamed from: f, reason: collision with root package name */
    private final Field f13237f;

    /* renamed from: g, reason: collision with root package name */
    private final Method f13238g;

    /* renamed from: h, reason: collision with root package name */
    private final Field f13239h;

    /* renamed from: i, reason: collision with root package name */
    private final Field f13240i;

    /* renamed from: j, reason: collision with root package name */
    private final Method f13241j;

    /* renamed from: k, reason: collision with root package name */
    private final Method f13242k;

    /* renamed from: l, reason: collision with root package name */
    private final Method f13243l;

    public l() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            this.a = null;
            this.f13233b = null;
            this.f13234c = null;
            this.f13235d = null;
            this.f13236e = null;
            this.f13240i = null;
            this.f13239h = null;
            this.f13237f = null;
            this.f13238g = null;
            this.f13241j = null;
            this.f13242k = null;
            this.f13243l = null;
            return;
        }
        this.a = com.parizene.netmonitor.o0.a.a(SignalStrength.class, "mLteSignalStrength");
        this.f13233b = com.parizene.netmonitor.o0.a.a(SignalStrength.class, "mLteRsrp");
        this.f13234c = com.parizene.netmonitor.o0.a.a(SignalStrength.class, "mLteRsrq");
        this.f13235d = com.parizene.netmonitor.o0.a.a(SignalStrength.class, "mLteRssnr");
        this.f13236e = com.parizene.netmonitor.o0.a.a(SignalStrength.class, "mLteCqi");
        this.f13240i = com.parizene.netmonitor.o0.a.a(SignalStrength.class, "mWcdmaRscp");
        if (i2 >= 26) {
            this.f13239h = com.parizene.netmonitor.o0.a.a(SignalStrength.class, "mLteRsrpBoost");
        } else {
            this.f13239h = null;
        }
        if (i2 >= 24) {
            this.f13237f = com.parizene.netmonitor.o0.a.a(SignalStrength.class, "mTdScdmaRscp");
        } else {
            this.f13237f = null;
        }
        if (i2 >= 24) {
            this.f13238g = com.parizene.netmonitor.o0.a.b(SignalStrength.class, "getTdScdmaDbm", new Class[0]);
        } else {
            this.f13238g = null;
        }
        this.f13241j = com.parizene.netmonitor.o0.a.b(SignalStrength.class, "getDbm", new Class[0]);
        this.f13242k = com.parizene.netmonitor.o0.a.b(SignalStrength.class, "getGsmDbm", new Class[0]);
        this.f13243l = com.parizene.netmonitor.o0.a.b(SignalStrength.class, "getLteDbm", new Class[0]);
    }

    public List<CellSignalStrength> a(SignalStrength signalStrength) {
        return Build.VERSION.SDK_INT >= 29 ? signalStrength.getCellSignalStrengths() : Collections.emptyList();
    }

    public <T extends CellSignalStrength> List<T> b(SignalStrength signalStrength, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? signalStrength.getCellSignalStrengths(cls) : Collections.emptyList();
    }

    public int c(SignalStrength signalStrength) {
        return ((Integer) com.parizene.netmonitor.o0.a.d(signalStrength, this.f13241j, Integer.MAX_VALUE, new Object[0])).intValue();
    }

    public int d(SignalStrength signalStrength) {
        return ((Integer) com.parizene.netmonitor.o0.a.d(signalStrength, this.f13242k, Integer.MAX_VALUE, new Object[0])).intValue();
    }

    public int e(SignalStrength signalStrength) {
        return ((Integer) com.parizene.netmonitor.o0.a.c(signalStrength, this.f13236e, Integer.MAX_VALUE)).intValue();
    }

    public int f(SignalStrength signalStrength) {
        return ((Integer) com.parizene.netmonitor.o0.a.d(signalStrength, this.f13243l, Integer.MAX_VALUE, new Object[0])).intValue();
    }

    public int g(SignalStrength signalStrength) {
        return ((Integer) com.parizene.netmonitor.o0.a.c(signalStrength, this.f13233b, Integer.MAX_VALUE)).intValue();
    }

    public int h(SignalStrength signalStrength) {
        return ((Integer) com.parizene.netmonitor.o0.a.c(signalStrength, this.f13239h, 0)).intValue();
    }

    public int i(SignalStrength signalStrength) {
        return ((Integer) com.parizene.netmonitor.o0.a.c(signalStrength, this.f13234c, Integer.MAX_VALUE)).intValue();
    }

    public int j(SignalStrength signalStrength) {
        return ((Integer) com.parizene.netmonitor.o0.a.c(signalStrength, this.f13235d, Integer.MAX_VALUE)).intValue();
    }

    public int k(SignalStrength signalStrength) {
        return ((Integer) com.parizene.netmonitor.o0.a.c(signalStrength, this.a, 99)).intValue();
    }

    public int l(SignalStrength signalStrength) {
        return ((Integer) com.parizene.netmonitor.o0.a.d(signalStrength, this.f13238g, Integer.MAX_VALUE, new Object[0])).intValue();
    }

    public int m(SignalStrength signalStrength) {
        return ((Integer) com.parizene.netmonitor.o0.a.c(signalStrength, this.f13237f, Integer.MAX_VALUE)).intValue();
    }

    public long n(SignalStrength signalStrength) {
        if (Build.VERSION.SDK_INT >= 30) {
            return signalStrength.getTimestampMillis();
        }
        return 0L;
    }

    public int o(SignalStrength signalStrength) {
        return ((Integer) com.parizene.netmonitor.o0.a.c(signalStrength, this.f13240i, Integer.MAX_VALUE)).intValue();
    }
}