package e.c.b.d.a.b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class r0 extends k0 implements s0 {
    public r0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }

    @Override // e.c.b.d.a.b.k0
    protected final boolean R(int i2, Parcel parcel) {
        u0 t0Var = null;
        if (i2 == 2) {
            Bundle bundle = (Bundle) l0.a(parcel, Bundle.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                t0Var = iInterfaceQueryLocalInterface instanceof u0 ? (u0) iInterfaceQueryLocalInterface : new t0(strongBinder);
            }
            J1(bundle, t0Var);
            return true;
        }
        if (i2 != 3) {
            return false;
        }
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
            t0Var = iInterfaceQueryLocalInterface2 instanceof u0 ? (u0) iInterfaceQueryLocalInterface2 : new t0(strongBinder2);
        }
        t0(t0Var);
        return true;
    }
}