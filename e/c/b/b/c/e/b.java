package e.c.b.b.c.e;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
public abstract class b extends y0 implements c {
    public b() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // e.c.b.b.c.e.y0
    protected final boolean R(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            J2(parcel.readString(), parcel.readString(), (Bundle) x.a(parcel, Bundle.CREATOR), parcel.readLong());
            parcel2.writeNoException();
        } else {
            if (i2 != 2) {
                return false;
            }
            int iZza = zza();
            parcel2.writeNoException();
            parcel2.writeInt(iZza);
        }
        return true;
    }
}