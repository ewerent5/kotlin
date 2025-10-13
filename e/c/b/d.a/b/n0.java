package e.c.b.d.a.b;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class n0 extends k0 implements o0 {
    public static o0 U(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
        return iInterfaceQueryLocalInterface instanceof o0 ? (o0) iInterfaceQueryLocalInterface : new m0(iBinder);
    }
}