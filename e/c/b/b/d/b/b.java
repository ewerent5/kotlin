package e.c.b.b.d.b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class b extends com.google.android.gms.common.internal.w.a implements com.google.android.gms.common.api.j {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: e, reason: collision with root package name */
    private final int f14994e;

    /* renamed from: f, reason: collision with root package name */
    private int f14995f;

    /* renamed from: g, reason: collision with root package name */
    private Intent f14996g;

    b(int i2, int i3, Intent intent) {
        this.f14994e = i2;
        this.f14995f = i3;
        this.f14996g = intent;
    }

    @Override // com.google.android.gms.common.api.j
    public final Status a() {
        return this.f14995f == 0 ? Status.f4527e : Status.f4531i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.m(parcel, 1, this.f14994e);
        com.google.android.gms.common.internal.w.c.m(parcel, 2, this.f14995f);
        com.google.android.gms.common.internal.w.c.r(parcel, 3, this.f14996g, i2, false);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }

    public b() {
        this(0, null);
    }

    private b(int i2, Intent intent) {
        this(2, 0, null);
    }
}