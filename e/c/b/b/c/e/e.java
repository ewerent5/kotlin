package e.c.b.b.c.e;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
public final class e extends a implements c {
    e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // e.c.b.b.c.e.c
    public final void J2(String str, String str2, Bundle bundle, long j2) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        parcelR.writeString(str2);
        x.c(parcelR, bundle);
        parcelR.writeLong(j2);
        Y(1, parcelR);
    }

    @Override // e.c.b.b.c.e.c
    public final int zza() {
        Parcel parcelU = U(2, R());
        int i2 = parcelU.readInt();
        parcelU.recycle();
        return i2;
    }
}