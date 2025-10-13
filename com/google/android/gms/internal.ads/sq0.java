package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class sq0 extends VideoController.VideoLifecycleCallbacks {
    private final tl0 a;

    public sq0(tl0 tl0Var) {
        this.a = tl0Var;
    }

    private static q1 a(tl0 tl0Var) {
        n1 n1VarY = tl0Var.Y();
        if (n1VarY == null) {
            return null;
        }
        try {
            return n1VarY.a();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoEnd() {
        q1 q1VarA = a(this.a);
        if (q1VarA == null) {
            return;
        }
        try {
            q1VarA.zzh();
        } catch (RemoteException e2) {
            er.zzj("Unable to call onVideoEnd()", e2);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoPause() {
        q1 q1VarA = a(this.a);
        if (q1VarA == null) {
            return;
        }
        try {
            q1VarA.zzg();
        } catch (RemoteException e2) {
            er.zzj("Unable to call onVideoEnd()", e2);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoStart() {
        q1 q1VarA = a(this.a);
        if (q1VarA == null) {
            return;
        }
        try {
            q1VarA.zze();
        } catch (RemoteException e2) {
            er.zzj("Unable to call onVideoEnd()", e2);
        }
    }
}