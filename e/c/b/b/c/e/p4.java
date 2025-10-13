package e.c.b.b.c.e;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class p4 extends a implements o2 {
    p4(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // e.c.b.b.c.e.o2
    public final Bundle w(Bundle bundle) {
        Parcel parcelR = R();
        x.c(parcelR, bundle);
        Parcel parcelU = U(1, parcelR);
        Bundle bundle2 = (Bundle) x.a(parcelU, Bundle.CREATOR);
        parcelU.recycle();
        return bundle2;
    }
}