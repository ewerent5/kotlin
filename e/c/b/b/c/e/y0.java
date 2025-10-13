package e.c.b.b.c.e;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
public class y0 extends Binder implements IInterface {
    protected y0(String str) {
        attachInterface(this, str);
    }

    protected boolean R(int i2, Parcel parcel, Parcel parcel2, int i3) {
        throw null;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        boolean zOnTransact;
        if (i2 > 16777215) {
            zOnTransact = super.onTransact(i2, parcel, parcel2, i3);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            zOnTransact = false;
        }
        if (zOnTransact) {
            return true;
        }
        return R(i2, parcel, parcel2, i3);
    }
}