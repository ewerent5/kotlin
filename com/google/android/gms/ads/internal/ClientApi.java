package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzab;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.ads.internal.overlay.zzv;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.internal.ads.aa1;
import com.google.android.gms.internal.ads.ab;
import com.google.android.gms.internal.ads.an;
import com.google.android.gms.internal.ads.b7;
import com.google.android.gms.internal.ads.c;
import com.google.android.gms.internal.ads.cn1;
import com.google.android.gms.internal.ads.cy;
import com.google.android.gms.internal.ads.g0;
import com.google.android.gms.internal.ads.il1;
import com.google.android.gms.internal.ads.jm;
import com.google.android.gms.internal.ads.kj;
import com.google.android.gms.internal.ads.kr;
import com.google.android.gms.internal.ads.nm0;
import com.google.android.gms.internal.ads.o0;
import com.google.android.gms.internal.ads.pm0;
import com.google.android.gms.internal.ads.qo1;
import com.google.android.gms.internal.ads.r93;
import com.google.android.gms.internal.ads.s;
import com.google.android.gms.internal.ads.tf;
import com.google.android.gms.internal.ads.vv0;
import com.google.android.gms.internal.ads.w;
import com.google.android.gms.internal.ads.w3;
import com.google.android.gms.internal.ads.wj1;
import com.google.android.gms.internal.ads.x6;
import com.google.android.gms.internal.ads.xa;
import com.google.android.gms.internal.ads.xj;
import com.google.android.gms.internal.ads.xj1;
import com.google.android.gms.internal.ads.zp;
import e.c.b.b.b.b;
import e.c.b.b.b.d;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public class ClientApi extends g0 {
    @Override // com.google.android.gms.internal.ads.h0
    public final w zzb(b bVar, r93 r93Var, String str, tf tfVar, int i2) {
        Context context = (Context) d.Y(bVar);
        il1 il1VarO = cy.d(context, tfVar, i2).o();
        il1VarO.a(context);
        il1VarO.b(r93Var);
        il1VarO.d(str);
        return il1VarO.zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final w zzc(b bVar, r93 r93Var, String str, tf tfVar, int i2) {
        Context context = (Context) d.Y(bVar);
        cn1 cn1VarT = cy.d(context, tfVar, i2).t();
        cn1VarT.a(context);
        cn1VarT.b(r93Var);
        cn1VarT.d(str);
        return cn1VarT.zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final s zzd(b bVar, String str, tf tfVar, int i2) {
        Context context = (Context) d.Y(bVar);
        return new aa1(cy.d(context, tfVar, i2), context, str);
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final x6 zze(b bVar, b bVar2) {
        return new pm0((FrameLayout) d.Y(bVar), (FrameLayout) d.Y(bVar2), 210890000);
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final jm zzf(b bVar, tf tfVar, int i2) {
        Context context = (Context) d.Y(bVar);
        qo1 qo1VarW = cy.d(context, tfVar, i2).w();
        qo1VarW.n(context);
        return qo1VarW.zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final xj zzg(b bVar) {
        Activity activity = (Activity) d.Y(bVar);
        AdOverlayInfoParcel adOverlayInfoParcelZza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (adOverlayInfoParcelZza == null) {
            return new zzt(activity);
        }
        int i2 = adOverlayInfoParcelZza.zzk;
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? new zzt(activity) : new zzz(activity) : new zzv(activity, adOverlayInfoParcelZza) : new zzac(activity) : new zzab(activity) : new com.google.android.gms.ads.internal.overlay.zzs(activity);
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final o0 zzh(b bVar, int i2) {
        return cy.e((Context) d.Y(bVar), i2).m();
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final w zzi(b bVar, r93 r93Var, String str, int i2) {
        return new zzr((Context) d.Y(bVar), r93Var, str, new kr(210890000, i2, true, false));
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final b7 zzj(b bVar, b bVar2, b bVar3) {
        return new nm0((View) d.Y(bVar), (HashMap) d.Y(bVar2), (HashMap) d.Y(bVar3));
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final an zzk(b bVar, String str, tf tfVar, int i2) {
        Context context = (Context) d.Y(bVar);
        qo1 qo1VarW = cy.d(context, tfVar, i2).w();
        qo1VarW.n(context);
        qo1VarW.c(str);
        return qo1VarW.zza().zzb();
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final w zzl(b bVar, r93 r93Var, String str, tf tfVar, int i2) {
        Context context = (Context) d.Y(bVar);
        wj1 wj1VarR = cy.d(context, tfVar, i2).r();
        wj1VarR.c(str);
        wj1VarR.n(context);
        xj1 xj1VarZza = wj1VarR.zza();
        return i2 >= ((Integer) c.c().b(w3.u3)).intValue() ? xj1VarZza.zzb() : xj1VarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final zp zzm(b bVar, tf tfVar, int i2) {
        return cy.d((Context) d.Y(bVar), tfVar, i2).y();
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final kj zzn(b bVar, tf tfVar, int i2) {
        return cy.d((Context) d.Y(bVar), tfVar, i2).z();
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final ab zzo(b bVar, tf tfVar, int i2, xa xaVar) {
        Context context = (Context) d.Y(bVar);
        vv0 vv0VarC = cy.d(context, tfVar, i2).c();
        vv0VarC.n(context);
        vv0VarC.a(xaVar);
        return vv0VarC.zza().zza();
    }
}