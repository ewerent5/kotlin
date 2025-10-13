package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class vm0 implements ba {
    private final wm0 a;

    /* renamed from: b */
    private final l8 f9738b;

    vm0(wm0 wm0Var, l8 l8Var) {
        this.a = wm0Var;
        this.f9738b = l8Var;
    }

    @Override // com.google.android.gms.internal.ads.ba
    public final void a(Object obj, Map map) {
        wm0 wm0Var = this.a;
        l8 l8Var = this.f9738b;
        try {
            wm0Var.f9995j = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
        } catch (NumberFormatException unused) {
            er.zzf("Failed to call parse unconfirmedClickTimestamp.");
        }
        wm0Var.f9994i = (String) map.get("id");
        String str = (String) map.get("asset_id");
        if (l8Var == null) {
            er.zzd("Received unconfirmed click but UnconfirmedClickListener is null.");
            return;
        }
        try {
            l8Var.zze(str);
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }
}