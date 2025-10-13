package com.parizene.netmonitor.m0.a0;

import android.annotation.SuppressLint;
import android.os.Build;
import android.telephony.CellInfo;
import android.telephony.CellLocation;
import android.telephony.NeighboringCellInfo;
import android.telephony.TelephonyManager;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: TelephonyManagerExtender.java */
/* loaded from: classes.dex */
public class n {
    private final Method a;

    /* renamed from: b, reason: collision with root package name */
    private final Method f13247b;

    /* renamed from: c, reason: collision with root package name */
    private final Method f13248c;

    /* renamed from: d, reason: collision with root package name */
    private final Method f13249d;

    /* renamed from: e, reason: collision with root package name */
    private final Method f13250e;

    /* renamed from: f, reason: collision with root package name */
    private final Method f13251f;

    /* renamed from: g, reason: collision with root package name */
    private final Method f13252g;

    /* renamed from: h, reason: collision with root package name */
    private final Method f13253h;

    /* renamed from: i, reason: collision with root package name */
    private final Method f13254i;

    /* renamed from: j, reason: collision with root package name */
    private final Method f13255j;

    /* renamed from: k, reason: collision with root package name */
    private Method f13256k;

    /* renamed from: l, reason: collision with root package name */
    private final Method f13257l;

    /* renamed from: m, reason: collision with root package name */
    private Method f13258m;
    private final Method n;
    private final Method o;

