package e.c.b.b.c.a;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class f extends a implements d {
    f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // e.c.b.b.c.a.d
    public final String G() {
        Parcel parcelU = U(1, R());
        String string = parcelU.readString();
        parcelU.recycle();
        return string;
    }

    @Override // e.c.b.b.c.a.d
    public final boolean t1(boolean z) {
        Parcel parcelR = R();
        c.a(parcelR, true);
        Parcel parcelU = U(2, parcelR);
        boolean zB = c.b(parcelU);
        parcelU.recycle();
        return zB;
    }

    @Override // e.c.b.b.c.a.d
    public final boolean zzc() {
        Parcel parcelU = U(6, R());
        boolean zB = c.b(parcelU);
        parcelU.recycle();
        return zB;
    }
}