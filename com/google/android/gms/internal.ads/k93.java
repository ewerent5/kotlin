package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import e.c.b.b.b.f;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class k93 extends e.c.b.b.b.f<t> {
    public k93() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    @Override // e.c.b.b.b.f
    protected final /* bridge */ /* synthetic */ t a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return iInterfaceQueryLocalInterface instanceof t ? (t) iInterfaceQueryLocalInterface : new t(iBinder);
    }

    public final s c(Context context, String str, tf tfVar) {
        try {
            IBinder iBinderR = b(context).R(e.c.b.b.b.d.m4(context), str, tfVar, 210890000);
            if (iBinderR == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderR.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface instanceof s ? (s) iInterfaceQueryLocalInterface : new q(iBinderR);
        } catch (RemoteException | f.a e2) {
            er.zzj("Could not create remote builder for AdLoader.", e2);
            return null;
        }
    }
}