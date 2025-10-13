package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import e.c.b.b.b.f;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class r8 extends e.c.b.b.b.f<c7> {
    public r8() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // e.c.b.b.b.f
    protected final /* bridge */ /* synthetic */ c7 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof c7 ? (c7) iInterfaceQueryLocalInterface : new c7(iBinder);
    }

    public final b7 c(View view, HashMap<String, View> map, HashMap<String, View> map2) {
        try {
            IBinder iBinderR = b(view.getContext()).R(e.c.b.b.b.d.m4(view), e.c.b.b.b.d.m4(map), e.c.b.b.b.d.m4(map2));
            if (iBinderR == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderR.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            return iInterfaceQueryLocalInterface instanceof b7 ? (b7) iInterfaceQueryLocalInterface : new z6(iBinderR);
        } catch (RemoteException | f.a e2) {
            er.zzj("Could not create remote NativeAdViewHolderDelegate.", e2);
            return null;
        }
    }
}