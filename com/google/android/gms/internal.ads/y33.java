package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class y33 {
    private w a;

    /* renamed from: b */
    private final Context f10356b;

    /* renamed from: c */
    private final String f10357c;

    /* renamed from: d */
    private final u1 f10358d;

    /* renamed from: e */
    @AppOpenAd.AppOpenAdOrientation
    private final int f10359e;

    /* renamed from: f */
    private final AppOpenAd.AppOpenAdLoadCallback f10360f;

    /* renamed from: g */
    private final pf f10361g = new pf();

    /* renamed from: h */
    private final q93 f10362h = q93.a;

    public y33(Context context, String str, u1 u1Var, @AppOpenAd.AppOpenAdOrientation int i2, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.f10356b = context;
        this.f10357c = str;
        this.f10358d = u1Var;
        this.f10359e = i2;
        this.f10360f = appOpenAdLoadCallback;
    }

    public final void a() {
        try {
            this.a = ta3.b().a(this.f10356b, r93.K(), this.f10357c, this.f10361g);
            y93 y93Var = new y93(this.f10359e);
            w wVar = this.a;
            if (wVar != null) {
                wVar.zzH(y93Var);
                this.a.zzI(new k33(this.f10360f, this.f10357c));
                this.a.zze(this.f10362h.a(this.f10356b, this.f10358d));
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }
}