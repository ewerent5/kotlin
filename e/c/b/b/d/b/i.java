package e.c.b.b.d.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q;

/* loaded from: classes.dex */
public final class i extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<i> CREATOR = new j();

    /* renamed from: e, reason: collision with root package name */
    private final int f14997e;

    /* renamed from: f, reason: collision with root package name */
    private final q f14998f;

    i(int i2, q qVar) {
        this.f14997e = i2;
        this.f14998f = qVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.m(parcel, 1, this.f14997e);
        com.google.android.gms.common.internal.w.c.r(parcel, 2, this.f14998f, i2, false);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }

    public i(q qVar) {
        this(1, qVar);
    }
}