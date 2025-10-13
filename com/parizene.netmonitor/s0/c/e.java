package com.parizene.netmonitor.s0.c;

import ch.qos.logback.core.CoreConstants;
import i.y.d.l;
import j$.time.Period;

/* compiled from: SubscriptionDetails.kt */
/* loaded from: classes3.dex */
public final class e {
    private final long a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13686b;

    /* renamed from: c, reason: collision with root package name */
    private final String f13687c;

    /* renamed from: d, reason: collision with root package name */
    private final Period f13688d;

    /* renamed from: e, reason: collision with root package name */
    private final Period f13689e;

    public e(long j2, String str, String str2, Period period, Period period2) {
        l.d(str, "priceCurrencyCode");
        l.d(str2, "price");
        l.d(period, "subscriptionPeriod");
        this.a = j2;
        this.f13686b = str;
        this.f13687c = str2;
        this.f13688d = period;
        this.f13689e = period2;
    }

    public final Period a() {
        return this.f13689e;
    }

    public final String b() {
        return this.f13687c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && l.a(this.f13686b, eVar.f13686b) && l.a(this.f13687c, eVar.f13687c) && l.a(this.f13688d, eVar.f13688d) && l.a(this.f13689e, eVar.f13689e);
    }

    public int hashCode() {
        int iA = ((((((com.parizene.netmonitor.m0.c0.e.a(this.a) * 31) + this.f13686b.hashCode()) * 31) + this.f13687c.hashCode()) * 31) + this.f13688d.hashCode()) * 31;
        Period period = this.f13689e;
        return iA + (period == null ? 0 : period.hashCode());
    }

    public String toString() {
        return "SubscriptionDetails(priceAmountMicros=" + this.a + ", priceCurrencyCode=" + this.f13686b + ", price=" + this.f13687c + ", subscriptionPeriod=" + this.f13688d + ", freeTrialPeriod=" + this.f13689e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}