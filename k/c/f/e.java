package k.c.f;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* compiled from: GeoPoint.java */
/* loaded from: classes3.dex */
public class e implements k.c.a.a, Parcelable, Serializable, Cloneable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: e, reason: collision with root package name */
    private double f16745e;

    /* renamed from: f, reason: collision with root package name */
    private double f16746f;

    /* renamed from: g, reason: collision with root package name */
    private double f16747g;

    /* compiled from: GeoPoint.java */
    static class a implements Parcelable.Creator<e> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i2) {
            return new e[i2];
        }
    }

    /* synthetic */ e(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // k.c.a.a
    public double a() {
        return this.f16745e;
    }

    @Override // k.c.a.a
    public double b() {
        return this.f16746f;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public e clone() {
        return new e(this.f16746f, this.f16745e, this.f16747g);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != e.class) {
            return false;
        }
        e eVar = (e) obj;
        return eVar.f16746f == this.f16746f && eVar.f16745e == this.f16745e && eVar.f16747g == this.f16747g;
    }

    public void g(double d2, double d3) {
        this.f16746f = d2;
        this.f16745e = d3;
    }

    public int hashCode() {
        return (((((int) (this.f16746f * 1.0E-6d)) * 17) + ((int) (this.f16745e * 1.0E-6d))) * 37) + ((int) this.f16747g);
    }

    public void i(double d2) {
        this.f16746f = d2;
    }

    public void j(double d2) {
        this.f16745e = d2;
    }

    public String toString() {
        return this.f16746f + "," + this.f16745e + "," + this.f16747g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeDouble(this.f16746f);
        parcel.writeDouble(this.f16745e);
        parcel.writeDouble(this.f16747g);
    }

    @Deprecated
    public e(int i2, int i3) {
        this.f16746f = i2 / 1000000.0d;
        this.f16745e = i3 / 1000000.0d;
    }

    public e(double d2, double d3) {
        this.f16746f = d2;
        this.f16745e = d3;
    }

    public e(double d2, double d3, double d4) {
        this.f16746f = d2;
        this.f16745e = d3;
        this.f16747g = d4;
    }

    public e(Location location) {
        this(location.getLatitude(), location.getLongitude(), location.getAltitude());
    }

    public e(e eVar) {
        this.f16746f = eVar.f16746f;
        this.f16745e = eVar.f16745e;
        this.f16747g = eVar.f16747g;
    }

    private e(Parcel parcel) {
        this.f16746f = parcel.readDouble();
        this.f16745e = parcel.readDouble();
        this.f16747g = parcel.readDouble();
    }
}