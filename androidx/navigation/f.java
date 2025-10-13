package androidx.navigation;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

/* compiled from: NavBackStackEntryState.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: e, reason: collision with root package name */
    private final UUID f1277e;

    /* renamed from: f, reason: collision with root package name */
    private final int f1278f;

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f1279g;

    /* renamed from: h, reason: collision with root package name */
    private final Bundle f1280h;

    /* compiled from: NavBackStackEntryState.java */
    class a implements Parcelable.Creator<f> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i2) {
            return new f[i2];
        }
    }

    f(e eVar) {
        this.f1277e = eVar.f1273j;
        this.f1278f = eVar.b().n();
        this.f1279g = eVar.a();
        Bundle bundle = new Bundle();
        this.f1280h = bundle;
        eVar.g(bundle);
    }

    Bundle a() {
        return this.f1279g;
    }

    int b() {
        return this.f1278f;
    }

    Bundle c() {
        return this.f1280h;
    }

    UUID d() {
        return this.f1277e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f1277e.toString());
        parcel.writeInt(this.f1278f);
        parcel.writeBundle(this.f1279g);
        parcel.writeBundle(this.f1280h);
    }

    f(Parcel parcel) {
        this.f1277e = UUID.fromString(parcel.readString());
        this.f1278f = parcel.readInt();
        this.f1279g = parcel.readBundle(f.class.getClassLoader());
        this.f1280h = parcel.readBundle(f.class.getClassLoader());
    }
}