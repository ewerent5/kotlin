package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.a;
import java.util.Arrays;

/* compiled from: DateValidatorPointForward.java */
/* loaded from: classes.dex */
public class f implements a.c {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: e, reason: collision with root package name */
    private final long f11571e;

    /* compiled from: DateValidatorPointForward.java */
    static class a implements Parcelable.Creator<f> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i2) {
            return new f[i2];
        }
    }

    /* synthetic */ f(long j2, a aVar) {
        this(j2);
    }

    public static f a(long j2) {
        return new f(j2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f11571e == ((f) obj).f11571e;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11571e)});
    }

    @Override // com.google.android.material.datepicker.a.c
    public boolean t(long j2) {
        return j2 >= this.f11571e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f11571e);
    }

    private f(long j2) {
        this.f11571e = j2;
    }
}