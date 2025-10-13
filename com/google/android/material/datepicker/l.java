package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* compiled from: Month.java */
/* loaded from: classes.dex */
final class l implements Comparable<l>, Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: e, reason: collision with root package name */
    private final Calendar f11595e;

    /* renamed from: f, reason: collision with root package name */
    final int f11596f;

    /* renamed from: g, reason: collision with root package name */
    final int f11597g;

    /* renamed from: h, reason: collision with root package name */
    final int f11598h;

    /* renamed from: i, reason: collision with root package name */
    final int f11599i;

    /* renamed from: j, reason: collision with root package name */
    final long f11600j;

    /* renamed from: k, reason: collision with root package name */
    private String f11601k;

    /* compiled from: Month.java */
    static class a implements Parcelable.Creator<l> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            return l.b(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i2) {
            return new l[i2];
        }
    }

    private l(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarD = s.d(calendar);
        this.f11595e = calendarD;
        this.f11596f = calendarD.get(2);
        this.f11597g = calendarD.get(1);
        this.f11598h = calendarD.getMaximum(7);
        this.f11599i = calendarD.getActualMaximum(5);
        this.f11600j = calendarD.getTimeInMillis();
    }

    static l b(int i2, int i3) {
        Calendar calendarK = s.k();
        calendarK.set(1, i2);
        calendarK.set(2, i3);
        return new l(calendarK);
    }

    static l c(long j2) {
        Calendar calendarK = s.k();
        calendarK.setTimeInMillis(j2);
        return new l(calendarK);
    }

    static l d() {
        return new l(s.i());
    }

    long A() {
        return this.f11595e.getTimeInMillis();
    }

    l B(int i2) {
        Calendar calendarD = s.d(this.f11595e);
        calendarD.add(2, i2);
        return new l(calendarD);
    }

    int C(l lVar) {
        if (this.f11595e instanceof GregorianCalendar) {
            return ((lVar.f11597g - this.f11597g) * 12) + (lVar.f11596f - this.f11596f);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(l lVar) {
        return this.f11595e.compareTo(lVar.f11595e);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f11596f == lVar.f11596f && this.f11597g == lVar.f11597g;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11596f), Integer.valueOf(this.f11597g)});
    }

    int j() {
        int firstDayOfWeek = this.f11595e.get(7) - this.f11595e.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f11598h : firstDayOfWeek;
    }

    long q(int i2) {
        Calendar calendarD = s.d(this.f11595e);
        calendarD.set(5, i2);
        return calendarD.getTimeInMillis();
    }

    int s(long j2) {
        Calendar calendarD = s.d(this.f11595e);
        calendarD.setTimeInMillis(j2);
        return calendarD.get(5);
    }

    String v(Context context) {
        if (this.f11601k == null) {
            this.f11601k = e.c(context, this.f11595e.getTimeInMillis());
        }
        return this.f11601k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f11597g);
        parcel.writeInt(this.f11596f);
    }
}