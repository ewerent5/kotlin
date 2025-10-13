package com.parizene.netmonitor.m0.d0;

import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import com.parizene.netmonitor.m0.a0.m;

/* compiled from: SubscriptionManagerWrapper.java */
/* loaded from: classes.dex */
public class c {
    private final SubscriptionManager a;

    /* renamed from: b, reason: collision with root package name */
    private final m f13368b;

    public c(SubscriptionManager subscriptionManager, m mVar) {
        this.a = subscriptionManager;
        this.f13368b = mVar;
    }

    public static int c() {
        return m.c();
    }

    public static int d() {
        return m.d();
    }

    public static int e(int i2) {
        return m.e(i2);
    }

    public int[] a() {
        return this.f13368b.a(this.a);
    }

    public SubscriptionInfo b(int i2) {
        return this.f13368b.b(this.a, i2);
    }
}