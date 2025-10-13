package com.parizene.netmonitor.m0.b0;

/* compiled from: MyCellSignalStrengthTdscdma.java */
/* loaded from: classes.dex */
public class w extends r {

    /* renamed from: b, reason: collision with root package name */
    public final int f13311b;

    public w(int i2, int i3) {
        super(i2);
        this.f13311b = i3;
    }

    public boolean b() {
        return this.f13311b != Integer.MAX_VALUE;
    }

    @Override // com.parizene.netmonitor.m0.b0.r
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && w.class == obj.getClass() && super.equals(obj) && this.f13311b == ((w) obj).f13311b;
    }

    @Override // com.parizene.netmonitor.m0.b0.r
    public int hashCode() {
        return (super.hashCode() * 31) + this.f13311b;
    }
}