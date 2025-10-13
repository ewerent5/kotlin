package e.c.b.b.c.e;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
public final class wf extends a implements uf {
    wf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // e.c.b.b.c.e.uf
    public final void w(Bundle bundle) {
        Parcel parcelR = R();
        x.c(parcelR, bundle);
        Y(1, parcelR);
    }
}