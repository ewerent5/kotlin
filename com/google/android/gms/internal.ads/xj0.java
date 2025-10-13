package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class xj0 implements qa0, fh0 {

    /* renamed from: e, reason: collision with root package name */
    private final so f10173e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f10174f;

    /* renamed from: g, reason: collision with root package name */
    private final kp f10175g;

    /* renamed from: h, reason: collision with root package name */
    private final View f10176h;

    /* renamed from: i, reason: collision with root package name */
    private String f10177i;

    /* renamed from: j, reason: collision with root package name */
    private final g53 f10178j;

    public xj0(so soVar, Context context, kp kpVar, View view, g53 g53Var) {
        this.f10173e = soVar;
        this.f10174f = context;
        this.f10175g = kpVar;
        this.f10176h = view;
        this.f10178j = g53Var;
    }

    @Override // com.google.android.gms.internal.ads.qa0
    @ParametersAreNonnullByDefault
    public final void d(gm gmVar, String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.f10175g.g(this.f10174f)) {
            try {
                kp kpVar = this.f10175g;
                Context context = this.f10174f;
                kpVar.w(context, kpVar.q(context), this.f10173e.b(), gmVar.zzb(), gmVar.zzc());
            } catch (RemoteException e2) {
                er.zzj("Remote Exception to get reward item.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.fh0
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void zzc() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        View view = this.f10176h;
        if (view != null && this.f10177i != null) {
            this.f10175g.n(view.getContext(), this.f10177i);
        }
        this.f10173e.a(true);
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void zzd() {
        this.f10173e.a(false);
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.fh0
    public final void zzj() {
        String strM = this.f10175g.m(this.f10174f);
        this.f10177i = strM;
        String strValueOf = String.valueOf(strM);
        String str = this.f10178j == g53.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial";
        this.f10177i = str.length() != 0 ? strValueOf.concat(str) : new String(strValueOf);
    }
}