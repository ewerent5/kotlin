package e.c.b.b.c.a;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class e extends b implements d {
    public static d R(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new f(iBinder);
    }
}