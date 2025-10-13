package com.parizene.netmonitor.r0.f;

import ch.qos.logback.core.CoreConstants;
import com.parizene.netmonitor.r0.e;

/* compiled from: MylnikovGeolocation.java */
/* loaded from: classes3.dex */
public class a implements com.parizene.netmonitor.r0.b {
    private double a;

    /* renamed from: b, reason: collision with root package name */
    private double f13651b;

    /* renamed from: c, reason: collision with root package name */
    private double f13652c;

    a() {
    }

    @Override // com.parizene.netmonitor.r0.b
    public double a() {
        return this.f13651b;
    }

    @Override // com.parizene.netmonitor.r0.b
    public double b() {
        return this.a;
    }

    @Override // com.parizene.netmonitor.r0.b
    public e c() {
        return e.MYLNIKOV;
    }

    @Override // com.parizene.netmonitor.r0.b
    public double d() {
        return this.f13652c;
    }

    @Override // com.parizene.netmonitor.r0.b
    public boolean isEmpty() {
        return this.a == 0.0d && this.f13651b == 0.0d && this.f13652c == 0.0d;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("MylnikovGeolocation{");
        if (isEmpty()) {
            str = "empty";
        } else {
            str = "lat=" + this.a + ", lon=" + this.f13651b + ", range=" + this.f13652c;
        }
        sb.append(str);
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }

    a(double d2, double d3, double d4) {
        this.a = d2;
        this.f13651b = d3;
        this.f13652c = d4;
    }
}