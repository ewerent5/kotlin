package e.c.b.d.a.b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class t0 extends j0 implements u0 {
    t0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    @Override // e.c.b.d.a.b.u0
    public final void E2(Bundle bundle, Bundle bundle2) {
        Parcel parcelR = R();
        l0.b(parcelR, bundle);
        l0.b(parcelR, bundle2);
        U(2, parcelR);
    }

    @Override // e.c.b.d.a.b.u0
    public final void I2(Bundle bundle) {
        Parcel parcelR = R();
        l0.b(parcelR, bundle);
        U(4, parcelR);
    }

    @Override // e.c.b.d.a.b.u0
    public final void r3(Bundle bundle) {
        Parcel parcelR = R();
        l0.b(parcelR, bundle);
        U(3, parcelR);
    }
}