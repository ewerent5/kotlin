package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class cy0 implements mo2<g52<String>> {
    private final wo2<ip2> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Context> f5387b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<h52> f5388c;

    public cy0(wo2<ip2> wo2Var, wo2<Context> wo2Var2, wo2<h52> wo2Var3) {
        this.a = wo2Var;
        this.f5387b = wo2Var2;
        this.f5388c = wo2Var3;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        final ip2 ip2VarZzb = this.a.zzb();
        final Context contextA = ((vq1) this.f5387b).a();
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        g52 g52VarN = h52Var.N(new Callable(ip2VarZzb, contextA) { // from class: com.google.android.gms.internal.ads.by0
            private final ip2 a;

            /* renamed from: b, reason: collision with root package name */
            private final Context f5217b;

            {
                this.a = ip2VarZzb;
                this.f5217b = contextA;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                ip2 ip2Var = this.a;
                return ip2Var.b().zzl(this.f5217b);
            }
        });
        ro2.b(g52VarN);
        return g52VarN;
    }
}