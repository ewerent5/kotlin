package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzak;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class l90 implements x02 {
    private final Context a;

    /* renamed from: b */
    private final kr f7221b;

    /* renamed from: c */
    private final qp1 f7222c;

    l90(Context context, kr krVar, qp1 qp1Var) {
        this.a = context;
        this.f7221b = krVar;
        this.f7222c = qp1Var;
    }

    @Override // com.google.android.gms.internal.ads.x02
    public final Object apply(Object obj) {
        Context context = this.a;
        kr krVar = this.f7221b;
        qp1 qp1Var = this.f7222c;
        xo1 xo1Var = (xo1) obj;
        zzak zzakVar = new zzak(context);
        zzakVar.zze(xo1Var.A);
        zzakVar.zzf(xo1Var.B.toString());
        zzakVar.zzd(krVar.f7054e);
        zzakVar.zzc(qp1Var.f8429f);
        return zzakVar;
    }
}