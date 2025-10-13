package e.c.b.b.c.d;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public final class g extends a implements i {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate");
    }

    @Override // e.c.b.b.c.d.i
    public final boolean D3(i iVar) {
        Parcel parcelU = U();
        c.e(parcelU, iVar);
        Parcel parcelR = R(17, parcelU);
        boolean zA = c.a(parcelR);
        parcelR.recycle();
        return zA;
    }

    @Override // e.c.b.b.c.d.i
    public final void zzd() {
        Y(1, U());
    }

    @Override // e.c.b.b.c.d.i
    public final int zzu() {
        Parcel parcelR = R(18, U());
        int i2 = parcelR.readInt();
        parcelR.recycle();
        return i2;
    }
}