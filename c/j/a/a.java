package c.j.a;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: AbsSavedState.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public abstract class a implements Parcelable {

    /* renamed from: f */
    private final Parcelable f3190f;

    /* renamed from: e */
    public static final a f3189e = new C0061a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* compiled from: AbsSavedState.java */
    /* renamed from: c.j.a.a$a */
    class C0061a extends a {
        C0061a() {
            super((C0061a) null);
        }
    }

    /* compiled from: AbsSavedState.java */
    class b implements Parcelable.ClassLoaderCreator<a> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f3189e;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public a[] newArray(int i2) {
            return new a[i2];
        }
    }

    /* synthetic */ a(C0061a c0061a) {
        this();
    }

    public final Parcelable a() {
        return this.f3190f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f3190f, i2);
    }

    private a() {
        this.f3190f = null;
    }

    protected a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f3190f = parcelable == f3189e ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected a(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f3190f = parcelable == null ? f3189e : parcelable;
    }
}