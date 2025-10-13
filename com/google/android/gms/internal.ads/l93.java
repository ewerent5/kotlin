package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import e.c.b.b.b.f;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class l93 extends e.c.b.b.b.f<x> {
    public l93() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // e.c.b.b.b.f
    protected final /* bridge */ /* synthetic */ x a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterfaceQueryLocalInterface instanceof x ? (x) iInterfaceQueryLocalInterface : new x(iBinder);
    }

    public final w c(Context context, r93 r93Var, String str, tf tfVar, int i2) {
        try {
            IBinder iBinderR = b(context).R(e.c.b.b.b.d.m4(context), r93Var, str, tfVar, 210890000, i2);
            if (iBinderR == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderR.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return iInterfaceQueryLocalInterface instanceof w ? (w) iInterfaceQueryLocalInterface : new u(iBinderR);
        } catch (RemoteException | f.a e2) {
            er.zze("Could not create remote AdManager.", e2);
            return null;
        }
    }
}