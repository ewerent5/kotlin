package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import e.c.b.b.b.f;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class q8 extends e.c.b.b.b.f<y6> {
    public q8() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override // e.c.b.b.b.f
    protected final /* bridge */ /* synthetic */ y6 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof y6 ? (y6) iInterfaceQueryLocalInterface : new y6(iBinder);
    }

    public final x6 c(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder iBinderR = b(context).R(e.c.b.b.b.d.m4(context), e.c.b.b.b.d.m4(frameLayout), e.c.b.b.b.d.m4(frameLayout2), 210890000);
            if (iBinderR == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderR.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return iInterfaceQueryLocalInterface instanceof x6 ? (x6) iInterfaceQueryLocalInterface : new v6(iBinderR);
        } catch (RemoteException | f.a e2) {
            er.zzj("Could not create remote NativeAdViewDelegate.", e2);
            return null;
        }
    }
}