package k.c.f;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* compiled from: BoundingBox.java */
/* loaded from: classes3.dex */
public class a implements Parcelable, Serializable {
    public static final Parcelable.Creator<a> CREATOR = new C0214a();

    /* renamed from: e, reason: collision with root package name */
    private double f16719e;

    /* renamed from: f, reason: collision with root package name */
    private double f16720f;

    /* renamed from: g, reason: collision with root package name */
    private double f16721g;

    /* renamed from: h, reason: collision with root package name */
    private double f16722h;

    /* compiled from: BoundingBox.java */
    /* renamed from: k.c.f.a$a, reason: collision with other inner class name */
    static class C0214a implements Parcelable.Creator<a> {
        C0214a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return a.A(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i2) {
            return new a[i2];
        }
    }

    public a(double d2, double d3, double d4, double d5) {
        B(d2, d3, d4, d5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static a A(Parcel parcel) {
        return new a(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
    }

    public void B(double d2, double d3, double d4, double d5) {
        this.f16719e = d2;
        this.f16721g = d3;
        this.f16720f = d4;
        this.f16722h = d5;
        t tileSystem = k.c.g.d.getTileSystem();
        if (!tileSystem.H(d2)) {
            throw new IllegalArgumentException("north must be in " + tileSystem.K());
        }
        if (!tileSystem.H(d4)) {
            throw new IllegalArgumentException("south must be in " + tileSystem.K());
        }
        if (!tileSystem.I(d5)) {
            throw new IllegalArgumentException("west must be in " + tileSystem.L());
        }
        if (tileSystem.I(d3)) {
            return;
        }
        throw new IllegalArgumentException("east must be in " + tileSystem.L());
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a clone() {
        return new a(this.f16719e, this.f16721g, this.f16720f, this.f16722h);
    }

    public double c() {
        return Math.max(this.f16719e, this.f16720f);
    }

    public double d() {
        return Math.min(this.f16719e, this.f16720f);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public double g() {
        return this.f16719e;
    }

    public double i() {
        return this.f16720f;
    }

    public double j() {
        return Math.abs(this.f16719e - this.f16720f);
    }

    public double q() {
        return this.f16721g;
    }

    public double s() {
        return this.f16722h;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("N:");
        stringBuffer.append(this.f16719e);
        stringBuffer.append("; E:");
        stringBuffer.append(this.f16721g);
        stringBuffer.append("; S:");
        stringBuffer.append(this.f16720f);
        stringBuffer.append("; W:");
        stringBuffer.append(this.f16722h);
        return stringBuffer.toString();
    }

    @Deprecated
    public double v() {
        return Math.abs(this.f16721g - this.f16722h);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeDouble(this.f16719e);
        parcel.writeDouble(this.f16721g);
        parcel.writeDouble(this.f16720f);
        parcel.writeDouble(this.f16722h);
    }

    public a() {
    }
}