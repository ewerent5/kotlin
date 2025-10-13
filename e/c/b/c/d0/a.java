package e.c.b.c.d0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c.e.g;

/* compiled from: ExtendableSavedState.java */
/* loaded from: classes.dex */
public class a extends c.j.a.a {
    public static final Parcelable.Creator<a> CREATOR = new C0179a();

    /* renamed from: g, reason: collision with root package name */
    public final g<String, Bundle> f15196g;

    /* compiled from: ExtendableSavedState.java */
    /* renamed from: e.c.b.c.d0.a$a, reason: collision with other inner class name */
    static class C0179a implements Parcelable.ClassLoaderCreator<a> {
        C0179a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i2) {
            return new a[i2];
        }
    }

    /* synthetic */ a(Parcel parcel, ClassLoader classLoader, C0179a c0179a) {
        this(parcel, classLoader);
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f15196g + "}";
    }

    @Override // c.j.a.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        int size = this.f15196g.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i3 = 0; i3 < size; i3++) {
            strArr[i3] = this.f15196g.i(i3);
            bundleArr[i3] = this.f15196g.m(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f15196g = new g<>();
    }

    private a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i2 = parcel.readInt();
        String[] strArr = new String[i2];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i2];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f15196g = new g<>(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            this.f15196g.put(strArr[i3], bundleArr[i3]);
        }
    }
}