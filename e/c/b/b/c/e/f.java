package e.c.b.b.c.e;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
public final class f extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<f> CREATOR = new i();

    /* renamed from: e, reason: collision with root package name */
    public final long f14497e;

    /* renamed from: f, reason: collision with root package name */
    public final long f14498f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f14499g;

    /* renamed from: h, reason: collision with root package name */
    public final String f14500h;

    /* renamed from: i, reason: collision with root package name */
    public final String f14501i;

    /* renamed from: j, reason: collision with root package name */
    public final String f14502j;

    /* renamed from: k, reason: collision with root package name */
    public final Bundle f14503k;

    public f(long j2, long j3, boolean z, String str, String str2, String str3, Bundle bundle) {
        this.f14497e = j2;
        this.f14498f = j3;
        this.f14499g = z;
        this.f14500h = str;
        this.f14501i = str2;
        this.f14502j = str3;
        this.f14503k = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.p(parcel, 1, this.f14497e);
        com.google.android.gms.common.internal.w.c.p(parcel, 2, this.f14498f);
        com.google.android.gms.common.internal.w.c.c(parcel, 3, this.f14499g);
        com.google.android.gms.common.internal.w.c.s(parcel, 4, this.f14500h, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 5, this.f14501i, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 6, this.f14502j, false);
        com.google.android.gms.common.internal.w.c.e(parcel, 7, this.f14503k, false);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }
}