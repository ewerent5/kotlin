package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;
import com.google.android.gms.internal.ads.g93;
import com.google.android.gms.internal.ads.mq1;
import com.google.android.gms.internal.ads.o12;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zzaq extends a {
    public static final Parcelable.Creator<zzaq> CREATOR = new zzar();
    public final String zza;
    public final int zzb;

    zzaq(String str, int i2) {
        this.zza = str == null ? "" : str;
        this.zzb = i2;
    }

    public static zzaq zza(Throwable th) {
        g93 g93VarA = mq1.a(th);
        return new zzaq(o12.c(th.getMessage()) ? g93VarA.f6092f : th.getMessage(), g93VarA.f6091e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = c.a(parcel);
        c.s(parcel, 1, this.zza, false);
        c.m(parcel, 2, this.zzb);
        c.b(parcel, iA);
    }
}