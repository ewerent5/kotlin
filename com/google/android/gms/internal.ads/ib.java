package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.common.internal.b;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ib extends zzc<qb> {
    ib(Context context, Looper looper, b.a aVar, b.InterfaceC0113b interfaceC0113b) {
        super(em.a(context), looper, 166, aVar, interfaceC0113b, null);
    }

    public final qb c() {
        return (qb) super.getService();
    }

    @Override // com.google.android.gms.common.internal.b
    protected final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return iInterfaceQueryLocalInterface instanceof qb ? (qb) iInterfaceQueryLocalInterface : new qb(iBinder);
    }

    @Override // com.google.android.gms.common.internal.b
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    @Override // com.google.android.gms.common.internal.b
    protected final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.HTTP";
    }
}