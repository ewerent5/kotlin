package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: FragmentManagerState.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* renamed from: e, reason: collision with root package name */
    ArrayList<r> f1059e;

    /* renamed from: f, reason: collision with root package name */
    ArrayList<String> f1060f;

    /* renamed from: g, reason: collision with root package name */
    b[] f1061g;

    /* renamed from: h, reason: collision with root package name */
    int f1062h;

    /* renamed from: i, reason: collision with root package name */
    String f1063i;

    /* compiled from: FragmentManagerState.java */
    static class a implements Parcelable.Creator<o> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public o createFromParcel(Parcel parcel) {
            return new o(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o[] newArray(int i2) {
            return new o[i2];
        }
    }

    public o() {
        this.f1063i = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedList(this.f1059e);
        parcel.writeStringList(this.f1060f);
        parcel.writeTypedArray(this.f1061g, i2);
        parcel.writeInt(this.f1062h);
        parcel.writeString(this.f1063i);
    }

    public o(Parcel parcel) {
        this.f1063i = null;
        this.f1059e = parcel.createTypedArrayList(r.CREATOR);
        this.f1060f = parcel.createStringArrayList();
        this.f1061g = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f1062h = parcel.readInt();
        this.f1063i = parcel.readString();
    }
}