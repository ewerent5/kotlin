package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class yi implements NativeCustomFormatAd.DisplayOpenMeasurement {
    private final k7 a;

    public yi(k7 k7Var) {
        this.a = k7Var;
        try {
            k7Var.zzr();
        } catch (RemoteException e2) {
            er.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement
    public final void setView(View view) {
        try {
            this.a.y1(e.c.b.b.b.d.m4(view));
        } catch (RemoteException e2) {
            er.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement
    public final boolean start() {
        try {
            return this.a.zzp();
        } catch (RemoteException e2) {
            er.zzg("", e2);
            return false;
        }
    }
}