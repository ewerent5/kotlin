package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ss0 implements mo2<w43> {
    private final wo2<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<String> f8976b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<kr> f8977c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<g53> f8978d;

    /* renamed from: e, reason: collision with root package name */
    private final wo2<String> f8979e;

    public ss0(wo2<Context> wo2Var, wo2<String> wo2Var2, wo2<kr> wo2Var3, wo2<g53> wo2Var4, wo2<String> wo2Var5) {
        this.a = wo2Var;
        this.f8976b = wo2Var2;
        this.f8977c = wo2Var3;
        this.f8978d = wo2Var4;
        this.f8979e = wo2Var5;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextA = ((hy) this.a).a();
        final String strZzb = ((my0) this.f8976b).zzb();
        kr krVarA = ((qy) this.f8977c).a();
        final g53 g53VarZzb = this.f8978d.zzb();
        final String strZzb2 = this.f8979e.zzb();
        w43 w43Var = new w43(new c53(contextA));
        c83 c83VarD = d83.D();
        c83VarD.q(krVarA.f7055f);
        c83VarD.r(krVarA.f7056g);
        c83VarD.s(true != krVarA.f7057h ? 2 : 0);
        final d83 d83VarN = c83VarD.n();
        w43Var.c(new v43(g53VarZzb, strZzb, d83VarN, strZzb2) { // from class: com.google.android.gms.internal.ads.rs0
            private final g53 a;

            /* renamed from: b, reason: collision with root package name */
            private final String f8720b;

            /* renamed from: c, reason: collision with root package name */
            private final d83 f8721c;

            /* renamed from: d, reason: collision with root package name */
            private final String f8722d;

            {
                this.a = g53VarZzb;
                this.f8720b = strZzb;
                this.f8721c = d83VarN;
                this.f8722d = strZzb2;
            }

            @Override // com.google.android.gms.internal.ads.v43
            public final void a(q63 q63Var) {
                g53 g53Var = this.a;
                String str = this.f8720b;
                d83 d83Var = this.f8721c;
                String str2 = this.f8722d;
                h53 h53VarY = q63Var.w().y();
                h53VarY.q(g53Var);
                q63Var.x(h53VarY);
                g63 g63VarY = q63Var.u().y();
                g63VarY.q(str);
                g63VarY.r(d83Var);
                q63Var.v(g63VarY);
                q63Var.r(str2);
            }
        });
        return w43Var;
    }
}