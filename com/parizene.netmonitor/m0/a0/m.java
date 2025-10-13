package com.parizene.netmonitor.m0.a0;

import android.annotation.SuppressLint;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import java.lang.reflect.Method;

/* compiled from: SubscriptionManagerExtender.java */
/* loaded from: classes.dex */
public class m {
    private static Method a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f13244b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f13245c;

    /* renamed from: d, reason: collision with root package name */
    private final Method f13246d;

    public m() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            a = null;
            f13244b = null;
        } else {
            a = com.parizene.netmonitor.o0.a.b(SubscriptionManager.class, "getDefaultSubId", new Class[0]);
            f13244b = com.parizene.netmonitor.o0.a.b(SubscriptionManager.class, "getDefaultDataSubId", new Class[0]);
        }
        this.f13246d = com.parizene.netmonitor.o0.a.b(SubscriptionManager.class, "getActiveSubscriptionIdList", new Class[0]);
        if (i2 >= 29) {
            f13245c = null;
        } else if (i2 >= 26) {
            f13245c = com.parizene.netmonitor.o0.a.b(SubscriptionManager.class, "getSlotIndex", Integer.TYPE);
        } else {
            f13245c = com.parizene.netmonitor.o0.a.b(SubscriptionManager.class, "getSlotId", Integer.TYPE);
        }
    }

    public static int c() {
        return Build.VERSION.SDK_INT >= 24 ? SubscriptionManager.getDefaultDataSubscriptionId() : ((Integer) com.parizene.netmonitor.o0.a.d(null, f13244b, -1, new Object[0])).intValue();
    }

    public static int d() {
        return Build.VERSION.SDK_INT >= 24 ? SubscriptionManager.getDefaultSubscriptionId() : ((Integer) com.parizene.netmonitor.o0.a.d(null, a, -1, new Object[0])).intValue();
    }

    public static int e(int i2) {
        return Build.VERSION.SDK_INT >= 29 ? SubscriptionManager.getSlotIndex(i2) : ((Integer) com.parizene.netmonitor.o0.a.d(null, f13245c, -1, Integer.valueOf(i2))).intValue();
    }

    public int[] a(SubscriptionManager subscriptionManager) {
        return (int[]) com.parizene.netmonitor.o0.a.d(subscriptionManager, this.f13246d, null, new Object[0]);
    }

    @SuppressLint({"MissingPermission"})
    public SubscriptionInfo b(SubscriptionManager subscriptionManager, int i2) {
        return subscriptionManager.getActiveSubscriptionInfoForSimSlotIndex(i2);
    }
}