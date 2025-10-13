package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class mn {
    public static final an a(Context context, String str, tf tfVar) {
        try {
            IBinder iBinderR = ((en) ir.a(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", ln.a)).R(e.c.b.b.b.d.m4(context), str, tfVar, 210890000);
            if (iBinderR == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderR.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return iInterfaceQueryLocalInterface instanceof an ? (an) iInterfaceQueryLocalInterface : new ym(iBinderR);
        } catch (RemoteException | hr e2) {
            er.zzl("#007 Could not call remote method.", e2);
            return null;
        }
    }
}