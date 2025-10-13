package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzak;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class m90 implements mo2<x02<xo1, zzak>> {
    private final wo2<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<kr> f7440b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<qp1> f7441c;

    public m90(wo2<Context> wo2Var, wo2<kr> wo2Var2, wo2<qp1> wo2Var3) {
        this.a = wo2Var;
        this.f7440b = wo2Var2;
        this.f7441c = wo2Var3;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context contextZzb = this.a.zzb();
        final kr krVarA = ((qy) this.f7440b).a();
        final qp1 qp1VarA = ((ga0) this.f7441c).a();
        return new x02(contextZzb, krVarA, qp1VarA) { // from class: com.google.android.gms.internal.ads.l90
            private final Context a;

            /* renamed from: b, reason: collision with root package name */
            private final kr f7221b;

            /* renamed from: c, reason: collision with root package name */
            private final qp1 f7222c;

            {
                this.a = contextZzb;
                this.f7221b = krVarA;
                this.f7222c = qp1VarA;
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
        };
    }
}