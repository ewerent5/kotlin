package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class p0 extends c0 {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f4713g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ b f4714h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(b bVar, int i2, IBinder iBinder, Bundle bundle) {
        super(bVar, i2, bundle);
        this.f4714h = bVar;
        this.f4713g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.c0
    protected final boolean f() throws RemoteException {
        try {
            IBinder iBinder = this.f4713g;
            p.j(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f4714h.getServiceDescriptor().equals(interfaceDescriptor)) {
                String serviceDescriptor = this.f4714h.getServiceDescriptor();
                StringBuilder sb = new StringBuilder(String.valueOf(serviceDescriptor).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(serviceDescriptor);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                Log.e("GmsClient", sb.toString());
                return false;
            }
            IInterface iInterfaceCreateServiceInterface = this.f4714h.createServiceInterface(this.f4713g);
            if (iInterfaceCreateServiceInterface == null || !(b.zzl(this.f4714h, 2, 4, iInterfaceCreateServiceInterface) || b.zzl(this.f4714h, 3, 4, iInterfaceCreateServiceInterface))) {
                return false;
            }
            this.f4714h.zzB = null;
            Bundle connectionHint = this.f4714h.getConnectionHint();
            if (this.f4714h.zzw == null) {
                return true;
            }
            this.f4714h.zzw.Y(connectionHint);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // com.google.android.gms.common.internal.c0
    protected final void g(com.google.android.gms.common.b bVar) {
        if (this.f4714h.zzx != null) {
            this.f4714h.zzx.U(bVar);
        }
        this.f4714h.onConnectionFailed(bVar);
    }
}