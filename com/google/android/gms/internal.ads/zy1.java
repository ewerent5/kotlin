package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.common.internal.b;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zy1 extends zzc<ez1> {
    private final int a;

    public zy1(Context context, Looper looper, b.a aVar, b.InterfaceC0113b interfaceC0113b, int i2) {
        super(context, looper, 116, aVar, interfaceC0113b, null);
        this.a = i2;
    }

    public final ez1 c() {
        return (ez1) super.getService();
    }

    @Override // com.google.android.gms.common.internal.b
    protected final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return iInterfaceQueryLocalInterface instanceof ez1 ? (ez1) iInterfaceQueryLocalInterface : new ez1(iBinder);
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return this.a;
    }

    @Override // com.google.android.gms.common.internal.b
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // com.google.android.gms.common.internal.b
    protected final String getStartServiceAction() {
        return "com.google.android.gms.gass.START";
    }
}