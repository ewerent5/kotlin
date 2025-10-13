package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import e.c.b.b.b.f;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class i2 extends e.c.b.b.b.f<p0> {
    public i2() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Override // e.c.b.b.b.f
    protected final /* bridge */ /* synthetic */ p0 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return iInterfaceQueryLocalInterface instanceof p0 ? (p0) iInterfaceQueryLocalInterface : new p0(iBinder);
    }

    public final o0 c(Context context) {
        try {
            IBinder iBinderR = b(context).R(e.c.b.b.b.d.m4(context), 210890000);
            if (iBinderR == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderR.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof o0 ? (o0) iInterfaceQueryLocalInterface : new m0(iBinderR);
        } catch (RemoteException | f.a e2) {
            er.zzj("Could not get remote MobileAdsSettingManager.", e2);
            return null;
        }
    }
}