    public n() throws NoSuchMethodException, SecurityException {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            this.f13249d = null;
            this.f13251f = null;
            this.f13253h = null;
            this.f13255j = null;
        } else {
            Class cls = Integer.TYPE;
            this.f13249d = com.parizene.netmonitor.o0.a.b(TelephonyManager.class, "getNetworkType", cls);
            this.f13251f = com.parizene.netmonitor.o0.a.b(TelephonyManager.class, "getDataNetworkType", cls);
            this.f13253h = com.parizene.netmonitor.o0.a.b(TelephonyManager.class, "getVoiceNetworkType", cls);
            this.f13255j = com.parizene.netmonitor.o0.a.b(TelephonyManager.class, "getNetworkOperatorName", cls);
        }
        if (i2 >= 29) {
            this.f13254i = null;
        } else if (i2 >= 24) {
            this.f13254i = com.parizene.netmonitor.o0.a.b(TelephonyManager.class, "getNetworkOperator", Integer.TYPE);
        } else {
            this.f13254i = com.parizene.netmonitor.o0.a.b(TelephonyManager.class, "getNetworkOperatorForSubscription", Integer.TYPE);
        }
        if (i2 >= 23) {
            this.a = null;
        } else {
            this.a = com.parizene.netmonitor.o0.a.b(TelephonyManager.class, "getPhoneCount", new Class[0]);
        }
        if (i2 >= 26) {
            this.f13247b = null;
        } else {
            this.f13247b = com.parizene.netmonitor.o0.a.b(TelephonyManager.class, "getSimState", Integer.TYPE);
        }
        Class cls2 = Integer.TYPE;
        this.f13248c = com.parizene.netmonitor.o0.a.b(TelephonyManager.class, "isNetworkRoaming", cls2);
        Method methodB = com.parizene.netmonitor.o0.a.b(TelephonyManager.class, "getCellLocationBySubId", cls2);
        this.f13256k = methodB;
        if (methodB == null) {
            this.f13256k = com.parizene.netmonitor.o0.a.b(TelephonyManager.class, "getCellLocation", cls2);
        }
        if (this.f13256k == null) {
            this.f13256k = com.parizene.netmonitor.o0.a.b(TelephonyManager.class, "getCellLocationById", cls2);
        }
        if (this.f13256k == null) {
            this.f13256k = com.parizene.netmonitor.o0.a.b(TelephonyManager.class, "getCellLocationForSubscriber", cls2);
        }
        if (this.f13256k == null) {
            this.f13256k = com.parizene.netmonitor.o0.a.b(TelephonyManager.class, "getCellLocationForSubid", cls2);
        }
        if (this.f13256k == null) {
            this.f13256k = com.parizene.netmonitor.o0.a.b(TelephonyManager.class, "getCellLocationFromSlotId", cls2);
        }
        if (this.f13256k == null) {
            this.f13256k = com.parizene.netmonitor.o0.a.b(TelephonyManager.class, "getCellLocationForSlotID", cls2);
        }
        if (this.f13256k == null) {
            this.f13256k = com.parizene.netmonitor.o0.a.b(TelephonyManager.class, "getCellLocationForPhone", cls2);
        }
        Method methodB2 = com.parizene.netmonitor.o0.a.b(TelephonyManager.class, "getAllCellInfo", cls2);
        this.f13258m = methodB2;
        if (methodB2 == null) {
            this.f13258m = com.parizene.netmonitor.o0.a.b(TelephonyManager.class, "getAllCellInfoForSubscriber", cls2);
        }
        if (i2 >= 24) {
            this.f13250e = null;
            this.f13252g = null;
        } else {
            this.f13250e = com.parizene.netmonitor.o0.a.b(TelephonyManager.class, "getDataNetworkType", new Class[0]);
            this.f13252g = com.parizene.netmonitor.o0.a.b(TelephonyManager.class, "getVoiceNetworkType", new Class[0]);
        }
        if (i2 >= 29) {
            this.f13257l = null;
        } else {
            this.f13257l = com.parizene.netmonitor.o0.a.b(TelephonyManager.class, "getNeighboringCellInfo", new Class[0]);
        }
        if (i2 < 28 && i2 >= 27) {
            this.n = com.parizene.netmonitor.o0.a.b(TelephonyManager.class, "getSignalStrength", new Class[0]);
        } else {
            this.n = null;
        }
        if (i2 >= 26) {
            this.o = null;
        } else if (i2 >= 24) {
            this.o = com.parizene.netmonitor.o0.a.b(TelephonyManager.class, "getServiceStateForSubscriber", cls2);
        } else {
            this.o = null;
        }
    }

    public TelephonyManager a(TelephonyManager telephonyManager, int i2) {
        return telephonyManager.createForSubscriptionId(i2);
    }

    public List<CellInfo> b(TelephonyManager telephonyManager, int i2) {
        return (List) com.parizene.netmonitor.o0.a.d(telephonyManager, this.f13258m, null, Integer.valueOf(i2));
    }

    public CellLocation c(TelephonyManager telephonyManager, int i2) {
        return (CellLocation) com.parizene.netmonitor.o0.a.d(telephonyManager, this.f13256k, null, Integer.valueOf(i2));
    }

    @SuppressLint({"MissingPermission"})
    public int d(TelephonyManager telephonyManager) {
        return Build.VERSION.SDK_INT >= 24 ? telephonyManager.getDataNetworkType() : ((Integer) com.parizene.netmonitor.o0.a.d(telephonyManager, this.f13250e, 0, new Object[0])).intValue();
    }

    public int e(TelephonyManager telephonyManager, int i2) {
        return ((Integer) com.parizene.netmonitor.o0.a.d(telephonyManager, this.f13251f, 0, Integer.valueOf(i2))).intValue();
    }

    public List<NeighboringCellInfo> f(TelephonyManager telephonyManager) {
        return (List) com.parizene.netmonitor.o0.a.d(telephonyManager, this.f13257l, null, new Object[0]);
    }

    public String g(TelephonyManager telephonyManager, int i2) {
        return (String) com.parizene.netmonitor.o0.a.d(telephonyManager, this.f13254i, null, Integer.valueOf(i2));
    }

    public String h(TelephonyManager telephonyManager, int i2) {
        return (String) com.parizene.netmonitor.o0.a.d(telephonyManager, this.f13255j, null, Integer.valueOf(i2));
    }

    public int i(TelephonyManager telephonyManager, int i2) {
        return ((Integer) com.parizene.netmonitor.o0.a.d(telephonyManager, this.f13249d, 0, Integer.valueOf(i2))).intValue();
    }

    public int j(TelephonyManager telephonyManager) {
        int i2 = Build.VERSION.SDK_INT;
        return i2 >= 30 ? telephonyManager.getActiveModemCount() : i2 >= 23 ? telephonyManager.getPhoneCount() : ((Integer) com.parizene.netmonitor.o0.a.d(telephonyManager, this.a, -1, new Object[0])).intValue();
    }

    public int k(TelephonyManager telephonyManager, int i2) {
        return Build.VERSION.SDK_INT >= 26 ? telephonyManager.getSimState(i2) : ((Integer) com.parizene.netmonitor.o0.a.d(telephonyManager, this.f13247b, 0, Integer.valueOf(i2))).intValue();
    }

    @SuppressLint({"MissingPermission"})
    public int l(TelephonyManager telephonyManager) {
        return Build.VERSION.SDK_INT >= 24 ? telephonyManager.getVoiceNetworkType() : ((Integer) com.parizene.netmonitor.o0.a.d(telephonyManager, this.f13252g, 0, new Object[0])).intValue();
    }

    public int m(TelephonyManager telephonyManager, int i2) {
        return ((Integer) com.parizene.netmonitor.o0.a.d(telephonyManager, this.f13253h, 0, Integer.valueOf(i2))).intValue();
    }

    public boolean n() {
        return this.f13258m != null;
    }

    public boolean o() {
        return this.f13256k != null;
    }

    public boolean p(TelephonyManager telephonyManager, int i2) {
        return ((Boolean) com.parizene.netmonitor.o0.a.d(telephonyManager, this.f13248c, Boolean.FALSE, Integer.valueOf(i2))).booleanValue();
    }

    @SuppressLint({"MissingPermission"})
    public void q(TelephonyManager telephonyManager, Executor executor, TelephonyManager.CellInfoCallback cellInfoCallback) {
        telephonyManager.requestCellInfoUpdate(executor, cellInfoCallback);
    }
}