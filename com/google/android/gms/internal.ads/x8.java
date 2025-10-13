package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class x8 extends a8 {

    /* renamed from: e, reason: collision with root package name */
    private final OnAdManagerAdViewLoadedListener f10137e;

    public x8(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener) {
        this.f10137e = onAdManagerAdViewLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.b8
    public final void X1(w wVar, e.c.b.b.b.b bVar) {
        if (wVar == null || bVar == null) {
            return;
        }
        AdManagerAdView adManagerAdView = new AdManagerAdView((Context) e.c.b.b.b.d.Y(bVar));
        try {
            if (wVar.zzw() instanceof i93) {
                i93 i93Var = (i93) wVar.zzw();
                adManagerAdView.setAdListener(i93Var != null ? i93Var.I4() : null);
            }
        } catch (RemoteException e2) {
            er.zzg("", e2);
        }
        try {
            if (wVar.zzv() instanceof j23) {
                j23 j23Var = (j23) wVar.zzv();
                adManagerAdView.setAppEventListener(j23Var != null ? j23Var.J4() : null);
            }
        } catch (RemoteException e3) {
            er.zzg("", e3);
        }
        xq.a.post(new w8(this, adManagerAdView, wVar));
    }
}