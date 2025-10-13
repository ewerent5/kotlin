package e.c.b.b.c.d;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import e.c.b.b.b.b;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public final class d extends a implements f {
    d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    @Override // e.c.b.b.c.d.f
    public final e.c.b.b.b.b c2(Bitmap bitmap) {
        Parcel parcelU = U();
        c.d(parcelU, bitmap);
        Parcel parcelR = R(6, parcelU);
        e.c.b.b.b.b bVarU = b.a.U(parcelR.readStrongBinder());
        parcelR.recycle();
        return bVarU;
    }
}