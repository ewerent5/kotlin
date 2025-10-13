package com.parizene.netmonitor.m0.b0;

/* compiled from: MyCellSignalStrength.java */
/* loaded from: classes.dex */
public abstract class r {
    public final int a;

    public r(int i2) {
        this.a = i2;
    }

    public boolean a() {
        return this.a != Integer.MAX_VALUE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.a == ((r) obj).a;
    }

    public int hashCode() {
        return this.a;
    }
}