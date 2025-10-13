package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: CalendarConstraints.java */
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0118a();

    /* renamed from: e, reason: collision with root package name */
    private final l f11548e;

    /* renamed from: f, reason: collision with root package name */
    private final l f11549f;

    /* renamed from: g, reason: collision with root package name */
    private final c f11550g;

    /* renamed from: h, reason: collision with root package name */
    private l f11551h;

    /* renamed from: i, reason: collision with root package name */
    private final int f11552i;

    /* renamed from: j, reason: collision with root package name */
    private final int f11553j;

    /* compiled from: CalendarConstraints.java */
    /* renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    static class C0118a implements Parcelable.Creator<a> {
        C0118a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a((l) parcel.readParcelable(l.class.getClassLoader()), (l) parcel.readParcelable(l.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (l) parcel.readParcelable(l.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i2) {
            return new a[i2];
        }
    }

    /* compiled from: CalendarConstraints.java */
    public static final class b {
        static final long a = s.a(l.b(1900, 0).f11600j);

        /* renamed from: b, reason: collision with root package name */
        static final long f11554b = s.a(l.b(2100, 11).f11600j);

        /* renamed from: c, reason: collision with root package name */
        private long f11555c;

        /* renamed from: d, reason: collision with root package name */
        private long f11556d;

        /* renamed from: e, reason: collision with root package name */
        private Long f11557e;

        /* renamed from: f, reason: collision with root package name */
        private c f11558f;

        b(a aVar) {
            this.f11555c = a;
            this.f11556d = f11554b;
            this.f11558f = f.a(Long.MIN_VALUE);
            this.f11555c = aVar.f11548e.f11600j;
            this.f11556d = aVar.f11549f.f11600j;
            this.f11557e = Long.valueOf(aVar.f11551h.f11600j);
            this.f11558f = aVar.f11550g;
        }

        public a a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f11558f);
            l lVarC = l.c(this.f11555c);
            l lVarC2 = l.c(this.f11556d);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l2 = this.f11557e;
            return new a(lVarC, lVarC2, cVar, l2 == null ? null : l.c(l2.longValue()), null);
        }

        public b b(long j2) {
            this.f11557e = Long.valueOf(j2);
            return this;
        }
    }

    /* compiled from: CalendarConstraints.java */
    public interface c extends Parcelable {
        boolean t(long j2);
    }

    /* synthetic */ a(l lVar, l lVar2, c cVar, l lVar3, C0118a c0118a) {
        this(lVar, lVar2, cVar, lVar3);
    }

    int A() {
        return this.f11552i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f11548e.equals(aVar.f11548e) && this.f11549f.equals(aVar.f11549f) && c.h.k.c.a(this.f11551h, aVar.f11551h) && this.f11550g.equals(aVar.f11550g);
    }

    l g(l lVar) {
        return lVar.compareTo(this.f11548e) < 0 ? this.f11548e : lVar.compareTo(this.f11549f) > 0 ? this.f11549f : lVar;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11548e, this.f11549f, this.f11551h, this.f11550g});
    }

    public c i() {
        return this.f11550g;
    }

    l j() {
        return this.f11549f;
    }

    int q() {
        return this.f11553j;
    }

    l s() {
        return this.f11551h;
    }

    l v() {
        return this.f11548e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f11548e, 0);
        parcel.writeParcelable(this.f11549f, 0);
        parcel.writeParcelable(this.f11551h, 0);
        parcel.writeParcelable(this.f11550g, 0);
    }

    private a(l lVar, l lVar2, c cVar, l lVar3) {
        this.f11548e = lVar;
        this.f11549f = lVar2;
        this.f11551h = lVar3;
        this.f11550g = cVar;
        if (lVar3 != null && lVar.compareTo(lVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (lVar3 != null && lVar3.compareTo(lVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f11553j = lVar.C(lVar2) + 1;
        this.f11552i = (lVar2.f11597g - lVar.f11597g) + 1;
    }
}