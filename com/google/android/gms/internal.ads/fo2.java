package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class fo2 {
    public static final fo2 a = new fo2(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: b, reason: collision with root package name */
    public static final fo2 f5912b = new fo2(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: c, reason: collision with root package name */
    public static final fo2 f5913c = new fo2(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: d, reason: collision with root package name */
    public static final fo2 f5914d = new fo2(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: e, reason: collision with root package name */
    public final double f5915e;

    /* renamed from: f, reason: collision with root package name */
    public final double f5916f;

    /* renamed from: g, reason: collision with root package name */
    public final double f5917g;

    /* renamed from: h, reason: collision with root package name */
    public final double f5918h;

    /* renamed from: i, reason: collision with root package name */
    public final double f5919i;

    /* renamed from: j, reason: collision with root package name */
    public final double f5920j;

    /* renamed from: k, reason: collision with root package name */
    public final double f5921k;

    /* renamed from: l, reason: collision with root package name */
    public final double f5922l;

    /* renamed from: m, reason: collision with root package name */
    public final double f5923m;

    public fo2(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
        this.f5915e = d6;
        this.f5916f = d7;
        this.f5917g = d8;
        this.f5918h = d2;
        this.f5919i = d3;
        this.f5920j = d4;
        this.f5921k = d5;
        this.f5922l = d9;
        this.f5923m = d10;
    }

    public static fo2 a(ByteBuffer byteBuffer) {
        double dE = e40.e(byteBuffer);
        double dE2 = e40.e(byteBuffer);
        double dF = e40.f(byteBuffer);
        return new fo2(dE, dE2, e40.e(byteBuffer), e40.e(byteBuffer), dF, e40.f(byteBuffer), e40.f(byteBuffer), e40.e(byteBuffer), e40.e(byteBuffer));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fo2.class != obj.getClass()) {
            return false;
        }
        fo2 fo2Var = (fo2) obj;
        return Double.compare(fo2Var.f5918h, this.f5918h) == 0 && Double.compare(fo2Var.f5919i, this.f5919i) == 0 && Double.compare(fo2Var.f5920j, this.f5920j) == 0 && Double.compare(fo2Var.f5921k, this.f5921k) == 0 && Double.compare(fo2Var.f5922l, this.f5922l) == 0 && Double.compare(fo2Var.f5923m, this.f5923m) == 0 && Double.compare(fo2Var.f5915e, this.f5915e) == 0 && Double.compare(fo2Var.f5916f, this.f5916f) == 0 && Double.compare(fo2Var.f5917g, this.f5917g) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f5915e);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f5916f);
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f5917g);
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f5918h);
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f5919i);
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f5920j);
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.f5921k);
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.f5922l);
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.f5923m);
        return (((((((((((((((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31) + ((int) ((jDoubleToLongBits3 >>> 32) ^ jDoubleToLongBits3))) * 31) + ((int) ((jDoubleToLongBits4 >>> 32) ^ jDoubleToLongBits4))) * 31) + ((int) ((jDoubleToLongBits5 >>> 32) ^ jDoubleToLongBits5))) * 31) + ((int) ((jDoubleToLongBits6 >>> 32) ^ jDoubleToLongBits6))) * 31) + ((int) ((jDoubleToLongBits7 >>> 32) ^ jDoubleToLongBits7))) * 31) + ((int) (jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32)))) * 31) + ((int) ((jDoubleToLongBits9 >>> 32) ^ jDoubleToLongBits9));
    }

    public final String toString() {
        if (equals(a)) {
            return "Rotate 0°";
        }
        if (equals(f5912b)) {
            return "Rotate 90°";
        }
        if (equals(f5913c)) {
            return "Rotate 180°";
        }
        if (equals(f5914d)) {
            return "Rotate 270°";
        }
        double d2 = this.f5915e;
        double d3 = this.f5916f;
        double d4 = this.f5917g;
        double d5 = this.f5918h;
        double d6 = this.f5919i;
        double d7 = this.f5920j;
        double d8 = this.f5921k;
        double d9 = this.f5922l;
        double d10 = this.f5923m;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d2);
        sb.append(", v=");
        sb.append(d3);
        sb.append(", w=");
        sb.append(d4);
        sb.append(", a=");
        sb.append(d5);
        sb.append(", b=");
        sb.append(d6);
        sb.append(", c=");
        sb.append(d7);
        sb.append(", d=");
        sb.append(d8);
        sb.append(", tx=");
        sb.append(d9);
        sb.append(", ty=");
        sb.append(d10);
        sb.append("}");
        return sb.toString();
    }
}