package e.c.b.b.d.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;

/* loaded from: classes.dex */
public final class k extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<k> CREATOR = new l();

    /* renamed from: e, reason: collision with root package name */
    private final int f14999e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.common.b f15000f;

    /* renamed from: g, reason: collision with root package name */
    private final r f15001g;

    k(int i2, com.google.android.gms.common.b bVar, r rVar) {
        this.f14999e = i2;
        this.f15000f = bVar;
        this.f15001g = rVar;
    }

    public final r I() {
        return this.f15001g;
    }

    public final com.google.android.gms.common.b c() {
        return this.f15000f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.m(parcel, 1, this.f14999e);
        com.google.android.gms.common.internal.w.c.r(parcel, 2, this.f15000f, i2, false);
        com.google.android.gms.common.internal.w.c.r(parcel, 3, this.f15001g, i2, false);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }

    public k(int i2) {
        this(new com.google.android.gms.common.b(8, null), null);
    }

    private k(com.google.android.gms.common.b bVar, r rVar) {
        this(1, bVar, null);
    }
}