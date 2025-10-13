package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class dl extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<dl> CREATOR = new el();

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5485e;

    /* renamed from: f, reason: collision with root package name */
    public final List<String> f5486f;

    public dl(boolean z, List<String> list) {
        this.f5485e = z;
        this.f5486f = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.c(parcel, 2, this.f5485e);
        com.google.android.gms.common.internal.w.c.u(parcel, 3, this.f5486f, false);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }
}