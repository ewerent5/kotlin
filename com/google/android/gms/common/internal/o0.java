package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class o0 implements ServiceConnection {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f4712b;

    public o0(b bVar, int i2) {
        this.f4712b = bVar;
        this.a = i2;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            b.zzc(this.f4712b, 16);
            return;
        }
        synchronized (this.f4712b.zzq) {
            b bVar = this.f4712b;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            bVar.zzr = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof n)) ? new e0(iBinder) : (n) iInterfaceQueryLocalInterface;
        }
        this.f4712b.zzb(0, null, this.a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f4712b.zzq) {
            this.f4712b.zzr = null;
        }
        Handler handler = this.f4712b.zzb;
        handler.sendMessage(handler.obtainMessage(6, this.a, 1));
    }
}