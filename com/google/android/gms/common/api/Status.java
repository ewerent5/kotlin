package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.o;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class Status extends com.google.android.gms.common.internal.w.a implements j, ReflectedParcelable {

    /* renamed from: l */
    final int f4534l;

    /* renamed from: m */
    private final int f4535m;
    private final String n;
    private final PendingIntent o;
    private final com.google.android.gms.common.b p;

    /* renamed from: e */
    @RecentlyNonNull
    public static final Status f4527e = new Status(0);

    /* renamed from: f */
    @RecentlyNonNull
    public static final Status f4528f = new Status(14);

    /* renamed from: g */
    @RecentlyNonNull
    public static final Status f4529g = new Status(8);

    /* renamed from: h */
    @RecentlyNonNull
    public static final Status f4530h = new Status(15);

    /* renamed from: i */
    @RecentlyNonNull
    public static final Status f4531i = new Status(16);

    /* renamed from: k */
    @RecentlyNonNull
    public static final Status f4533k = new Status(17);

    /* renamed from: j */
    @RecentlyNonNull
    public static final Status f4532j = new Status(18);

    @RecentlyNonNull
    public static final Parcelable.Creator<Status> CREATOR = new n();

    public Status(int i2) {
        this(i2, null);
    }

    Status(int i2, int i3, String str, PendingIntent pendingIntent, com.google.android.gms.common.b bVar) {
        this.f4534l = i2;
        this.f4535m = i3;
        this.n = str;
        this.o = pendingIntent;
        this.p = bVar;
    }

    public int I() {
        return this.f4535m;
    }

    @RecentlyNullable
    public String J() {
        return this.n;
    }

    public boolean K() {
        return this.f4535m <= 0;
    }

    @RecentlyNonNull
    public final String L() {
        String str = this.n;
        return str != null ? str : d.a(this.f4535m);
    }

    @Override // com.google.android.gms.common.api.j
    @RecentlyNonNull
    public Status a() {
        return this;
    }

    @RecentlyNullable
    public com.google.android.gms.common.b c() {
        return this.p;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f4534l == status.f4534l && this.f4535m == status.f4535m && o.a(this.n, status.n) && o.a(this.o, status.o) && o.a(this.p, status.p);
    }

    public int hashCode() {
        return o.b(Integer.valueOf(this.f4534l), Integer.valueOf(this.f4535m), this.n, this.o, this.p);
    }

    @RecentlyNonNull
    public String toString() {
        o.a aVarC = o.c(this);
        aVarC.a("statusCode", L());
        aVarC.a("resolution", this.o);
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.m(parcel, 1, I());
        com.google.android.gms.common.internal.w.c.s(parcel, 2, J(), false);
        com.google.android.gms.common.internal.w.c.r(parcel, 3, this.o, i2, false);
        com.google.android.gms.common.internal.w.c.r(parcel, 4, c(), i2, false);
        com.google.android.gms.common.internal.w.c.m(parcel, CoreConstants.MILLIS_IN_ONE_SECOND, this.f4534l);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }

    Status(int i2, int i3, String str, PendingIntent pendingIntent) {
        this(i2, i3, str, pendingIntent, null);
    }

    public Status(int i2, String str) {
        this(1, i2, str, null);
    }
}