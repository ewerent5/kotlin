package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ab1 implements c93 {

    /* renamed from: e, reason: collision with root package name */
    @GuardedBy("this")
    private g f4890e;

    public final synchronized void a(g gVar) {
        this.f4890e = gVar;
    }

    @Override // com.google.android.gms.internal.ads.c93
    public final synchronized void onAdClicked() {
        g gVar = this.f4890e;
        if (gVar != null) {
            try {
                gVar.zzb();
            } catch (RemoteException e2) {
                er.zzj("Remote Exception at onAdClicked.", e2);
            }
        }
    }
}