package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import e.c.b.b.b.f;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class uj extends e.c.b.b.b.f<yj> {
    public uj() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // e.c.b.b.b.f
    protected final /* bridge */ /* synthetic */ yj a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterfaceQueryLocalInterface instanceof yj ? (yj) iInterfaceQueryLocalInterface : new yj(iBinder);
    }

    public final xj c(Activity activity) {
        try {
            IBinder iBinderR = b(activity).R(e.c.b.b.b.d.m4(activity));
            if (iBinderR == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderR.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return iInterfaceQueryLocalInterface instanceof xj ? (xj) iInterfaceQueryLocalInterface : new vj(iBinderR);
        } catch (RemoteException e2) {
            er.zzj("Could not create remote AdOverlay.", e2);
            return null;
        } catch (f.a e3) {
            er.zzj("Could not create remote AdOverlay.", e3);
            return null;
        }
    }
}