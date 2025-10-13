package com.parizene.netmonitor.m0.b0;

/* compiled from: MyCellSignalStrengthWcdma.java */
/* loaded from: classes.dex */
public class x extends r {

    /* renamed from: b, reason: collision with root package name */
    public final int f13312b;

    public x(int i2, int i3) {
        super(i2);
        this.f13312b = i3;
    }

    public boolean b() {
        return this.f13312b != Integer.MAX_VALUE;
    }

    @Override // com.parizene.netmonitor.m0.b0.r
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && x.class == obj.getClass() && super.equals(obj) && this.f13312b == ((x) obj).f13312b;
    }

    @Override // com.parizene.netmonitor.m0.b0.r
    public int hashCode() {
        return (super.hashCode() * 31) + this.f13312b;
    }
}