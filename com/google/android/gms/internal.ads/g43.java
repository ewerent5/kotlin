package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.common.internal.b;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class g43 extends zzc<j43> {
    g43(Context context, Looper looper, b.a aVar, b.InterfaceC0113b interfaceC0113b) {
        super(em.a(context), looper, 123, aVar, interfaceC0113b, null);
    }

    public final boolean c() {
        return ((Boolean) c.c().b(w3.j1)).booleanValue() && com.google.android.gms.common.util.b.b(getAvailableFeatures(), zzb.zza);
    }

    @Override // com.google.android.gms.common.internal.b
    protected final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return iInterfaceQueryLocalInterface instanceof j43 ? (j43) iInterfaceQueryLocalInterface : new j43(iBinder);
    }

    public final j43 d() {
        return (j43) super.getService();
    }

    @Override // com.google.android.gms.common.internal.b
    public final com.google.android.gms.common.d[] getApiFeatures() {
        return zzb.zzb;
    }

    @Override // com.google.android.gms.common.internal.b
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override // com.google.android.gms.common.internal.b
    protected final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.CACHE";
    }
}