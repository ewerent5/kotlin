package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ui0 implements mo2<nh0<dc0>> {
    private final pi0 a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Context> f9466b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<kr> f9467c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<xo1> f9468d;

    /* renamed from: e, reason: collision with root package name */
    private final wo2<qp1> f9469e;

    public ui0(pi0 pi0Var, wo2<Context> wo2Var, wo2<kr> wo2Var2, wo2<xo1> wo2Var3, wo2<qp1> wo2Var4) {
        this.a = pi0Var;
        this.f9466b = wo2Var;
        this.f9467c = wo2Var2;
        this.f9468d = wo2Var3;
        this.f9469e = wo2Var4;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context contextZzb = this.f9466b.zzb();
        final kr krVarA = ((qy) this.f9467c).a();
        final xo1 xo1VarA = ((j70) this.f9468d).a();
        final qp1 qp1VarA = ((ga0) this.f9469e).a();
        return new nh0(new dc0(contextZzb, krVarA, xo1VarA, qp1VarA) { // from class: com.google.android.gms.internal.ads.ni0

            /* renamed from: e, reason: collision with root package name */
            private final Context f7714e;

            /* renamed from: f, reason: collision with root package name */
            private final kr f7715f;

            /* renamed from: g, reason: collision with root package name */
            private final xo1 f7716g;

            /* renamed from: h, reason: collision with root package name */
            private final qp1 f7717h;

            {
                this.f7714e = contextZzb;
                this.f7715f = krVarA;
                this.f7716g = xo1VarA;
                this.f7717h = qp1VarA;
            }

            @Override // com.google.android.gms.internal.ads.dc0
            public final void b0() {
                zzs.zzm().zzc(this.f7714e, this.f7715f.f7054e, this.f7716g.B.toString(), this.f7717h.f8429f);
            }
        }, qr.f8451f);
    }
}