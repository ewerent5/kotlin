package com.parizene.netmonitor.r0.g;

import ch.qos.logback.core.CoreConstants;
import com.parizene.netmonitor.r0.e;

/* compiled from: OpencellidGeolocation.java */
/* loaded from: classes3.dex */
class a implements com.parizene.netmonitor.r0.b {
    private double a;

    /* renamed from: b, reason: collision with root package name */
    private double f13654b;

    /* renamed from: c, reason: collision with root package name */
    private int f13655c;

    /* renamed from: d, reason: collision with root package name */
    private String f13656d;

    a() {
    }

    @Override // com.parizene.netmonitor.r0.b
    public double a() {
        return this.f13654b;
    }

    @Override // com.parizene.netmonitor.r0.b
    public double b() {
        return this.a;
    }

    @Override // com.parizene.netmonitor.r0.b
    public e c() {
        return e.OPENCELLID;
    }

    @Override // com.parizene.netmonitor.r0.b
    public double d() {
        return this.f13655c;
    }

    @Override // com.parizene.netmonitor.r0.b
    public boolean isEmpty() {
        return this.a == 0.0d && this.f13654b == 0.0d && this.f13655c == 0 && this.f13656d == null;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("OpencellidGeolocation{");
        if (isEmpty()) {
            str = "empty";
        } else {
            str = "lat=" + this.a + ", lon=" + this.f13654b + ", accuracy=" + this.f13655c + ", address='" + this.f13656d + "'";
        }
        sb.append(str);
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }

    a(double d2, double d3, int i2, String str) {
        this.a = d2;
        this.f13654b = d3;
        this.f13655c = i2;
        this.f13656d = str;
    }
}