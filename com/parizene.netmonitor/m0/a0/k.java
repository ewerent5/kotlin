package com.parizene.netmonitor.m0.a0;

import android.os.Build;
import android.telephony.ServiceState;
import java.lang.reflect.Method;

/* compiled from: ServiceStateExtender.java */
/* loaded from: classes.dex */
public class k {
    private final Method a;

    /* renamed from: b, reason: collision with root package name */
    private final Method f13232b;

    public k() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.a = null;
        } else {
            this.a = com.parizene.netmonitor.o0.a.b(ServiceState.class, "getVoiceRegState", new Class[0]);
        }
        this.f13232b = com.parizene.netmonitor.o0.a.b(ServiceState.class, "getDataRegState", new Class[0]);
    }

    public int[] a(ServiceState serviceState) {
        if (Build.VERSION.SDK_INT >= 28) {
            return serviceState.getCellBandwidths();
        }
        return null;
    }

    public int b(ServiceState serviceState) {
        if (Build.VERSION.SDK_INT >= 28) {
            return serviceState.getChannelNumber();
        }
        return Integer.MAX_VALUE;
    }

    public int c(ServiceState serviceState) {
        return ((Integer) com.parizene.netmonitor.o0.a.d(serviceState, this.f13232b, -1, new Object[0])).intValue();
    }

    public int d(ServiceState serviceState) {
        return ((Integer) com.parizene.netmonitor.o0.a.d(serviceState, this.a, -1, new Object[0])).intValue();
    }
}