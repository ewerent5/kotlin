package com.parizene.netmonitor.m0;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;

/* compiled from: SubscriptionIdsInfo.java */
/* loaded from: classes.dex */
public class t {
    final int a;

    /* renamed from: b, reason: collision with root package name */
    final int f13520b;

    /* renamed from: c, reason: collision with root package name */
    final int[] f13521c;

    public t(int i2, int i3, int[] iArr) {
        this.a = i2;
        this.f13520b = i3;
        this.f13521c = iArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        if (this.a == tVar.a && this.f13520b == tVar.f13520b) {
            return Arrays.equals(this.f13521c, tVar.f13521c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.a * 31) + this.f13520b) * 31) + Arrays.hashCode(this.f13521c);
    }

    public String toString() {
        return "SubscriptionIdsInfo{defaultSubscriptionId=" + this.a + ", defaultDataSubscriptionId=" + this.f13520b + ", subscriptionIds=" + Arrays.toString(this.f13521c) + CoreConstants.CURLY_RIGHT;
    }
}