package com.parizene.netmonitor.m0.b0;

/* compiled from: MyCellSignalStrengthGsm.java */
/* loaded from: classes.dex */
public class t extends r {

    /* renamed from: b, reason: collision with root package name */
    public final int f13305b;

    public t(int i2, int i3) {
        super(i2);
        this.f13305b = i3;
    }

    public int b() {
        return this.f13305b * 554;
    }

    public boolean c() {
        return this.f13305b != Integer.MAX_VALUE;
    }

    @Override // com.parizene.netmonitor.m0.b0.r
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && super.equals(obj) && this.f13305b == ((t) obj).f13305b;
    }

    @Override // com.parizene.netmonitor.m0.b0.r
    public int hashCode() {
        return (super.hashCode() * 31) + this.f13305b;
    }
}