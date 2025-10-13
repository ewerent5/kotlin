package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class iz0 extends gz0 {
    public iz0(Context context) {
        this.f6251f = new al(context, zzs.zzq().zza(), this, this);
    }

    @Override // com.google.android.gms.common.internal.b.a
    public final void Y(Bundle bundle) {
        synchronized (this.f6247b) {
            if (!this.f6249d) {
                this.f6249d = true;
                try {
                    this.f6251f.c().p0(this.f6250e, new fz0(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.a.zzd(new uz0(1));
                } catch (Throwable th) {
                    zzs.zzg().g(th, "RemoteSignalsClientTask.onConnected");
                    this.a.zzd(new uz0(1));
                }
            }
        }
    }
}