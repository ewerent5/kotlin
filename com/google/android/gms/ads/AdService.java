package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.er;
import com.google.android.gms.internal.ads.pf;
import com.google.android.gms.internal.ads.ta3;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(@RecentlyNonNull Intent intent) {
        try {
            ta3.b().i(this, new pf()).a0(intent);
        } catch (RemoteException e2) {
            String strValueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 50);
            sb.append("RemoteException calling handleNotificationIntent: ");
            sb.append(strValueOf);
            er.zzf(sb.toString());
        }
    }
}