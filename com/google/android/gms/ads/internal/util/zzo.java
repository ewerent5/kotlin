package com.google.android.gms.ads.internal.util;

import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class zzo extends ConnectivityManager.NetworkCallback {
    zzo(zzr zzrVar) {
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        synchronized (zzr.class) {
            boolean unused = zzr.zzd = true;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (zzr.class) {
            boolean unused = zzr.zzd = false;
        }
    }
}