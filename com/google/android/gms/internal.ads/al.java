package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.common.internal.b;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class al extends zzc<hl> {
    public al(Context context, Looper looper, b.a aVar, b.InterfaceC0113b interfaceC0113b) {
        super(em.a(context), looper, 8, aVar, interfaceC0113b, null);
    }

    public final hl c() {
        return (hl) super.getService();
    }

    @Override // com.google.android.gms.common.internal.b
    protected final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return iInterfaceQueryLocalInterface instanceof hl ? (hl) iInterfaceQueryLocalInterface : new fl(iBinder);
    }

    @Override // com.google.android.gms.common.internal.b
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    @Override // com.google.android.gms.common.internal.b
    protected final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.START";
    }
}