package e.c.b.b.c.e;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
public abstract class xf extends y0 implements uf {
    public xf() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // e.c.b.b.c.e.y0
    protected final boolean R(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return false;
        }
        w((Bundle) x.a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}