package com.parizene.netmonitor.r0.h;

import ch.qos.logback.core.CoreConstants;
import com.parizene.netmonitor.r0.e;

/* compiled from: YandexGeolocation.java */
/* loaded from: classes3.dex */
class a implements com.parizene.netmonitor.r0.b {
    private double a;

    /* renamed from: b, reason: collision with root package name */
    private double f13658b;

    /* renamed from: c, reason: collision with root package name */
    private double f13659c;

    /* renamed from: d, reason: collision with root package name */
    private double f13660d;

    /* renamed from: e, reason: collision with root package name */
    private double f13661e;

    a() {
    }

    @Override // com.parizene.netmonitor.r0.b
    public double a() {
        return this.f13658b;
    }

    @Override // com.parizene.netmonitor.r0.b
    public double b() {
        return this.a;
    }

    @Override // com.parizene.netmonitor.r0.b
    public e c() {
        return e.YANDEX;
    }

    @Override // com.parizene.netmonitor.r0.b
    public double d() {
        return this.f13659c;
    }

    @Override // com.parizene.netmonitor.r0.b
    public boolean isEmpty() {
        return this.a == 0.0d && this.f13658b == 0.0d && this.f13659c == 0.0d && this.f13660d == 0.0d && this.f13661e == 0.0d;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("YandexGeolocation{");
        if (isEmpty()) {
            str = "empty";
        } else {
            str = "latitude=" + this.a + ", longitude=" + this.f13658b + ", precision=" + this.f13659c + ", altitude=" + this.f13660d + ", altitudePrecision=" + this.f13661e;
        }
        sb.append(str);
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }

    a(double d2, double d3, double d4, double d5, double d6) {
        this.a = d2;
        this.f13658b = d3;
        this.f13659c = d4;
        this.f13660d = d5;
        this.f13661e = d6;
    }
}