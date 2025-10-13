package com.parizene.netmonitor.ui.test;

/* compiled from: TestItem.java */
/* loaded from: classes3.dex */
public class g {
    com.parizene.netmonitor.m0.b0.a a;

    /* renamed from: b, reason: collision with root package name */
    private int f14038b;

    /* renamed from: c, reason: collision with root package name */
    private int f14039c;

    /* renamed from: d, reason: collision with root package name */
    com.parizene.netmonitor.m0.b0.b f14040d;

    public g(com.parizene.netmonitor.m0.b0.a aVar, int i2, int i3, com.parizene.netmonitor.m0.b0.b bVar) {
        this.a = aVar;
        this.f14038b = i2;
        this.f14039c = i3;
        this.f14040d = bVar;
    }

    public String a() {
        StringBuilder sb;
        if (this.f14039c == this.f14038b) {
            sb = new StringBuilder();
            sb.append("<");
            sb.append(this.f14039c);
            sb.append(">");
        } else {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f14039c);
        }
        return sb.toString();
    }
}