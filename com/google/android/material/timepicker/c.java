package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: TimeModel.java */
/* loaded from: classes.dex */
class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: e, reason: collision with root package name */
    private final com.google.android.material.timepicker.a f11895e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.android.material.timepicker.a f11896f;

    /* renamed from: g, reason: collision with root package name */
    final int f11897g;

    /* renamed from: h, reason: collision with root package name */
    int f11898h;

    /* renamed from: i, reason: collision with root package name */
    int f11899i;

    /* renamed from: j, reason: collision with root package name */
    int f11900j;

    /* renamed from: k, reason: collision with root package name */
    int f11901k;

    /* compiled from: TimeModel.java */
    static class a implements Parcelable.Creator<c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i2) {
            return new c[i2];
        }
    }

    public c() {
        this(0);
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, "%02d");
    }

    public static String b(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    private static int c(int i2) {
        return i2 >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f11898h == cVar.f11898h && this.f11899i == cVar.f11899i && this.f11897g == cVar.f11897g && this.f11900j == cVar.f11900j;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11897g), Integer.valueOf(this.f11898h), Integer.valueOf(this.f11899i), Integer.valueOf(this.f11900j)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f11898h);
        parcel.writeInt(this.f11899i);
        parcel.writeInt(this.f11900j);
        parcel.writeInt(this.f11897g);
    }

    public c(int i2) {
        this(0, 0, 10, i2);
    }

    public c(int i2, int i3, int i4, int i5) {
        this.f11898h = i2;
        this.f11899i = i3;
        this.f11900j = i4;
        this.f11897g = i5;
        this.f11901k = c(i2);
        this.f11895e = new com.google.android.material.timepicker.a(59);
        this.f11896f = new com.google.android.material.timepicker.a(i5 == 1 ? 24 : 12);
    }

    protected c(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}