package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class kn implements RewardItem {
    private final xm a;

    public kn(xm xmVar) {
        this.a = xmVar;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        xm xmVar = this.a;
        if (xmVar != null) {
            try {
                return xmVar.zzf();
            } catch (RemoteException e2) {
                er.zzj("Could not forward getAmount to RewardItem", e2);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        xm xmVar = this.a;
        if (xmVar != null) {
            try {
                return xmVar.zze();
            } catch (RemoteException e2) {
                er.zzj("Could not forward getType to RewardItem", e2);
            }
        }
        return null;
    }
}